package C0;

import D1.G;
import D1.I;
import D1.b0;
import U.t;
import java.util.List;
import w0.l;
import w0.n;
import w0.o;
import w0.p;
import w0.q;
/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a  reason: collision with root package name */
    public final t f123a = new t(4);

    /* renamed from: b  reason: collision with root package name */
    public final t f124b = new t(9);

    /* renamed from: c  reason: collision with root package name */
    public final t f125c = new t(11);

    /* renamed from: d  reason: collision with root package name */
    public final t f126d = new t();

    /* renamed from: e  reason: collision with root package name */
    public final c f127e;

    /* renamed from: f  reason: collision with root package name */
    public q f128f;

    /* renamed from: g  reason: collision with root package name */
    public int f129g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f130h;

    /* renamed from: i  reason: collision with root package name */
    public long f131i;

    /* renamed from: j  reason: collision with root package name */
    public int f132j;

    /* renamed from: k  reason: collision with root package name */
    public int f133k;

    /* renamed from: l  reason: collision with root package name */
    public int f134l;

    /* renamed from: m  reason: collision with root package name */
    public long f135m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f136n;

    /* renamed from: o  reason: collision with root package name */
    public a f137o;

    /* renamed from: p  reason: collision with root package name */
    public f f138p;

    /* JADX WARN: Type inference failed for: r0v4, types: [C0.e, C0.c] */
    public b() {
        ?? eVar = new e(new n());
        eVar.f139b = -9223372036854775807L;
        eVar.f140c = new long[0];
        eVar.f141d = new long[0];
        this.f127e = eVar;
        this.f129g = 1;
    }

    public final t a(l lVar) {
        int i3 = this.f134l;
        t tVar = this.f126d;
        byte[] bArr = tVar.f2477a;
        if (i3 > bArr.length) {
            tVar.E(new byte[Math.max(bArr.length * 2, i3)], 0);
        } else {
            tVar.G(0);
        }
        tVar.F(this.f134l);
        lVar.i(tVar.f2477a, 0, this.f134l, false);
        return tVar;
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        if (j3 == 0) {
            this.f129g = 1;
            this.f130h = false;
        } else {
            this.f129g = 3;
        }
        this.f132j = 0;
    }

    @Override // w0.o
    public final o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(p pVar) {
        t tVar = this.f123a;
        l lVar = (l) pVar;
        lVar.p(tVar.f2477a, 0, 3, false);
        tVar.G(0);
        if (tVar.x() != 4607062) {
            return false;
        }
        lVar.p(tVar.f2477a, 0, 2, false);
        tVar.G(0);
        if ((tVar.A() & 250) != 0) {
            return false;
        }
        lVar.p(tVar.f2477a, 0, 4, false);
        tVar.G(0);
        int h3 = tVar.h();
        lVar.f9610r = 0;
        lVar.a(h3, false);
        lVar.p(tVar.f2477a, 0, 4, false);
        tVar.G(0);
        if (tVar.h() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x037a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0274  */
    /* JADX WARN: Type inference failed for: r1v53, types: [C0.e, C0.a] */
    @Override // w0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(w0.p r30, R.r r31) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.b.f(w0.p, R.r):int");
    }

    @Override // w0.o
    public final void h(q qVar) {
        this.f128f = qVar;
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
