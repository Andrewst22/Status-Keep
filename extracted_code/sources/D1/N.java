package D1;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class N extends q0 {

    /* renamed from: m  reason: collision with root package name */
    public int f204m;

    /* renamed from: n  reason: collision with root package name */
    public Object f205n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f206o;

    /* renamed from: p  reason: collision with root package name */
    public final Iterator f207p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f208q;

    public N() {
        this.f204m = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i3 = this.f204m;
        if (i3 != 4) {
            int b3 = N.j.b(i3);
            if (b3 == 0) {
                return true;
            }
            if (b3 == 2) {
                return false;
            }
            this.f204m = 4;
            switch (this.f206o) {
                case 0:
                    do {
                        Iterator it = this.f207p;
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            this.f204m = 3;
                            next = null;
                            break;
                        }
                    } while (!((C1.g) this.f208q).apply(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.f207p;
                        if (it2.hasNext()) {
                            next = it2.next();
                        } else {
                            this.f204m = 3;
                            next = null;
                            break;
                        }
                    } while (!((k0) this.f208q).f276n.contains(next));
                    break;
            }
            this.f205n = next;
            if (this.f204m != 3) {
                this.f204m = 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f204m = 2;
            Object obj = this.f205n;
            this.f205n = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(Iterator it, C1.g gVar) {
        this();
        this.f206o = 0;
        this.f207p = it;
        this.f208q = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(k0 k0Var) {
        this();
        this.f206o = 1;
        this.f208q = k0Var;
        this.f207p = k0Var.f275m.iterator();
    }
}
