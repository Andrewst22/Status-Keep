package k0;

import D1.g0;
import R.C0113p;
/* renamed from: k0.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555j {

    /* renamed from: a  reason: collision with root package name */
    public final int f7604a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7605b;

    /* renamed from: c  reason: collision with root package name */
    public final C0113p f7606c;

    /* renamed from: d  reason: collision with root package name */
    public final g0 f7607d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7608e;

    public C0555j(C0113p c0113p, int i3, int i4, g0 g0Var, String str) {
        this.f7604a = i3;
        this.f7605b = i4;
        this.f7606c = c0113p;
        this.f7607d = g0.a(g0Var);
        this.f7608e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0555j.class != obj.getClass()) {
            return false;
        }
        C0555j c0555j = (C0555j) obj;
        if (this.f7604a == c0555j.f7604a && this.f7605b == c0555j.f7605b && this.f7606c.equals(c0555j.f7606c)) {
            g0 g0Var = this.f7607d;
            g0Var.getClass();
            if (D1.r.h(g0Var, c0555j.f7607d) && this.f7608e.equals(c0555j.f7608e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f7606c.hashCode();
        int hashCode2 = this.f7607d.hashCode();
        return this.f7608e.hashCode() + ((hashCode2 + ((hashCode + ((((217 + this.f7604a) * 31) + this.f7605b) * 31)) * 31)) * 31);
    }
}
