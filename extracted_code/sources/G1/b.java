package G1;

import a.AbstractC0155a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final int[] f381m;

    /* renamed from: n  reason: collision with root package name */
    public final int f382n;

    /* renamed from: o  reason: collision with root package name */
    public final int f383o;

    public b(int i3, int i4, int[] iArr) {
        this.f381m = iArr;
        this.f382n = i3;
        this.f383o = i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            if (android.support.v4.media.session.a.B(((Integer) obj).intValue(), this.f382n, this.f383o, this.f381m) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int size = size();
            if (bVar.size() != size) {
                return false;
            }
            for (int i3 = 0; i3 < size; i3++) {
                if (this.f381m[this.f382n + i3] != bVar.f381m[bVar.f382n + i3]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        AbstractC0155a.l(i3, size());
        return Integer.valueOf(this.f381m[this.f382n + i3]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i4 = this.f382n; i4 < this.f383o; i4++) {
            i3 = (i3 * 31) + this.f381m[i4];
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int[] iArr = this.f381m;
            int i3 = this.f382n;
            int B3 = android.support.v4.media.session.a.B(intValue, i3, this.f383o, iArr);
            if (B3 >= 0) {
                return B3 - i3;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i3;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i4 = this.f383o;
            while (true) {
                i4--;
                i3 = this.f382n;
                if (i4 >= i3) {
                    if (this.f381m[i4] == intValue) {
                        break;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                return i4 - i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        Integer num = (Integer) obj;
        AbstractC0155a.l(i3, size());
        int i4 = this.f382n + i3;
        int[] iArr = this.f381m;
        int i5 = iArr[i4];
        num.getClass();
        iArr[i4] = num.intValue();
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f383o - this.f382n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i4) {
        AbstractC0155a.p(i3, i4, size());
        if (i3 == i4) {
            return Collections.emptyList();
        }
        int i5 = this.f382n;
        return new b(i3 + i5, i5 + i4, this.f381m);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f381m;
        int i3 = this.f382n;
        sb.append(iArr[i3]);
        while (true) {
            i3++;
            if (i3 < this.f383o) {
                sb.append(", ");
                sb.append(iArr[i3]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
