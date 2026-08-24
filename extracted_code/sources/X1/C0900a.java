package x1;

import W1.d;
import android.content.Context;
import c2.C0247a;
import c2.InterfaceC0248b;
import d2.InterfaceC0257a;
import d2.InterfaceC0258b;
import g2.C0276a;
import g2.r;
import java.util.HashSet;
import l.v0;
import t0.C0816a;
/* renamed from: x1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0900a implements InterfaceC0248b, InterfaceC0257a {

    /* renamed from: m  reason: collision with root package name */
    public C0901b f9690m;

    /* renamed from: n  reason: collision with root package name */
    public r f9691n;

    /* renamed from: o  reason: collision with root package name */
    public InterfaceC0258b f9692o;

    @Override // d2.InterfaceC0257a
    public final void onAttachedToActivity(InterfaceC0258b interfaceC0258b) {
        v0 v0Var = (v0) interfaceC0258b;
        d dVar = (d) v0Var.f7950a;
        C0901b c0901b = this.f9690m;
        if (c0901b != null) {
            c0901b.f9695o = dVar;
        }
        this.f9692o = interfaceC0258b;
        v0Var.a(c0901b);
        InterfaceC0258b interfaceC0258b2 = this.f9692o;
        ((HashSet) ((v0) interfaceC0258b2).f7952c).add(this.f9690m);
    }

    @Override // c2.InterfaceC0248b
    public final void onAttachedToEngine(C0247a c0247a) {
        Context context = c0247a.f5123a;
        this.f9690m = new C0901b(context);
        r rVar = new r(c0247a.f5124b, "flutter.baseflow.com/permissions/methods");
        this.f9691n = rVar;
        rVar.b(new C0276a(context, new C0816a(6), this.f9690m, new C0816a(7)));
    }

    @Override // d2.InterfaceC0257a
    public final void onDetachedFromActivity() {
        C0901b c0901b = this.f9690m;
        if (c0901b != null) {
            c0901b.f9695o = null;
        }
        InterfaceC0258b interfaceC0258b = this.f9692o;
        if (interfaceC0258b != null) {
            ((HashSet) ((v0) interfaceC0258b).f7953d).remove(c0901b);
            InterfaceC0258b interfaceC0258b2 = this.f9692o;
            ((HashSet) ((v0) interfaceC0258b2).f7952c).remove(this.f9690m);
        }
        this.f9692o = null;
    }

    @Override // d2.InterfaceC0257a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // c2.InterfaceC0248b
    public final void onDetachedFromEngine(C0247a c0247a) {
        this.f9691n.b(null);
        this.f9691n = null;
    }

    @Override // d2.InterfaceC0257a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0258b interfaceC0258b) {
        onAttachedToActivity(interfaceC0258b);
    }
}
