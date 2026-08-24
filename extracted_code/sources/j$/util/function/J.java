package j$.util.function;

import java.util.function.ObjLongConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class J implements K {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ObjLongConsumer f6833a;

    private /* synthetic */ J(ObjLongConsumer objLongConsumer) {
        this.f6833a = objLongConsumer;
    }

    public static /* synthetic */ J a(ObjLongConsumer objLongConsumer) {
        if (objLongConsumer == null) {
            return null;
        }
        return new J(objLongConsumer);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ObjLongConsumer objLongConsumer = this.f6833a;
        if (obj instanceof J) {
            obj = ((J) obj).f6833a;
        }
        return objLongConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6833a.hashCode();
    }

    @Override // j$.util.function.K
    public final /* synthetic */ void i(Object obj, long j3) {
        this.f6833a.accept(obj, j3);
    }
}
