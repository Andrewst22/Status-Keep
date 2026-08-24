package e0;

import R.B;
import R.C0113p;
import R.D;
import R.E;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class v implements E {
    public static final Parcelable.Creator<v> CREATOR = new D(15);

    /* renamed from: m  reason: collision with root package name */
    public final String f5389m;

    /* renamed from: n  reason: collision with root package name */
    public final String f5390n;

    /* renamed from: o  reason: collision with root package name */
    public final List f5391o;

    public v(String str, String str2, List list) {
        this.f5389m = str;
        this.f5390n = str2;
        this.f5391o = Collections.unmodifiableList(new ArrayList(list));
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
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (TextUtils.equals(this.f5389m, vVar.f5389m) && TextUtils.equals(this.f5390n, vVar.f5390n) && this.f5391o.equals(vVar.f5391o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4 = 0;
        String str = this.f5389m;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i5 = i3 * 31;
        String str2 = this.f5390n;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return this.f5391o.hashCode() + ((i5 + i4) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f5389m;
        if (str2 != null) {
            str = " [" + str2 + ", " + this.f5390n + "]";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f5389m);
        parcel.writeString(this.f5390n);
        List list = this.f5391o;
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeParcelable((Parcelable) list.get(i4), 0);
        }
    }

    public v(Parcel parcel) {
        this.f5389m = parcel.readString();
        this.f5390n = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            arrayList.add((u) parcel.readParcelable(u.class.getClassLoader()));
        }
        this.f5391o = Collections.unmodifiableList(arrayList);
    }
}
