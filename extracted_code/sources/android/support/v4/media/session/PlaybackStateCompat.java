package android.support.v4.media.session;

import R.D;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new D(13);

    /* renamed from: m  reason: collision with root package name */
    public final int f3887m;

    /* renamed from: n  reason: collision with root package name */
    public final long f3888n;

    /* renamed from: o  reason: collision with root package name */
    public final long f3889o;

    /* renamed from: p  reason: collision with root package name */
    public final float f3890p;

    /* renamed from: q  reason: collision with root package name */
    public final long f3891q;

    /* renamed from: r  reason: collision with root package name */
    public final int f3892r;

    /* renamed from: s  reason: collision with root package name */
    public final CharSequence f3893s;

    /* renamed from: t  reason: collision with root package name */
    public final long f3894t;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f3895u;

    /* renamed from: v  reason: collision with root package name */
    public final long f3896v;

    /* renamed from: w  reason: collision with root package name */
    public final Bundle f3897w;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();

        /* renamed from: m  reason: collision with root package name */
        public final String f3898m;

        /* renamed from: n  reason: collision with root package name */
        public final CharSequence f3899n;

        /* renamed from: o  reason: collision with root package name */
        public final int f3900o;

        /* renamed from: p  reason: collision with root package name */
        public final Bundle f3901p;

        public CustomAction(Parcel parcel) {
            this.f3898m = parcel.readString();
            this.f3899n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3900o = parcel.readInt();
            this.f3901p = parcel.readBundle(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f3899n) + ", mIcon=" + this.f3900o + ", mExtras=" + this.f3901p;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i3) {
            parcel.writeString(this.f3898m);
            TextUtils.writeToParcel(this.f3899n, parcel, i3);
            parcel.writeInt(this.f3900o);
            parcel.writeBundle(this.f3901p);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f3887m = parcel.readInt();
        this.f3888n = parcel.readLong();
        this.f3890p = parcel.readFloat();
        this.f3894t = parcel.readLong();
        this.f3889o = parcel.readLong();
        this.f3891q = parcel.readLong();
        this.f3893s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3895u = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f3896v = parcel.readLong();
        this.f3897w = parcel.readBundle(a.class.getClassLoader());
        this.f3892r = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f3887m + ", position=" + this.f3888n + ", buffered position=" + this.f3889o + ", speed=" + this.f3890p + ", updated=" + this.f3894t + ", actions=" + this.f3891q + ", error code=" + this.f3892r + ", error message=" + this.f3893s + ", custom actions=" + this.f3895u + ", active item id=" + this.f3896v + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f3887m);
        parcel.writeLong(this.f3888n);
        parcel.writeFloat(this.f3890p);
        parcel.writeLong(this.f3894t);
        parcel.writeLong(this.f3889o);
        parcel.writeLong(this.f3891q);
        TextUtils.writeToParcel(this.f3893s, parcel, i3);
        parcel.writeTypedList(this.f3895u);
        parcel.writeLong(this.f3896v);
        parcel.writeBundle(this.f3897w);
        parcel.writeInt(this.f3892r);
    }
}
