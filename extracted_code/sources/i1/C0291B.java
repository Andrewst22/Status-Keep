package i1;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: i1.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291B extends J.c {
    public static final Parcelable.Creator<C0291B> CREATOR = new J.b(1);

    /* renamed from: o  reason: collision with root package name */
    public Parcelable f5954o;

    public C0291B(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5954o = parcel.readParcelable(classLoader == null ? t.class.getClassLoader() : classLoader);
    }

    @Override // J.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeParcelable(this.f5954o, 0);
    }
}
