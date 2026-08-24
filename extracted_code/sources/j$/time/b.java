package j$.time;

import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public abstract class b {
    public abstract ZoneId a();

    public static b b() {
        String id = TimeZone.getDefault().getID();
        Objects.requireNonNull(id, "zoneId");
        Map map = ZoneId.f6430a;
        Objects.requireNonNull(map, "aliasMap");
        String str = (String) map.get(id);
        if (str != null) {
            id = str;
        }
        return new C0326a(ZoneId.of(id));
    }
}
