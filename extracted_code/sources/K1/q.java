package K1;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class q extends d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f783b;

    public q(Method method) {
        this.f783b = method;
    }

    @Override // K1.d
    public final Object i(Class cls) {
        d.a(cls);
        return this.f783b.invoke(null, cls, Object.class);
    }
}
