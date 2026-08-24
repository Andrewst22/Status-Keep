package R;

import U.AbstractC0123a;
import a.AbstractC0155a;
import android.text.TextUtils;
/* renamed from: R.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105h {

    /* renamed from: a  reason: collision with root package name */
    public int f1892a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f1893b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f1894c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f1895d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f1896e = -1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, R.h] */
    public static C0105h c(String str) {
        char c3;
        AbstractC0123a.e(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        for (int i7 = 0; i7 < split.length; i7++) {
            String L = AbstractC0155a.L(split[i7].trim());
            L.getClass();
            switch (L.hashCode()) {
                case 100571:
                    if (L.equals("end")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3556653:
                    if (L.equals("text")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109757538:
                    if (L.equals("start")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109780401:
                    if (L.equals("style")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    i4 = i7;
                    break;
                case 1:
                    i5 = i7;
                    break;
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    i3 = i7;
                    break;
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    i6 = i7;
                    break;
            }
        }
        if (i3 != -1 && i4 != -1 && i5 != -1) {
            int length = split.length;
            ?? obj = new Object();
            obj.f1892a = i3;
            obj.f1893b = i4;
            obj.f1894c = i6;
            obj.f1895d = i5;
            obj.f1896e = length;
            return obj;
        }
        return null;
    }

    public boolean a() {
        int i3;
        int i4;
        int i5;
        int i6 = this.f1892a;
        int i7 = 2;
        if ((i6 & 7) != 0) {
            int i8 = this.f1895d;
            int i9 = this.f1893b;
            if (i8 > i9) {
                i5 = 1;
            } else if (i8 == i9) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            if ((i5 & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 112) != 0) {
            int i10 = this.f1895d;
            int i11 = this.f1894c;
            if (i10 > i11) {
                i4 = 1;
            } else if (i10 == i11) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            if (((i4 << 4) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 1792) != 0) {
            int i12 = this.f1896e;
            int i13 = this.f1893b;
            if (i12 > i13) {
                i3 = 1;
            } else if (i12 == i13) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            if (((i3 << 8) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 28672) != 0) {
            int i14 = this.f1896e;
            int i15 = this.f1894c;
            if (i14 > i15) {
                i7 = 1;
            } else if (i14 != i15) {
                i7 = 4;
            }
            if ((i6 & (i7 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    public C0106i b() {
        return new C0106i(this.f1892a, this.f1893b, this.f1894c, this.f1895d, this.f1896e, null);
    }

    public void d(int i3) {
        this.f1896e = i3;
    }

    public void e(int i3) {
        this.f1893b = i3;
    }

    public void f(int i3) {
        this.f1892a = i3;
    }

    public void g(int i3) {
        this.f1894c = i3;
    }

    public void h(int i3) {
        this.f1895d = i3;
    }
}
