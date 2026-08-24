package e0;

import R.C0113p;
import U.A;
import U.AbstractC0123a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import o0.U;
/* loaded from: classes.dex */
public final class p implements U {

    /* renamed from: m  reason: collision with root package name */
    public final int f5320m;

    /* renamed from: n  reason: collision with root package name */
    public final t f5321n;

    /* renamed from: o  reason: collision with root package name */
    public int f5322o = -1;

    public p(t tVar, int i3) {
        this.f5321n = tVar;
        this.f5320m = i3;
    }

    @Override // o0.U
    public final void a() {
        int i3 = this.f5322o;
        t tVar = this.f5321n;
        if (i3 != -2) {
            if (i3 == -1) {
                tVar.E();
                return;
            } else if (i3 != -3) {
                tVar.E();
                tVar.f5342H[i3].y();
                return;
            } else {
                return;
            }
        }
        tVar.f();
        String str = tVar.f5354U.a(this.f5320m).f1824d[0].f1974m;
        throw new IOException("Unable to bind a sample queue to TrackGroup with MIME type " + str + ".");
    }

    public final void b() {
        boolean z3;
        if (this.f5322o == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        t tVar = this.f5321n;
        tVar.f();
        tVar.f5356W.getClass();
        int[] iArr = tVar.f5356W;
        int i3 = this.f5320m;
        int i4 = iArr[i3];
        if (i4 == -1) {
            if (tVar.f5355V.contains(tVar.f5354U.a(i3))) {
                i4 = -3;
            }
            i4 = -2;
        } else {
            boolean[] zArr = tVar.f5359Z;
            if (!zArr[i4]) {
                zArr[i4] = true;
            }
            i4 = -2;
        }
        this.f5322o = i4;
    }

    public final boolean c() {
        int i3 = this.f5322o;
        if (i3 != -1 && i3 != -3 && i3 != -2) {
            return true;
        }
        return false;
    }

    @Override // o0.U
    public final boolean f() {
        if (this.f5322o != -3) {
            if (c()) {
                int i3 = this.f5322o;
                t tVar = this.f5321n;
                if (tVar.C() || !tVar.f5342H[i3].w(tVar.f5365f0)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // o0.U
    public final int i(B1.a aVar, X.f fVar, int i3) {
        C0113p c0113p;
        C0113p c0113p2;
        int i4 = -3;
        if (this.f5322o == -3) {
            fVar.a(4);
            return -4;
        }
        if (c()) {
            int i5 = this.f5322o;
            t tVar = this.f5321n;
            if (!tVar.C()) {
                ArrayList arrayList = tVar.f5382z;
                int i6 = 0;
                if (!arrayList.isEmpty()) {
                    int i7 = 0;
                    loop0: while (i7 < arrayList.size() - 1) {
                        int i8 = ((m) arrayList.get(i7)).f5284w;
                        int length = tVar.f5342H.length;
                        for (int i9 = 0; i9 < length; i9++) {
                            if (tVar.f5359Z[i9] && tVar.f5342H[i9].A() == i8) {
                                break loop0;
                            }
                        }
                        i7++;
                    }
                    A.R(arrayList, 0, i7);
                    m mVar = (m) arrayList.get(0);
                    C0113p c0113p3 = mVar.f8781p;
                    if (!c0113p3.equals(tVar.f5352S)) {
                        d0.d dVar = tVar.f5380w;
                        Object obj = mVar.f8783r;
                        long j3 = mVar.f8784s;
                        int i10 = tVar.f5371n;
                        int i11 = mVar.f8782q;
                        c0113p2 = c0113p3;
                        dVar.a(i10, c0113p3, i11, obj, j3);
                    } else {
                        c0113p2 = c0113p3;
                    }
                    tVar.f5352S = c0113p2;
                }
                if ((arrayList.isEmpty() || ((m) arrayList.get(0)).f5283W) && (i4 = tVar.f5342H[i5].B(aVar, fVar, i3, tVar.f5365f0)) == -5) {
                    C0113p c0113p4 = (C0113p) aVar.f51o;
                    c0113p4.getClass();
                    if (i5 == tVar.f5347N) {
                        int i12 = android.support.v4.media.session.a.i(tVar.f5342H[i5].A());
                        while (i6 < arrayList.size() && ((m) arrayList.get(i6)).f5284w != i12) {
                            i6++;
                        }
                        if (i6 < arrayList.size()) {
                            c0113p = ((m) arrayList.get(i6)).f8781p;
                        } else {
                            c0113p = tVar.f5351R;
                            c0113p.getClass();
                        }
                        c0113p4 = c0113p4.d(c0113p);
                    }
                    aVar.f51o = c0113p4;
                }
            }
        }
        return i4;
    }

    @Override // o0.U
    public final int n(long j3) {
        if (!c()) {
            return 0;
        }
        int i3 = this.f5322o;
        t tVar = this.f5321n;
        if (tVar.C()) {
            return 0;
        }
        s sVar = tVar.f5342H[i3];
        int t3 = sVar.t(j3, tVar.f5365f0);
        ArrayList arrayList = tVar.f5382z;
        Object obj = null;
        if (arrayList instanceof Collection) {
            if (!arrayList.isEmpty()) {
                obj = arrayList.get(arrayList.size() - 1);
            }
        } else {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    obj = it.next();
                } while (it.hasNext());
            }
        }
        m mVar = (m) obj;
        if (mVar != null && !mVar.f5283W) {
            t3 = Math.min(t3, mVar.g(i3) - sVar.r());
        }
        sVar.H(t3);
        return t3;
    }
}
