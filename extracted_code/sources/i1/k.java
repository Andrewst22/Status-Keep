package I1;

import L1.t;
import L1.u;
import L1.w;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal f468a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f469b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final B1.a f470c;

    /* renamed from: d  reason: collision with root package name */
    public final L1.c f471d;

    /* renamed from: e  reason: collision with root package name */
    public final List f472e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f473f;

    static {
        new P1.a(Object.class);
    }

    public k(K1.f fVar, HashMap hashMap, ArrayList arrayList) {
        B1.a aVar = new B1.a(hashMap);
        this.f470c = aVar;
        this.f473f = true;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(w.f968y);
        arrayList2.add(L1.m.f908b);
        arrayList2.add(fVar);
        arrayList2.addAll(arrayList);
        arrayList2.add(w.f959o);
        arrayList2.add(w.f951g);
        arrayList2.add(w.f948d);
        arrayList2.add(w.f949e);
        arrayList2.add(w.f950f);
        L1.l lVar = w.f955k;
        arrayList2.add(new u(Long.TYPE, Long.class, lVar));
        arrayList2.add(new u(Double.TYPE, Double.class, new h(0)));
        arrayList2.add(new u(Float.TYPE, Float.class, new h(1)));
        arrayList2.add(L1.l.f906b);
        arrayList2.add(w.f952h);
        arrayList2.add(w.f953i);
        arrayList2.add(new t(AtomicLong.class, new i(new i(lVar, 0), 2), 0));
        arrayList2.add(new t(AtomicLongArray.class, new i(new i(lVar, 1), 2), 0));
        arrayList2.add(w.f954j);
        arrayList2.add(w.f956l);
        arrayList2.add(w.f960p);
        arrayList2.add(w.f961q);
        arrayList2.add(new t(BigDecimal.class, w.f957m, 0));
        arrayList2.add(new t(BigInteger.class, w.f958n, 0));
        arrayList2.add(w.f962r);
        arrayList2.add(w.f963s);
        arrayList2.add(w.f965u);
        arrayList2.add(w.f966v);
        arrayList2.add(w.x);
        arrayList2.add(w.f964t);
        arrayList2.add(w.f946b);
        arrayList2.add(L1.d.f888b);
        arrayList2.add(w.f967w);
        if (O1.b.f1325a) {
            arrayList2.add(O1.b.f1327c);
            arrayList2.add(O1.b.f1326b);
            arrayList2.add(O1.b.f1328d);
        }
        arrayList2.add(L1.b.f882d);
        arrayList2.add(w.f945a);
        arrayList2.add(new L1.c(aVar, 0));
        arrayList2.add(new L1.c(aVar, 2));
        L1.c cVar = new L1.c(aVar, 1);
        this.f471d = cVar;
        arrayList2.add(cVar);
        arrayList2.add(w.f969z);
        arrayList2.add(new L1.p(aVar, fVar, cVar));
        this.f472e = Collections.unmodifiableList(arrayList2);
    }

    public static void a(double d3) {
        if (!Double.isNaN(d3) && !Double.isInfinite(d3)) {
            return;
        }
        throw new IllegalArgumentException(d3 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.reflect.Type r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r5)
            Q1.b r5 = new Q1.b
            r5.<init>(r1)
            java.lang.String r1 = "AssertionError (GSON 2.8.9): "
            r2 = 1
            r5.f1698n = r2
            r3 = 0
            r5.w()     // Catch: java.lang.Throwable -> L27 java.lang.AssertionError -> L29 java.io.IOException -> L2b java.lang.IllegalStateException -> L2d java.io.EOFException -> L57
            P1.a r2 = new P1.a     // Catch: java.lang.Throwable -> L27 java.lang.AssertionError -> L29 java.io.IOException -> L2b java.lang.IllegalStateException -> L2d java.io.EOFException -> L2f
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L27 java.lang.AssertionError -> L29 java.io.IOException -> L2b java.lang.IllegalStateException -> L2d java.io.EOFException -> L2f
            I1.r r6 = r4.c(r2)     // Catch: java.lang.Throwable -> L27 java.lang.AssertionError -> L29 java.io.IOException -> L2b java.lang.IllegalStateException -> L2d java.io.EOFException -> L2f
            java.lang.Object r0 = r6.a(r5)     // Catch: java.lang.Throwable -> L27 java.lang.AssertionError -> L29 java.io.IOException -> L2b java.lang.IllegalStateException -> L2d java.io.EOFException -> L2f
        L24:
            r5.f1698n = r3
            goto L5b
        L27:
            r6 = move-exception
            goto L85
        L29:
            r6 = move-exception
            goto L32
        L2b:
            r6 = move-exception
            goto L4b
        L2d:
            r6 = move-exception
            goto L51
        L2f:
            r6 = move-exception
            r2 = 0
            goto L58
        L32:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r6.getMessage()     // Catch: java.lang.Throwable -> L27
            r2.append(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L27
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L27
            r0.initCause(r6)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L4b:
            I1.n r0 = new I1.n     // Catch: java.lang.Throwable -> L27
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L51:
            I1.n r0 = new I1.n     // Catch: java.lang.Throwable -> L27
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L57:
            r6 = move-exception
        L58:
            if (r2 == 0) goto L7f
            goto L24
        L5b:
            if (r0 == 0) goto L7e
            int r5 = r5.w()     // Catch: java.io.IOException -> L6e Q1.d -> L70
            r6 = 10
            if (r5 != r6) goto L66
            goto L7e
        L66:
            I1.n r5 = new I1.n     // Catch: java.io.IOException -> L6e Q1.d -> L70
            java.lang.String r6 = "JSON document was not fully consumed."
            r5.<init>(r6)     // Catch: java.io.IOException -> L6e Q1.d -> L70
            throw r5     // Catch: java.io.IOException -> L6e Q1.d -> L70
        L6e:
            r5 = move-exception
            goto L72
        L70:
            r5 = move-exception
            goto L78
        L72:
            I1.n r6 = new I1.n
            r6.<init>(r5)
            throw r6
        L78:
            I1.n r6 = new I1.n
            r6.<init>(r5)
            throw r6
        L7e:
            return r0
        L7f:
            I1.n r0 = new I1.n     // Catch: java.lang.Throwable -> L27
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L85:
            r5.f1698n = r3
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.k.b(java.lang.String, java.lang.reflect.Type):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [I1.j, java.lang.Object] */
    public final r c(P1.a aVar) {
        boolean z3;
        ConcurrentHashMap concurrentHashMap = this.f469b;
        r rVar = (r) concurrentHashMap.get(aVar);
        if (rVar != null) {
            return rVar;
        }
        ThreadLocal threadLocal = this.f468a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z3 = true;
        } else {
            z3 = false;
        }
        j jVar = (j) map.get(aVar);
        if (jVar != null) {
            return jVar;
        }
        try {
            ?? obj = new Object();
            map.put(aVar, obj);
            for (s sVar : this.f472e) {
                r create = sVar.create(this, aVar);
                if (create != null) {
                    if (obj.f467a == null) {
                        obj.f467a = create;
                        concurrentHashMap.put(aVar, create);
                        map.remove(aVar);
                        if (z3) {
                            threadLocal.remove();
                        }
                        return create;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + aVar);
        } catch (Throwable th) {
            map.remove(aVar);
            if (z3) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final r d(s sVar, P1.a aVar) {
        List<s> list = this.f472e;
        if (!list.contains(sVar)) {
            sVar = this.f471d;
        }
        boolean z3 = false;
        for (s sVar2 : list) {
            if (!z3) {
                if (sVar2 == sVar) {
                    z3 = true;
                }
            } else {
                r create = sVar2.create(this, aVar);
                if (create != null) {
                    return create;
                }
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final Q1.c e(Writer writer) {
        Q1.c cVar = new Q1.c(writer);
        cVar.f1719t = false;
        return cVar;
    }

    public final String f(Serializable serializable) {
        if (serializable == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                g(e(stringWriter));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        Class cls = serializable.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            h(serializable, cls, e(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final void g(Q1.c cVar) {
        o oVar = o.f475m;
        boolean z3 = cVar.f1716q;
        cVar.f1716q = true;
        boolean z4 = cVar.f1717r;
        cVar.f1717r = this.f473f;
        boolean z5 = cVar.f1719t;
        cVar.f1719t = false;
        try {
            try {
                try {
                    t tVar = w.f945a;
                    L1.l.d(cVar, oVar);
                    cVar.f1716q = z3;
                    cVar.f1717r = z4;
                    cVar.f1719t = z5;
                } catch (AssertionError e2) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e2.getMessage());
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        } catch (Throwable th) {
            cVar.f1716q = z3;
            cVar.f1717r = z4;
            cVar.f1719t = z5;
            throw th;
        }
    }

    public final void h(Serializable serializable, Class cls, Q1.c cVar) {
        r c3 = c(new P1.a(cls));
        boolean z3 = cVar.f1716q;
        cVar.f1716q = true;
        boolean z4 = cVar.f1717r;
        cVar.f1717r = this.f473f;
        boolean z5 = cVar.f1719t;
        cVar.f1719t = false;
        try {
            try {
                try {
                    c3.b(cVar, serializable);
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            cVar.f1716q = z3;
            cVar.f1717r = z4;
            cVar.f1719t = z5;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f472e + ",instanceCreators:" + this.f470c + "}";
    }
}
