package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.ArrayDeque;
/* renamed from: j$.util.stream.j1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0424j1 extends AbstractC0429k1 {
    @Override // j$.util.Spliterator
    public final boolean p(Consumer consumer) {
        H0 a3;
        if (e()) {
            boolean p3 = this.f7197d.p(consumer);
            if (!p3) {
                if (this.f7196c == null && (a3 = AbstractC0429k1.a(this.f7198e)) != null) {
                    Spliterator spliterator = a3.spliterator();
                    this.f7197d = spliterator;
                    return spliterator.p(consumer);
                }
                this.f7194a = null;
            }
            return p3;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void b(Consumer consumer) {
        if (this.f7194a == null) {
            return;
        }
        if (this.f7197d == null) {
            Spliterator spliterator = this.f7196c;
            if (spliterator == null) {
                ArrayDeque d3 = d();
                while (true) {
                    H0 a3 = AbstractC0429k1.a(d3);
                    if (a3 != null) {
                        a3.b(consumer);
                    } else {
                        this.f7194a = null;
                        return;
                    }
                }
            } else {
                spliterator.b(consumer);
            }
        } else {
            do {
            } while (p(consumer));
        }
    }
}
