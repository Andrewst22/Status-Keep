package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0386b3 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    final boolean f7114a;

    /* renamed from: b  reason: collision with root package name */
    final AbstractC0382b f7115b;

    /* renamed from: c  reason: collision with root package name */
    private j$.util.function.M f7116c;

    /* renamed from: d  reason: collision with root package name */
    Spliterator f7117d;

    /* renamed from: e  reason: collision with root package name */
    InterfaceC0440m2 f7118e;

    /* renamed from: f  reason: collision with root package name */
    C0377a f7119f;

    /* renamed from: g  reason: collision with root package name */
    long f7120g;

    /* renamed from: h  reason: collision with root package name */
    AbstractC0392d f7121h;

    /* renamed from: i  reason: collision with root package name */
    boolean f7122i;

    abstract void f();

    abstract AbstractC0386b3 h(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i3) {
        return AbstractC0340b.h(this, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0386b3(AbstractC0382b abstractC0382b, j$.util.function.M m3, boolean z3) {
        this.f7115b = abstractC0382b;
        this.f7116c = m3;
        this.f7117d = null;
        this.f7114a = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0386b3(AbstractC0382b abstractC0382b, Spliterator spliterator, boolean z3) {
        this.f7115b = abstractC0382b;
        this.f7116c = null;
        this.f7117d = spliterator;
        this.f7114a = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (this.f7117d == null) {
            this.f7117d = (Spliterator) this.f7116c.get();
            this.f7116c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        AbstractC0392d abstractC0392d = this.f7121h;
        if (abstractC0392d == null) {
            if (this.f7122i) {
                return false;
            }
            e();
            f();
            this.f7120g = 0L;
            this.f7118e.s(this.f7117d.getExactSizeIfKnown());
            return d();
        }
        long j3 = this.f7120g + 1;
        this.f7120g = j3;
        boolean z3 = j3 < abstractC0392d.count();
        if (z3) {
            return z3;
        }
        this.f7120g = 0L;
        this.f7121h.clear();
        return d();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (this.f7114a && this.f7121h == null && !this.f7122i) {
            e();
            Spliterator trySplit = this.f7117d.trySplit();
            if (trySplit == null) {
                return null;
            }
            return h(trySplit);
        }
        return null;
    }

    private boolean d() {
        boolean p3;
        while (this.f7121h.count() == 0) {
            if (!this.f7118e.v()) {
                C0377a c0377a = this.f7119f;
                switch (c0377a.f7092a) {
                    case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                        C0431k3 c0431k3 = (C0431k3) c0377a.f7093b;
                        p3 = c0431k3.f7117d.p(c0431k3.f7118e);
                        break;
                    case N.k.LONG_FIELD_NUMBER /* 4 */:
                        C0441m3 c0441m3 = (C0441m3) c0377a.f7093b;
                        p3 = c0441m3.f7117d.p(c0441m3.f7118e);
                        break;
                    case N.k.STRING_FIELD_NUMBER /* 5 */:
                        C0451o3 c0451o3 = (C0451o3) c0377a.f7093b;
                        p3 = c0451o3.f7117d.p(c0451o3.f7118e);
                        break;
                    default:
                        D3 d3 = (D3) c0377a.f7093b;
                        p3 = d3.f7117d.p(d3.f7118e);
                        break;
                }
                if (p3) {
                    continue;
                }
            }
            if (this.f7122i) {
                return false;
            }
            this.f7118e.r();
            this.f7122i = true;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        e();
        return this.f7117d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        e();
        if (Z2.SIZED.r(this.f7115b.O())) {
            return this.f7117d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        e();
        int A3 = Z2.A(this.f7115b.O()) & Z2.f7070f;
        return (A3 & 64) != 0 ? (A3 & (-16449)) | (this.f7117d.characteristics() & 16448) : A3;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC0340b.h(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f7117d);
    }
}
