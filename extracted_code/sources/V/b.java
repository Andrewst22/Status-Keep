package V;

import R.B;
import R.C0113p;
import R.D;
import R.E;
import U.AbstractC0123a;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class b implements E {
    public static final Parcelable.Creator<b> CREATOR = new D(3);

    /* renamed from: m  reason: collision with root package name */
    public final float f2611m;

    /* renamed from: n  reason: collision with root package name */
    public final float f2612n;

    public b(float f3, float f4) {
        AbstractC0123a.d("Invalid latitude or longitude", f3 >= -90.0f && f3 <= 90.0f && f4 >= -180.0f && f4 <= 180.0f);
        this.f2611m = f3;
        this.f2612n = f4;
    }

    @Override // R.E
    public final /* synthetic */ void a(B b3) {
    }

    @Override // R.E
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // R.E
    public final /* synthetic */ C0113p c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2611m == bVar.f2611m && this.f2612n == bVar.f2612n) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f2612n).hashCode() + ((Float.valueOf(this.f2611m).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f2611m + ", longitude=" + this.f2612n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeFloat(this.f2611m);
        parcel.writeFloat(this.f2612n);
    }

    public b(Parcel parcel) {
        this.f2611m = parcel.readFloat();
        this.f2612n = parcel.readFloat();
    }
}
