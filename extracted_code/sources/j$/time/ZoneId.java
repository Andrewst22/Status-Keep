package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f6430a;
    private static final long serialVersionUID = 8352817235686L;

    public abstract j$.time.zone.f N();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void R(ObjectOutput objectOutput);

    public abstract String l();

    static {
        Map.Entry[] entryArr = {new AbstractMap.SimpleImmutableEntry("ACT", "Australia/Darwin"), new AbstractMap.SimpleImmutableEntry("AET", "Australia/Sydney"), new AbstractMap.SimpleImmutableEntry("AGT", "America/Argentina/Buenos_Aires"), new AbstractMap.SimpleImmutableEntry("ART", "Africa/Cairo"), new AbstractMap.SimpleImmutableEntry("AST", "America/Anchorage"), new AbstractMap.SimpleImmutableEntry("BET", "America/Sao_Paulo"), new AbstractMap.SimpleImmutableEntry("BST", "Asia/Dhaka"), new AbstractMap.SimpleImmutableEntry("CAT", "Africa/Harare"), new AbstractMap.SimpleImmutableEntry("CNT", "America/St_Johns"), new AbstractMap.SimpleImmutableEntry("CST", "America/Chicago"), new AbstractMap.SimpleImmutableEntry("CTT", "Asia/Shanghai"), new AbstractMap.SimpleImmutableEntry("EAT", "Africa/Addis_Ababa"), new AbstractMap.SimpleImmutableEntry("ECT", "Europe/Paris"), new AbstractMap.SimpleImmutableEntry("IET", "America/Indiana/Indianapolis"), new AbstractMap.SimpleImmutableEntry("IST", "Asia/Kolkata"), new AbstractMap.SimpleImmutableEntry("JST", "Asia/Tokyo"), new AbstractMap.SimpleImmutableEntry("MIT", "Pacific/Apia"), new AbstractMap.SimpleImmutableEntry("NET", "Asia/Yerevan"), new AbstractMap.SimpleImmutableEntry("NST", "Pacific/Auckland"), new AbstractMap.SimpleImmutableEntry("PLT", "Asia/Karachi"), new AbstractMap.SimpleImmutableEntry("PNT", "America/Phoenix"), new AbstractMap.SimpleImmutableEntry("PRT", "America/Puerto_Rico"), new AbstractMap.SimpleImmutableEntry("PST", "America/Los_Angeles"), new AbstractMap.SimpleImmutableEntry("SST", "Pacific/Guadalcanal"), new AbstractMap.SimpleImmutableEntry("VST", "Asia/Ho_Chi_Minh"), new AbstractMap.SimpleImmutableEntry("EST", "-05:00"), new AbstractMap.SimpleImmutableEntry("MST", "-07:00"), new AbstractMap.SimpleImmutableEntry("HST", "-10:00")};
        HashMap hashMap = new HashMap(28);
        for (int i3 = 0; i3 < 28; i3++) {
            Map.Entry entry = entryArr[i3];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (hashMap.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        f6430a = Collections.unmodifiableMap(hashMap);
    }

    public static ZoneId of(String str) {
        return O(str, true);
    }

    public static ZoneId P(String str, y yVar) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(yVar, "offset");
        if (str.isEmpty()) {
            return yVar;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (yVar.T() != 0) {
            str = str.concat(yVar.l());
        }
        return new z(str, j$.time.zone.f.h(yVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneId O(String str, boolean z3) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return y.U(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return Q(str, 3, z3);
        }
        if (str.startsWith("UT")) {
            return Q(str, 2, z3);
        }
        return z.S(str, z3);
    }

    private static ZoneId Q(String str, int i3, boolean z3) {
        String substring = str.substring(0, i3);
        if (str.length() == i3) {
            return P(substring, y.f6649f);
        }
        if (str.charAt(i3) != '+' && str.charAt(i3) != '-') {
            return z.S(str, z3);
        }
        try {
            y U3 = y.U(str.substring(i3));
            if (U3 == y.f6649f) {
                return P(substring, U3);
            }
            return P(substring, U3);
        } catch (c e2) {
            throw new RuntimeException("Invalid ID for offset-based ZoneId: ".concat(str), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneId() {
        if (getClass() != y.class && getClass() != z.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return l().equals(((ZoneId) obj).l());
        }
        return false;
    }

    public int hashCode() {
        return l().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return l();
    }

    private Object writeReplace() {
        return new t((byte) 7, this);
    }
}
