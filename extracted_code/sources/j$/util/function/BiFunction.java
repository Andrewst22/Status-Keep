package j$.util.function;

import java.util.function.BinaryOperator;
/* loaded from: classes2.dex */
public interface BiFunction<T, U, R> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiFunction {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ java.util.function.BiFunction f6823a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.f6823a = biFunction;
        }

        public static /* synthetic */ BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return biFunction instanceof BinaryOperator ? C0347b.a((BinaryOperator) biFunction) : new VivifiedWrapper(biFunction);
        }

        @Override // j$.util.function.BiFunction
        public final /* synthetic */ Object c(Object obj, Object obj2) {
            return this.f6823a.apply(obj, obj2);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.function.BiFunction biFunction = this.f6823a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f6823a;
            }
            return biFunction.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f6823a.hashCode();
        }
    }

    Object c(Object obj, Object obj2);
}
