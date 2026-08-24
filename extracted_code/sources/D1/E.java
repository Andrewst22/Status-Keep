package D1;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class E extends AbstractC0034m implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final Object f189m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f190n;

    public E(Object obj, Object obj2) {
        this.f189m = obj;
        this.f190n = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f189m;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f190n;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
