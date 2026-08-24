package K0;

import U.A;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new G0.a(12);

    /* renamed from: n  reason: collision with root package name */
    public final String f712n;

    /* renamed from: o  reason: collision with root package name */
    public final String f713o;

    /* renamed from: p  reason: collision with root package name */
    public final String f714p;

    /* renamed from: q  reason: collision with root package name */
    public final byte[] f715q;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f712n = str;
        this.f713o = str2;
        this.f714p = str3;
        this.f715q = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (A.a(this.f712n, fVar.f712n) && A.a(this.f713o, fVar.f713o) && A.a(this.f714p, fVar.f714p) && Arrays.equals(this.f715q, fVar.f715q)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4;
        int i5 = 0;
        String str = this.f712n;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (527 + i3) * 31;
        String str2 = this.f713o;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i7 = (i6 + i4) * 31;
        String str3 = this.f714p;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return Arrays.hashCode(this.f715q) + ((i7 + i5) * 31);
    }

    @Override // K0.i
    public final String toString() {
        return this.f721m + ": mimeType=" + this.f712n + ", filename=" + this.f713o + ", description=" + this.f714p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f712n);
        parcel.writeString(this.f713o);
        parcel.writeString(this.f714p);
        parcel.writeByteArray(this.f715q);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i3 = A.f2405a;
        this.f712n = readString;
        this.f713o = parcel.readString();
        this.f714p = parcel.readString();
        this.f715q = parcel.createByteArray();
    }
}
