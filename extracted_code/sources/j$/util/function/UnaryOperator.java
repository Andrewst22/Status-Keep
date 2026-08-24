package j$.util.function;
/* loaded from: classes2.dex */
public interface UnaryOperator<T> extends Function<T, T> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements UnaryOperator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ java.util.function.UnaryOperator f6839a;

        private /* synthetic */ VivifiedWrapper(java.util.function.UnaryOperator unaryOperator) {
            this.f6839a = unaryOperator;
        }

        public static /* synthetic */ UnaryOperator convert(java.util.function.UnaryOperator unaryOperator) {
            if (unaryOperator == null) {
                return null;
            }
            return new VivifiedWrapper(unaryOperator);
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Object a(Object obj) {
            return this.f6839a.apply(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.function.UnaryOperator unaryOperator = this.f6839a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f6839a;
            }
            return unaryOperator.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f6839a.hashCode();
        }
    }
}
