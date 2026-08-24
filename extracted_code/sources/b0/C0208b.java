package b0;

import D1.G;
import D1.I;
import D1.r;
import K.C0059m;
import R.C0112o;
import R.C0113p;
import R.U;
import U.A;
import U.AbstractC0123a;
import W.B;
import Y.P;
import Y.l0;
import android.util.Pair;
import android.util.SparseArray;
import c0.C0221a;
import c0.C0223c;
import c0.C0226f;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0.C0688l;
import o0.C0691o;
import o0.InterfaceC0698w;
import o0.InterfaceC0699x;
import o0.T;
import o0.V;
import o0.W;
import o0.b0;
import p0.C0734g;
import p0.C0735h;
import r0.s;
/* renamed from: b0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208b implements InterfaceC0699x, V {

    /* renamed from: J  reason: collision with root package name */
    public static final Pattern f4517J = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: K  reason: collision with root package name */
    public static final Pattern f4518K = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: A  reason: collision with root package name */
    public final d0.d f4519A;

    /* renamed from: B  reason: collision with root package name */
    public final d0.d f4520B;

    /* renamed from: C  reason: collision with root package name */
    public InterfaceC0698w f4521C;

    /* renamed from: F  reason: collision with root package name */
    public C0688l f4524F;

    /* renamed from: G  reason: collision with root package name */
    public C0223c f4525G;

    /* renamed from: H  reason: collision with root package name */
    public int f4526H;

    /* renamed from: I  reason: collision with root package name */
    public List f4527I;

    /* renamed from: m  reason: collision with root package name */
    public final int f4528m;

    /* renamed from: n  reason: collision with root package name */
    public final B0.b f4529n;

    /* renamed from: o  reason: collision with root package name */
    public final B f4530o;

    /* renamed from: p  reason: collision with root package name */
    public final d0.g f4531p;

    /* renamed from: q  reason: collision with root package name */
    public final e0.l f4532q;

    /* renamed from: r  reason: collision with root package name */
    public final C0059m f4533r;

    /* renamed from: s  reason: collision with root package name */
    public final long f4534s;

    /* renamed from: t  reason: collision with root package name */
    public final s0.o f4535t;

    /* renamed from: u  reason: collision with root package name */
    public final s0.e f4536u;

    /* renamed from: v  reason: collision with root package name */
    public final b0 f4537v;

    /* renamed from: w  reason: collision with root package name */
    public final C0207a[] f4538w;
    public final e0.l x;

    /* renamed from: y  reason: collision with root package name */
    public final o f4539y;

    /* renamed from: D  reason: collision with root package name */
    public C0735h[] f4522D = new C0735h[0];

    /* renamed from: E  reason: collision with root package name */
    public l[] f4523E = new l[0];

    /* renamed from: z  reason: collision with root package name */
    public final IdentityHashMap f4540z = new IdentityHashMap();

    public C0208b(int i3, C0223c c0223c, C0059m c0059m, int i4, B0.b bVar, B b3, d0.g gVar, d0.d dVar, e0.l lVar, d0.d dVar2, long j3, s0.o oVar, s0.e eVar, e0.l lVar2, C0210d c0210d, Z.m mVar) {
        String k3;
        int i5;
        int i6;
        int i7;
        List list;
        boolean[] zArr;
        int i8;
        C0113p[] c0113pArr;
        C0113p[] i9;
        C0226f a3;
        Integer num;
        d0.g gVar2 = gVar;
        this.f4528m = i3;
        this.f4525G = c0223c;
        this.f4533r = c0059m;
        this.f4526H = i4;
        this.f4529n = bVar;
        this.f4530o = b3;
        this.f4531p = gVar2;
        this.f4520B = dVar;
        this.f4532q = lVar;
        this.f4519A = dVar2;
        this.f4534s = j3;
        this.f4535t = oVar;
        this.f4536u = eVar;
        this.x = lVar2;
        this.f4539y = new o(c0223c, c0210d, eVar);
        lVar2.getClass();
        G g3 = I.f197n;
        D1.b0 b0Var = D1.b0.f231q;
        this.f4524F = new C0688l(b0Var, b0Var);
        c0.h b4 = c0223c.b(i4);
        List list2 = b4.f4748d;
        this.f4527I = list2;
        List list3 = b4.f4747c;
        int size = list3.size();
        HashMap hashMap = new HashMap(r.b(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            hashMap.put(Long.valueOf(((C0221a) list3.get(i10)).f4703a), Integer.valueOf(i10));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i10));
            arrayList.add(arrayList2);
            sparseArray.put(i10, arrayList2);
        }
        for (int i11 = 0; i11 < size; i11++) {
            C0221a c0221a = (C0221a) list3.get(i11);
            C0226f a4 = a("http://dashif.org/guidelines/trickmode", c0221a.f4707e);
            List list4 = c0221a.f4708f;
            a4 = a4 == null ? a("http://dashif.org/guidelines/trickmode", list4) : a4;
            int intValue = (a4 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(a4.f4739b)))) == null) ? i11 : num.intValue();
            if (intValue == i11 && (a3 = a("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                int i12 = A.f2405a;
                for (String str : a3.f4739b.split(",", -1)) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i11) {
                List list5 = (List) sparseArray.get(i11);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i11, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i13 = 0; i13 < size2; i13++) {
            int[] X2 = android.support.v4.media.session.a.X((Collection) arrayList.get(i13));
            iArr[i13] = X2;
            Arrays.sort(X2);
        }
        boolean[] zArr2 = new boolean[size2];
        C0113p[][] c0113pArr2 = new C0113p[size2];
        int i14 = 0;
        int i15 = 0;
        while (i14 < size2) {
            int[] iArr2 = iArr[i14];
            int length = iArr2.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    break;
                }
                List list7 = ((C0221a) list3.get(iArr2[i16])).f4705c;
                int[] iArr3 = iArr2;
                for (int i17 = 0; i17 < list7.size(); i17++) {
                    if (!((c0.m) list7.get(i17)).f4764p.isEmpty()) {
                        zArr2[i14] = true;
                        i15++;
                        break;
                    }
                }
                i16++;
                iArr2 = iArr3;
            }
            int[] iArr4 = iArr[i14];
            int length2 = iArr4.length;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = iArr4[i18];
                C0221a c0221a2 = (C0221a) list3.get(i19);
                List list8 = ((C0221a) list3.get(i19)).f4706d;
                int[] iArr5 = iArr4;
                int i20 = length2;
                int i21 = 0;
                while (i21 < list8.size()) {
                    C0226f c0226f = (C0226f) list8.get(i21);
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(c0226f.f4738a)) {
                        C0112o c0112o = new C0112o();
                        c0112o.f1937l = R.G.l("application/cea-608");
                        c0112o.f1926a = c0221a2.f4703a + ":cea608";
                        i9 = i(c0226f, f4517J, new C0113p(c0112o));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(c0226f.f4738a)) {
                        C0112o c0112o2 = new C0112o();
                        c0112o2.f1937l = R.G.l("application/cea-708");
                        c0112o2.f1926a = c0221a2.f4703a + ":cea708";
                        i9 = i(c0226f, f4518K, new C0113p(c0112o2));
                    } else {
                        i21++;
                        list8 = list9;
                    }
                    c0113pArr = i9;
                    i8 = 1;
                }
                i18++;
                iArr4 = iArr5;
                length2 = i20;
            }
            i8 = 1;
            c0113pArr = new C0113p[0];
            c0113pArr2[i14] = c0113pArr;
            if (c0113pArr.length != 0) {
                i15 += i8;
            }
            i14 += i8;
        }
        int size3 = list2.size() + i15 + size2;
        U[] uArr = new U[size3];
        C0207a[] c0207aArr = new C0207a[size3];
        int i22 = 0;
        int i23 = 0;
        while (i22 < size2) {
            int[] iArr6 = iArr[i22];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr6.length;
            int i24 = size2;
            int i25 = 0;
            while (i25 < length3) {
                arrayList3.addAll(((C0221a) list3.get(iArr6[i25])).f4705c);
                i25++;
                iArr = iArr;
            }
            int[][] iArr7 = iArr;
            int size4 = arrayList3.size();
            C0113p[] c0113pArr3 = new C0113p[size4];
            int i26 = 0;
            while (i26 < size4) {
                int i27 = size4;
                C0113p c0113p = ((c0.m) arrayList3.get(i26)).f4761m;
                ArrayList arrayList4 = arrayList3;
                C0112o a5 = c0113p.a();
                a5.f1925I = gVar2.c(c0113p);
                c0113pArr3[i26] = new C0113p(a5);
                i26++;
                size4 = i27;
                arrayList3 = arrayList4;
            }
            C0221a c0221a3 = (C0221a) list3.get(iArr6[0]);
            long j4 = c0221a3.f4703a;
            if (j4 != -1) {
                k3 = Long.toString(j4);
            } else {
                k3 = D2.h.k("unset:", i22);
            }
            int i28 = i23 + 1;
            if (zArr2[i22]) {
                i5 = i23 + 2;
                i6 = i28;
            } else {
                i5 = i28;
                i6 = -1;
            }
            if (c0113pArr2[i22].length != 0) {
                i7 = i5;
                i5++;
            } else {
                i7 = -1;
            }
            e(bVar, c0113pArr3);
            List list10 = list3;
            uArr[i23] = new U(k3, c0113pArr3);
            G g4 = I.f197n;
            D1.b0 b0Var2 = D1.b0.f231q;
            c0207aArr[i23] = new C0207a(c0221a3.f4704b, 0, iArr6, i23, i6, i7, -1, b0Var2);
            int i29 = i6;
            int i30 = -1;
            if (i29 != -1) {
                String str2 = k3 + ":emsg";
                C0112o c0112o3 = new C0112o();
                c0112o3.f1926a = str2;
                c0112o3.f1937l = R.G.l("application/x-emsg");
                list = list2;
                zArr = zArr2;
                uArr[i29] = new U(str2, new C0113p(c0112o3));
                c0207aArr[i29] = new C0207a(5, 1, iArr6, i23, -1, -1, -1, b0Var2);
                i30 = -1;
            } else {
                list = list2;
                zArr = zArr2;
            }
            if (i7 != i30) {
                c0207aArr[i7] = new C0207a(3, 1, iArr6, i23, -1, -1, -1, I.k(c0113pArr2[i22]));
                e(bVar, c0113pArr2[i22]);
                uArr[i7] = new U(k3 + ":cc", c0113pArr2[i22]);
            }
            i22++;
            size2 = i24;
            gVar2 = gVar;
            iArr = iArr7;
            i23 = i5;
            list3 = list10;
            zArr2 = zArr;
            list2 = list;
        }
        List list11 = list2;
        int i31 = 0;
        while (i31 < list11.size()) {
            List list12 = list11;
            c0.g gVar3 = (c0.g) list12.get(i31);
            C0112o c0112o4 = new C0112o();
            c0112o4.f1926a = gVar3.a();
            c0112o4.f1937l = R.G.l("application/x-emsg");
            uArr[i23] = new U(gVar3.a() + ":" + i31, new C0113p(c0112o4));
            G g5 = I.f197n;
            c0207aArr[i23] = new C0207a(5, 2, new int[0], -1, -1, -1, i31, D1.b0.f231q);
            i31++;
            list11 = list12;
            i23++;
        }
        Pair create = Pair.create(new b0(uArr), c0207aArr);
        this.f4537v = (b0) create.first;
        this.f4538w = (C0207a[]) create.second;
    }

    public static C0226f a(String str, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            C0226f c0226f = (C0226f) list.get(i3);
            if (str.equals(c0226f.f4738a)) {
                return c0226f;
            }
        }
        return null;
    }

    public static void e(B0.b bVar, C0113p[] c0113pArr) {
        String str;
        for (int i3 = 0; i3 < c0113pArr.length; i3++) {
            C0113p c0113p = c0113pArr[i3];
            A.i iVar = (A.i) bVar.f29p;
            if (iVar.f15a && ((B1.b) iVar.f16b).g(c0113p)) {
                C0112o a3 = c0113p.a();
                a3.f1937l = R.G.l("application/x-media3-cues");
                a3.f1922F = ((B1.b) iVar.f16b).e(c0113p);
                StringBuilder sb = new StringBuilder();
                sb.append(c0113p.f1974m);
                String str2 = c0113p.f1971j;
                if (str2 != null) {
                    str = " ".concat(str2);
                } else {
                    str = "";
                }
                sb.append(str);
                a3.f1934i = sb.toString();
                a3.f1942q = Long.MAX_VALUE;
                c0113p = new C0113p(a3);
            }
            c0113pArr[i3] = c0113p;
        }
    }

    public static C0113p[] i(C0226f c0226f, Pattern pattern, C0113p c0113p) {
        String str = c0226f.f4739b;
        if (str == null) {
            return new C0113p[]{c0113p};
        }
        int i3 = A.f2405a;
        String[] split = str.split(";", -1);
        C0113p[] c0113pArr = new C0113p[split.length];
        for (int i4 = 0; i4 < split.length; i4++) {
            Matcher matcher = pattern.matcher(split[i4]);
            if (!matcher.matches()) {
                return new C0113p[]{c0113p};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            C0112o a3 = c0113p.a();
            a3.f1926a = c0113p.f1962a + ":" + parseInt;
            a3.f1921E = parseInt;
            a3.f1929d = matcher.group(2);
            c0113pArr[i4] = new C0113p(a3);
        }
        return c0113pArr;
    }

    @Override // o0.InterfaceC0699x
    public final long b(long j3, l0 l0Var) {
        C0735h[] c0735hArr;
        for (C0735h c0735h : this.f4522D) {
            if (c0735h.f8801m == 2) {
                return c0735h.f8805q.b(j3, l0Var);
            }
        }
        return j3;
    }

    public final int c(int[] iArr, int i3) {
        int i4 = iArr[i3];
        if (i4 == -1) {
            return -1;
        }
        C0207a[] c0207aArr = this.f4538w;
        int i5 = c0207aArr[i4].f4513e;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 == i5 && c0207aArr[i7].f4511c == 0) {
                return i6;
            }
        }
        return -1;
    }

    @Override // o0.W
    public final boolean d() {
        return this.f4524F.d();
    }

    @Override // o0.V
    public final void f(W w3) {
        this.f4521C.f(this);
    }

    @Override // o0.InterfaceC0699x
    public final b0 g() {
        return this.f4537v;
    }

    @Override // o0.W
    public final boolean h(P p3) {
        return this.f4524F.h(p3);
    }

    @Override // o0.InterfaceC0699x
    public final void l(InterfaceC0698w interfaceC0698w, long j3) {
        this.f4521C = interfaceC0698w;
        interfaceC0698w.j(this);
    }

    @Override // o0.W
    public final long m() {
        return this.f4524F.m();
    }

    @Override // o0.InterfaceC0699x
    public final void o() {
        this.f4535t.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.InterfaceC0699x
    public final long p(s[] sVarArr, boolean[] zArr, o0.U[] uArr, boolean[] zArr2, long j3) {
        int i3;
        boolean z3;
        int[] iArr;
        int i4;
        int[] iArr2;
        o0.U[] uArr2;
        boolean z4;
        U u3;
        int i5;
        D1.b0 m3;
        int i6;
        n nVar;
        boolean z5;
        s[] sVarArr2 = sVarArr;
        o0.U[] uArr3 = uArr;
        int[] iArr3 = new int[sVarArr2.length];
        int i7 = 0;
        while (true) {
            i3 = -1;
            if (i7 >= sVarArr2.length) {
                break;
            }
            s sVar = sVarArr2[i7];
            if (sVar != null) {
                iArr3[i7] = this.f4537v.b(sVar.b());
            } else {
                iArr3[i7] = -1;
            }
            i7++;
        }
        for (int i8 = 0; i8 < sVarArr2.length; i8++) {
            if (sVarArr2[i8] == null || !zArr[i8]) {
                o0.U u4 = uArr3[i8];
                if (u4 instanceof C0735h) {
                    ((C0735h) u4).B(this);
                } else if (u4 instanceof C0734g) {
                    ((C0734g) u4).c();
                }
                uArr3[i8] = null;
            }
        }
        int i9 = 0;
        while (true) {
            z3 = true;
            if (i9 >= sVarArr2.length) {
                break;
            }
            o0.U u5 = uArr3[i9];
            if ((u5 instanceof C0691o) || (u5 instanceof C0734g)) {
                int c3 = c(iArr3, i9);
                if (c3 == -1) {
                    z5 = uArr3[i9] instanceof C0691o;
                } else {
                    o0.U u6 = uArr3[i9];
                    z5 = ((u6 instanceof C0734g) && ((C0734g) u6).f8787m == uArr3[c3]) ? false : false;
                }
                if (!z5) {
                    o0.U u7 = uArr3[i9];
                    if (u7 instanceof C0734g) {
                        ((C0734g) u7).c();
                    }
                    uArr3[i9] = null;
                }
            }
            i9++;
        }
        int i10 = 0;
        while (i10 < sVarArr2.length) {
            s sVar2 = sVarArr2[i10];
            if (sVar2 == null) {
                i4 = i10;
                iArr2 = iArr3;
                uArr2 = uArr3;
            } else {
                o0.U u8 = uArr3[i10];
                if (u8 == null) {
                    zArr2[i10] = z3;
                    C0207a c0207a = this.f4538w[iArr3[i10]];
                    int i11 = c0207a.f4511c;
                    if (i11 == 0) {
                        int i12 = c0207a.f4514f;
                        if (i12 != i3) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            u3 = this.f4537v.a(i12);
                            i5 = 1;
                        } else {
                            u3 = null;
                            i5 = 0;
                        }
                        int i13 = c0207a.f4515g;
                        if (i13 != i3) {
                            m3 = this.f4538w[i13].f4516h;
                        } else {
                            m3 = I.m();
                        }
                        int size = m3.size() + i5;
                        C0113p[] c0113pArr = new C0113p[size];
                        int[] iArr4 = new int[size];
                        if (z4) {
                            c0113pArr[0] = u3.a();
                            iArr4[0] = 5;
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i14 = 0; i14 < m3.size(); i14++) {
                            C0113p c0113p = (C0113p) m3.get(i14);
                            c0113pArr[i6] = c0113p;
                            iArr4[i6] = 3;
                            arrayList.add(c0113p);
                            i6++;
                        }
                        if (this.f4525G.f4716d && z4) {
                            o oVar = this.f4539y;
                            nVar = new n(oVar, oVar.f4626m);
                        } else {
                            nVar = null;
                        }
                        B0.b bVar = this.f4529n;
                        s0.o oVar2 = this.f4535t;
                        C0223c c0223c = this.f4525G;
                        int i15 = i10;
                        C0059m c0059m = this.f4533r;
                        int[] iArr5 = iArr3;
                        int i16 = this.f4526H;
                        int[] iArr6 = c0207a.f4509a;
                        int i17 = c0207a.f4510b;
                        long j4 = this.f4534s;
                        B b3 = this.f4530o;
                        W.h a3 = ((W.g) bVar.f28o).a();
                        if (b3 != null) {
                            a3.y(b3);
                        }
                        i4 = i15;
                        n nVar2 = nVar;
                        iArr2 = iArr5;
                        C0735h c0735h = new C0735h(c0207a.f4510b, iArr4, c0113pArr, new k((A.i) bVar.f29p, oVar2, c0223c, c0059m, i16, iArr6, sVar2, i17, a3, j4, bVar.f27n, z4, arrayList, nVar), this, this.f4536u, j3, this.f4531p, this.f4520B, this.f4532q, this.f4519A);
                        synchronized (this) {
                            this.f4540z.put(c0735h, nVar2);
                        }
                        uArr2 = uArr;
                        uArr2[i4] = c0735h;
                    } else {
                        i4 = i10;
                        iArr2 = iArr3;
                        uArr2 = uArr3;
                        if (i11 == 2) {
                            uArr2[i4] = new l((c0.g) this.f4527I.get(c0207a.f4512d), sVar2.b().a(), this.f4525G.f4716d);
                        }
                    }
                } else {
                    i4 = i10;
                    iArr2 = iArr3;
                    uArr2 = uArr3;
                    if (u8 instanceof C0735h) {
                        ((k) ((C0735h) u8).f8805q).f4606j = sVar2;
                    }
                }
            }
            i10 = i4 + 1;
            uArr3 = uArr2;
            iArr3 = iArr2;
            z3 = true;
            i3 = -1;
            sVarArr2 = sVarArr;
        }
        int[] iArr7 = iArr3;
        o0.U[] uArr4 = uArr3;
        int i18 = 0;
        while (i18 < sVarArr.length) {
            if (uArr4[i18] == 0 && sVarArr[i18] != null) {
                iArr = iArr7;
                C0207a c0207a2 = this.f4538w[iArr[i18]];
                if (c0207a2.f4511c == 1) {
                    int c4 = c(iArr, i18);
                    if (c4 == -1) {
                        uArr4[i18] = new Object();
                    } else {
                        C0735h c0735h2 = (C0735h) uArr4[c4];
                        int i19 = c0207a2.f4510b;
                        int i20 = 0;
                        while (true) {
                            T[] tArr = c0735h2.f8813z;
                            if (i20 < tArr.length) {
                                if (c0735h2.f8802n[i20] == i19) {
                                    boolean[] zArr3 = c0735h2.f8804p;
                                    AbstractC0123a.j(!zArr3[i20]);
                                    zArr3[i20] = true;
                                    tArr[i20].G(j3, true);
                                    uArr4[i18] = new C0734g(c0735h2, c0735h2, tArr[i20], i20);
                                    break;
                                }
                                i20++;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    }
                    i18++;
                    iArr7 = iArr;
                }
            } else {
                iArr = iArr7;
            }
            i18++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object[] objArr : uArr4) {
            if (objArr instanceof C0735h) {
                arrayList2.add((C0735h) objArr);
            } else if (objArr instanceof l) {
                arrayList3.add((l) objArr);
            }
        }
        C0735h[] c0735hArr = new C0735h[arrayList2.size()];
        this.f4522D = c0735hArr;
        arrayList2.toArray(c0735hArr);
        l[] lVarArr = new l[arrayList3.size()];
        this.f4523E = lVarArr;
        arrayList3.toArray(lVarArr);
        e0.l lVar = this.x;
        AbstractList w3 = r.w(arrayList2, new Z.c(27));
        lVar.getClass();
        this.f4524F = new C0688l(arrayList2, w3);
        return j3;
    }

    @Override // o0.InterfaceC0699x
    public final long q(long j3) {
        l[] lVarArr;
        long j4;
        for (C0735h c0735h : this.f4522D) {
            c0735h.C(j3);
        }
        for (l lVar : this.f4523E) {
            int b3 = A.b(lVar.f4613o, j3, true);
            lVar.f4617s = b3;
            if (lVar.f4614p && b3 == lVar.f4613o.length) {
                j4 = j3;
            } else {
                j4 = -9223372036854775807L;
            }
            lVar.f4618t = j4;
        }
        return j3;
    }

    @Override // o0.InterfaceC0699x
    public final void r(long j3) {
        for (C0735h c0735h : this.f4522D) {
            c0735h.r(j3);
        }
    }

    @Override // o0.W
    public final long t() {
        return this.f4524F.t();
    }

    @Override // o0.InterfaceC0699x
    public final long u() {
        return -9223372036854775807L;
    }

    @Override // o0.W
    public final void v(long j3) {
        this.f4524F.v(j3);
    }
}
