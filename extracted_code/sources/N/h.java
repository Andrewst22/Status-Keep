package N;

import androidx.datastore.preferences.protobuf.AbstractC0179b;
import androidx.datastore.preferences.protobuf.AbstractC0195s;
import androidx.datastore.preferences.protobuf.AbstractC0197u;
import androidx.datastore.preferences.protobuf.AbstractC0199w;
import androidx.datastore.preferences.protobuf.InterfaceC0198v;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.T;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
/* loaded from: classes.dex */
public final class h extends AbstractC0197u {
    private static final h DEFAULT_INSTANCE;
    private static volatile P PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0198v strings_ = S.f4201p;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0197u.l(h.class, hVar);
    }

    public static void n(h hVar, Set set) {
        int i3;
        InterfaceC0198v interfaceC0198v = hVar.strings_;
        if (!((AbstractC0179b) interfaceC0198v).f4226m) {
            S s3 = (S) interfaceC0198v;
            int i4 = s3.f4203o;
            if (i4 == 0) {
                i3 = 10;
            } else {
                i3 = i4 * 2;
            }
            hVar.strings_ = s3.c(i3);
        }
        InterfaceC0198v interfaceC0198v2 = hVar.strings_;
        Charset charset = AbstractC0199w.f4313a;
        set.getClass();
        if (interfaceC0198v2 instanceof ArrayList) {
            ((ArrayList) interfaceC0198v2).ensureCapacity(set.size() + ((S) interfaceC0198v2).f4203o);
        }
        S s4 = (S) interfaceC0198v2;
        int i5 = s4.f4203o;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (s4.f4203o - i5) + " is null.";
                for (int i6 = s4.f4203o - 1; i6 >= i5; i6--) {
                    s4.remove(i6);
                }
                throw new NullPointerException(str);
            }
            s4.add(obj);
        }
    }

    public static h o() {
        return DEFAULT_INSTANCE;
    }

    public static g q() {
        return (g) ((AbstractC0195s) DEFAULT_INSTANCE.e(5));
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [androidx.datastore.preferences.protobuf.P, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0197u
    public final Object e(int i3) {
        switch (j.b(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new T(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new h();
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new AbstractC0195s(DEFAULT_INSTANCE);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                P p3 = PARSER;
                P p4 = p3;
                if (p3 == null) {
                    synchronized (h.class) {
                        try {
                            P p5 = PARSER;
                            P p6 = p5;
                            if (p5 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                p6 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return p4;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final InterfaceC0198v p() {
        return this.strings_;
    }
}
