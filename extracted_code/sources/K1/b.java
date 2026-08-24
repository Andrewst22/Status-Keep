package K1;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final Type f738m;

    /* renamed from: n  reason: collision with root package name */
    public final Type f739n;

    /* renamed from: o  reason: collision with root package name */
    public final Type[] f740o;

    public b(Type type, Type type2, Type... typeArr) {
        Type b3;
        boolean z3;
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z4 = true;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (type == null && !z3) {
                z4 = false;
            }
            d.c(z4);
        }
        if (type == null) {
            b3 = null;
        } else {
            b3 = d.b(type);
        }
        this.f738m = b3;
        this.f739n = d.b(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f740o = typeArr2;
        int length = typeArr2.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f740o[i3].getClass();
            d.d(this.f740o[i3]);
            Type[] typeArr3 = this.f740o;
            typeArr3[i3] = d.b(typeArr3[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && d.f(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f740o.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f738m;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f739n;
    }

    public final int hashCode() {
        int i3;
        int hashCode = Arrays.hashCode(this.f740o) ^ this.f739n.hashCode();
        Type type = this.f738m;
        if (type != null) {
            i3 = type.hashCode();
        } else {
            i3 = 0;
        }
        return hashCode ^ i3;
    }

    public final String toString() {
        Type[] typeArr = this.f740o;
        int length = typeArr.length;
        Type type = this.f739n;
        if (length == 0) {
            return d.l(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.l(type));
        sb.append("<");
        sb.append(d.l(typeArr[0]));
        for (int i3 = 1; i3 < length; i3++) {
            sb.append(", ");
            sb.append(d.l(typeArr[i3]));
        }
        sb.append(">");
        return sb.toString();
    }
}
