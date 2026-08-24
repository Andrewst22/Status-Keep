package Y;

import o0.InterfaceC0700y;
/* renamed from: Y.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0143n implements C1.k {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3372m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f3373n;

    public /* synthetic */ C0143n(Object obj, int i3) {
        this.f3372m = i3;
        this.f3373n = obj;
    }

    @Override // C1.k
    public final Object get() {
        switch (this.f3372m) {
            case 0:
                return (InterfaceC0700y) this.f3373n;
            case 1:
                return Boolean.valueOf(((M) this.f3373n).L);
            default:
                try {
                    return (InterfaceC0700y) ((Class) this.f3373n).getConstructor(null).newInstance(null);
                } catch (Exception e2) {
                    throw new IllegalStateException(e2);
                }
        }
    }
}
