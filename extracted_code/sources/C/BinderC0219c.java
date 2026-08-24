package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: c.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0219c extends Binder implements InterfaceC0218b {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f4700d = 0;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0220d f4701c;

    public BinderC0219c(C0220d c0220d) {
        this.f4701c = c0220d;
        attachInterface(this, InterfaceC0218b.f4699b);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        Object obj;
        String str = InterfaceC0218b.f4699b;
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i3 == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (i3 != 1) {
            return super.onTransact(i3, parcel, parcel2, i4);
        } else {
            int readInt = parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            C0220d c0220d = this.f4701c;
            c0220d.getClass();
            c0220d.d(readInt, (Bundle) obj);
            return true;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
