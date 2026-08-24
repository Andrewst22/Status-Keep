package R;

import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import c.C0220d;
import i1.C0298I;
import i1.C0300K;
import i1.C0313l;
/* loaded from: classes.dex */
public final class D implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1769a;

    public /* synthetic */ D(int i3) {
        this.f1769a = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x019a  */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [c.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [i1.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [i1.I, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [i1.K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [c.d, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createFromParcel(final android.os.Parcel r15) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R.D.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f1769a) {
            case 0:
                return new F[i3];
            case 1:
                return new O[i3];
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new V.a[i3];
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new V.b[i3];
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return new V.c[i3];
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return new MediaBrowserCompat$MediaItem[i3];
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new MediaDescriptionCompat[i3];
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new MediaMetadataCompat[i3];
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                return new RatingCompat[i3];
            case 9:
                return new MediaSessionCompat$QueueItem[i3];
            case 10:
                return new MediaSessionCompat$ResultReceiverWrapper[i3];
            case 11:
                return new MediaSessionCompat$Token[i3];
            case 12:
                return new ParcelableVolumeInfo[i3];
            case 13:
                return new PlaybackStateCompat[i3];
            case 14:
                return new C0220d[i3];
            case 15:
                return new e0.v[i3];
            case 16:
                return new e0.u[i3];
            case 17:
                return new C0313l[i3];
            case 18:
                return new C0298I[i3];
            case 19:
                return new C0300K[i3];
            default:
                return new ParcelImpl[i3];
        }
    }
}
