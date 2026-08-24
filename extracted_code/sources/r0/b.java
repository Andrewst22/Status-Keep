package R0;

import U.A;
import U.AbstractC0123a;
import w0.InterfaceC0890A;
/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: m  reason: collision with root package name */
    public final f f2014m;

    /* renamed from: n  reason: collision with root package name */
    public final long f2015n;

    /* renamed from: o  reason: collision with root package name */
    public final long f2016o;

    /* renamed from: p  reason: collision with root package name */
    public final i f2017p;

    /* renamed from: q  reason: collision with root package name */
    public int f2018q;

    /* renamed from: r  reason: collision with root package name */
    public long f2019r;

    /* renamed from: s  reason: collision with root package name */
    public long f2020s;

    /* renamed from: t  reason: collision with root package name */
    public long f2021t;

    /* renamed from: u  reason: collision with root package name */
    public long f2022u;

    /* renamed from: v  reason: collision with root package name */
    public long f2023v;

    /* renamed from: w  reason: collision with root package name */
    public long f2024w;
    public long x;

    public b(i iVar, long j3, long j4, long j5, long j6, boolean z3) {
        boolean z4;
        if (j3 >= 0 && j4 > j3) {
            z4 = true;
        } else {
            z4 = false;
        }
        AbstractC0123a.e(z4);
        this.f2017p = iVar;
        this.f2015n = j3;
        this.f2016o = j4;
        if (j5 != j4 - j3 && !z3) {
            this.f2018q = 0;
        } else {
            this.f2019r = j6;
            this.f2018q = 4;
        }
        this.f2014m = new f();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    @Override // R0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(w0.l r25) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.b.b(w0.l):long");
    }

    @Override // R0.g
    public final InterfaceC0890A f() {
        if (this.f2019r != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // R0.g
    public final void j(long j3) {
        this.f2021t = A.k(j3, 0L, this.f2019r - 1);
        this.f2018q = 2;
        this.f2022u = this.f2015n;
        this.f2023v = this.f2016o;
        this.f2024w = 0L;
        this.x = this.f2019r;
    }
}
