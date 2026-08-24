package J;

import N.k;
import android.os.Parcel;
import android.os.Parcelable;
import i1.C0291B;
import l.e0;
import l.r0;
/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f480a;

    public /* synthetic */ b(int i3) {
        this.f480a = i3;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f480a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f481n;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0291B(parcel, classLoader);
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new e0(parcel, classLoader);
            default:
                return new r0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f480a) {
            case 0:
                return new c[i3];
            case 1:
                return new C0291B[i3];
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new e0[i3];
            default:
                return new r0[i3];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f480a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f481n;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0291B(parcel, null);
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return new e0(parcel, null);
            default:
                return new r0(parcel, null);
        }
    }
}
