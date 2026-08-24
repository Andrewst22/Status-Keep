package K1;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class p extends d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f781b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f782c;

    public p(int i3, Method method) {
        this.f781b = method;
        this.f782c = i3;
    }

    @Override // K1.d
    public final Object i(Class cls) {
        d.a(cls);
        return this.f781b.invoke(null, cls, Integer.valueOf(this.f782c));
    }
}
