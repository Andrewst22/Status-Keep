package L0;

import R.B;
import R.C0113p;
import R.E;
import U.AbstractC0123a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class c implements E {
    public static final Parcelable.Creator<c> CREATOR = new G0.a(19);

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f878m;

    public c(ArrayList arrayList) {
        this.f878m = arrayList;
        boolean z3 = false;
        if (!arrayList.isEmpty()) {
            long j3 = ((b) arrayList.get(0)).f876n;
            int i3 = 1;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                } else if (((b) arrayList.get(i3)).f875m < j3) {
                    z3 = true;
                    break;
                } else {
                    j3 = ((b) arrayList.get(i3)).f876n;
                    i3++;
                }
            }
        }
        AbstractC0123a.e(!z3);
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
        if (obj != null && c.class == obj.getClass()) {
            return this.f878m.equals(((c) obj).f878m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f878m.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f878m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeList(this.f878m);
    }
}
