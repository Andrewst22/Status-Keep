package N2;

import K2.C0077f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s2.C0808g;
import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class q extends O2.b implements d, e, O2.j {

    /* renamed from: q  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1177q = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: p  reason: collision with root package name */
    public int f1178p;

    public q(Object obj) {
        this._state = obj;
    }

    @Override // O2.j
    public final d J(u2.i iVar, int i3, int i4) {
        if ((((i3 >= 0 && i3 < 2) || i3 == -2) && i4 == 2) || ((i3 == 0 || i3 == -3) && i4 == 1)) {
            return this;
        }
        return new O2.h(this, iVar, i3, i4);
    }

    @Override // N2.e
    public final Object a(Object obj, InterfaceC0866d interfaceC0866d) {
        if (obj == null) {
            obj = O2.l.f1350a;
        }
        c(null, obj);
        return C0808g.f9229a;
    }

    public final boolean c(Object obj, Object obj2) {
        int i3;
        O2.c[] cVarArr;
        C1.f fVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1177q;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !D2.i.a(obj3, obj)) {
                return false;
            }
            if (D2.i.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i4 = this.f1178p;
            if ((i4 & 1) == 0) {
                int i5 = i4 + 1;
                this.f1178p = i5;
                O2.c[] cVarArr2 = this.f1330m;
                while (true) {
                    s[] sVarArr = (s[]) cVarArr2;
                    if (sVarArr != null) {
                        for (s sVar : sVarArr) {
                            if (sVar != null) {
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s.f1181a;
                                    Object obj4 = atomicReferenceFieldUpdater2.get(sVar);
                                    if (obj4 != null && obj4 != (fVar = r.f1180b)) {
                                        C1.f fVar2 = r.f1179a;
                                        if (obj4 == fVar2) {
                                            while (!atomicReferenceFieldUpdater2.compareAndSet(sVar, obj4, fVar)) {
                                                if (atomicReferenceFieldUpdater2.get(sVar) != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReferenceFieldUpdater2.compareAndSet(sVar, obj4, fVar2)) {
                                                if (atomicReferenceFieldUpdater2.get(sVar) != obj4) {
                                                    break;
                                                }
                                            }
                                            ((C0077f) obj4).k(C0808g.f9229a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i3 = this.f1178p;
                        if (i3 == i5) {
                            this.f1178p = i5 + 1;
                            return true;
                        }
                        cVarArr = this.f1330m;
                    }
                    cVarArr2 = cVarArr;
                    i5 = i3;
                }
            } else {
                this.f1178p = i4 + 2;
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e8, code lost:
        if (r0.equals(r4) != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00cc, B:52:0x00d4, B:55:0x00db, B:56:0x00e1, B:58:0x00e4, B:68:0x0105, B:71:0x0118, B:72:0x0130, B:78:0x0144, B:75:0x013b, B:77:0x0141, B:60:0x00ea, B:64:0x00f1, B:21:0x0053, B:24:0x005e, B:49:0x00bc), top: B:89:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00cc, B:52:0x00d4, B:55:0x00db, B:56:0x00e1, B:58:0x00e4, B:68:0x0105, B:71:0x0118, B:72:0x0130, B:78:0x0144, B:75:0x013b, B:77:0x0141, B:60:0x00ea, B:64:0x00f1, B:21:0x0053, B:24:0x005e, B:49:0x00bc), top: B:89:0x0026 }] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[], O2.c[]] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0117 -> B:50:0x00cc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x014d -> B:83:0x0150). Please submit an issue!!! */
    @Override // N2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(N2.e r17, u2.InterfaceC0866d r18) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.q.x(N2.e, u2.d):java.lang.Object");
    }
}
