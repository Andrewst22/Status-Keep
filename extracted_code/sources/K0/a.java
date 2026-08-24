package K0;

import R.B;
import U.A;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new G0.a(7);

    /* renamed from: n  reason: collision with root package name */
    public final String f693n;

    /* renamed from: o  reason: collision with root package name */
    public final String f694o;

    /* renamed from: p  reason: collision with root package name */
    public final int f695p;

    /* renamed from: q  reason: collision with root package name */
    public final byte[] f696q;

    public a(String str, String str2, int i3, byte[] bArr) {
        super("APIC");
        this.f693n = str;
        this.f694o = str2;
        this.f695p = i3;
        this.f696q = bArr;
    }

    @Override // K0.i, R.E
    public final void a(B b3) {
        b3.a(this.f696q, this.f695p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f695p == aVar.f695p && A.a(this.f693n, aVar.f693n) && A.a(this.f694o, aVar.f694o) && Arrays.equals(this.f696q, aVar.f696q)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4 = (527 + this.f695p) * 31;
        int i5 = 0;
        String str = this.f693n;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i4 + i3) * 31;
        String str2 = this.f694o;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return Arrays.hashCode(this.f696q) + ((i6 + i5) * 31);
    }

    @Override // K0.i
    public final String toString() {
        return this.f721m + ": mimeType=" + this.f693n + ", description=" + this.f694o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f693n);
        parcel.writeString(this.f694o);
        parcel.writeInt(this.f695p);
        parcel.writeByteArray(this.f696q);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i3 = A.f2405a;
        this.f693n = readString;
        this.f694o = parcel.readString();
        this.f695p = parcel.readInt();
        this.f696q = parcel.createByteArray();
    }
}
