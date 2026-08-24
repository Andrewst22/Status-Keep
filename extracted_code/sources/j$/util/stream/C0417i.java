package j$.util.stream;

import java.util.stream.Collector;
/* renamed from: j$.util.stream.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0417i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Collector f7180a;

    private /* synthetic */ C0417i(Collector collector) {
        this.f7180a = collector;
    }

    public static /* synthetic */ C0417i a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return new C0417i(collector);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f7180a;
        if (obj instanceof C0417i) {
            obj = ((C0417i) obj).f7180a;
        }
        return collector.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f7180a.hashCode();
    }
}
