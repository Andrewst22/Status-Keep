package U1;

import C1.j;
import D2.i;
import W1.d;
import c2.C0247a;
import c2.InterfaceC0248b;
import d2.InterfaceC0257a;
import d2.InterfaceC0258b;
import g2.g;
import l.v0;
/* loaded from: classes.dex */
public final class b implements InterfaceC0248b, e, InterfaceC0257a {

    /* renamed from: m  reason: collision with root package name */
    public j f2580m;

    public final void a(defpackage.b bVar) {
        boolean z3;
        j jVar = this.f2580m;
        i.b(jVar);
        d dVar = (d) jVar.f168n;
        if (dVar != null) {
            i.b(dVar);
            if ((dVar.getWindow().getAttributes().flags & 128) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            Boolean bool = bVar.f4505a;
            i.b(bool);
            if (bool.booleanValue()) {
                if (!z3) {
                    dVar.getWindow().addFlags(128);
                    return;
                }
                return;
            } else if (z3) {
                dVar.getWindow().clearFlags(128);
                return;
            } else {
                return;
            }
        }
        throw new a();
    }

    @Override // d2.InterfaceC0257a
    public final void onAttachedToActivity(InterfaceC0258b interfaceC0258b) {
        i.e(interfaceC0258b, "binding");
        j jVar = this.f2580m;
        if (jVar != null) {
            jVar.f168n = (d) ((v0) interfaceC0258b).f7950a;
        }
    }

    @Override // c2.InterfaceC0248b
    public final void onAttachedToEngine(C0247a c0247a) {
        i.e(c0247a, "flutterPluginBinding");
        g gVar = c0247a.f5124b;
        i.d(gVar, "getBinaryMessenger(...)");
        d.a(e.f5191d, gVar, this);
        this.f2580m = new j(18, false);
    }

    @Override // d2.InterfaceC0257a
    public final void onDetachedFromActivity() {
        j jVar = this.f2580m;
        if (jVar != null) {
            jVar.f168n = null;
        }
    }

    @Override // d2.InterfaceC0257a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // c2.InterfaceC0248b
    public final void onDetachedFromEngine(C0247a c0247a) {
        i.e(c0247a, "binding");
        g gVar = c0247a.f5124b;
        i.d(gVar, "getBinaryMessenger(...)");
        d.a(e.f5191d, gVar, null);
        this.f2580m = null;
    }

    @Override // d2.InterfaceC0257a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0258b interfaceC0258b) {
        i.e(interfaceC0258b, "binding");
        onAttachedToActivity(interfaceC0258b);
    }
}
