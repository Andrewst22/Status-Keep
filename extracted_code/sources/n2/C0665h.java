package n2;

import android.util.Log;
import c2.C0247a;
import c2.InterfaceC0248b;
import d2.InterfaceC0257a;
import d2.InterfaceC0258b;
import l.v0;
/* renamed from: n2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665h implements InterfaceC0248b, InterfaceC0257a {

    /* renamed from: m  reason: collision with root package name */
    public B1.e f8407m;

    @Override // d2.InterfaceC0257a
    public final void onAttachedToActivity(InterfaceC0258b interfaceC0258b) {
        B1.e eVar = this.f8407m;
        if (eVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            eVar.f58p = (W1.d) ((v0) interfaceC0258b).f7950a;
        }
    }

    @Override // c2.InterfaceC0248b
    public final void onAttachedToEngine(C0247a c0247a) {
        B1.e eVar = new B1.e(c0247a.f5123a);
        this.f8407m = eVar;
        AbstractC0662e.d(c0247a.f5124b, eVar);
    }

    @Override // d2.InterfaceC0257a
    public final void onDetachedFromActivity() {
        B1.e eVar = this.f8407m;
        if (eVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            eVar.f58p = null;
        }
    }

    @Override // d2.InterfaceC0257a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // c2.InterfaceC0248b
    public final void onDetachedFromEngine(C0247a c0247a) {
        if (this.f8407m == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        AbstractC0662e.d(c0247a.f5124b, null);
        this.f8407m = null;
    }

    @Override // d2.InterfaceC0257a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0258b interfaceC0258b) {
        onAttachedToActivity(interfaceC0258b);
    }
}
