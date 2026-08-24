package l;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class e0 extends J.c {
    public static final Parcelable.Creator<e0> CREATOR = new J.b(2);

    /* renamed from: o  reason: collision with root package name */
    public boolean f7799o;

    public e0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7799o = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f7799o + "}";
    }

    @Override // J.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeValue(Boolean.valueOf(this.f7799o));
    }
}
