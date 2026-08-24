package W1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;
/* loaded from: classes.dex */
public class h extends View implements io.flutter.embedding.engine.renderer.n {

    /* renamed from: m  reason: collision with root package name */
    public ImageReader f2855m;

    /* renamed from: n  reason: collision with root package name */
    public Image f2856n;

    /* renamed from: o  reason: collision with root package name */
    public Bitmap f2857o;

    /* renamed from: p  reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f2858p;

    /* renamed from: q  reason: collision with root package name */
    public final int f2859q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2860r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, int i3, int i4, int i5) {
        super(context, null);
        ImageReader f3 = f(i3, i4);
        this.f2860r = false;
        this.f2855m = f3;
        this.f2859q = i5;
        setAlpha(0.0f);
    }

    public static ImageReader f(int i3, int i4) {
        ImageReader newInstance;
        if (i3 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i3 + ", set width=1");
            i3 = 1;
        }
        if (i4 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i4 + ", set height=1");
            i4 = 1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            newInstance = ImageReader.newInstance(i3, i4, 1, 3, 768L);
            return newInstance;
        }
        return ImageReader.newInstance(i3, i4, 1, 3);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a(io.flutter.embedding.engine.renderer.l lVar) {
        if (N.j.b(this.f2859q) == 0) {
            Surface surface = this.f2855m.getSurface();
            lVar.f6111c = surface;
            lVar.f6109a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f2858p = lVar;
        this.f2860r = true;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (!this.f2860r) {
            return;
        }
        setAlpha(0.0f);
        e();
        this.f2857o = null;
        Image image = this.f2856n;
        if (image != null) {
            image.close();
            this.f2856n = null;
        }
        invalidate();
        this.f2860r = false;
    }

    public final boolean e() {
        if (!this.f2860r) {
            return false;
        }
        Image acquireLatestImage = this.f2855m.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f2856n;
            if (image != null) {
                image.close();
                this.f2856n = null;
            }
            this.f2856n = acquireLatestImage;
            invalidate();
        }
        if (acquireLatestImage == null) {
            return false;
        }
        return true;
    }

    public final void g(int i3, int i4) {
        if (this.f2858p == null) {
            return;
        }
        if (i3 == this.f2855m.getWidth() && i4 == this.f2855m.getHeight()) {
            return;
        }
        Image image = this.f2856n;
        if (image != null) {
            image.close();
            this.f2856n = null;
        }
        this.f2855m.close();
        this.f2855m = f(i3, i4);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public io.flutter.embedding.engine.renderer.l getAttachedRenderer() {
        return this.f2858p;
    }

    public ImageReader getImageReader() {
        return this.f2855m;
    }

    public Surface getSurface() {
        return this.f2855m.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        super.onDraw(canvas);
        Image image = this.f2856n;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f2857o = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f2856n.getHeight();
                    Bitmap bitmap = this.f2857o;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f2857o.getHeight() != height) {
                        this.f2857o = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f2857o.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f2857o;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        if ((i3 != this.f2855m.getWidth() || i4 != this.f2855m.getHeight()) && this.f2859q == 1 && this.f2860r) {
            g(i3, i4);
            io.flutter.embedding.engine.renderer.l lVar = this.f2858p;
            Surface surface = this.f2855m.getSurface();
            lVar.f6111c = surface;
            lVar.f6109a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
    }
}
