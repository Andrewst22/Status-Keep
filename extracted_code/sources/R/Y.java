package R;

import U.AbstractC0123a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a  reason: collision with root package name */
    public final int f1861a;

    /* renamed from: b  reason: collision with root package name */
    public final U f1862b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1863c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f1864d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean[] f1865e;

    static {
        U.A.H(0);
        U.A.H(1);
        U.A.H(3);
        U.A.H(4);
    }

    public Y(U u3, boolean z3, int[] iArr, boolean[] zArr) {
        boolean z4;
        int i3 = u3.f1821a;
        this.f1861a = i3;
        boolean z5 = false;
        if (i3 == iArr.length && i3 == zArr.length) {
            z4 = true;
        } else {
            z4 = false;
        }
        AbstractC0123a.e(z4);
        this.f1862b = u3;
        if (z3 && i3 > 1) {
            z5 = true;
        }
        this.f1863c = z5;
        this.f1864d = (int[]) iArr.clone();
        this.f1865e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y.class != obj.getClass()) {
            return false;
        }
        Y y3 = (Y) obj;
        if (this.f1863c == y3.f1863c && this.f1862b.equals(y3.f1862b) && Arrays.equals(this.f1864d, y3.f1864d) && Arrays.equals(this.f1865e, y3.f1865e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f1864d);
        return Arrays.hashCode(this.f1865e) + ((hashCode + (((this.f1862b.hashCode() * 31) + (this.f1863c ? 1 : 0)) * 31)) * 31);
    }
}
