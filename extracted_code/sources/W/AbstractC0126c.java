package W;

import D1.b0;
import U.AbstractC0123a;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* renamed from: W.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0126c implements h {

    /* renamed from: m  reason: collision with root package name */
    public final boolean f2738m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f2739n = new ArrayList(1);

    /* renamed from: o  reason: collision with root package name */
    public int f2740o;

    /* renamed from: p  reason: collision with root package name */
    public l f2741p;

    public AbstractC0126c(boolean z3) {
        this.f2738m = z3;
    }

    public final void a(int i3) {
        boolean z3;
        l lVar = this.f2741p;
        int i4 = U.A.f2405a;
        for (int i5 = 0; i5 < this.f2740o; i5++) {
            boolean z4 = this.f2738m;
            s0.g gVar = (s0.g) ((B) this.f2739n.get(i5));
            synchronized (gVar) {
                b0 b0Var = s0.g.f9164n;
                if (z4 && (lVar.f2774h & 8) != 8) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    gVar.f9178h += i3;
                }
            }
        }
    }

    public final void b() {
        boolean z3;
        boolean z4;
        l lVar = this.f2741p;
        int i3 = U.A.f2405a;
        for (int i4 = 0; i4 < this.f2740o; i4++) {
            boolean z5 = this.f2738m;
            s0.g gVar = (s0.g) ((B) this.f2739n.get(i4));
            synchronized (gVar) {
                try {
                    b0 b0Var = s0.g.f9164n;
                    if (z5 && (lVar.f2774h & 8) != 8) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (gVar.f9176f > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        AbstractC0123a.j(z4);
                        gVar.f9173c.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i5 = (int) (elapsedRealtime - gVar.f9177g);
                        gVar.f9179i += i5;
                        long j3 = gVar.f9180j;
                        long j4 = gVar.f9178h;
                        gVar.f9180j = j3 + j4;
                        if (i5 > 0) {
                            gVar.f9175e.a((((float) j4) * 8000.0f) / i5, (int) Math.sqrt(j4));
                            if (gVar.f9179i < 2000) {
                                if (gVar.f9180j >= 524288) {
                                }
                                gVar.c(i5, gVar.f9178h, gVar.f9181k);
                                gVar.f9177g = elapsedRealtime;
                                gVar.f9178h = 0L;
                            }
                            gVar.f9181k = gVar.f9175e.b();
                            gVar.c(i5, gVar.f9178h, gVar.f9181k);
                            gVar.f9177g = elapsedRealtime;
                            gVar.f9178h = 0L;
                        }
                        gVar.f9176f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f2741p = null;
    }

    public final void e() {
        for (int i3 = 0; i3 < this.f2740o; i3++) {
            ((B) this.f2739n.get(i3)).getClass();
        }
    }

    public final void h(l lVar) {
        boolean z3;
        this.f2741p = lVar;
        for (int i3 = 0; i3 < this.f2740o; i3++) {
            boolean z4 = this.f2738m;
            s0.g gVar = (s0.g) ((B) this.f2739n.get(i3));
            synchronized (gVar) {
                try {
                    b0 b0Var = s0.g.f9164n;
                    if (z4 && (lVar.f2774h & 8) != 8) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (gVar.f9176f == 0) {
                            gVar.f9173c.getClass();
                            gVar.f9177g = SystemClock.elapsedRealtime();
                        }
                        gVar.f9176f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // W.h
    public Map x() {
        return Collections.emptyMap();
    }

    @Override // W.h
    public final void y(B b3) {
        b3.getClass();
        ArrayList arrayList = this.f2739n;
        if (!arrayList.contains(b3)) {
            arrayList.add(b3);
            this.f2740o++;
        }
    }
}
