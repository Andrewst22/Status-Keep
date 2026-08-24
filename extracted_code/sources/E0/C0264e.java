package e0;

import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: e0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264e extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 4) {
            return true;
        }
        return false;
    }
}
