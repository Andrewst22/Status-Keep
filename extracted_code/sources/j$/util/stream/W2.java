package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class W2 extends AbstractC0392d implements Consumer, Iterable {

    /* renamed from: e  reason: collision with root package name */
    protected Object[] f7054e = new Object[1 << 4];

    /* renamed from: f  reason: collision with root package name */
    protected Object[][] f7055f;

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        b(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(long j3) {
        long length;
        Object[][] objArr;
        int i3;
        int i4 = this.f7139c;
        if (i4 == 0) {
            length = this.f7054e.length;
        } else {
            length = this.f7140d[i4] + this.f7055f[i4].length;
        }
        if (j3 > length) {
            if (this.f7055f == null) {
                Object[][] objArr2 = new Object[8];
                this.f7055f = objArr2;
                this.f7140d = new long[8];
                objArr2[0] = this.f7054e;
            }
            int i5 = i4 + 1;
            while (j3 > length) {
                Object[][] objArr3 = this.f7055f;
                if (i5 >= objArr3.length) {
                    int length2 = objArr3.length * 2;
                    this.f7055f = (Object[][]) Arrays.copyOf(objArr3, length2);
                    this.f7140d = Arrays.copyOf(this.f7140d, length2);
                }
                int i6 = this.f7137a;
                if (i5 != 0 && i5 != 1) {
                    i6 = Math.min((i6 + i5) - 1, 30);
                }
                int i7 = 1 << i6;
                this.f7055f[i5] = new Object[i7];
                long[] jArr = this.f7140d;
                jArr[i5] = jArr[i5 - 1] + objArr[i3].length;
                length += i7;
                i5++;
            }
        }
    }

    @Override // j$.util.stream.AbstractC0392d
    public final void clear() {
        Object[][] objArr = this.f7055f;
        if (objArr != null) {
            this.f7054e = objArr[0];
            int i3 = 0;
            while (true) {
                Object[] objArr2 = this.f7054e;
                if (i3 >= objArr2.length) {
                    break;
                }
                objArr2[i3] = null;
                i3++;
            }
            this.f7055f = null;
            this.f7140d = null;
        } else {
            for (int i4 = 0; i4 < this.f7138b; i4++) {
                this.f7054e[i4] = null;
            }
        }
        this.f7138b = 0;
        this.f7139c = 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.W.i(spliterator());
    }

    public void b(Consumer consumer) {
        for (int i3 = 0; i3 < this.f7139c; i3++) {
            for (Object obj : this.f7055f[i3]) {
                consumer.accept(obj);
            }
        }
        for (int i4 = 0; i4 < this.f7138b; i4++) {
            consumer.accept(this.f7054e[i4]);
        }
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i3 = this.f7138b;
        Object[] objArr = this.f7054e;
        if (i3 == objArr.length) {
            if (this.f7055f == null) {
                Object[][] objArr2 = new Object[8];
                this.f7055f = objArr2;
                this.f7140d = new long[8];
                objArr2[0] = objArr;
            }
            int i4 = this.f7139c;
            int i5 = i4 + 1;
            Object[][] objArr3 = this.f7055f;
            if (i5 >= objArr3.length || objArr3[i5] == null) {
                if (i4 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i4].length + this.f7140d[i4];
                }
                x(length + 1);
            }
            this.f7138b = 0;
            int i6 = this.f7139c + 1;
            this.f7139c = i6;
            this.f7054e = this.f7055f[i6];
        }
        Object[] objArr4 = this.f7054e;
        int i7 = this.f7138b;
        this.f7138b = i7 + 1;
        objArr4[i7] = obj;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        b(new C0377a(8, arrayList));
        String obj = arrayList.toString();
        return "SpinedBuffer:" + obj;
    }

    @Override // java.lang.Iterable
    public j$.util.Spliterator spliterator() {
        return new N2(this, 0, this.f7139c, 0, this.f7138b);
    }
}
