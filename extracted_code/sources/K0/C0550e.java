package k0;

import Y.U;
import a.AbstractC0155a;
import android.os.Handler;
import g2.C0276a;
/* renamed from: k0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0550e implements s0.k {

    /* renamed from: m  reason: collision with root package name */
    public final int f7565m;

    /* renamed from: n  reason: collision with root package name */
    public final v f7566n;

    /* renamed from: o  reason: collision with root package name */
    public final B0.a f7567o;

    /* renamed from: p  reason: collision with root package name */
    public final C0276a f7568p;

    /* renamed from: r  reason: collision with root package name */
    public final e0.l f7570r;

    /* renamed from: s  reason: collision with root package name */
    public InterfaceC0549d f7571s;

    /* renamed from: t  reason: collision with root package name */
    public C0551f f7572t;

    /* renamed from: u  reason: collision with root package name */
    public w0.l f7573u;

    /* renamed from: v  reason: collision with root package name */
    public volatile boolean f7574v;
    public volatile long x;

    /* renamed from: q  reason: collision with root package name */
    public final Handler f7569q = U.A.n(null);

    /* renamed from: w  reason: collision with root package name */
    public volatile long f7575w = -9223372036854775807L;

    public C0550e(int i3, v vVar, B0.a aVar, C0276a c0276a, e0.l lVar) {
        this.f7565m = i3;
        this.f7566n = vVar;
        this.f7567o = aVar;
        this.f7568p = c0276a;
        this.f7570r = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [R.r, java.lang.Object] */
    @Override // s0.k
    public final void b() {
        if (this.f7574v) {
            this.f7574v = false;
        }
        try {
            if (this.f7571s == null) {
                InterfaceC0549d p3 = this.f7570r.p(this.f7565m);
                this.f7571s = p3;
                this.f7569q.post(new U(this, p3.f(), this.f7571s, 1));
                InterfaceC0549d interfaceC0549d = this.f7571s;
                interfaceC0549d.getClass();
                this.f7573u = new w0.l(interfaceC0549d, 0L, -1L);
                C0551f c0551f = new C0551f(this.f7566n.f7676a, this.f7565m);
                this.f7572t = c0551f;
                c0551f.h(this.f7568p);
            }
            while (!this.f7574v) {
                if (this.f7575w != -9223372036854775807L) {
                    C0551f c0551f2 = this.f7572t;
                    c0551f2.getClass();
                    c0551f2.b(this.x, this.f7575w);
                    this.f7575w = -9223372036854775807L;
                }
                C0551f c0551f3 = this.f7572t;
                c0551f3.getClass();
                w0.l lVar = this.f7573u;
                lVar.getClass();
                if (c0551f3.f(lVar, new Object()) == -1) {
                    break;
                }
            }
            this.f7574v = false;
            InterfaceC0549d interfaceC0549d2 = this.f7571s;
            interfaceC0549d2.getClass();
            if (interfaceC0549d2.g()) {
                AbstractC0155a.r(this.f7571s);
                this.f7571s = null;
            }
        } catch (Throwable th) {
            InterfaceC0549d interfaceC0549d3 = this.f7571s;
            interfaceC0549d3.getClass();
            if (interfaceC0549d3.g()) {
                AbstractC0155a.r(this.f7571s);
                this.f7571s = null;
            }
            throw th;
        }
    }

    @Override // s0.k
    public final void c() {
        this.f7574v = true;
    }
}
