package K;

import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* renamed from: K.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068w extends w2.f implements C2.l {

    /* renamed from: q  reason: collision with root package name */
    public int f678q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ H f679r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0068w(H h3, InterfaceC0866d interfaceC0866d) {
        super(1, interfaceC0866d);
        this.f679r = h3;
    }

    @Override // C2.l
    public final Object b(Object obj) {
        return new C0068w(this.f679r, (InterfaceC0866d) obj).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f678q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            this.f678q = 1;
            obj = this.f679r.b(this);
            if (obj == enumC0879a) {
                return enumC0879a;
            }
        }
        return obj;
    }
}
