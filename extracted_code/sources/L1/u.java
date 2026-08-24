package L1;
/* loaded from: classes.dex */
public final class u implements I1.s {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Class f941m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Class f942n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ I1.r f943o;

    public u(Class cls, Class cls2, I1.r rVar) {
        this.f941m = cls;
        this.f942n = cls2;
        this.f943o = rVar;
    }

    @Override // I1.s
    public final I1.r create(I1.k kVar, P1.a aVar) {
        Class cls = this.f941m;
        Class cls2 = aVar.f1465a;
        if (cls2 != cls && cls2 != this.f942n) {
            return null;
        }
        return this.f943o;
    }

    public final String toString() {
        return "Factory[type=" + this.f942n.getName() + "+" + this.f941m.getName() + ",adapter=" + this.f943o + "]";
    }
}
