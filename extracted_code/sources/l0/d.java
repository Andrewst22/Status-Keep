package L0;

import R.B;
import R.C0113p;
import R.E;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class d implements E {
    public static final Parcelable.Creator<d> CREATOR = new G0.a(21);

    /* renamed from: m  reason: collision with root package name */
    public final float f879m;

    /* renamed from: n  reason: collision with root package name */
    public final int f880n;

    public d(float f3, int i3) {
        this.f879m = f3;
        this.f880n = i3;
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
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f879m == dVar.f879m && this.f880n == dVar.f880n) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f879m).hashCode() + 527) * 31) + this.f880n;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f879m + ", svcTemporalLayerCount=" + this.f880n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeFloat(this.f879m);
        parcel.writeInt(this.f880n);
    }

    public d(Parcel parcel) {
        this.f879m = parcel.readFloat();
        this.f880n = parcel.readInt();
    }
}
