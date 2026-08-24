package j1;

import a.AbstractC0155a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.example.flutter_application_1.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k1.AbstractC0561a;
/* renamed from: j1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile C0516a f7360d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f7361e = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Context f7364c;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f7363b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7362a = new HashMap();

    public C0516a(Context context) {
        this.f7364c = context.getApplicationContext();
    }

    public static C0516a c(Context context) {
        if (f7360d == null) {
            synchronized (f7361e) {
                try {
                    if (f7360d == null) {
                        f7360d = new C0516a(context);
                    }
                } finally {
                }
            }
        }
        return f7360d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f7364c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f7363b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0517b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        boolean z3;
        boolean z4 = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z3 = AbstractC0561a.c();
        } else {
            try {
                if (AbstractC0155a.f3600r == null) {
                    AbstractC0155a.f3599q = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    AbstractC0155a.f3600r = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                z4 = ((Boolean) AbstractC0155a.f3600r.invoke(null, Long.valueOf(AbstractC0155a.f3599q))).booleanValue();
            } catch (Exception e2) {
                AbstractC0155a.A("isTagEnabled", e2);
            }
            z3 = z4;
        }
        if (z3) {
            try {
                Trace.beginSection(AbstractC0155a.O(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f7362a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                InterfaceC0517b interfaceC0517b = (InterfaceC0517b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a3 = interfaceC0517b.a();
                if (!a3.isEmpty()) {
                    for (Class cls2 : a3) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object b3 = interfaceC0517b.b(this.f7364c);
                hashSet.remove(cls);
                hashMap.put(cls, b3);
            } else {
                hashMap.get(cls);
            }
            Trace.endSection();
            return;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }
}
