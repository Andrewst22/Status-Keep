package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* renamed from: androidx.datastore.preferences.protobuf.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193p {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f4285c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final W f4286a = W.f();

    /* renamed from: b  reason: collision with root package name */
    public boolean f4287b;

    static {
        new C0193p(0);
    }

    public C0193p() {
    }

    public static void b(C0188k c0188k, p0 p0Var, int i3, Object obj) {
        if (p0Var == p0.f4289p) {
            c0188k.S0(i3, 3);
            ((AbstractC0178a) obj).b(c0188k);
            c0188k.S0(i3, 4);
            return;
        }
        c0188k.S0(i3, p0Var.f4293n);
        switch (p0Var.ordinal()) {
            case 0:
                c0188k.N0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                c0188k.L0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                c0188k.W0(((Long) obj).longValue());
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                c0188k.W0(((Long) obj).longValue());
                return;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                c0188k.P0(((Integer) obj).intValue());
                return;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                c0188k.N0(((Long) obj).longValue());
                return;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c0188k.L0(((Integer) obj).intValue());
                return;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                c0188k.F0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof C0184g) {
                    c0188k.J0((C0184g) obj);
                    return;
                } else {
                    c0188k.R0((String) obj);
                    return;
                }
            case 9:
                ((AbstractC0178a) obj).b(c0188k);
                return;
            case 10:
                AbstractC0178a abstractC0178a = (AbstractC0178a) obj;
                c0188k.getClass();
                c0188k.U0(((AbstractC0197u) abstractC0178a).a(null));
                abstractC0178a.b(c0188k);
                return;
            case 11:
                if (obj instanceof C0184g) {
                    c0188k.J0((C0184g) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                c0188k.U0(length);
                c0188k.G0(bArr, 0, length);
                return;
            case 12:
                c0188k.U0(((Integer) obj).intValue());
                return;
            case 13:
                c0188k.P0(((Integer) obj).intValue());
                return;
            case 14:
                c0188k.L0(((Integer) obj).intValue());
                return;
            case 15:
                c0188k.N0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0188k.U0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0188k.W0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f4287b) {
            return;
        }
        W w3 = this.f4286a;
        int size = w3.f4212m.size();
        for (int i3 = 0; i3 < size; i3++) {
            Map.Entry c3 = w3.c(i3);
            if (c3.getValue() instanceof AbstractC0197u) {
                AbstractC0197u abstractC0197u = (AbstractC0197u) c3.getValue();
                abstractC0197u.getClass();
                Q q3 = Q.f4198c;
                q3.getClass();
                q3.a(abstractC0197u.getClass()).h(abstractC0197u);
                abstractC0197u.j();
            }
        }
        if (!w3.f4214o) {
            if (w3.f4212m.size() <= 0) {
                Iterator it = w3.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    throw new ClassCastException();
                }
            } else {
                w3.c(0).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!w3.f4214o) {
            if (w3.f4213n.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(w3.f4213n);
            }
            w3.f4213n = unmodifiableMap;
            if (w3.f4216q.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(w3.f4216q);
            }
            w3.f4216q = unmodifiableMap2;
            w3.f4214o = true;
        }
        this.f4287b = true;
    }

    public final Object clone() {
        C0193p c0193p = new C0193p();
        W w3 = this.f4286a;
        if (w3.f4212m.size() <= 0) {
            Iterator it = w3.d().iterator();
            if (!it.hasNext()) {
                return c0193p;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() == null) {
                entry.getValue();
                throw null;
            }
            throw new ClassCastException();
        }
        Map.Entry c3 = w3.c(0);
        if (c3.getKey() == null) {
            c3.getValue();
            throw null;
        }
        throw new ClassCastException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0193p)) {
            return false;
        }
        return this.f4286a.equals(((C0193p) obj).f4286a);
    }

    public final int hashCode() {
        return this.f4286a.hashCode();
    }

    public C0193p(int i3) {
        a();
        a();
    }
}
