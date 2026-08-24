package N;

import U.m;
import androidx.datastore.preferences.protobuf.AbstractC0195s;
import androidx.datastore.preferences.protobuf.AbstractC0197u;
import androidx.datastore.preferences.protobuf.C0186i;
import androidx.datastore.preferences.protobuf.C0190m;
import androidx.datastore.preferences.protobuf.C0201y;
import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.a0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class f extends AbstractC0197u {
    private static final f DEFAULT_INSTANCE;
    private static volatile P PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private G preferences_ = G.f4173n;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0197u.l(f.class, fVar);
    }

    public static G n(f fVar) {
        G g3 = fVar.preferences_;
        if (!g3.f4174m) {
            fVar.preferences_ = g3.b();
        }
        return fVar.preferences_;
    }

    public static d p() {
        return (d) ((AbstractC0195s) DEFAULT_INSTANCE.e(5));
    }

    public static f q(InputStream inputStream) {
        f fVar = DEFAULT_INSTANCE;
        C0186i c0186i = new C0186i(inputStream);
        C0190m a3 = C0190m.a();
        AbstractC0197u k3 = fVar.k();
        try {
            Q q3 = Q.f4198c;
            q3.getClass();
            U a4 = q3.a(k3.getClass());
            m mVar = c0186i.f4271b;
            if (mVar == null) {
                mVar = new m(c0186i);
            }
            a4.d(k3, mVar, a3);
            a4.h(k3);
            if (AbstractC0197u.h(k3, true)) {
                return (f) k3;
            }
            throw new IOException(new a0().getMessage());
        } catch (a0 e2) {
            throw new IOException(e2.getMessage());
        } catch (C0201y e3) {
            if (e3.f4315m) {
                throw new IOException(e3.getMessage(), e3);
            }
            throw e3;
        } catch (IOException e4) {
            if (e4.getCause() instanceof C0201y) {
                throw ((C0201y) e4.getCause());
            }
            throw new IOException(e4.getMessage(), e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof C0201y) {
                throw ((C0201y) e5.getCause());
            }
            throw e5;
        }
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [androidx.datastore.preferences.protobuf.P, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0197u
    public final Object e(int i3) {
        switch (j.b(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new T(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f1109a});
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new f();
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new AbstractC0195s(DEFAULT_INSTANCE);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                P p3 = PARSER;
                P p4 = p3;
                if (p3 == null) {
                    synchronized (f.class) {
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

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
