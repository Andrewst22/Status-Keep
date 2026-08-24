package g2;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f5788a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5789b;

    public o(Object obj, String str) {
        this.f5788a = str;
        this.f5789b = obj;
    }

    public final Object a(String str) {
        Object obj = this.f5789b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }
}
