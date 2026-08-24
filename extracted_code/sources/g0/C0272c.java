package g0;

import T0.l;
import U.AbstractC0123a;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
/* renamed from: g0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272c implements T0.e, X.c {

    /* renamed from: a  reason: collision with root package name */
    public final X.h f5702a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5703b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque f5704c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f5705d;

    /* renamed from: e  reason: collision with root package name */
    public final X.f[] f5706e;

    /* renamed from: f  reason: collision with root package name */
    public final X.g[] f5707f;

    /* renamed from: g  reason: collision with root package name */
    public int f5708g;

    /* renamed from: h  reason: collision with root package name */
    public int f5709h;

    /* renamed from: i  reason: collision with root package name */
    public X.f f5710i;

    /* renamed from: j  reason: collision with root package name */
    public X.d f5711j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5712k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5713l;

    /* renamed from: m  reason: collision with root package name */
    public long f5714m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f5715n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f5716o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0272c(l lVar) {
        this(new T0.i[2], new T0.c[2]);
        this.f5715n = 1;
        int i3 = this.f5708g;
        X.f[] fVarArr = this.f5706e;
        AbstractC0123a.j(i3 == fVarArr.length);
        for (X.f fVar : fVarArr) {
            fVar.h(1024);
        }
        this.f5716o = lVar;
    }

    @Override // X.c
    public final Object d() {
        boolean z3;
        X.f fVar;
        synchronized (this.f5703b) {
            try {
                X.d dVar = this.f5711j;
                if (dVar == null) {
                    if (this.f5710i == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    AbstractC0123a.j(z3);
                    int i3 = this.f5708g;
                    if (i3 == 0) {
                        fVar = null;
                    } else {
                        X.f[] fVarArr = this.f5706e;
                        int i4 = i3 - 1;
                        this.f5708g = i4;
                        fVar = fVarArr[i4];
                    }
                    this.f5710i = fVar;
                } else {
                    throw dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @Override // X.c
    public final void e(long j3) {
        boolean z3;
        synchronized (this.f5703b) {
            try {
                if (this.f5708g != this.f5706e.length && !this.f5712k) {
                    z3 = false;
                    AbstractC0123a.j(z3);
                    this.f5714m = j3;
                }
                z3 = true;
                AbstractC0123a.j(z3);
                this.f5714m = j3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception, X.d] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Exception, X.d] */
    public final X.d f(Throwable th) {
        switch (this.f5715n) {
            case 0:
                return new Exception("Unexpected decode error", th);
            default:
                return new Exception("Unexpected decode error", th);
        }
    }

    @Override // X.c
    public final void flush() {
        synchronized (this.f5703b) {
            try {
                this.f5712k = true;
                X.f fVar = this.f5710i;
                if (fVar != null) {
                    fVar.e();
                    int i3 = this.f5708g;
                    this.f5708g = i3 + 1;
                    this.f5706e[i3] = fVar;
                    this.f5710i = null;
                }
                while (!this.f5704c.isEmpty()) {
                    X.f fVar2 = (X.f) this.f5704c.removeFirst();
                    fVar2.e();
                    int i4 = this.f5708g;
                    this.f5708g = i4 + 1;
                    this.f5706e[i4] = fVar2;
                }
                while (!this.f5705d.isEmpty()) {
                    ((X.g) this.f5705d.removeFirst()).f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final X.d g(X.f fVar, X.g gVar, boolean z3) {
        boolean z4;
        switch (this.f5715n) {
            case 0:
                C0270a c0270a = (C0270a) gVar;
                try {
                    ByteBuffer byteBuffer = fVar.f2934q;
                    byteBuffer.getClass();
                    AbstractC0123a.j(byteBuffer.hasArray());
                    if (byteBuffer.arrayOffset() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    AbstractC0123a.e(z4);
                    byte[] array = byteBuffer.array();
                    int remaining = byteBuffer.remaining();
                    ((C0271b) this.f5716o).getClass();
                    c0270a.f5699q = C0271b.a(array, remaining);
                    c0270a.f2939o = fVar.f2936s;
                    return null;
                } catch (e e2) {
                    return e2;
                }
            default:
                T0.i iVar = (T0.i) fVar;
                T0.c cVar = (T0.c) gVar;
                try {
                    ByteBuffer byteBuffer2 = iVar.f2934q;
                    byteBuffer2.getClass();
                    byte[] array2 = byteBuffer2.array();
                    int limit = byteBuffer2.limit();
                    l lVar = (l) this.f5716o;
                    if (z3) {
                        lVar.b();
                    }
                    T0.d r3 = lVar.r(array2, 0, limit);
                    long j3 = iVar.f2936s;
                    long j4 = iVar.f2320v;
                    cVar.f2939o = j3;
                    cVar.f2304q = r3;
                    if (j4 != Long.MAX_VALUE) {
                        j3 = j4;
                    }
                    cVar.f2305r = j3;
                    cVar.f2940p = false;
                    return null;
                } catch (T0.f e3) {
                    return e3;
                }
        }
    }

    public final boolean h() {
        X.d f3;
        boolean z3;
        synchronized (this.f5703b) {
            while (!this.f5713l) {
                try {
                    if (!this.f5704c.isEmpty() && this.f5709h > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        break;
                    }
                    this.f5703b.wait();
                } finally {
                }
            }
            if (this.f5713l) {
                return false;
            }
            X.f fVar = (X.f) this.f5704c.removeFirst();
            X.g[] gVarArr = this.f5707f;
            int i3 = this.f5709h - 1;
            this.f5709h = i3;
            X.g gVar = gVarArr[i3];
            boolean z4 = this.f5712k;
            this.f5712k = false;
            if (fVar.c(4)) {
                gVar.a(4);
            } else {
                gVar.f2939o = fVar.f2936s;
                if (fVar.c(134217728)) {
                    gVar.a(134217728);
                }
                if (!j(fVar.f2936s)) {
                    gVar.f2940p = true;
                }
                try {
                    f3 = g(fVar, gVar, z4);
                } catch (OutOfMemoryError e2) {
                    f3 = f(e2);
                } catch (RuntimeException e3) {
                    f3 = f(e3);
                }
                if (f3 != null) {
                    synchronized (this.f5703b) {
                        this.f5711j = f3;
                    }
                    return false;
                }
            }
            synchronized (this.f5703b) {
                try {
                    if (this.f5712k) {
                        gVar.f();
                    } else if (gVar.f2940p) {
                        gVar.f();
                    } else {
                        this.f5705d.addLast(gVar);
                    }
                    fVar.e();
                    int i4 = this.f5708g;
                    this.f5708g = i4 + 1;
                    this.f5706e[i4] = fVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // X.c
    /* renamed from: i */
    public final X.g c() {
        synchronized (this.f5703b) {
            try {
                X.d dVar = this.f5711j;
                if (dVar == null) {
                    if (this.f5705d.isEmpty()) {
                        return null;
                    }
                    return (X.g) this.f5705d.removeFirst();
                }
                throw dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(long j3) {
        boolean z3;
        synchronized (this.f5703b) {
            long j4 = this.f5714m;
            if (j4 != -9223372036854775807L && j3 < j4) {
                z3 = false;
            }
            z3 = true;
        }
        return z3;
    }

    @Override // X.c
    /* renamed from: k */
    public final void a(X.f fVar) {
        boolean z3;
        synchronized (this.f5703b) {
            try {
                X.d dVar = this.f5711j;
                if (dVar == null) {
                    if (fVar == this.f5710i) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    AbstractC0123a.e(z3);
                    this.f5704c.addLast(fVar);
                    if (!this.f5704c.isEmpty() && this.f5709h > 0) {
                        this.f5703b.notify();
                    }
                    this.f5710i = null;
                } else {
                    throw dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(X.g gVar) {
        synchronized (this.f5703b) {
            gVar.e();
            int i3 = this.f5709h;
            this.f5709h = i3 + 1;
            this.f5707f[i3] = gVar;
            if (!this.f5704c.isEmpty() && this.f5709h > 0) {
                this.f5703b.notify();
            }
        }
    }

    @Override // X.c
    public final void release() {
        synchronized (this.f5703b) {
            this.f5713l = true;
            this.f5703b.notify();
        }
        try {
            this.f5702a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public C0272c(X.f[] fVarArr, X.g[] gVarArr) {
        X.g c0270a;
        X.f fVar;
        this.f5703b = new Object();
        this.f5714m = -9223372036854775807L;
        this.f5704c = new ArrayDeque();
        this.f5705d = new ArrayDeque();
        this.f5706e = fVarArr;
        this.f5708g = fVarArr.length;
        for (int i3 = 0; i3 < this.f5708g; i3++) {
            X.f[] fVarArr2 = this.f5706e;
            switch (this.f5715n) {
                case 0:
                    fVar = new X.f(1);
                    break;
                default:
                    fVar = new X.f(1);
                    break;
            }
            fVarArr2[i3] = fVar;
        }
        this.f5707f = gVarArr;
        this.f5709h = gVarArr.length;
        for (int i4 = 0; i4 < this.f5709h; i4++) {
            X.g[] gVarArr2 = this.f5707f;
            switch (this.f5715n) {
                case 0:
                    c0270a = new C0270a(this);
                    break;
                default:
                    c0270a = new T0.c(this);
                    break;
            }
            gVarArr2[i4] = c0270a;
        }
        X.h hVar = new X.h(this);
        this.f5702a = hVar;
        hVar.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0272c(C0271b c0271b) {
        this(new X.f[1], new C0270a[1]);
        this.f5715n = 0;
        this.f5716o = c0271b;
    }

    @Override // T0.e
    public void b(long j3) {
    }
}
