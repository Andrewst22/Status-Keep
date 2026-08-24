package U;

import R.C0111n;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final v f2445a;

    /* renamed from: b  reason: collision with root package name */
    public final x f2446b;

    /* renamed from: c  reason: collision with root package name */
    public final j f2447c;

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArraySet f2448d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque f2449e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque f2450f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f2451g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2452h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2453i;

    public l(Looper looper, v vVar, j jVar) {
        this(new CopyOnWriteArraySet(), looper, vVar, jVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f2451g) {
            try {
                if (this.f2452h) {
                    return;
                }
                this.f2448d.add(new k(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        f();
        ArrayDeque arrayDeque = this.f2450f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        x xVar = this.f2446b;
        if (!xVar.f2486a.hasMessages(1)) {
            xVar.getClass();
            w b3 = x.b();
            b3.f2484a = xVar.f2486a.obtainMessage(1);
            xVar.getClass();
            Message message = b3.f2484a;
            message.getClass();
            xVar.f2486a.sendMessageAtFrontOfQueue(message);
            b3.a();
        }
        ArrayDeque arrayDeque2 = this.f2449e;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (!isEmpty) {
            return;
        }
        while (!arrayDeque2.isEmpty()) {
            ((Runnable) arrayDeque2.peekFirst()).run();
            arrayDeque2.removeFirst();
        }
    }

    public final void c(int i3, i iVar) {
        f();
        this.f2450f.add(new h(new CopyOnWriteArraySet(this.f2448d), i3, iVar, 0));
    }

    public final void d() {
        f();
        synchronized (this.f2451g) {
            this.f2452h = true;
        }
        Iterator it = this.f2448d.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            j jVar = this.f2447c;
            kVar.f2444d = true;
            if (kVar.f2443c) {
                kVar.f2443c = false;
                jVar.a(kVar.f2441a, kVar.f2442b.b());
            }
        }
        this.f2448d.clear();
    }

    public final void e(int i3, i iVar) {
        c(i3, iVar);
        b();
    }

    public final void f() {
        boolean z3;
        if (!this.f2453i) {
            return;
        }
        if (Thread.currentThread() == this.f2446b.f2486a.getLooper().getThread()) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
    }

    public l(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, v vVar, j jVar, boolean z3) {
        this.f2445a = vVar;
        this.f2448d = copyOnWriteArraySet;
        this.f2447c = jVar;
        this.f2451g = new Object();
        this.f2449e = new ArrayDeque();
        this.f2450f = new ArrayDeque();
        this.f2446b = vVar.a(looper, new Handler.Callback() { // from class: U.g
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                l lVar = l.this;
                Iterator it = lVar.f2448d.iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (!kVar.f2444d && kVar.f2443c) {
                        C0111n b3 = kVar.f2442b.b();
                        kVar.f2442b = new A.i();
                        kVar.f2443c = false;
                        lVar.f2447c.a(kVar.f2441a, b3);
                    }
                    if (lVar.f2446b.f2486a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f2453i = z3;
    }
}
