package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0328b;
import j$.time.temporal.TemporalAccessor;
/* loaded from: classes2.dex */
final class s implements TemporalAccessor {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InterfaceC0328b f6554a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TemporalAccessor f6555b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.m f6556c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ZoneId f6557d;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int o(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.a(this, sVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(InterfaceC0328b interfaceC0328b, TemporalAccessor temporalAccessor, j$.time.chrono.m mVar, ZoneId zoneId) {
        this.f6554a = interfaceC0328b;
        this.f6555b = temporalAccessor;
        this.f6556c = mVar;
        this.f6557d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        InterfaceC0328b interfaceC0328b = this.f6554a;
        if (interfaceC0328b != null && sVar.A()) {
            return interfaceC0328b.f(sVar);
        }
        return this.f6555b.f(sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        InterfaceC0328b interfaceC0328b = this.f6554a;
        if (interfaceC0328b != null && sVar.A()) {
            return interfaceC0328b.r(sVar);
        }
        return this.f6555b.r(sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        InterfaceC0328b interfaceC0328b = this.f6554a;
        if (interfaceC0328b != null && sVar.A()) {
            return interfaceC0328b.v(sVar);
        }
        return this.f6555b.v(sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e()) {
            return this.f6556c;
        }
        if (tVar == j$.time.temporal.n.k()) {
            return this.f6557d;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return this.f6555b.z(tVar);
        }
        return tVar.g(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.m mVar = this.f6556c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f6557d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f6555b + str + str2;
    }
}
