package P1;

import K1.d;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Class f1465a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f1466b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1467c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type b3 = d.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f1466b = b3;
            this.f1465a = d.h(b3);
            this.f1467c = b3.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (d.f(this.f1466b, ((a) obj).f1466b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1467c;
    }

    public final String toString() {
        return d.l(this.f1466b);
    }

    public a(Type type) {
        type.getClass();
        Type b3 = d.b(type);
        this.f1466b = b3;
        this.f1465a = d.h(b3);
        this.f1467c = b3.hashCode();
    }
}
