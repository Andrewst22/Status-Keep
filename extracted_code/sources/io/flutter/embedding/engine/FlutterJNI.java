package io.flutter.embedding.engine;

import B1.c;
import W1.h;
import W1.o;
import X1.b;
import X1.k;
import X1.l;
import Y1.j;
import Z1.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import d.InterfaceC0249a;
import g2.f;
import g2.w;
import h0.x;
import h2.C0286a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.plugin.platform.C0324c;
import io.flutter.plugin.platform.i;
import io.flutter.plugin.platform.m;
import io.flutter.plugin.platform.n;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.d;
import io.flutter.view.e;
import io.flutter.view.s;
import io.flutter.view.t;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p2.C0737a;
@InterfaceC0249a
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static l asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private k accessibilityDelegate;
    private a deferredComponentManager;
    private C0286a localizationPlugin;
    private Long nativeShellHolderId;
    private Y1.k platformMessageHandler;
    private n platformViewsController;
    private m platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<io.flutter.embedding.engine.renderer.m> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j3) {
        l lVar = asyncWaitForVsyncDelegate;
        if (lVar != null) {
            io.flutter.view.a aVar = (io.flutter.view.a) lVar;
            aVar.getClass();
            Choreographer choreographer = Choreographer.getInstance();
            t tVar = (t) aVar.f6284a;
            s sVar = tVar.f6413c;
            if (sVar != null) {
                sVar.f6407m = j3;
                tVar.f6413c = null;
            } else {
                sVar = new s(tVar, j3);
            }
            choreographer.postFrameCallback(sVar);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X1.j] */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j3) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(byteBuffer);
            try {
                decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: X1.j
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$0(j3, imageDecoder, imageInfo, source);
                    }
                });
                return decodeBitmap;
            } catch (IOException e2) {
                Log.e(TAG, "Failed to decode image", e2);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i3, ByteBuffer byteBuffer) {
        f fVar;
        Y1.k kVar = this.platformMessageHandler;
        if (kVar != null && (fVar = (f) ((j) kVar).f3448r.remove(Integer.valueOf(i3))) != null) {
            try {
                fVar.a(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            } catch (Error e2) {
                Thread currentThread = Thread.currentThread();
                if (currentThread.getUncaughtExceptionHandler() != null) {
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e2);
                    return;
                }
                throw e2;
            } catch (Exception e3) {
                Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j3, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Size size;
        named = ColorSpace.Named.SRGB;
        colorSpace = ColorSpace.get(named);
        imageDecoder.setTargetColorSpace(colorSpace);
        imageDecoder.setAllocator(1);
        size = imageInfo.getSize();
        nativeImageHeaderCallback(j3, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j3);

    private native void nativeDeferredComponentInstallFailure(int i3, String str, boolean z3);

    private native void nativeDestroy(long j3);

    private native void nativeDispatchEmptyPlatformMessage(long j3, String str, int i3);

    private native void nativeDispatchPlatformMessage(long j3, String str, ByteBuffer byteBuffer, int i3, int i4);

    private native void nativeDispatchPointerDataPacket(long j3, ByteBuffer byteBuffer, int i3);

    private native void nativeDispatchSemanticsAction(long j3, int i3, int i4, ByteBuffer byteBuffer, int i5);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i3);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i3);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i3);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i3);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i3);

    private native Bitmap nativeGetBitmap(long j3);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j3, int i3, int i4);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j3, int i3);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j3, int i3);

    private native void nativeInvokePlatformMessageResponseCallback(long j3, int i3, ByteBuffer byteBuffer, int i4);

    private native boolean nativeIsSurfaceControlEnabled(long j3);

    private native void nativeLoadDartDeferredLibrary(long j3, int i3, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j3);

    private native void nativeMarkTextureFrameAvailable(long j3, long j4);

    private native void nativeNotifyLowMemoryWarning(long j3);

    private native void nativeOnVsync(long j3, long j4, long j5);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j3, long j4, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z3);

    private native void nativeRegisterTexture(long j3, long j4, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j3, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j4);

    private native void nativeScheduleFrame(long j3);

    private native void nativeSetAccessibilityFeatures(long j3, int i3);

    private native void nativeSetSemanticsEnabled(long j3, boolean z3);

    private native void nativeSetViewportMetrics(long j3, float f3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j3, String str, String str2, String str3, List<String> list, long j4);

    private native void nativeSurfaceChanged(long j3, int i3, int i4);

    private native void nativeSurfaceCreated(long j3, Surface surface);

    private native void nativeSurfaceDestroyed(long j3);

    private native void nativeSurfaceWindowChanged(long j3, Surface surface);

    private native void nativeUnregisterTexture(long j3, long j4);

    private native void nativeUpdateDisplayMetrics(long j3);

    private native void nativeUpdateJavaAssetManager(long j3, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f3);

    private void onPreEngineRestart() {
        for (b bVar : this.engineLifecycleListeners) {
            bVar.a();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        String str;
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            io.flutter.view.a aVar = (io.flutter.view.a) kVar;
            aVar.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.k kVar2 = (io.flutter.view.k) aVar.f6284a;
            kVar2.getClass();
            while (byteBuffer.hasRemaining()) {
                e b3 = kVar2.b(byteBuffer.getInt());
                b3.f6313c = byteBuffer.getInt();
                int i3 = byteBuffer.getInt();
                String str2 = null;
                if (i3 == -1) {
                    str = null;
                } else {
                    str = strArr[i3];
                }
                b3.f6314d = str;
                int i4 = byteBuffer.getInt();
                if (i4 != -1) {
                    str2 = strArr[i4];
                }
                b3.f6315e = str2;
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            ((io.flutter.view.a) kVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(mVar);
    }

    @SuppressLint({"NewApi"})
    public void applyTransactions() {
        m mVar = this.platformViewsController2;
        if (mVar != null) {
            SurfaceControl.Transaction h3 = x.h();
            int i3 = 0;
            while (true) {
                ArrayList arrayList = mVar.f6231l;
                if (i3 < arrayList.size()) {
                    h3 = h3.merge(x.j(arrayList.get(i3)));
                    i3++;
                } else {
                    h3.apply();
                    arrayList.clear();
                    return;
                }
            }
        } else {
            throw new RuntimeException("");
        }
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j3) {
        nativeCleanupMessageData(j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0139, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0141, code lost:
        if (r4.hasNext() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0143, code lost:
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0155, code lost:
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0158, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0160, code lost:
        if (r4.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0162, code lost:
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0174, code lost:
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0177, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a3, code lost:
        r10 = r3;
     */
    /* JADX WARN: Incorrect condition in loop: B:41:0x011a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String[] computePlatformResolvedLocale(java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.computePlatformResolvedLocale(java.lang.String[]):java.lang.String[]");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, W1.h, io.flutter.plugin.platform.c] */
    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        n nVar = this.platformViewsController;
        if (nVar != null) {
            ?? hVar = new h(nVar.f6240d.getContext(), nVar.f6240d.getWidth(), nVar.f6240d.getHeight(), 2);
            hVar.f6198s = nVar.f6244h;
            int i3 = nVar.f6251o;
            nVar.f6251o = i3 + 1;
            nVar.f6249m.put(i3, hVar);
            return new FlutterOverlaySurface(i3, hVar.getSurface());
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    @SuppressLint({"NewApi"})
    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        m mVar = this.platformViewsController2;
        if (mVar != null) {
            if (mVar.f6233n == null) {
                SurfaceControl.Builder g3 = x.g();
                g3.setBufferSize(mVar.f6223d.getWidth(), mVar.f6223d.getHeight());
                g3.setFormat(1);
                g3.setName("Flutter Overlay Surface");
                g3.setOpaque(false);
                g3.setHidden(false);
                build = g3.build();
                SurfaceControl.Transaction f3 = Z.j.f(Z.j.e(mVar.f6223d), build);
                f3.setLayer(build, 1000);
                f3.apply();
                mVar.f6233n = x.f(build);
                mVar.f6234o = build;
            }
            return new FlutterOverlaySurface(0, mVar.f6233n);
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    @SuppressLint({"NewApi"})
    public SurfaceControl.Transaction createTransaction() {
        m mVar = this.platformViewsController2;
        if (mVar != null) {
            SurfaceControl.Transaction h3 = x.h();
            mVar.f6231l.add(h3);
            return h3;
        }
        throw new RuntimeException("");
    }

    public void deferredComponentInstallFailure(int i3, String str, boolean z3) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i3, str, z3);
    }

    @SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        m mVar = this.platformViewsController2;
        if (mVar != null) {
            Surface surface = mVar.f6233n;
            if (surface != null) {
                surface.release();
                mVar.f6233n = null;
                mVar.f6234o = null;
                return;
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        n nVar = this.platformViewsController;
        if (nVar != null) {
            nVar.g();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i3);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i3);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i3, int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i3, i4);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i4);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i3, d dVar) {
        dispatchSemanticsAction(i3, dVar, null);
    }

    @SuppressLint({"NewApi"})
    public void endFrame2() {
        m mVar = this.platformViewsController2;
        if (mVar != null) {
            SurfaceControl.Transaction h3 = x.h();
            int i3 = 0;
            while (true) {
                ArrayList arrayList = mVar.f6232m;
                if (i3 < arrayList.size()) {
                    h3 = h3.merge(x.j(arrayList.get(i3)));
                    i3++;
                } else {
                    arrayList.clear();
                    mVar.f6223d.invalidate();
                    Z.j.k(Z.j.e(mVar.f6223d), h3);
                    return;
                }
            }
        } else {
            throw new RuntimeException("");
        }
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float getScaledFontSize(float r7, int r8) {
        /*
            r6 = this;
            B1.e r0 = f2.m.f5614b
            java.lang.Object r1 = r0.f57o
            f2.l r1 = (f2.l) r1
            java.lang.Object r2 = r0.f56n
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            if (r1 != 0) goto L14
            java.lang.Object r1 = r2.poll()
            f2.l r1 = (f2.l) r1
            r0.f57o = r1
        L14:
            java.lang.Object r1 = r0.f57o
            f2.l r1 = (f2.l) r1
            if (r1 == 0) goto L27
            int r3 = r1.f5612a
            if (r3 >= r8) goto L27
            java.lang.Object r1 = r2.poll()
            f2.l r1 = (f2.l) r1
            r0.f57o = r1
            goto L14
        L27:
            r2 = 0
            java.lang.String r3 = "Cannot find config with generation: "
            java.lang.String r4 = "SettingsChannel"
            if (r1 != 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r0.append(r1)
            java.lang.String r1 = ", after exhausting the queue."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r4, r0)
        L46:
            r1 = r2
            goto L72
        L48:
            int r5 = r1.f5612a
            if (r5 == r8) goto L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r3 = java.lang.String.valueOf(r8)
            r1.append(r3)
            java.lang.String r3 = ", the oldest config is now: "
            r1.append(r3)
            java.lang.Object r0 = r0.f57o
            f2.l r0 = (f2.l) r0
            int r0 = r0.f5612a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r4, r0)
            goto L46
        L72:
            if (r1 != 0) goto L75
            goto L77
        L75:
            android.util.DisplayMetrics r2 = r1.f5613b
        L77:
            if (r2 != 0) goto L98
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "getScaledFontSize called with configurationId "
            r7.<init>(r0)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.append(r8)
            java.lang.String r8 = ", which can't be found."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FlutterJNI"
            android.util.Log.e(r8, r7)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r7
        L98:
            r8 = 2
            float r7 = android.util.TypedValue.applyDimension(r8, r7, r2)
            float r8 = r2.density
            float r7 = r7 / r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.getScaledFontSize(float, int):float");
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i3, long j3) {
        Y1.f fVar;
        boolean z3;
        Y1.k kVar = this.platformMessageHandler;
        if (kVar != null) {
            j jVar = (j) kVar;
            synchronized (jVar.f3446p) {
                try {
                    fVar = (Y1.f) jVar.f3444n.get(str);
                    if (jVar.f3447q.get() && fVar == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (!jVar.f3445o.containsKey(str)) {
                            jVar.f3445o.put(str, new LinkedList());
                        }
                        ((List) jVar.f3445o.get(str)).add(new Y1.d(j3, byteBuffer, i3));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3) {
                jVar.a(str, fVar, byteBuffer, i3, j3);
                return;
            }
            return;
        }
        nativeCleanupMessageData(j3);
    }

    @SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        m mVar = this.platformViewsController2;
        if (mVar != null) {
            if (mVar.f6234o != null) {
                SurfaceControl.Transaction h3 = x.h();
                h3.setVisibility(mVar.f6234o, false);
                h3.apply();
                return;
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j3, int i3) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j3, i3);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i3) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i3);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i3);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public void invokePlatformMessageResponseCallback(int i3, ByteBuffer byteBuffer, int i4) {
        if (byteBuffer.isDirect()) {
            this.shellHolderLock.readLock().lock();
            try {
                if (isAttached()) {
                    nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i3, byteBuffer, i4);
                } else {
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i3);
                }
                this.shellHolderLock.readLock().unlock();
                return;
            } catch (Throwable th) {
                this.shellHolderLock.readLock().unlock();
                throw th;
            }
        }
        throw new IllegalArgumentException("Expected a direct ByteBuffer.");
    }

    public boolean isAttached() {
        if (this.nativeShellHolderId != null) {
            return true;
        }
        return false;
    }

    public boolean isCodePointEmoji(int i3) {
        return nativeFlutterTextUtilsIsEmoji(i3);
    }

    public boolean isCodePointEmojiModifier(int i3) {
        return nativeFlutterTextUtilsIsEmojiModifier(i3);
    }

    public boolean isCodePointEmojiModifierBase(int i3) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i3);
    }

    public boolean isCodePointRegionalIndicator(int i3) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i3);
    }

    public boolean isCodePointVariantSelector(int i3) {
        return nativeFlutterTextUtilsIsVariationSelector(i3);
    }

    public void loadDartDeferredLibrary(int i3, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i3, strArr);
    }

    public void loadLibrary(Context context) {
        B1.a aVar;
        String[] strArr;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        char c3 = 0;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        B1.e eVar = new B1.e(0);
        if (context != null) {
            B1.e.l0("Beginning load of %s...", "flutter");
            B1.b bVar = (B1.b) eVar.f57o;
            HashSet hashSet = (HashSet) eVar.f56n;
            if (hashSet.contains("flutter")) {
                B1.e.l0("%s already loaded previously!", "flutter");
            } else {
                try {
                    bVar.getClass();
                    System.loadLibrary("flutter");
                    hashSet.add("flutter");
                    B1.e.l0("%s (%s) was loaded normally!", "flutter", null);
                } catch (UnsatisfiedLinkError e2) {
                    B1.e.l0("Loading the library normally failed: %s", Log.getStackTraceString(e2));
                    B1.e.l0("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                    File f02 = eVar.f0(context);
                    if (!f02.exists()) {
                        File dir = context.getDir("lib", 0);
                        File f03 = eVar.f0(context);
                        bVar.getClass();
                        File[] listFiles = dir.listFiles(new B1.d(System.mapLibraryName("flutter")));
                        if (listFiles != null) {
                            for (File file : listFiles) {
                                if (!file.getAbsolutePath().equals(f03.getAbsolutePath())) {
                                    file.delete();
                                }
                            }
                        }
                        String[] strArr2 = Build.SUPPORTED_ABIS;
                        if (strArr2.length <= 0) {
                            String str = Build.CPU_ABI2;
                            if (str != null && str.length() != 0) {
                                strArr2 = new String[]{Build.CPU_ABI, str};
                            } else {
                                strArr2 = new String[]{Build.CPU_ABI};
                            }
                        }
                        String mapLibraryName = System.mapLibraryName("flutter");
                        ((B1.b) eVar.f58p).getClass();
                        try {
                            B1.a p3 = B1.b.p(context, strArr2, mapLibraryName, eVar);
                            try {
                                if (p3 != null) {
                                    int i3 = 0;
                                    while (true) {
                                        int i4 = i3 + 1;
                                        zipFile = (ZipFile) p3.f50n;
                                        if (i3 < 5) {
                                            Object[] objArr = new Object[1];
                                            objArr[c3] = mapLibraryName;
                                            B1.e.l0("Found %s! Extracting...", objArr);
                                            try {
                                                if (f02.exists() || f02.createNewFile()) {
                                                    try {
                                                        inputStream2 = zipFile.getInputStream((ZipEntry) p3.f51o);
                                                    } catch (FileNotFoundException unused) {
                                                        inputStream2 = null;
                                                    } catch (IOException unused2) {
                                                        inputStream2 = null;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        inputStream = null;
                                                    }
                                                    try {
                                                        fileOutputStream2 = new FileOutputStream(f02);
                                                        try {
                                                            byte[] bArr = new byte[4096];
                                                            long j3 = 0;
                                                            while (true) {
                                                                int read = inputStream2.read(bArr);
                                                                if (read == -1) {
                                                                    break;
                                                                }
                                                                fileOutputStream2.write(bArr, 0, read);
                                                                j3 += read;
                                                            }
                                                            fileOutputStream2.flush();
                                                            fileOutputStream2.getFD().sync();
                                                            if (j3 != f02.length()) {
                                                                B1.b.n(inputStream2);
                                                                B1.b.n(fileOutputStream2);
                                                            } else {
                                                                B1.b.n(inputStream2);
                                                                B1.b.n(fileOutputStream2);
                                                                f02.setReadable(true, false);
                                                                f02.setExecutable(true, false);
                                                                f02.setWritable(true);
                                                                break;
                                                            }
                                                        } catch (FileNotFoundException unused3) {
                                                            B1.b.n(inputStream2);
                                                            B1.b.n(fileOutputStream2);
                                                            i3 = i4;
                                                            c3 = 0;
                                                        } catch (IOException unused4) {
                                                            B1.b.n(inputStream2);
                                                            B1.b.n(fileOutputStream2);
                                                            i3 = i4;
                                                            c3 = 0;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            inputStream = inputStream2;
                                                            fileOutputStream = fileOutputStream2;
                                                            B1.b.n(inputStream);
                                                            B1.b.n(fileOutputStream);
                                                            throw th;
                                                        }
                                                    } catch (FileNotFoundException unused5) {
                                                        fileOutputStream2 = null;
                                                        B1.b.n(inputStream2);
                                                        B1.b.n(fileOutputStream2);
                                                        i3 = i4;
                                                        c3 = 0;
                                                    } catch (IOException unused6) {
                                                        fileOutputStream2 = null;
                                                        B1.b.n(inputStream2);
                                                        B1.b.n(fileOutputStream2);
                                                        i3 = i4;
                                                        c3 = 0;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        inputStream = inputStream2;
                                                        fileOutputStream = null;
                                                        B1.b.n(inputStream);
                                                        B1.b.n(fileOutputStream);
                                                        throw th;
                                                    }
                                                }
                                            } catch (IOException unused7) {
                                            }
                                            i3 = i4;
                                            c3 = 0;
                                        }
                                    }
                                    try {
                                        zipFile.close();
                                    } catch (IOException unused8) {
                                        String absolutePath = f02.getAbsolutePath();
                                        bVar.getClass();
                                        System.load(absolutePath);
                                        hashSet.add("flutter");
                                        B1.e.l0("%s (%s) was re-linked!", "flutter", null);
                                        loadLibraryCalled = true;
                                        return;
                                    }
                                } else {
                                    try {
                                        strArr = B1.b.s(context, mapLibraryName);
                                    } catch (Exception e3) {
                                        strArr = new String[]{e3.toString()};
                                    }
                                    throw new c(mapLibraryName, strArr2, strArr);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                aVar = p3;
                                if (aVar != null) {
                                    try {
                                        ((ZipFile) aVar.f50n).close();
                                    } catch (IOException unused9) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            aVar = null;
                        }
                    }
                    String absolutePath2 = f02.getAbsolutePath();
                    bVar.getClass();
                    System.load(absolutePath2);
                    hashSet.add("flutter");
                    B1.e.l0("%s (%s) was re-linked!", "flutter", null);
                }
            }
            loadLibraryCalled = true;
            return;
        }
        throw new IllegalArgumentException("Given context is null");
    }

    public void markTextureFrameAvailable(long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j3);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        n nVar = this.platformViewsController;
        if (nVar != null) {
            nVar.f6254r.clear();
            nVar.f6255s.clear();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }

    public void onDisplayOverlaySurface(int i3, int i4, int i5, int i6, int i7) {
        ensureRunningOnMainThread();
        n nVar = this.platformViewsController;
        if (nVar != null) {
            SparseArray sparseArray = nVar.f6249m;
            if (sparseArray.get(i3) != null) {
                nVar.k();
                View view = (C0324c) sparseArray.get(i3);
                if (view.getParent() == null) {
                    nVar.f6240d.addView(view);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
                layoutParams.leftMargin = i4;
                layoutParams.topMargin = i5;
                view.setLayoutParams(layoutParams);
                view.setVisibility(0);
                view.bringToFront();
                nVar.f6254r.add(Integer.valueOf(i3));
                return;
            }
            throw new IllegalStateException("The overlay surface (id:" + i3 + ") doesn't exist");
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void onDisplayPlatformView(int i3, int i4, int i5, int i6, int i7, int i8, int i9, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        n nVar = this.platformViewsController;
        if (nVar != null) {
            nVar.k();
            SparseArray sparseArray = nVar.f6247k;
            io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) sparseArray.get(i3);
            if (eVar != null) {
                SparseArray sparseArray2 = nVar.f6248l;
                if (sparseArray2.get(i3) == null) {
                    SurfaceView surfaceView = ((C0737a) eVar).f8832a;
                    if (surfaceView != null) {
                        if (surfaceView.getParent() == null) {
                            Activity activity = nVar.f6239c;
                            b2.b bVar = new b2.b(activity, activity.getResources().getDisplayMetrics().density, nVar.f6238b);
                            bVar.setOnDescendantFocusChangeListener(new i(nVar, i3, 0));
                            sparseArray2.put(i3, bVar);
                            surfaceView.setImportantForAccessibility(4);
                            bVar.addView(surfaceView);
                            nVar.f6240d.addView(bVar);
                        } else {
                            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
                        }
                    } else {
                        throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                    }
                }
                b2.b bVar2 = (b2.b) sparseArray2.get(i3);
                bVar2.f4687m = flutterMutatorsStack;
                bVar2.f4689o = i4;
                bVar2.f4690p = i5;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
                layoutParams.leftMargin = i4;
                layoutParams.topMargin = i5;
                bVar2.setLayoutParams(layoutParams);
                bVar2.setWillNotDraw(false);
                bVar2.setVisibility(0);
                bVar2.bringToFront();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i8, i9);
                SurfaceView surfaceView2 = ((C0737a) ((io.flutter.plugin.platform.e) sparseArray.get(i3))).f8832a;
                if (surfaceView2 != null) {
                    surfaceView2.setLayoutParams(layoutParams2);
                    surfaceView2.bringToFront();
                }
                nVar.f6255s.add(Integer.valueOf(i3));
                return;
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    @SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int i3, int i4, int i5, int i6, int i7, int i8, int i9, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        m mVar = this.platformViewsController2;
        if (mVar != null) {
            SparseArray sparseArray = mVar.f6228i;
            io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) sparseArray.get(i3);
            if (eVar != null) {
                SparseArray sparseArray2 = mVar.f6229j;
                if (sparseArray2.get(i3) == null) {
                    SurfaceView surfaceView = ((C0737a) eVar).f8832a;
                    if (surfaceView != null) {
                        if (surfaceView.getParent() == null) {
                            Activity activity = mVar.f6222c;
                            b2.b bVar = new b2.b(activity, activity.getResources().getDisplayMetrics().density, mVar.f6221b);
                            bVar.setOnDescendantFocusChangeListener(new i(mVar, i3, 1));
                            sparseArray2.put(i3, bVar);
                            surfaceView.setImportantForAccessibility(4);
                            bVar.addView(surfaceView);
                            mVar.f6223d.addView(bVar);
                        } else {
                            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
                        }
                    } else {
                        throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                    }
                }
                b2.b bVar2 = (b2.b) sparseArray2.get(i3);
                bVar2.f4687m = flutterMutatorsStack;
                bVar2.f4689o = i4;
                bVar2.f4690p = i5;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
                layoutParams.leftMargin = i4;
                layoutParams.topMargin = i5;
                bVar2.setLayoutParams(layoutParams);
                bVar2.setWillNotDraw(false);
                bVar2.setVisibility(0);
                bVar2.bringToFront();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i8, i9);
                SurfaceView surfaceView2 = ((C0737a) ((io.flutter.plugin.platform.e) sparseArray.get(i3))).f8832a;
                if (surfaceView2 != null) {
                    surfaceView2.setLayoutParams(layoutParams2);
                    surfaceView2.bringToFront();
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public void onEndFrame() {
        boolean z3;
        ?? r3;
        ensureRunningOnMainThread();
        n nVar = this.platformViewsController;
        if (nVar != null) {
            boolean z4 = false;
            if (nVar.f6252p && nVar.f6255s.isEmpty()) {
                nVar.f6252p = false;
                o oVar = nVar.f6240d;
                Z.d dVar = new Z.d(nVar, 6);
                h hVar = oVar.f2889o;
                if (hVar != null && (r3 = oVar.f2891q) != 0) {
                    oVar.f2890p = r3;
                    oVar.f2891q = null;
                    io.flutter.embedding.engine.renderer.l lVar = oVar.f2894t.f2977b;
                    if (lVar == null) {
                        hVar.c();
                        h hVar2 = oVar.f2889o;
                        if (hVar2 != null) {
                            hVar2.f2855m.close();
                            oVar.removeView(oVar.f2889o);
                            oVar.f2889o = null;
                        }
                        dVar.run();
                        return;
                    }
                    r3.d();
                    W1.n nVar2 = new W1.n(oVar, lVar, dVar);
                    lVar.f6109a.addIsDisplayingFlutterUiListener(nVar2);
                    if (lVar.f6112d) {
                        nVar2.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (nVar.f6252p) {
                h hVar3 = nVar.f6240d.f2889o;
                if (hVar3 != null) {
                    z3 = hVar3.e();
                } else {
                    z3 = false;
                }
                if (z3) {
                    z4 = true;
                }
            }
            nVar.i(z4);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        for (io.flutter.embedding.engine.renderer.m mVar : this.flutterUiDisplayListeners) {
            mVar.b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        for (io.flutter.embedding.engine.renderer.m mVar : this.flutterUiDisplayListeners) {
            mVar.a();
        }
    }

    public void onSurfaceChanged(int i3, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i3, i4);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j3, long j4, long j5) {
        nativeOnVsync(j3, j4, j5);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j3, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j3, new WeakReference<>(textureRegistry$ImageConsumer), z3);
    }

    public void registerTexture(long j3, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j3, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(mVar);
    }

    public void requestDartDeferredLibrary(int i3) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j3);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(k kVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = kVar;
    }

    public void setAccessibilityFeatures(int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i3);
        }
    }

    public void setAccessibilityFeaturesInNative(int i3) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i3);
    }

    public void setAsyncWaitForVsyncDelegate(l lVar) {
        asyncWaitForVsyncDelegate = lVar;
    }

    public void setDeferredComponentManager(a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(C0286a c0286a) {
        ensureRunningOnMainThread();
        this.localizationPlugin = c0286a;
    }

    public void setPlatformMessageHandler(Y1.k kVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = kVar;
    }

    public void setPlatformViewsController(n nVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = nVar;
    }

    public void setPlatformViewsController2(m mVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = mVar;
    }

    public void setRefreshRateFPS(float f3) {
        refreshRateFPS = f3;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z3);
        }
    }

    public void setSemanticsEnabledInNative(boolean z3) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z3);
    }

    public void setViewportMetrics(float f3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f3, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, iArr, iArr2, iArr3);
    }

    @SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        m mVar = this.platformViewsController2;
        if (mVar != null) {
            if (mVar.f6234o != null) {
                SurfaceControl.Transaction h3 = x.h();
                h3.setVisibility(mVar.f6234o, true);
                h3.apply();
                return;
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j3) {
        boolean z3;
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j3);
        Long l3 = nativeSpawn.nativeShellHolderId;
        if (l3 != null && l3.longValue() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    @SuppressLint({"NewApi"})
    public void swapTransactions() {
        m mVar = this.platformViewsController2;
        if (mVar != null) {
            synchronized (mVar) {
                try {
                    mVar.f6232m.clear();
                    for (int i3 = 0; i3 < mVar.f6231l.size(); i3++) {
                        mVar.f6232m.add(x.j(mVar.f6231l.get(i3)));
                    }
                    mVar.f6231l.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new RuntimeException("");
    }

    public void unregisterTexture(long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j3);
    }

    public void updateDisplayMetrics(int i3, float f3, float f4, float f5) {
        displayWidth = f3;
        displayHeight = f4;
        displayDensity = f5;
        if (!loadLibraryCalled) {
            return;
        }
        nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (!loadLibraryCalled) {
            return;
        }
        nativeUpdateRefreshRate(refreshRateFPS);
    }

    public void dispatchSemanticsAction(int i3, d dVar, Object obj) {
        ByteBuffer byteBuffer;
        int i4;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = w.f5793a.b(obj);
            i4 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i4 = 0;
        }
        dispatchSemanticsAction(i3, dVar.f6310m, byteBuffer, i4);
    }

    public void dispatchSemanticsAction(int i3, int i4, ByteBuffer byteBuffer, int i5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i3, i4, byteBuffer, i5);
    }
}
