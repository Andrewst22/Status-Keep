package Q1;

import D2.h;
import I1.q;
import L1.g;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static a f1695a;

    public static void a(b bVar) {
        if (bVar instanceof g) {
            g gVar = (g) bVar;
            gVar.D(5);
            Map.Entry entry = (Map.Entry) ((Iterator) gVar.F()).next();
            gVar.H(entry.getValue());
            gVar.H(new q((String) entry.getKey()));
            return;
        }
        int i3 = bVar.f1704t;
        if (i3 == 0) {
            i3 = bVar.d();
        }
        if (i3 == 13) {
            bVar.f1704t = 9;
        } else if (i3 == 12) {
            bVar.f1704t = 8;
        } else if (i3 == 14) {
            bVar.f1704t = 10;
        } else {
            throw new IllegalStateException("Expected a name but was " + h.v(bVar.w()) + bVar.l());
        }
    }
}
