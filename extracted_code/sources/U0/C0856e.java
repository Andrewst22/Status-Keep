package u0;

import R.C0112o;
import R.C0113p;
import R.G;
import R.c0;
import U.A;
import U.AbstractC0123a;
import U.x;
import Y.E;
import a0.C;
import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import g1.ExecutorC0274b;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
import k0.C0558m;
/* renamed from: u0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0856e {

    /* renamed from: m  reason: collision with root package name */
    public static final ExecutorC0274b f9321m = new ExecutorC0274b(1);

    /* renamed from: a  reason: collision with root package name */
    public final C0855d f9322a;

    /* renamed from: b  reason: collision with root package name */
    public final o f9323b;

    /* renamed from: c  reason: collision with root package name */
    public final s f9324c;

    /* renamed from: d  reason: collision with root package name */
    public final C0853b f9325d;

    /* renamed from: e  reason: collision with root package name */
    public final U.v f9326e;

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArraySet f9327f;

    /* renamed from: g  reason: collision with root package name */
    public C0113p f9328g;

    /* renamed from: h  reason: collision with root package name */
    public E f9329h;

    /* renamed from: i  reason: collision with root package name */
    public x f9330i;

    /* renamed from: j  reason: collision with root package name */
    public Pair f9331j;

    /* renamed from: k  reason: collision with root package name */
    public int f9332k;

    /* renamed from: l  reason: collision with root package name */
    public int f9333l;

    public C0856e(C c3) {
        C0855d c0855d = new C0855d(this, (Context) c3.f3604b);
        this.f9322a = c0855d;
        U.v vVar = (U.v) c3.f3608f;
        this.f9326e = vVar;
        o oVar = (o) c3.f3605c;
        this.f9323b = oVar;
        oVar.f9399k = vVar;
        this.f9324c = new s(new C0558m(this, 14), oVar);
        C0853b c0853b = (C0853b) c3.f3607e;
        AbstractC0123a.k(c0853b);
        this.f9325d = c0853b;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f9327f = copyOnWriteArraySet;
        this.f9333l = 0;
        copyOnWriteArraySet.add(c0855d);
    }

    public final void a(long j3, long j4) {
        s sVar;
        U.m mVar;
        int i3;
        if (this.f9332k == 0 && (i3 = (mVar = (sVar = this.f9324c).f9427f).f2455b) != 0) {
            if (i3 != 0) {
                long j5 = ((long[]) mVar.f2457d)[mVar.f2454a];
                Long l3 = (Long) sVar.f9426e.e(j5);
                o oVar = sVar.f9423b;
                if (l3 != null && l3.longValue() != sVar.f9430i) {
                    sVar.f9430i = l3.longValue();
                    oVar.c(2);
                }
                int a3 = sVar.f9423b.a(j5, j3, j4, sVar.f9430i, false, sVar.f9424c);
                boolean z3 = true;
                C0856e c0856e = (C0856e) sVar.f9422a.f7632n;
                if (a3 != 0 && a3 != 1) {
                    if (a3 != 2 && a3 != 3 && a3 != 4) {
                        if (a3 != 5) {
                            throw new IllegalStateException(String.valueOf(a3));
                        }
                        return;
                    }
                    sVar.f9431j = j5;
                    mVar.w();
                    Iterator it = c0856e.f9327f.iterator();
                    while (it.hasNext()) {
                        C0855d c0855d = (C0855d) it.next();
                        c0855d.f9319i.execute(new RunnableC0854c(c0855d, c0855d.f9318h, 1));
                    }
                    AbstractC0123a.k(null);
                    throw null;
                }
                sVar.f9431j = j5;
                long w3 = mVar.w();
                c0 c0Var = (c0) sVar.f9425d.e(w3);
                if (c0Var != null && !c0Var.equals(c0.f1879e) && !c0Var.equals(sVar.f9429h)) {
                    sVar.f9429h = c0Var;
                    C0112o c0112o = new C0112o();
                    c0112o.f1943r = c0Var.f1880a;
                    c0112o.f1944s = c0Var.f1881b;
                    c0112o.f1937l = G.l("video/raw");
                    c0856e.f9328g = new C0113p(c0112o);
                    Iterator it2 = c0856e.f9327f.iterator();
                    while (it2.hasNext()) {
                        C0855d c0855d2 = (C0855d) it2.next();
                        c0855d2.f9319i.execute(new RunnableC0854c(c0855d2, c0855d2.f9318h, c0Var));
                    }
                }
                if (oVar.f9392d == 3) {
                    z3 = false;
                }
                oVar.f9392d = 3;
                oVar.f9399k.getClass();
                oVar.f9394f = A.M(SystemClock.elapsedRealtime());
                if (z3 && c0856e.f9331j != null) {
                    Iterator it3 = c0856e.f9327f.iterator();
                    while (it3.hasNext()) {
                        C0855d c0855d3 = (C0855d) it3.next();
                        c0855d3.f9319i.execute(new RunnableC0854c(c0855d3, c0855d3.f9318h, 2));
                    }
                }
                if (c0856e.f9329h != null) {
                    if (c0856e.f9328g == null) {
                        new C0112o().a();
                    }
                    E e2 = c0856e.f9329h;
                    c0856e.f9326e.getClass();
                    e2.c(w3, System.nanoTime());
                }
                AbstractC0123a.k(null);
                throw null;
            }
            throw new NoSuchElementException();
        }
    }
}
