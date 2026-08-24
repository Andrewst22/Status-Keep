package j$.util.function;
/* loaded from: classes2.dex */
public interface Consumer<T> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Consumer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ java.util.function.Consumer f6825a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Consumer consumer) {
            this.f6825a = consumer;
        }

        public static /* synthetic */ Consumer convert(java.util.function.Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof Wrapper ? Consumer.this : new VivifiedWrapper(consumer);
        }

        @Override // j$.util.function.Consumer
        public final /* synthetic */ void accept(Object obj) {
            this.f6825a.accept(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.function.Consumer consumer = this.f6825a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f6825a;
            }
            return consumer.equals(obj);
        }

        @Override // j$.util.function.Consumer
        public final /* synthetic */ Consumer h(Consumer consumer) {
            return convert(this.f6825a.andThen(Wrapper.convert(consumer)));
        }

        public final /* synthetic */ int hashCode() {
            return this.f6825a.hashCode();
        }
    }

    /* loaded from: classes2.dex */
    public final /* synthetic */ class Wrapper implements java.util.function.Consumer {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.function.Consumer convert(Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof VivifiedWrapper ? ((VivifiedWrapper) consumer).f6825a : new Wrapper();
        }

        @Override // java.util.function.Consumer
        public final /* synthetic */ void accept(Object obj) {
            Consumer.this.accept(obj);
        }

        @Override // java.util.function.Consumer
        public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
            return convert(Consumer.this.h(VivifiedWrapper.convert(consumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            Consumer consumer = Consumer.this;
            if (obj instanceof Wrapper) {
                obj = Consumer.this;
            }
            return consumer.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return Consumer.this.hashCode();
        }
    }

    void accept(Object obj);

    Consumer h(Consumer consumer);
}
