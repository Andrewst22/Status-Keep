package K1;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
/* loaded from: classes.dex */
public final class a implements GenericArrayType, Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final Type f737m;

    public a(Type type) {
        this.f737m = d.b(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && d.f(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f737m;
    }

    public final int hashCode() {
        return this.f737m.hashCode();
    }

    public final String toString() {
        return d.l(this.f737m) + "[]";
    }
}
