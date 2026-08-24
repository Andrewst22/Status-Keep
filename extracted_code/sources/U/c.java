package U;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2428a;

    public synchronized void a() {
        this.f2428a = false;
    }

    public synchronized boolean b() {
        if (this.f2428a) {
            return false;
        }
        this.f2428a = true;
        notifyAll();
        return true;
    }
}
