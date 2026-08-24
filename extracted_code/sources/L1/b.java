package L1;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class b extends I1.r {

    /* renamed from: d  reason: collision with root package name */
    public static final a f882d = new a(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f883a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f884b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f885c;

    public b(I1.k kVar, I1.r rVar, Class cls) {
        this.f883a = 0;
        this.f884b = new s(kVar, rVar, cls);
        this.f885c = cls;
    }

    @Override // I1.r
    public final Object a(Q1.b bVar) {
        switch (this.f883a) {
            case 0:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                bVar.a();
                while (bVar.j()) {
                    arrayList.add(((I1.r) ((s) this.f884b).f936c).a(bVar));
                }
                bVar.f();
                int size = arrayList.size();
                Object newInstance = Array.newInstance((Class) this.f885c, size);
                for (int i3 = 0; i3 < size; i3++) {
                    Array.set(newInstance, i3, arrayList.get(i3));
                }
                return newInstance;
            case 1:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                Collection collection = (Collection) ((K1.n) this.f885c).K();
                bVar.a();
                while (bVar.j()) {
                    collection.add(((I1.r) ((s) this.f884b).f936c).a(bVar));
                }
                bVar.f();
                return collection;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                Object a3 = ((t) this.f884b).f940o.a(bVar);
                if (a3 != null) {
                    Class cls = (Class) this.f885c;
                    if (!cls.isInstance(a3)) {
                        throw new RuntimeException("Expected a " + cls.getName() + " but was " + a3.getClass().getName());
                    }
                }
                return a3;
            default:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                return (Enum) ((HashMap) this.f885c).get(bVar.u());
        }
    }

    @Override // I1.r
    public final void b(Q1.c cVar, Object obj) {
        String str;
        switch (this.f883a) {
            case 0:
                if (obj == null) {
                    cVar.j();
                    return;
                }
                cVar.b();
                int length = Array.getLength(obj);
                for (int i3 = 0; i3 < length; i3++) {
                    ((s) this.f884b).b(cVar, Array.get(obj, i3));
                }
                cVar.f();
                return;
            case 1:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    cVar.j();
                    return;
                }
                cVar.b();
                for (Object obj2 : collection) {
                    ((s) this.f884b).b(cVar, obj2);
                }
                cVar.f();
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                ((t) this.f884b).f940o.b(cVar, obj);
                return;
            default:
                Enum r6 = (Enum) obj;
                if (r6 == null) {
                    str = null;
                } else {
                    str = (String) ((HashMap) this.f884b).get(r6);
                }
                cVar.p(str);
                return;
        }
    }

    public b(I1.k kVar, Type type, I1.r rVar, K1.n nVar) {
        this.f883a = 1;
        this.f884b = new s(kVar, rVar, type);
        this.f885c = nVar;
    }

    public b(t tVar, Class cls) {
        this.f883a = 2;
        this.f884b = tVar;
        this.f885c = cls;
    }

    public b(Class cls) {
        Field[] declaredFields;
        this.f883a = 3;
        this.f885c = new HashMap();
        this.f884b = new HashMap();
        try {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isEnumConstant()) {
                    AccessController.doPrivileged(new v(field));
                    Enum r4 = (Enum) field.get(null);
                    String name = r4.name();
                    J1.b bVar = (J1.b) field.getAnnotation(J1.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String str : bVar.alternate()) {
                            ((HashMap) this.f885c).put(str, r4);
                        }
                    }
                    ((HashMap) this.f885c).put(name, r4);
                    ((HashMap) this.f884b).put(r4, name);
                }
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}
