package n;

import java.util.Iterator;
/* renamed from: n.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654d extends AbstractC0655e implements Iterator {

    /* renamed from: m  reason: collision with root package name */
    public C0653c f8337m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f8338n = true;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ C0651a f8339o;

    public C0654d(C0651a c0651a) {
        this.f8339o = c0651a;
    }

    @Override // n.AbstractC0655e
    public final void a(C0653c c0653c) {
        boolean z3;
        C0653c c0653c2 = this.f8337m;
        if (c0653c == c0653c2) {
            C0653c c0653c3 = c0653c2.f8336p;
            this.f8337m = c0653c3;
            if (c0653c3 == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f8338n = z3;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8338n) {
            if (this.f8339o.f8325m == null) {
                return false;
            }
            return true;
        }
        C0653c c0653c = this.f8337m;
        if (c0653c == null || c0653c.f8335o == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0653c c0653c;
        if (this.f8338n) {
            this.f8338n = false;
            this.f8337m = this.f8339o.f8325m;
        } else {
            C0653c c0653c2 = this.f8337m;
            if (c0653c2 != null) {
                c0653c = c0653c2.f8335o;
            } else {
                c0653c = null;
            }
            this.f8337m = c0653c;
        }
        return this.f8337m;
    }
}
