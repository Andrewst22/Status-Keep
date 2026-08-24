package Q;

import R0.j;
import android.app.Notification;
import android.os.Build;
import s.AbstractC0771C;
import s.AbstractC0796u;
/* loaded from: classes.dex */
public final class a extends AbstractC0771C {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f1523e;

    @Override // s.AbstractC0771C
    public final void b(j jVar) {
        switch (this.f1523e) {
            case 0:
                ((Notification.Builder) jVar.f2060o).setStyle(new Notification.MediaStyle());
                return;
            default:
                if (Build.VERSION.SDK_INT >= 24) {
                    ((Notification.Builder) jVar.f2060o).setStyle(AbstractC0796u.a());
                    return;
                }
                return;
        }
    }

    @Override // s.AbstractC0771C
    public String c() {
        switch (this.f1523e) {
            case 1:
                return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
            default:
                return super.c();
        }
    }

    @Override // s.AbstractC0771C
    public final void d() {
        switch (this.f1523e) {
            case 0:
                return;
            default:
                if (Build.VERSION.SDK_INT < 24) {
                    this.f9045a.getClass();
                    this.f9045a.getClass();
                    return;
                }
                return;
        }
    }

    @Override // s.AbstractC0771C
    public final void e() {
        switch (this.f1523e) {
            case 0:
                return;
            default:
                if (Build.VERSION.SDK_INT < 24) {
                    this.f9045a.getClass();
                    return;
                }
                return;
        }
    }

    @Override // s.AbstractC0771C
    public void f() {
        switch (this.f1523e) {
            case 1:
                if (Build.VERSION.SDK_INT < 24) {
                    this.f9045a.getClass();
                    this.f9045a.getClass();
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void h() {
    }

    private final void i() {
    }
}
