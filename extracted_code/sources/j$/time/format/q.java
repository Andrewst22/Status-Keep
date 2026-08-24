package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private DateTimeFormatter f6550a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6551b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6552c = true;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f6553d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f6553d = arrayList;
        this.f6550a = dateTimeFormatter;
        arrayList.add(new x());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final q c() {
        q qVar = new q(this.f6550a);
        qVar.f6551b = this.f6551b;
        qVar.f6552c = this.f6552c;
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Locale h() {
        return this.f6550a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w f() {
        return this.f6550a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.chrono.m g() {
        j$.time.chrono.m mVar = d().f6566c;
        if (mVar == null) {
            j$.time.chrono.m a3 = this.f6550a.a();
            return a3 == null ? j$.time.chrono.t.f6484d : a3;
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(char c3, char c4) {
        if (this.f6551b) {
            return c3 == c4;
        }
        return b(c3, c4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        return this.f6551b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(boolean z3) {
        this.f6551b = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r(CharSequence charSequence, int i3, CharSequence charSequence2, int i4, int i5) {
        if (i3 + i5 > charSequence.length() || i4 + i5 > charSequence2.length()) {
            return false;
        }
        if (this.f6551b) {
            for (int i6 = 0; i6 < i5; i6++) {
                if (charSequence.charAt(i3 + i6) != charSequence2.charAt(i4 + i6)) {
                    return false;
                }
            }
            return true;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            char charAt = charSequence.charAt(i3 + i7);
            char charAt2 = charSequence2.charAt(i4 + i7);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(char c3, char c4) {
        return c3 == c4 || Character.toUpperCase(c3) == Character.toUpperCase(c4) || Character.toLowerCase(c3) == Character.toLowerCase(c4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        return this.f6552c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(boolean z3) {
        this.f6552c = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        ArrayList arrayList = this.f6553d;
        x d3 = d();
        d3.getClass();
        x xVar = new x();
        xVar.f6564a.putAll(d3.f6564a);
        xVar.f6565b = d3.f6565b;
        xVar.f6566c = d3.f6566c;
        xVar.f6567d = d3.f6567d;
        arrayList.add(xVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(boolean z3) {
        ArrayList arrayList = this.f6553d;
        if (z3) {
            arrayList.remove(arrayList.size() - 2);
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    private x d() {
        ArrayList arrayList = this.f6553d;
        return (x) arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final TemporalAccessor s(y yVar) {
        x d3 = d();
        d3.f6566c = g();
        ZoneId zoneId = d3.f6565b;
        if (zoneId == null) {
            this.f6550a.getClass();
            zoneId = null;
        }
        d3.f6565b = zoneId;
        d3.k(yVar);
        return d3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long i(j$.time.temporal.a aVar) {
        return (Long) d().f6564a.get(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int n(j$.time.temporal.s sVar, long j3, int i3, int i4) {
        Objects.requireNonNull(sVar, "field");
        Long l3 = (Long) d().f6564a.put(sVar, Long.valueOf(j3));
        return (l3 == null || l3.longValue() == j3) ? i4 : ~i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        d().f6565b = zoneId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        d().f6567d = true;
    }

    public final String toString() {
        return d().toString();
    }
}
