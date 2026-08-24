package j$.util.function;

import java.util.function.ObjIntConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class H implements I {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ObjIntConsumer f6831a;

    private /* synthetic */ H(ObjIntConsumer objIntConsumer) {
        this.f6831a = objIntConsumer;
    }

    public static /* synthetic */ H a(ObjIntConsumer objIntConsumer) {
        if (objIntConsumer == null) {
            return null;
        }
        return new H(objIntConsumer);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ObjIntConsumer objIntConsumer = this.f6831a;
        if (obj instanceof H) {
            obj = ((H) obj).f6831a;
        }
        return objIntConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6831a.hashCode();
    }

    @Override // j$.util.function.I
    public final /* synthetic */ void m(int i3, Object obj) {
        this.f6831a.accept(obj, i3);
    }
}
