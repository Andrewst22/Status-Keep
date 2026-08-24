package y0;

import D1.G;
import D1.I;
import D1.b0;
import U.A;
import U.t;
import i1.C0308g;
import java.util.List;
import t0.C0816a;
import w0.l;
import w0.o;
import w0.p;
import w0.q;
/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a  reason: collision with root package name */
    public final t f9701a;

    /* renamed from: b  reason: collision with root package name */
    public final C0308g f9702b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9703c;

    /* renamed from: d  reason: collision with root package name */
    public final B1.b f9704d;

    /* renamed from: e  reason: collision with root package name */
    public int f9705e;

    /* renamed from: f  reason: collision with root package name */
    public q f9706f;

    /* renamed from: g  reason: collision with root package name */
    public c f9707g;

    /* renamed from: h  reason: collision with root package name */
    public long f9708h;

    /* renamed from: i  reason: collision with root package name */
    public e[] f9709i;

    /* renamed from: j  reason: collision with root package name */
    public long f9710j;

    /* renamed from: k  reason: collision with root package name */
    public e f9711k;

    /* renamed from: l  reason: collision with root package name */
    public int f9712l;

    /* renamed from: m  reason: collision with root package name */
    public long f9713m;

    /* renamed from: n  reason: collision with root package name */
    public long f9714n;

    /* renamed from: o  reason: collision with root package name */
    public int f9715o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f9716p;

    /* JADX WARN: Type inference failed for: r2v3, types: [i1.g, java.lang.Object] */
    public b(int i3, B1.b bVar) {
        this.f9704d = bVar;
        this.f9703c = (i3 & 1) == 0;
        this.f9701a = new t(12);
        this.f9702b = new Object();
        this.f9706f = new C0816a(5);
        this.f9709i = new e[0];
        this.f9713m = -1L;
        this.f9714n = -1L;
        this.f9712l = -1;
        this.f9708h = -9223372036854775807L;
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        e[] eVarArr;
        this.f9710j = -1L;
        this.f9711k = null;
        for (e eVar : this.f9709i) {
            if (eVar.f9734j == 0) {
                eVar.f9732h = 0;
            } else {
                eVar.f9732h = eVar.f9736l[A.f(eVar.f9735k, j3, true)];
            }
        }
        if (j3 == 0) {
            if (this.f9709i.length == 0) {
                this.f9705e = 0;
                return;
            } else {
                this.f9705e = 3;
                return;
            }
        }
        this.f9705e = 6;
    }

    @Override // w0.o
    public final o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(p pVar) {
        t tVar = this.f9701a;
        ((l) pVar).p(tVar.f2477a, 0, 12, false);
        tVar.G(0);
        if (tVar.j() != 1179011410) {
            return false;
        }
        tVar.H(4);
        if (tVar.j() != 541677121) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010f  */
    @Override // w0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(w0.p r22, R.r r23) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.b.f(w0.p, R.r):int");
    }

    @Override // w0.o
    public final void h(q qVar) {
        this.f9705e = 0;
        if (this.f9703c) {
            qVar = new B1.e(qVar, this.f9704d);
        }
        this.f9706f = qVar;
        this.f9710j = -1L;
    }

    @Override // w0.o
    public final List l() {
        G g3 = I.f197n;
        return b0.f231q;
    }

    @Override // w0.o
    public final void release() {
    }
}
