package j$.util.concurrent;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements BiConsumer, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f6806a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6807b;

    public /* synthetic */ t(Object obj, Object obj2) {
        this.f6806a = obj;
        this.f6807b = obj2;
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        ((Consumer) this.f6806a).accept(obj);
        ((Consumer) this.f6807b).accept(obj);
    }

    @Override // j$.util.function.BiConsumer
    public void u(Object obj, Object obj2) {
        do {
            Object c3 = ((BiFunction) this.f6807b).c(obj, obj2);
            ConcurrentMap concurrentMap = (ConcurrentMap) this.f6806a;
            if (concurrentMap.replace(obj, obj2, c3)) {
                return;
            }
            obj2 = concurrentMap.get(obj);
        } while (obj2 != null);
    }
}
