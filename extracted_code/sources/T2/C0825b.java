package t2;

import j$.lang.Iterable$CC;
import j$.util.AbstractC0340b;
import j$.util.Collection$CC;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import j$.util.stream.AbstractC0482v0;
import j$.util.stream.Stream;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SequencedCollection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
/* renamed from: t2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825b extends AbstractList implements List, java.util.List {

    /* renamed from: p  reason: collision with root package name */
    public static final Object[] f9259p = new Object[0];

    /* renamed from: m  reason: collision with root package name */
    public int f9260m;

    /* renamed from: n  reason: collision with root package name */
    public Object[] f9261n = f9259p;

    /* renamed from: o  reason: collision with root package name */
    public int f9262o;

    public final void a(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f9261n.length;
        while (i3 < length && it.hasNext()) {
            this.f9261n[i3] = it.next();
            i3++;
        }
        int i4 = this.f9260m;
        for (int i5 = 0; i5 < i4 && it.hasNext(); i5++) {
            this.f9261n[i5] = it.next();
        }
        this.f9262o = collection.size() + this.f9262o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        int i5 = this.f9262o;
        if (i3 < 0 || i3 > i5) {
            throw new IndexOutOfBoundsException(D2.h.j(i3, i5, "index: ", ", size: "));
        }
        if (i3 == i5) {
            addLast(obj);
        } else if (i3 == 0) {
            addFirst(obj);
        } else {
            g();
            b(this.f9262o + 1);
            int f3 = f(this.f9260m + i3);
            int i6 = this.f9262o;
            if (i3 < ((i6 + 1) >> 1)) {
                if (f3 == 0) {
                    Object[] objArr = this.f9261n;
                    D2.i.e(objArr, "<this>");
                    f3 = objArr.length;
                }
                int i7 = f3 - 1;
                int i8 = this.f9260m;
                if (i8 == 0) {
                    Object[] objArr2 = this.f9261n;
                    D2.i.e(objArr2, "<this>");
                    i4 = objArr2.length - 1;
                } else {
                    i4 = i8 - 1;
                }
                int i9 = this.f9260m;
                if (i7 >= i9) {
                    Object[] objArr3 = this.f9261n;
                    objArr3[i4] = objArr3[i9];
                    AbstractC0826c.A(i9, i9 + 1, i7 + 1, objArr3, objArr3);
                } else {
                    Object[] objArr4 = this.f9261n;
                    AbstractC0826c.A(i9 - 1, i9, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f9261n;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    AbstractC0826c.A(0, 1, i7 + 1, objArr5, objArr5);
                }
                this.f9261n[i7] = obj;
                this.f9260m = i4;
            } else {
                int f4 = f(this.f9260m + i6);
                if (f3 < f4) {
                    Object[] objArr6 = this.f9261n;
                    AbstractC0826c.A(f3 + 1, f3, f4, objArr6, objArr6);
                } else {
                    Object[] objArr7 = this.f9261n;
                    AbstractC0826c.A(1, 0, f4, objArr7, objArr7);
                    Object[] objArr8 = this.f9261n;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    AbstractC0826c.A(f3 + 1, f3, objArr8.length - 1, objArr8, objArr8);
                }
                this.f9261n[f3] = obj;
            }
            this.f9262o++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        D2.i.e(collection, "elements");
        int i4 = this.f9262o;
        if (i3 >= 0 && i3 <= i4) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i3 == this.f9262o) {
                return addAll(collection);
            }
            g();
            b(collection.size() + this.f9262o);
            int f3 = f(this.f9260m + this.f9262o);
            int f4 = f(this.f9260m + i3);
            int size = collection.size();
            if (i3 < ((this.f9262o + 1) >> 1)) {
                int i5 = this.f9260m;
                int i6 = i5 - size;
                if (f4 < i5) {
                    Object[] objArr = this.f9261n;
                    AbstractC0826c.A(i6, i5, objArr.length, objArr, objArr);
                    if (size >= f4) {
                        Object[] objArr2 = this.f9261n;
                        AbstractC0826c.A(objArr2.length - size, 0, f4, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f9261n;
                        AbstractC0826c.A(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f9261n;
                        AbstractC0826c.A(0, size, f4, objArr4, objArr4);
                    }
                } else if (i6 >= 0) {
                    Object[] objArr5 = this.f9261n;
                    AbstractC0826c.A(i6, i5, f4, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f9261n;
                    i6 += objArr6.length;
                    int i7 = f4 - i5;
                    int length = objArr6.length - i6;
                    if (length >= i7) {
                        AbstractC0826c.A(i6, i5, f4, objArr6, objArr6);
                    } else {
                        AbstractC0826c.A(i6, i5, i5 + length, objArr6, objArr6);
                        Object[] objArr7 = this.f9261n;
                        AbstractC0826c.A(0, this.f9260m + length, f4, objArr7, objArr7);
                    }
                }
                this.f9260m = i6;
                a(d(f4 - size), collection);
            } else {
                int i8 = f4 + size;
                if (f4 < f3) {
                    int i9 = size + f3;
                    Object[] objArr8 = this.f9261n;
                    if (i9 <= objArr8.length) {
                        AbstractC0826c.A(i8, f4, f3, objArr8, objArr8);
                    } else if (i8 >= objArr8.length) {
                        AbstractC0826c.A(i8 - objArr8.length, f4, f3, objArr8, objArr8);
                    } else {
                        int length2 = f3 - (i9 - objArr8.length);
                        AbstractC0826c.A(0, length2, f3, objArr8, objArr8);
                        Object[] objArr9 = this.f9261n;
                        AbstractC0826c.A(i8, f4, length2, objArr9, objArr9);
                    }
                } else {
                    Object[] objArr10 = this.f9261n;
                    AbstractC0826c.A(size, 0, f3, objArr10, objArr10);
                    Object[] objArr11 = this.f9261n;
                    if (i8 >= objArr11.length) {
                        AbstractC0826c.A(i8 - objArr11.length, f4, objArr11.length, objArr11, objArr11);
                    } else {
                        AbstractC0826c.A(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                        Object[] objArr12 = this.f9261n;
                        AbstractC0826c.A(i8, f4, objArr12.length - size, objArr12, objArr12);
                    }
                }
                a(f4, collection);
            }
            return true;
        }
        throw new IndexOutOfBoundsException(D2.h.j(i3, i4, "index: ", ", size: "));
    }

    public final void addFirst(Object obj) {
        g();
        b(this.f9262o + 1);
        int i3 = this.f9260m;
        if (i3 == 0) {
            Object[] objArr = this.f9261n;
            D2.i.e(objArr, "<this>");
            i3 = objArr.length;
        }
        int i4 = i3 - 1;
        this.f9260m = i4;
        this.f9261n[i4] = obj;
        this.f9262o++;
    }

    public final void addLast(Object obj) {
        g();
        b(this.f9262o + 1);
        this.f9261n[f(this.f9260m + this.f9262o)] = obj;
        this.f9262o++;
    }

    public final void b(int i3) {
        if (i3 >= 0) {
            Object[] objArr = this.f9261n;
            if (i3 <= objArr.length) {
                return;
            }
            if (objArr == f9259p) {
                if (i3 < 10) {
                    i3 = 10;
                }
                this.f9261n = new Object[i3];
                return;
            }
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                if (i3 > 2147483639) {
                    i4 = Integer.MAX_VALUE;
                } else {
                    i4 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i4];
            AbstractC0826c.A(0, this.f9260m, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.f9261n;
            int length2 = objArr3.length;
            int i5 = this.f9260m;
            AbstractC0826c.A(length2 - i5, 0, i5, objArr3, objArr2);
            this.f9260m = 0;
            this.f9261n = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int c(int i3) {
        Object[] objArr = this.f9261n;
        D2.i.e(objArr, "<this>");
        if (i3 == objArr.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.f9260m, f(this.f9260m + this.f9262o));
        }
        this.f9260m = 0;
        this.f9262o = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int d(int i3) {
        if (i3 < 0) {
            return i3 + this.f9261n.length;
        }
        return i3;
    }

    public final void e(int i3, int i4) {
        if (i3 < i4) {
            Object[] objArr = this.f9261n;
            D2.i.e(objArr, "<this>");
            Arrays.fill(objArr, i3, i4, (Object) null);
            return;
        }
        Object[] objArr2 = this.f9261n;
        Arrays.fill(objArr2, i3, objArr2.length, (Object) null);
        Object[] objArr3 = this.f9261n;
        D2.i.e(objArr3, "<this>");
        Arrays.fill(objArr3, 0, i4, (Object) null);
    }

    public final int f(int i3) {
        Object[] objArr = this.f9261n;
        if (i3 >= objArr.length) {
            return i3 - objArr.length;
        }
        return i3;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final void g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int i4 = this.f9262o;
        if (i3 >= 0 && i3 < i4) {
            return this.f9261n[f(this.f9260m + i3)];
        }
        throw new IndexOutOfBoundsException(D2.h.j(i3, i4, "index: ", ", size: "));
    }

    public final /* synthetic */ Object getFirst() {
        return List.CC.$default$getFirst(this);
    }

    public final /* synthetic */ Object getLast() {
        return List.CC.$default$getLast(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i3;
        int f3 = f(this.f9260m + this.f9262o);
        int i4 = this.f9260m;
        if (i4 < f3) {
            while (i4 < f3) {
                if (D2.i.a(obj, this.f9261n[i4])) {
                    i3 = this.f9260m;
                } else {
                    i4++;
                }
            }
            return -1;
        } else if (i4 >= f3) {
            int length = this.f9261n.length;
            while (true) {
                if (i4 < length) {
                    if (D2.i.a(obj, this.f9261n[i4])) {
                        i3 = this.f9260m;
                        break;
                    }
                    i4++;
                } else {
                    for (int i5 = 0; i5 < f3; i5++) {
                        if (D2.i.a(obj, this.f9261n[i5])) {
                            i4 = i5 + this.f9261n.length;
                            i3 = this.f9260m;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i4 - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.f9262o == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i3;
        int f3 = f(this.f9260m + this.f9262o);
        int i4 = this.f9260m;
        if (i4 < f3) {
            length = f3 - 1;
            if (i4 <= length) {
                while (!D2.i.a(obj, this.f9261n[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i3 = this.f9260m;
                return length - i3;
            }
            return -1;
        }
        if (i4 > f3) {
            int i5 = f3 - 1;
            while (true) {
                if (-1 < i5) {
                    if (D2.i.a(obj, this.f9261n[i5])) {
                        length = i5 + this.f9261n.length;
                        i3 = this.f9260m;
                        break;
                    }
                    i5--;
                } else {
                    Object[] objArr = this.f9261n;
                    D2.i.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i6 = this.f9260m;
                    if (i6 <= length) {
                        while (!D2.i.a(obj, this.f9261n[length])) {
                            if (length != i6) {
                                length--;
                            }
                        }
                        i3 = this.f9260m;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        j$.util.stream.Stream e02;
        e02 = AbstractC0482v0.e0(AbstractC0340b.w(this), true);
        return Stream.Wrapper.convert(e02);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        int i4 = this.f9262o;
        if (i3 >= 0 && i3 < i4) {
            if (i3 == AbstractC0828e.B(this)) {
                return removeLast();
            }
            if (i3 == 0) {
                return removeFirst();
            }
            g();
            int f3 = f(this.f9260m + i3);
            Object[] objArr = this.f9261n;
            Object obj = objArr[f3];
            if (i3 < (this.f9262o >> 1)) {
                int i5 = this.f9260m;
                if (f3 >= i5) {
                    AbstractC0826c.A(i5 + 1, i5, f3, objArr, objArr);
                } else {
                    AbstractC0826c.A(1, 0, f3, objArr, objArr);
                    Object[] objArr2 = this.f9261n;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i6 = this.f9260m;
                    AbstractC0826c.A(i6 + 1, i6, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f9261n;
                int i7 = this.f9260m;
                objArr3[i7] = null;
                this.f9260m = c(i7);
            } else {
                int f4 = f(AbstractC0828e.B(this) + this.f9260m);
                if (f3 <= f4) {
                    Object[] objArr4 = this.f9261n;
                    AbstractC0826c.A(f3, f3 + 1, f4 + 1, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.f9261n;
                    AbstractC0826c.A(f3, f3 + 1, objArr5.length, objArr5, objArr5);
                    Object[] objArr6 = this.f9261n;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    AbstractC0826c.A(0, 1, f4 + 1, objArr6, objArr6);
                }
                this.f9261n[f4] = null;
            }
            this.f9262o--;
            return obj;
        }
        throw new IndexOutOfBoundsException(D2.h.j(i3, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int f3;
        D2.i.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f9261n.length != 0) {
            int f4 = f(this.f9260m + this.f9262o);
            int i3 = this.f9260m;
            if (i3 < f4) {
                f3 = i3;
                while (i3 < f4) {
                    Object obj = this.f9261n[i3];
                    if (!collection.contains(obj)) {
                        this.f9261n[f3] = obj;
                        f3++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                Object[] objArr = this.f9261n;
                D2.i.e(objArr, "<this>");
                Arrays.fill(objArr, f3, f4, (Object) null);
            } else {
                int length = this.f9261n.length;
                int i4 = i3;
                boolean z4 = false;
                while (i3 < length) {
                    Object[] objArr2 = this.f9261n;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj2)) {
                        this.f9261n[i4] = obj2;
                        i4++;
                    } else {
                        z4 = true;
                    }
                    i3++;
                }
                f3 = f(i4);
                for (int i5 = 0; i5 < f4; i5++) {
                    Object[] objArr3 = this.f9261n;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (!collection.contains(obj3)) {
                        this.f9261n[f3] = obj3;
                        f3 = c(f3);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                g();
                this.f9262o = d(f3 - this.f9260m);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            g();
            Object[] objArr = this.f9261n;
            int i3 = this.f9260m;
            Object obj = objArr[i3];
            objArr[i3] = null;
            this.f9260m = c(i3);
            this.f9262o--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection$CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            g();
            int f3 = f(AbstractC0828e.B(this) + this.f9260m);
            Object[] objArr = this.f9261n;
            Object obj = objArr[f3];
            objArr[f3] = null;
            this.f9262o--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i4) {
        int i5 = this.f9262o;
        if (i3 >= 0 && i4 <= i5) {
            if (i3 <= i4) {
                int i6 = i4 - i3;
                if (i6 == 0) {
                    return;
                }
                if (i6 == this.f9262o) {
                    clear();
                    return;
                } else if (i6 == 1) {
                    remove(i3);
                    return;
                } else {
                    g();
                    if (i3 < this.f9262o - i4) {
                        int f3 = f((i3 - 1) + this.f9260m);
                        int f4 = f((i4 - 1) + this.f9260m);
                        while (i3 > 0) {
                            int i7 = f3 + 1;
                            int min = Math.min(i3, Math.min(i7, f4 + 1));
                            Object[] objArr = this.f9261n;
                            int i8 = f4 - min;
                            int i9 = f3 - min;
                            AbstractC0826c.A(i8 + 1, i9 + 1, i7, objArr, objArr);
                            f3 = d(i9);
                            f4 = d(i8);
                            i3 -= min;
                        }
                        int f5 = f(this.f9260m + i6);
                        e(this.f9260m, f5);
                        this.f9260m = f5;
                    } else {
                        int f6 = f(this.f9260m + i4);
                        int f7 = f(this.f9260m + i3);
                        int i10 = this.f9262o;
                        while (true) {
                            i10 -= i4;
                            if (i10 <= 0) {
                                break;
                            }
                            Object[] objArr2 = this.f9261n;
                            i4 = Math.min(i10, Math.min(objArr2.length - f6, objArr2.length - f7));
                            Object[] objArr3 = this.f9261n;
                            int i11 = f6 + i4;
                            AbstractC0826c.A(f7, f6, i11, objArr3, objArr3);
                            f6 = f(i11);
                            f7 = f(f7 + i4);
                        }
                        int f8 = f(this.f9260m + this.f9262o);
                        e(d(f8 - i6), f8);
                    }
                    this.f9262o -= i6;
                    return;
                }
            }
            throw new IllegalArgumentException(D2.h.j(i3, i4, "fromIndex: ", " > toIndex: "));
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
    }

    @Override // java.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, UnaryOperator.VivifiedWrapper.convert(unaryOperator));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int f3;
        D2.i.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f9261n.length != 0) {
            int f4 = f(this.f9260m + this.f9262o);
            int i3 = this.f9260m;
            if (i3 < f4) {
                f3 = i3;
                while (i3 < f4) {
                    Object obj = this.f9261n[i3];
                    if (collection.contains(obj)) {
                        this.f9261n[f3] = obj;
                        f3++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                Object[] objArr = this.f9261n;
                D2.i.e(objArr, "<this>");
                Arrays.fill(objArr, f3, f4, (Object) null);
            } else {
                int length = this.f9261n.length;
                int i4 = i3;
                boolean z4 = false;
                while (i3 < length) {
                    Object[] objArr2 = this.f9261n;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        this.f9261n[i4] = obj2;
                        i4++;
                    } else {
                        z4 = true;
                    }
                    i3++;
                }
                f3 = f(i4);
                for (int i5 = 0; i5 < f4; i5++) {
                    Object[] objArr3 = this.f9261n;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        this.f9261n[f3] = obj3;
                        f3 = c(f3);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                g();
                this.f9262o = d(f3 - this.f9260m);
            }
        }
        return z3;
    }

    public final /* synthetic */ java.util.List reversed() {
        return List.CC.$default$reversed(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        int i4 = this.f9262o;
        if (i3 >= 0 && i3 < i4) {
            int f3 = f(this.f9260m + i3);
            Object[] objArr = this.f9261n;
            Object obj2 = objArr[f3];
            objArr[f3] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(D2.h.j(i3, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9262o;
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(List.CC.$default$spliterator(this));
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        j$.util.stream.Stream e02;
        e02 = AbstractC0482v0.e0(AbstractC0340b.w(this), false);
        return Stream.Wrapper.convert(e02);
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) IntFunction.VivifiedWrapper.convert(intFunction).j(0));
        return array;
    }

    public final /* synthetic */ void forEach(j$.util.function.Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        j$.util.stream.Stream e02;
        e02 = AbstractC0482v0.e0(AbstractC0340b.w(this), true);
        return e02;
    }

    public final /* synthetic */ boolean removeIf(j$.util.function.Predicate predicate) {
        return Collection$CC.$default$removeIf(this, predicate);
    }

    @Override // j$.util.List
    public final /* synthetic */ void replaceAll(j$.util.function.UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    /* renamed from: reversed  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ SequencedCollection m8reversed() {
        return List.CC.$default$reversed(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.InterfaceC0341c
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.InterfaceC0341c
    public final /* synthetic */ j$.util.stream.Stream stream() {
        j$.util.stream.Stream e02;
        e02 = AbstractC0482v0.e0(AbstractC0340b.w(this), false);
        return e02;
    }

    public final /* synthetic */ Object[] toArray(j$.util.function.IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.j(0));
        return array;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f9262o]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        D2.i.e(objArr, "array");
        int length = objArr.length;
        int i3 = this.f9262o;
        if (length < i3) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i3);
            D2.i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int f3 = f(this.f9260m + this.f9262o);
        int i4 = this.f9260m;
        if (i4 < f3) {
            AbstractC0826c.A(0, i4, f3, this.f9261n, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f9261n;
            AbstractC0826c.A(0, this.f9260m, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f9261n;
            AbstractC0826c.A(objArr3.length - this.f9260m, 0, f3, objArr3, objArr);
        }
        int i5 = this.f9262o;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        D2.i.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        g();
        b(collection.size() + this.f9262o);
        a(f(this.f9260m + this.f9262o), collection);
        return true;
    }
}
