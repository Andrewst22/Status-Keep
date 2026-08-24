package j$.util.function;
/* loaded from: classes2.dex */
public interface IntFunction<R> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements IntFunction {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ java.util.function.IntFunction f6832a;

        private /* synthetic */ VivifiedWrapper(java.util.function.IntFunction intFunction) {
            this.f6832a = intFunction;
        }

        public static /* synthetic */ IntFunction convert(java.util.function.IntFunction intFunction) {
            if (intFunction == null) {
                return null;
            }
            return new VivifiedWrapper(intFunction);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.function.IntFunction intFunction = this.f6832a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f6832a;
            }
            return intFunction.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f6832a.hashCode();
        }

        @Override // j$.util.function.IntFunction
        public final /* synthetic */ Object j(int i3) {
            return this.f6832a.apply(i3);
        }
    }

    Object j(int i3);
}
