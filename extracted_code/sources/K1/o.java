package K1;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class o extends d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f779b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f780c;

    public o(Method method, Object obj) {
        this.f779b = method;
        this.f780c = obj;
    }

    @Override // K1.d
    public final Object i(Class cls) {
        d.a(cls);
        return this.f779b.invoke(this.f780c, cls);
    }
}
