package L0;

import U.A;
import U.AbstractC0123a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new G0.a(20);

    /* renamed from: m  reason: collision with root package name */
    public final long f875m;

    /* renamed from: n  reason: collision with root package name */
    public final long f876n;

    /* renamed from: o  reason: collision with root package name */
    public final int f877o;

    public b(int i3, long j3, long j4) {
        boolean z3;
        if (j3 < j4) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        this.f875m = j3;
        this.f876n = j4;
        this.f877o = i3;
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
        if (this.f875m == bVar.f875m && this.f876n == bVar.f876n && this.f877o == bVar.f877o) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f875m), Long.valueOf(this.f876n), Integer.valueOf(this.f877o)});
    }

    public final String toString() {
        int i3 = A.f2405a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f875m + ", endTimeMs=" + this.f876n + ", speedDivisor=" + this.f877o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f875m);
        parcel.writeLong(this.f876n);
        parcel.writeInt(this.f877o);
    }
}
