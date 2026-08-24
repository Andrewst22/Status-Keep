package H0;

import N.k;
import R.B;
import R.C0112o;
import R.C0113p;
import R.E;
import R.G;
import U.A;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements E {
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: s  reason: collision with root package name */
    public static final C0113p f429s;

    /* renamed from: t  reason: collision with root package name */
    public static final C0113p f430t;

    /* renamed from: m  reason: collision with root package name */
    public final String f431m;

    /* renamed from: n  reason: collision with root package name */
    public final String f432n;

    /* renamed from: o  reason: collision with root package name */
    public final long f433o;

    /* renamed from: p  reason: collision with root package name */
    public final long f434p;

    /* renamed from: q  reason: collision with root package name */
    public final byte[] f435q;

    /* renamed from: r  reason: collision with root package name */
    public int f436r;

    static {
        C0112o c0112o = new C0112o();
        c0112o.f1937l = G.l("application/id3");
        f429s = new C0113p(c0112o);
        C0112o c0112o2 = new C0112o();
        c0112o2.f1937l = G.l("application/x-scte35");
        f430t = new C0113p(c0112o2);
        CREATOR = new G0.a(2);
    }

    public a(String str, String str2, long j3, long j4, byte[] bArr) {
        this.f431m = str;
        this.f432n = str2;
        this.f433o = j3;
        this.f434p = j4;
        this.f435q = bArr;
    }

    @Override // R.E
    public final /* synthetic */ void a(B b3) {
    }

    @Override // R.E
    public final byte[] b() {
        if (c() != null) {
            return this.f435q;
        }
        return null;
    }

    @Override // R.E
    public final C0113p c() {
        String str = this.f431m;
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c3 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c3 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c3 = 2;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return f430t;
            case 1:
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return f429s;
            default:
                return null;
        }
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
        if (this.f433o == aVar.f433o && this.f434p == aVar.f434p && A.a(this.f431m, aVar.f431m) && A.a(this.f432n, aVar.f432n) && Arrays.equals(this.f435q, aVar.f435q)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        if (this.f436r == 0) {
            int i4 = 0;
            String str = this.f431m;
            if (str != null) {
                i3 = str.hashCode();
            } else {
                i3 = 0;
            }
            int i5 = (527 + i3) * 31;
            String str2 = this.f432n;
            if (str2 != null) {
                i4 = str2.hashCode();
            }
            long j3 = this.f433o;
            long j4 = this.f434p;
            this.f436r = Arrays.hashCode(this.f435q) + ((((((i5 + i4) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31);
        }
        return this.f436r;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f431m + ", id=" + this.f434p + ", durationMs=" + this.f433o + ", value=" + this.f432n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f431m);
        parcel.writeString(this.f432n);
        parcel.writeLong(this.f433o);
        parcel.writeLong(this.f434p);
        parcel.writeByteArray(this.f435q);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i3 = A.f2405a;
        this.f431m = readString;
        this.f432n = parcel.readString();
        this.f433o = parcel.readLong();
        this.f434p = parcel.readLong();
        this.f435q = parcel.createByteArray();
    }
}
