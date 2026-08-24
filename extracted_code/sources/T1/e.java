package T1;

import D2.i;
import android.content.Context;
import c2.C0247a;
import c2.InterfaceC0248b;
import d2.InterfaceC0257a;
import d2.InterfaceC0258b;
import g2.r;
import java.util.concurrent.atomic.AtomicBoolean;
import l.v0;
/* loaded from: classes.dex */
public final class e implements InterfaceC0248b, InterfaceC0257a {

    /* renamed from: m  reason: collision with root package name */
    public d f2347m;

    /* renamed from: n  reason: collision with root package name */
    public f f2348n;

    /* renamed from: o  reason: collision with root package name */
    public r f2349o;

    @Override // d2.InterfaceC0257a
    public final void onAttachedToActivity(InterfaceC0258b interfaceC0258b) {
        i.e(interfaceC0258b, "binding");
        f fVar = this.f2348n;
        if (fVar != null) {
            v0 v0Var = (v0) interfaceC0258b;
            v0Var.a(fVar);
            d dVar = this.f2347m;
            if (dVar != null) {
                dVar.f2343o = (W1.d) v0Var.f7950a;
                return;
            } else {
                i.g("share");
                throw null;
            }
        }
        i.g("manager");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T1.f, java.lang.Object] */
    @Override // c2.InterfaceC0248b
    public final void onAttachedToEngine(C0247a c0247a) {
        i.e(c0247a, "binding");
        this.f2349o = new r(c0247a.f5124b, "dev.fluttercommunity.plus/share");
        Context context = c0247a.f5123a;
        i.d(context, "getApplicationContext(...)");
        ?? obj = new Object();
        obj.f2351n = new AtomicBoolean(true);
        this.f2348n = obj;
        d dVar = new d(context, obj);
        this.f2347m = dVar;
        f fVar = this.f2348n;
        if (fVar != null) {
            B1.a aVar = new B1.a(dVar, fVar);
            r rVar = this.f2349o;
            if (rVar != null) {
                rVar.b(aVar);
                return;
            } else {
                i.g("methodChannel");
                throw null;
            }
        }
        i.g("manager");
        throw null;
    }

    @Override // d2.InterfaceC0257a
    public final void onDetachedFromActivity() {
        d dVar = this.f2347m;
        if (dVar != null) {
            dVar.f2343o = null;
        } else {
            i.g("share");
            throw null;
        }
    }

    @Override // d2.InterfaceC0257a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // c2.InterfaceC0248b
    public final void onDetachedFromEngine(C0247a c0247a) {
        i.e(c0247a, "binding");
        r rVar = this.f2349o;
        if (rVar != null) {
            rVar.b(null);
        } else {
            i.g("methodChannel");
            throw null;
        }
    }

    @Override // d2.InterfaceC0257a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0258b interfaceC0258b) {
        i.e(interfaceC0258b, "binding");
        onAttachedToActivity(interfaceC0258b);
    }
}
