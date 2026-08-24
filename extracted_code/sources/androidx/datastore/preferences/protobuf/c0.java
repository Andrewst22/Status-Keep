package androidx.datastore.preferences.protobuf;

import java.io.IOException;
/* loaded from: classes.dex */
public final class c0 {
    public static b0 a(Object obj) {
        AbstractC0197u abstractC0197u = (AbstractC0197u) obj;
        b0 b0Var = abstractC0197u.unknownFields;
        if (b0Var == b0.f4227f) {
            b0 b0Var2 = new b0(0, new int[8], new Object[8], true);
            abstractC0197u.unknownFields = b0Var2;
            return b0Var2;
        }
        return b0Var;
    }

    public static void b(Object obj) {
        b0 b0Var = ((AbstractC0197u) obj).unknownFields;
        if (b0Var.f4232e) {
            b0Var.f4232e = false;
        }
    }

    public static boolean c(int i3, U.m mVar, Object obj) {
        int i4 = mVar.f2454a;
        int i5 = i4 >>> 3;
        int i6 = i4 & 7;
        AbstractC0187j abstractC0187j = (AbstractC0187j) mVar.f2457d;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            return false;
                        }
                        if (i6 == 5) {
                            mVar.y(5);
                            ((b0) obj).c(5 | (i5 << 3), Integer.valueOf(abstractC0187j.j()));
                            return true;
                        }
                        throw C0201y.b();
                    }
                    b0 b0Var = new b0(0, new int[8], new Object[8], true);
                    int i7 = i5 << 3;
                    int i8 = i7 | 4;
                    int i9 = i3 + 1;
                    if (i9 < 100) {
                        while (mVar.b() != Integer.MAX_VALUE && c(i9, mVar, b0Var)) {
                        }
                        if (i8 == mVar.f2454a) {
                            if (b0Var.f4232e) {
                                b0Var.f4232e = false;
                            }
                            ((b0) obj).c(i7 | 3, b0Var);
                            return true;
                        }
                        throw new IOException("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                ((b0) obj).c((i5 << 3) | 2, mVar.f());
                return true;
            }
            mVar.y(1);
            ((b0) obj).c((i5 << 3) | 1, Long.valueOf(abstractC0187j.k()));
            return true;
        }
        mVar.y(0);
        ((b0) obj).c(i5 << 3, Long.valueOf(abstractC0187j.n()));
        return true;
    }
}
