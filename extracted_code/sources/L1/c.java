package L1;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
/* loaded from: classes.dex */
public final class c implements I1.s {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f886m;

    /* renamed from: n  reason: collision with root package name */
    public final B1.a f887n;

    public /* synthetic */ c(B1.a aVar, int i3) {
        this.f886m = i3;
        this.f887n = aVar;
    }

    public static I1.r a(B1.a aVar, I1.k kVar, P1.a aVar2, J1.a aVar3) {
        z1.b bVar;
        I1.r rVar;
        Object K3 = aVar.D(new P1.a(aVar3.value())).K();
        if (K3 instanceof I1.r) {
            rVar = (I1.r) K3;
        } else if (K3 instanceof I1.s) {
            rVar = ((I1.s) K3).create(kVar, aVar2);
        } else if (K3 instanceof z1.b) {
            if (K3 instanceof z1.b) {
                bVar = (z1.b) K3;
            } else {
                bVar = null;
            }
            rVar = new r(bVar, kVar, aVar2, null);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + K3.getClass().getName() + " as a @JsonAdapter for " + K1.d.l(aVar2.f1466b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (rVar != null && aVar3.nullSafe()) {
            return new I1.i(rVar, 2);
        }
        return rVar;
    }

    @Override // I1.s
    public final I1.r create(I1.k kVar, P1.a aVar) {
        Type[] typeArr;
        I1.r rVar;
        Type type = Object.class;
        B1.a aVar2 = this.f887n;
        switch (this.f886m) {
            case 0:
                Class cls = aVar.f1465a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                Type type2 = aVar.f1466b;
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                K1.d.c(Collection.class.isAssignableFrom(cls));
                Type k3 = K1.d.k(type2, cls, K1.d.g(type2, cls, Collection.class), new HashMap());
                if (k3 instanceof WildcardType) {
                    k3 = ((WildcardType) k3).getUpperBounds()[0];
                }
                if (k3 instanceof ParameterizedType) {
                    type = ((ParameterizedType) k3).getActualTypeArguments()[0];
                }
                return new b(kVar, type, kVar.c(new P1.a(type)), aVar2.D(aVar));
            case 1:
                J1.a aVar3 = (J1.a) aVar.f1465a.getAnnotation(J1.a.class);
                if (aVar3 == null) {
                    return null;
                }
                return a(aVar2, kVar, aVar, aVar3);
            default:
                if (!Map.class.isAssignableFrom(aVar.f1465a)) {
                    return null;
                }
                Type type3 = aVar.f1466b;
                Class h3 = K1.d.h(type3);
                if (type3 == Properties.class) {
                    typeArr = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    K1.d.c(Map.class.isAssignableFrom(h3));
                    Type k4 = K1.d.k(type3, h3, K1.d.g(type3, h3, Map.class), new HashMap());
                    if (k4 instanceof ParameterizedType) {
                        typeArr = ((ParameterizedType) k4).getActualTypeArguments();
                    } else {
                        typeArr = new Type[]{type, type};
                    }
                }
                Type type4 = typeArr[0];
                if (type4 != Boolean.TYPE && type4 != Boolean.class) {
                    rVar = kVar.c(new P1.a(type4));
                } else {
                    rVar = w.f947c;
                }
                return new j(this, kVar, typeArr[0], rVar, typeArr[1], kVar.c(new P1.a(typeArr[1])), aVar2.D(aVar));
        }
    }
}
