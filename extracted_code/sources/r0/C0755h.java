package r0;

import D1.AbstractC0046z;
import R.C0113p;
/* renamed from: r0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0755h implements Comparable {

    /* renamed from: m  reason: collision with root package name */
    public final boolean f8935m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f8936n;

    public C0755h(C0113p c0113p, int i3) {
        this.f8935m = (c0113p.f1966e & 1) != 0;
        this.f8936n = D2.h.i(i3, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0755h c0755h = (C0755h) obj;
        return AbstractC0046z.f317a.c(this.f8936n, c0755h.f8936n).c(this.f8935m, c0755h.f8935m).e();
    }
}
