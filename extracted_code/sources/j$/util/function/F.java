package j$.util.function;

import java.util.function.ObjDoubleConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class F implements G {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ObjDoubleConsumer f6829a;

    private /* synthetic */ F(ObjDoubleConsumer objDoubleConsumer) {
        this.f6829a = objDoubleConsumer;
    }

    public static /* synthetic */ F b(ObjDoubleConsumer objDoubleConsumer) {
        if (objDoubleConsumer == null) {
            return null;
        }
        return new F(objDoubleConsumer);
    }

    @Override // j$.util.function.G
    public final /* synthetic */ void a(Object obj, double d3) {
        this.f6829a.accept(obj, d3);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ObjDoubleConsumer objDoubleConsumer = this.f6829a;
        if (obj instanceof F) {
            obj = ((F) obj).f6829a;
        }
        return objDoubleConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6829a.hashCode();
    }
}
