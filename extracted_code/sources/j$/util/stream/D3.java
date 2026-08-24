package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Objects;
/* loaded from: classes2.dex */
final class D3 extends AbstractC0386b3 {
    @Override // j$.util.stream.AbstractC0386b3
    final AbstractC0386b3 h(Spliterator spliterator) {
        return new AbstractC0386b3(this.f7115b, spliterator, this.f7114a);
    }

    @Override // j$.util.stream.AbstractC0386b3
    final void f() {
        W2 w22 = new W2();
        this.f7121h = w22;
        this.f7118e = this.f7115b.a0(new C3(w22, 0));
        this.f7119f = new C0377a(6, this);
    }

    @Override // j$.util.Spliterator
    public final boolean p(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a3 = a();
        if (a3) {
            W2 w22 = (W2) this.f7121h;
            long j3 = this.f7120g;
            if (w22.f7139c == 0) {
                if (j3 < w22.f7138b) {
                    obj = w22.f7054e[(int) j3];
                } else {
                    throw new IndexOutOfBoundsException(Long.toString(j3));
                }
            } else if (j3 >= w22.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j3));
            } else {
                for (int i3 = 0; i3 <= w22.f7139c; i3++) {
                    long j4 = w22.f7140d[i3];
                    Object[] objArr = w22.f7055f[i3];
                    if (j3 < objArr.length + j4) {
                        obj = objArr[(int) (j3 - j4)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j3));
            }
            consumer.accept(obj);
        }
        return a3;
    }

    @Override // j$.util.Spliterator
    public final void b(Consumer consumer) {
        if (this.f7121h == null && !this.f7122i) {
            Objects.requireNonNull(consumer);
            e();
            C3 c3 = new C3(consumer, 1);
            this.f7115b.Z(this.f7117d, c3);
            this.f7122i = true;
            return;
        }
        do {
        } while (p(consumer));
    }
}
