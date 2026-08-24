package Y1;

import a.AbstractC0155a;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import g2.m;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.AbstractC0561a;
import r2.AbstractC0766a;
/* loaded from: classes.dex */
public final class j implements g2.g, k {

    /* renamed from: m  reason: collision with root package name */
    public final FlutterJNI f3443m;

    /* renamed from: n  reason: collision with root package name */
    public final HashMap f3444n;

    /* renamed from: o  reason: collision with root package name */
    public final HashMap f3445o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f3446p;

    /* renamed from: q  reason: collision with root package name */
    public final AtomicBoolean f3447q;

    /* renamed from: r  reason: collision with root package name */
    public final HashMap f3448r;

    /* renamed from: s  reason: collision with root package name */
    public int f3449s;

    /* renamed from: t  reason: collision with root package name */
    public final l f3450t;

    /* renamed from: u  reason: collision with root package name */
    public final WeakHashMap f3451u;

    /* renamed from: v  reason: collision with root package name */
    public final C1.j f3452v;

    public j(FlutterJNI flutterJNI) {
        C1.j jVar = new C1.j(23, false);
        jVar.f168n = (ExecutorService) B1.e.j0().f58p;
        this.f3444n = new HashMap();
        this.f3445o = new HashMap();
        this.f3446p = new Object();
        this.f3447q = new AtomicBoolean(false);
        this.f3448r = new HashMap();
        this.f3449s = 1;
        this.f3450t = new l();
        this.f3451u = new WeakHashMap();
        this.f3443m = flutterJNI;
        this.f3452v = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [Y1.c] */
    public final void a(final String str, final f fVar, final ByteBuffer byteBuffer, final int i3, final long j3) {
        e eVar;
        if (fVar != null) {
            eVar = fVar.f3434b;
        } else {
            eVar = null;
        }
        String a3 = AbstractC0766a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0561a.a(AbstractC0155a.O(a3), i3);
        } else {
            String O3 = AbstractC0155a.O(a3);
            try {
                if (AbstractC0155a.f3601s == null) {
                    AbstractC0155a.f3601s = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                AbstractC0155a.f3601s.invoke(null, Long.valueOf(AbstractC0155a.f3599q), O3, Integer.valueOf(i3));
            } catch (Exception e2) {
                AbstractC0155a.A("asyncTraceBegin", e2);
            }
        }
        ?? r02 = new Runnable() { // from class: Y1.c
            @Override // java.lang.Runnable
            public final void run() {
                long j4 = j3;
                FlutterJNI flutterJNI = j.this.f3443m;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a4 = AbstractC0766a.a(sb.toString());
                int i4 = Build.VERSION.SDK_INT;
                int i5 = i3;
                if (i4 >= 29) {
                    AbstractC0561a.b(AbstractC0155a.O(a4), i5);
                } else {
                    String O4 = AbstractC0155a.O(a4);
                    try {
                        if (AbstractC0155a.f3602t == null) {
                            AbstractC0155a.f3602t = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        AbstractC0155a.f3602t.invoke(null, Long.valueOf(AbstractC0155a.f3599q), O4, Integer.valueOf(i5));
                    } catch (Exception e3) {
                        AbstractC0155a.A("asyncTraceEnd", e3);
                    }
                }
                try {
                    AbstractC0766a.b("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    if (fVar2 != null) {
                        try {
                            try {
                                fVar2.f3433a.D(byteBuffer2, new g(flutterJNI, i5));
                            } catch (Error e4) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() != null) {
                                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e4);
                                } else {
                                    throw e4;
                                }
                            }
                        } catch (Exception e5) {
                            Log.e("DartMessenger", "Uncaught exception in binary message listener", e5);
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i5);
                        }
                    } else {
                        flutterJNI.invokePlatformMessageEmptyResponseCallback(i5);
                    }
                    if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                        byteBuffer2.limit(0);
                    }
                    Trace.endSection();
                } finally {
                    flutterJNI.cleanupMessageData(j4);
                }
            }
        };
        if (eVar == null) {
            eVar = this.f3450t;
        }
        eVar.a(r02);
    }

    public final B1.b b(m mVar) {
        C1.j jVar = this.f3452v;
        jVar.getClass();
        i iVar = new i((ExecutorService) jVar.f168n);
        B1.b bVar = new B1.b(25);
        this.f3451u.put(bVar, iVar);
        return bVar;
    }

    @Override // g2.g
    public final void c(String str, ByteBuffer byteBuffer, g2.f fVar) {
        AbstractC0766a.b("DartMessenger#send on " + str);
        try {
            int i3 = this.f3449s;
            this.f3449s = i3 + 1;
            if (fVar != null) {
                this.f3448r.put(Integer.valueOf(i3), fVar);
            }
            FlutterJNI flutterJNI = this.f3443m;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i3);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i3);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // g2.g
    public final void f(String str, ByteBuffer byteBuffer) {
        c(str, byteBuffer, null);
    }

    @Override // g2.g
    public final B1.b i() {
        C1.j jVar = this.f3452v;
        jVar.getClass();
        i iVar = new i((ExecutorService) jVar.f168n);
        B1.b bVar = new B1.b(25);
        this.f3451u.put(bVar, iVar);
        return bVar;
    }

    @Override // g2.g
    public final void j(String str, g2.e eVar) {
        l(str, eVar, null);
    }

    @Override // g2.g
    public final void l(String str, g2.e eVar, B1.b bVar) {
        e eVar2;
        if (eVar == null) {
            synchronized (this.f3446p) {
                this.f3444n.remove(str);
            }
            return;
        }
        if (bVar != null) {
            eVar2 = (e) this.f3451u.get(bVar);
            if (eVar2 == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar2 = null;
        }
        synchronized (this.f3446p) {
            try {
                this.f3444n.put(str, new f(eVar, eVar2));
                List<d> list = (List) this.f3445o.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar : list) {
                    a(str, (f) this.f3444n.get(str), dVar.f3430a, dVar.f3431b, dVar.f3432c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
