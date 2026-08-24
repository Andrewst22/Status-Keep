package j$.time.format;

import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o implements f {

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.temporal.a f6540a;

    /* renamed from: b  reason: collision with root package name */
    private final A f6541b;

    /* renamed from: c  reason: collision with root package name */
    private final b f6542c;

    /* renamed from: d  reason: collision with root package name */
    private volatile i f6543d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(j$.time.temporal.a aVar, A a3, b bVar) {
        this.f6540a = aVar;
        this.f6541b = a3;
        this.f6542c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean m(t tVar, StringBuilder sb) {
        String a3;
        Long e2 = tVar.e(this.f6540a);
        if (e2 == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) tVar.d().z(j$.time.temporal.n.e());
        if (mVar == null || mVar == j$.time.chrono.t.f6484d) {
            long longValue = e2.longValue();
            A a4 = this.f6541b;
            tVar.c();
            a3 = this.f6542c.f6512a.a(longValue, a4);
        } else {
            long longValue2 = e2.longValue();
            A a5 = this.f6541b;
            tVar.c();
            a3 = this.f6542c.f6512a.a(longValue2, a5);
        }
        if (a3 != null) {
            sb.append(a3);
            return true;
        }
        if (this.f6543d == null) {
            this.f6543d = new i(this.f6540a, 1, 19, z.NORMAL);
        }
        return this.f6543d.m(tVar, sb);
    }

    @Override // j$.time.format.f
    public final int o(q qVar, CharSequence charSequence, int i3) {
        Iterator b3;
        int length = charSequence.length();
        if (i3 < 0 || i3 > length) {
            throw new IndexOutOfBoundsException();
        }
        A a3 = qVar.k() ? this.f6541b : null;
        j$.time.chrono.m g3 = qVar.g();
        b bVar = this.f6542c;
        j$.time.temporal.a aVar = this.f6540a;
        if (g3 == null || g3 == j$.time.chrono.t.f6484d) {
            qVar.h();
            b3 = bVar.f6512a.b(a3);
        } else {
            qVar.h();
            b3 = bVar.f6512a.b(a3);
        }
        if (b3 != null) {
            while (b3.hasNext()) {
                Map.Entry entry = (Map.Entry) b3.next();
                String str = (String) entry.getKey();
                if (qVar.r(str, 0, charSequence, i3, str.length())) {
                    return qVar.n(this.f6540a, ((Long) entry.getValue()).longValue(), i3, str.length() + i3);
                }
            }
            if (aVar == j$.time.temporal.a.ERA && !qVar.k()) {
                for (j$.time.chrono.n nVar : g3.J()) {
                    String obj = nVar.toString();
                    if (qVar.r(obj, 0, charSequence, i3, obj.length())) {
                        return qVar.n(this.f6540a, nVar.getValue(), i3, obj.length() + i3);
                    }
                }
            }
            if (qVar.k()) {
                return ~i3;
            }
        }
        if (this.f6543d == null) {
            this.f6543d = new i(this.f6540a, 1, 19, z.NORMAL);
        }
        return this.f6543d.o(qVar, charSequence, i3);
    }

    public final String toString() {
        A a3 = A.FULL;
        j$.time.temporal.a aVar = this.f6540a;
        A a4 = this.f6541b;
        if (a4 == a3) {
            return "Text(" + aVar + ")";
        }
        return "Text(" + aVar + "," + a4 + ")";
    }
}
