package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;
/* loaded from: classes2.dex */
final class P extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0382b f7005a;

    /* renamed from: b  reason: collision with root package name */
    private Spliterator f7006b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7007c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentHashMap f7008d;

    /* renamed from: e  reason: collision with root package name */
    private final O f7009e;

    /* renamed from: f  reason: collision with root package name */
    private final P f7010f;

    /* renamed from: g  reason: collision with root package name */
    private H0 f7011g;

    /* JADX INFO: Access modifiers changed from: protected */
    public P(AbstractC0382b abstractC0382b, Spliterator spliterator, O o3) {
        super(null);
        this.f7005a = abstractC0382b;
        this.f7006b = spliterator;
        this.f7007c = AbstractC0397e.g(spliterator.estimateSize());
        this.f7008d = new ConcurrentHashMap(Math.max(16, AbstractC0397e.b() << 1), 1);
        this.f7009e = o3;
        this.f7010f = null;
    }

    P(P p3, Spliterator spliterator, P p4) {
        super(p3);
        this.f7005a = p3.f7005a;
        this.f7006b = spliterator;
        this.f7007c = p3.f7007c;
        this.f7008d = p3.f7008d;
        this.f7009e = p3.f7009e;
        this.f7010f = p4;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f7006b;
        long j3 = this.f7007c;
        boolean z3 = false;
        P p3 = this;
        while (spliterator.estimateSize() > j3 && (trySplit = spliterator.trySplit()) != null) {
            P p4 = new P(p3, trySplit, p3.f7010f);
            P p5 = new P(p3, spliterator, p4);
            p3.addToPendingCount(1);
            p5.addToPendingCount(1);
            p3.f7008d.put(p4, p5);
            if (p3.f7010f != null) {
                p4.addToPendingCount(1);
                if (p3.f7008d.replace(p3.f7010f, p3, p4)) {
                    p3.addToPendingCount(-1);
                } else {
                    p4.addToPendingCount(-1);
                }
            }
            if (z3) {
                spliterator = trySplit;
                p3 = p4;
                p4 = p5;
            } else {
                p3 = p5;
            }
            z3 = !z3;
            p4.fork();
        }
        if (p3.getPendingCount() > 0) {
            C0457q c0457q = new C0457q(5);
            AbstractC0382b abstractC0382b = p3.f7005a;
            InterfaceC0502z0 R3 = abstractC0382b.R(abstractC0382b.K(spliterator), c0457q);
            p3.f7005a.Z(spliterator, R3);
            p3.f7011g = R3.a();
            p3.f7006b = null;
        }
        p3.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        H0 h02 = this.f7011g;
        if (h02 != null) {
            h02.b(this.f7009e);
            this.f7011g = null;
        } else {
            Spliterator spliterator = this.f7006b;
            if (spliterator != null) {
                this.f7005a.Z(spliterator, this.f7009e);
                this.f7006b = null;
            }
        }
        P p3 = (P) this.f7008d.remove(this);
        if (p3 != null) {
            p3.tryComplete();
        }
    }
}
