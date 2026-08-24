package K0;

import U.A;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new G0.a(15);

    /* renamed from: n  reason: collision with root package name */
    public final String f731n;

    /* renamed from: o  reason: collision with root package name */
    public final byte[] f732o;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f731n = str;
        this.f732o = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (A.a(this.f731n, mVar.f731n) && Arrays.equals(this.f732o, mVar.f732o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        String str = this.f731n;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        return Arrays.hashCode(this.f732o) + ((527 + i3) * 31);
    }

    @Override // K0.i
    public final String toString() {
        return this.f721m + ": owner=" + this.f731n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f731n);
        parcel.writeByteArray(this.f732o);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i3 = A.f2405a;
        this.f731n = readString;
        this.f732o = parcel.createByteArray();
    }
}
