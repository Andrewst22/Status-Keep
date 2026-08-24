package io.flutter.plugin.platform;

import android.media.Image;
import android.media.ImageReader;
import android.util.Log;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
/* renamed from: io.flutter.plugin.platform.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323b implements ImageReader.OnImageAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i1.z f6197a;

    public C0323b(i1.z zVar) {
        this.f6197a = zVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image image;
        try {
            image = imageReader.acquireLatestImage();
        } catch (IllegalStateException e2) {
            Log.e("ImageReaderPlatformViewRenderTarget", "onImageAvailable acquireLatestImage failed: " + e2.toString());
            image = null;
        }
        if (image == null) {
            return;
        }
        ((TextureRegistry$ImageTextureEntry) this.f6197a.f6065c).pushImage(image);
    }
}
