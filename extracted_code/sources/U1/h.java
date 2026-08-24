package u1;

import B1.e;
import D2.i;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import k0.C0558m;
import r1.j;
import t2.C0835l;
import u1.f;
import u1.g;
import u1.h;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final SidecarInterface f9444a;

    /* renamed from: b  reason: collision with root package name */
    public final f f9445b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f9446c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f9447d;

    /* renamed from: e  reason: collision with root package name */
    public B1.e f9448e;

    public h(Context context) {
        D2.i.e(context, "context");
        SidecarInterface b3 = g.b(context);
        f fVar = new f();
        this.f9444a = b3;
        this.f9445b = fVar;
        this.f9446c = new LinkedHashMap();
        this.f9447d = new LinkedHashMap();
    }

    public final SidecarInterface d() {
        return this.f9444a;
    }

    public final r1.j e(Activity activity) {
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo;
        SidecarDeviceState sidecarDeviceState;
        IBinder a3 = g.a(activity);
        if (a3 == null) {
            return new r1.j(C0835l.f9264m);
        }
        SidecarInterface sidecarInterface = this.f9444a;
        if (sidecarInterface != null) {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(a3);
        } else {
            sidecarWindowLayoutInfo = null;
        }
        SidecarInterface sidecarInterface2 = this.f9444a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f9445b.f(sidecarWindowLayoutInfo, sidecarDeviceState);
    }

    public final void f(Activity activity) {
        boolean z3;
        SidecarInterface sidecarInterface;
        IBinder a3 = g.a(activity);
        if (a3 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f9444a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a3);
        }
        LinkedHashMap linkedHashMap = this.f9447d;
        if (((B.a) linkedHashMap.get(activity)) != null) {
            linkedHashMap.remove(activity);
        }
        B1.e eVar = this.f9448e;
        if (eVar != null) {
            eVar.T(activity);
        }
        LinkedHashMap linkedHashMap2 = this.f9446c;
        if (linkedHashMap2.size() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        linkedHashMap2.remove(a3);
        if (z3 && (sidecarInterface = this.f9444a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(true);
        }
    }

    public final void g(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f9446c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f9444a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f9444a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        B1.e eVar = this.f9448e;
        if (eVar != null) {
            eVar.p0(activity, e(activity));
        }
        this.f9447d.get(activity);
    }

    public final void h(C0558m c0558m) {
        this.f9448e = new B1.e(c0558m);
        SidecarInterface sidecarInterface = this.f9444a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f9445b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                    LinkedHashMap linkedHashMap;
                    e eVar;
                    f fVar;
                    SidecarInterface d3;
                    i.e(sidecarDeviceState, "newDeviceState");
                    linkedHashMap = h.this.f9446c;
                    Collection<Activity> values = linkedHashMap.values();
                    h hVar = h.this;
                    for (Activity activity : values) {
                        IBinder a3 = g.a(activity);
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (a3 != null && (d3 = hVar.d()) != null) {
                            sidecarWindowLayoutInfo = d3.getWindowLayoutInfo(a3);
                        }
                        eVar = hVar.f9448e;
                        if (eVar != null) {
                            fVar = hVar.f9445b;
                            eVar.p0(activity, fVar.f(sidecarWindowLayoutInfo, sidecarDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    LinkedHashMap linkedHashMap;
                    f fVar;
                    SidecarDeviceState sidecarDeviceState;
                    e eVar;
                    i.e(iBinder, "windowToken");
                    i.e(sidecarWindowLayoutInfo, "newLayout");
                    linkedHashMap = h.this.f9446c;
                    Activity activity = (Activity) linkedHashMap.get(iBinder);
                    if (activity != null) {
                        fVar = h.this.f9445b;
                        SidecarInterface d3 = h.this.d();
                        if (d3 == null || (sidecarDeviceState = d3.getDeviceState()) == null) {
                            sidecarDeviceState = new SidecarDeviceState();
                        }
                        j f3 = fVar.f(sidecarWindowLayoutInfo, sidecarDeviceState);
                        eVar = h.this.f9448e;
                        if (eVar != null) {
                            eVar.p0(activity, f3);
                            return;
                        }
                        return;
                    }
                    Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                }
            }));
        }
    }

    public final boolean i() {
        Method method;
        Class<?> cls;
        Method method2;
        Class<?> cls2;
        Method method3;
        Class<?> cls3;
        Method method4;
        Class<?> cls4;
        Class<?> cls5;
        Class<?> cls6;
        Class<?> cls7;
        Class<?> cls8;
        try {
            SidecarInterface sidecarInterface = this.f9444a;
            if (sidecarInterface != null && (cls8 = sidecarInterface.getClass()) != null) {
                method = cls8.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            } else {
                method = null;
            }
            if (method != null) {
                cls = method.getReturnType();
            } else {
                cls = null;
            }
            Class cls9 = Void.TYPE;
            if (D2.i.a(cls, cls9)) {
                SidecarInterface sidecarInterface2 = this.f9444a;
                if (sidecarInterface2 != null) {
                    sidecarInterface2.getDeviceState();
                }
                SidecarInterface sidecarInterface3 = this.f9444a;
                if (sidecarInterface3 != null) {
                    sidecarInterface3.onDeviceStateListenersChanged(true);
                }
                SidecarInterface sidecarInterface4 = this.f9444a;
                if (sidecarInterface4 != null && (cls7 = sidecarInterface4.getClass()) != null) {
                    method2 = cls7.getMethod("getWindowLayoutInfo", IBinder.class);
                } else {
                    method2 = null;
                }
                if (method2 != null) {
                    cls2 = method2.getReturnType();
                } else {
                    cls2 = null;
                }
                if (D2.i.a(cls2, SidecarWindowLayoutInfo.class)) {
                    SidecarInterface sidecarInterface5 = this.f9444a;
                    if (sidecarInterface5 != null && (cls6 = sidecarInterface5.getClass()) != null) {
                        method3 = cls6.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                    } else {
                        method3 = null;
                    }
                    if (method3 != null) {
                        cls3 = method3.getReturnType();
                    } else {
                        cls3 = null;
                    }
                    if (D2.i.a(cls3, cls9)) {
                        SidecarInterface sidecarInterface6 = this.f9444a;
                        if (sidecarInterface6 != null && (cls5 = sidecarInterface6.getClass()) != null) {
                            method4 = cls5.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                        } else {
                            method4 = null;
                        }
                        if (method4 != null) {
                            cls4 = method4.getReturnType();
                        } else {
                            cls4 = null;
                        }
                        if (D2.i.a(cls4, cls9)) {
                            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                            try {
                                sidecarDeviceState.posture = 3;
                            } catch (NoSuchFieldError unused) {
                                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                                D2.i.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                                if (((Integer) invoke).intValue() != 3) {
                                    throw new Exception("Invalid device posture getter/setter");
                                }
                            }
                            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                            Rect rect = sidecarDisplayFeature.getRect();
                            D2.i.d(rect, "displayFeature.rect");
                            sidecarDisplayFeature.setRect(rect);
                            sidecarDisplayFeature.getType();
                            sidecarDisplayFeature.setType(1);
                            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                            try {
                                List list = sidecarWindowLayoutInfo.displayFeatures;
                            } catch (NoSuchFieldError unused2) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(sidecarDisplayFeature);
                                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                                D2.i.c(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                                if (!D2.i.a(arrayList, (List) invoke2)) {
                                    throw new Exception("Invalid display feature getter/setter");
                                }
                            }
                            return true;
                        }
                        throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + cls4);
                    }
                    throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + cls3);
                }
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + cls2);
            }
            throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + cls);
        } catch (Throwable unused3) {
            return false;
        }
    }
}
