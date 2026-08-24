package g2;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final g f5790a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5791b;

    /* renamed from: c  reason: collision with root package name */
    public final s f5792c;

    public r(g gVar, String str) {
        this(gVar, str, x.f5796a);
    }

    public final void a(String str, Object obj, R1.f fVar) {
        C0277b c0277b;
        ByteBuffer a3 = this.f5792c.a(new o(obj, str));
        if (fVar == null) {
            c0277b = null;
        } else {
            c0277b = new C0277b(1, this, fVar);
        }
        this.f5790a.c(this.f5791b, a3, c0277b);
    }

    public final void b(p pVar) {
        C0276a c0276a;
        if (pVar == null) {
            c0276a = null;
        } else {
            c0276a = new C0276a(2, this, pVar);
        }
        this.f5790a.j(this.f5791b, c0276a);
    }

    public r(g gVar, String str, s sVar) {
        this.f5790a = gVar;
        this.f5791b = str;
        this.f5792c = sVar;
    }
}
