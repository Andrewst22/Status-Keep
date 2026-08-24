package K0;

import U.A;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new G0.a(10);

    /* renamed from: n  reason: collision with root package name */
    public final String f704n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f705o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f706p;

    /* renamed from: q  reason: collision with root package name */
    public final String[] f707q;

    /* renamed from: r  reason: collision with root package name */
    public final i[] f708r;

    public d(String str, boolean z3, boolean z4, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f704n = str;
        this.f705o = z3;
        this.f706p = z4;
        this.f707q = strArr;
        this.f708r = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f705o == dVar.f705o && this.f706p == dVar.f706p && A.a(this.f704n, dVar.f704n) && Arrays.equals(this.f707q, dVar.f707q) && Arrays.equals(this.f708r, dVar.f708r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4 = (((527 + (this.f705o ? 1 : 0)) * 31) + (this.f706p ? 1 : 0)) * 31;
        String str = this.f704n;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        return i4 + i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f704n);
        parcel.writeByte(this.f705o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f706p ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f707q);
        i[] iVarArr = this.f708r;
        parcel.writeInt(iVarArr.length);
        for (i iVar : iVarArr) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i3 = A.f2405a;
        this.f704n = readString;
        this.f705o = parcel.readByte() != 0;
        this.f706p = parcel.readByte() != 0;
        this.f707q = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f708r = new i[readInt];
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f708r[i4] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
