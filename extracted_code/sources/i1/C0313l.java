package i1;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: i1.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313l implements Parcelable {
    public static final Parcelable.Creator<C0313l> CREATOR = new R.D(17);

    /* renamed from: m  reason: collision with root package name */
    public int f6042m;

    /* renamed from: n  reason: collision with root package name */
    public int f6043n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6044o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f6042m);
        parcel.writeInt(this.f6043n);
        parcel.writeInt(this.f6044o ? 1 : 0);
    }
}
