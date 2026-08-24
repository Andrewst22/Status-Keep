package R0;

import U.t;
import w0.G;
import w0.q;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b  reason: collision with root package name */
    public G f2046b;

    /* renamed from: c  reason: collision with root package name */
    public q f2047c;

    /* renamed from: d  reason: collision with root package name */
    public g f2048d;

    /* renamed from: e  reason: collision with root package name */
    public long f2049e;

    /* renamed from: f  reason: collision with root package name */
    public long f2050f;

    /* renamed from: g  reason: collision with root package name */
    public long f2051g;

    /* renamed from: h  reason: collision with root package name */
    public int f2052h;

    /* renamed from: i  reason: collision with root package name */
    public int f2053i;

    /* renamed from: k  reason: collision with root package name */
    public long f2055k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2056l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2057m;

    /* renamed from: a  reason: collision with root package name */
    public final e f2045a = new e(0);

    /* renamed from: j  reason: collision with root package name */
    public B1.a f2054j = new B1.a(6, false);

    public void a(long j3) {
        this.f2051g = j3;
    }

    public abstract long b(t tVar);

    public abstract boolean c(t tVar, long j3, B1.a aVar);

    public void d(boolean z3) {
        if (z3) {
            this.f2054j = new B1.a(6, false);
            this.f2050f = 0L;
            this.f2052h = 0;
        } else {
            this.f2052h = 1;
        }
        this.f2049e = -1L;
        this.f2051g = 0L;
    }
}
