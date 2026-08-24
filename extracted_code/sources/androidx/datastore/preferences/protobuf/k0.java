package androidx.datastore.preferences.protobuf;

import a.AbstractC0155a;
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final AbstractC0155a f4279a;

    static {
        i0 i0Var;
        if (h0.f4258e && h0.f4257d && !AbstractC0180c.a()) {
            i0Var = new i0(1);
        } else {
            i0Var = new i0(0);
        }
        f4279a = i0Var;
    }

    public static int a(String str) {
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length && str.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            char charAt = str.charAt(i4);
            if (charAt < 2048) {
                i5 += (127 - charAt) >>> 31;
                i4++;
            } else {
                int length2 = str.length();
                while (i4 < length2) {
                    char charAt2 = str.charAt(i4);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i4) >= 65536) {
                                i4++;
                            } else {
                                throw new j0(i4, length2);
                            }
                        }
                    }
                    i4++;
                }
                i5 += i3;
            }
        }
        if (i5 >= length) {
            return i5;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i5 + 4294967296L));
    }
}
