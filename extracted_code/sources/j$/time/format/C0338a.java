package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
/* renamed from: j$.time.format.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0338a implements j$.time.temporal.t {
    @Override // j$.time.temporal.t
    public final Object g(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.z(j$.time.temporal.n.k());
        if (zoneId == null || (zoneId instanceof j$.time.y)) {
            return null;
        }
        return zoneId;
    }
}
