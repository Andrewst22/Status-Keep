package T2;

import t2.AbstractC0826c;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f2389a;

    /* renamed from: b  reason: collision with root package name */
    public int f2390b;

    /* renamed from: c  reason: collision with root package name */
    public int f2391c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2392d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2393e;

    /* renamed from: f  reason: collision with root package name */
    public q f2394f;

    /* renamed from: g  reason: collision with root package name */
    public q f2395g;

    public q() {
        this.f2389a = new byte[8192];
        this.f2393e = true;
        this.f2392d = false;
    }

    public final q a() {
        q qVar = this.f2394f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f2395g;
        D2.i.b(qVar2);
        qVar2.f2394f = this.f2394f;
        q qVar3 = this.f2394f;
        D2.i.b(qVar3);
        qVar3.f2395g = this.f2395g;
        this.f2394f = null;
        this.f2395g = null;
        return qVar;
    }

    public final void b(q qVar) {
        D2.i.e(qVar, "segment");
        qVar.f2395g = this;
        qVar.f2394f = this.f2394f;
        q qVar2 = this.f2394f;
        D2.i.b(qVar2);
        qVar2.f2395g = qVar;
        this.f2394f = qVar;
    }

    public final q c() {
        this.f2392d = true;
        return new q(this.f2389a, this.f2390b, this.f2391c, true);
    }

    public final void d(q qVar, int i3) {
        D2.i.e(qVar, "sink");
        if (qVar.f2393e) {
            int i4 = qVar.f2391c;
            int i5 = i4 + i3;
            byte[] bArr = qVar.f2389a;
            if (i5 > 8192) {
                if (!qVar.f2392d) {
                    int i6 = qVar.f2390b;
                    if (i5 - i6 <= 8192) {
                        AbstractC0826c.z(0, i6, i4, bArr, bArr);
                        qVar.f2391c -= qVar.f2390b;
                        qVar.f2390b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i7 = qVar.f2391c;
            int i8 = this.f2390b;
            AbstractC0826c.z(i7, i8, i8 + i3, this.f2389a, bArr);
            qVar.f2391c += i3;
            this.f2390b += i3;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public q(byte[] bArr, int i3, int i4, boolean z3) {
        D2.i.e(bArr, "data");
        this.f2389a = bArr;
        this.f2390b = i3;
        this.f2391c = i4;
        this.f2392d = z3;
        this.f2393e = false;
    }
}
