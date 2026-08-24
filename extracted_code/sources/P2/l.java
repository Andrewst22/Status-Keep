package P2;

import K2.AbstractC0092v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class l {

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1496m = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next");

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1497n = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_prev");

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1498o = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        r6 = ((P2.s) r6).f1512a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
        if (r5.get(r4) == r3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final P2.l h() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = P2.l.f1497n
            java.lang.Object r1 = r0.get(r9)
            P2.l r1 = (P2.l) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = P2.l.f1496m
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.m()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
            return r3
        L2e:
            boolean r7 = r6 instanceof P2.r
            if (r7 == 0) goto L38
            P2.r r6 = (P2.r) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof P2.s
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            P2.s r6 = (P2.s) r6
            P2.l r6 = r6.f1512a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            P2.l r3 = (P2.l) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            D2.i.c(r6, r4)
            r4 = r6
            P2.l r4 = (P2.l) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.l.h():P2.l");
    }

    public final void j(l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1497n;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(lVar);
            if (k() != lVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, lVar2, this)) {
                if (atomicReferenceFieldUpdater.get(lVar) != lVar2) {
                    break;
                }
            }
            if (m()) {
                lVar.h();
                return;
            }
            return;
        }
    }

    public final Object k() {
        while (true) {
            Object obj = f1496m.get(this);
            if (!(obj instanceof r)) {
                return obj;
            }
            ((r) obj).a(this);
        }
    }

    public final l l() {
        s sVar;
        l lVar;
        Object k3 = k();
        if (k3 instanceof s) {
            sVar = (s) k3;
        } else {
            sVar = null;
        }
        if (sVar == null || (lVar = sVar.f1512a) == null) {
            D2.i.c(k3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (l) k3;
        }
        return lVar;
    }

    public boolean m() {
        return k() instanceof s;
    }

    public String toString() {
        return new D2.m(this, AbstractC0092v.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC0092v.b(this);
    }
}
