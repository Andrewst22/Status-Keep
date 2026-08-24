package s;

import android.app.Notification;
import android.os.Parcel;
import b.C0205a;
/* loaded from: classes.dex */
public final class N {

    /* renamed from: a  reason: collision with root package name */
    public final String f9049a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9050b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9051c;

    /* renamed from: d  reason: collision with root package name */
    public final Notification f9052d;

    public N(String str, int i3, String str2, Notification notification) {
        this.f9049a = str;
        this.f9050b = i3;
        this.f9051c = str2;
        this.f9052d = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f9049a;
        int i3 = this.f9050b;
        String str2 = this.f9051c;
        C0205a c0205a = (C0205a) cVar;
        c0205a.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f4508a);
            obtain.writeString(str);
            obtain.writeInt(i3);
            obtain.writeString(str2);
            Notification notification = this.f9052d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            c0205a.f4506c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.f9049a + ", id:" + this.f9050b + ", tag:" + this.f9051c + "]";
    }
}
