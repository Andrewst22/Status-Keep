package O;

import N.j;
import N.k;
import T2.m;
import T2.n;
import T2.o;
import T2.p;
import androidx.datastore.preferences.protobuf.AbstractC0197u;
import androidx.datastore.preferences.protobuf.AbstractC0199w;
import androidx.datastore.preferences.protobuf.C0184g;
import androidx.datastore.preferences.protobuf.C0188k;
import androidx.datastore.preferences.protobuf.C0201y;
import androidx.datastore.preferences.protobuf.InterfaceC0198v;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import t2.AbstractC0827d;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f1196a = new Object();

    public final b a(p pVar) {
        int i3;
        byte[] bArr;
        try {
            N.f q3 = N.f.q(new o(pVar));
            b bVar = new b(false);
            f[] fVarArr = (f[]) Arrays.copyOf(new f[0], 0);
            D2.i.e(fVarArr, "pairs");
            bVar.b();
            if (fVarArr.length <= 0) {
                Map o3 = q3.o();
                D2.i.d(o3, "preferencesProto.preferencesMap");
                for (Map.Entry entry : o3.entrySet()) {
                    String str = (String) entry.getKey();
                    k kVar = (k) entry.getValue();
                    D2.i.d(str, "name");
                    D2.i.d(kVar, "value");
                    int E3 = kVar.E();
                    if (E3 == 0) {
                        i3 = -1;
                    } else {
                        i3 = h.f1195a[j.b(E3)];
                    }
                    switch (i3) {
                        case -1:
                            throw new IOException("Value case is null.", null);
                        case 0:
                        default:
                            throw new RuntimeException();
                        case 1:
                            bVar.d(new e(str), Boolean.valueOf(kVar.v()));
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            bVar.d(new e(str), Float.valueOf(kVar.z()));
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            bVar.d(new e(str), Double.valueOf(kVar.y()));
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            bVar.d(new e(str), Integer.valueOf(kVar.A()));
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            bVar.d(new e(str), Long.valueOf(kVar.B()));
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            e eVar = new e(str);
                            String C3 = kVar.C();
                            D2.i.d(C3, "value.string");
                            bVar.d(eVar, C3);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            e eVar2 = new e(str);
                            InterfaceC0198v p3 = kVar.D().p();
                            D2.i.d(p3, "value.stringSet.stringsList");
                            bVar.d(eVar2, AbstractC0827d.I(p3));
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            e eVar3 = new e(str);
                            C0184g w3 = kVar.w();
                            int size = w3.size();
                            if (size == 0) {
                                bArr = AbstractC0199w.f4314b;
                            } else {
                                byte[] bArr2 = new byte[size];
                                w3.d(bArr2, size);
                                bArr = bArr2;
                            }
                            D2.i.d(bArr, "value.bytes.toByteArray()");
                            bVar.d(eVar3, bArr);
                            break;
                        case 9:
                            throw new IOException("Value not set.", null);
                    }
                }
                return new b(new LinkedHashMap(bVar.a()), true);
            }
            f fVar = fVarArr[0];
            throw null;
        } catch (C0201y e2) {
            throw new IOException("Unable to parse preferences proto.", e2);
        }
    }

    public final void b(Object obj, n nVar) {
        AbstractC0197u a3;
        Map a4 = ((b) obj).a();
        N.d p3 = N.f.p();
        for (Map.Entry entry : a4.entrySet()) {
            Object value = entry.getValue();
            String str = ((e) entry.getKey()).f1191a;
            if (value instanceof Boolean) {
                N.i F3 = k.F();
                boolean booleanValue = ((Boolean) value).booleanValue();
                F3.c();
                k.s((k) F3.f4312n, booleanValue);
                a3 = F3.a();
            } else if (value instanceof Float) {
                N.i F4 = k.F();
                float floatValue = ((Number) value).floatValue();
                F4.c();
                k.t((k) F4.f4312n, floatValue);
                a3 = F4.a();
            } else if (value instanceof Double) {
                N.i F5 = k.F();
                double doubleValue = ((Number) value).doubleValue();
                F5.c();
                k.q((k) F5.f4312n, doubleValue);
                a3 = F5.a();
            } else if (value instanceof Integer) {
                N.i F6 = k.F();
                int intValue = ((Number) value).intValue();
                F6.c();
                k.u((k) F6.f4312n, intValue);
                a3 = F6.a();
            } else if (value instanceof Long) {
                N.i F7 = k.F();
                long longValue = ((Number) value).longValue();
                F7.c();
                k.n((k) F7.f4312n, longValue);
                a3 = F7.a();
            } else if (value instanceof String) {
                N.i F8 = k.F();
                F8.c();
                k.o((k) F8.f4312n, (String) value);
                a3 = F8.a();
            } else if (value instanceof Set) {
                N.i F9 = k.F();
                N.g q3 = N.h.q();
                D2.i.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                q3.c();
                N.h.n((N.h) q3.f4312n, (Set) value);
                F9.c();
                k.p((k) F9.f4312n, (N.h) q3.a());
                a3 = F9.a();
            } else if (value instanceof byte[]) {
                N.i F10 = k.F();
                byte[] bArr = (byte[]) value;
                C0184g c0184g = C0184g.f4242o;
                C0184g c3 = C0184g.c(bArr, 0, bArr.length);
                F10.c();
                k.r((k) F10.f4312n, c3);
                a3 = F10.a();
            } else {
                throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
            }
            p3.getClass();
            str.getClass();
            p3.c();
            N.f.n((N.f) p3.f4312n).put(str, (k) a3);
        }
        N.f fVar = (N.f) p3.a();
        m mVar = new m(nVar);
        int a5 = fVar.a(null);
        Logger logger = C0188k.f4272g;
        if (a5 > 4096) {
            a5 = 4096;
        }
        C0188k c0188k = new C0188k(mVar, a5);
        fVar.b(c0188k);
        if (c0188k.f4277e > 0) {
            c0188k.D0();
        }
    }
}
