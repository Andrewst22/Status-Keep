package U;

import android.os.Handler;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f2485b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    public final Handler f2486a;

    public x(Handler handler) {
        this.f2486a = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static w b() {
        w wVar;
        ArrayList arrayList = f2485b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    wVar = new Object();
                } else {
                    wVar = (w) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }

    public final w a(int i3, Object obj) {
        w b3 = b();
        b3.f2484a = this.f2486a.obtainMessage(i3, obj);
        return b3;
    }

    public final boolean c(Runnable runnable) {
        return this.f2486a.post(runnable);
    }

    public final void d(int i3) {
        boolean z3;
        if (i3 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        this.f2486a.removeMessages(i3);
    }

    public final boolean e(int i3) {
        return this.f2486a.sendEmptyMessage(i3);
    }
}
