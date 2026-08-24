package K0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new G0.a(8);

    /* renamed from: n  reason: collision with root package name */
    public final byte[] f697n;

    public b(String str, byte[] bArr) {
        super(str);
        this.f697n = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f721m.equals(bVar.f721m) && Arrays.equals(this.f697n, bVar.f697n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f697n) + ((this.f721m.hashCode() + 527) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f721m);
        parcel.writeByteArray(this.f697n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = U.A.f2405a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f697n = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.b.<init>(android.os.Parcel):void");
    }
}
