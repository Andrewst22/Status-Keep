package g2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f5782a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B1.e f5783b;

    public i(B1.e eVar) {
        this.f5783b = eVar;
    }

    public final void a(Object obj) {
        if (!this.f5782a.get()) {
            B1.e eVar = this.f5783b;
            if (((AtomicReference) eVar.f57o).get() == this) {
                B1.e eVar2 = (B1.e) eVar.f58p;
                ((g) eVar2.f56n).f((String) eVar2.f57o, ((x) eVar2.f58p).b(obj));
            }
        }
    }
}
