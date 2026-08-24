package Q0;

import R.C0113p;
import U.A;
import U.AbstractC0123a;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import l.C0580s;
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    public final int f1547a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1548b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1549c;

    public h(C0580s c0580s, int i3, int i4) {
        this.f1549c = new WeakReference(c0580s);
        this.f1547a = i3;
        this.f1548b = i4;
    }

    @Override // Q0.f
    public int a() {
        return this.f1547a;
    }

    @Override // Q0.f
    public int b() {
        return this.f1548b;
    }

    @Override // Q0.f
    public int c() {
        int i3 = this.f1547a;
        if (i3 == -1) {
            return ((U.t) this.f1549c).y();
        }
        return i3;
    }

    public void d() {
        new Handler(Looper.getMainLooper()).post(new Z.d(this, 9));
    }

    public void e(Typeface typeface) {
        int i3;
        boolean z3;
        WeakReference weakReference = (WeakReference) this.f1549c;
        C0580s c0580s = (C0580s) weakReference.get();
        if (c0580s == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (i3 = this.f1547a) != -1) {
            if ((this.f1548b & 2) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            typeface = Typeface.create(typeface, i3, z3);
        }
        c0580s.f7895a.post(new P2.i(weakReference, typeface, 4, false));
    }

    public h(int i3, int i4, SparseArray sparseArray) {
        this.f1547a = i3;
        this.f1548b = i4;
        this.f1549c = sparseArray;
    }

    public h(b bVar, C0113p c0113p) {
        U.t tVar = bVar.f1527o;
        this.f1549c = tVar;
        tVar.G(12);
        int y3 = tVar.y();
        if ("audio/raw".equals(c0113p.f1974m)) {
            int B3 = A.B(c0113p.f1953C, c0113p.f1951A);
            if (y3 == 0 || y3 % B3 != 0) {
                AbstractC0123a.A("AtomParsers", "Audio sample size mismatch. stsd sample size: " + B3 + ", stsz sample size: " + y3);
                y3 = B3;
            }
        }
        this.f1547a = y3 == 0 ? -1 : y3;
        this.f1548b = tVar.y();
    }
}
