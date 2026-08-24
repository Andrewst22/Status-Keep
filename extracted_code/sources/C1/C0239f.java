package c1;

import R.C0112o;
import R.C0113p;
import java.util.concurrent.atomic.AtomicInteger;
import w0.C0891a;
/* renamed from: c1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239f implements InterfaceC0241h {

    /* renamed from: a  reason: collision with root package name */
    public final U.t f4877a;

    /* renamed from: c  reason: collision with root package name */
    public final String f4879c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4880d;

    /* renamed from: e  reason: collision with root package name */
    public String f4881e;

    /* renamed from: f  reason: collision with root package name */
    public w0.G f4882f;

    /* renamed from: h  reason: collision with root package name */
    public int f4884h;

    /* renamed from: i  reason: collision with root package name */
    public int f4885i;

    /* renamed from: j  reason: collision with root package name */
    public long f4886j;

    /* renamed from: k  reason: collision with root package name */
    public C0113p f4887k;

    /* renamed from: l  reason: collision with root package name */
    public int f4888l;

    /* renamed from: m  reason: collision with root package name */
    public int f4889m;

    /* renamed from: g  reason: collision with root package name */
    public int f4883g = 0;

    /* renamed from: p  reason: collision with root package name */
    public long f4892p = -9223372036854775807L;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f4878b = new AtomicInteger();

    /* renamed from: n  reason: collision with root package name */
    public int f4890n = -1;

    /* renamed from: o  reason: collision with root package name */
    public int f4891o = -1;

    public C0239f(int i3, int i4, String str) {
        this.f4877a = new U.t(new byte[i4]);
        this.f4879c = str;
        this.f4880d = i3;
    }

    @Override // c1.InterfaceC0241h
    public final void a() {
        this.f4883g = 0;
        this.f4884h = 0;
        this.f4885i = 0;
        this.f4892p = -9223372036854775807L;
        this.f4878b.set(0);
    }

    public final boolean b(U.t tVar, byte[] bArr, int i3) {
        int min = Math.min(tVar.a(), i3 - this.f4884h);
        tVar.f(bArr, this.f4884h, min);
        int i4 = this.f4884h + min;
        this.f4884h = i4;
        if (i4 == i3) {
            return true;
        }
        return false;
    }

    public final void c(C0891a c0891a) {
        int i3;
        C0112o a3;
        int i4 = c0891a.f9530b;
        if (i4 != -2147483647 && (i3 = c0891a.f9531c) != -1) {
            C0113p c0113p = this.f4887k;
            String str = c0891a.f9529a;
            if (c0113p == null || i3 != c0113p.f1951A || i4 != c0113p.f1952B || !str.equals(c0113p.f1974m)) {
                C0113p c0113p2 = this.f4887k;
                if (c0113p2 == null) {
                    a3 = new C0112o();
                } else {
                    a3 = c0113p2.a();
                }
                a3.f1926a = this.f4881e;
                a3.f1937l = R.G.l(str);
                a3.f1950z = i3;
                a3.f1917A = i4;
                a3.f1929d = this.f4879c;
                a3.f1931f = this.f4880d;
                C0113p c0113p3 = new C0113p(a3);
                this.f4887k = c0113p3;
                this.f4882f.c(c0113p3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04ab  */
    @Override // c1.InterfaceC0241h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(U.t r38) {
        /*
            Method dump skipped, instructions count: 1412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C0239f.d(U.t):void");
    }

    @Override // c1.InterfaceC0241h
    public final void f(long j3, int i3) {
        this.f4892p = j3;
    }

    @Override // c1.InterfaceC0241h
    public final void g(w0.q qVar, C0232F c0232f) {
        c0232f.a();
        c0232f.c();
        this.f4881e = (String) c0232f.f4821e;
        c0232f.c();
        this.f4882f = qVar.w(c0232f.f4819c, 1);
    }

    @Override // c1.InterfaceC0241h
    public final void e(boolean z3) {
    }
}
