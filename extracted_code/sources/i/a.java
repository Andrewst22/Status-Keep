package I;

import N.k;
import W1.o;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;
import l.h0;
/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f439a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f440b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Handler handler, int i3) {
        super(handler);
        this.f439a = i3;
        this.f440b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f439a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3, Uri uri) {
        switch (this.f439a) {
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                io.flutter.view.k kVar = (io.flutter.view.k) this.f440b;
                if (kVar.f6392u) {
                    return;
                }
                if (Settings.Global.getFloat(kVar.f6377f, "transition_animation_scale", 1.0f) == 0.0f) {
                    kVar.f6383l |= 4;
                } else {
                    kVar.f6383l &= -5;
                }
                ((FlutterJNI) kVar.f6373b.f57o).setAccessibilityFeatures(kVar.f6383l);
                return;
            default:
                super.onChange(z3, uri);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h0 h0Var) {
        super(new Handler());
        this.f439a = 0;
        this.f440b = h0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        Cursor cursor;
        switch (this.f439a) {
            case 0:
                h0 h0Var = (h0) this.f440b;
                if (!h0Var.f444n || (cursor = h0Var.f445o) == null || cursor.isClosed()) {
                    return;
                }
                h0Var.f443m = h0Var.f445o.requery();
                return;
            case 1:
                super.onChange(z3);
                o oVar = (o) this.f440b;
                if (oVar.f2894t == null) {
                    return;
                }
                oVar.d();
                return;
            default:
                onChange(z3, null);
                return;
        }
    }
}
