package K0;

import U.A;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class o extends i {
    public static final Parcelable.Creator<o> CREATOR = new G0.a(17);

    /* renamed from: n  reason: collision with root package name */
    public final String f735n;

    /* renamed from: o  reason: collision with root package name */
    public final String f736o;

    public o(String str, String str2, String str3) {
        super(str);
        this.f735n = str2;
        this.f736o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f721m.equals(oVar.f721m) && A.a(this.f735n, oVar.f735n) && A.a(this.f736o, oVar.f736o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int hashCode = (this.f721m.hashCode() + 527) * 31;
        int i4 = 0;
        String str = this.f735n;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i5 = (hashCode + i3) * 31;
        String str2 = this.f736o;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }

    @Override // K0.i
    public final String toString() {
        return this.f721m + ": url=" + this.f736o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f721m);
        parcel.writeString(this.f735n);
        parcel.writeString(this.f736o);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = U.A.f2405a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f735n = r0
            java.lang.String r3 = r3.readString()
            r2.f736o = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.o.<init>(android.os.Parcel):void");
    }
}
