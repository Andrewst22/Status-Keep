package K0;

import U.A;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new G0.a(11);

    /* renamed from: n  reason: collision with root package name */
    public final String f709n;

    /* renamed from: o  reason: collision with root package name */
    public final String f710o;

    /* renamed from: p  reason: collision with root package name */
    public final String f711p;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f709n = str;
        this.f710o = str2;
        this.f711p = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (A.a(this.f710o, eVar.f710o) && A.a(this.f709n, eVar.f709n) && A.a(this.f711p, eVar.f711p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4;
        int i5 = 0;
        String str = this.f709n;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (527 + i3) * 31;
        String str2 = this.f710o;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i7 = (i6 + i4) * 31;
        String str3 = this.f711p;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return i7 + i5;
    }

    @Override // K0.i
    public final String toString() {
        return this.f721m + ": language=" + this.f709n + ", description=" + this.f710o + ", text=" + this.f711p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f721m);
        parcel.writeString(this.f709n);
        parcel.writeString(this.f711p);
    }

    public e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i3 = A.f2405a;
        this.f709n = readString;
        this.f710o = parcel.readString();
        this.f711p = parcel.readString();
    }
}
