package n;

import java.util.Iterator;
/* renamed from: n.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0652b extends AbstractC0655e implements Iterator {

    /* renamed from: m  reason: collision with root package name */
    public C0653c f8330m;

    /* renamed from: n  reason: collision with root package name */
    public C0653c f8331n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f8332o;

    public C0652b(C0653c c0653c, C0653c c0653c2, int i3) {
        this.f8332o = i3;
        this.f8330m = c0653c2;
        this.f8331n = c0653c;
    }

    @Override // n.AbstractC0655e
    public final void a(C0653c c0653c) {
        C0653c c0653c2;
        C0653c c0653c3 = null;
        if (this.f8330m == c0653c && c0653c == this.f8331n) {
            this.f8331n = null;
            this.f8330m = null;
        }
        C0653c c0653c4 = this.f8330m;
        if (c0653c4 == c0653c) {
            switch (this.f8332o) {
                case 0:
                    c0653c2 = c0653c4.f8336p;
                    break;
                default:
                    c0653c2 = c0653c4.f8335o;
                    break;
            }
            this.f8330m = c0653c2;
        }
        C0653c c0653c5 = this.f8331n;
        if (c0653c5 == c0653c) {
            C0653c c0653c6 = this.f8330m;
            if (c0653c5 != c0653c6 && c0653c6 != null) {
                c0653c3 = b(c0653c5);
            }
            this.f8331n = c0653c3;
        }
    }

    public final C0653c b(C0653c c0653c) {
        switch (this.f8332o) {
            case 0:
                return c0653c.f8335o;
            default:
                return c0653c.f8336p;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8331n != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0653c c0653c;
        C0653c c0653c2 = this.f8331n;
        C0653c c0653c3 = this.f8330m;
        if (c0653c2 != c0653c3 && c0653c3 != null) {
            c0653c = b(c0653c2);
        } else {
            c0653c = null;
        }
        this.f8331n = c0653c;
        return c0653c2;
    }
}
