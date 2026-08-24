package o1;

import D2.r;
import D2.t;
import a.AbstractC0155a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import s2.C0808g;
import t1.C0819b;
/* loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final D2.e f8663a;

    /* renamed from: b  reason: collision with root package name */
    public final C0819b f8664b;

    public c(D2.e eVar, C0819b c0819b) {
        this.f8663a = eVar;
        this.f8664b = c0819b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean z3;
        boolean z4;
        Class cls;
        boolean isInstance;
        String str;
        D2.i.e(obj, "obj");
        D2.i.e(method, "method");
        boolean a3 = D2.i.a(method.getName(), "accept");
        C0819b c0819b = this.f8664b;
        String str2 = 0;
        boolean z5 = true;
        if (a3 && objArr != 0 && objArr.length == 1) {
            Object obj2 = objArr[0];
            Class cls2 = this.f8663a.f332a;
            D2.i.e(cls2, "jClass");
            Map map = D2.e.f329b;
            D2.i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls2);
            if (num != null) {
                isInstance = t.b(num.intValue(), obj2);
            } else {
                if (cls2.isPrimitive()) {
                    cls = AbstractC0155a.z(r.a(cls2));
                } else {
                    cls = cls2;
                }
                isInstance = cls.isInstance(obj2);
            }
            if (!isInstance) {
                StringBuilder sb = new StringBuilder("Value cannot be cast to ");
                if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
                    boolean isArray = cls2.isArray();
                    HashMap hashMap = D2.e.f330c;
                    if (isArray) {
                        Class<?> componentType = cls2.getComponentType();
                        if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                            str2 = str.concat("Array");
                        }
                        if (str2 == null) {
                            str2 = "kotlin.Array";
                        }
                    } else {
                        str2 = (String) hashMap.get(cls2.getName());
                        if (str2 == null) {
                            str2 = cls2.getCanonicalName();
                        }
                    }
                }
                sb.append(str2);
                throw new ClassCastException(sb.toString());
            }
            D2.i.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            c0819b.b(obj2);
            return C0808g.f9229a;
        }
        if (D2.i.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != 0 && objArr.length == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (objArr != null) {
                str2 = objArr[0];
            }
            if (obj != str2) {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
        if (D2.i.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return Integer.valueOf(c0819b.hashCode());
        }
        if ((D2.i.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) ? false : false) {
            return c0819b.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
