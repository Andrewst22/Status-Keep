package R;
/* renamed from: R.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0115s {

    /* renamed from: a  reason: collision with root package name */
    public final long f1990a;

    static {
        new C0115s(new r());
        U.A.H(0);
        U.A.H(1);
        U.A.H(2);
        U.A.H(3);
        U.A.H(4);
        U.A.H(5);
        U.A.H(6);
    }

    public C0115s(r rVar) {
        rVar.getClass();
        int i3 = U.A.f2405a;
        this.f1990a = rVar.f1989a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0115s)) {
            return false;
        }
        C0115s c0115s = (C0115s) obj;
        c0115s.getClass();
        if (this.f1990a == c0115s.f1990a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f1990a;
        return ((((int) 0) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 29791;
    }
}
