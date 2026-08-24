package Q0;

import w0.AbstractC0892b;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f1530a;

    /* renamed from: b  reason: collision with root package name */
    public int f1531b;

    /* renamed from: c  reason: collision with root package name */
    public int f1532c;

    /* renamed from: d  reason: collision with root package name */
    public long f1533d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1534e;

    /* renamed from: f  reason: collision with root package name */
    public final U.t f1535f;

    /* renamed from: g  reason: collision with root package name */
    public final U.t f1536g;

    /* renamed from: h  reason: collision with root package name */
    public int f1537h;

    /* renamed from: i  reason: collision with root package name */
    public int f1538i;

    public d(U.t tVar, U.t tVar2, boolean z3) {
        this.f1536g = tVar;
        this.f1535f = tVar2;
        this.f1534e = z3;
        tVar2.G(12);
        this.f1530a = tVar2.y();
        tVar.G(12);
        this.f1538i = tVar.y();
        AbstractC0892b.e("first_chunk must be 1", tVar.h() == 1);
        this.f1531b = -1;
    }

    public final boolean a() {
        long w3;
        int i3;
        int i4 = this.f1531b + 1;
        this.f1531b = i4;
        if (i4 == this.f1530a) {
            return false;
        }
        boolean z3 = this.f1534e;
        U.t tVar = this.f1535f;
        if (z3) {
            w3 = tVar.z();
        } else {
            w3 = tVar.w();
        }
        this.f1533d = w3;
        if (this.f1531b == this.f1537h) {
            U.t tVar2 = this.f1536g;
            this.f1532c = tVar2.y();
            tVar2.H(4);
            int i5 = this.f1538i - 1;
            this.f1538i = i5;
            if (i5 > 0) {
                i3 = tVar2.y() - 1;
            } else {
                i3 = -1;
            }
            this.f1537h = i3;
        }
        return true;
    }
}
