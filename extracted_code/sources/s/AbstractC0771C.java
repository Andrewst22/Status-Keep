package s;

import android.os.Bundle;
/* renamed from: s.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0771C {

    /* renamed from: a  reason: collision with root package name */
    public C0791o f9045a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f9046b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f9047c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9048d = false;

    public void a(Bundle bundle) {
        if (this.f9048d) {
            bundle.putCharSequence("android.summaryText", this.f9047c);
        }
        CharSequence charSequence = this.f9046b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c3 = c();
        if (c3 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c3);
        }
    }

    public abstract void b(R0.j jVar);

    public String c() {
        return null;
    }

    public void g(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.f9047c = bundle.getCharSequence("android.summaryText");
            this.f9048d = true;
        }
        this.f9046b = bundle.getCharSequence("android.title.big");
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }
}
