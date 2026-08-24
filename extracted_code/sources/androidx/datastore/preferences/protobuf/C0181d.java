package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: androidx.datastore.preferences.protobuf.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181d implements Iterator {

    /* renamed from: m  reason: collision with root package name */
    public int f4235m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final int f4236n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ C0184g f4237o;

    public C0181d(C0184g c0184g) {
        this.f4237o = c0184g;
        this.f4236n = c0184g.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4235m < this.f4236n) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f4235m;
        if (i3 < this.f4236n) {
            this.f4235m = i3 + 1;
            return Byte.valueOf(this.f4237o.f(i3));
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
