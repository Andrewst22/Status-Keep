package G0;

import R.B;
import R.C0113p;
import R.E;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class b implements E {
    public static final Parcelable.Creator<b> CREATOR = new a(0);

    /* renamed from: m  reason: collision with root package name */
    public final int f375m;

    /* renamed from: n  reason: collision with root package name */
    public final String f376n;

    public b(String str, int i3) {
        this.f375m = i3;
        this.f376n = str;
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

    public final String toString() {
        return "Ait(controlCode=" + this.f375m + ",url=" + this.f376n + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f376n);
        parcel.writeInt(this.f375m);
    }
}
