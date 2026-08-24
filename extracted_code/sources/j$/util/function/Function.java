package j$.util.function;

import j$.util.function.UnaryOperator;
/* loaded from: classes2.dex */
public interface Function<T, R> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Function {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ java.util.function.Function f6830a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Function function) {
            this.f6830a = function;
        }

        public static /* synthetic */ Function convert(java.util.function.Function function) {
            if (function == null) {
                return null;
            }
            return function instanceof java.util.function.UnaryOperator ? UnaryOperator.VivifiedWrapper.convert((java.util.function.UnaryOperator) function) : new VivifiedWrapper(function);
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Object a(Object obj) {
            return this.f6830a.apply(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.function.Function function = this.f6830a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f6830a;
            }
            return function.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f6830a.hashCode();
        }
    }

    Object a(Object obj);
}
