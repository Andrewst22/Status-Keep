package U2;

import D2.i;
import T2.l;
import java.util.ArrayList;
import java.util.List;
import s2.C0803b;
import s2.C0806e;
/* loaded from: classes.dex */
public final class d extends T2.f {

    /* renamed from: c  reason: collision with root package name */
    public static final l f2589c;

    /* renamed from: b  reason: collision with root package name */
    public final C0806e f2590b;

    static {
        String str = l.f2379n;
        f2589c = B1.b.q("/", false);
    }

    public d(ClassLoader classLoader) {
        this.f2590b = new C0806e(new O.d(classLoader, 1));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T2.a, java.lang.Object] */
    @Override // T2.f
    public final T2.e b(l lVar) {
        l lVar2;
        l lVar3;
        l d3;
        i.e(lVar, "path");
        if (!B1.b.m(lVar)) {
            return null;
        }
        l lVar4 = f2589c;
        lVar4.getClass();
        i.e(lVar, "child");
        l b3 = b.b(lVar4, lVar, true);
        int a3 = b.a(b3);
        T2.b bVar = b3.f2380m;
        if (a3 == -1) {
            lVar2 = null;
        } else {
            lVar2 = new l(bVar.l(0, a3));
        }
        int a4 = b.a(lVar4);
        T2.b bVar2 = lVar4.f2380m;
        if (a4 == -1) {
            lVar3 = null;
        } else {
            lVar3 = new l(bVar2.l(0, a4));
        }
        if (i.a(lVar2, lVar3)) {
            ArrayList a5 = b3.a();
            ArrayList a6 = lVar4.a();
            int min = Math.min(a5.size(), a6.size());
            int i3 = 0;
            while (i3 < min && i.a(a5.get(i3), a6.get(i3))) {
                i3++;
            }
            if (i3 == min && bVar.b() == bVar2.b()) {
                String str = l.f2379n;
                d3 = B1.b.q(".", false);
            } else if (a6.subList(i3, a6.size()).indexOf(b.f2586e) == -1) {
                ?? obj = new Object();
                T2.b c3 = b.c(lVar4);
                if (c3 == null && (c3 = b.c(b3)) == null) {
                    c3 = b.f(l.f2379n);
                }
                int size = a6.size();
                for (int i4 = i3; i4 < size; i4++) {
                    obj.m(b.f2586e);
                    obj.m(c3);
                }
                int size2 = a5.size();
                while (i3 < size2) {
                    obj.m((T2.b) a5.get(i3));
                    obj.m(c3);
                    i3++;
                }
                d3 = b.d(obj, false);
            } else {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + b3 + " and " + lVar4).toString());
            }
            String n3 = d3.f2380m.n();
            for (C0803b c0803b : (List) this.f2590b.a()) {
                T2.e b4 = ((T2.f) c0803b.f9222m).b(((l) c0803b.f9223n).d(n3));
                if (b4 != null) {
                    return b4;
                }
            }
            return null;
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + b3 + " and " + lVar4).toString());
    }
}
