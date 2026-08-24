package u0;

import D1.G;
import D1.I;
import D1.b0;
import R.C0106i;
import R.C0112o;
import R.C0113p;
import R.a0;
import U.A;
import U.AbstractC0123a;
import U.x;
import Y.C0142m;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* renamed from: u0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9311a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9312b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f9313c;

    /* renamed from: d  reason: collision with root package name */
    public C0113p f9314d;

    /* renamed from: e  reason: collision with root package name */
    public long f9315e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9316f;

    /* renamed from: g  reason: collision with root package name */
    public long f9317g;

    /* renamed from: h  reason: collision with root package name */
    public v f9318h;

    /* renamed from: i  reason: collision with root package name */
    public Executor f9319i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ C0856e f9320j;

    public C0855d(C0856e c0856e, Context context) {
        int i3;
        this.f9320j = c0856e;
        this.f9311a = context;
        if (A.J(context)) {
            i3 = 1;
        } else {
            i3 = 5;
        }
        this.f9312b = i3;
        this.f9313c = new ArrayList();
        this.f9315e = -9223372036854775807L;
        this.f9318h = v.f9437k;
        this.f9319i = C0856e.f9321m;
    }

    public final void a(boolean z3) {
        this.f9316f = false;
        this.f9315e = -9223372036854775807L;
        C0856e c0856e = this.f9320j;
        if (c0856e.f9333l == 1) {
            c0856e.f9332k++;
            c0856e.f9324c.a();
            x xVar = c0856e.f9330i;
            AbstractC0123a.k(xVar);
            xVar.c(new Z.d(c0856e, 10));
        }
        if (z3) {
            o oVar = c0856e.f9323b;
            r rVar = oVar.f9390b;
            rVar.f9417m = 0L;
            rVar.f9420p = -1L;
            rVar.f9418n = -1L;
            oVar.f9395g = -9223372036854775807L;
            oVar.f9393e = -9223372036854775807L;
            oVar.c(1);
            oVar.f9396h = -9223372036854775807L;
        }
    }

    public final void b(C0113p c0113p) {
        boolean z3;
        C0856e c0856e = this.f9320j;
        if (c0856e.f9333l == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        C0106i c0106i = c0113p.f1986z;
        if (c0106i == null || !c0106i.d()) {
            c0106i = C0106i.f1897h;
        }
        if (c0106i.f1900c != 7 || A.f2405a < 34) {
        }
        Looper myLooper = Looper.myLooper();
        AbstractC0123a.k(myLooper);
        c0856e.f9330i = c0856e.f9326e.a(myLooper, null);
        try {
            C0853b c0853b = c0856e.f9325d;
            G g3 = I.f197n;
            b0 b0Var = b0.f231q;
            c0853b.a();
            Pair pair = c0856e.f9331j;
            if (pair != null) {
                Surface surface = (Surface) pair.first;
                int i3 = ((U.u) pair.second).f2481a;
            }
            throw null;
        } catch (a0 e2) {
            throw new w(e2, c0113p);
        }
    }

    public final void c() {
        boolean z3;
        if (this.f9314d == null) {
            return;
        }
        new ArrayList().addAll(this.f9313c);
        C0113p c0113p = this.f9314d;
        c0113p.getClass();
        AbstractC0123a.k(null);
        C0106i c0106i = c0113p.f1986z;
        if (c0106i == null || !c0106i.d()) {
            C0106i c0106i2 = C0106i.f1897h;
        }
        int i3 = c0113p.f1980s;
        boolean z4 = false;
        if (i3 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.d("width must be positive, but is: " + i3, z3);
        int i4 = c0113p.f1981t;
        if (i4 > 0) {
            z4 = true;
        }
        AbstractC0123a.d("height must be positive, but is: " + i4, z4);
        throw null;
    }

    public final void d(long j3, long j4) {
        try {
            this.f9320j.a(j3, j4);
        } catch (C0142m e2) {
            C0113p c0113p = this.f9314d;
            if (c0113p == null) {
                c0113p = new C0113p(new C0112o());
            }
            throw new w(e2, c0113p);
        }
    }

    public final void e(Surface surface, U.u uVar) {
        C0856e c0856e = this.f9320j;
        Pair pair = c0856e.f9331j;
        if (pair == null || !((Surface) pair.first).equals(surface) || !((U.u) c0856e.f9331j.second).equals(uVar)) {
            c0856e.f9331j = Pair.create(surface, uVar);
            int i3 = uVar.f2481a;
        }
    }
}
