package T2;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final q f2396a = new q(new byte[0], 0, 0, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f2397b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference[] f2398c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f2397b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i3 = 0; i3 < highestOneBit; i3++) {
            atomicReferenceArr[i3] = new AtomicReference();
        }
        f2398c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        int i3;
        D2.i.e(qVar, "segment");
        if (qVar.f2394f == null && qVar.f2395g == null) {
            if (qVar.f2392d) {
                return;
            }
            AtomicReference atomicReference = f2398c[(int) (Thread.currentThread().getId() & (f2397b - 1))];
            q qVar2 = f2396a;
            q qVar3 = (q) atomicReference.getAndSet(qVar2);
            if (qVar3 == qVar2) {
                return;
            }
            if (qVar3 != null) {
                i3 = qVar3.f2391c;
            } else {
                i3 = 0;
            }
            if (i3 >= 65536) {
                atomicReference.set(qVar3);
                return;
            }
            qVar.f2394f = qVar3;
            qVar.f2390b = 0;
            qVar.f2391c = i3 + 8192;
            atomicReference.set(qVar);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final q b() {
        AtomicReference atomicReference = f2398c[(int) (Thread.currentThread().getId() & (f2397b - 1))];
        q qVar = f2396a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f2394f);
        qVar2.f2394f = null;
        qVar2.f2391c = 0;
        return qVar2;
    }
}
