package t1;

import W1.m;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import g1.ExecutorC0274b;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import s1.InterfaceC0801a;
import s2.C0808g;
/* renamed from: t1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0821d implements InterfaceC0801a {

    /* renamed from: a  reason: collision with root package name */
    public final WindowLayoutComponent f9249a;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f9250b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f9251c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f9252d = new LinkedHashMap();

    public C0821d(WindowLayoutComponent windowLayoutComponent) {
        this.f9249a = windowLayoutComponent;
    }

    @Override // s1.InterfaceC0801a
    public final void a(m mVar) {
        ReentrantLock reentrantLock = this.f9250b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f9252d;
        try {
            Context context = (Context) linkedHashMap.get(mVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f9251c;
            C0823f c0823f = (C0823f) linkedHashMap2.get(context);
            if (c0823f == null) {
                return;
            }
            c0823f.d(mVar);
            linkedHashMap.remove(mVar);
            if (c0823f.c()) {
                linkedHashMap2.remove(context);
                this.f9249a.removeWindowLayoutInfoListener(c0823f);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // s1.InterfaceC0801a
    public final void b(Context context, ExecutorC0274b executorC0274b, m mVar) {
        C0808g c0808g;
        ReentrantLock reentrantLock = this.f9250b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f9251c;
        try {
            C0823f c0823f = (C0823f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f9252d;
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
                this.f9249a.addWindowLayoutInfoListener(context, c0823f2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
