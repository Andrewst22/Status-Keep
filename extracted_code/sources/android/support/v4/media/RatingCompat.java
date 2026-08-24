package android.support.v4.media;

import R.D;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new D(8);

    /* renamed from: m  reason: collision with root package name */
    public final int f3876m;

    /* renamed from: n  reason: collision with root package name */
    public final float f3877n;

    public RatingCompat(float f3, int i3) {
        this.f3876m = i3;
        this.f3877n = f3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f3876m;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f3876m);
        sb.append(" rating=");
        float f3 = this.f3877n;
        if (f3 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f3);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f3876m);
        parcel.writeFloat(this.f3877n);
    }
}
