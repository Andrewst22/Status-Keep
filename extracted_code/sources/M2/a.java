package M2;

import K2.AbstractC0092v;
import K2.C0077f;
import K2.l0;
import P2.v;
import P2.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n2.AbstractC0664g;
/* loaded from: classes.dex */
public final class a implements l0 {

    /* renamed from: m  reason: collision with root package name */
    public Object f1055m = d.f1085p;

    /* renamed from: n  reason: collision with root package name */
    public C0077f f1056n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b f1057o;

    public a(b bVar) {
        this.f1057o = bVar;
    }

    @Override // K2.l0
    public final void a(v vVar, int i3) {
        C0077f c0077f = this.f1056n;
        if (c0077f != null) {
            c0077f.a(vVar, i3);
        }
    }

    public final Object b(N2.f fVar) {
        C0077f c0077f;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f1063t;
        b bVar = this.f1057o;
        j jVar = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.r(b.f1058o.get(bVar), true)) {
                this.f1055m = d.f1081l;
                Throwable l3 = bVar.l();
                if (l3 == null) {
                    return Boolean.FALSE;
                }
                int i3 = w.f1516a;
                throw l3;
            }
            long andIncrement = b.f1059p.getAndIncrement(bVar);
            long j3 = d.f1071b;
            long j4 = andIncrement / j3;
            int i4 = (int) (andIncrement % j3);
            if (jVar.f1515o != j4) {
                j k3 = bVar.k(j4, jVar);
                if (k3 == null) {
                    continue;
                } else {
                    jVar = k3;
                }
            }
            Object A3 = bVar.A(jVar, i4, andIncrement, null);
            C1.f fVar2 = d.f1082m;
            if (A3 != fVar2) {
                C1.f fVar3 = d.f1084o;
                if (A3 == fVar3) {
                    if (andIncrement < bVar.p()) {
                        jVar.a();
                    }
                } else if (A3 == d.f1083n) {
                    b bVar2 = this.f1057o;
                    C0077f c3 = AbstractC0092v.c(AbstractC0664g.p(fVar));
                    try {
                        this.f1056n = c3;
                        c0077f = c3;
                        try {
                            Object A4 = bVar2.A(jVar, i4, andIncrement, this);
                            if (A4 == fVar2) {
                                a(jVar, i4);
                            } else {
                                P2.q qVar = null;
                                u2.i iVar = c0077f.f831q;
                                C2.l lVar = bVar2.f1068n;
                                if (A4 == fVar3) {
                                    if (andIncrement < bVar2.p()) {
                                        jVar.a();
                                    }
                                    j jVar2 = (j) b.f1063t.get(bVar2);
                                    while (true) {
                                        if (bVar2.r(b.f1058o.get(bVar2), true)) {
                                            C0077f c0077f2 = this.f1056n;
                                            D2.i.b(c0077f2);
                                            this.f1056n = null;
                                            this.f1055m = d.f1081l;
                                            Throwable l4 = bVar.l();
                                            if (l4 == null) {
                                                c0077f2.k(Boolean.FALSE);
                                            } else {
                                                c0077f2.k(AbstractC0664g.f(l4));
                                            }
                                        } else {
                                            long andIncrement2 = b.f1059p.getAndIncrement(bVar2);
                                            long j5 = d.f1071b;
                                            long j6 = andIncrement2 / j5;
                                            int i5 = (int) (andIncrement2 % j5);
                                            if (jVar2.f1515o != j6) {
                                                j k4 = bVar2.k(j6, jVar2);
                                                if (k4 != null) {
                                                    jVar2 = k4;
                                                }
                                            }
                                            C2.l lVar2 = lVar;
                                            Object A5 = bVar2.A(jVar2, i5, andIncrement2, this);
                                            if (A5 == d.f1082m) {
                                                a(jVar2, i5);
                                                break;
                                            } else if (A5 == d.f1084o) {
                                                if (andIncrement2 < bVar2.p()) {
                                                    jVar2.a();
                                                }
                                                lVar = lVar2;
                                            } else if (A5 != d.f1083n) {
                                                jVar2.a();
                                                this.f1055m = A5;
                                                this.f1056n = null;
                                                bool = Boolean.TRUE;
                                                if (lVar2 != null) {
                                                    qVar = new P2.q(lVar2, A5, iVar);
                                                }
                                            } else {
                                                throw new IllegalStateException("unexpected");
                                            }
                                        }
                                    }
                                } else {
                                    jVar.a();
                                    this.f1055m = A4;
                                    this.f1056n = null;
                                    bool = Boolean.TRUE;
                                    if (lVar != null) {
                                        qVar = new P2.q(lVar, A4, iVar);
                                    }
                                }
                                c0077f.l(bool, qVar);
                            }
                            return c0077f.u();
                        } catch (Throwable th) {
                            th = th;
                            c0077f.B();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c0077f = c3;
                    }
                } else {
                    jVar.a();
                    this.f1055m = A3;
                    return Boolean.TRUE;
                }
            } else {
                throw new IllegalStateException("unreachable");
            }
        }
    }
}
