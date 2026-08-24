package j$.util.function;
/* loaded from: classes2.dex */
public interface Predicate<T> {

    /* loaded from: classes2.dex */
    public final /* synthetic */ class VivifiedWrapper implements Predicate {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ java.util.function.Predicate f6837a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Predicate predicate) {
            this.f6837a = predicate;
        }

        public static /* synthetic */ Predicate convert(java.util.function.Predicate predicate) {
            if (predicate == null) {
                return null;
            }
            return new VivifiedWrapper(predicate);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.function.Predicate predicate = this.f6837a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f6837a;
            }
            return predicate.equals(obj);
        }

        @Override // j$.util.function.Predicate
        public final /* synthetic */ boolean g(Object obj) {
            return this.f6837a.test(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f6837a.hashCode();
        }
    }

    boolean g(Object obj);
}
