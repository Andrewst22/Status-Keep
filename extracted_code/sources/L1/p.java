package L1;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class p implements I1.s {

    /* renamed from: m  reason: collision with root package name */
    public final B1.a f921m;

    /* renamed from: n  reason: collision with root package name */
    public final I1.g f922n;

    /* renamed from: o  reason: collision with root package name */
    public final K1.f f923o;

    /* renamed from: p  reason: collision with root package name */
    public final c f924p;

    /* renamed from: q  reason: collision with root package name */
    public final N1.b f925q;

    public p(B1.a aVar, K1.f fVar, c cVar) {
        I1.a aVar2 = I1.g.f462m;
        this.f925q = N1.b.f1111a;
        this.f921m = aVar;
        this.f922n = aVar2;
        this.f923o = fVar;
        this.f924p = cVar;
    }

    public final boolean a(Field field, boolean z3) {
        List list;
        Class<?> type = field.getType();
        K1.f fVar = this.f923o;
        fVar.getClass();
        if (!K1.f.b(type)) {
            fVar.a(z3);
            if ((field.getModifiers() & 136) == 0 && !field.isSynthetic() && !K1.f.b(field.getType())) {
                if (z3) {
                    list = fVar.f751m;
                } else {
                    list = fVar.f752n;
                }
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b2, code lost:
        r27 = r7;
        r6 = new P1.a(K1.d.k(r1, r27, r27.getGenericSuperclass(), new java.util.HashMap()));
        r7 = r6.f1465a;
        r0 = r33;
        r11 = r34;
        r12 = r12;
        r8 = r8;
        r9 = r9;
        r10 = r10;
        r13 = r13;
        r15 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    @Override // I1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final I1.r create(I1.k r34, P1.a r35) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.p.create(I1.k, P1.a):I1.r");
    }
}
