package I1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* loaded from: classes.dex */
public final class i extends r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f465a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f466b;

    public /* synthetic */ i(r rVar, int i3) {
        this.f465a = i3;
        this.f466b = rVar;
    }

    @Override // I1.r
    public final Object a(Q1.b bVar) {
        switch (this.f465a) {
            case 0:
                return new AtomicLong(((Number) this.f466b.a(bVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                bVar.a();
                while (bVar.j()) {
                    arrayList.add(Long.valueOf(((Number) this.f466b.a(bVar)).longValue()));
                }
                bVar.f();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i3 = 0; i3 < size; i3++) {
                    atomicLongArray.set(i3, ((Long) arrayList.get(i3)).longValue());
                }
                return atomicLongArray;
            default:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                return this.f466b.a(bVar);
        }
    }

    @Override // I1.r
    public final void b(Q1.c cVar, Object obj) {
        switch (this.f465a) {
            case 0:
                this.f466b.b(cVar, Long.valueOf(((AtomicLong) obj).get()));
                return;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.b();
                int length = atomicLongArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    this.f466b.b(cVar, Long.valueOf(atomicLongArray.get(i3)));
                }
                cVar.f();
                return;
            default:
                if (obj == null) {
                    cVar.j();
                    return;
                } else {
                    this.f466b.b(cVar, obj);
                    return;
                }
        }
    }
}
