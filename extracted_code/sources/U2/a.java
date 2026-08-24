package U2;

import D2.h;
import K1.i;
import T2.l;
import T2.p;
import T2.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import n2.AbstractC0664g;
import s2.C0803b;
import t2.AbstractC0827d;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f2581a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final LinkedHashMap a(ArrayList arrayList) {
        List<e> asList;
        String str = l.f2379n;
        l q3 = B1.b.q("/", false);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0664g.q(1));
        C0803b c0803b = new C0803b[]{new C0803b(q3, new e(q3))}[0];
        linkedHashMap.put(c0803b.f9222m, c0803b.f9223n);
        i iVar = new i(1);
        if (arrayList.size() <= 1) {
            asList = AbstractC0827d.H(arrayList);
        } else {
            Object[] array = arrayList.toArray(new Object[0]);
            D2.i.e(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, iVar);
            }
            asList = Arrays.asList(array);
            D2.i.d(asList, "asList(...)");
        }
        for (e eVar : asList) {
            if (((e) linkedHashMap.put(eVar.f2591a, eVar)) == null) {
                while (true) {
                    l lVar = eVar.f2591a;
                    l c3 = lVar.c();
                    if (c3 != null) {
                        e eVar2 = (e) linkedHashMap.get(c3);
                        if (eVar2 != null) {
                            eVar2.f2596f.add(lVar);
                            break;
                        }
                        e eVar3 = new e(c3);
                        linkedHashMap.put(c3, eVar3);
                        eVar3.f2596f.add(lVar);
                        eVar = eVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String b(int i3) {
        android.support.v4.media.session.a.g(16);
        String num = Integer.toString(i3, 16);
        D2.i.d(num, "toString(this, checkRadix(radix))");
        return "0x".concat(num);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, D2.p] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, D2.p] */
    /* JADX WARN: Type inference failed for: r5v2, types: [D2.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, D2.p] */
    public static final e c(p pVar) {
        int a3;
        Long valueOf;
        int i3;
        long j3;
        if (pVar.a() == 33639248) {
            pVar.g(4L);
            short c3 = pVar.c();
            int i4 = c3 & 65535;
            if ((c3 & 1) == 0) {
                int c4 = pVar.c() & 65535;
                short c5 = pVar.c();
                int i5 = c5 & 65535;
                short c6 = pVar.c();
                int i6 = c6 & 65535;
                if (i5 == -1) {
                    valueOf = null;
                } else {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.set(14, 0);
                    gregorianCalendar.set(((i6 >> 9) & 127) + 1980, ((i6 >> 5) & 15) - 1, c6 & 31, (i5 >> 11) & 31, (i5 >> 5) & 63, (c5 & 31) << 1);
                    valueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
                }
                Long l3 = valueOf;
                pVar.a();
                ?? obj = new Object();
                obj.f341m = pVar.a() & 4294967295L;
                ?? obj2 = new Object();
                obj2.f341m = pVar.a() & 4294967295L;
                int c7 = pVar.c() & 65535;
                int c8 = pVar.c() & 65535;
                pVar.g(8L);
                ?? obj3 = new Object();
                obj3.f341m = pVar.a() & 4294967295L;
                String d3 = pVar.d(pVar.c() & 65535);
                if (J2.i.V(d3, (char) 0, false, 2) < 0) {
                    if (obj2.f341m == 4294967295L) {
                        j3 = 8;
                        i3 = c4;
                    } else {
                        i3 = c4;
                        j3 = 0;
                    }
                    if (obj.f341m == 4294967295L) {
                        j3 += 8;
                    }
                    if (obj3.f341m == 4294967295L) {
                        j3 += 8;
                    }
                    long j4 = j3;
                    ?? obj4 = new Object();
                    d(pVar, c7, new f(obj4, j4, obj2, pVar, obj, obj3));
                    if (j4 > 0 && !obj4.f339m) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    String d4 = pVar.d(c8);
                    String str = l.f2379n;
                    return new e(B1.b.q("/", false).d(d3), J2.i.R(d3, "/", false), d4, obj.f341m, obj2.f341m, i3, l3, obj3.f341m);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i4));
        }
        throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(a3));
    }

    public static final void d(p pVar, int i3, C2.p pVar2) {
        long j3 = i3;
        while (j3 != 0) {
            if (j3 >= 4) {
                int c3 = pVar.c() & 65535;
                long c4 = pVar.c() & 65535;
                long j4 = j3 - 4;
                if (j4 >= c4) {
                    pVar.f(c4);
                    T2.a aVar = pVar.f2387n;
                    long j5 = aVar.f2353n;
                    pVar2.i(Integer.valueOf(c3), Long.valueOf(c4));
                    long j6 = (aVar.f2353n + c4) - j5;
                    int i4 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
                    if (i4 >= 0) {
                        if (i4 > 0) {
                            aVar.i(j6);
                        }
                        j3 = j4 - c4;
                    } else {
                        throw new IOException(h.k("unsupported zip: too many bytes processed for ", c3));
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    public static final int e(s sVar, int i3) {
        int i4;
        D2.i.e(sVar, "<this>");
        int i5 = i3 + 1;
        int length = sVar.f2399q.length;
        int[] iArr = sVar.f2400r;
        D2.i.e(iArr, "<this>");
        int i6 = length - 1;
        int i7 = 0;
        while (true) {
            if (i7 <= i6) {
                i4 = (i7 + i6) >>> 1;
                int i8 = iArr[i4];
                if (i8 < i5) {
                    i7 = i4 + 1;
                } else if (i8 <= i5) {
                    break;
                } else {
                    i6 = i4 - 1;
                }
            } else {
                i4 = (-i7) - 1;
                break;
            }
        }
        if (i4 < 0) {
            return ~i4;
        }
        return i4;
    }
}
