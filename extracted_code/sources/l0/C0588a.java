package l0;

import U.A;
import U.s;
import U.t;
import a.AbstractC0155a;
import java.math.RoundingMode;
import k0.C0555j;
import w0.G;
import w0.q;
/* renamed from: l0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0588a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0555j f7965a;

    /* renamed from: b  reason: collision with root package name */
    public final s f7966b = new s();

    /* renamed from: c  reason: collision with root package name */
    public final int f7967c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7968d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7969e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7970f;

    /* renamed from: g  reason: collision with root package name */
    public long f7971g;

    /* renamed from: h  reason: collision with root package name */
    public G f7972h;

    /* renamed from: i  reason: collision with root package name */
    public long f7973i;

    public C0588a(C0555j c0555j) {
        this.f7965a = c0555j;
        this.f7967c = c0555j.f7605b;
        String str = (String) c0555j.f7607d.get("mode");
        str.getClass();
        if (AbstractC0155a.x(str, "AAC-hbr")) {
            this.f7968d = 13;
            this.f7969e = 3;
        } else if (AbstractC0155a.x(str, "AAC-lbr")) {
            this.f7968d = 6;
            this.f7969e = 2;
        } else {
            throw new UnsupportedOperationException("AAC mode not supported");
        }
        this.f7970f = this.f7969e + this.f7968d;
    }

    @Override // l0.i
    public final void b(long j3, long j4) {
        this.f7971g = j3;
        this.f7973i = j4;
    }

    @Override // l0.i
    public final void c(t tVar, long j3, int i3, boolean z3) {
        this.f7972h.getClass();
        short r3 = tVar.r();
        int i4 = r3 / this.f7970f;
        long M3 = AbstractC0155a.M(this.f7973i, j3, this.f7971g, this.f7967c);
        s sVar = this.f7966b;
        sVar.o(tVar);
        int i5 = this.f7969e;
        int i6 = this.f7968d;
        if (i4 == 1) {
            int i7 = sVar.i(i6);
            sVar.t(i5);
            this.f7972h.f(tVar.a(), tVar);
            if (z3) {
                this.f7972h.b(M3, 1, i7, 0, null);
                return;
            }
            return;
        }
        tVar.H((r3 + 7) / 8);
        long j4 = M3;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = sVar.i(i6);
            sVar.t(i5);
            this.f7972h.f(i9, tVar);
            this.f7972h.b(j4, 1, i9, 0, null);
            j4 += A.U(i4, 1000000L, this.f7967c, RoundingMode.FLOOR);
        }
    }

    @Override // l0.i
    public final void d(long j3) {
        this.f7971g = j3;
    }

    @Override // l0.i
    public final void e(q qVar, int i3) {
        G w3 = qVar.w(i3, 1);
        this.f7972h = w3;
        w3.c(this.f7965a.f7606c);
    }
}
