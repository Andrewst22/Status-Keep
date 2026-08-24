package M0;

import U.A;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new G0.a(22);

    /* renamed from: m  reason: collision with root package name */
    public final long f1017m;

    /* renamed from: n  reason: collision with root package name */
    public final long f1018n;

    /* renamed from: o  reason: collision with root package name */
    public final byte[] f1019o;

    public a(long j3, byte[] bArr, long j4) {
        this.f1017m = j4;
        this.f1018n = j3;
        this.f1019o = bArr;
    }

    @Override // M0.b
    public final String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f1017m + ", identifier= " + this.f1018n + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f1017m);
        parcel.writeLong(this.f1018n);
        parcel.writeByteArray(this.f1019o);
    }

    public a(Parcel parcel) {
        this.f1017m = parcel.readLong();
        this.f1018n = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i3 = A.f2405a;
        this.f1019o = createByteArray;
    }
}
