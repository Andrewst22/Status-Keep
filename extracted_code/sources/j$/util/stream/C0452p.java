package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.InterfaceC0348c;
/* renamed from: j$.util.stream.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0452p implements InterfaceC0348c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7222a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BiConsumer f7223b;

    public /* synthetic */ C0452p(BiConsumer biConsumer, int i3) {
        this.f7222a = i3;
        this.f7223b = biConsumer;
    }

    @Override // j$.util.function.BiFunction
    public final Object c(Object obj, Object obj2) {
        switch (this.f7222a) {
            case 0:
                this.f7223b.u(obj, obj2);
                return obj;
            case 1:
                this.f7223b.u(obj, obj2);
                return obj;
            default:
                this.f7223b.u(obj, obj2);
                return obj;
        }
    }
}
