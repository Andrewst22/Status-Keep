package m2;

import K.C0050d;
import K.Q;
import K2.C0090t;
import K2.InterfaceC0091u;
import K2.T;
import android.content.Context;
import java.util.List;
import java.util.Set;
import u2.C0864b;
/* renamed from: m2.K  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0628K {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ H2.c[] f8229a;

    /* renamed from: b  reason: collision with root package name */
    public static final N.c f8230b;

    static {
        D2.m mVar = new D2.m(D2.b.f322m, AbstractC0628K.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        D2.r.f343a.getClass();
        f8229a = new H2.c[]{mVar};
        N.a aVar = N.a.f1101n;
        u2.i iVar = K2.B.f786b;
        T t3 = new T(null);
        iVar.getClass();
        if (t3 != u2.j.f9461m) {
            iVar = (u2.i) t3.c(iVar, new C0864b(1));
        }
        if (iVar.d(C0090t.f856n) == null) {
            iVar = iVar.n(new T(null));
        }
        f8230b = new N.c(aVar, new P2.e(iVar));
    }

    public static final C1.j a(Context context) {
        C1.j jVar;
        N.c cVar = f8230b;
        H2.c cVar2 = f8229a[0];
        cVar.getClass();
        D2.i.e(context, "thisRef");
        D2.i.e(cVar2, "property");
        C1.j jVar2 = cVar.f1108d;
        if (jVar2 == null) {
            synchronized (cVar.f1107c) {
                try {
                    if (cVar.f1108d == null) {
                        Context applicationContext = context.getApplicationContext();
                        C2.l lVar = cVar.f1105a;
                        D2.i.d(applicationContext, "applicationContext");
                        List list = (List) lVar.b(applicationContext);
                        InterfaceC0091u interfaceC0091u = cVar.f1106b;
                        N.b bVar = new N.b(0, applicationContext, cVar);
                        D2.i.e(list, "migrations");
                        cVar.f1108d = new C1.j(new C1.j(new Q(new M.f(T2.f.f2371a, new O.d(bVar, 0)), AbstractC0635d.s(new C0050d(list, null)), new B1.b(11), interfaceC0091u), 11), 11);
                    }
                    jVar = cVar.f1108d;
                    D2.i.b(jVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return jVar;
        }
        return jVar2;
    }

    public static final boolean b(String str, Object obj, Set set) {
        D2.i.e(str, "key");
        if (set == null) {
            if (!(obj instanceof Boolean) && !(obj instanceof Long) && !(obj instanceof String) && !(obj instanceof Double)) {
                return false;
            }
            return true;
        }
        return set.contains(str);
    }

    public static final Object c(Object obj, e0.l lVar) {
        if (obj instanceof String) {
            String str = (String) obj;
            D2.i.e(str, "<this>");
            if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                if (!str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                    String substring = str.substring(40);
                    D2.i.d(substring, "substring(...)");
                    return lVar.r(substring);
                }
                return obj;
            } else if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                String substring2 = str.substring(40);
                D2.i.d(substring2, "substring(...)");
                return Double.valueOf(Double.parseDouble(substring2));
            } else {
                return obj;
            }
        }
        return obj;
    }
}
