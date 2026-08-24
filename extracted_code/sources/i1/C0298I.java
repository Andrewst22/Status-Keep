package i1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: i1.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298I implements Parcelable {
    public static final Parcelable.Creator<C0298I> CREATOR = new R.D(18);

    /* renamed from: m  reason: collision with root package name */
    public int f5969m;

    /* renamed from: n  reason: collision with root package name */
    public int f5970n;

    /* renamed from: o  reason: collision with root package name */
    public int[] f5971o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5972p;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f5969m + ", mGapDir=" + this.f5970n + ", mHasUnwantedGapAfter=" + this.f5972p + ", mGapPerSpan=" + Arrays.toString(this.f5971o) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f5969m);
        parcel.writeInt(this.f5970n);
        parcel.writeInt(this.f5972p ? 1 : 0);
        int[] iArr = this.f5971o;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f5971o);
            return;
        }
        parcel.writeInt(0);
    }
}
