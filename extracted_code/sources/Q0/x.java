package Q0;

import U.A;
import U.AbstractC0123a;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final u f1687a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1688b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f1689c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f1690d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1691e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f1692f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1693g;

    /* renamed from: h  reason: collision with root package name */
    public final long f1694h;

    public x(u uVar, long[] jArr, int[] iArr, int i3, long[] jArr2, int[] iArr2, long j3) {
        boolean z3;
        boolean z4;
        if (iArr.length == jArr2.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        if (jArr.length == jArr2.length) {
            z4 = true;
        } else {
            z4 = false;
        }
        AbstractC0123a.e(z4);
        AbstractC0123a.e(iArr2.length == jArr2.length);
        this.f1687a = uVar;
        this.f1689c = jArr;
        this.f1690d = iArr;
        this.f1691e = i3;
        this.f1692f = jArr2;
        this.f1693g = iArr2;
        this.f1694h = j3;
        this.f1688b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j3) {
        long[] jArr = this.f1692f;
        for (int b3 = A.b(jArr, j3, true); b3 < jArr.length; b3++) {
            if ((this.f1693g[b3] & 1) != 0) {
                return b3;
            }
        }
        return -1;
    }
}
