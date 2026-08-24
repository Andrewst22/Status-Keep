package G1;

import a.AbstractC0155a;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f378o = 0;

    /* renamed from: m  reason: collision with root package name */
    public final int[] f379m;

    /* renamed from: n  reason: collision with root package name */
    public final int f380n;

    static {
        new a(new int[0]);
    }

    public a(int[] iArr) {
        int length = iArr.length;
        this.f379m = iArr;
        this.f380n = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i3 = aVar.f380n;
        int i4 = this.f380n;
        if (i4 != i3) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            AbstractC0155a.l(i5, i4);
            int i6 = this.f379m[i5];
            AbstractC0155a.l(i5, aVar.f380n);
            if (i6 != aVar.f379m[i5]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i3 = 1;
        for (int i4 = 0; i4 < this.f380n; i4++) {
            i3 = (i3 * 31) + this.f379m[i4];
        }
        return i3;
    }

    public final String toString() {
        int i3 = this.f380n;
        if (i3 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i3 * 5);
        sb.append('[');
        int[] iArr = this.f379m;
        sb.append(iArr[0]);
        for (int i4 = 1; i4 < i3; i4++) {
            sb.append(", ");
            sb.append(iArr[i4]);
        }
        sb.append(']');
        return sb.toString();
    }
}
