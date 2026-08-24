package j2;

import R1.f;
import W1.d;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import c2.C0247a;
import c2.InterfaceC0248b;
import d2.InterfaceC0257a;
import d2.InterfaceC0258b;
import g2.q;
import g2.t;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l.v0;
/* renamed from: j2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0518a implements InterfaceC0248b, InterfaceC0257a, t {

    /* renamed from: m  reason: collision with root package name */
    public final PackageManager f7365m;

    /* renamed from: n  reason: collision with root package name */
    public InterfaceC0258b f7366n;

    /* renamed from: o  reason: collision with root package name */
    public HashMap f7367o;

    /* renamed from: p  reason: collision with root package name */
    public final HashMap f7368p = new HashMap();

    public C0518a(B1.a aVar) {
        this.f7365m = (PackageManager) aVar.f50n;
        aVar.f51o = this;
    }

    public final void a(String str, String str2, boolean z3, f fVar) {
        if (this.f7366n == null) {
            fVar.a("error", "Plugin not bound to an Activity", null);
        } else if (Build.VERSION.SDK_INT < 23) {
            fVar.a("error", "Android version not supported", null);
        } else {
            HashMap hashMap = this.f7367o;
            if (hashMap == null) {
                fVar.a("error", "Can not process text actions before calling queryTextActions", null);
                return;
            }
            ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
            if (resolveInfo == null) {
                fVar.a("error", "Text processing activity not found", null);
                return;
            }
            int hashCode = fVar.hashCode();
            this.f7368p.put(Integer.valueOf(hashCode), fVar);
            Intent intent = new Intent();
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent.setClassName(activityInfo.packageName, activityInfo.name);
            intent.setAction("android.intent.action.PROCESS_TEXT");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
            intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z3);
            ((d) ((v0) this.f7366n).f7950a).startActivityForResult(intent, hashCode);
        }
    }

    public final HashMap b() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f7367o;
        PackageManager packageManager = this.f7365m;
        if (hashMap == null) {
            this.f7367o = new HashMap();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 23) {
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if (i3 >= 33) {
                    of = PackageManager.ResolveInfoFlags.of(0L);
                    queryIntentActivities = packageManager.queryIntentActivities(type, of);
                } else {
                    queryIntentActivities = packageManager.queryIntentActivities(type, 0);
                }
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    String str = resolveInfo.activityInfo.name;
                    resolveInfo.loadLabel(packageManager).toString();
                    this.f7367o.put(str, resolveInfo);
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f7367o.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f7367o.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // g2.t
    public final boolean onActivityResult(int i3, int i4, Intent intent) {
        String str;
        HashMap hashMap = this.f7368p;
        if (!hashMap.containsKey(Integer.valueOf(i3))) {
            return false;
        }
        if (i4 == -1) {
            str = intent.getStringExtra("android.intent.extra.PROCESS_TEXT");
        } else {
            str = null;
        }
        ((q) hashMap.remove(Integer.valueOf(i3))).b(str);
        return true;
    }

    @Override // d2.InterfaceC0257a
    public final void onAttachedToActivity(InterfaceC0258b interfaceC0258b) {
        this.f7366n = interfaceC0258b;
        ((v0) interfaceC0258b).a(this);
    }

    @Override // d2.InterfaceC0257a
    public final void onDetachedFromActivity() {
        ((HashSet) ((v0) this.f7366n).f7953d).remove(this);
        this.f7366n = null;
    }

    @Override // d2.InterfaceC0257a
    public final void onDetachedFromActivityForConfigChanges() {
        ((HashSet) ((v0) this.f7366n).f7953d).remove(this);
        this.f7366n = null;
    }

    @Override // d2.InterfaceC0257a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0258b interfaceC0258b) {
        this.f7366n = interfaceC0258b;
        ((v0) interfaceC0258b).a(this);
    }

    @Override // c2.InterfaceC0248b
    public final void onAttachedToEngine(C0247a c0247a) {
    }

    @Override // c2.InterfaceC0248b
    public final void onDetachedFromEngine(C0247a c0247a) {
    }
}
