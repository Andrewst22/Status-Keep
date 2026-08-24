package L1;

import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
/* loaded from: classes.dex */
public final class r extends I1.r {

    /* renamed from: a  reason: collision with root package name */
    public final z1.b f929a;

    /* renamed from: b  reason: collision with root package name */
    public final I1.k f930b;

    /* renamed from: c  reason: collision with root package name */
    public final P1.a f931c;

    /* renamed from: d  reason: collision with root package name */
    public final q f932d;

    /* renamed from: e  reason: collision with root package name */
    public I1.r f933e;

    public r(z1.b bVar, I1.k kVar, P1.a aVar, q qVar) {
        this.f929a = bVar;
        this.f930b = kVar;
        this.f931c = aVar;
        this.f932d = qVar;
    }

    @Override // I1.r
    public final Object a(Q1.b bVar) {
        if (this.f929a == null) {
            I1.r rVar = this.f933e;
            if (rVar == null) {
                rVar = this.f930b.d(this.f932d, this.f931c);
                this.f933e = rVar;
            }
            return rVar.a(bVar);
        }
        I1.m j3 = K1.d.j(bVar);
        j3.getClass();
        if (j3 instanceof I1.o) {
            return null;
        }
        try {
            return ScheduleMode.valueOf(j3.c());
        } catch (Exception unused) {
            if (j3.a()) {
                return ScheduleMode.exactAllowWhileIdle;
            }
            return ScheduleMode.exact;
        }
    }

    @Override // I1.r
    public final void b(Q1.c cVar, Object obj) {
        I1.r rVar = this.f933e;
        if (rVar == null) {
            rVar = this.f930b.d(this.f932d, this.f931c);
            this.f933e = rVar;
        }
        rVar.b(cVar, obj);
    }
}
