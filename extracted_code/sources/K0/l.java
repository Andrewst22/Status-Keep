package K0;

import U.A;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new G0.a(14);

    /* renamed from: n  reason: collision with root package name */
    public final int f726n;

    /* renamed from: o  reason: collision with root package name */
    public final int f727o;

    /* renamed from: p  reason: collision with root package name */
    public final int f728p;

    /* renamed from: q  reason: collision with root package name */
    public final int[] f729q;

    /* renamed from: r  reason: collision with root package name */
    public final int[] f730r;

    public l(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f726n = i3;
        this.f727o = i4;
        this.f728p = i5;
        this.f729q = iArr;
        this.f730r = iArr2;
    }

    @Override // K0.i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f726n == lVar.f726n && this.f727o == lVar.f727o && this.f728p == lVar.f728p && Arrays.equals(this.f729q, lVar.f729q) && Arrays.equals(this.f730r, lVar.f730r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f729q);
        return Arrays.hashCode(this.f730r) + ((hashCode + ((((((527 + this.f726n) * 31) + this.f727o) * 31) + this.f728p) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f726n);
        parcel.writeInt(this.f727o);
        parcel.writeInt(this.f728p);
        parcel.writeIntArray(this.f729q);
        parcel.writeIntArray(this.f730r);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f726n = parcel.readInt();
        this.f727o = parcel.readInt();
        this.f728p = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i3 = A.f2405a;
        this.f729q = createIntArray;
        this.f730r = parcel.createIntArray();
    }
}
