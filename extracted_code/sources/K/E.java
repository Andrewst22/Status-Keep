package K;

import n2.AbstractC0664g;
import s2.C0803b;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class E extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public Throwable f517q;

    /* renamed from: r  reason: collision with root package name */
    public int f518r;

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ boolean f519s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Q f520t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f521u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Q q3, int i3, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f520t = q3;
        this.f521u = i3;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        E e2 = new E(this.f520t, this.f521u, interfaceC0866d);
        e2.f519s = ((Boolean) obj).booleanValue();
        return e2;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) d(bool, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // w2.b
    public final Object n(Object obj) {
        Throwable th;
        int i3;
        boolean z3;
        b0 b0Var;
        boolean z4;
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        boolean z5 = this.f518r;
        Q q3 = this.f520t;
        try {
        } catch (Throwable th2) {
            if (z5 != 0) {
                a0 g3 = q3.g();
                this.f517q = th2;
                this.f519s = z5;
                this.f518r = 2;
                Integer a3 = g3.a();
                if (a3 == enumC0879a) {
                    return enumC0879a;
                }
                z3 = z5;
                th = th2;
                obj = a3;
            } else {
                boolean z6 = z5;
                th = th2;
                i3 = this.f521u;
                z3 = z6;
            }
        }
        if (z5 != 0) {
            if (z5 != 1) {
                if (z5 == 2) {
                    z3 = this.f519s;
                    th = this.f517q;
                    AbstractC0664g.w(obj);
                    i3 = ((Number) obj).intValue();
                    U u3 = new U(th, i3);
                    z4 = z3;
                    b0Var = u3;
                    return new C0803b(b0Var, Boolean.valueOf(z4));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z7 = this.f519s;
            AbstractC0664g.w(obj);
            z5 = z7;
        } else {
            AbstractC0664g.w(obj);
            boolean z8 = this.f519s;
            this.f519s = z8;
            this.f518r = 1;
            obj = Q.f(q3, z8, this);
            z5 = z8;
            if (obj == enumC0879a) {
                return enumC0879a;
            }
        }
        b0Var = (b0) obj;
        z4 = z5;
        return new C0803b(b0Var, Boolean.valueOf(z4));
    }
}
