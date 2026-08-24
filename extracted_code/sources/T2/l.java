package T2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class l implements Comparable {

    /* renamed from: n  reason: collision with root package name */
    public static final String f2379n;

    /* renamed from: m  reason: collision with root package name */
    public final b f2380m;

    static {
        String str = File.separator;
        D2.i.d(str, "separator");
        f2379n = str;
    }

    public l(b bVar) {
        D2.i.e(bVar, "bytes");
        this.f2380m = bVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a3 = U2.b.a(this);
        b bVar = this.f2380m;
        if (a3 == -1) {
            a3 = 0;
        } else if (a3 < bVar.b() && bVar.g(a3) == 92) {
            a3++;
        }
        int b3 = bVar.b();
        int i3 = a3;
        while (a3 < b3) {
            if (bVar.g(a3) == 47 || bVar.g(a3) == 92) {
                arrayList.add(bVar.l(i3, a3));
                i3 = a3 + 1;
            }
            a3++;
        }
        if (i3 < bVar.b()) {
            arrayList.add(bVar.l(i3, bVar.b()));
        }
        return arrayList;
    }

    public final String b() {
        b bVar = U2.b.f2582a;
        b bVar2 = U2.b.f2582a;
        b bVar3 = this.f2380m;
        int i3 = b.i(bVar3, bVar2);
        if (i3 == -1) {
            i3 = b.i(bVar3, U2.b.f2583b);
        }
        if (i3 != -1) {
            bVar3 = b.m(bVar3, i3 + 1, 0, 2);
        } else if (g() != null && bVar3.b() == 2) {
            bVar3 = b.f2354p;
        }
        return bVar3.n();
    }

    public final l c() {
        b bVar = U2.b.f2585d;
        b bVar2 = this.f2380m;
        if (D2.i.a(bVar2, bVar)) {
            return null;
        }
        b bVar3 = U2.b.f2582a;
        if (D2.i.a(bVar2, bVar3)) {
            return null;
        }
        b bVar4 = U2.b.f2583b;
        if (D2.i.a(bVar2, bVar4)) {
            return null;
        }
        b bVar5 = U2.b.f2586e;
        bVar2.getClass();
        D2.i.e(bVar5, "suffix");
        int b3 = bVar2.b();
        byte[] bArr = bVar5.f2355m;
        if (bVar2.k(b3 - bArr.length, bVar5, bArr.length) && (bVar2.b() == 2 || bVar2.k(bVar2.b() - 3, bVar3, 1) || bVar2.k(bVar2.b() - 3, bVar4, 1))) {
            return null;
        }
        int i3 = b.i(bVar2, bVar3);
        if (i3 == -1) {
            i3 = b.i(bVar2, bVar4);
        }
        if (i3 == 2 && g() != null) {
            if (bVar2.b() == 3) {
                return null;
            }
            return new l(b.m(bVar2, 0, 3, 1));
        }
        if (i3 == 1) {
            D2.i.e(bVar4, "prefix");
            if (bVar2.k(0, bVar4, bVar4.f2355m.length)) {
                return null;
            }
        }
        if (i3 == -1 && g() != null) {
            if (bVar2.b() == 2) {
                return null;
            }
            return new l(b.m(bVar2, 0, 2, 1));
        } else if (i3 == -1) {
            return new l(bVar);
        } else {
            if (i3 == 0) {
                return new l(b.m(bVar2, 0, 1, 1));
            }
            return new l(b.m(bVar2, 0, i3, 1));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        D2.i.e(lVar, "other");
        return this.f2380m.compareTo(lVar.f2380m);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T2.a, java.lang.Object] */
    public final l d(String str) {
        D2.i.e(str, "child");
        ?? obj = new Object();
        obj.p(str);
        return U2.b.b(this, U2.b.d(obj, false), false);
    }

    public final File e() {
        return new File(this.f2380m.n());
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof l) && D2.i.a(((l) obj).f2380m, this.f2380m)) {
            return true;
        }
        return false;
    }

    public final Path f() {
        Path path;
        path = Paths.get(this.f2380m.n(), new String[0]);
        D2.i.d(path, "get(toString())");
        return path;
    }

    public final Character g() {
        b bVar = U2.b.f2582a;
        b bVar2 = this.f2380m;
        if (b.e(bVar2, bVar) != -1 || bVar2.b() < 2 || bVar2.g(1) != 58) {
            return null;
        }
        char g3 = (char) bVar2.g(0);
        if (('a' > g3 || g3 >= '{') && ('A' > g3 || g3 >= '[')) {
            return null;
        }
        return Character.valueOf(g3);
    }

    public final int hashCode() {
        return this.f2380m.hashCode();
    }

    public final String toString() {
        return this.f2380m.n();
    }
}
