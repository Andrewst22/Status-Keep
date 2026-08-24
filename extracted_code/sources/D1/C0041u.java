package D1;

import java.util.Map;
/* renamed from: D1.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041u extends AbstractC0034m {

    /* renamed from: m  reason: collision with root package name */
    public final Object f302m;

    /* renamed from: n  reason: collision with root package name */
    public int f303n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ C0042v f304o;

    public C0041u(C0042v c0042v, int i3) {
        this.f304o = c0042v;
        Object obj = C0042v.f305v;
        this.f302m = c0042v.j()[i3];
        this.f303n = i3;
    }

    public final void a() {
        int i3 = this.f303n;
        Object obj = this.f302m;
        C0042v c0042v = this.f304o;
        if (i3 != -1 && i3 < c0042v.size()) {
            if (android.support.v4.media.session.a.s(obj, c0042v.j()[this.f303n])) {
                return;
            }
        }
        Object obj2 = C0042v.f305v;
        this.f303n = c0042v.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f302m;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C0042v c0042v = this.f304o;
        Map c3 = c0042v.c();
        if (c3 != null) {
            return c3.get(this.f302m);
        }
        a();
        int i3 = this.f303n;
        if (i3 == -1) {
            return null;
        }
        return c0042v.k()[i3];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0042v c0042v = this.f304o;
        Map c3 = c0042v.c();
        Object obj2 = this.f302m;
        if (c3 != null) {
            return c3.put(obj2, obj);
        }
        a();
        int i3 = this.f303n;
        if (i3 == -1) {
            c0042v.put(obj2, obj);
            return null;
        }
        Object obj3 = c0042v.k()[i3];
        c0042v.k()[this.f303n] = obj;
        return obj3;
    }
}
