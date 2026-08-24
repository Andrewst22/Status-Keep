package K2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* renamed from: K2.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0085n {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f844b = AtomicIntegerFieldUpdater.newUpdater(C0085n.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f845a;

    public C0085n(Throwable th, boolean z3) {
        this.f845a = th;
        this._handled = z3 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f845a + ']';
    }
}
