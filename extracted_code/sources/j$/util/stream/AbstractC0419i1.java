package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
/* renamed from: j$.util.stream.i1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0419i1 extends AbstractC0429k1 implements j$.util.H {
    @Override // j$.util.H
    /* renamed from: tryAdvance */
    public final boolean m(Object obj) {
        G0 g02;
        if (e()) {
            boolean tryAdvance = ((j$.util.H) this.f7197d).tryAdvance(obj);
            if (!tryAdvance) {
                if (this.f7196c == null && (g02 = (G0) AbstractC0429k1.a(this.f7198e)) != null) {
                    j$.util.H spliterator = g02.spliterator();
                    this.f7197d = spliterator;
                    return spliterator.tryAdvance(obj);
                }
                this.f7194a = null;
            }
            return tryAdvance;
        }
        return false;
    }

    @Override // j$.util.H
    /* renamed from: forEachRemaining */
    public final void o(Object obj) {
        if (this.f7194a == null) {
            return;
        }
        if (this.f7197d == null) {
            Spliterator spliterator = this.f7196c;
            if (spliterator == null) {
                ArrayDeque d3 = d();
                while (true) {
                    G0 g02 = (G0) AbstractC0429k1.a(d3);
                    if (g02 != null) {
                        g02.j(obj);
                    } else {
                        this.f7194a = null;
                        return;
                    }
                }
            } else {
                ((j$.util.H) spliterator).forEachRemaining(obj);
            }
        } else {
            do {
            } while (m(obj));
        }
    }
}
