package j$.util.stream;
/* loaded from: classes2.dex */
abstract class J0 implements H0 {

    /* renamed from: a  reason: collision with root package name */
    protected final H0 f6946a;

    /* renamed from: b  reason: collision with root package name */
    protected final H0 f6947b;

    /* renamed from: c  reason: collision with root package name */
    private final long f6948c;

    @Override // j$.util.stream.H0
    public final int o() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public J0(H0 h02, H0 h03) {
        this.f6946a = h02;
        this.f6947b = h03;
        this.f6948c = h02.count() + h03.count();
    }

    @Override // j$.util.stream.H0
    public final H0 c(int i3) {
        if (i3 == 0) {
            return this.f6946a;
        }
        if (i3 == 1) {
            return this.f6947b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H0
    public final long count() {
        return this.f6948c;
    }

    @Override // j$.util.stream.H0
    public /* bridge */ /* synthetic */ G0 c(int i3) {
        return (G0) c(i3);
    }
}
