package i1;

import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.plugin.platform.C0323b;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes.dex */
public final class z implements io.flutter.plugin.platform.f {

    /* renamed from: a  reason: collision with root package name */
    public int f6063a;

    /* renamed from: b  reason: collision with root package name */
    public int f6064b;

    /* renamed from: c  reason: collision with root package name */
    public Object f6065c;

    /* renamed from: d  reason: collision with root package name */
    public Object f6066d;

    /* renamed from: e  reason: collision with root package name */
    public Object f6067e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f6068f;

    public z(TextureRegistry$ImageTextureEntry textureRegistry$ImageTextureEntry) {
        this.f6063a = 0;
        this.f6064b = 0;
        this.f6067e = new Handler();
        this.f6068f = new C0323b(this);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f6065c = textureRegistry$ImageTextureEntry;
            return;
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    @Override // io.flutter.plugin.platform.f
    public long a() {
        return ((TextureRegistry$ImageTextureEntry) this.f6065c).id();
    }

    @Override // io.flutter.plugin.platform.f
    public void b(int i3, int i4) {
        ImageReader newInstance;
        ImageReader imageReader = (ImageReader) this.f6066d;
        if (imageReader != null && this.f6063a == i3 && this.f6064b == i4) {
            return;
        }
        if (imageReader != null) {
            ((TextureRegistry$ImageTextureEntry) this.f6065c).pushImage(null);
            ((ImageReader) this.f6066d).close();
            this.f6066d = null;
        }
        this.f6063a = i3;
        this.f6064b = i4;
        int i5 = Build.VERSION.SDK_INT;
        Handler handler = (Handler) this.f6067e;
        C0323b c0323b = (C0323b) this.f6068f;
        if (i5 >= 33) {
            D.d.m();
            ImageReader.Builder e2 = D.d.e(this.f6063a, this.f6064b);
            e2.setMaxImages(4);
            e2.setImageFormat(34);
            e2.setUsage(256L);
            newInstance = e2.build();
            newInstance.setOnImageAvailableListener(c0323b, handler);
        } else if (i5 >= 29) {
            newInstance = ImageReader.newInstance(i3, i4, 34, 4, 256L);
            newInstance.setOnImageAvailableListener(c0323b, handler);
        } else {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f6066d = newInstance;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f6066d;
        int size = arrayList.size() - 1;
        if (size < 0) {
            arrayList.clear();
            if (RecyclerView.f4429v0) {
                C0308g c0308g = ((RecyclerView) this.f6068f).f4462i0;
                c0308g.getClass();
                c0308g.f6025c = 0;
            }
        } else if (arrayList.get(size) == null) {
            int[] iArr = RecyclerView.f4427t0;
            throw null;
        } else {
            throw new ClassCastException();
        }
    }

    public void d(int i3) {
        RecyclerView recyclerView = (RecyclerView) this.f6068f;
        if (i3 >= 0 && i3 < recyclerView.f4463j0.a()) {
            C0292C c0292c = recyclerView.f4463j0;
            boolean z3 = c0292c.f5957c;
            ArrayList arrayList = (ArrayList) this.f6065c;
            if (arrayList.size() <= 0) {
                ArrayList arrayList2 = (ArrayList) recyclerView.f4472p.f58p;
                if (arrayList2.size() <= 0) {
                    ArrayList arrayList3 = (ArrayList) this.f6066d;
                    if (arrayList3.size() <= 0) {
                        int Y2 = recyclerView.f4470o.Y(i3, 0);
                        if (Y2 >= 0) {
                            throw null;
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i3 + "(offset:" + Y2 + ").state:" + c0292c.a() + recyclerView.h());
                    }
                    arrayList3.get(0).getClass();
                    throw new ClassCastException();
                }
                RecyclerView.j((View) arrayList2.get(0));
                throw null;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        throw new IndexOutOfBoundsException("Invalid item position " + i3 + "(" + i3 + "). Item count:" + recyclerView.f4463j0.a() + recyclerView.h());
    }

    public void e() {
        t tVar = ((RecyclerView) this.f6068f).f4481u;
        this.f6064b = this.f6063a;
        ArrayList arrayList = (ArrayList) this.f6066d;
        int size = arrayList.size() - 1;
        if (size >= 0 && arrayList.size() > this.f6064b) {
            if (arrayList.get(size) == null) {
                int[] iArr = RecyclerView.f4427t0;
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override // io.flutter.plugin.platform.f
    public int getHeight() {
        return this.f6064b;
    }

    @Override // io.flutter.plugin.platform.f
    public Surface getSurface() {
        return ((ImageReader) this.f6066d).getSurface();
    }

    @Override // io.flutter.plugin.platform.f
    public int getWidth() {
        return this.f6063a;
    }

    @Override // io.flutter.plugin.platform.f
    public void release() {
        if (((ImageReader) this.f6066d) != null) {
            ((TextureRegistry$ImageTextureEntry) this.f6065c).pushImage(null);
            ((ImageReader) this.f6066d).close();
            this.f6066d = null;
        }
        this.f6065c = null;
    }

    @Override // io.flutter.plugin.platform.f
    public /* synthetic */ void scheduleFrame() {
    }

    public z(RecyclerView recyclerView) {
        this.f6068f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f6065c = arrayList;
        this.f6066d = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f6063a = 2;
        this.f6064b = 2;
    }
}
