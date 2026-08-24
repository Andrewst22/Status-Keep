package R;

import a.AbstractC0155a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class F implements Parcelable {
    public static final Parcelable.Creator<F> CREATOR = new D(0);

    /* renamed from: m  reason: collision with root package name */
    public final E[] f1770m;

    /* renamed from: n  reason: collision with root package name */
    public final long f1771n;

    public F(E... eArr) {
        this(-9223372036854775807L, eArr);
    }

    public final F d(E... eArr) {
        if (eArr.length == 0) {
            return this;
        }
        int i3 = U.A.f2405a;
        E[] eArr2 = this.f1770m;
        Object[] copyOf = Arrays.copyOf(eArr2, eArr2.length + eArr.length);
        System.arraycopy(eArr, 0, copyOf, eArr2.length, eArr.length);
        return new F(this.f1771n, (E[]) copyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final F e(F f3) {
        if (f3 == null) {
            return this;
        }
        return d(f3.f1770m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f3 = (F) obj;
        if (Arrays.equals(this.f1770m, f3.f1770m) && this.f1771n == f3.f1771n) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0155a.B(this.f1771n) + (Arrays.hashCode(this.f1770m) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f1770m));
        long j3 = this.f1771n;
        if (j3 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j3;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        E[] eArr = this.f1770m;
        parcel.writeInt(eArr.length);
        for (E e2 : eArr) {
            parcel.writeParcelable(e2, 0);
        }
        parcel.writeLong(this.f1771n);
    }

    public F(long j3, E... eArr) {
        this.f1771n = j3;
        this.f1770m = eArr;
    }

    public F(List list) {
        this((E[]) list.toArray(new E[0]));
    }

    public F(Parcel parcel) {
        this.f1770m = new E[parcel.readInt()];
        int i3 = 0;
        while (true) {
            E[] eArr = this.f1770m;
            if (i3 < eArr.length) {
                eArr[i3] = (E) parcel.readParcelable(E.class.getClassLoader());
                i3++;
            } else {
                this.f1771n = parcel.readLong();
                return;
            }
        }
    }
}
