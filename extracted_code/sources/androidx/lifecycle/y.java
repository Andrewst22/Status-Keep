package androidx.lifecycle;

import android.os.Handler;
/* loaded from: classes.dex */
public final class y implements r {

    /* renamed from: u  reason: collision with root package name */
    public static final y f4362u = new y();

    /* renamed from: m  reason: collision with root package name */
    public int f4363m;

    /* renamed from: n  reason: collision with root package name */
    public int f4364n;

    /* renamed from: q  reason: collision with root package name */
    public Handler f4367q;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4365o = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4366p = true;

    /* renamed from: r  reason: collision with root package name */
    public final t f4368r = new t(this);

    /* renamed from: s  reason: collision with root package name */
    public final Z.d f4369s = new Z.d(this, 3);

    /* renamed from: t  reason: collision with root package name */
    public final C1.j f4370t = new C1.j(this, 26);

    @Override // androidx.lifecycle.r
    public final t a() {
        return this.f4368r;
    }

    public final void b() {
        int i3 = this.f4364n + 1;
        this.f4364n = i3;
        if (i3 == 1) {
            if (this.f4365o) {
                this.f4368r.d(k.ON_RESUME);
                this.f4365o = false;
                return;
            }
            Handler handler = this.f4367q;
            D2.i.b(handler);
            handler.removeCallbacks(this.f4369s);
        }
    }
}
