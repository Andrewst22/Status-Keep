package L1;

import com.dexterous.flutterlocalnotifications.RuntimeTypeAdapterFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public final class s extends I1.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f934a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f935b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f936c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f937d;

    public s(I1.k kVar, I1.r rVar, Type type) {
        this.f935b = kVar;
        this.f936c = rVar;
        this.f937d = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [Q1.b, L1.g] */
    @Override // I1.r
    public final Object a(Q1.b bVar) {
        switch (this.f934a) {
            case 0:
                return ((I1.r) this.f936c).a(bVar);
            default:
                I1.m j3 = K1.d.j(bVar);
                I1.p b3 = j3.b();
                RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = (RuntimeTypeAdapterFactory) this.f937d;
                I1.m mVar = (I1.m) b3.f476m.remove(RuntimeTypeAdapterFactory.access$000(runtimeTypeAdapterFactory));
                if (mVar != null) {
                    String c3 = mVar.c();
                    I1.r rVar = (I1.r) ((LinkedHashMap) this.f935b).get(c3);
                    if (rVar != 0) {
                        try {
                            ?? bVar2 = new Q1.b(g.f890F);
                            bVar2.f892B = new Object[32];
                            bVar2.f893C = 0;
                            bVar2.f894D = new String[32];
                            bVar2.f895E = new int[32];
                            bVar2.H(j3);
                            return rVar.a(bVar2);
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                    throw new RuntimeException("cannot deserialize " + RuntimeTypeAdapterFactory.access$100(runtimeTypeAdapterFactory) + " subtype named " + c3 + "; did you forget to register a subtype?");
                }
                throw new RuntimeException("cannot deserialize " + RuntimeTypeAdapterFactory.access$100(runtimeTypeAdapterFactory) + " because it does not define a field named " + RuntimeTypeAdapterFactory.access$000(runtimeTypeAdapterFactory));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.reflect.Type] */
    @Override // I1.r
    public final void b(Q1.c cVar, Object obj) {
        Class<?> cls;
        Object obj2 = this.f936c;
        Object obj3 = this.f937d;
        switch (this.f934a) {
            case 0:
                ?? r12 = (Type) obj3;
                if (obj != null && (r12 == Object.class || (r12 instanceof TypeVariable) || (r12 instanceof Class))) {
                    cls = obj.getClass();
                } else {
                    cls = r12;
                }
                I1.r rVar = (I1.r) obj2;
                if (cls != r12) {
                    I1.r c3 = ((I1.k) this.f935b).c(new P1.a(cls));
                    if (!(c3 instanceof o) || (rVar instanceof o)) {
                        rVar = c3;
                    }
                }
                rVar.b(cVar, obj);
                return;
            default:
                Class<?> cls2 = obj.getClass();
                RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = (RuntimeTypeAdapterFactory) obj3;
                String str = (String) RuntimeTypeAdapterFactory.access$200(runtimeTypeAdapterFactory).get(cls2);
                I1.r rVar2 = (I1.r) ((LinkedHashMap) obj2).get(cls2);
                if (rVar2 != null) {
                    rVar2.getClass();
                    try {
                        i iVar = new i();
                        rVar2.b(iVar, obj);
                        ArrayList arrayList = iVar.f898w;
                        if (arrayList.isEmpty()) {
                            I1.p b3 = iVar.f899y.b();
                            String access$000 = RuntimeTypeAdapterFactory.access$000(runtimeTypeAdapterFactory);
                            K1.m mVar = b3.f476m;
                            if (!mVar.containsKey(access$000)) {
                                I1.p pVar = new I1.p();
                                String access$0002 = RuntimeTypeAdapterFactory.access$000(runtimeTypeAdapterFactory);
                                I1.q qVar = new I1.q(str);
                                K1.m mVar2 = pVar.f476m;
                                mVar2.put(access$0002, qVar);
                                Iterator it = ((K1.k) mVar.entrySet()).iterator();
                                while (((K1.j) it).hasNext()) {
                                    K1.l b4 = ((K1.j) it).b();
                                    String str2 = (String) b4.getKey();
                                    Object obj4 = (I1.m) b4.getValue();
                                    if (obj4 == null) {
                                        obj4 = I1.o.f475m;
                                    }
                                    mVar2.put(str2, obj4);
                                }
                                t tVar = w.f945a;
                                l.d(cVar, pVar);
                                return;
                            }
                            throw new RuntimeException("cannot serialize " + cls2.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.access$000(runtimeTypeAdapterFactory));
                        }
                        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                throw new RuntimeException("cannot serialize " + cls2.getName() + "; did you forget to register a subtype?");
        }
    }

    public s(RuntimeTypeAdapterFactory runtimeTypeAdapterFactory, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f937d = runtimeTypeAdapterFactory;
        this.f935b = linkedHashMap;
        this.f936c = linkedHashMap2;
    }
}
