package U;

import g1.C0273a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f2437m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f2438n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f2439o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f2440p;

    public /* synthetic */ h(Object obj, int i3, Object obj2, int i4) {
        this.f2437m = i4;
        this.f2439o = obj;
        this.f2438n = i3;
        this.f2440p = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2437m) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) this.f2439o).iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (!kVar.f2444d) {
                        int i3 = this.f2438n;
                        if (i3 != -1) {
                            kVar.f2442b.a(i3);
                        }
                        kVar.f2443c = true;
                        ((i) this.f2440p).b(kVar.f2441a);
                    }
                }
                return;
            default:
                ((C0273a) this.f2439o).f5744b.h(this.f2438n, (Serializable) this.f2440p);
                return;
        }
    }
}
