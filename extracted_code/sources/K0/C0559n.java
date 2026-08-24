package k0;

import D1.C0040t;
import D1.C0042v;
import D1.I;
import D1.J;
import a.AbstractC0155a;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* renamed from: k0.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0559n {

    /* renamed from: a  reason: collision with root package name */
    public final J f7633a;

    static {
        new C0558m(0).i();
    }

    public C0559n(C0558m c0558m) {
        J j3;
        Set entrySet = ((C0042v) ((C1.j) c0558m.f7632n).f168n).entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            j3 = D1.B.f184q;
        } else {
            C0040t c0040t = (C0040t) entrySet;
            B0.b bVar = new B0.b(c0040t.f301n.size());
            Iterator it = c0040t.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                I j4 = I.j((Collection) entry.getValue());
                if (!j4.isEmpty()) {
                    bVar.h(key, j4);
                    i3 = j4.size() + i3;
                }
            }
            j3 = new J(bVar.a(), i3);
        }
        this.f7633a = j3;
    }

    public static String b(String str) {
        if (AbstractC0155a.x(str, "Accept")) {
            return "Accept";
        }
        if (AbstractC0155a.x(str, "Allow")) {
            return "Allow";
        }
        if (AbstractC0155a.x(str, "Authorization")) {
            return "Authorization";
        }
        if (AbstractC0155a.x(str, "Bandwidth")) {
            return "Bandwidth";
        }
        if (AbstractC0155a.x(str, "Blocksize")) {
            return "Blocksize";
        }
        if (AbstractC0155a.x(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (AbstractC0155a.x(str, "Connection")) {
            return "Connection";
        }
        if (AbstractC0155a.x(str, "Content-Base")) {
            return "Content-Base";
        }
        if (AbstractC0155a.x(str, "Content-Encoding")) {
            return "Content-Encoding";
        }
        if (AbstractC0155a.x(str, "Content-Language")) {
            return "Content-Language";
        }
        if (AbstractC0155a.x(str, "Content-Length")) {
            return "Content-Length";
        }
        if (AbstractC0155a.x(str, "Content-Location")) {
            return "Content-Location";
        }
        if (AbstractC0155a.x(str, "Content-Type")) {
            return "Content-Type";
        }
        if (AbstractC0155a.x(str, "CSeq")) {
            return "CSeq";
        }
        if (AbstractC0155a.x(str, "Date")) {
            return "Date";
        }
        if (AbstractC0155a.x(str, "Expires")) {
            return "Expires";
        }
        if (AbstractC0155a.x(str, "Location")) {
            return "Location";
        }
        if (AbstractC0155a.x(str, "Proxy-Authenticate")) {
            return "Proxy-Authenticate";
        }
        if (AbstractC0155a.x(str, "Proxy-Require")) {
            return "Proxy-Require";
        }
        if (AbstractC0155a.x(str, "Public")) {
            return "Public";
        }
        if (AbstractC0155a.x(str, "Range")) {
            return "Range";
        }
        if (AbstractC0155a.x(str, "RTP-Info")) {
            return "RTP-Info";
        }
        if (AbstractC0155a.x(str, "RTCP-Interval")) {
            return "RTCP-Interval";
        }
        if (AbstractC0155a.x(str, "Scale")) {
            return "Scale";
        }
        if (AbstractC0155a.x(str, "Session")) {
            return "Session";
        }
        if (AbstractC0155a.x(str, "Speed")) {
            return "Speed";
        }
        if (AbstractC0155a.x(str, "Supported")) {
            return "Supported";
        }
        if (AbstractC0155a.x(str, "Timestamp")) {
            return "Timestamp";
        }
        if (AbstractC0155a.x(str, "Transport")) {
            return "Transport";
        }
        if (AbstractC0155a.x(str, "User-Agent")) {
            return "User-Agent";
        }
        if (AbstractC0155a.x(str, "Via")) {
            return "Via";
        }
        if (AbstractC0155a.x(str, "WWW-Authenticate")) {
            return "WWW-Authenticate";
        }
        return str;
    }

    public final J a() {
        return this.f7633a;
    }

    public final String c(String str) {
        I d3 = this.f7633a.d(b(str));
        if (d3.isEmpty()) {
            return null;
        }
        return (String) D1.r.l(d3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0559n)) {
            return false;
        }
        return this.f7633a.equals(((C0559n) obj).f7633a);
    }

    public final int hashCode() {
        return this.f7633a.hashCode();
    }
}
