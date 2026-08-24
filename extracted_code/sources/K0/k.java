package K0;

import U.A;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new G0.a(13);

    /* renamed from: n  reason: collision with root package name */
    public final String f723n;

    /* renamed from: o  reason: collision with root package name */
    public final String f724o;

    /* renamed from: p  reason: collision with root package name */
    public final String f725p;

    public k(String str, String str2, String str3) {
        super("----");
        this.f723n = str;
        this.f724o = str2;
        this.f725p = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (A.a(this.f724o, kVar.f724o) && A.a(this.f723n, kVar.f723n) && A.a(this.f725p, kVar.f725p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4;
        int i5 = 0;
        String str = this.f723n;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (527 + i3) * 31;
        String str2 = this.f724o;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i7 = (i6 + i4) * 31;
        String str3 = this.f725p;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return i7 + i5;
    }

    @Override // K0.i
    public final String toString() {
        return this.f721m + ": domain=" + this.f723n + ", description=" + this.f724o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f721m);
        parcel.writeString(this.f723n);
        parcel.writeString(this.f725p);
    }

    public k(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i3 = A.f2405a;
        this.f723n = readString;
        this.f724o = parcel.readString();
        this.f725p = parcel.readString();
    }
}
