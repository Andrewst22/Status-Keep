package o0;

import R.C0122z;
import U.AbstractC0123a;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: o0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0677a {

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f8568m = new ArrayList(1);

    /* renamed from: n  reason: collision with root package name */
    public final HashSet f8569n = new HashSet(1);

    /* renamed from: o  reason: collision with root package name */
    public final d0.d f8570o = new d0.d(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: p  reason: collision with root package name */
    public final d0.d f8571p = new d0.d(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: q  reason: collision with root package name */
    public Looper f8572q;

    /* renamed from: r  reason: collision with root package name */
    public R.T f8573r;

    /* renamed from: s  reason: collision with root package name */
    public Z.m f8574s;

    public final d0.d a(C0701z c0701z) {
        return new d0.d(this.f8570o.f5150c, 0, c0701z);
    }

    public abstract InterfaceC0699x b(C0701z c0701z, s0.e eVar, long j3);

    public final void d(InterfaceC0672A interfaceC0672A) {
        HashSet hashSet = this.f8569n;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC0672A);
        if (!isEmpty && hashSet.isEmpty()) {
            f();
        }
    }

    public final void g(InterfaceC0672A interfaceC0672A) {
        this.f8572q.getClass();
        HashSet hashSet = this.f8569n;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC0672A);
        if (isEmpty) {
            h();
        }
    }

    public R.T i() {
        return null;
    }

    public abstract C0122z k();

    public boolean l() {
        return true;
    }

    public abstract void m();

    public final void n(InterfaceC0672A interfaceC0672A, W.B b3, Z.m mVar) {
        boolean z3;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f8572q;
        if (looper != null && looper != myLooper) {
            z3 = false;
        } else {
            z3 = true;
        }
        AbstractC0123a.e(z3);
        this.f8574s = mVar;
        R.T t3 = this.f8573r;
        this.f8568m.add(interfaceC0672A);
        if (this.f8572q == null) {
            this.f8572q = myLooper;
            this.f8569n.add(interfaceC0672A);
            o(b3);
        } else if (t3 != null) {
            g(interfaceC0672A);
            interfaceC0672A.a(this, t3);
        }
    }

    public abstract void o(W.B b3);

    public final void p(R.T t3) {
        this.f8573r = t3;
        Iterator it = this.f8568m.iterator();
        while (it.hasNext()) {
            ((InterfaceC0672A) it.next()).a(this, t3);
        }
    }

    public abstract void q(InterfaceC0699x interfaceC0699x);

    public final void r(InterfaceC0672A interfaceC0672A) {
        ArrayList arrayList = this.f8568m;
        arrayList.remove(interfaceC0672A);
        if (arrayList.isEmpty()) {
            this.f8572q = null;
            this.f8573r = null;
            this.f8574s = null;
            this.f8569n.clear();
            s();
            return;
        }
        d(interfaceC0672A);
    }

    public abstract void s();

    public final void t(d0.e eVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8571p.f5150c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            d0.c cVar = (d0.c) it.next();
            if (cVar.f5147a == eVar) {
                copyOnWriteArrayList.remove(cVar);
            }
        }
    }

    public final void u(InterfaceC0675D interfaceC0675D) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8570o.f5150c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C0674C c0674c = (C0674C) it.next();
            if (c0674c.f8416b == interfaceC0675D) {
                copyOnWriteArrayList.remove(c0674c);
            }
        }
    }

    public abstract void v(C0122z c0122z);

    public void f() {
    }

    public void h() {
    }
}
