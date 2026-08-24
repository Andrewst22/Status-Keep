package X1;

import R.J;
import U.v;
import Y.M;
import Y.Q;
import Y.m0;
/* loaded from: classes.dex */
public final class f implements Q {

    /* renamed from: m  reason: collision with root package name */
    public boolean f3007m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3008n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f3009o;

    /* renamed from: p  reason: collision with root package name */
    public Object f3010p;

    /* renamed from: q  reason: collision with root package name */
    public Object f3011q;

    /* renamed from: r  reason: collision with root package name */
    public Object f3012r;

    public f(M m3, v vVar) {
        this.f3010p = m3;
        this.f3009o = new m0(vVar);
        this.f3007m = true;
    }

    @Override // Y.Q
    public J a() {
        Q q3 = (Q) this.f3012r;
        if (q3 != null) {
            return q3.a();
        }
        return ((m0) this.f3009o).f3371q;
    }

    @Override // Y.Q
    public void b(J j3) {
        Q q3 = (Q) this.f3012r;
        if (q3 != null) {
            q3.b(j3);
            j3 = ((Q) this.f3012r).a();
        }
        ((m0) this.f3009o).b(j3);
    }

    @Override // Y.Q
    public boolean c() {
        if (this.f3007m) {
            ((m0) this.f3009o).getClass();
            return false;
        }
        Q q3 = (Q) this.f3012r;
        q3.getClass();
        return q3.c();
    }

    @Override // Y.Q
    public long e() {
        if (this.f3007m) {
            return ((m0) this.f3009o).e();
        }
        Q q3 = (Q) this.f3012r;
        q3.getClass();
        return q3.e();
    }

    public f(W1.d dVar) {
        this.f3007m = true;
        this.f3008n = false;
        this.f3009o = dVar;
    }
}
