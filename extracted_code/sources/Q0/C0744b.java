package q0;

import D1.A;
import D1.C0038q;
import D1.F;
import D1.I;
import D1.Z;
import D1.b0;
import D1.i0;
import U.AbstractC0123a;
import g0.C0271b;
import java.util.ArrayList;
/* renamed from: q0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744b implements InterfaceC0743a {

    /* renamed from: b  reason: collision with root package name */
    public static final A f8858b;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f8859a = new ArrayList();

    static {
        Z z3 = Z.f224m;
        C0271b c0271b = new C0271b(6);
        z3.getClass();
        C0038q c0038q = new C0038q(c0271b, z3);
        i0 i0Var = i0.f271m;
        C0271b c0271b2 = new C0271b(7);
        i0Var.getClass();
        f8858b = new A(c0038q, new C0038q(c0271b2, i0Var));
    }

    @Override // q0.InterfaceC0743a
    public final I a(long j3) {
        ArrayList arrayList = this.f8859a;
        if (!arrayList.isEmpty()) {
            if (j3 >= ((T0.a) arrayList.get(0)).f2298b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    T0.a aVar = (T0.a) arrayList.get(i3);
                    if (j3 >= aVar.f2298b && j3 < aVar.f2300d) {
                        arrayList2.add(aVar);
                    }
                    if (j3 < aVar.f2298b) {
                        break;
                    }
                }
                b0 r3 = I.r(f8858b, arrayList2);
                F i4 = I.i();
                for (int i5 = 0; i5 < r3.size(); i5++) {
                    i4.d(((T0.a) r3.get(i5)).f2297a);
                }
                return i4.g();
            }
        }
        return I.m();
    }

    @Override // q0.InterfaceC0743a
    public final long b(long j3) {
        ArrayList arrayList = this.f8859a;
        if (!arrayList.isEmpty()) {
            if (j3 >= ((T0.a) arrayList.get(0)).f2298b) {
                long j4 = ((T0.a) arrayList.get(0)).f2298b;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    long j5 = ((T0.a) arrayList.get(i3)).f2298b;
                    long j6 = ((T0.a) arrayList.get(i3)).f2300d;
                    if (j6 <= j3) {
                        j4 = Math.max(j4, j6);
                    } else if (j5 > j3) {
                        break;
                    } else {
                        j4 = Math.max(j4, j5);
                    }
                }
                return j4;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // q0.InterfaceC0743a
    public final long c(long j3) {
        int i3 = 0;
        long j4 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f8859a;
            if (i3 >= arrayList.size()) {
                break;
            }
            long j5 = ((T0.a) arrayList.get(i3)).f2298b;
            long j6 = ((T0.a) arrayList.get(i3)).f2300d;
            if (j3 < j5) {
                if (j4 == -9223372036854775807L) {
                    j4 = j5;
                } else {
                    j4 = Math.min(j4, j5);
                }
            } else {
                if (j3 < j6) {
                    if (j4 == -9223372036854775807L) {
                        j4 = j6;
                    } else {
                        j4 = Math.min(j4, j6);
                    }
                }
                i3++;
            }
        }
        if (j4 == -9223372036854775807L) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // q0.InterfaceC0743a
    public final void clear() {
        this.f8859a.clear();
    }

    @Override // q0.InterfaceC0743a
    public final boolean d(T0.a aVar, long j3) {
        boolean z3;
        boolean z4;
        boolean z5;
        long j4 = aVar.f2298b;
        if (j4 != -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        if (aVar.f2299c != -9223372036854775807L) {
            z4 = true;
        } else {
            z4 = false;
        }
        AbstractC0123a.e(z4);
        if (j4 <= j3 && j3 < aVar.f2300d) {
            z5 = true;
        } else {
            z5 = false;
        }
        ArrayList arrayList = this.f8859a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j4 >= ((T0.a) arrayList.get(size)).f2298b) {
                arrayList.add(size + 1, aVar);
                return z5;
            }
        }
        arrayList.add(0, aVar);
        return z5;
    }

    @Override // q0.InterfaceC0743a
    public final void e(long j3) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f8859a;
            if (i3 < arrayList.size()) {
                int i4 = (j3 > ((T0.a) arrayList.get(i3)).f2298b ? 1 : (j3 == ((T0.a) arrayList.get(i3)).f2298b ? 0 : -1));
                if (i4 > 0 && j3 > ((T0.a) arrayList.get(i3)).f2300d) {
                    arrayList.remove(i3);
                    i3--;
                } else if (i4 < 0) {
                    return;
                }
                i3++;
            } else {
                return;
            }
        }
    }
}
