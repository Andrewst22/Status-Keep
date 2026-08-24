package V;

import R.B;
import R.C0113p;
import R.D;
import R.E;
import U.A;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements E {
    public static final Parcelable.Creator<a> CREATOR = new D(2);

    /* renamed from: m  reason: collision with root package name */
    public final String f2607m;

    /* renamed from: n  reason: collision with root package name */
    public final byte[] f2608n;

    /* renamed from: o  reason: collision with root package name */
    public final int f2609o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2610p;

    public a(String str, byte[] bArr, int i3, int i4) {
        this.f2607m = str;
        this.f2608n = bArr;
        this.f2609o = i3;
        this.f2610p = i4;
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
        if (this.f2607m.equals(aVar.f2607m) && Arrays.equals(this.f2608n, aVar.f2608n) && this.f2609o == aVar.f2609o && this.f2610p == aVar.f2610p) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f2608n) + ((this.f2607m.hashCode() + 527) * 31)) * 31) + this.f2609o) * 31) + this.f2610p;
    }

    public final String toString() {
        String p3;
        byte[] bArr = this.f2608n;
        int i3 = this.f2610p;
        if (i3 != 1) {
            if (i3 != 23) {
                if (i3 != 67) {
                    p3 = A.Y(bArr);
                } else {
                    p3 = String.valueOf(android.support.v4.media.session.a.t(bArr));
                }
            } else {
                p3 = String.valueOf(Float.intBitsToFloat(android.support.v4.media.session.a.t(bArr)));
            }
        } else {
            p3 = A.p(bArr);
        }
        return "mdta: key=" + this.f2607m + ", value=" + p3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f2607m);
        parcel.writeByteArray(this.f2608n);
        parcel.writeInt(this.f2609o);
        parcel.writeInt(this.f2610p);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i3 = A.f2405a;
        this.f2607m = readString;
        this.f2608n = parcel.createByteArray();
        this.f2609o = parcel.readInt();
        this.f2610p = parcel.readInt();
    }
}
