package o0;
/* renamed from: o0.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0695t extends AbstractC0692p {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f8642e = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Object f8643c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f8644d;

    public C0695t(R.T t3, Object obj, Object obj2) {
        super(t3);
        this.f8643c = obj;
        this.f8644d = obj2;
    }

    @Override // o0.AbstractC0692p, R.T
    public final int b(Object obj) {
        Object obj2;
        if (f8642e.equals(obj) && (obj2 = this.f8644d) != null) {
            obj = obj2;
        }
        return this.f8627b.b(obj);
    }

    @Override // o0.AbstractC0692p, R.T
    public final R.Q f(int i3, R.Q q3, boolean z3) {
        this.f8627b.f(i3, q3, z3);
        if (U.A.a(q3.f1796b, this.f8644d) && z3) {
            q3.f1796b = f8642e;
        }
        return q3;
    }

    @Override // o0.AbstractC0692p, R.T
    public final Object l(int i3) {
        Object l3 = this.f8627b.l(i3);
        if (U.A.a(l3, this.f8644d)) {
            return f8642e;
        }
        return l3;
    }

    @Override // o0.AbstractC0692p, R.T
    public final R.S m(int i3, R.S s3, long j3) {
        this.f8627b.m(i3, s3, j3);
        if (U.A.a(s3.f1804a, this.f8643c)) {
            s3.f1804a = R.S.f1802q;
        }
        return s3;
    }
}
