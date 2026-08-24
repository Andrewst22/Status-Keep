package s;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import l.AbstractC0582u;
/* renamed from: s.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788l extends AbstractC0771C {

    /* renamed from: e  reason: collision with root package name */
    public IconCompat f9099e;

    /* renamed from: f  reason: collision with root package name */
    public IconCompat f9100f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9101g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9102h;

    public static IconCompat h(Parcelable parcelable) {
        if (parcelable != null) {
            if (Build.VERSION.SDK_INT >= 23 && AbstractC0582u.l(parcelable)) {
                return IconCompat.b(AbstractC0582u.c(parcelable));
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.d((Bitmap) parcelable);
            }
            return null;
        }
        return null;
    }

    @Override // s.AbstractC0771C
    public final void b(R0.j jVar) {
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) jVar.f2060o).setBigContentTitle(this.f9046b);
        IconCompat iconCompat = this.f9099e;
        Context context = (Context) jVar.f2059n;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC0787k.a(bigContentTitle, iconCompat.k(context));
            } else if (iconCompat.h() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.f9099e.f());
            }
        }
        if (this.f9101g) {
            IconCompat iconCompat2 = this.f9100f;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else if (Build.VERSION.SDK_INT >= 23) {
                AbstractC0786j.a(bigContentTitle, iconCompat2.k(context));
            } else if (iconCompat2.h() == 1) {
                bigContentTitle.bigLargeIcon(this.f9100f.f());
            } else {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            }
        }
        if (this.f9048d) {
            bigContentTitle.setSummaryText(this.f9047c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC0787k.c(bigContentTitle, this.f9102h);
            AbstractC0787k.b(bigContentTitle, null);
        }
    }

    @Override // s.AbstractC0771C
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // s.AbstractC0771C
    public final void g(Bundle bundle) {
        IconCompat h3;
        super.g(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.f9100f = h(bundle.getParcelable("android.largeIcon.big"));
            this.f9101g = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        if (parcelable != null) {
            h3 = h(parcelable);
        } else {
            h3 = h(bundle.getParcelable("android.pictureIcon"));
        }
        this.f9099e = h3;
        this.f9102h = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }
}
