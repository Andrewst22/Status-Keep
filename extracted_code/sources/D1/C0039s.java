package D1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: D1.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039s implements Iterator {

    /* renamed from: m  reason: collision with root package name */
    public int f294m;

    /* renamed from: n  reason: collision with root package name */
    public int f295n;

    /* renamed from: o  reason: collision with root package name */
    public int f296o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ C0042v f297p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f298q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0042v f299r;

    public C0039s(C0042v c0042v, int i3) {
        int i4;
        this.f298q = i3;
        this.f299r = c0042v;
        this.f297p = c0042v;
        this.f294m = c0042v.f310q;
        if (c0042v.isEmpty()) {
            i4 = -1;
        } else {
            i4 = 0;
        }
        this.f295n = i4;
        this.f296o = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f295n >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0041u c0041u;
        C0042v c0042v = this.f297p;
        if (c0042v.f310q == this.f294m) {
            if (hasNext()) {
                int i3 = this.f295n;
                this.f296o = i3;
                switch (this.f298q) {
                    case 0:
                        c0041u = this.f299r.j()[i3];
                        break;
                    case 1:
                        c0041u = new C0041u(this.f299r, i3);
                        break;
                    default:
                        c0041u = this.f299r.k()[i3];
                        break;
                }
                int i4 = this.f295n + 1;
                if (i4 >= c0042v.f311r) {
                    i4 = -1;
                }
                this.f295n = i4;
                return c0041u;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0042v c0042v = this.f297p;
        int i3 = c0042v.f310q;
        int i4 = this.f294m;
        if (i3 == i4) {
            int i5 = this.f296o;
            if (i5 >= 0) {
                this.f294m = i4 + 32;
                c0042v.remove(c0042v.j()[i5]);
                this.f295n--;
                this.f296o = -1;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        throw new ConcurrentModificationException();
    }
}
