package l;

import androidx.appcompat.widget.SearchView;
/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7786m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ SearchView f7787n;

    public /* synthetic */ V(SearchView searchView, int i3) {
        this.f7786m = i3;
        this.f7787n = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7786m) {
            case 0:
                this.f7787n.q();
                return;
            default:
                I.c cVar = this.f7787n.f4018d0;
                if (cVar instanceof h0) {
                    cVar.b(null);
                    return;
                }
                return;
        }
    }
}
