package l;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class r0 extends J.c {
    public static final Parcelable.Creator<r0> CREATOR = new J.b(3);

    /* renamed from: o  reason: collision with root package name */
    public int f7893o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7894p;

    public r0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z3;
        this.f7893o = parcel.readInt();
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f7894p = z3;
    }

    @Override // J.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f7893o);
        parcel.writeInt(this.f7894p ? 1 : 0);
    }
}
