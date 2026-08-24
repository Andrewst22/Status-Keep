package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
/* loaded from: classes2.dex */
abstract class V2 extends AbstractC0392d implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    Object f7047e;

    /* renamed from: f  reason: collision with root package name */
    Object[] f7048f;

    protected abstract Object[] B();

    public abstract Object g(int i3);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void x(Object obj, int i3, int i4, Object obj2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int y(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public V2(int i3) {
        super(i3);
        this.f7047e = g(1 << this.f7137a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V2() {
        this.f7047e = g(16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(long j3) {
        long y3;
        int i3;
        int i4 = this.f7139c;
        if (i4 == 0) {
            y3 = y(this.f7047e);
        } else {
            y3 = y(this.f7048f[i4]) + this.f7140d[i4];
        }
        if (j3 > y3) {
            if (this.f7048f == null) {
                Object[] B3 = B();
                this.f7048f = B3;
                this.f7140d = new long[8];
                B3[0] = this.f7047e;
            }
            int i5 = this.f7139c + 1;
            while (j3 > y3) {
                Object[] objArr = this.f7048f;
                if (i5 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f7048f = Arrays.copyOf(objArr, length);
                    this.f7140d = Arrays.copyOf(this.f7140d, length);
                }
                int i6 = this.f7137a;
                if (i5 != 0 && i5 != 1) {
                    i6 = Math.min((i6 + i5) - 1, 30);
                }
                int i7 = 1 << i6;
                this.f7048f[i5] = g(i7);
                long[] jArr = this.f7140d;
                jArr[i5] = jArr[i5 - 1] + y(this.f7048f[i3]);
                y3 += i7;
                i5++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int z(long j3) {
        if (this.f7139c == 0) {
            if (j3 < this.f7138b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j3));
        } else if (j3 >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j3));
        } else {
            for (int i3 = 0; i3 <= this.f7139c; i3++) {
                if (j3 < this.f7140d[i3] + y(this.f7048f[i3])) {
                    return i3;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j3));
        }
    }

    public void u(int i3, Object obj) {
        long j3 = i3;
        long count = count() + j3;
        if (count > y(obj) || count < j3) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f7139c == 0) {
            System.arraycopy(this.f7047e, 0, obj, i3, this.f7138b);
            return;
        }
        for (int i4 = 0; i4 < this.f7139c; i4++) {
            Object obj2 = this.f7048f[i4];
            System.arraycopy(obj2, 0, obj, i3, y(obj2));
            i3 += y(this.f7048f[i4]);
        }
        int i5 = this.f7138b;
        if (i5 > 0) {
            System.arraycopy(this.f7047e, 0, obj, i3, i5);
        }
    }

    public Object i() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object g3 = g((int) count);
        u(0, g3);
        return g3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C() {
        long y3;
        if (this.f7138b == y(this.f7047e)) {
            if (this.f7048f == null) {
                Object[] B3 = B();
                this.f7048f = B3;
                this.f7140d = new long[8];
                B3[0] = this.f7047e;
            }
            int i3 = this.f7139c;
            int i4 = i3 + 1;
            Object[] objArr = this.f7048f;
            if (i4 >= objArr.length || objArr[i4] == null) {
                if (i3 == 0) {
                    y3 = y(this.f7047e);
                } else {
                    y3 = y(objArr[i3]) + this.f7140d[i3];
                }
                A(y3 + 1);
            }
            this.f7138b = 0;
            int i5 = this.f7139c + 1;
            this.f7139c = i5;
            this.f7047e = this.f7048f[i5];
        }
    }

    @Override // j$.util.stream.AbstractC0392d
    public final void clear() {
        Object[] objArr = this.f7048f;
        if (objArr != null) {
            this.f7047e = objArr[0];
            this.f7048f = null;
            this.f7140d = null;
        }
        this.f7138b = 0;
        this.f7139c = 0;
    }

    public void j(Object obj) {
        for (int i3 = 0; i3 < this.f7139c; i3++) {
            Object obj2 = this.f7048f[i3];
            x(obj2, 0, y(obj2), obj);
        }
        x(this.f7047e, 0, this.f7138b, obj);
    }
}
