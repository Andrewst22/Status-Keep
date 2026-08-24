package R;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class O implements Comparable, Parcelable {
    public static final Parcelable.Creator<O> CREATOR = new D(1);

    /* renamed from: m  reason: collision with root package name */
    public final int f1792m;

    /* renamed from: n  reason: collision with root package name */
    public final int f1793n;

    /* renamed from: o  reason: collision with root package name */
    public final int f1794o;

    static {
        U.A.H(0);
        U.A.H(1);
        U.A.H(2);
    }

    public O() {
        this.f1792m = -1;
        this.f1793n = -1;
        this.f1794o = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        O o3 = (O) obj;
        int i3 = this.f1792m - o3.f1792m;
        if (i3 == 0) {
            int i4 = this.f1793n - o3.f1793n;
            if (i4 == 0) {
                return this.f1794o - o3.f1794o;
            }
            return i4;
        }
        return i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || O.class != obj.getClass()) {
            return false;
        }
        O o3 = (O) obj;
        if (this.f1792m == o3.f1792m && this.f1793n == o3.f1793n && this.f1794o == o3.f1794o) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f1792m * 31) + this.f1793n) * 31) + this.f1794o;
    }

    public final String toString() {
        return this.f1792m + "." + this.f1793n + "." + this.f1794o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1792m);
        parcel.writeInt(this.f1793n);
        parcel.writeInt(this.f1794o);
    }

    public O(Parcel parcel) {
        this.f1792m = parcel.readInt();
        this.f1793n = parcel.readInt();
        this.f1794o = parcel.readInt();
    }
}
