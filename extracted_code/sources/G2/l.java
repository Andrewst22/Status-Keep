package g2;

import a.AbstractC0155a;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* loaded from: classes.dex */
public final class l implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final l f5786a = new Object();

    @Override // g2.n
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            y.f5798b.getClass();
            JSONTokener jSONTokener = new JSONTokener(y.c(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // g2.n
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object P3 = AbstractC0155a.P(obj);
        if (P3 instanceof String) {
            y yVar = y.f5798b;
            String quote = JSONObject.quote((String) P3);
            yVar.getClass();
            return y.d(quote);
        }
        y yVar2 = y.f5798b;
        String obj2 = P3.toString();
        yVar2.getClass();
        return y.d(obj2);
    }
}
