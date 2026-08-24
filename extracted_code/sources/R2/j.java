package R2;

import K2.AbstractC0092v;
/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: o  reason: collision with root package name */
    public final Runnable f2135o;

    public j(Runnable runnable, long j3, i iVar) {
        super(j3, iVar);
        this.f2135o = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2135o.run();
        } finally {
            this.f2133n.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f2135o;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0092v.b(runnable));
        sb.append(", ");
        sb.append(this.f2132m);
        sb.append(", ");
        sb.append(this.f2133n);
        sb.append(']');
        return sb.toString();
    }
}
