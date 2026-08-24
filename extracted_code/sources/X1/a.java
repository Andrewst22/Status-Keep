package X1;

import android.util.SparseArray;
import io.flutter.plugin.platform.m;
import io.flutter.plugin.platform.n;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f2974a;

    public a(c cVar) {
        this.f2974a = cVar;
    }

    @Override // X1.b
    public final void a() {
        c cVar = this.f2974a;
        Iterator it = cVar.f2995t.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        while (true) {
            n nVar = cVar.f2993r;
            SparseArray sparseArray = nVar.f6247k;
            if (sparseArray.size() <= 0) {
                break;
            }
            nVar.f6258v.e(sparseArray.keyAt(0));
        }
        while (true) {
            m mVar = cVar.f2994s;
            SparseArray sparseArray2 = mVar.f6228i;
            if (sparseArray2.size() > 0) {
                mVar.f6235p.e(sparseArray2.keyAt(0));
            } else {
                cVar.f2986k.f5606b = null;
                return;
            }
        }
    }

    @Override // X1.b
    public final void b() {
    }
}
