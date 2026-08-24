package o1;

import C2.l;
/* loaded from: classes.dex */
public final class h extends g {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8672a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8673b;

    /* renamed from: c  reason: collision with root package name */
    public final C0702a f8674c;

    public h(Object obj, int i3, C0702a c0702a) {
        D2.i.e(obj, "value");
        D2.h.r("verificationMode", i3);
        this.f8672a = obj;
        this.f8673b = i3;
        this.f8674c = c0702a;
    }

    @Override // o1.g
    public final Object a() {
        return this.f8672a;
    }

    @Override // o1.g
    public final g d(String str, l lVar) {
        Object obj = this.f8672a;
        if (((Boolean) lVar.b(obj)).booleanValue()) {
            return this;
        }
        return new f(obj, str, this.f8674c, this.f8673b);
    }
}
