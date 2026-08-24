package p1;

import C2.p;
import K.C0071z;
import K2.InterfaceC0091u;
import N2.d;
import W1.m;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
import w2.f;
/* renamed from: p1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0736a extends f implements p {

    /* renamed from: q  reason: collision with root package name */
    public int f8829q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ d f8830r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ m f8831s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0736a(d dVar, m mVar, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f8830r = dVar;
        this.f8831s = mVar;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        return new C0736a(this.f8830r, this.f8831s, interfaceC0866d);
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((C0736a) d((InterfaceC0091u) obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        int i3 = this.f8829q;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0664g.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0664g.w(obj);
            C0071z c0071z = new C0071z(this.f8831s, 2);
            this.f8829q = 1;
            if (this.f8830r.x(c0071z, this) == enumC0879a) {
                return enumC0879a;
            }
        }
        return C0808g.f9229a;
    }
}
