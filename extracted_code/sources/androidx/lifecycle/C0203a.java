package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: androidx.lifecycle.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4329a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4330b;

    public C0203a(HashMap hashMap) {
        this.f4330b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            k kVar = (k) entry.getValue();
            List list = (List) this.f4329a.get(kVar);
            if (list == null) {
                list = new ArrayList();
                this.f4329a.put(kVar, list);
            }
            list.add((C0204b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, k kVar, q qVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0204b c0204b = (C0204b) list.get(size);
                c0204b.getClass();
                try {
                    int i3 = c0204b.f4331a;
                    Method method = c0204b.f4332b;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                method.invoke(qVar, rVar, kVar);
                            }
                        } else {
                            method.invoke(qVar, rVar);
                        }
                    } else {
                        method.invoke(qVar, null);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to call observer method", e3.getCause());
                }
            }
        }
    }
}
