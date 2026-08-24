package c1;

import U.AbstractC0123a;
import Y.J;
/* renamed from: c1.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246m implements InterfaceC0241h {

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f4936l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final C0229C f4937a;

    /* renamed from: b  reason: collision with root package name */
    public final U.t f4938b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean[] f4939c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    public final C0244k f4940d;

    /* renamed from: e  reason: collision with root package name */
    public final J f4941e;

    /* renamed from: f  reason: collision with root package name */
    public C0245l f4942f;

    /* renamed from: g  reason: collision with root package name */
    public long f4943g;

    /* renamed from: h  reason: collision with root package name */
    public String f4944h;

    /* renamed from: i  reason: collision with root package name */
    public w0.G f4945i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4946j;

    /* renamed from: k  reason: collision with root package name */
    public long f4947k;

    /* JADX WARN: Type inference failed for: r3v3, types: [c1.k, java.lang.Object] */
    public C0246m(C0229C c0229c) {
        this.f4937a = c0229c;
        ?? obj = new Object();
        obj.f4927e = new byte[128];
        this.f4940d = obj;
        this.f4947k = -9223372036854775807L;
        this.f4941e = new J(178);
        this.f4938b = new U.t();
    }

    @Override // c1.InterfaceC0241h
    public final void a() {
        V.g.a(this.f4939c);
        C0244k c0244k = this.f4940d;
        c0244k.f4923a = false;
        c0244k.f4925c = 0;
        c0244k.f4924b = 0;
        C0245l c0245l = this.f4942f;
        if (c0245l != null) {
            c0245l.f4929b = false;
            c0245l.f4930c = false;
            c0245l.f4931d = false;
            c0245l.f4932e = -1;
        }
        J j3 = this.f4941e;
        if (j3 != null) {
            j3.d();
        }
        this.f4943g = 0L;
        this.f4947k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024c  */
    @Override // c1.InterfaceC0241h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(U.t r19) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C0246m.d(U.t):void");
    }

    @Override // c1.InterfaceC0241h
    public final void e(boolean z3) {
        AbstractC0123a.k(this.f4942f);
        if (z3) {
            this.f4942f.b(0, this.f4943g, this.f4946j);
            C0245l c0245l = this.f4942f;
            c0245l.f4929b = false;
            c0245l.f4930c = false;
            c0245l.f4931d = false;
            c0245l.f4932e = -1;
        }
    }

    @Override // c1.InterfaceC0241h
    public final void f(long j3, int i3) {
        this.f4947k = j3;
    }

    @Override // c1.InterfaceC0241h
    public final void g(w0.q qVar, C0232F c0232f) {
        c0232f.a();
        c0232f.c();
        this.f4944h = (String) c0232f.f4821e;
        c0232f.c();
        w0.G w3 = qVar.w(c0232f.f4819c, 2);
        this.f4945i = w3;
        this.f4942f = new C0245l(w3);
        this.f4937a.b(qVar, c0232f);
    }
}
