package c1;

import R.C0112o;
import java.util.Arrays;
/* renamed from: c1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238e implements InterfaceC0241h {

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f4854w = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4855a;

    /* renamed from: d  reason: collision with root package name */
    public final String f4858d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4859e;

    /* renamed from: f  reason: collision with root package name */
    public String f4860f;

    /* renamed from: g  reason: collision with root package name */
    public w0.G f4861g;

    /* renamed from: h  reason: collision with root package name */
    public w0.G f4862h;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4866l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4867m;

    /* renamed from: p  reason: collision with root package name */
    public int f4870p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4871q;

    /* renamed from: s  reason: collision with root package name */
    public int f4873s;

    /* renamed from: u  reason: collision with root package name */
    public w0.G f4875u;

    /* renamed from: v  reason: collision with root package name */
    public long f4876v;

    /* renamed from: b  reason: collision with root package name */
    public final U.s f4856b = new U.s(new byte[7], 7);

    /* renamed from: c  reason: collision with root package name */
    public final U.t f4857c = new U.t(Arrays.copyOf(f4854w, 10));

    /* renamed from: i  reason: collision with root package name */
    public int f4863i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f4864j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f4865k = 256;

    /* renamed from: n  reason: collision with root package name */
    public int f4868n = -1;

    /* renamed from: o  reason: collision with root package name */
    public int f4869o = -1;

    /* renamed from: r  reason: collision with root package name */
    public long f4872r = -9223372036854775807L;

    /* renamed from: t  reason: collision with root package name */
    public long f4874t = -9223372036854775807L;

    public C0238e(int i3, String str, boolean z3) {
        this.f4855a = z3;
        this.f4858d = str;
        this.f4859e = i3;
    }

    @Override // c1.InterfaceC0241h
    public final void a() {
        this.f4874t = -9223372036854775807L;
        this.f4867m = false;
        this.f4863i = 0;
        this.f4864j = 0;
        this.f4865k = 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f4  */
    @Override // c1.InterfaceC0241h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(U.t r24) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C0238e.d(U.t):void");
    }

    @Override // c1.InterfaceC0241h
    public final void f(long j3, int i3) {
        this.f4874t = j3;
    }

    @Override // c1.InterfaceC0241h
    public final void g(w0.q qVar, C0232F c0232f) {
        c0232f.a();
        c0232f.c();
        this.f4860f = (String) c0232f.f4821e;
        c0232f.c();
        w0.G w3 = qVar.w(c0232f.f4819c, 1);
        this.f4861g = w3;
        this.f4875u = w3;
        if (this.f4855a) {
            c0232f.a();
            c0232f.c();
            w0.G w4 = qVar.w(c0232f.f4819c, 5);
            this.f4862h = w4;
            C0112o c0112o = new C0112o();
            c0232f.c();
            c0112o.f1926a = (String) c0232f.f4821e;
            c0112o.f1937l = R.G.l("application/id3");
            D2.h.p(c0112o, w4);
            return;
        }
        this.f4862h = new w0.n();
    }

    @Override // c1.InterfaceC0241h
    public final void e(boolean z3) {
    }
}
