package G2;

import java.util.Iterator;
/* loaded from: classes.dex */
public class a implements Iterable {

    /* renamed from: m  reason: collision with root package name */
    public final int f385m;

    /* renamed from: n  reason: collision with root package name */
    public final int f386n;

    /* renamed from: o  reason: collision with root package name */
    public final int f387o;

    public a(int i3, int i4, int i5) {
        if (i5 != 0) {
            if (i5 != Integer.MIN_VALUE) {
                this.f385m = i3;
                if (i5 > 0) {
                    if (i3 < i4) {
                        int i6 = i4 % i5;
                        int i7 = i3 % i5;
                        int i8 = ((i6 < 0 ? i6 + i5 : i6) - (i7 < 0 ? i7 + i5 : i7)) % i5;
                        i4 -= i8 < 0 ? i8 + i5 : i8;
                    }
                } else if (i5 < 0) {
                    if (i3 > i4) {
                        int i9 = -i5;
                        int i10 = i3 % i9;
                        int i11 = i4 % i9;
                        int i12 = ((i10 < 0 ? i10 + i9 : i10) - (i11 < 0 ? i11 + i9 : i11)) % i9;
                        i4 += i12 < 0 ? i12 + i9 : i12;
                    }
                } else {
                    throw new IllegalArgumentException("Step is zero.");
                }
                this.f386n = i4;
                this.f387o = i5;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f385m != aVar.f385m || this.f386n != aVar.f386n || this.f387o != aVar.f387o) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f385m * 31) + this.f386n) * 31) + this.f387o;
    }

    public boolean isEmpty() {
        int i3 = this.f387o;
        int i4 = this.f386n;
        int i5 = this.f385m;
        if (i3 > 0) {
            if (i5 <= i4) {
                return false;
            }
        } else if (i5 >= i4) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f385m, this.f386n, this.f387o);
    }

    public String toString() {
        StringBuilder sb;
        int i3 = this.f386n;
        int i4 = this.f385m;
        int i5 = this.f387o;
        if (i5 > 0) {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append("..");
            sb.append(i3);
            sb.append(" step ");
            sb.append(i5);
        } else {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append(" downTo ");
            sb.append(i3);
            sb.append(" step ");
            sb.append(-i5);
        }
        return sb.toString();
    }
}
