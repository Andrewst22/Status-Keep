package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0328b;
import j$.time.temporal.TemporalAccessor;
import java.util.Locale;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private TemporalAccessor f6558a;

    /* renamed from: b  reason: collision with root package name */
    private DateTimeFormatter f6559b;

    /* renamed from: c  reason: collision with root package name */
    private int f6560c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.temporal.a[] values;
        j$.time.chrono.m a3 = dateTimeFormatter.a();
        if (a3 != null) {
            j$.time.chrono.m mVar = (j$.time.chrono.m) temporalAccessor.z(j$.time.temporal.n.e());
            ZoneId zoneId = (ZoneId) temporalAccessor.z(j$.time.temporal.n.k());
            InterfaceC0328b interfaceC0328b = null;
            a3 = Objects.equals(a3, mVar) ? null : a3;
            Objects.equals(null, zoneId);
            if (a3 != null) {
                j$.time.chrono.m mVar2 = a3 != null ? a3 : mVar;
                if (a3 != null) {
                    if (temporalAccessor.f(j$.time.temporal.a.EPOCH_DAY)) {
                        interfaceC0328b = mVar2.p(temporalAccessor);
                    } else if (a3 != j$.time.chrono.t.f6484d || mVar != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.A() && temporalAccessor.f(aVar)) {
                                throw new RuntimeException("Unable to apply override chronology '" + a3 + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new s(interfaceC0328b, temporalAccessor, mVar2, zoneId);
            }
        }
        this.f6558a = temporalAccessor;
        this.f6559b = dateTimeFormatter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final TemporalAccessor d() {
        return this.f6558a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale c() {
        return this.f6559b.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w b() {
        return this.f6559b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.f6560c++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f6560c--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object f(C0338a c0338a) {
        TemporalAccessor temporalAccessor = this.f6558a;
        Object z3 = temporalAccessor.z(c0338a);
        if (z3 == null && this.f6560c == 0) {
            throw new RuntimeException("Unable to extract " + c0338a + " from temporal " + temporalAccessor);
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long e(j$.time.temporal.s sVar) {
        int i3 = this.f6560c;
        TemporalAccessor temporalAccessor = this.f6558a;
        if (i3 <= 0 || temporalAccessor.f(sVar)) {
            return Long.valueOf(temporalAccessor.v(sVar));
        }
        return null;
    }

    public final String toString() {
        return this.f6558a.toString();
    }
}
