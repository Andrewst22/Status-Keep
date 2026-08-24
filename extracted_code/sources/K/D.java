package K;

import n2.AbstractC0664g;
import s2.C0803b;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class D extends w2.f implements C2.l {

    /* renamed from: q  reason: collision with root package name */
    public Throwable f514q;

    /* renamed from: r  reason: collision with root package name */
    public int f515r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Q f516s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Q q3, InterfaceC0866d interfaceC0866d) {
        super(1, interfaceC0866d);
        this.f516s = q3;
    }

    @Override // C2.l
    public final Object b(Object obj) {
        return new D(this.f516s, (InterfaceC0866d) obj).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        Throwable th;
        b0 b0Var;
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f515r;
        Q q3 = this.f516s;
        try {
        } catch (Throwable th2) {
            a0 g3 = q3.g();
            this.f514q = th2;
            this.f515r = 2;
            Integer a3 = g3.a();
            if (a3 == enumC0879a) {
                return enumC0879a;
            }
            th = th2;
            obj = a3;
        }
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    th = this.f514q;
                    AbstractC0664g.w(obj);
                    b0Var = new U(th, ((Number) obj).intValue());
                    return new C0803b(b0Var, Boolean.TRUE);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0664g.w(obj);
        } else {
            AbstractC0664g.w(obj);
            this.f515r = 1;
            obj = Q.f(q3, true, this);
            if (obj == enumC0879a) {
                return enumC0879a;
            }
        }
        b0Var = (b0) obj;
        return new C0803b(b0Var, Boolean.TRUE);
    }
}
