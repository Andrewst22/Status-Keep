package D1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
/* loaded from: classes.dex */
public abstract class M extends D implements Set {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f202o = 0;

    /* renamed from: n  reason: collision with root package name */
    public transient I f203n;

    public static int h(int i3) {
        int max = Math.max(i3, 2);
        boolean z3 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z3 = false;
        }
        if (z3) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static M i(int i3, Object... objArr) {
        if (i3 != 0) {
            if (i3 != 1) {
                int h3 = h(i3);
                Object[] objArr2 = new Object[h3];
                int i4 = h3 - 1;
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < i3; i7++) {
                    Object obj = objArr[i7];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int s3 = r.s(hashCode);
                        while (true) {
                            int i8 = s3 & i4;
                            Object obj2 = objArr2[i8];
                            if (obj2 == null) {
                                objArr[i6] = obj;
                                objArr2[i8] = obj;
                                i5 += hashCode;
                                i6++;
                                break;
                            } else if (obj2.equals(obj)) {
                                break;
                            } else {
                                s3++;
                            }
                        }
                    } else {
                        throw new NullPointerException(D2.h.k("at index ", i7));
                    }
                }
                Arrays.fill(objArr, i6, i3, (Object) null);
                if (i6 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new o0(obj3);
                } else if (h(i6) < h3 / 2) {
                    return i(i6, objArr);
                } else {
                    int length = objArr.length;
                    if (i6 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i6);
                    }
                    return new h0(i5, i4, i6, objArr, objArr2);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new o0(obj4);
        }
        return h0.f263v;
    }

    public static M j(Collection collection) {
        if ((collection instanceof M) && !(collection instanceof SortedSet)) {
            M m3 = (M) collection;
            if (!m3.f()) {
                return m3;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    @Override // D1.D
    public I a() {
        I i3 = this.f203n;
        if (i3 == null) {
            I k3 = k();
            this.f203n = k3;
            return k3;
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof M) && (this instanceof h0)) {
            M m3 = (M) obj;
            m3.getClass();
            if ((m3 instanceof h0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return r.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return r.m(this);
    }

    public I k() {
        Object[] array = toArray(D.f188m);
        G g3 = I.f197n;
        return I.h(array.length, array);
    }
}
