package Q0;

import U.A;
import w0.G;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final G f1564a;

    /* renamed from: d  reason: collision with root package name */
    public x f1567d;

    /* renamed from: e  reason: collision with root package name */
    public k f1568e;

    /* renamed from: f  reason: collision with root package name */
    public int f1569f;

    /* renamed from: g  reason: collision with root package name */
    public int f1570g;

    /* renamed from: h  reason: collision with root package name */
    public int f1571h;

    /* renamed from: i  reason: collision with root package name */
    public int f1572i;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1575l;

    /* renamed from: b  reason: collision with root package name */
    public final w f1565b = new w();

    /* renamed from: c  reason: collision with root package name */
    public final U.t f1566c = new U.t();

    /* renamed from: j  reason: collision with root package name */
    public final U.t f1573j = new U.t(1);

    /* renamed from: k  reason: collision with root package name */
    public final U.t f1574k = new U.t();

    public m(G g3, x xVar, k kVar) {
        this.f1564a = g3;
        this.f1567d = xVar;
        this.f1568e = kVar;
        this.f1567d = xVar;
        this.f1568e = kVar;
        g3.c(xVar.f1687a.f1659f);
        d();
    }

    public final v a() {
        if (!this.f1575l) {
            return null;
        }
        w wVar = this.f1565b;
        k kVar = wVar.f1670a;
        int i3 = A.f2405a;
        int i4 = kVar.f1557a;
        v vVar = wVar.f1682m;
        if (vVar == null) {
            v[] vVarArr = this.f1567d.f1687a.f1664k;
            if (vVarArr == null) {
                vVar = null;
            } else {
                vVar = vVarArr[i4];
            }
        }
        if (vVar == null || !vVar.f1665a) {
            return null;
        }
        return vVar;
    }

    public final boolean b() {
        this.f1569f++;
        if (!this.f1575l) {
            return false;
        }
        int i3 = this.f1570g + 1;
        this.f1570g = i3;
        int[] iArr = this.f1565b.f1676g;
        int i4 = this.f1571h;
        if (i3 != iArr[i4]) {
            return true;
        }
        this.f1571h = i4 + 1;
        this.f1570g = 0;
        return false;
    }

    public final int c(int i3, int i4) {
        U.t tVar;
        boolean z3;
        boolean z4;
        int i5;
        v a3 = a();
        if (a3 == null) {
            return 0;
        }
        w wVar = this.f1565b;
        int i6 = a3.f1668d;
        if (i6 != 0) {
            tVar = wVar.f1683n;
        } else {
            int i7 = A.f2405a;
            byte[] bArr = a3.f1669e;
            int length = bArr.length;
            U.t tVar2 = this.f1574k;
            tVar2.E(bArr, length);
            i6 = bArr.length;
            tVar = tVar2;
        }
        int i8 = this.f1569f;
        if (wVar.f1680k && wVar.f1681l[i8]) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && i4 == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        U.t tVar3 = this.f1573j;
        byte[] bArr2 = tVar3.f2477a;
        if (z4) {
            i5 = 128;
        } else {
            i5 = 0;
        }
        bArr2[0] = (byte) (i5 | i6);
        tVar3.G(0);
        G g3 = this.f1564a;
        g3.a(tVar3, 1, 1);
        g3.a(tVar, i6, 1);
        if (!z4) {
            return i6 + 1;
        }
        U.t tVar4 = this.f1566c;
        if (!z3) {
            tVar4.D(8);
            byte[] bArr3 = tVar4.f2477a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i4 & 255);
            bArr3[4] = (byte) ((i3 >> 24) & 255);
            bArr3[5] = (byte) ((i3 >> 16) & 255);
            bArr3[6] = (byte) ((i3 >> 8) & 255);
            bArr3[7] = (byte) (i3 & 255);
            g3.a(tVar4, 8, 1);
            return i6 + 9;
        }
        U.t tVar5 = wVar.f1683n;
        int A3 = tVar5.A();
        tVar5.H(-2);
        int i9 = (A3 * 6) + 2;
        if (i4 != 0) {
            tVar4.D(i9);
            byte[] bArr4 = tVar4.f2477a;
            tVar5.f(bArr4, 0, i9);
            int i10 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i4;
            bArr4[2] = (byte) ((i10 >> 8) & 255);
            bArr4[3] = (byte) (i10 & 255);
        } else {
            tVar4 = tVar5;
        }
        g3.a(tVar4, i9, 1);
        return i6 + 1 + i9;
    }

    public final void d() {
        w wVar = this.f1565b;
        wVar.f1673d = 0;
        wVar.f1685p = 0L;
        wVar.f1686q = false;
        wVar.f1680k = false;
        wVar.f1684o = false;
        wVar.f1682m = null;
        this.f1569f = 0;
        this.f1571h = 0;
        this.f1570g = 0;
        this.f1572i = 0;
        this.f1575l = false;
    }
}
