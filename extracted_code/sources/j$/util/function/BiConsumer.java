package j$.util.function;
/* loaded from: classes2.dex */
public interface BiConsumer<T, U> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiConsumer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ java.util.function.BiConsumer f6822a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiConsumer biConsumer) {
            this.f6822a = biConsumer;
        }

        public static /* synthetic */ BiConsumer convert(java.util.function.BiConsumer biConsumer) {
            if (biConsumer == null) {
                return null;
            }
            return new VivifiedWrapper(biConsumer);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.function.BiConsumer biConsumer = this.f6822a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f6822a;
            }
            return biConsumer.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f6822a.hashCode();
        }

        @Override // j$.util.function.BiConsumer
        public final /* synthetic */ void u(Object obj, Object obj2) {
            this.f6822a.accept(obj, obj2);
        }
    }

    void u(Object obj, Object obj2);
}
