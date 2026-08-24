package K;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
/* renamed from: K.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053g extends w2.f implements C2.p {

    /* renamed from: q  reason: collision with root package name */
    public Iterator f620q;

    /* renamed from: r  reason: collision with root package name */
    public Object f621r;

    /* renamed from: s  reason: collision with root package name */
    public int f622s;

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f623t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ List f624u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ArrayList f625v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0053g(List list, ArrayList arrayList, InterfaceC0866d interfaceC0866d) {
        super(2, interfaceC0866d);
        this.f624u = list;
        this.f625v = arrayList;
    }

    @Override // w2.b
    public final InterfaceC0866d d(Object obj, InterfaceC0866d interfaceC0866d) {
        C0053g c0053g = new C0053g(this.f624u, this.f625v, interfaceC0866d);
        c0053g.f623t = obj;
        return c0053g;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        return ((C0053g) d(obj, (InterfaceC0866d) obj2)).n(C0808g.f9229a);
    }

    @Override // w2.b
    public final Object n(Object obj) {
        Iterator it;
        List list;
        int i3 = this.f622s;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    it = this.f620q;
                    list = (List) this.f623t;
                    AbstractC0664g.w(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f621r;
                Iterator it2 = this.f620q;
                List list2 = (List) this.f623t;
                AbstractC0664g.w(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new w2.f(1, null));
                    this.f623t = list2;
                    this.f620q = it2;
                    this.f621r = null;
                    this.f622s = 2;
                    throw null;
                }
            }
        } else {
            AbstractC0664g.w(obj);
            obj = this.f623t;
            it = this.f624u.iterator();
            list = this.f625v;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.f623t = list;
            this.f620q = it;
            this.f621r = obj;
            this.f622s = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
