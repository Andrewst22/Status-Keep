package c1;

import R.C0112o;
import R.C0113p;
import U.AbstractC0123a;
import java.util.List;
import w0.AbstractC0892b;
/* renamed from: c1.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229C {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4792a;

    /* renamed from: b  reason: collision with root package name */
    public final List f4793b;

    /* renamed from: c  reason: collision with root package name */
    public final w0.G[] f4794c;

    public C0229C(int i3, List list) {
        this.f4792a = i3;
        switch (i3) {
            case 1:
                this.f4793b = list;
                this.f4794c = new w0.G[list.size()];
                return;
            default:
                this.f4793b = list;
                this.f4794c = new w0.G[list.size()];
                return;
        }
    }

    public void a(long j3, U.t tVar) {
        if (tVar.a() < 9) {
            return;
        }
        int h3 = tVar.h();
        int h4 = tVar.h();
        int u3 = tVar.u();
        if (h3 == 434 && h4 == 1195456820 && u3 == 3) {
            AbstractC0892b.g(j3, tVar, this.f4794c);
        }
    }

    public final void b(w0.q qVar, C0232F c0232f) {
        boolean z3;
        boolean z4;
        switch (this.f4792a) {
            case 0:
                int i3 = 0;
                while (true) {
                    w0.G[] gArr = this.f4794c;
                    if (i3 < gArr.length) {
                        c0232f.a();
                        c0232f.c();
                        w0.G w3 = qVar.w(c0232f.f4819c, 3);
                        C0113p c0113p = (C0113p) this.f4793b.get(i3);
                        String str = c0113p.f1974m;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        AbstractC0123a.d("Invalid closed caption MIME type provided: " + str, z3);
                        String str2 = c0113p.f1962a;
                        if (str2 == null) {
                            c0232f.c();
                            str2 = (String) c0232f.f4821e;
                        }
                        C0112o c0112o = new C0112o();
                        c0112o.f1926a = str2;
                        c0112o.f1937l = R.G.l(str);
                        c0112o.f1930e = c0113p.f1966e;
                        c0112o.f1929d = c0113p.f1965d;
                        c0112o.f1921E = c0113p.f1956F;
                        c0112o.f1940o = c0113p.f1977p;
                        D2.h.p(c0112o, w3);
                        gArr[i3] = w3;
                        i3++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i4 = 0;
                while (true) {
                    w0.G[] gArr2 = this.f4794c;
                    if (i4 < gArr2.length) {
                        c0232f.a();
                        c0232f.c();
                        w0.G w4 = qVar.w(c0232f.f4819c, 3);
                        C0113p c0113p2 = (C0113p) this.f4793b.get(i4);
                        String str3 = c0113p2.f1974m;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        AbstractC0123a.d("Invalid closed caption MIME type provided: " + str3, z4);
                        C0112o c0112o2 = new C0112o();
                        c0232f.c();
                        c0112o2.f1926a = (String) c0232f.f4821e;
                        c0112o2.f1937l = R.G.l(str3);
                        c0112o2.f1930e = c0113p2.f1966e;
                        c0112o2.f1929d = c0113p2.f1965d;
                        c0112o2.f1921E = c0113p2.f1956F;
                        c0112o2.f1940o = c0113p2.f1977p;
                        D2.h.p(c0112o2, w4);
                        gArr2[i4] = w4;
                        i4++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
