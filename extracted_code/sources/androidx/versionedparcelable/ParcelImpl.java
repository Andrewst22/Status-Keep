package androidx.versionedparcelable;

import R.D;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import m1.b;
import m1.c;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new D(20);

    /* renamed from: m  reason: collision with root package name */
    public final c f4498m;

    public ParcelImpl(Parcel parcel) {
        this.f4498m = new b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        new b(parcel).l(this.f4498m);
    }
}
