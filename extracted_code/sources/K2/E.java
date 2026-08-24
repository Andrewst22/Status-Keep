package K2;
/* loaded from: classes.dex */
public final class E implements L {

    /* renamed from: m  reason: collision with root package name */
    public final boolean f788m;

    public E(boolean z3) {
        this.f788m = z3;
    }

    @Override // K2.L
    public final boolean a() {
        return this.f788m;
    }

    @Override // K2.L
    public final a0 g() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f788m) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
