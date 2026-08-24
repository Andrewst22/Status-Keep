package d0;

import R.C0113p;
import U.A;
import Y.U;
import Y.Z;
import Y.a0;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o0.C0674C;
import o0.C0701z;
import o0.RunnableC0673B;
import o0.r;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f5148a;

    /* renamed from: b  reason: collision with root package name */
    public final C0701z f5149b;

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f5150c;

    public /* synthetic */ d(CopyOnWriteArrayList copyOnWriteArrayList, int i3, C0701z c0701z) {
        this.f5150c = copyOnWriteArrayList;
        this.f5148a = i3;
        this.f5149b = c0701z;
    }

    public void a(int i3, C0113p c0113p, int i4, Object obj, long j3) {
        b(new l0.g(1, i3, c0113p, i4, obj, A.Z(j3), -9223372036854775807L));
    }

    public void b(l0.g gVar) {
        Iterator it = this.f5150c.iterator();
        while (it.hasNext()) {
            C0674C c0674c = (C0674C) it.next();
            A.Q(c0674c.f8415a, new U(this, c0674c.f8416b, gVar, 2));
        }
    }

    public void c(r rVar, int i3, int i4, C0113p c0113p, int i5, Object obj, long j3, long j4) {
        d(rVar, new l0.g(i3, i4, c0113p, i5, obj, A.Z(j3), A.Z(j4)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [o0.D, java.lang.Object] */
    public void d(r rVar, l0.g gVar) {
        Iterator it = this.f5150c.iterator();
        while (it.hasNext()) {
            C0674C c0674c = (C0674C) it.next();
            A.Q(c0674c.f8415a, new RunnableC0673B(this, c0674c.f8416b, rVar, gVar, 2));
        }
    }

    public void e(r rVar, int i3) {
        f(rVar, i3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void f(r rVar, int i3, int i4, C0113p c0113p, int i5, Object obj, long j3, long j4) {
        g(rVar, new l0.g(i3, i4, c0113p, i5, obj, A.Z(j3), A.Z(j4)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [o0.D, java.lang.Object] */
    public void g(r rVar, l0.g gVar) {
        Iterator it = this.f5150c.iterator();
        while (it.hasNext()) {
            C0674C c0674c = (C0674C) it.next();
            A.Q(c0674c.f8415a, new RunnableC0673B(this, c0674c.f8416b, rVar, gVar, 1));
        }
    }

    public void h(r rVar, int i3, int i4, C0113p c0113p, int i5, Object obj, long j3, long j4, IOException iOException, boolean z3) {
        j(rVar, new l0.g(i3, i4, c0113p, i5, obj, A.Z(j3), A.Z(j4)), iOException, z3);
    }

    public void i(r rVar, int i3, IOException iOException, boolean z3) {
        h(rVar, i3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z3);
    }

    public void j(r rVar, l0.g gVar, IOException iOException, boolean z3) {
        Iterator it = this.f5150c.iterator();
        while (it.hasNext()) {
            C0674C c0674c = (C0674C) it.next();
            A.Q(c0674c.f8415a, new a0(this, c0674c.f8416b, rVar, gVar, iOException, z3, 1));
        }
    }

    public void k(r rVar, int i3, int i4, C0113p c0113p, int i5, Object obj, long j3, long j4) {
        l(rVar, new l0.g(i3, i4, c0113p, i5, obj, A.Z(j3), A.Z(j4)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [o0.D, java.lang.Object] */
    public void l(r rVar, l0.g gVar) {
        Iterator it = this.f5150c.iterator();
        while (it.hasNext()) {
            C0674C c0674c = (C0674C) it.next();
            A.Q(c0674c.f8415a, new RunnableC0673B(this, c0674c.f8416b, rVar, gVar, 0));
        }
    }

    public void m(l0.g gVar) {
        C0701z c0701z = this.f5149b;
        c0701z.getClass();
        Iterator it = this.f5150c.iterator();
        while (it.hasNext()) {
            C0674C c0674c = (C0674C) it.next();
            A.Q(c0674c.f8415a, new Z(this, c0674c.f8416b, c0701z, gVar, 3));
        }
    }
}
