package Y;
/* loaded from: classes.dex */
public final class E implements g0 {

    /* renamed from: m  reason: collision with root package name */
    public E f3022m;

    /* renamed from: n  reason: collision with root package name */
    public E f3023n;

    public final void a(long j3, float[] fArr) {
        E e2 = this.f3023n;
        if (e2 != null) {
            e2.a(j3, fArr);
        }
    }

    public final void b() {
        E e2 = this.f3023n;
        if (e2 != null) {
            e2.b();
        }
    }

    public final void c(long j3, long j4) {
        E e2 = this.f3022m;
        if (e2 != null) {
            e2.c(j3, j4);
        }
    }

    @Override // Y.g0
    public final void d(int i3, Object obj) {
        if (i3 != 7) {
            if (i3 != 8) {
                if (i3 == 10000 && obj != null) {
                    throw new ClassCastException();
                }
                return;
            }
            this.f3023n = (E) obj;
            return;
        }
        this.f3022m = (E) obj;
    }
}
