package M0;

import U.t;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new G0.a(26);

    /* renamed from: m  reason: collision with root package name */
    public final long f1052m;

    /* renamed from: n  reason: collision with root package name */
    public final long f1053n;

    public j(long j3, long j4) {
        this.f1052m = j3;
        this.f1053n = j4;
    }

    public static long d(long j3, t tVar) {
        long u3 = tVar.u();
        if ((128 & u3) != 0) {
            return 8589934591L & ((((u3 & 1) << 32) | tVar.w()) + j3);
        }
        return -9223372036854775807L;
    }

    @Override // M0.b
    public final String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f1052m + ", playbackPositionUs= " + this.f1053n + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f1052m);
        parcel.writeLong(this.f1053n);
    }
}
