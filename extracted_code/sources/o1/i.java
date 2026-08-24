package o1;

import java.math.BigInteger;
import s2.C0806e;
/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: r  reason: collision with root package name */
    public static final i f8675r;

    /* renamed from: m  reason: collision with root package name */
    public final int f8676m;

    /* renamed from: n  reason: collision with root package name */
    public final int f8677n;

    /* renamed from: o  reason: collision with root package name */
    public final int f8678o;

    /* renamed from: p  reason: collision with root package name */
    public final String f8679p;

    /* renamed from: q  reason: collision with root package name */
    public final C0806e f8680q = new C0806e(new O.d(this, 3));

    static {
        new i(0, 0, 0, "");
        f8675r = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i3, int i4, int i5, String str) {
        this.f8676m = i3;
        this.f8677n = i4;
        this.f8678o = i5;
        this.f8679p = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        D2.i.e(iVar, "other");
        Object a3 = this.f8680q.a();
        D2.i.d(a3, "<get-bigInteger>(...)");
        Object a4 = iVar.f8680q.a();
        D2.i.d(a4, "<get-bigInteger>(...)");
        return ((BigInteger) a3).compareTo((BigInteger) a4);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f8676m != iVar.f8676m || this.f8677n != iVar.f8677n || this.f8678o != iVar.f8678o) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((527 + this.f8676m) * 31) + this.f8677n) * 31) + this.f8678o;
    }

    public final String toString() {
        String str;
        String str2 = this.f8679p;
        if (!J2.i.W(str2)) {
            str = "-" + str2;
        } else {
            str = "";
        }
        return this.f8676m + '.' + this.f8677n + '.' + this.f8678o + str;
    }
}
