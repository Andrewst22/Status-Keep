package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.concurrent.CountedCompleter;
/* renamed from: j$.util.stream.s1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0468s1 extends CountedCompleter implements InterfaceC0440m2 {

    /* renamed from: a  reason: collision with root package name */
    protected final Spliterator f7249a;

    /* renamed from: b  reason: collision with root package name */
    protected final AbstractC0382b f7250b;

    /* renamed from: c  reason: collision with root package name */
    protected final long f7251c;

    /* renamed from: d  reason: collision with root package name */
    protected long f7252d;

    /* renamed from: e  reason: collision with root package name */
    protected long f7253e;

    /* renamed from: f  reason: collision with root package name */
    protected int f7254f;

    /* renamed from: g  reason: collision with root package name */
    protected int f7255g;

    abstract AbstractC0468s1 b(Spliterator spliterator, long j3, long j4);

    public /* synthetic */ void d(double d3) {
        AbstractC0482v0.a();
        throw null;
    }

    public /* synthetic */ void e(int i3) {
        AbstractC0482v0.k();
        throw null;
    }

    public /* synthetic */ void f(long j3) {
        AbstractC0482v0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void r() {
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ boolean v() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0468s1(Spliterator spliterator, AbstractC0382b abstractC0382b, int i3) {
        this.f7249a = spliterator;
        this.f7250b = abstractC0382b;
        this.f7251c = AbstractC0397e.g(spliterator.estimateSize());
        this.f7252d = 0L;
        this.f7253e = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0468s1(AbstractC0468s1 abstractC0468s1, Spliterator spliterator, long j3, long j4, int i3) {
        super(abstractC0468s1);
        this.f7249a = spliterator;
        this.f7250b = abstractC0468s1.f7250b;
        this.f7251c = abstractC0468s1.f7251c;
        this.f7252d = j3;
        this.f7253e = j4;
        if (j3 < 0 || j4 < 0 || (j3 + j4) - 1 >= i3) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j3), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i3)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f7249a;
        AbstractC0468s1 abstractC0468s1 = this;
        while (spliterator.estimateSize() > abstractC0468s1.f7251c && (trySplit = spliterator.trySplit()) != null) {
            abstractC0468s1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            abstractC0468s1.b(trySplit, abstractC0468s1.f7252d, estimateSize).fork();
            abstractC0468s1 = abstractC0468s1.b(spliterator, abstractC0468s1.f7252d + estimateSize, abstractC0468s1.f7253e - estimateSize);
        }
        abstractC0468s1.f7250b.Z(spliterator, abstractC0468s1);
        abstractC0468s1.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        long j4 = this.f7253e;
        if (j3 > j4) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i3 = (int) this.f7252d;
        this.f7254f = i3;
        this.f7255g = i3 + ((int) j4);
    }
}
