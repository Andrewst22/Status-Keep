package D2;

import C2.u;
import C2.v;
import C2.w;
import a.AbstractC0155a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n2.AbstractC0664g;
import s2.C0803b;
import t2.AbstractC0828e;
import t2.C0836m;
/* loaded from: classes.dex */
public final class e implements H2.b, d {

    /* renamed from: b  reason: collision with root package name */
    public static final Map f329b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f330c;

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashMap f331d;

    /* renamed from: a  reason: collision with root package name */
    public final Class f332a;

    static {
        List C3 = AbstractC0828e.C(C2.a.class, C2.l.class, C2.p.class, C2.q.class, C2.r.class, C2.s.class, C2.t.class, u.class, v.class, w.class, C2.b.class, C2.c.class, C2.d.class, C2.e.class, C2.f.class, C2.g.class, C2.h.class, C2.i.class, C2.j.class, C2.k.class, C2.m.class, C2.n.class, C2.o.class);
        ArrayList arrayList = new ArrayList(C3.size());
        int i3 = 0;
        for (Object obj : C3) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                arrayList.add(new C0803b((Class) obj, Integer.valueOf(i3)));
                i3 = i4;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        Map map = C0836m.f9265m;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                map = new LinkedHashMap(AbstractC0664g.q(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0803b c0803b = (C0803b) it.next();
                    map.put(c0803b.f9222m, c0803b.f9223n);
                }
            } else {
                C0803b c0803b2 = (C0803b) arrayList.get(0);
                i.e(c0803b2, "pair");
                map = Collections.singletonMap(c0803b2.f9222m, c0803b2.f9223n);
                i.d(map, "singletonMap(...)");
            }
        }
        f329b = map;
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        i.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            i.b(str);
            sb.append(J2.i.a0(str, str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f329b.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f330c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0664g.q(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            i.b(str2);
            linkedHashMap.put(key, J2.i.a0(str2, str2));
        }
        f331d = linkedHashMap;
    }

    public e(Class cls) {
        i.e(cls, "jClass");
        this.f332a = cls;
    }

    @Override // D2.d
    public final Class a() {
        return this.f332a;
    }

    public final String b() {
        String str;
        Class cls = this.f332a;
        i.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return J2.i.Z(simpleName, enclosingMethod.getName() + '$');
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return J2.i.Z(simpleName, enclosingConstructor.getName() + '$');
            }
            int V3 = J2.i.V(simpleName, '$', false, 6);
            if (V3 == -1) {
                return simpleName;
            }
            String substring = simpleName.substring(V3 + 1, simpleName.length());
            i.d(substring, "substring(...)");
            return substring;
        }
        boolean isArray = cls.isArray();
        LinkedHashMap linkedHashMap = f331d;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        }
        String str3 = (String) linkedHashMap.get(cls.getName());
        if (str3 == null) {
            return cls.getSimpleName();
        }
        return str3;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e) && AbstractC0155a.z(this).equals(AbstractC0155a.z((H2.b) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0155a.z(this).hashCode();
    }

    public final String toString() {
        return this.f332a + " (Kotlin reflection is not available)";
    }
}
