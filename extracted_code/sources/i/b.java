package I;

import android.database.DataSetObserver;
import l.K;
import l.h0;
/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f441a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f442b;

    public /* synthetic */ b(Object obj, int i3) {
        this.f441a = i3;
        this.f442b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f441a) {
            case 0:
                h0 h0Var = (h0) this.f442b;
                h0Var.f443m = true;
                h0Var.notifyDataSetChanged();
                return;
            default:
                K k3 = (K) this.f442b;
                if (k3.f7747H.isShowing()) {
                    k3.d();
                    return;
                }
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f441a) {
            case 0:
                h0 h0Var = (h0) this.f442b;
                h0Var.f443m = false;
                h0Var.notifyDataSetInvalidated();
                return;
            default:
                ((K) this.f442b).dismiss();
                return;
        }
    }
}
