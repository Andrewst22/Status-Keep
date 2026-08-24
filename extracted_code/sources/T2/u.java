package T2;

import a.AbstractC0155a;
import java.io.IOException;
import java.util.LinkedHashMap;
import m2.AbstractC0635d;
/* loaded from: classes.dex */
public final class u extends f {

    /* renamed from: e  reason: collision with root package name */
    public static final l f2401e;

    /* renamed from: b  reason: collision with root package name */
    public final l f2402b;

    /* renamed from: c  reason: collision with root package name */
    public final i f2403c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f2404d;

    static {
        String str = l.f2379n;
        f2401e = B1.b.q("/", false);
    }

    public u(l lVar, i iVar, LinkedHashMap linkedHashMap) {
        D2.i.e(iVar, "fileSystem");
        this.f2402b = lVar;
        this.f2403c = iVar;
        this.f2404d = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, D2.q] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, D2.q] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, D2.q] */
    @Override // T2.f
    public final e b(l lVar) {
        Long valueOf;
        p pVar;
        int a3;
        D2.i.e(lVar, "path");
        l lVar2 = f2401e;
        lVar2.getClass();
        U2.e eVar = (U2.e) this.f2404d.get(U2.b.b(lVar2, lVar, true));
        Throwable th = null;
        if (eVar == null) {
            return null;
        }
        boolean z3 = eVar.f2592b;
        boolean z4 = !z3;
        if (z3) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(eVar.f2593c);
        }
        e eVar2 = new e(z4, z3, valueOf, null, eVar.f2594d, null);
        long j3 = eVar.f2595e;
        if (j3 == -1) {
            return eVar2;
        }
        h e2 = this.f2403c.e(this.f2402b);
        try {
            pVar = AbstractC0155a.g(e2.d(j3));
            try {
                e2.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                e2.close();
            } catch (Throwable th4) {
                AbstractC0635d.b(th3, th4);
            }
            pVar = null;
            th = th3;
        }
        if (th == null) {
            D2.i.b(pVar);
            ?? obj = new Object();
            obj.f342m = eVar2.f2368e;
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            if (pVar.a() == 67324752) {
                pVar.g(2L);
                short c3 = pVar.c();
                int i3 = c3 & 65535;
                if ((c3 & 1) == 0) {
                    pVar.g(18L);
                    pVar.g(pVar.c() & 65535);
                    U2.a.d(pVar, pVar.c() & 65535, new U2.g(pVar, obj, obj2, obj3));
                    e eVar3 = new e(eVar2.f2364a, eVar2.f2365b, eVar2.f2366c, (Long) obj3.f342m, (Long) obj.f342m, (Long) obj2.f342m);
                    D2.i.b(eVar3);
                    return eVar3;
                }
                throw new IOException("unsupported zip: general purpose bit flag=" + U2.a.b(i3));
            }
            throw new IOException("bad zip: expected " + U2.a.b(67324752) + " but was " + U2.a.b(a3));
        }
        throw th;
    }
}
