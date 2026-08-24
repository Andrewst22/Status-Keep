package android.support.v4.media;

import R.D;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new D(6);

    /* renamed from: m  reason: collision with root package name */
    public final String f3866m;

    /* renamed from: n  reason: collision with root package name */
    public final CharSequence f3867n;

    /* renamed from: o  reason: collision with root package name */
    public final CharSequence f3868o;

    /* renamed from: p  reason: collision with root package name */
    public final CharSequence f3869p;

    /* renamed from: q  reason: collision with root package name */
    public final Bitmap f3870q;

    /* renamed from: r  reason: collision with root package name */
    public final Uri f3871r;

    /* renamed from: s  reason: collision with root package name */
    public final Bundle f3872s;

    /* renamed from: t  reason: collision with root package name */
    public final Uri f3873t;

    /* renamed from: u  reason: collision with root package name */
    public MediaDescription f3874u;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f3866m = str;
        this.f3867n = charSequence;
        this.f3868o = charSequence2;
        this.f3869p = charSequence3;
        this.f3870q = bitmap;
        this.f3871r = uri;
        this.f3872s = bundle;
        this.f3873t = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f3867n) + ", " + ((Object) this.f3868o) + ", " + ((Object) this.f3869p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription = this.f3874u;
        if (mediaDescription == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f3866m);
            builder.setTitle(this.f3867n);
            builder.setSubtitle(this.f3868o);
            builder.setDescription(this.f3869p);
            builder.setIconBitmap(this.f3870q);
            builder.setIconUri(this.f3871r);
            Uri uri = this.f3873t;
            Bundle bundle = this.f3872s;
            if (i4 < 23 && uri != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
            }
            builder.setExtras(bundle);
            if (i4 >= 23) {
                builder.setMediaUri(uri);
            }
            mediaDescription = builder.build();
            this.f3874u = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i3);
    }
}
