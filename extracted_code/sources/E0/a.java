package E0;

import D1.G;
import D1.I;
import D1.b0;
import U.t;
import java.util.List;
import w0.l;
import w0.o;
import w0.p;
import w0.q;
import w0.s;
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: b  reason: collision with root package name */
    public q f345b;

    /* renamed from: c  reason: collision with root package name */
    public int f346c;

    /* renamed from: d  reason: collision with root package name */
    public int f347d;

    /* renamed from: e  reason: collision with root package name */
    public int f348e;

    /* renamed from: g  reason: collision with root package name */
    public L0.a f350g;

    /* renamed from: h  reason: collision with root package name */
    public l f351h;

    /* renamed from: i  reason: collision with root package name */
    public c f352i;

    /* renamed from: j  reason: collision with root package name */
    public Q0.q f353j;

    /* renamed from: a  reason: collision with root package name */
    public final t f344a = new t(6);

    /* renamed from: f  reason: collision with root package name */
    public long f349f = -1;

    public final void a() {
        q qVar = this.f345b;
        qVar.getClass();
        qVar.s();
        this.f345b.n(new s(-9223372036854775807L));
        this.f346c = 6;
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        if (j3 == 0) {
            this.f346c = 0;
            this.f353j = null;
        } else if (this.f346c == 5) {
            Q0.q qVar = this.f353j;
            qVar.getClass();
            qVar.b(j3, j4);
        }
    }

    @Override // w0.o
    public final o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(p pVar) {
        l lVar = (l) pVar;
        t tVar = this.f344a;
        tVar.D(2);
        lVar.p(tVar.f2477a, 0, 2, false);
        if (tVar.A() != 65496) {
            return false;
        }
        tVar.D(2);
        lVar.p(tVar.f2477a, 0, 2, false);
        int A3 = tVar.A();
        this.f347d = A3;
        if (A3 == 65504) {
            tVar.D(2);
            lVar.p(tVar.f2477a, 0, 2, false);
            lVar.a(tVar.A() - 2, false);
            tVar.D(2);
            lVar.p(tVar.f2477a, 0, 2, false);
            this.f347d = tVar.A();
        }
        if (this.f347d != 65505) {
            return false;
        }
        lVar.a(2, false);
        tVar.D(6);
        lVar.p(tVar.f2477a, 0, 6, false);
        if (tVar.w() != 1165519206 || tVar.A() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0181  */
    @Override // w0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(w0.p r27, R.r r28) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.a.f(w0.p, R.r):int");
    }

    @Override // w0.o
    public final void h(q qVar) {
        this.f345b = qVar;
    }

    @Override // w0.o
    public final List l() {
        G g3 = I.f197n;
        return b0.f231q;
    }

    @Override // w0.o
    public final void release() {
        Q0.q qVar = this.f353j;
        if (qVar != null) {
            qVar.getClass();
        }
    }
}
