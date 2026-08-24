package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class f implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4338a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final q f4339b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4340c;

    public f(DefaultLifecycleObserver defaultLifecycleObserver, p pVar) {
        D2.i.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f4339b = defaultLifecycleObserver;
        this.f4340c = pVar;
    }

    @Override // androidx.lifecycle.p
    public final void d(r rVar, k kVar) {
        switch (this.f4338a) {
            case 0:
                int i3 = e.f4337a[kVar.ordinal()];
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f4339b;
                switch (i3) {
                    case 1:
                        defaultLifecycleObserver.c(rVar);
                        break;
                    case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                        defaultLifecycleObserver.g(rVar);
                        break;
                    case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                        defaultLifecycleObserver.a();
                        break;
                    case N.k.LONG_FIELD_NUMBER /* 4 */:
                        defaultLifecycleObserver.e(rVar);
                        break;
                    case N.k.STRING_FIELD_NUMBER /* 5 */:
                        defaultLifecycleObserver.f(rVar);
                        break;
                    case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        defaultLifecycleObserver.b(rVar);
                        break;
                    case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                p pVar = (p) this.f4340c;
                if (pVar != null) {
                    pVar.d(rVar, kVar);
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0203a) this.f4340c).f4329a;
                q qVar = this.f4339b;
                C0203a.a((List) hashMap.get(kVar), rVar, kVar, qVar);
                C0203a.a((List) hashMap.get(k.ON_ANY), rVar, kVar, qVar);
                return;
        }
    }

    public f(q qVar) {
        this.f4339b = qVar;
        c cVar = c.f4333c;
        Class<?> cls = qVar.getClass();
        C0203a c0203a = (C0203a) cVar.f4334a.get(cls);
        this.f4340c = c0203a == null ? cVar.a(cls, null) : c0203a;
    }
}
