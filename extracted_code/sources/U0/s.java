package u0;

import R.c0;
import U.AbstractC0123a;
import k0.C0558m;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final C0558m f9422a;

    /* renamed from: b  reason: collision with root package name */
    public final o f9423b;

    /* renamed from: c  reason: collision with root package name */
    public final U2.c f9424c = new U2.c();

    /* renamed from: d  reason: collision with root package name */
    public final Q0.g f9425d = new Q0.g();

    /* renamed from: e  reason: collision with root package name */
    public final Q0.g f9426e = new Q0.g();

    /* renamed from: f  reason: collision with root package name */
    public final U.m f9427f;

    /* renamed from: g  reason: collision with root package name */
    public c0 f9428g;

    /* renamed from: h  reason: collision with root package name */
    public c0 f9429h;

    /* renamed from: i  reason: collision with root package name */
    public long f9430i;

    /* renamed from: j  reason: collision with root package name */
    public long f9431j;

    /* JADX WARN: Type inference failed for: r3v4, types: [U.m, java.lang.Object] */
    public s(C0558m c0558m, o oVar) {
        this.f9422a = c0558m;
        this.f9423b = oVar;
        ?? obj = new Object();
        int highestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        obj.f2454a = 0;
        obj.f2455b = 0;
        obj.f2457d = new long[highestOneBit];
        obj.f2456c = highestOneBit - 1;
        this.f9427f = obj;
        this.f9429h = c0.f1879e;
        this.f9431j = -9223372036854775807L;
    }

    public final void a() {
        boolean z3;
        U.m mVar = this.f9427f;
        boolean z4 = false;
        mVar.f2454a = 0;
        mVar.f2455b = 0;
        this.f9431j = -9223372036854775807L;
        Q0.g gVar = this.f9426e;
        if (gVar.g() > 0) {
            if (gVar.g() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0123a.e(z3);
            while (gVar.g() > 1) {
                gVar.d();
            }
            Object d3 = gVar.d();
            d3.getClass();
            gVar.a(0L, (Long) d3);
        }
        c0 c0Var = this.f9428g;
        Q0.g gVar2 = this.f9425d;
        if (c0Var == null) {
            if (gVar2.g() > 0) {
                if (gVar2.g() > 0) {
                    z4 = true;
                }
                AbstractC0123a.e(z4);
                while (gVar2.g() > 1) {
                    gVar2.d();
                }
                Object d4 = gVar2.d();
                d4.getClass();
                this.f9428g = (c0) d4;
                return;
            }
            return;
        }
        gVar2.b();
    }
}
