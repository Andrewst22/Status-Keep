package i1;

import D1.b0;
import java.util.ArrayList;
import q0.InterfaceC0743a;
/* renamed from: i1.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299J implements InterfaceC0743a {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f5973a;

    @Override // q0.InterfaceC0743a
    public D1.I a(long j3) {
        int f3 = f(j3);
        if (f3 == 0) {
            D1.G g3 = D1.I.f197n;
            return b0.f231q;
        }
        T0.a aVar = (T0.a) this.f5973a.get(f3 - 1);
        long j4 = aVar.f2300d;
        if (j4 != -9223372036854775807L && j3 >= j4) {
            D1.G g4 = D1.I.f197n;
            return b0.f231q;
        }
        return aVar.f2297a;
    }

    @Override // q0.InterfaceC0743a
    public long b(long j3) {
        ArrayList arrayList = this.f5973a;
        if (arrayList.isEmpty() || j3 < ((T0.a) arrayList.get(0)).f2298b) {
            return -9223372036854775807L;
        }
        for (int i3 = 1; i3 < arrayList.size(); i3++) {
            long j4 = ((T0.a) arrayList.get(i3)).f2298b;
            int i4 = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
            if (i4 == 0) {
                return j4;
            }
            if (i4 < 0) {
                T0.a aVar = (T0.a) arrayList.get(i3 - 1);
                long j5 = aVar.f2300d;
                if (j5 == -9223372036854775807L || j5 > j3) {
                    return aVar.f2298b;
                }
                return j5;
            }
        }
        T0.a aVar2 = (T0.a) D1.r.l(arrayList);
        long j6 = aVar2.f2300d;
        if (j6 == -9223372036854775807L || j3 < j6) {
            return aVar2.f2298b;
        }
        return j6;
    }

    @Override // q0.InterfaceC0743a
    public long c(long j3) {
        ArrayList arrayList = this.f5973a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((T0.a) arrayList.get(0)).f2298b) {
            return ((T0.a) arrayList.get(0)).f2298b;
        }
        for (int i3 = 1; i3 < arrayList.size(); i3++) {
            T0.a aVar = (T0.a) arrayList.get(i3);
            if (j3 < aVar.f2298b) {
                long j4 = ((T0.a) arrayList.get(i3 - 1)).f2300d;
                long j5 = aVar.f2298b;
                if (j4 == -9223372036854775807L || j4 <= j3 || j4 >= j5) {
                    return j5;
                }
                return j4;
            }
        }
        long j6 = ((T0.a) D1.r.l(arrayList)).f2300d;
        if (j6 == -9223372036854775807L || j3 >= j6) {
            return Long.MIN_VALUE;
        }
        return j6;
    }

    @Override // q0.InterfaceC0743a
    public void clear() {
        this.f5973a.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    @Override // q0.InterfaceC0743a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(T0.a r11, long r12) {
        /*
            r10 = this;
            long r0 = r11.f2298b
            r2 = 0
            r3 = 1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto Lf
            r6 = 1
            goto L10
        Lf:
            r6 = 0
        L10:
            U.AbstractC0123a.e(r6)
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 > 0) goto L23
            long r6 = r11.f2300d
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L21
            int r4 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r4 >= 0) goto L23
        L21:
            r4 = 1
            goto L24
        L23:
            r4 = 0
        L24:
            java.util.ArrayList r5 = r10.f5973a
            int r6 = r5.size()
            int r6 = r6 - r3
        L2b:
            if (r6 < 0) goto L4e
            java.lang.Object r7 = r5.get(r6)
            T0.a r7 = (T0.a) r7
            long r7 = r7.f2298b
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 < 0) goto L3e
            int r6 = r6 + r3
            r5.add(r6, r11)
            return r4
        L3e:
            java.lang.Object r7 = r5.get(r6)
            T0.a r7 = (T0.a) r7
            long r7 = r7.f2298b
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 > 0) goto L4b
            r4 = 0
        L4b:
            int r6 = r6 + (-1)
            goto L2b
        L4e:
            r5.add(r2, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C0299J.d(T0.a, long):boolean");
    }

    @Override // q0.InterfaceC0743a
    public void e(long j3) {
        int f3 = f(j3);
        if (f3 > 0) {
            this.f5973a.subList(0, f3).clear();
        }
    }

    public int f(long j3) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f5973a;
            if (i3 < arrayList.size()) {
                if (j3 < ((T0.a) arrayList.get(i3)).f2298b) {
                    return i3;
                }
                i3++;
            } else {
                return arrayList.size();
            }
        }
    }
}
