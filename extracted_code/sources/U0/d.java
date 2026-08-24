package U0;

import D1.AbstractC0046z;
import D1.C0044x;
import D1.a0;
import N.k;
import R.C0113p;
import b1.C0214d;
import b1.C0215e;
import c0.C0222b;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k0.C0554i;
import r0.C0753f;
import r0.C0754g;
import r0.m;
import r0.p;
import r0.q;
import s0.r;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f2528m;

    public /* synthetic */ d(int i3) {
        this.f2528m = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        a0 a3;
        switch (this.f2528m) {
            case 0:
                return Integer.compare(((e) obj2).f2531b, ((e) obj).f2531b);
            case 1:
                C0222b c0222b = (C0222b) obj;
                C0222b c0222b2 = (C0222b) obj2;
                int compare = Integer.compare(c0222b.f4711c, c0222b2.f4711c);
                if (compare == 0) {
                    return c0222b.f4710b.compareTo(c0222b2.f4710b);
                }
                return compare;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return Integer.compare(((C0215e) obj).f4660a.f4663b, ((C0215e) obj2).f4660a.f4663b);
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return Long.compare(((C0214d) obj).f4657b, ((C0214d) obj2).f4657b);
            case k.LONG_FIELD_NUMBER /* 4 */:
                return f2.c.b(((C0554i) obj).f7602a.f7598c, ((C0554i) obj2).f7602a.f7598c);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return ((C0113p) obj2).f1970i - ((C0113p) obj).f1970i;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                return Integer.compare(((C0754g) ((List) obj).get(0)).f8934r, ((C0754g) ((List) obj2).get(0)).f8934r);
            case k.BYTES_FIELD_NUMBER /* 8 */:
                return ((C0753f) Collections.max((List) obj)).compareTo((C0753f) Collections.max((List) obj2));
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C0044x.f(p.c((p) Collections.max(list, new d(11)), (p) Collections.max(list2, new d(11)))).a(list.size(), list2.size()).b((p) Collections.max(list, new d(12)), (p) Collections.max(list2, new d(12)), new d(12)).e();
            case 10:
                return ((m) ((List) obj).get(0)).compareTo((m) ((List) obj2).get(0));
            case 11:
                return p.c((p) obj, (p) obj2);
            case 12:
                p pVar = (p) obj;
                p pVar2 = (p) obj2;
                if (pVar.f8976q && pVar.f8979t) {
                    a3 = q.f8985i;
                } else {
                    a3 = q.f8985i.a();
                }
                C0044x c0044x = AbstractC0046z.f317a;
                pVar.f8977r.getClass();
                return c0044x.b(Integer.valueOf(pVar.f8982w), Integer.valueOf(pVar2.f8982w), a3).b(Integer.valueOf(pVar.f8981v), Integer.valueOf(pVar2.f8981v), a3).e();
            case 13:
                return ((r) obj).f9210a - ((r) obj2).f9210a;
            case 14:
                return Float.compare(((r) obj).f9212c, ((r) obj2).f9212c);
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b3 = bArr[i3];
                    byte b4 = bArr2[i3];
                    if (b3 != b4) {
                        return b3 - b4;
                    }
                }
                return 0;
        }
    }
}
