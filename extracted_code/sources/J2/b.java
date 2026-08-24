package J2;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class b implements Iterator {

    /* renamed from: m  reason: collision with root package name */
    public final String f496m;

    /* renamed from: n  reason: collision with root package name */
    public int f497n;

    /* renamed from: o  reason: collision with root package name */
    public int f498o;

    /* renamed from: p  reason: collision with root package name */
    public int f499p;

    /* renamed from: q  reason: collision with root package name */
    public int f500q;

    public b(String str) {
        this.f496m = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3;
        int i4 = this.f497n;
        if (i4 != 0) {
            if (i4 != 1) {
                return false;
            }
            return true;
        }
        int i5 = 2;
        if (this.f500q < 0) {
            this.f497n = 2;
            return false;
        }
        String str = this.f496m;
        int length = str.length();
        int length2 = str.length();
        for (int i6 = this.f498o; i6 < length2; i6++) {
            char charAt = str.charAt(i6);
            if (charAt == '\n' || charAt == '\r') {
                i5 = (charAt == '\r' && (i3 = i6 + 1) < str.length() && str.charAt(i3) == '\n') ? 1 : 1;
                length = i6;
                this.f497n = 1;
                this.f500q = i5;
                this.f499p = length;
                return true;
            }
        }
        i5 = -1;
        this.f497n = 1;
        this.f500q = i5;
        this.f499p = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f497n = 0;
            int i3 = this.f499p;
            int i4 = this.f498o;
            this.f498o = this.f500q + i3;
            return this.f496m.subSequence(i4, i3).toString();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
