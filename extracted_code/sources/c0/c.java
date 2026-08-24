package C0;

import U.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: b  reason: collision with root package name */
    public long f139b;

    /* renamed from: c  reason: collision with root package name */
    public long[] f140c;

    /* renamed from: d  reason: collision with root package name */
    public long[] f141d;

    public static Serializable j(int i3, t tVar) {
        if (i3 != 0) {
            boolean z3 = true;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 8) {
                            if (i3 != 10) {
                                if (i3 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(tVar.o()));
                                tVar.H(2);
                                return date;
                            }
                            int y3 = tVar.y();
                            ArrayList arrayList = new ArrayList(y3);
                            for (int i4 = 0; i4 < y3; i4++) {
                                Serializable j3 = j(tVar.u(), tVar);
                                if (j3 != null) {
                                    arrayList.add(j3);
                                }
                            }
                            return arrayList;
                        }
                        return k(tVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String l3 = l(tVar);
                        int u3 = tVar.u();
                        if (u3 == 9) {
                            return hashMap;
                        }
                        Serializable j4 = j(u3, tVar);
                        if (j4 != null) {
                            hashMap.put(l3, j4);
                        }
                    }
                } else {
                    return l(tVar);
                }
            } else {
                if (tVar.u() != 1) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(tVar.o()));
        }
    }

    public static HashMap k(t tVar) {
        int y3 = tVar.y();
        HashMap hashMap = new HashMap(y3);
        for (int i3 = 0; i3 < y3; i3++) {
            String l3 = l(tVar);
            Serializable j3 = j(tVar.u(), tVar);
            if (j3 != null) {
                hashMap.put(l3, j3);
            }
        }
        return hashMap;
    }

    public static String l(t tVar) {
        int A3 = tVar.A();
        int i3 = tVar.f2478b;
        tVar.H(A3);
        return new String(tVar.f2477a, i3, A3);
    }
}
