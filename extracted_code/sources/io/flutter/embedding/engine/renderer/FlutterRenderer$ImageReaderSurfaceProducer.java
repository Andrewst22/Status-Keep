package io.flutter.embedding.engine.renderer;

import Y.G;
import android.annotation.TargetApi;
import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import d.InterfaceC0249a;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
@InterfaceC0249a
@TargetApi(29)
/* loaded from: classes.dex */
public final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, io.flutter.view.o {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 6;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    private final long id;
    private boolean released;
    final /* synthetic */ l this$0;
    private boolean ignoringFence = VERBOSE_LOGS;
    private int requestedWidth = 1;
    private int requestedHeight = 1;
    private boolean createNewReader = true;
    private boolean notifiedDestroy = VERBOSE_LOGS;
    private long lastDequeueTime = 0;
    private long lastQueueTime = 0;
    private long lastScheduleTime = 0;
    private int numTrims = 0;
    private final Object lock = new Object();
    private final ArrayDeque<g> imageReaderQueue = new ArrayDeque<>();
    private final HashMap<ImageReader, g> perImageReaders = new HashMap<>();
    private ArrayList<e> lastDequeuedImage = new ArrayList<>();
    private g lastReaderDequeuedFrom = null;
    private p callback = null;

    public FlutterRenderer$ImageReaderSurfaceProducer(l lVar, long j3) {
        this.this$0 = lVar;
        this.id = j3;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (g gVar : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == gVar) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    gVar.f6081c = true;
                    gVar.f6079a.close();
                    gVar.f6080b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    Iterator<e> it = this.lastDequeuedImage.iterator();
                    while (it.hasNext()) {
                        it.next().f6076a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                g gVar2 = this.lastReaderDequeuedFrom;
                if (gVar2 != null) {
                    gVar2.f6081c = true;
                    gVar2.f6079a.close();
                    gVar2.f6080b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ImageReader createImageReader() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            return createImageReader33();
        }
        if (i3 >= 29) {
            return createImageReader29();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    @TargetApi(29)
    private ImageReader createImageReader29() {
        ImageReader newInstance;
        newInstance = ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 6, 256L);
        return newInstance;
    }

    @TargetApi(33)
    private ImageReader createImageReader33() {
        ImageReader build;
        D.d.m();
        ImageReader.Builder e2 = D.d.e(this.requestedWidth, this.requestedHeight);
        e2.setMaxImages(6);
        e2.setImageFormat(34);
        e2.setUsage(256L);
        build = e2.build();
        return build;
    }

    private g getActiveReader() {
        synchronized (this.lock) {
            try {
                if (this.createNewReader) {
                    this.createNewReader = VERBOSE_LOGS;
                    return getOrCreatePerImageReader(createImageReader());
                }
                return this.imageReaderQueue.peekLast();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void lambda$dequeueImage$0() {
        if (!this.released) {
            this.this$0.f6109a.scheduleFrame();
        }
    }

    private void maybeWaitOnFence(Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void releaseInternal() {
        cleanup();
        this.released = true;
        this.this$0.f(this);
        this.this$0.f6115g.remove(this);
    }

    @TargetApi(33)
    private void waitOnFence(Image image) {
        SyncFence fence;
        try {
            fence = image.getFence();
            fence.awaitForever();
        } catch (IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    @TargetApi(29)
    public Image acquireLatestImage() {
        e dequeueImage = dequeueImage();
        if (dequeueImage == null) {
            return null;
        }
        Image image = dequeueImage.f6076a;
        maybeWaitOnFence(image);
        return image;
    }

    public double deltaMillis(long j3) {
        return j3 / 1000000.0d;
    }

    public e dequeueImage() {
        e eVar;
        boolean z3;
        e eVar2;
        synchronized (this.lock) {
            try {
                Iterator<g> it = this.imageReaderQueue.iterator();
                eVar = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    z3 = VERBOSE_LOGS;
                    if (!hasNext) {
                        break;
                    }
                    g next = it.next();
                    ArrayDeque arrayDeque = next.f6080b;
                    if (arrayDeque.isEmpty()) {
                        eVar2 = null;
                    } else {
                        eVar2 = (e) arrayDeque.removeFirst();
                    }
                    if (eVar2 == null) {
                        eVar = eVar2;
                    } else {
                        while (this.lastDequeuedImage.size() > 2) {
                            this.lastDequeuedImage.remove(0).f6076a.close();
                        }
                        this.lastDequeuedImage.add(eVar2);
                        this.lastReaderDequeuedFrom = next;
                        eVar = eVar2;
                    }
                }
                pruneImageReaderQueue();
                Iterator<g> it2 = this.imageReaderQueue.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().f6080b.isEmpty()) {
                        z3 = true;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            this.this$0.f6113e.post(new d(this, 0));
        }
        return eVar;
    }

    public void disableFenceForTest() {
        this.ignoringFence = true;
    }

    public void finalize() {
        try {
            if (this.released) {
                return;
            }
            releaseInternal();
            l lVar = this.this$0;
            lVar.f6113e.post(new j(this.id, lVar.f6109a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getHeight() {
        return this.requestedHeight;
    }

    public g getOrCreatePerImageReader(ImageReader imageReader) {
        g gVar = this.perImageReaders.get(imageReader);
        if (gVar == null) {
            g gVar2 = new g(this, imageReader);
            this.perImageReaders.put(imageReader, gVar2);
            this.imageReaderQueue.add(gVar2);
            return gVar2;
        }
        return gVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getSurface() {
        return getActiveReader().f6079a.getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getWidth() {
        return this.requestedWidth;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public boolean handlesCropAndRotation() {
        return VERBOSE_LOGS;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public long id() {
        return this.id;
    }

    public int numImageReaders() {
        int size;
        synchronized (this.lock) {
            size = this.imageReaderQueue.size();
        }
        return size;
    }

    public int numImages() {
        int i3;
        synchronized (this.lock) {
            try {
                Iterator<g> it = this.imageReaderQueue.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    i3 += it.next().f6080b.size();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i3;
    }

    public int numTrims() {
        int i3;
        synchronized (this.lock) {
            i3 = this.numTrims;
        }
        return i3;
    }

    public void onImage(ImageReader imageReader, Image image) {
        e eVar;
        synchronized (this.lock) {
            g orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            if (orCreatePerImageReader.f6081c) {
                eVar = null;
            } else {
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.f6082d;
                System.nanoTime();
                e eVar2 = new e(flutterRenderer$ImageReaderSurfaceProducer, image);
                ArrayDeque arrayDeque = orCreatePerImageReader.f6080b;
                arrayDeque.add(eVar2);
                while (arrayDeque.size() > 2) {
                    ((e) arrayDeque.removeFirst()).f6076a.close();
                }
                eVar = eVar2;
            }
        }
        if (eVar == null) {
            return;
        }
        this.this$0.f6109a.scheduleFrame();
    }

    @Override // io.flutter.view.o
    public void onTrimMemory(int i3) {
        if (i3 < 40) {
            return;
        }
        synchronized (this.lock) {
            this.numTrims++;
        }
        p pVar = this.callback;
        if (pVar != null) {
            this.notifiedDestroy = true;
            q2.b bVar = (q2.b) pVar;
            ((G) bVar.f8707c).E(null);
            bVar.f8881d = true;
        }
        cleanup();
        this.createNewReader = true;
    }

    public int pendingDequeuedImages() {
        return this.lastDequeuedImage.size();
    }

    public void pruneImageReaderQueue() {
        g peekFirst;
        while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null) {
            ArrayDeque arrayDeque = peekFirst.f6080b;
            if (arrayDeque.isEmpty() && peekFirst.f6082d.lastReaderDequeuedFrom != peekFirst) {
                this.imageReaderQueue.removeFirst();
                HashMap<ImageReader, g> hashMap = this.perImageReaders;
                ImageReader imageReader = peekFirst.f6079a;
                hashMap.remove(imageReader);
                peekFirst.f6081c = true;
                imageReader.close();
                arrayDeque.clear();
            } else {
                return;
            }
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void release() {
        if (this.released) {
            return;
        }
        releaseInternal();
        l lVar = this.this$0;
        lVar.f6109a.unregisterTexture(this.id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.this$0.f6109a.scheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(p pVar) {
        this.callback = pVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setSize(int i3, int i4) {
        int max = Math.max(1, i3);
        int max2 = Math.max(1, i4);
        if (this.requestedWidth == max && this.requestedHeight == max2) {
            return;
        }
        this.createNewReader = true;
        this.requestedHeight = max2;
        this.requestedWidth = max;
    }
}
