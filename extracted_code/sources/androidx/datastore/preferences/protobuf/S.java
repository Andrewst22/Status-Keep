package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class S extends AbstractC0179b implements RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    public static final S f4201p = new S(new Object[0], 0, false);

    /* renamed from: n  reason: collision with root package name */
    public Object[] f4202n;

    /* renamed from: o  reason: collision with root package name */
    public int f4203o;

    public S(Object[] objArr, int i3, boolean z3) {
        this.f4226m = z3;
        this.f4202n = objArr;
        this.f4203o = i3;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i3 = this.f4203o;
        Object[] objArr = this.f4202n;
        if (i3 == objArr.length) {
            this.f4202n = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4202n;
        int i4 = this.f4203o;
        this.f4203o = i4 + 1;
        objArr2[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i3) {
        if (i3 >= 0 && i3 < this.f4203o) {
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f4203o);
    }

    public final S c(int i3) {
        if (i3 >= this.f4203o) {
            return new S(Arrays.copyOf(this.f4202n, i3), this.f4203o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        b(i3);
        return this.f4202n[i3];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0179b, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        int i4;
        a();
        b(i3);
        Object[] objArr = this.f4202n;
        Object obj = objArr[i3];
        if (i3 < this.f4203o - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (i4 - i3) - 1);
        }
        this.f4203o--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        a();
        b(i3);
        Object[] objArr = this.f4202n;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4203o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        a();
        if (i3 >= 0 && i3 <= (i4 = this.f4203o)) {
            Object[] objArr = this.f4202n;
            if (i4 < objArr.length) {
                System.arraycopy(objArr, i3, objArr, i3 + 1, i4 - i3);
            } else {
                Object[] objArr2 = new Object[((i4 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(this.f4202n, i3, objArr2, i3 + 1, this.f4203o - i3);
                this.f4202n = objArr2;
            }
            this.f4202n[i3] = obj;
            this.f4203o++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f4203o);
    }
}
