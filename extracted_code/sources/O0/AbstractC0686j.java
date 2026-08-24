package o0;

import K.C0059m;
import U.AbstractC0123a;
import android.os.Handler;
import java.util.HashMap;
/* renamed from: o0.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0686j extends AbstractC0677a {

    /* renamed from: t  reason: collision with root package name */
    public final HashMap f8609t = new HashMap();

    /* renamed from: u  reason: collision with root package name */
    public Handler f8610u;

    /* renamed from: v  reason: collision with root package name */
    public W.B f8611v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, d0.c] */
    /* JADX WARN: Type inference failed for: r1v2, types: [o0.A, o0.h] */
    /* JADX WARN: Type inference failed for: r3v1, types: [o0.C, java.lang.Object] */
    public final void A(final Object obj, AbstractC0677a abstractC0677a) {
        HashMap hashMap = this.f8609t;
        AbstractC0123a.e(!hashMap.containsKey(obj));
        ?? r12 = new InterfaceC0672A() { // from class: o0.h
            @Override // o0.InterfaceC0672A
            public final void a(AbstractC0677a abstractC0677a2, R.T t3) {
                AbstractC0686j.this.z(obj, abstractC0677a2, t3);
            }
        };
        C0059m c0059m = new C0059m(this, obj);
        hashMap.put(obj, new C0685i(abstractC0677a, r12, c0059m));
        Handler handler = this.f8610u;
        handler.getClass();
        abstractC0677a.getClass();
        d0.d dVar = abstractC0677a.f8570o;
        dVar.getClass();
        ?? obj2 = new Object();
        obj2.f8415a = handler;
        obj2.f8416b = c0059m;
        dVar.f5150c.add(obj2);
        this.f8610u.getClass();
        d0.d dVar2 = abstractC0677a.f8571p;
        dVar2.getClass();
        ?? obj3 = new Object();
        obj3.f5147a = c0059m;
        dVar2.f5150c.add(obj3);
        W.B b3 = this.f8611v;
        Z.m mVar = this.f8574s;
        AbstractC0123a.k(mVar);
        abstractC0677a.n(r12, b3, mVar);
        if (this.f8569n.isEmpty()) {
            abstractC0677a.d(r12);
        }
    }

    @Override // o0.AbstractC0677a
    public final void f() {
        for (C0685i c0685i : this.f8609t.values()) {
            c0685i.f8606a.d(c0685i.f8607b);
        }
    }

    @Override // o0.AbstractC0677a
    public final void h() {
        for (C0685i c0685i : this.f8609t.values()) {
            c0685i.f8606a.g(c0685i.f8607b);
        }
    }

    @Override // o0.AbstractC0677a
    public void m() {
        for (C0685i c0685i : this.f8609t.values()) {
            c0685i.f8606a.m();
        }
    }

    @Override // o0.AbstractC0677a
    public void s() {
        HashMap hashMap = this.f8609t;
        for (C0685i c0685i : hashMap.values()) {
            c0685i.f8606a.r(c0685i.f8607b);
            C0059m c0059m = c0685i.f8608c;
            AbstractC0677a abstractC0677a = c0685i.f8606a;
            abstractC0677a.u(c0059m);
            abstractC0677a.t(c0059m);
        }
        hashMap.clear();
    }

    public abstract C0701z w(Object obj, C0701z c0701z);

    public abstract void z(Object obj, AbstractC0677a abstractC0677a, R.T t3);

    public long x(long j3, Object obj) {
        return j3;
    }

    public int y(int i3, Object obj) {
        return i3;
    }
}
