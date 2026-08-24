package p;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* renamed from: p.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721c implements Iterator, Map.Entry {

    /* renamed from: m  reason: collision with root package name */
    public int f8720m;

    /* renamed from: n  reason: collision with root package name */
    public int f8721n = -1;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8722o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ C0723e f8723p;

    public C0721c(C0723e c0723e) {
        this.f8723p = c0723e;
        this.f8720m = c0723e.f8750o - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.f8722o) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i3 = this.f8721n;
            C0723e c0723e = this.f8723p;
            Object g3 = c0723e.g(i3);
            if (key != g3 && (key == null || !key.equals(g3))) {
                return false;
            }
            Object value = entry.getValue();
            Object i4 = c0723e.i(this.f8721n);
            if (value != i4 && (value == null || !value.equals(i4))) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f8722o) {
            return this.f8723p.g(this.f8721n);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f8722o) {
            return this.f8723p.i(this.f8721n);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8721n < this.f8720m) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.f8722o) {
            int i3 = this.f8721n;
            C0723e c0723e = this.f8723p;
            Object g3 = c0723e.g(i3);
            Object i4 = c0723e.i(this.f8721n);
            int i5 = 0;
            if (g3 == null) {
                hashCode = 0;
            } else {
                hashCode = g3.hashCode();
            }
            if (i4 != null) {
                i5 = i4.hashCode();
            }
            return hashCode ^ i5;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f8721n++;
            this.f8722o = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f8722o) {
            this.f8723p.h(this.f8721n);
            this.f8721n--;
            this.f8720m--;
            this.f8722o = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f8722o) {
            int i3 = (this.f8721n << 1) + 1;
            Object[] objArr = this.f8723p.f8749n;
            Object obj2 = objArr[i3];
            objArr[i3] = obj;
            return obj2;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
