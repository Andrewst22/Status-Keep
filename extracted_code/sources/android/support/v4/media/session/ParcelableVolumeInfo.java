package android.support.v4.media.session;

import R.D;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new D(12);

    /* renamed from: m  reason: collision with root package name */
    public int f3882m;

    /* renamed from: n  reason: collision with root package name */
    public int f3883n;

    /* renamed from: o  reason: collision with root package name */
    public int f3884o;

    /* renamed from: p  reason: collision with root package name */
    public int f3885p;

    /* renamed from: q  reason: collision with root package name */
    public int f3886q;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f3882m);
        parcel.writeInt(this.f3884o);
        parcel.writeInt(this.f3885p);
        parcel.writeInt(this.f3886q);
        parcel.writeInt(this.f3883n);
    }
}
