package p;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: p.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719a implements Iterator {

    /* renamed from: m  reason: collision with root package name */
    public int f8714m;

    /* renamed from: n  reason: collision with root package name */
    public int f8715n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8716o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f8717p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f8718q;

    public C0719a(int i3) {
        this.f8714m = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8715n < this.f8714m) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object g3;
        if (hasNext()) {
            int i3 = this.f8715n;
            switch (this.f8717p) {
                case 0:
                    g3 = ((C0723e) this.f8718q).g(i3);
                    break;
                case 1:
                    g3 = ((C0723e) this.f8718q).i(i3);
                    break;
                default:
                    g3 = ((C0724f) this.f8718q).f8735n[i3];
                    break;
            }
            this.f8715n++;
            this.f8716o = true;
            return g3;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f8716o) {
            int i3 = this.f8715n - 1;
            this.f8715n = i3;
            switch (this.f8717p) {
                case 0:
                    ((C0723e) this.f8718q).h(i3);
                    break;
                case 1:
                    ((C0723e) this.f8718q).h(i3);
                    break;
                default:
                    ((C0724f) this.f8718q).e(i3);
                    break;
            }
            this.f8714m--;
            this.f8716o = false;
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0719a(C0723e c0723e, int i3) {
        this(c0723e.f8750o);
        this.f8717p = i3;
        switch (i3) {
            case 1:
                this.f8718q = c0723e;
                this(c0723e.f8750o);
                return;
            default:
                this.f8718q = c0723e;
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0719a(C0724f c0724f) {
        this(c0724f.f8736o);
        this.f8717p = 2;
        this.f8718q = c0724f;
    }
}
