package L0;

import R.B;
import R.C0113p;
import R.E;
import a.AbstractC0155a;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class a implements E {
    public static final Parcelable.Creator<a> CREATOR = new G0.a(18);

    /* renamed from: m  reason: collision with root package name */
    public final long f870m;

    /* renamed from: n  reason: collision with root package name */
    public final long f871n;

    /* renamed from: o  reason: collision with root package name */
    public final long f872o;

    /* renamed from: p  reason: collision with root package name */
    public final long f873p;

    /* renamed from: q  reason: collision with root package name */
    public final long f874q;

    public a(long j3, long j4, long j5, long j6, long j7) {
        this.f870m = j3;
        this.f871n = j4;
        this.f872o = j5;
        this.f873p = j6;
        this.f874q = j7;
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f870m == aVar.f870m && this.f871n == aVar.f871n && this.f872o == aVar.f872o && this.f873p == aVar.f873p && this.f874q == aVar.f874q) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int B3 = AbstractC0155a.B(this.f871n);
        int B4 = AbstractC0155a.B(this.f872o);
        int B5 = AbstractC0155a.B(this.f873p);
        return AbstractC0155a.B(this.f874q) + ((B5 + ((B4 + ((B3 + ((AbstractC0155a.B(this.f870m) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f870m + ", photoSize=" + this.f871n + ", photoPresentationTimestampUs=" + this.f872o + ", videoStartPosition=" + this.f873p + ", videoSize=" + this.f874q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f870m);
        parcel.writeLong(this.f871n);
        parcel.writeLong(this.f872o);
        parcel.writeLong(this.f873p);
        parcel.writeLong(this.f874q);
    }

    public a(Parcel parcel) {
        this.f870m = parcel.readLong();
        this.f871n = parcel.readLong();
        this.f872o = parcel.readLong();
        this.f873p = parcel.readLong();
        this.f874q = parcel.readLong();
    }
}
