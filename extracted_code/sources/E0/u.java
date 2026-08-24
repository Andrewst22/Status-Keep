package e0;

import R.D;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new D(16);

    /* renamed from: m  reason: collision with root package name */
    public final int f5383m;

    /* renamed from: n  reason: collision with root package name */
    public final int f5384n;

    /* renamed from: o  reason: collision with root package name */
    public final String f5385o;

    /* renamed from: p  reason: collision with root package name */
    public final String f5386p;

    /* renamed from: q  reason: collision with root package name */
    public final String f5387q;

    /* renamed from: r  reason: collision with root package name */
    public final String f5388r;

    public u(int i3, int i4, String str, String str2, String str3, String str4) {
        this.f5383m = i3;
        this.f5384n = i4;
        this.f5385o = str;
        this.f5386p = str2;
        this.f5387q = str3;
        this.f5388r = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f5383m == uVar.f5383m && this.f5384n == uVar.f5384n && TextUtils.equals(this.f5385o, uVar.f5385o) && TextUtils.equals(this.f5386p, uVar.f5386p) && TextUtils.equals(this.f5387q, uVar.f5387q) && TextUtils.equals(this.f5388r, uVar.f5388r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4;
        int i5;
        int i6 = ((this.f5383m * 31) + this.f5384n) * 31;
        int i7 = 0;
        String str = this.f5385o;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i6 + i3) * 31;
        String str2 = this.f5386p;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str3 = this.f5387q;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        String str4 = this.f5388r;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i10 + i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f5383m);
        parcel.writeInt(this.f5384n);
        parcel.writeString(this.f5385o);
        parcel.writeString(this.f5386p);
        parcel.writeString(this.f5387q);
        parcel.writeString(this.f5388r);
    }

    public u(Parcel parcel) {
        this.f5383m = parcel.readInt();
        this.f5384n = parcel.readInt();
        this.f5385o = parcel.readString();
        this.f5386p = parcel.readString();
        this.f5387q = parcel.readString();
        this.f5388r = parcel.readString();
    }
}
