package s;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* renamed from: s.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0789m extends AbstractC0771C {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f9103e;

    /* renamed from: f  reason: collision with root package name */
    public Object f9104f;

    public C0789m(int i3) {
        this.f9103e = i3;
        switch (i3) {
            case 1:
                this.f9104f = new ArrayList();
                return;
            default:
                return;
        }
    }

    @Override // s.AbstractC0771C
    public final void b(R0.j jVar) {
        switch (this.f9103e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) jVar.f2060o).setBigContentTitle(this.f9046b).bigText((CharSequence) this.f9104f);
                if (this.f9048d) {
                    bigText.setSummaryText(this.f9047c);
                    return;
                }
                return;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) jVar.f2060o).setBigContentTitle(this.f9046b);
                if (this.f9048d) {
                    bigContentTitle.setSummaryText(this.f9047c);
                }
                Iterator it = ((ArrayList) this.f9104f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                return;
        }
    }

    @Override // s.AbstractC0771C
    public final String c() {
        switch (this.f9103e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    @Override // s.AbstractC0771C
    public final void g(Bundle bundle) {
        switch (this.f9103e) {
            case 0:
                super.g(bundle);
                this.f9104f = bundle.getCharSequence("android.bigText");
                return;
            default:
                super.g(bundle);
                ArrayList arrayList = (ArrayList) this.f9104f;
                arrayList.clear();
                if (bundle.containsKey("android.textLines")) {
                    Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
                    return;
                }
                return;
        }
    }
}
