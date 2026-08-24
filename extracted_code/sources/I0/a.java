package I0;

import C1.d;
import R.B;
import R.C0113p;
import R.E;
import R.G;
import U.A;
import U.t;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements E {
    public static final Parcelable.Creator<a> CREATOR = new G0.a(3);

    /* renamed from: m  reason: collision with root package name */
    public final int f452m;

    /* renamed from: n  reason: collision with root package name */
    public final String f453n;

    /* renamed from: o  reason: collision with root package name */
    public final String f454o;

    /* renamed from: p  reason: collision with root package name */
    public final int f455p;

    /* renamed from: q  reason: collision with root package name */
    public final int f456q;

    /* renamed from: r  reason: collision with root package name */
    public final int f457r;

    /* renamed from: s  reason: collision with root package name */
    public final int f458s;

    /* renamed from: t  reason: collision with root package name */
    public final byte[] f459t;

    public a(int i3, String str, String str2, int i4, int i5, int i6, int i7, byte[] bArr) {
        this.f452m = i3;
        this.f453n = str;
        this.f454o = str2;
        this.f455p = i4;
        this.f456q = i5;
        this.f457r = i6;
        this.f458s = i7;
        this.f459t = bArr;
    }

    public static a d(t tVar) {
        int h3 = tVar.h();
        String l3 = G.l(tVar.s(tVar.h(), d.f151a));
        String s3 = tVar.s(tVar.h(), d.f153c);
        int h4 = tVar.h();
        int h5 = tVar.h();
        int h6 = tVar.h();
        int h7 = tVar.h();
        int h8 = tVar.h();
        byte[] bArr = new byte[h8];
        tVar.f(bArr, 0, h8);
        return new a(h3, l3, s3, h4, h5, h6, h7, bArr);
    }

    @Override // R.E
    public final void a(B b3) {
        b3.a(this.f459t, this.f452m);
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
        if (this.f452m == aVar.f452m && this.f453n.equals(aVar.f453n) && this.f454o.equals(aVar.f454o) && this.f455p == aVar.f455p && this.f456q == aVar.f456q && this.f457r == aVar.f457r && this.f458s == aVar.f458s && Arrays.equals(this.f459t, aVar.f459t)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f453n.hashCode();
        int hashCode2 = this.f454o.hashCode();
        return Arrays.hashCode(this.f459t) + ((((((((((hashCode2 + ((hashCode + ((527 + this.f452m) * 31)) * 31)) * 31) + this.f455p) * 31) + this.f456q) * 31) + this.f457r) * 31) + this.f458s) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f453n + ", description=" + this.f454o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f452m);
        parcel.writeString(this.f453n);
        parcel.writeString(this.f454o);
        parcel.writeInt(this.f455p);
        parcel.writeInt(this.f456q);
        parcel.writeInt(this.f457r);
        parcel.writeInt(this.f458s);
        parcel.writeByteArray(this.f459t);
    }

    public a(Parcel parcel) {
        this.f452m = parcel.readInt();
        String readString = parcel.readString();
        int i3 = A.f2405a;
        this.f453n = readString;
        this.f454o = parcel.readString();
        this.f455p = parcel.readInt();
        this.f456q = parcel.readInt();
        this.f457r = parcel.readInt();
        this.f458s = parcel.readInt();
        this.f459t = parcel.createByteArray();
    }
}
