package c;

import R.D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: c.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0220d implements Parcelable {
    public static final Parcelable.Creator<C0220d> CREATOR = new D(14);

    /* renamed from: m  reason: collision with root package name */
    public InterfaceC0218b f4702m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        synchronized (this) {
            try {
                if (this.f4702m == null) {
                    this.f4702m = new BinderC0219c(this);
                }
                parcel.writeStrongBinder(this.f4702m.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(int i3, Bundle bundle) {
    }
}
