package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class Q {

    /* renamed from: c  reason: collision with root package name */
    public static final Q f4198c = new Q();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f4200b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final D f4199a = new D();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.M] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.M] */
    public final U a(Class cls) {
        C0191n c0191n;
        L x;
        C0191n c0191n2;
        L l3;
        Class cls2;
        AbstractC0199w.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f4200b;
        U u3 = (U) concurrentHashMap.get(cls);
        if (u3 == null) {
            D d3 = this.f4199a;
            d3.getClass();
            Class cls3 = V.f4208a;
            if (!AbstractC0197u.class.isAssignableFrom(cls) && (cls2 = V.f4208a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            T b3 = ((C) d3.f4168a).b(cls);
            if ((b3.f4207d & 2) == 2) {
                boolean isAssignableFrom = AbstractC0197u.class.isAssignableFrom(cls);
                AbstractC0197u abstractC0197u = b3.f4204a;
                if (isAssignableFrom) {
                    l3 = new M(V.f4210c, AbstractC0192o.f4283a, abstractC0197u);
                } else {
                    c0 c0Var = V.f4209b;
                    C0191n c0191n3 = AbstractC0192o.f4284b;
                    if (c0191n3 != null) {
                        l3 = new M(c0Var, c0191n3, abstractC0197u);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                x = l3;
            } else if (AbstractC0197u.class.isAssignableFrom(cls)) {
                N n3 = O.f4197b;
                A a3 = B.f4165b;
                c0 c0Var2 = V.f4210c;
                if (N.j.b(b3.d()) != 1) {
                    c0191n2 = AbstractC0192o.f4283a;
                } else {
                    c0191n2 = null;
                }
                H h3 = I.f4176b;
                int[] iArr = L.f4178n;
                if (b3 instanceof T) {
                    x = L.x(b3, n3, a3, c0Var2, c0191n2, h3);
                } else {
                    b3.getClass();
                    throw new ClassCastException();
                }
            } else {
                N n4 = O.f4196a;
                A a4 = B.f4164a;
                c0 c0Var3 = V.f4209b;
                if (N.j.b(b3.d()) != 1) {
                    c0191n = AbstractC0192o.f4284b;
                    if (c0191n == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                } else {
                    c0191n = null;
                }
                H h4 = I.f4175a;
                int[] iArr2 = L.f4178n;
                if (b3 instanceof T) {
                    x = L.x(b3, n4, a4, c0Var3, c0191n, h4);
                } else {
                    b3.getClass();
                    throw new ClassCastException();
                }
            }
            U u4 = (U) concurrentHashMap.putIfAbsent(cls, x);
            if (u4 != null) {
                return u4;
            }
            return x;
        }
        return u3;
    }
}
