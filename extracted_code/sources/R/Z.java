package R;
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: b  reason: collision with root package name */
    public static final Z f1866b;

    /* renamed from: a  reason: collision with root package name */
    public final D1.I f1867a;

    static {
        D1.G g3 = D1.I.f197n;
        f1866b = new Z(D1.b0.f231q);
        U.A.H(0);
    }

    public Z(D1.I i3) {
        this.f1867a = D1.I.j(i3);
    }

    public final boolean a(int i3) {
        int i4 = 0;
        while (true) {
            D1.I i5 = this.f1867a;
            if (i4 >= i5.size()) {
                return false;
            }
            Y y3 = (Y) i5.get(i4);
            boolean[] zArr = y3.f1865e;
            int length = zArr.length;
            boolean z3 = false;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                } else if (zArr[i6]) {
                    z3 = true;
                    break;
                } else {
                    i6++;
                }
            }
            if (z3 && y3.f1862b.f1823c == i3) {
                return true;
            }
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z.class == obj.getClass()) {
            return this.f1867a.equals(((Z) obj).f1867a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1867a.hashCode();
    }
}
