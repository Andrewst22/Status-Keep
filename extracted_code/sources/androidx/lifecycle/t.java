package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m.C0612a;
import n.C0651a;
import n.C0653c;
/* loaded from: classes.dex */
public final class t extends m {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4351a;

    /* renamed from: b  reason: collision with root package name */
    public C0651a f4352b;

    /* renamed from: c  reason: collision with root package name */
    public l f4353c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference f4354d;

    /* renamed from: e  reason: collision with root package name */
    public int f4355e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4356f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4357g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f4358h;

    /* renamed from: i  reason: collision with root package name */
    public final N2.q f4359i;

    public t(r rVar) {
        new AtomicReference();
        this.f4351a = true;
        this.f4352b = new C0651a();
        l lVar = l.f4343n;
        this.f4353c = lVar;
        this.f4358h = new ArrayList();
        this.f4354d = new WeakReference(rVar);
        this.f4359i = new N2.q(lVar);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.lifecycle.s, java.lang.Object] */
    @Override // androidx.lifecycle.m
    public final void a(q qVar) {
        p fVar;
        r rVar;
        ArrayList arrayList = this.f4358h;
        D2.i.e(qVar, "observer");
        c("addObserver");
        l lVar = this.f4353c;
        l lVar2 = l.f4342m;
        if (lVar != lVar2) {
            lVar2 = l.f4343n;
        }
        ?? obj = new Object();
        HashMap hashMap = u.f4360a;
        boolean z3 = qVar instanceof p;
        boolean z4 = qVar instanceof DefaultLifecycleObserver;
        s sVar = null;
        boolean z5 = false;
        if (z3 && z4) {
            fVar = new f((DefaultLifecycleObserver) qVar, (p) qVar);
        } else if (z4) {
            fVar = new f((DefaultLifecycleObserver) qVar, null);
        } else if (z3) {
            fVar = (p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.b(cls) == 2) {
                Object obj2 = u.f4361b.get(cls);
                D2.i.b(obj2);
                List list = (List) obj2;
                if (list.size() != 1) {
                    int size = list.size();
                    h[] hVarArr = new h[size];
                    if (size <= 0) {
                        fVar = new d(hVarArr);
                    } else {
                        u.a((Constructor) list.get(0), qVar);
                        throw null;
                    }
                } else {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
            } else {
                fVar = new f(qVar);
            }
        }
        obj.f4350b = fVar;
        obj.f4349a = lVar2;
        C0651a c0651a = this.f4352b;
        C0653c c0653c = (C0653c) c0651a.f8329q.get(qVar);
        if (c0653c != null) {
            sVar = c0653c.f8334n;
        } else {
            HashMap hashMap2 = c0651a.f8329q;
            C0653c c0653c2 = new C0653c(qVar, obj);
            c0651a.f8328p++;
            C0653c c0653c3 = c0651a.f8326n;
            if (c0653c3 == null) {
                c0651a.f8325m = c0653c2;
                c0651a.f8326n = c0653c2;
            } else {
                c0653c3.f8335o = c0653c2;
                c0653c2.f8336p = c0653c3;
                c0651a.f8326n = c0653c2;
            }
            hashMap2.put(qVar, c0653c2);
        }
        if (sVar != null || (rVar = (r) this.f4354d.get()) == null) {
            return;
        }
        z5 = (this.f4355e != 0 || this.f4356f) ? true : true;
        l b3 = b(qVar);
        this.f4355e++;
        while (obj.f4349a.compareTo(b3) < 0 && this.f4352b.f8329q.containsKey(qVar)) {
            arrayList.add(obj.f4349a);
            i iVar = k.Companion;
            l lVar3 = obj.f4349a;
            iVar.getClass();
            k a3 = i.a(lVar3);
            if (a3 != null) {
                obj.a(rVar, a3);
                arrayList.remove(arrayList.size() - 1);
                b3 = b(qVar);
            } else {
                throw new IllegalStateException("no event up from " + obj.f4349a);
            }
        }
        if (!z5) {
            e();
        }
        this.f4355e--;
    }

    public final l b(q qVar) {
        C0653c c0653c;
        l lVar;
        HashMap hashMap = this.f4352b.f8329q;
        l lVar2 = null;
        if (hashMap.containsKey(qVar)) {
            c0653c = ((C0653c) hashMap.get(qVar)).f8336p;
        } else {
            c0653c = null;
        }
        if (c0653c != null) {
            lVar = c0653c.f8334n.f4349a;
        } else {
            lVar = null;
        }
        ArrayList arrayList = this.f4358h;
        if (!arrayList.isEmpty()) {
            lVar2 = (l) arrayList.get(arrayList.size() - 1);
        }
        l lVar3 = this.f4353c;
        D2.i.e(lVar3, "state1");
        if (lVar == null || lVar.compareTo(lVar3) >= 0) {
            lVar = lVar3;
        }
        if (lVar2 == null || lVar2.compareTo(lVar) >= 0) {
            return lVar;
        }
        return lVar2;
    }

    public final void c(String str) {
        C0612a c0612a;
        if (this.f4351a) {
            if (C0612a.f8141v != null) {
                c0612a = C0612a.f8141v;
            } else {
                synchronized (C0612a.class) {
                    try {
                        if (C0612a.f8141v == null) {
                            C0612a.f8141v = new C0612a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0612a = C0612a.f8141v;
            }
            ((C0612a) c0612a.f8142u).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
            }
        }
    }

    public final void d(k kVar) {
        D2.i.e(kVar, "event");
        c("handleLifecycleEvent");
        l a3 = kVar.a();
        l lVar = this.f4353c;
        if (lVar != a3) {
            l lVar2 = l.f4343n;
            l lVar3 = l.f4342m;
            if (lVar == lVar2 && a3 == lVar3) {
                throw new IllegalStateException(("no event down from " + this.f4353c + " in component " + this.f4354d.get()).toString());
            }
            this.f4353c = a3;
            if (!this.f4356f && this.f4355e == 0) {
                this.f4356f = true;
                e();
                this.f4356f = false;
                if (this.f4353c == lVar3) {
                    this.f4352b = new C0651a();
                    return;
                }
                return;
            }
            this.f4357g = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        r8.f4357g = false;
        r0 = r8.f4353c;
        r1 = r8.f4359i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        r0 = O2.l.f1350a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        r1.c(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.t.e():void");
    }
}
