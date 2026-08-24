package j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: f  reason: collision with root package name */
    private static final C0338a f6544f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private p f6545a;

    /* renamed from: b  reason: collision with root package name */
    private final p f6546b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f6547c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f6548d;

    /* renamed from: e  reason: collision with root package name */
    private int f6549e;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.a, java.lang.Object] */
    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.s sVar = j$.time.temporal.j.f6617a;
        hashMap.put('Q', sVar);
        hashMap.put('q', sVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.l.f6624a);
    }

    public p() {
        this.f6545a = this;
        this.f6547c = new ArrayList();
        this.f6549e = -1;
        this.f6546b = null;
        this.f6548d = false;
    }

    private p(p pVar) {
        this.f6545a = this;
        this.f6547c = new ArrayList();
        this.f6549e = -1;
        this.f6546b = pVar;
        this.f6548d = true;
    }

    public final void q() {
        d(m.SENSITIVE);
    }

    public final void p() {
        d(m.INSENSITIVE);
    }

    public final void s() {
        d(m.STRICT);
    }

    public final void r() {
        d(m.LENIENT);
    }

    public final void k(j$.time.temporal.s sVar, int i3) {
        Objects.requireNonNull(sVar, "field");
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i3);
        }
        j(new i(sVar, i3, i3, z.NOT_NEGATIVE));
    }

    public final void l(j$.time.temporal.s sVar, int i3, int i4, z zVar) {
        if (i3 == i4 && zVar == z.NOT_NEGATIVE) {
            k(sVar, i4);
            return;
        }
        Objects.requireNonNull(sVar, "field");
        Objects.requireNonNull(zVar, "signStyle");
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i3);
        } else if (i4 < 1 || i4 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i4);
        } else if (i4 < i3) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i4 + " < " + i3);
        } else {
            j(new i(sVar, i3, i4, zVar));
        }
    }

    private void j(i iVar) {
        i c3;
        z zVar;
        p pVar = this.f6545a;
        int i3 = pVar.f6549e;
        if (i3 >= 0) {
            i iVar2 = (i) pVar.f6547c.get(i3);
            int i4 = iVar.f6520b;
            int i5 = iVar.f6521c;
            if (i4 == i5) {
                zVar = iVar.f6522d;
                if (zVar == z.NOT_NEGATIVE) {
                    c3 = iVar2.d(i5);
                    d(iVar.c());
                    this.f6545a.f6549e = i3;
                    this.f6545a.f6547c.set(i3, c3);
                    return;
                }
            }
            c3 = iVar2.c();
            this.f6545a.f6549e = d(iVar);
            this.f6545a.f6547c.set(i3, c3);
            return;
        }
        pVar.f6549e = d(iVar);
    }

    public final void b(j$.time.temporal.a aVar) {
        g gVar = new g(aVar, 0, 9, true, 0);
        Objects.requireNonNull(aVar, "field");
        if (aVar.m().g()) {
            d(gVar);
            return;
        }
        throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
    }

    public final void i(j$.time.temporal.a aVar, HashMap hashMap) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        A a3 = A.FULL;
        d(new o(aVar, a3, new b(new v(Collections.singletonMap(a3, linkedHashMap)))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.f, java.lang.Object] */
    public final void c() {
        d(new Object());
    }

    public final void h() {
        d(j.f6525e);
    }

    public final void g(String str, String str2) {
        d(new j(str, str2));
    }

    public final void m() {
        d(new n(1, f6544f));
    }

    public final void e(char c3) {
        d(new d(c3));
    }

    public final void f(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            d(new d(str.charAt(0)));
        } else {
            d(new n(0, str));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.f());
    }

    public final void o() {
        p pVar = this.f6545a;
        pVar.f6549e = -1;
        this.f6545a = new p(pVar);
    }

    public final void n() {
        p pVar = this.f6545a;
        if (pVar.f6546b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (pVar.f6547c.size() > 0) {
            p pVar2 = this.f6545a;
            e eVar = new e(pVar2.f6547c, pVar2.f6548d);
            this.f6545a = this.f6545a.f6546b;
            d(eVar);
            return;
        }
        this.f6545a = this.f6545a.f6546b;
    }

    private int d(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        p pVar = this.f6545a;
        pVar.getClass();
        pVar.f6547c.add(fVar);
        p pVar2 = this.f6545a;
        pVar2.f6549e = -1;
        return pVar2.f6547c.size() - 1;
    }

    public final DateTimeFormatter t() {
        return v(Locale.getDefault(), y.SMART, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final DateTimeFormatter u(y yVar, j$.time.chrono.t tVar) {
        return v(Locale.getDefault(), yVar, tVar);
    }

    private DateTimeFormatter v(Locale locale, y yVar, j$.time.chrono.t tVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f6545a.f6546b != null) {
            n();
        }
        e eVar = new e(this.f6547c, false);
        w wVar = w.f6563a;
        return new DateTimeFormatter(eVar, locale, yVar, tVar);
    }
}
