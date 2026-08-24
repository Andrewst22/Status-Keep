package V;

import R.B;
import R.C0113p;
import R.D;
import R.E;
import a.AbstractC0155a;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class c implements E {
    public static final Parcelable.Creator<c> CREATOR = new D(4);

    /* renamed from: m  reason: collision with root package name */
    public final long f2613m;

    /* renamed from: n  reason: collision with root package name */
    public final long f2614n;

    /* renamed from: o  reason: collision with root package name */
    public final long f2615o;

    public c(long j3, long j4, long j5) {
        this.f2613m = j3;
        this.f2614n = j4;
        this.f2615o = j5;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2613m == cVar.f2613m && this.f2614n == cVar.f2614n && this.f2615o == cVar.f2615o) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int B3 = AbstractC0155a.B(this.f2614n);
        return AbstractC0155a.B(this.f2615o) + ((B3 + ((AbstractC0155a.B(this.f2613m) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f2613m + ", modification time=" + this.f2614n + ", timescale=" + this.f2615o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f2613m);
        parcel.writeLong(this.f2614n);
        parcel.writeLong(this.f2615o);
    }

    public c(Parcel parcel) {
        this.f2613m = parcel.readLong();
        this.f2614n = parcel.readLong();
        this.f2615o = parcel.readLong();
    }
}
