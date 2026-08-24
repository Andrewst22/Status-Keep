package j$.time.format;

import j$.time.temporal.TemporalAccessor;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;

    /* renamed from: f  reason: collision with root package name */
    public static final DateTimeFormatter f6503f;

    /* renamed from: g  reason: collision with root package name */
    public static final DateTimeFormatter f6504g;

    /* renamed from: a  reason: collision with root package name */
    private final e f6505a;

    /* renamed from: b  reason: collision with root package name */
    private final Locale f6506b;

    /* renamed from: c  reason: collision with root package name */
    private final w f6507c;

    /* renamed from: d  reason: collision with root package name */
    private final y f6508d;

    /* renamed from: e  reason: collision with root package name */
    private final j$.time.chrono.t f6509e;

    static {
        p pVar = new p();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        z zVar = z.EXCEEDS_PAD;
        pVar.l(aVar, 4, 10, zVar);
        pVar.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        pVar.k(aVar2, 2);
        pVar.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        pVar.k(aVar3, 2);
        y yVar = y.STRICT;
        j$.time.chrono.t tVar = j$.time.chrono.t.f6484d;
        DateTimeFormatter u3 = pVar.u(yVar, tVar);
        f6503f = u3;
        p pVar2 = new p();
        pVar2.p();
        pVar2.a(u3);
        pVar2.h();
        pVar2.u(yVar, tVar);
        p pVar3 = new p();
        pVar3.p();
        pVar3.a(u3);
        pVar3.o();
        pVar3.h();
        pVar3.u(yVar, tVar);
        p pVar4 = new p();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        pVar4.k(aVar4, 2);
        pVar4.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        pVar4.k(aVar5, 2);
        pVar4.o();
        pVar4.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        pVar4.k(aVar6, 2);
        pVar4.o();
        pVar4.b(j$.time.temporal.a.NANO_OF_SECOND);
        DateTimeFormatter u4 = pVar4.u(yVar, null);
        p pVar5 = new p();
        pVar5.p();
        pVar5.a(u4);
        pVar5.h();
        pVar5.u(yVar, null);
        p pVar6 = new p();
        pVar6.p();
        pVar6.a(u4);
        pVar6.o();
        pVar6.h();
        pVar6.u(yVar, null);
        p pVar7 = new p();
        pVar7.p();
        pVar7.a(u3);
        pVar7.e('T');
        pVar7.a(u4);
        DateTimeFormatter u5 = pVar7.u(yVar, tVar);
        ISO_LOCAL_DATE_TIME = u5;
        p pVar8 = new p();
        pVar8.p();
        pVar8.a(u5);
        pVar8.r();
        pVar8.h();
        pVar8.s();
        DateTimeFormatter u6 = pVar8.u(yVar, tVar);
        p pVar9 = new p();
        pVar9.a(u6);
        pVar9.o();
        pVar9.e('[');
        pVar9.q();
        pVar9.m();
        pVar9.e(']');
        pVar9.u(yVar, tVar);
        p pVar10 = new p();
        pVar10.a(u5);
        pVar10.o();
        pVar10.h();
        pVar10.o();
        pVar10.e('[');
        pVar10.q();
        pVar10.m();
        pVar10.e(']');
        pVar10.u(yVar, tVar);
        p pVar11 = new p();
        pVar11.p();
        pVar11.l(aVar, 4, 10, zVar);
        pVar11.e('-');
        pVar11.k(j$.time.temporal.a.DAY_OF_YEAR, 3);
        pVar11.o();
        pVar11.h();
        pVar11.u(yVar, tVar);
        p pVar12 = new p();
        pVar12.p();
        pVar12.l(j$.time.temporal.j.f6619c, 4, 10, zVar);
        pVar12.f("-W");
        pVar12.k(j$.time.temporal.j.f6618b, 2);
        pVar12.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        pVar12.k(aVar7, 1);
        pVar12.o();
        pVar12.h();
        pVar12.u(yVar, tVar);
        p pVar13 = new p();
        pVar13.p();
        pVar13.c();
        f6504g = pVar13.u(yVar, null);
        p pVar14 = new p();
        pVar14.p();
        pVar14.k(aVar, 4);
        pVar14.k(aVar2, 2);
        pVar14.k(aVar3, 2);
        pVar14.o();
        pVar14.r();
        pVar14.g("+HHMMss", "Z");
        pVar14.s();
        pVar14.u(yVar, tVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        p pVar15 = new p();
        pVar15.p();
        pVar15.r();
        pVar15.o();
        pVar15.i(aVar7, hashMap);
        pVar15.f(", ");
        pVar15.n();
        pVar15.l(aVar3, 1, 2, z.NOT_NEGATIVE);
        pVar15.e(' ');
        pVar15.i(aVar2, hashMap2);
        pVar15.e(' ');
        pVar15.k(aVar, 4);
        pVar15.e(' ');
        pVar15.k(aVar4, 2);
        pVar15.e(':');
        pVar15.k(aVar5, 2);
        pVar15.o();
        pVar15.e(':');
        pVar15.k(aVar6, 2);
        pVar15.n();
        pVar15.e(' ');
        pVar15.g("+HHMM", "GMT");
        pVar15.u(y.SMART, tVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeFormatter(e eVar, Locale locale, y yVar, j$.time.chrono.t tVar) {
        w wVar = w.f6563a;
        this.f6505a = eVar;
        Objects.requireNonNull(locale, "locale");
        this.f6506b = locale;
        this.f6507c = wVar;
        Objects.requireNonNull(yVar, "resolverStyle");
        this.f6508d = yVar;
        this.f6509e = tVar;
    }

    public final Locale c() {
        return this.f6506b;
    }

    public final w b() {
        return this.f6507c;
    }

    public final j$.time.chrono.m a() {
        return this.f6509e;
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            this.f6505a.m(new t(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public final Object d(CharSequence charSequence, j$.time.h hVar) {
        String charSequence2;
        Objects.requireNonNull(charSequence, "text");
        try {
            return ((x) e(charSequence)).z(hVar);
        } catch (r e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            RuntimeException runtimeException = new RuntimeException("Text '" + charSequence2 + "' could not be parsed: " + e3.getMessage(), e3);
            charSequence.toString();
            throw runtimeException;
        }
    }

    private TemporalAccessor e(CharSequence charSequence) {
        String charSequence2;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, "text");
        q qVar = new q(this);
        int o3 = this.f6505a.o(qVar, charSequence, parsePosition.getIndex());
        if (o3 < 0) {
            parsePosition.setErrorIndex(~o3);
            qVar = null;
        } else {
            parsePosition.setIndex(o3);
        }
        if (qVar == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < charSequence.length()) {
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            if (parsePosition.getErrorIndex() >= 0) {
                String str = "Text '" + charSequence2 + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new r(str, charSequence);
            }
            String str2 = "Text '" + charSequence2 + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new r(str2, charSequence);
        }
        return qVar.s(this.f6508d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final e f() {
        return this.f6505a.a();
    }

    public final String toString() {
        String eVar = this.f6505a.toString();
        return eVar.startsWith("[") ? eVar : eVar.substring(1, eVar.length() - 1);
    }
}
