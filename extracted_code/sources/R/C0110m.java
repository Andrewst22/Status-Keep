package R;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
/* renamed from: R.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0110m implements Comparator, Parcelable {
    public static final Parcelable.Creator<C0110m> CREATOR = new G0.a(28);

    /* renamed from: m  reason: collision with root package name */
    public final C0109l[] f1912m;

    /* renamed from: n  reason: collision with root package name */
    public int f1913n;

    /* renamed from: o  reason: collision with root package name */
    public final String f1914o;

    /* renamed from: p  reason: collision with root package name */
    public final int f1915p;

    public C0110m(String str, ArrayList arrayList) {
        this(str, false, (C0109l[]) arrayList.toArray(new C0109l[0]));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0109l c0109l = (C0109l) obj;
        C0109l c0109l2 = (C0109l) obj2;
        UUID uuid = AbstractC0104g.f1887a;
        if (uuid.equals(c0109l.f1908n)) {
            if (uuid.equals(c0109l2.f1908n)) {
                return 0;
            }
            return 1;
        }
        return c0109l.f1908n.compareTo(c0109l2.f1908n);
    }

    public final C0110m d(String str) {
        if (U.A.a(this.f1914o, str)) {
            return this;
        }
        return new C0110m(str, false, this.f1912m);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0110m.class != obj.getClass()) {
            return false;
        }
        C0110m c0110m = (C0110m) obj;
        if (U.A.a(this.f1914o, c0110m.f1914o) && Arrays.equals(this.f1912m, c0110m.f1912m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f1913n == 0) {
            String str = this.f1914o;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f1913n = (hashCode * 31) + Arrays.hashCode(this.f1912m);
        }
        return this.f1913n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f1914o);
        parcel.writeTypedArray(this.f1912m, 0);
    }

    public C0110m(C0109l... c0109lArr) {
        this(null, true, c0109lArr);
    }

    public C0110m(String str, boolean z3, C0109l... c0109lArr) {
        this.f1914o = str;
        c0109lArr = z3 ? (C0109l[]) c0109lArr.clone() : c0109lArr;
        this.f1912m = c0109lArr;
        this.f1915p = c0109lArr.length;
        Arrays.sort(c0109lArr, this);
    }

    public C0110m(Parcel parcel) {
        this.f1914o = parcel.readString();
        C0109l[] c0109lArr = (C0109l[]) parcel.createTypedArray(C0109l.CREATOR);
        int i3 = U.A.f2405a;
        this.f1912m = c0109lArr;
        this.f1915p = c0109lArr.length;
    }
}
