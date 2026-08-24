package R;

import C.C0009j;
import U.AbstractC0123a;
/* renamed from: R.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108k {

    /* renamed from: a  reason: collision with root package name */
    public final int f1905a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1906b;

    static {
        boolean z3;
        C0009j c0009j = new C0009j(1);
        if (c0009j.f107b <= c0009j.f108c) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        new C0108k(c0009j);
        U.A.H(0);
        U.A.H(1);
        U.A.H(2);
        U.A.H(3);
    }

    public C0108k(C0009j c0009j) {
        c0009j.getClass();
        this.f1905a = c0009j.f107b;
        this.f1906b = c0009j.f108c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0108k)) {
            return false;
        }
        C0108k c0108k = (C0108k) obj;
        c0108k.getClass();
        if (this.f1905a == c0108k.f1905a && this.f1906b == c0108k.f1906b && U.A.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((16337 + this.f1905a) * 31) + this.f1906b) * 31;
    }
}
