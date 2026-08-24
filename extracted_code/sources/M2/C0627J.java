package m2;

import K2.AbstractC0092v;
import android.content.Context;
import android.util.Log;
import c2.C0247a;
import c2.InterfaceC0248b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import s2.C0808g;
import t2.AbstractC0827d;
import v2.EnumC0879a;
/* renamed from: m2.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0627J implements InterfaceC0248b, InterfaceC0638g {

    /* renamed from: m  reason: collision with root package name */
    public Context f8226m;

    /* renamed from: n  reason: collision with root package name */
    public B1.e f8227n;

    /* renamed from: o  reason: collision with root package name */
    public final e0.l f8228o = new e0.l(23);

    public static final Object a(C0627J c0627j, String str, String str2, w2.f fVar) {
        c0627j.getClass();
        O.e eVar = new O.e(str);
        Context context = c0627j.f8226m;
        if (context != null) {
            Object d3 = AbstractC0628K.a(context).d(new O.g(new C0642k(eVar, str2, null), null), fVar);
            if (d3 != EnumC0879a.f9494m) {
                return C0808g.f9229a;
            }
            return d3;
        }
        D2.i.g("context");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c6 -> B:36:0x00c9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(m2.C0627J r11, java.util.List r12, w2.b r13) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C0627J.b(m2.J, java.util.List, w2.b):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, D2.q] */
    @Override // m2.InterfaceC0638g
    public final Double E(String str, C0639h c0639h) {
        ?? obj = new Object();
        AbstractC0092v.j(new C0649r(str, this, obj, null));
        return (Double) obj.f342m;
    }

    @Override // m2.InterfaceC0638g
    public final ArrayList G(String str, C0639h c0639h) {
        List list;
        String O3 = O(str, c0639h);
        ArrayList arrayList = null;
        if (O3 != null && !O3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && O3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && (list = (List) AbstractC0628K.c(O3, this.f8228o)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // m2.InterfaceC0638g
    public final Map I(List list, C0639h c0639h) {
        return (Map) AbstractC0092v.j(new C0643l(this, list, null));
    }

    @Override // m2.InterfaceC0638g
    public final void M(String str, long j3, C0639h c0639h) {
        AbstractC0092v.j(new C0625H(str, this, j3, null));
    }

    @Override // m2.InterfaceC0638g
    public final void N(String str, boolean z3, C0639h c0639h) {
        AbstractC0092v.j(new C0619B(str, this, z3, null));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, D2.q] */
    @Override // m2.InterfaceC0638g
    public final String O(String str, C0639h c0639h) {
        ?? obj = new Object();
        AbstractC0092v.j(new x(str, this, obj, null));
        return (String) obj.f342m;
    }

    @Override // m2.InterfaceC0638g
    public final void h(String str, String str2, C0639h c0639h) {
        AbstractC0092v.j(new C0623F(this, str, str2, null));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, D2.q] */
    @Override // m2.InterfaceC0638g
    public final Boolean i(String str, C0639h c0639h) {
        ?? obj = new Object();
        AbstractC0092v.j(new C0647p(str, this, obj, null));
        return (Boolean) obj.f342m;
    }

    @Override // m2.InterfaceC0638g
    public final void k(List list, C0639h c0639h) {
        AbstractC0092v.j(new C0641j(this, list, null));
    }

    @Override // m2.InterfaceC0638g
    public final List o(List list, C0639h c0639h) {
        return AbstractC0827d.H(((Map) AbstractC0092v.j(new u(this, list, null))).keySet());
    }

    @Override // c2.InterfaceC0248b
    public final void onAttachedToEngine(C0247a c0247a) {
        D2.i.e(c0247a, "binding");
        g2.g gVar = c0247a.f5124b;
        D2.i.d(gVar, "getBinaryMessenger(...)");
        Context context = c0247a.f5123a;
        D2.i.d(context, "getApplicationContext(...)");
        this.f8226m = context;
        try {
            InterfaceC0638g.f8256g.getClass();
            C0637f.b(gVar, this, "data_store");
            this.f8227n = new B1.e(gVar, context, this.f8228o);
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
        new C0632a().onAttachedToEngine(c0247a);
    }

    @Override // c2.InterfaceC0248b
    public final void onDetachedFromEngine(C0247a c0247a) {
        D2.i.e(c0247a, "binding");
        g2.g gVar = c0247a.f5124b;
        D2.i.d(gVar, "getBinaryMessenger(...)");
        InterfaceC0638g.f8256g.getClass();
        C0637f.b(gVar, null, "data_store");
        B1.e eVar = this.f8227n;
        if (eVar != null) {
            C0637f.b((g2.g) eVar.f56n, null, "shared_preferences");
        }
        this.f8227n = null;
    }

    @Override // m2.InterfaceC0638g
    public final C0631N p(String str, C0639h c0639h) {
        C0631N c0631n;
        String O3 = O(str, c0639h);
        if (O3 == null) {
            return null;
        }
        if (O3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new C0631N(O3, EnumC0629L.f8233p);
        }
        if (O3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            c0631n = new C0631N(null, EnumC0629L.f8232o);
        } else {
            c0631n = new C0631N(null, EnumC0629L.f8234q);
        }
        return c0631n;
    }

    @Override // m2.InterfaceC0638g
    public final void q(String str, String str2, C0639h c0639h) {
        AbstractC0092v.j(new C0626I(this, str, str2, null));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, D2.q] */
    @Override // m2.InterfaceC0638g
    public final Long t(String str, C0639h c0639h) {
        ?? obj = new Object();
        AbstractC0092v.j(new t(str, this, obj, null));
        return (Long) obj.f342m;
    }

    @Override // m2.InterfaceC0638g
    public final void u(String str, double d3, C0639h c0639h) {
        AbstractC0092v.j(new C0622E(str, this, d3, null));
    }

    @Override // m2.InterfaceC0638g
    public final void y(String str, List list, C0639h c0639h) {
        AbstractC0092v.j(new C0620C(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f8228o.s(list)), null));
    }
}
