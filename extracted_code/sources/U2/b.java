package U2;

import D2.h;
import D2.i;
import T2.l;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final T2.b f2582a;

    /* renamed from: b  reason: collision with root package name */
    public static final T2.b f2583b;

    /* renamed from: c  reason: collision with root package name */
    public static final T2.b f2584c;

    /* renamed from: d  reason: collision with root package name */
    public static final T2.b f2585d;

    /* renamed from: e  reason: collision with root package name */
    public static final T2.b f2586e;

    static {
        T2.b bVar = T2.b.f2354p;
        f2582a = android.support.v4.media.session.a.r("/");
        f2583b = android.support.v4.media.session.a.r("\\");
        f2584c = android.support.v4.media.session.a.r("/\\");
        f2585d = android.support.v4.media.session.a.r(".");
        f2586e = android.support.v4.media.session.a.r("..");
    }

    public static final int a(l lVar) {
        if (lVar.f2380m.b() == 0) {
            return -1;
        }
        T2.b bVar = lVar.f2380m;
        if (bVar.g(0) != 47) {
            if (bVar.g(0) == 92) {
                if (bVar.b() > 2 && bVar.g(1) == 92) {
                    T2.b bVar2 = f2583b;
                    i.e(bVar2, "other");
                    int d3 = bVar.d(bVar2.f2355m, 2);
                    if (d3 == -1) {
                        return bVar.b();
                    }
                    return d3;
                }
            } else if (bVar.b() <= 2 || bVar.g(1) != 58 || bVar.g(2) != 92) {
                return -1;
            } else {
                char g3 = (char) bVar.g(0);
                if (('a' > g3 || g3 >= '{') && ('A' > g3 || g3 >= '[')) {
                    return -1;
                }
                return 3;
            }
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T2.a, java.lang.Object] */
    public static final l b(l lVar, l lVar2, boolean z3) {
        i.e(lVar, "<this>");
        i.e(lVar2, "child");
        if (a(lVar2) != -1 || lVar2.g() != null) {
            return lVar2;
        }
        T2.b c3 = c(lVar);
        if (c3 == null && (c3 = c(lVar2)) == null) {
            c3 = f(l.f2379n);
        }
        ?? obj = new Object();
        obj.m(lVar.f2380m);
        if (obj.f2353n > 0) {
            obj.m(c3);
        }
        obj.m(lVar2.f2380m);
        return d(obj, z3);
    }

    public static final T2.b c(l lVar) {
        T2.b bVar = lVar.f2380m;
        T2.b bVar2 = f2582a;
        if (T2.b.e(bVar, bVar2) == -1) {
            T2.b bVar3 = f2583b;
            if (T2.b.e(lVar.f2380m, bVar3) == -1) {
                return null;
            }
            return bVar3;
        }
        return bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0101, code lost:
        if (D2.i.a(r4.get(t2.AbstractC0828e.B(r4)), r9) != false) goto L55;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [T2.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final T2.l d(T2.a r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.b.d(T2.a, boolean):T2.l");
    }

    public static final T2.b e(byte b3) {
        if (b3 != 47) {
            if (b3 == 92) {
                return f2583b;
            }
            throw new IllegalArgumentException(h.k("not a directory separator: ", b3));
        }
        return f2582a;
    }

    public static final T2.b f(String str) {
        if (i.a(str, "/")) {
            return f2582a;
        }
        if (i.a(str, "\\")) {
            return f2583b;
        }
        throw new IllegalArgumentException(h.l("not a directory separator: ", str));
    }
}
