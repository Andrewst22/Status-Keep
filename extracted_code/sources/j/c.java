package J;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* renamed from: m  reason: collision with root package name */
    public final Parcelable f482m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f481n = new c();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f482m = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f482m, i3);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f482m = parcelable == f481n ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f482m = readParcelable == null ? f481n : readParcelable;
    }
}
