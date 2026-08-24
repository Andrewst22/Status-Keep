package g2;

import a.AbstractC0155a;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* loaded from: classes.dex */
public final class m implements s {

    /* renamed from: a  reason: collision with root package name */
    public static final m f5787a = new Object();

    @Override // g2.s
    public ByteBuffer a(o oVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", oVar.f5788a);
            jSONObject.put("args", AbstractC0155a.P(oVar.f5789b));
            Object P3 = AbstractC0155a.P(jSONObject);
            if (P3 instanceof String) {
                y yVar = y.f5798b;
                String quote = JSONObject.quote((String) P3);
                yVar.getClass();
                return y.d(quote);
            }
            y yVar2 = y.f5798b;
            String obj = P3.toString();
            yVar2.getClass();
            return y.d(obj);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // g2.s
    public ByteBuffer b(Object obj) {
        JSONArray put = new JSONArray().put(AbstractC0155a.P(obj));
        if (put == null) {
            return null;
        }
        Object P3 = AbstractC0155a.P(put);
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

    @Override // g2.s
    public o c(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                nextValue = null;
            } else {
                try {
                    y.f5798b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(y.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Invalid JSON", e2);
                }
            }
            if (nextValue instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) nextValue;
                Object obj2 = jSONObject.get("method");
                Object opt = jSONObject.opt("args");
                if (opt != JSONObject.NULL) {
                    obj = opt;
                }
                if (obj2 instanceof String) {
                    return new o(obj, (String) obj2);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + nextValue);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // g2.s
    public Object d(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    y.f5798b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(y.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Invalid JSON", e2);
                }
            } catch (JSONException e3) {
                throw new IllegalArgumentException("Invalid JSON", e3);
            }
        }
        if (nextValue instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) nextValue;
            if (jSONArray.length() == 1) {
                Object opt = jSONArray.opt(0);
                if (opt == JSONObject.NULL) {
                    return null;
                }
                return opt;
            } else if (jSONArray.length() == 3) {
                Object obj2 = jSONArray.get(0);
                Object opt2 = jSONArray.opt(1);
                Object obj3 = JSONObject.NULL;
                if (opt2 == obj3) {
                    opt2 = null;
                }
                Object opt3 = jSONArray.opt(2);
                if (opt3 != obj3) {
                    obj = opt3;
                }
                if ((obj2 instanceof String) && (opt2 == null || (opt2 instanceof String))) {
                    throw new k((String) obj2, (String) opt2, obj);
                }
            }
        }
        throw new IllegalArgumentException("Invalid envelope: " + nextValue);
    }

    @Override // g2.s
    public ByteBuffer e(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(AbstractC0155a.P(str)).put(JSONObject.NULL).put(AbstractC0155a.P(str2));
        if (put == null) {
            return null;
        }
        Object P3 = AbstractC0155a.P(put);
        if (P3 instanceof String) {
            y yVar = y.f5798b;
            String quote = JSONObject.quote((String) P3);
            yVar.getClass();
            return y.d(quote);
        }
        y yVar2 = y.f5798b;
        String obj = P3.toString();
        yVar2.getClass();
        return y.d(obj);
    }

    @Override // g2.s
    public ByteBuffer f(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(AbstractC0155a.P(str2)).put(AbstractC0155a.P(obj));
        if (put == null) {
            return null;
        }
        Object P3 = AbstractC0155a.P(put);
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
