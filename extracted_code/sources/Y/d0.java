package Y;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import o0.AbstractC0677a;
import o0.C0694s;
import o0.C0697v;
import o0.InterfaceC0672A;
import o0.InterfaceC0699x;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final Z.m f3232a;

    /* renamed from: e  reason: collision with root package name */
    public final M f3236e;

    /* renamed from: h  reason: collision with root package name */
    public final Z.f f3239h;

    /* renamed from: i  reason: collision with root package name */
    public final U.x f3240i;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3242k;

    /* renamed from: l  reason: collision with root package name */
    public W.B f3243l;

    /* renamed from: j  reason: collision with root package name */
    public o0.X f3241j = new o0.X();

    /* renamed from: c  reason: collision with root package name */
    public final IdentityHashMap f3234c = new IdentityHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f3235d = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3233b = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f3237f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashSet f3238g = new HashSet();

    public d0(M m3, Z.f fVar, U.x xVar, Z.m mVar) {
        this.f3232a = mVar;
        this.f3236e = m3;
        this.f3239h = fVar;
        this.f3240i = xVar;
    }

    public final R.T a(int i3, ArrayList arrayList, o0.X x) {
        if (!arrayList.isEmpty()) {
            this.f3241j = x;
            for (int i4 = i3; i4 < arrayList.size() + i3; i4++) {
                c0 c0Var = (c0) arrayList.get(i4 - i3);
                ArrayList arrayList2 = this.f3233b;
                if (i4 > 0) {
                    c0 c0Var2 = (c0) arrayList2.get(i4 - 1);
                    c0Var.f3228d = c0Var2.f3225a.f8646A.f8627b.o() + c0Var2.f3228d;
                    c0Var.f3229e = false;
                    c0Var.f3227c.clear();
                } else {
                    c0Var.f3228d = 0;
                    c0Var.f3229e = false;
                    c0Var.f3227c.clear();
                }
                int o3 = c0Var.f3225a.f8646A.f8627b.o();
                for (int i5 = i4; i5 < arrayList2.size(); i5++) {
                    ((c0) arrayList2.get(i5)).f3228d += o3;
                }
                arrayList2.add(i4, c0Var);
                this.f3235d.put(c0Var.f3226b, c0Var);
                if (this.f3242k) {
                    e(c0Var);
                    if (this.f3234c.isEmpty()) {
                        this.f3238g.add(c0Var);
                    } else {
                        b0 b0Var = (b0) this.f3237f.get(c0Var);
                        if (b0Var != null) {
                            b0Var.f3219a.d(b0Var.f3220b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final R.T b() {
        ArrayList arrayList = this.f3233b;
        if (arrayList.isEmpty()) {
            return R.T.f1820a;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            c0 c0Var = (c0) arrayList.get(i4);
            c0Var.f3228d = i3;
            i3 += c0Var.f3225a.f8646A.f8627b.o();
        }
        return new j0(arrayList, this.f3241j);
    }

    public final void c() {
        Iterator it = this.f3238g.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            if (c0Var.f3227c.isEmpty()) {
                b0 b0Var = (b0) this.f3237f.get(c0Var);
                if (b0Var != null) {
                    b0Var.f3219a.d(b0Var.f3220b);
                }
                it.remove();
            }
        }
    }

    public final void d(c0 c0Var) {
        if (c0Var.f3229e && c0Var.f3227c.isEmpty()) {
            b0 b0Var = (b0) this.f3237f.remove(c0Var);
            b0Var.getClass();
            X x = b0Var.f3220b;
            AbstractC0677a abstractC0677a = b0Var.f3219a;
            abstractC0677a.r(x);
            B1.a aVar = b0Var.f3221c;
            abstractC0677a.u(aVar);
            abstractC0677a.t(aVar);
            this.f3238g.remove(c0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.X, o0.A] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, d0.c] */
    /* JADX WARN: Type inference failed for: r5v0, types: [o0.C, java.lang.Object] */
    public final void e(c0 c0Var) {
        C0697v c0697v = c0Var.f3225a;
        ?? r12 = new InterfaceC0672A() { // from class: Y.X
            @Override // o0.InterfaceC0672A
            public final void a(AbstractC0677a abstractC0677a, R.T t3) {
                U.x xVar = d0.this.f3236e.f3138t;
                xVar.d(2);
                xVar.e(22);
            }
        };
        B1.a aVar = new B1.a(this, c0Var, 14, false);
        this.f3237f.put(c0Var, new b0(c0697v, r12, aVar));
        int i3 = U.A.f2405a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        c0697v.getClass();
        d0.d dVar = c0697v.f8570o;
        dVar.getClass();
        ?? obj = new Object();
        obj.f8415a = handler;
        obj.f8416b = aVar;
        dVar.f5150c.add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        d0.d dVar2 = c0697v.f8571p;
        dVar2.getClass();
        ?? obj2 = new Object();
        obj2.f5147a = aVar;
        dVar2.f5150c.add(obj2);
        c0697v.n(r12, this.f3243l, this.f3232a);
    }

    public final void f(InterfaceC0699x interfaceC0699x) {
        IdentityHashMap identityHashMap = this.f3234c;
        c0 c0Var = (c0) identityHashMap.remove(interfaceC0699x);
        c0Var.getClass();
        c0Var.f3225a.q(interfaceC0699x);
        c0Var.f3227c.remove(((C0694s) interfaceC0699x).f8635m);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(c0Var);
    }

    public final void g(int i3, int i4) {
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            ArrayList arrayList = this.f3233b;
            c0 c0Var = (c0) arrayList.remove(i5);
            this.f3235d.remove(c0Var.f3226b);
            int i6 = -c0Var.f3225a.f8646A.f8627b.o();
            for (int i7 = i5; i7 < arrayList.size(); i7++) {
                ((c0) arrayList.get(i7)).f3228d += i6;
            }
            c0Var.f3229e = true;
            if (this.f3242k) {
                d(c0Var);
            }
        }
    }
}
