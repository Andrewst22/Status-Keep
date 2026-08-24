package j$.util.stream;
/* renamed from: j$.util.stream.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0392d {

    /* renamed from: a  reason: collision with root package name */
    protected final int f7137a;

    /* renamed from: b  reason: collision with root package name */
    protected int f7138b;

    /* renamed from: c  reason: collision with root package name */
    protected int f7139c;

    /* renamed from: d  reason: collision with root package name */
    protected long[] f7140d;

    public abstract void clear();

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0392d() {
        this.f7137a = 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0392d(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i3);
        }
        this.f7137a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i3 - 1));
    }

    public final long count() {
        int i3 = this.f7139c;
        if (i3 == 0) {
            return this.f7138b;
        }
        return this.f7140d[i3] + this.f7138b;
    }
}
