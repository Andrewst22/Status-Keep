package L1;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
/* loaded from: classes.dex */
public final class a implements I1.s {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f881m;

    public /* synthetic */ a(int i3) {
        this.f881m = i3;
    }

    @Override // I1.s
    public final I1.r create(I1.k kVar, P1.a aVar) {
        Type componentType;
        switch (this.f881m) {
            case 0:
                Type type = aVar.f1466b;
                boolean z3 = type instanceof GenericArrayType;
                if (!z3 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                if (z3) {
                    componentType = ((GenericArrayType) type).getGenericComponentType();
                } else {
                    componentType = ((Class) type).getComponentType();
                }
                return new b(kVar, kVar.c(new P1.a(componentType)), K1.d.h(componentType));
            case 1:
                if (aVar.f1465a == Date.class) {
                    return new d();
                }
                return null;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                if (aVar.f1465a == Object.class) {
                    return new m(kVar);
                }
                return null;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                Class cls = aVar.f1465a;
                if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
                    if (!cls.isEnum()) {
                        cls = cls.getSuperclass();
                    }
                    return new b(cls);
                }
                return null;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                if (aVar.f1465a == java.sql.Date.class) {
                    return new O1.a(0);
                }
                return null;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                if (aVar.f1465a == Time.class) {
                    return new O1.a(1);
                }
                return null;
            default:
                if (aVar.f1465a == Timestamp.class) {
                    kVar.getClass();
                    return new O1.a(kVar.c(new P1.a(Date.class)));
                }
                return null;
        }
    }
}
