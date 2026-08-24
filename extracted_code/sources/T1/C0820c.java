package t1;

import D2.r;
import W1.m;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import g1.ExecutorC0274b;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import n1.C0657a;
import s1.InterfaceC0801a;
import s2.C0808g;
import t2.C0835l;
/* renamed from: t1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820c implements InterfaceC0801a {

    /* renamed from: a  reason: collision with root package name */
    public final WindowLayoutComponent f9243a;

    /* renamed from: b  reason: collision with root package name */
    public final C0657a f9244b;

    /* renamed from: c  reason: collision with root package name */
    public final ReentrantLock f9245c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f9246d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f9247e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f9248f = new LinkedHashMap();

    public C0820c(WindowLayoutComponent windowLayoutComponent, C0657a c0657a) {
        this.f9243a = windowLayoutComponent;
        this.f9244b = c0657a;
    }

    @Override // s1.InterfaceC0801a
    public final void a(m mVar) {
        ReentrantLock reentrantLock = this.f9245c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f9247e;
        try {
            Context context = (Context) linkedHashMap.get(mVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f9246d;
            C0823f c0823f = (C0823f) linkedHashMap2.get(context);
            if (c0823f == null) {
                return;
            }
            c0823f.d(mVar);
            linkedHashMap.remove(mVar);
            if (c0823f.f9256d.isEmpty()) {
                linkedHashMap2.remove(context);
                o1.d dVar = (o1.d) this.f9248f.remove(c0823f);
                if (dVar != null) {
                    dVar.f8665a.invoke(dVar.f8666b, dVar.f8667c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // s1.InterfaceC0801a
    public final void b(Context context, ExecutorC0274b executorC0274b, m mVar) {
        C0808g c0808g;
        ReentrantLock reentrantLock = this.f9245c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f9246d;
        try {
            C0823f c0823f = (C0823f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f9247e;
            if (c0823f != null) {
                c0823f.b(mVar);
                linkedHashMap2.put(mVar, context);
                c0808g = C0808g.f9229a;
            } else {
                c0808g = null;
            }
            if (c0808g == null) {
                C0823f c0823f2 = new C0823f(context);
                linkedHashMap.put(context, c0823f2);
                linkedHashMap2.put(mVar, context);
                c0823f2.b(mVar);
                if (context instanceof Activity) {
                    this.f9248f.put(c0823f2, this.f9244b.a(this.f9243a, r.a(WindowLayoutInfo.class), (Activity) context, new C0819b(c0823f2)));
                } else {
                    c0823f2.accept(new WindowLayoutInfo(C0835l.f9264m));
                    reentrantLock.unlock();
                    return;
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
