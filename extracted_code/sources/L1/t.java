package L1;
/* loaded from: classes.dex */
public final class t implements I1.s {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f938m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f939n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ I1.r f940o;

    public /* synthetic */ t(Object obj, I1.r rVar, int i3) {
        this.f938m = i3;
        this.f939n = obj;
        this.f940o = rVar;
    }

    @Override // I1.s
    public final I1.r create(I1.k kVar, P1.a aVar) {
        switch (this.f938m) {
            case 0:
                if (aVar.f1465a == ((Class) this.f939n)) {
                    return this.f940o;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f1465a;
                if (!((Class) this.f939n).isAssignableFrom(cls)) {
                    return null;
                }
                return new b(this, cls);
            default:
                if (aVar.equals((P1.a) this.f939n)) {
                    return this.f940o;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f938m) {
            case 0:
                return "Factory[type=" + ((Class) this.f939n).getName() + ",adapter=" + this.f940o + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f939n).getName() + ",adapter=" + this.f940o + "]";
            default:
                return super.toString();
        }
    }
}
