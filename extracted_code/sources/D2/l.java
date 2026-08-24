package D2;
/* loaded from: classes.dex */
public final class l extends m implements H2.c, C2.l {
    @Override // D2.c
    public final H2.a a() {
        r.f343a.getClass();
        return this;
    }

    @Override // C2.l
    public final Object b(Object obj) {
        g();
        throw null;
    }

    public final void g() {
        if (!this.f338s) {
            H2.a e2 = e();
            if (e2 != this) {
                ((l) ((H2.c) e2)).g();
                return;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }
}
