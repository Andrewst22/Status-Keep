package L1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* loaded from: classes.dex */
public final class l extends I1.r {

    /* renamed from: b  reason: collision with root package name */
    public static final k f906b = new k(new l(0), 0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f907a;

    public /* synthetic */ l(int i3) {
        this.f907a = i3;
    }

    public static I1.m c(Q1.b bVar) {
        if (bVar instanceof g) {
            g gVar = (g) bVar;
            int w3 = gVar.w();
            if (w3 != 5 && w3 != 2 && w3 != 4 && w3 != 10) {
                I1.m mVar = (I1.m) gVar.F();
                gVar.B();
                return mVar;
            }
            throw new IllegalStateException("Unexpected " + D2.h.v(w3) + " when reading a JsonElement.");
        }
        int b3 = N.j.b(bVar.w());
        I1.o oVar = I1.o.f475m;
        if (b3 != 0) {
            if (b3 != 2) {
                if (b3 != 5) {
                    if (b3 != 6) {
                        if (b3 != 7) {
                            if (b3 == 8) {
                                bVar.s();
                                return oVar;
                            }
                            throw new IllegalArgumentException();
                        }
                        return new I1.q(Boolean.valueOf(bVar.m()));
                    }
                    return new I1.q(new K1.h(bVar.u()));
                }
                return new I1.q(bVar.u());
            }
            I1.p pVar = new I1.p();
            bVar.b();
            while (bVar.j()) {
                String q3 = bVar.q();
                I1.m c3 = c(bVar);
                if (c3 == null) {
                    c3 = oVar;
                }
                pVar.f476m.put(q3, c3);
            }
            bVar.g();
            return pVar;
        }
        I1.l lVar = new I1.l();
        bVar.a();
        while (bVar.j()) {
            I1.m c4 = c(bVar);
            if (c4 == null) {
                c4 = oVar;
            }
            lVar.f474m.add(c4);
        }
        bVar.f();
        return lVar;
    }

    public static void d(Q1.c cVar, I1.m mVar) {
        if (mVar != null && !(mVar instanceof I1.o)) {
            boolean z3 = mVar instanceof I1.q;
            if (z3) {
                if (z3) {
                    I1.q qVar = (I1.q) mVar;
                    Serializable serializable = qVar.f477m;
                    if (serializable instanceof Number) {
                        cVar.o(qVar.d());
                        return;
                    } else if (serializable instanceof Boolean) {
                        cVar.q(qVar.a());
                        return;
                    } else {
                        cVar.p(qVar.c());
                        return;
                    }
                }
                throw new IllegalStateException("Not a JSON Primitive: " + mVar);
            }
            boolean z4 = mVar instanceof I1.l;
            if (z4) {
                cVar.b();
                if (z4) {
                    Iterator it = ((I1.l) mVar).f474m.iterator();
                    while (it.hasNext()) {
                        d(cVar, (I1.m) it.next());
                    }
                    cVar.f();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + mVar);
            } else if (mVar instanceof I1.p) {
                cVar.c();
                Iterator it2 = ((K1.k) mVar.b().f476m.entrySet()).iterator();
                while (((K1.j) it2).hasNext()) {
                    K1.l b3 = ((K1.j) it2).b();
                    cVar.h((String) b3.getKey());
                    d(cVar, (I1.m) b3.getValue());
                }
                cVar.g();
                return;
            } else {
                throw new IllegalArgumentException("Couldn't write " + mVar.getClass());
            }
        }
        cVar.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ed, code lost:
        if (r10.o() != 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f0, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fb, code lost:
        if (java.lang.Integer.parseInt(r1) != 0) goto L76;
     */
    @Override // I1.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Q1.b r10) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.l.a(Q1.b):java.lang.Object");
    }

    @Override // I1.r
    public final void b(Q1.c cVar, Object obj) {
        String valueOf;
        String sb;
        String stringBuffer;
        String externalForm;
        String aSCIIString;
        String hostAddress;
        String uuid;
        String locale;
        String bool;
        switch (this.f907a) {
            case 0:
                cVar.o((Number) obj);
                return;
            case 1:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                cVar.b();
                int length = atomicIntegerArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    cVar.m(atomicIntegerArray.get(i3));
                }
                cVar.f();
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                cVar.o((Number) obj);
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                cVar.o((Number) obj);
                return;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                cVar.o((Number) obj);
                return;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                Character ch = (Character) obj;
                if (ch == null) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(ch);
                }
                cVar.p(valueOf);
                return;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                cVar.p((String) obj);
                return;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                cVar.o((BigDecimal) obj);
                return;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                cVar.o((BigInteger) obj);
                return;
            case 9:
                StringBuilder sb2 = (StringBuilder) obj;
                if (sb2 == null) {
                    sb = null;
                } else {
                    sb = sb2.toString();
                }
                cVar.p(sb);
                return;
            case 10:
                StringBuffer stringBuffer2 = (StringBuffer) obj;
                if (stringBuffer2 == null) {
                    stringBuffer = null;
                } else {
                    stringBuffer = stringBuffer2.toString();
                }
                cVar.p(stringBuffer);
                return;
            case 11:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 12:
                URL url = (URL) obj;
                if (url == null) {
                    externalForm = null;
                } else {
                    externalForm = url.toExternalForm();
                }
                cVar.p(externalForm);
                return;
            case 13:
                URI uri = (URI) obj;
                if (uri == null) {
                    aSCIIString = null;
                } else {
                    aSCIIString = uri.toASCIIString();
                }
                cVar.p(aSCIIString);
                return;
            case 14:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress == null) {
                    hostAddress = null;
                } else {
                    hostAddress = inetAddress.getHostAddress();
                }
                cVar.p(hostAddress);
                return;
            case 15:
                UUID uuid2 = (UUID) obj;
                if (uuid2 == null) {
                    uuid = null;
                } else {
                    uuid = uuid2.toString();
                }
                cVar.p(uuid);
                return;
            case 16:
                cVar.p(((Currency) obj).getCurrencyCode());
                return;
            case 17:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    cVar.j();
                    return;
                }
                cVar.c();
                cVar.h("year");
                cVar.m(calendar.get(1));
                cVar.h("month");
                cVar.m(calendar.get(2));
                cVar.h("dayOfMonth");
                cVar.m(calendar.get(5));
                cVar.h("hourOfDay");
                cVar.m(calendar.get(11));
                cVar.h("minute");
                cVar.m(calendar.get(12));
                cVar.h("second");
                cVar.m(calendar.get(13));
                cVar.g();
                return;
            case 18:
                Locale locale2 = (Locale) obj;
                if (locale2 == null) {
                    locale = null;
                } else {
                    locale = locale2.toString();
                }
                cVar.p(locale);
                return;
            case 19:
                d(cVar, (I1.m) obj);
                return;
            case 20:
                BitSet bitSet = (BitSet) obj;
                cVar.b();
                int length2 = bitSet.length();
                for (int i4 = 0; i4 < length2; i4++) {
                    cVar.m(bitSet.get(i4) ? 1L : 0L);
                }
                cVar.f();
                return;
            case 21:
                cVar.n((Boolean) obj);
                return;
            case 22:
                Boolean bool2 = (Boolean) obj;
                if (bool2 == null) {
                    bool = "null";
                } else {
                    bool = bool2.toString();
                }
                cVar.p(bool);
                return;
            case 23:
                cVar.o((Number) obj);
                return;
            case 24:
                cVar.o((Number) obj);
                return;
            case 25:
                cVar.o((Number) obj);
                return;
            case 26:
                cVar.m(((AtomicInteger) obj).get());
                return;
            default:
                cVar.q(((AtomicBoolean) obj).get());
                return;
        }
    }
}
