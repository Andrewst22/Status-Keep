package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ImageReader f6079a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f6080b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public boolean f6081c = false;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ FlutterRenderer$ImageReaderSurfaceProducer f6082d;

    public g(FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer, ImageReader imageReader) {
        this.f6082d = flutterRenderer$ImageReaderSurfaceProducer;
        this.f6079a = imageReader;
        imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.f
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader2) {
                Image image;
                boolean z3;
                g gVar = g.this;
                gVar.getClass();
                try {
                    image = imageReader2.acquireLatestImage();
                } catch (IllegalStateException e2) {
                    Log.e("ImageReaderSurfaceProducer", "onImageAvailable acquireLatestImage failed: " + e2);
                    image = null;
                }
                if (image != null) {
                    FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer2 = gVar.f6082d;
                    z3 = flutterRenderer$ImageReaderSurfaceProducer2.released;
                    if (!z3 && !gVar.f6081c) {
                        flutterRenderer$ImageReaderSurfaceProducer2.onImage(imageReader2, image);
                    } else {
                        image.close();
                    }
                }
            }
        }, new Handler(Looper.getMainLooper()));
    }
}
