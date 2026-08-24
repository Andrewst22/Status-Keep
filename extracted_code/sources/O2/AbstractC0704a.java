package o2;

import R.C;
import R.C0102e;
import R.C0122z;
import R.F;
import R.I;
import R.J;
import R.K;
import R.L;
import R.M;
import R.Z;
import R.c0;
import Y.G;
import Y.InterfaceC0147s;
import java.util.HashMap;
import java.util.List;
/* renamed from: o2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0704a implements L {

    /* renamed from: m  reason: collision with root package name */
    public boolean f8681m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f8682n = false;

    /* renamed from: o  reason: collision with root package name */
    public final InterfaceC0147s f8683o;

    /* renamed from: p  reason: collision with root package name */
    public final C0716m f8684p;

    public AbstractC0704a(InterfaceC0147s interfaceC0147s, C0716m c0716m) {
        this.f8683o = interfaceC0147s;
        this.f8684p = c0716m;
    }

    @Override // R.L
    public final /* synthetic */ void A(J j3) {
    }

    @Override // R.L
    public final void D(boolean z3) {
        C0716m c0716m = this.f8684p;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "isPlayingStateUpdate");
        hashMap.put("isPlaying", Boolean.valueOf(z3));
        c0716m.f8708m.b(hashMap);
    }

    @Override // R.L
    public final /* synthetic */ void a(int i3) {
    }

    @Override // R.L
    public final void b(int i3) {
        C0716m c0716m = this.f8684p;
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 == 4) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "completed");
                    c0716m.f8708m.b(hashMap);
                }
            } else if (!this.f8682n) {
                this.f8682n = true;
                g();
            }
        } else {
            h(true);
            c0716m.a(((G) this.f8683o).k());
        }
        if (i3 != 2) {
            h(false);
        }
    }

    @Override // R.L
    public final /* synthetic */ void c(int i3) {
    }

    @Override // R.L
    public final /* synthetic */ void d(C0102e c0102e) {
    }

    @Override // R.L
    public final /* synthetic */ void e(I i3) {
    }

    @Override // R.L
    public final /* synthetic */ void f(T.c cVar) {
    }

    public abstract void g();

    public final void h(boolean z3) {
        if (this.f8681m == z3) {
            return;
        }
        this.f8681m = z3;
        C0714k c0714k = this.f8684p.f8708m;
        if (z3) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", "bufferingStart");
            c0714k.b(hashMap);
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("event", "bufferingEnd");
        c0714k.b(hashMap2);
    }

    @Override // R.L
    public final /* synthetic */ void j(C0122z c0122z, int i3) {
    }

    @Override // R.L
    public final /* synthetic */ void k(F f3) {
    }

    @Override // R.L
    public final /* synthetic */ void l(int i3, int i4) {
    }

    @Override // R.L
    public final /* synthetic */ void m(int i3) {
    }

    @Override // R.L
    public final /* synthetic */ void n(c0 c0Var) {
    }

    @Override // R.L
    public final /* synthetic */ void o(boolean z3) {
    }

    @Override // R.L
    public final /* synthetic */ void p(int i3, M m3, M m4) {
    }

    @Override // R.L
    public final /* synthetic */ void r(C c3) {
    }

    @Override // R.L
    public final /* synthetic */ void s(boolean z3) {
    }

    @Override // R.L
    public final /* synthetic */ void t(K k3) {
    }

    @Override // R.L
    public final /* synthetic */ void u(List list) {
    }

    @Override // R.L
    public final /* synthetic */ void v(Z z3) {
    }

    @Override // R.L
    public final /* synthetic */ void w(int i3, boolean z3) {
    }

    @Override // R.L
    public final /* synthetic */ void x(int i3, boolean z3) {
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, o2.j] */
    @Override // R.L
    public final void y(I i3) {
        h(false);
        if (i3.f1776m == 1002) {
            InterfaceC0147s interfaceC0147s = this.f8683o;
            C0.e eVar = (C0.e) interfaceC0147s;
            eVar.getClass();
            eVar.i(-9223372036854775807L, ((G) eVar).o());
            ((G) interfaceC0147s).A();
            return;
        }
        C0714k c0714k = this.f8684p.f8708m;
        c0714k.getClass();
        ?? obj = new Object();
        obj.f8701a = "Video player had error " + i3;
        if (!c0714k.f8704c) {
            c0714k.f8703b.add(obj);
        }
        c0714k.a();
    }

    @Override // R.L
    public final /* synthetic */ void z(float f3) {
    }
}
