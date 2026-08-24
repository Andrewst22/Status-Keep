package t1;

import D2.i;
import W1.m;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import r1.j;
/* renamed from: t1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0823f implements B.a, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9253a;

    /* renamed from: c  reason: collision with root package name */
    public j f9255c;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f9254b = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f9256d = new LinkedHashSet();

    public C0823f(Context context) {
        this.f9253a = context;
    }

    @Override // B.a
    /* renamed from: a */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        i.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f9254b;
        reentrantLock.lock();
        try {
            this.f9255c = AbstractC0822e.b(this.f9253a, windowLayoutInfo);
            for (B.a aVar : this.f9256d) {
                aVar.accept(this.f9255c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(m mVar) {
        ReentrantLock reentrantLock = this.f9254b;
        reentrantLock.lock();
        try {
            j jVar = this.f9255c;
            if (jVar != null) {
                mVar.accept(jVar);
            }
            this.f9256d.add(mVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f9256d.isEmpty();
    }

    public final void d(m mVar) {
        ReentrantLock reentrantLock = this.f9254b;
        reentrantLock.lock();
        try {
            this.f9256d.remove(mVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
