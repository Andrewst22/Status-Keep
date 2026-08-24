package O2;

import K2.C0090t;
import K2.P;
import K2.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m2.AbstractC0635d;
import s2.AbstractC0805d;
import s2.C0808g;
import t2.AbstractC0827d;
import t2.AbstractC0828e;
import t2.C0835l;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class n extends w2.b implements N2.e {

    /* renamed from: p  reason: collision with root package name */
    public final N2.e f1352p;

    /* renamed from: q  reason: collision with root package name */
    public final u2.i f1353q;

    /* renamed from: r  reason: collision with root package name */
    public final int f1354r;

    /* renamed from: s  reason: collision with root package name */
    public u2.i f1355s;

    /* renamed from: t  reason: collision with root package name */
    public InterfaceC0866d f1356t;

    public n(N2.e eVar, u2.i iVar) {
        super(k.f1349m, u2.j.f9461m);
        this.f1352p = eVar;
        this.f1353q = iVar;
        this.f1354r = ((Number) iVar.c(0, m.f1351n)).intValue();
    }

    @Override // N2.e
    public final Object a(Object obj, InterfaceC0866d interfaceC0866d) {
        try {
            Object p3 = p(interfaceC0866d, obj);
            if (p3 == EnumC0879a.f9494m) {
                return p3;
            }
            return C0808g.f9229a;
        } catch (Throwable th) {
            this.f1355s = new i(th, interfaceC0866d.h());
            throw th;
        }
    }

    @Override // w2.b, w2.c
    public final w2.c e() {
        InterfaceC0866d interfaceC0866d = this.f1356t;
        if (interfaceC0866d instanceof w2.c) {
            return (w2.c) interfaceC0866d;
        }
        return null;
    }

    @Override // w2.b, u2.InterfaceC0866d
    public final u2.i h() {
        u2.i iVar = this.f1355s;
        if (iVar == null) {
            return u2.j.f9461m;
        }
        return iVar;
    }

    @Override // w2.b
    public final StackTraceElement j() {
        return null;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        Throwable a3 = AbstractC0805d.a(obj);
        if (a3 != null) {
            this.f1355s = new i(a3, h());
        }
        InterfaceC0866d interfaceC0866d = this.f1356t;
        if (interfaceC0866d != null) {
            interfaceC0866d.k(obj);
        }
        return EnumC0879a.f9494m;
    }

    public final Object p(InterfaceC0866d interfaceC0866d, Object obj) {
        List list;
        Comparable comparable;
        int i3;
        String str;
        u2.i h3 = interfaceC0866d.h();
        P p3 = (P) h3.d(C0090t.f856n);
        if (p3 != null && !p3.a()) {
            throw ((Z) p3).A();
        }
        u2.i iVar = this.f1355s;
        if (iVar != h3) {
            int i4 = 0;
            if (iVar instanceof i) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) iVar).f1347m + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                D2.i.e(str2, "<this>");
                J2.b bVar = new J2.b(str2);
                if (!bVar.hasNext()) {
                    list = C0835l.f9264m;
                } else {
                    Object next = bVar.next();
                    if (!bVar.hasNext()) {
                        list = AbstractC0635d.s(next);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (bVar.hasNext()) {
                            arrayList.add(bVar.next());
                        }
                        list = arrayList;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!J2.i.W((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    int length = str3.length();
                    int i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            char charAt = str3.charAt(i5);
                            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                                break;
                            }
                            i5++;
                        } else {
                            i5 = -1;
                            break;
                        }
                    }
                    if (i5 == -1) {
                        i5 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i5));
                }
                Iterator it2 = arrayList3.iterator();
                if (!it2.hasNext()) {
                    comparable = null;
                } else {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                }
                Integer num = (Integer) comparable;
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = 0;
                }
                int length2 = str2.length();
                list.size();
                int B3 = AbstractC0828e.B(list);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    int i6 = i4 + 1;
                    if (i4 >= 0) {
                        String str4 = (String) obj3;
                        if ((i4 == 0 || i4 == B3) && J2.i.W(str4)) {
                            str = null;
                        } else {
                            D2.i.e(str4, "<this>");
                            if (i3 >= 0) {
                                int length3 = str4.length();
                                if (i3 <= length3) {
                                    length3 = i3;
                                }
                                str = str4.substring(length3);
                                D2.i.d(str, "substring(...)");
                            } else {
                                throw new IllegalArgumentException(("Requested character count " + i3 + " is less than zero.").toString());
                            }
                        }
                        if (str != null) {
                            arrayList4.add(str);
                        }
                        i4 = i6;
                    } else {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                }
                StringBuilder sb = new StringBuilder(length2);
                AbstractC0827d.E(arrayList4, sb, "\n", "", "", -1, "...", null);
                throw new IllegalStateException(sb.toString().toString());
            } else if (((Number) h3.c(0, new q(this))).intValue() == this.f1354r) {
                this.f1355s = h3;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f1353q + ",\n\t\tbut emission happened in " + h3 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.f1356t = interfaceC0866d;
        o oVar = p.f1358a;
        N2.e eVar = this.f1352p;
        D2.i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        oVar.getClass();
        Object a3 = eVar.a(obj, this);
        if (!D2.i.a(a3, EnumC0879a.f9494m)) {
            this.f1356t = null;
        }
        return a3;
    }
}
