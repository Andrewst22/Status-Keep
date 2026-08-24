package r0;

import R.Z;
import U.A;
import U.AbstractC0123a;
import Y.k0;
import l.C0576n;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final int f8996a;

    /* renamed from: b  reason: collision with root package name */
    public final k0[] f8997b;

    /* renamed from: c  reason: collision with root package name */
    public final s[] f8998c;

    /* renamed from: d  reason: collision with root package name */
    public final Z f8999d;

    /* renamed from: e  reason: collision with root package name */
    public final C0576n f9000e;

    public v(k0[] k0VarArr, s[] sVarArr, Z z3, C0576n c0576n) {
        boolean z4;
        if (k0VarArr.length == sVarArr.length) {
            z4 = true;
        } else {
            z4 = false;
        }
        AbstractC0123a.e(z4);
        this.f8997b = k0VarArr;
        this.f8998c = (s[]) sVarArr.clone();
        this.f8999d = z3;
        this.f9000e = c0576n;
        this.f8996a = k0VarArr.length;
    }

    public final boolean a(v vVar, int i3) {
        if (vVar == null || !A.a(this.f8997b[i3], vVar.f8997b[i3]) || !A.a(this.f8998c[i3], vVar.f8998c[i3])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i3) {
        if (this.f8997b[i3] != null) {
            return true;
        }
        return false;
    }
}
