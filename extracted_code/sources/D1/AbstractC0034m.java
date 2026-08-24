package D1;

import java.util.Map;
/* renamed from: D1.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0034m implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!android.support.v4.media.session.a.s(getKey(), entry.getKey()) || !android.support.v4.media.session.a.s(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Object key = getKey();
        Object value = getValue();
        int i3 = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i3 = value.hashCode();
        }
        return hashCode ^ i3;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
