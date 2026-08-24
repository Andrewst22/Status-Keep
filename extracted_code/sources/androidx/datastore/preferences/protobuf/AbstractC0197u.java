package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* renamed from: androidx.datastore.preferences.protobuf.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0197u extends AbstractC0178a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0197u> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected b0 unknownFields;

    public AbstractC0197u() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = b0.f4227f;
    }

    public static AbstractC0197u f(Class cls) {
        AbstractC0197u abstractC0197u = defaultInstanceMap.get(cls);
        if (abstractC0197u == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0197u = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC0197u == null) {
            abstractC0197u = (AbstractC0197u) ((AbstractC0197u) h0.d(cls)).e(6);
            if (abstractC0197u != null) {
                defaultInstanceMap.put(cls, abstractC0197u);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC0197u;
    }

    public static Object g(Method method, AbstractC0178a abstractC0178a, Object... objArr) {
        try {
            return method.invoke(abstractC0178a, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean h(AbstractC0197u abstractC0197u, boolean z3) {
        byte byteValue = ((Byte) abstractC0197u.e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        Q q3 = Q.f4198c;
        q3.getClass();
        boolean a3 = q3.a(abstractC0197u.getClass()).a(abstractC0197u);
        if (z3) {
            abstractC0197u.e(2);
        }
        return a3;
    }

    public static void l(Class cls, AbstractC0197u abstractC0197u) {
        abstractC0197u.j();
        defaultInstanceMap.put(cls, abstractC0197u);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0178a
    public final int a(U u3) {
        int f3;
        int f4;
        if (i()) {
            if (u3 == null) {
                Q q3 = Q.f4198c;
                q3.getClass();
                f4 = q3.a(getClass()).f(this);
            } else {
                f4 = u3.f(this);
            }
            if (f4 >= 0) {
                return f4;
            }
            throw new IllegalStateException(D2.h.k("serialized size must be non-negative, was ", f4));
        }
        int i3 = this.memoizedSerializedSize;
        if ((i3 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i3 & Integer.MAX_VALUE;
        }
        if (u3 == null) {
            Q q4 = Q.f4198c;
            q4.getClass();
            f3 = q4.a(getClass()).f(this);
        } else {
            f3 = u3.f(this);
        }
        m(f3);
        return f3;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0178a
    public final void b(C0188k c0188k) {
        Q q3 = Q.f4198c;
        q3.getClass();
        U a3 = q3.a(getClass());
        D d3 = c0188k.f4274b;
        if (d3 == null) {
            d3 = new D(c0188k);
        }
        a3.c(this, d3);
    }

    public final void c() {
        this.memoizedHashCode = 0;
    }

    public final void d() {
        m(Integer.MAX_VALUE);
    }

    public abstract Object e(int i3);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Q q3 = Q.f4198c;
        q3.getClass();
        return q3.a(getClass()).i(this, (AbstractC0197u) obj);
    }

    public final int hashCode() {
        if (i()) {
            Q q3 = Q.f4198c;
            q3.getClass();
            return q3.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            Q q4 = Q.f4198c;
            q4.getClass();
            this.memoizedHashCode = q4.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final AbstractC0197u k() {
        return (AbstractC0197u) e(4);
    }

    public final void m(int i3) {
        if (i3 >= 0) {
            this.memoizedSerializedSize = (i3 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(D2.h.k("serialized size must be non-negative, was ", i3));
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = K.f4177a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        K.c(this, sb, 0);
        return sb.toString();
    }
}
