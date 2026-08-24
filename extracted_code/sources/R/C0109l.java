package R;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;
/* renamed from: R.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109l implements Parcelable {
    public static final Parcelable.Creator<C0109l> CREATOR = new G0.a(29);

    /* renamed from: m  reason: collision with root package name */
    public int f1907m;

    /* renamed from: n  reason: collision with root package name */
    public final UUID f1908n;

    /* renamed from: o  reason: collision with root package name */
    public final String f1909o;

    /* renamed from: p  reason: collision with root package name */
    public final String f1910p;

    /* renamed from: q  reason: collision with root package name */
    public final byte[] f1911q;

    public C0109l(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f1908n = uuid;
        this.f1909o = str;
        str2.getClass();
        this.f1910p = G.l(str2);
        this.f1911q = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0109l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0109l c0109l = (C0109l) obj;
        if (!U.A.a(this.f1909o, c0109l.f1909o) || !U.A.a(this.f1910p, c0109l.f1910p) || !U.A.a(this.f1908n, c0109l.f1908n) || !Arrays.equals(this.f1911q, c0109l.f1911q)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f1907m == 0) {
            int hashCode2 = this.f1908n.hashCode() * 31;
            String str = this.f1909o;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = this.f1910p.hashCode();
            this.f1907m = Arrays.hashCode(this.f1911q) + ((hashCode3 + ((hashCode2 + hashCode) * 31)) * 31);
        }
        return this.f1907m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        UUID uuid = this.f1908n;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f1909o);
        parcel.writeString(this.f1910p);
        parcel.writeByteArray(this.f1911q);
    }

    public C0109l(Parcel parcel) {
        this.f1908n = new UUID(parcel.readLong(), parcel.readLong());
        this.f1909o = parcel.readString();
        String readString = parcel.readString();
        int i3 = U.A.f2405a;
        this.f1910p = readString;
        this.f1911q = parcel.createByteArray();
    }
}
