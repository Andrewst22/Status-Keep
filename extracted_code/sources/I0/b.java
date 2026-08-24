package I0;

import N.k;
import R.B;
import R.C0113p;
import R.E;
import U.A;
import a.AbstractC0155a;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class b implements E {
    public static final Parcelable.Creator<b> CREATOR = new G0.a(4);

    /* renamed from: m  reason: collision with root package name */
    public final String f460m;

    /* renamed from: n  reason: collision with root package name */
    public final String f461n;

    public b(String str, String str2) {
        this.f460m = AbstractC0155a.N(str);
        this.f461n = str2;
    }

    @Override // R.E
    public final void a(B b3) {
        String str = this.f460m;
        str.getClass();
        String str2 = this.f461n;
        char c3 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c3 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c3 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c3 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c3 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c3 = 4;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                b3.f1724c = str2;
                return;
            case 1:
                b3.f1722a = str2;
                return;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                b3.f1726e = str2;
                return;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                b3.f1725d = str2;
                return;
            case k.LONG_FIELD_NUMBER /* 4 */:
                b3.f1723b = str2;
                return;
            default:
                return;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f460m.equals(bVar.f460m) && this.f461n.equals(bVar.f461n)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f461n.hashCode() + ((this.f460m.hashCode() + 527) * 31);
    }

    public final String toString() {
        return "VC: " + this.f460m + "=" + this.f461n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f460m);
        parcel.writeString(this.f461n);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i3 = A.f2405a;
        this.f460m = readString;
        this.f461n = parcel.readString();
    }
}
