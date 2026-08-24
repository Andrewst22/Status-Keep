package o0;

import R.C0112o;
import R.C0113p;
import U.AbstractC0123a;
import Y.l0;
import g0.C0271b;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
/* loaded from: classes.dex */
public final class F implements InterfaceC0699x, InterfaceC0698w {

    /* renamed from: m  reason: collision with root package name */
    public final InterfaceC0699x[] f8419m;

    /* renamed from: n  reason: collision with root package name */
    public final IdentityHashMap f8420n;

    /* renamed from: o  reason: collision with root package name */
    public final e0.l f8421o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f8422p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public final HashMap f8423q = new HashMap();

    /* renamed from: r  reason: collision with root package name */
    public InterfaceC0698w f8424r;

    /* renamed from: s  reason: collision with root package name */
    public b0 f8425s;

    /* renamed from: t  reason: collision with root package name */
    public InterfaceC0699x[] f8426t;

    /* renamed from: u  reason: collision with root package name */
    public C0688l f8427u;

    public F(e0.l lVar, long[] jArr, InterfaceC0699x... interfaceC0699xArr) {
        this.f8421o = lVar;
        this.f8419m = interfaceC0699xArr;
        lVar.getClass();
        D1.G g3 = D1.I.f197n;
        D1.b0 b0Var = D1.b0.f231q;
        this.f8427u = new C0688l(b0Var, b0Var);
        this.f8420n = new IdentityHashMap();
        this.f8426t = new InterfaceC0699x[0];
        for (int i3 = 0; i3 < interfaceC0699xArr.length; i3++) {
            long j3 = jArr[i3];
            if (j3 != 0) {
                this.f8419m[i3] = new a0(interfaceC0699xArr[i3], j3);
            }
        }
    }

    @Override // o0.InterfaceC0699x
    public final long b(long j3, l0 l0Var) {
        InterfaceC0699x interfaceC0699x;
        InterfaceC0699x[] interfaceC0699xArr = this.f8426t;
        if (interfaceC0699xArr.length > 0) {
            interfaceC0699x = interfaceC0699xArr[0];
        } else {
            interfaceC0699x = this.f8419m[0];
        }
        return interfaceC0699x.b(j3, l0Var);
    }

    @Override // o0.W
    public final boolean d() {
        return this.f8427u.d();
    }

    @Override // o0.V
    public final void f(W w3) {
        InterfaceC0699x interfaceC0699x = (InterfaceC0699x) w3;
        InterfaceC0698w interfaceC0698w = this.f8424r;
        interfaceC0698w.getClass();
        interfaceC0698w.f(this);
    }

    @Override // o0.InterfaceC0699x
    public final b0 g() {
        b0 b0Var = this.f8425s;
        b0Var.getClass();
        return b0Var;
    }

    @Override // o0.W
    public final boolean h(Y.P p3) {
        ArrayList arrayList = this.f8422p;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((InterfaceC0699x) arrayList.get(i3)).h(p3);
            }
            return false;
        }
        return this.f8427u.h(p3);
    }

    @Override // o0.InterfaceC0698w
    public final void j(InterfaceC0699x interfaceC0699x) {
        ArrayList arrayList = this.f8422p;
        arrayList.remove(interfaceC0699x);
        if (!arrayList.isEmpty()) {
            return;
        }
        InterfaceC0699x[] interfaceC0699xArr = this.f8419m;
        int i3 = 0;
        for (InterfaceC0699x interfaceC0699x2 : interfaceC0699xArr) {
            i3 += interfaceC0699x2.g().f8579a;
        }
        R.U[] uArr = new R.U[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < interfaceC0699xArr.length; i5++) {
            b0 g3 = interfaceC0699xArr[i5].g();
            int i6 = g3.f8579a;
            int i7 = 0;
            while (i7 < i6) {
                R.U a3 = g3.a(i7);
                int i8 = a3.f1821a;
                C0113p[] c0113pArr = new C0113p[i8];
                for (int i9 = 0; i9 < i8; i9++) {
                    C0113p c0113p = a3.f1824d[i9];
                    C0112o a4 = c0113p.a();
                    StringBuilder sb = new StringBuilder();
                    sb.append(i5);
                    sb.append(":");
                    String str = c0113p.f1962a;
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    a4.f1926a = sb.toString();
                    c0113pArr[i9] = new C0113p(a4);
                }
                R.U u3 = new R.U(i5 + ":" + a3.f1822b, c0113pArr);
                this.f8423q.put(u3, a3);
                uArr[i4] = u3;
                i7++;
                i4++;
            }
        }
        this.f8425s = new b0(uArr);
        InterfaceC0698w interfaceC0698w = this.f8424r;
        interfaceC0698w.getClass();
        interfaceC0698w.j(this);
    }

    @Override // o0.InterfaceC0699x
    public final void l(InterfaceC0698w interfaceC0698w, long j3) {
        this.f8424r = interfaceC0698w;
        ArrayList arrayList = this.f8422p;
        InterfaceC0699x[] interfaceC0699xArr = this.f8419m;
        Collections.addAll(arrayList, interfaceC0699xArr);
        for (InterfaceC0699x interfaceC0699x : interfaceC0699xArr) {
            interfaceC0699x.l(this, j3);
        }
    }

    @Override // o0.W
    public final long m() {
        return this.f8427u.m();
    }

    @Override // o0.InterfaceC0699x
    public final void o() {
        for (InterfaceC0699x interfaceC0699x : this.f8419m) {
            interfaceC0699x.o();
        }
    }

    @Override // o0.InterfaceC0699x
    public final long p(r0.s[] sVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        U u3;
        ArrayList arrayList;
        Integer num;
        int intValue;
        int[] iArr = new int[sVarArr.length];
        int[] iArr2 = new int[sVarArr.length];
        int i3 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.f8420n;
            if (i3 >= length) {
                break;
            }
            U u4 = uArr[i3];
            if (u4 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(u4);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i3] = intValue;
            r0.s sVar = sVarArr[i3];
            if (sVar != null) {
                String str = sVar.b().f1822b;
                iArr2[i3] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i3] = -1;
            }
            i3++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        U[] uArr2 = new U[length2];
        U[] uArr3 = new U[sVarArr.length];
        r0.s[] sVarArr2 = new r0.s[sVarArr.length];
        InterfaceC0699x[] interfaceC0699xArr = this.f8419m;
        ArrayList arrayList2 = new ArrayList(interfaceC0699xArr.length);
        long j4 = j3;
        int i4 = 0;
        while (i4 < interfaceC0699xArr.length) {
            int i5 = 0;
            while (i5 < sVarArr.length) {
                if (iArr[i5] == i4) {
                    u3 = uArr[i5];
                } else {
                    u3 = null;
                }
                uArr3[i5] = u3;
                if (iArr2[i5] == i4) {
                    r0.s sVar2 = sVarArr[i5];
                    sVar2.getClass();
                    arrayList = arrayList2;
                    R.U u5 = (R.U) this.f8423q.get(sVar2.b());
                    u5.getClass();
                    sVarArr2[i5] = new C0676E(sVar2, u5);
                } else {
                    arrayList = arrayList2;
                    sVarArr2[i5] = null;
                }
                i5++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i6 = i4;
            InterfaceC0699x[] interfaceC0699xArr2 = interfaceC0699xArr;
            r0.s[] sVarArr3 = sVarArr2;
            long p3 = interfaceC0699xArr[i4].p(sVarArr2, zArr, uArr3, zArr2, j4);
            if (i6 == 0) {
                j4 = p3;
            } else if (p3 != j4) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z3 = false;
            for (int i7 = 0; i7 < sVarArr.length; i7++) {
                boolean z4 = true;
                if (iArr2[i7] == i6) {
                    U u6 = uArr3[i7];
                    u6.getClass();
                    uArr2[i7] = uArr3[i7];
                    identityHashMap.put(u6, Integer.valueOf(i6));
                    z3 = true;
                } else if (iArr[i7] == i6) {
                    if (uArr3[i7] != null) {
                        z4 = false;
                    }
                    AbstractC0123a.j(z4);
                }
            }
            if (z3) {
                arrayList3.add(interfaceC0699xArr2[i6]);
            }
            i4 = i6 + 1;
            arrayList2 = arrayList3;
            interfaceC0699xArr = interfaceC0699xArr2;
            sVarArr2 = sVarArr3;
        }
        ArrayList arrayList4 = arrayList2;
        System.arraycopy(uArr2, 0, uArr, 0, length2);
        this.f8426t = (InterfaceC0699x[]) arrayList4.toArray(new InterfaceC0699x[0]);
        AbstractList w3 = D1.r.w(arrayList4, new C0271b(3));
        this.f8421o.getClass();
        this.f8427u = new C0688l(arrayList4, w3);
        return j4;
    }

    @Override // o0.InterfaceC0699x
    public final long q(long j3) {
        long q3 = this.f8426t[0].q(j3);
        int i3 = 1;
        while (true) {
            InterfaceC0699x[] interfaceC0699xArr = this.f8426t;
            if (i3 < interfaceC0699xArr.length) {
                if (interfaceC0699xArr[i3].q(q3) == q3) {
                    i3++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return q3;
            }
        }
    }

    @Override // o0.InterfaceC0699x
    public final void r(long j3) {
        for (InterfaceC0699x interfaceC0699x : this.f8426t) {
            interfaceC0699x.r(j3);
        }
    }

    @Override // o0.W
    public final long t() {
        return this.f8427u.t();
    }

    @Override // o0.InterfaceC0699x
    public final long u() {
        InterfaceC0699x[] interfaceC0699xArr;
        InterfaceC0699x[] interfaceC0699xArr2;
        long j3 = -9223372036854775807L;
        for (InterfaceC0699x interfaceC0699x : this.f8426t) {
            long u3 = interfaceC0699x.u();
            if (u3 != -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    for (InterfaceC0699x interfaceC0699x2 : this.f8426t) {
                        if (interfaceC0699x2 == interfaceC0699x) {
                            break;
                        } else if (interfaceC0699x2.q(u3) != u3) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j3 = u3;
                } else if (u3 != j3) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j3 != -9223372036854775807L && interfaceC0699x.q(j3) != j3) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j3;
    }

    @Override // o0.W
    public final void v(long j3) {
        this.f8427u.v(j3);
    }
}
