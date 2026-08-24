package J0;

import R.B;
import R.C0113p;
import R.E;
import U.A;
import U.AbstractC0123a;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class b implements E {
    public static final Parcelable.Creator<b> CREATOR = new G0.a(5);

    /* renamed from: m  reason: collision with root package name */
    public final int f486m;

    /* renamed from: n  reason: collision with root package name */
    public final String f487n;

    /* renamed from: o  reason: collision with root package name */
    public final String f488o;

    /* renamed from: p  reason: collision with root package name */
    public final String f489p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f490q;

    /* renamed from: r  reason: collision with root package name */
    public final int f491r;

    public b(int i3, String str, String str2, String str3, boolean z3, int i4) {
        AbstractC0123a.e(i4 == -1 || i4 > 0);
        this.f486m = i3;
        this.f487n = str;
        this.f488o = str2;
        this.f489p = str3;
        this.f490q = z3;
        this.f491r = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static J0.b d(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.b.d(java.util.Map):J0.b");
    }

    @Override // R.E
    public final void a(B b3) {
        String str = this.f488o;
        if (str != null) {
            b3.f1743v = str;
        }
        String str2 = this.f487n;
        if (str2 != null) {
            b3.f1742u = str2;
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f486m == bVar.f486m && A.a(this.f487n, bVar.f487n) && A.a(this.f488o, bVar.f488o) && A.a(this.f489p, bVar.f489p) && this.f490q == bVar.f490q && this.f491r == bVar.f491r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4;
        int i5 = (527 + this.f486m) * 31;
        int i6 = 0;
        String str = this.f487n;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i5 + i3) * 31;
        String str2 = this.f488o;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        String str3 = this.f489p;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        return ((((i8 + i6) * 31) + (this.f490q ? 1 : 0)) * 31) + this.f491r;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f488o + "\", genre=\"" + this.f487n + "\", bitrate=" + this.f486m + ", metadataInterval=" + this.f491r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f486m);
        parcel.writeString(this.f487n);
        parcel.writeString(this.f488o);
        parcel.writeString(this.f489p);
        int i4 = A.f2405a;
        parcel.writeInt(this.f490q ? 1 : 0);
        parcel.writeInt(this.f491r);
    }

    public b(Parcel parcel) {
        this.f486m = parcel.readInt();
        this.f487n = parcel.readString();
        this.f488o = parcel.readString();
        this.f489p = parcel.readString();
        int i3 = A.f2405a;
        this.f490q = parcel.readInt() != 0;
        this.f491r = parcel.readInt();
    }
}
