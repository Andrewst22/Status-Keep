package u1;

import W1.m;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import g1.ExecutorC0274b;
import io.flutter.plugin.platform.A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import k0.C0558m;
import s1.InterfaceC0801a;
import s2.C0808g;
import t2.C0835l;
/* loaded from: classes.dex */
public final class j implements InterfaceC0801a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile j f9452c;

    /* renamed from: d  reason: collision with root package name */
    public static final ReentrantLock f9453d = new ReentrantLock();

    /* renamed from: a  reason: collision with root package name */
    public final h f9454a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f9455b = new CopyOnWriteArrayList();

    public j(h hVar) {
        this.f9454a = hVar;
        if (hVar != null) {
            hVar.h(new C0558m(this, 16));
        }
    }

    @Override // s1.InterfaceC0801a
    public final void a(m mVar) {
        synchronized (f9453d) {
            try {
                if (this.f9454a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f9455b.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    if (iVar.f9450b == mVar) {
                        arrayList.add(iVar);
                    }
                }
                this.f9455b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((i) it2.next()).f9449a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f9455b;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((i) it3.next()).f9449a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    h hVar = this.f9454a;
                    if (hVar != null) {
                        hVar.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s1.InterfaceC0801a
    public final void b(Context context, ExecutorC0274b executorC0274b, m mVar) {
        Activity activity;
        Object obj;
        WindowManager.LayoutParams attributes;
        C0808g c0808g = null;
        r1 = null;
        IBinder iBinder = null;
        r1.j jVar = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        C0835l c0835l = C0835l.f9264m;
        if (activity != null) {
            ReentrantLock reentrantLock = f9453d;
            reentrantLock.lock();
            try {
                h hVar = this.f9454a;
                if (hVar == null) {
                    mVar.accept(new r1.j(c0835l));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f9455b;
                boolean z3 = false;
                if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((i) it.next()).f9449a.equals(activity)) {
                            z3 = true;
                            break;
                        }
                    }
                }
                i iVar = new i(activity, executorC0274b, mVar);
                copyOnWriteArrayList.add(iVar);
                if (!z3) {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        hVar.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new A(hVar, activity));
                    }
                } else {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (activity.equals(((i) obj).f9449a)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    i iVar2 = (i) obj;
                    if (iVar2 != null) {
                        jVar = iVar2.f9451c;
                    }
                    if (jVar != null) {
                        iVar.f9451c = jVar;
                        iVar.f9450b.accept(jVar);
                    }
                }
                reentrantLock.unlock();
                c0808g = C0808g.f9229a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (c0808g == null) {
            mVar.accept(new r1.j(c0835l));
        }
    }
}
