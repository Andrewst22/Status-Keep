package K2;
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f834a = new ThreadLocal();

    public static H a() {
        ThreadLocal threadLocal = f834a;
        H h3 = (H) threadLocal.get();
        if (h3 == null) {
            C0075d c0075d = new C0075d(Thread.currentThread());
            threadLocal.set(c0075d);
            return c0075d;
        }
        return h3;
    }
}
