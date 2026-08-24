package D1;
/* loaded from: classes.dex */
public final class h0 extends M {

    /* renamed from: u  reason: collision with root package name */
    public static final Object[] f262u;

    /* renamed from: v  reason: collision with root package name */
    public static final h0 f263v;

    /* renamed from: p  reason: collision with root package name */
    public final transient Object[] f264p;

    /* renamed from: q  reason: collision with root package name */
    public final transient int f265q;

    /* renamed from: r  reason: collision with root package name */
    public final transient Object[] f266r;

    /* renamed from: s  reason: collision with root package name */
    public final transient int f267s;

    /* renamed from: t  reason: collision with root package name */
    public final transient int f268t;

    static {
        Object[] objArr = new Object[0];
        f262u = objArr;
        f263v = new h0(0, 0, 0, objArr, objArr);
    }

    public h0(int i3, int i4, int i5, Object[] objArr, Object[] objArr2) {
        this.f264p = objArr;
        this.f265q = i3;
        this.f266r = objArr2;
        this.f267s = i4;
        this.f268t = i5;
    }

    @Override // D1.D
    public final int b(int i3, Object[] objArr) {
        Object[] objArr2 = this.f264p;
        int i4 = this.f268t;
        System.arraycopy(objArr2, 0, objArr, i3, i4);
        return i3 + i4;
    }

    @Override // D1.D
    public final Object[] c() {
        return this.f264p;
    }

    @Override // D1.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f266r;
            if (objArr.length != 0) {
                int t3 = r.t(obj);
                while (true) {
                    int i3 = t3 & this.f267s;
                    Object obj2 = objArr[i3];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    t3 = i3 + 1;
                }
            }
        }
        return false;
    }

    @Override // D1.D
    public final int d() {
        return this.f268t;
    }

    @Override // D1.D
    public final int e() {
        return 0;
    }

    @Override // D1.D
    public final boolean f() {
        return false;
    }

    @Override // D1.D
    public final q0 g() {
        return a().listIterator(0);
    }

    @Override // D1.M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f265q;
    }

    @Override // D1.M
    public final I k() {
        return I.h(this.f268t, this.f264p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f268t;
    }
}
