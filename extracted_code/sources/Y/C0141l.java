package Y;

import U.AbstractC0123a;
import android.content.Context;
import android.os.Handler;
import i0.C0289b;
import java.util.ArrayList;
import q0.C0746d;
import v0.C0877a;
/* renamed from: Y.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141l {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3355a;

    /* renamed from: b  reason: collision with root package name */
    public final h0.i f3356b;

    public C0141l(Context context) {
        this.f3355a = context;
        this.f3356b = new h0.i(context);
    }

    public final AbstractC0135f[] a(Handler handler, D d3, D d4, D d5, D d6) {
        ArrayList arrayList = new ArrayList();
        h0.i iVar = this.f3356b;
        Context context = this.f3355a;
        arrayList.add(new u0.l(context, iVar, handler, d3));
        a0.C c3 = new a0.C(context);
        AbstractC0123a.j(!c3.f3603a);
        c3.f3603a = true;
        if (((B1.e) c3.f3606d) == null) {
            c3.f3606d = new B1.e(new S.d[0]);
        }
        if (((B1.a) c3.f3608f) == null) {
            c3.f3608f = new B1.a(context, 16);
        }
        arrayList.add(new a0.O(this.f3355a, iVar, handler, d4, new a0.L(c3)));
        arrayList.add(new C0746d(d5, handler.getLooper()));
        arrayList.add(new C0289b(d6, handler.getLooper()));
        arrayList.add(new C0877a());
        arrayList.add(new g0.i(g0.d.f5717f));
        return (AbstractC0135f[]) arrayList.toArray(new AbstractC0135f[0]);
    }
}
