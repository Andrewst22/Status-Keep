package K1;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
/* loaded from: classes.dex */
public final class c implements WildcardType, Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final Type f741m;

    /* renamed from: n  reason: collision with root package name */
    public final Type f742n;

    public c(Type[] typeArr, Type[] typeArr2) {
        boolean z3;
        boolean z4;
        if (typeArr2.length <= 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        d.c(z3);
        if (typeArr.length == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        d.c(z4);
        if (typeArr2.length == 1) {
            typeArr2[0].getClass();
            d.d(typeArr2[0]);
            d.c(typeArr[0] == Object.class);
            this.f742n = d.b(typeArr2[0]);
            this.f741m = Object.class;
            return;
        }
        typeArr[0].getClass();
        d.d(typeArr[0]);
        this.f742n = null;
        this.f741m = d.b(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && d.f(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f742n;
        return type != null ? new Type[]{type} : d.f743a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f741m};
    }

    public final int hashCode() {
        int i3;
        Type type = this.f742n;
        if (type != null) {
            i3 = type.hashCode() + 31;
        } else {
            i3 = 1;
        }
        return i3 ^ (this.f741m.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f742n;
        if (type != null) {
            return "? super " + d.l(type);
        }
        Type type2 = this.f741m;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.l(type2);
    }
}
