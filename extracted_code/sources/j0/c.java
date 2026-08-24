package J0;

import R.B;
import R.C0113p;
import R.E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class c implements E {
    public static final Parcelable.Creator<c> CREATOR = new G0.a(6);

    /* renamed from: m  reason: collision with root package name */
    public final byte[] f492m;

    /* renamed from: n  reason: collision with root package name */
    public final String f493n;

    /* renamed from: o  reason: collision with root package name */
    public final String f494o;

    public c(String str, String str2, byte[] bArr) {
        this.f492m = bArr;
        this.f493n = str;
        this.f494o = str2;
    }

    @Override // R.E
    public final void a(B b3) {
        String str = this.f493n;
        if (str != null) {
            b3.f1722a = str;
        }
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
        if (obj != null && c.class == obj.getClass()) {
            return Arrays.equals(this.f492m, ((c) obj).f492m);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f492m);
    }

    public final String toString() {
        int length = this.f492m.length;
        return "ICY: title=\"" + this.f493n + "\", url=\"" + this.f494o + "\", rawMetadata.length=\"" + length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeByteArray(this.f492m);
        parcel.writeString(this.f493n);
        parcel.writeString(this.f494o);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f492m = createByteArray;
        this.f493n = parcel.readString();
        this.f494o = parcel.readString();
    }
}
