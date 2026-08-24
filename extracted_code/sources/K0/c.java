package K0;

import U.A;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new G0.a(9);

    /* renamed from: n  reason: collision with root package name */
    public final String f698n;

    /* renamed from: o  reason: collision with root package name */
    public final int f699o;

    /* renamed from: p  reason: collision with root package name */
    public final int f700p;

    /* renamed from: q  reason: collision with root package name */
    public final long f701q;

    /* renamed from: r  reason: collision with root package name */
    public final long f702r;

    /* renamed from: s  reason: collision with root package name */
    public final i[] f703s;

    public c(String str, int i3, int i4, long j3, long j4, i[] iVarArr) {
        super("CHAP");
        this.f698n = str;
        this.f699o = i3;
        this.f700p = i4;
        this.f701q = j3;
        this.f702r = j4;
        this.f703s = iVarArr;
    }

    @Override // K0.i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f699o == cVar.f699o && this.f700p == cVar.f700p && this.f701q == cVar.f701q && this.f702r == cVar.f702r && A.a(this.f698n, cVar.f698n) && Arrays.equals(this.f703s, cVar.f703s)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4 = (((((((527 + this.f699o) * 31) + this.f700p) * 31) + ((int) this.f701q)) * 31) + ((int) this.f702r)) * 31;
        String str = this.f698n;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        return i4 + i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f698n);
        parcel.writeInt(this.f699o);
        parcel.writeInt(this.f700p);
        parcel.writeLong(this.f701q);
        parcel.writeLong(this.f702r);
        i[] iVarArr = this.f703s;
        parcel.writeInt(iVarArr.length);
        for (i iVar : iVarArr) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i3 = A.f2405a;
        this.f698n = readString;
        this.f699o = parcel.readInt();
        this.f700p = parcel.readInt();
        this.f701q = parcel.readLong();
        this.f702r = parcel.readLong();
        int readInt = parcel.readInt();
        this.f703s = new i[readInt];
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f703s[i4] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
