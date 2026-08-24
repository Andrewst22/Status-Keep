package Q0;

import D1.G;
import D1.I;
import D1.b0;
import R.C0112o;
import R.F;
import U.A;
import U.AbstractC0123a;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import w0.AbstractC0892b;
import w0.E;
import w0.H;
import w0.InterfaceC0890A;
/* loaded from: classes.dex */
public final class q implements w0.o, InterfaceC0890A {

    /* renamed from: A  reason: collision with root package name */
    public L0.a f1620A;

    /* renamed from: a  reason: collision with root package name */
    public final T0.j f1621a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1622b;

    /* renamed from: c  reason: collision with root package name */
    public final U.t f1623c;

    /* renamed from: d  reason: collision with root package name */
    public final U.t f1624d;

    /* renamed from: e  reason: collision with root package name */
    public final U.t f1625e;

    /* renamed from: f  reason: collision with root package name */
    public final U.t f1626f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f1627g;

    /* renamed from: h  reason: collision with root package name */
    public final s f1628h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f1629i;

    /* renamed from: j  reason: collision with root package name */
    public b0 f1630j;

    /* renamed from: k  reason: collision with root package name */
    public int f1631k;

    /* renamed from: l  reason: collision with root package name */
    public int f1632l;

    /* renamed from: m  reason: collision with root package name */
    public long f1633m;

    /* renamed from: n  reason: collision with root package name */
    public int f1634n;

    /* renamed from: o  reason: collision with root package name */
    public U.t f1635o;

    /* renamed from: p  reason: collision with root package name */
    public int f1636p;

    /* renamed from: q  reason: collision with root package name */
    public int f1637q;

    /* renamed from: r  reason: collision with root package name */
    public int f1638r;

    /* renamed from: s  reason: collision with root package name */
    public int f1639s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1640t;

    /* renamed from: u  reason: collision with root package name */
    public w0.q f1641u;

    /* renamed from: v  reason: collision with root package name */
    public p[] f1642v;

    /* renamed from: w  reason: collision with root package name */
    public long[][] f1643w;
    public int x;

    /* renamed from: y  reason: collision with root package name */
    public long f1644y;

    /* renamed from: z  reason: collision with root package name */
    public int f1645z;

    public q(T0.j jVar, int i3) {
        int i4;
        this.f1621a = jVar;
        this.f1622b = i3;
        G g3 = I.f197n;
        this.f1630j = b0.f231q;
        if ((i3 & 4) != 0) {
            i4 = 3;
        } else {
            i4 = 0;
        }
        this.f1631k = i4;
        this.f1628h = new s();
        this.f1629i = new ArrayList();
        this.f1626f = new U.t(16);
        this.f1627g = new ArrayDeque();
        this.f1623c = new U.t(V.g.f2652a);
        this.f1624d = new U.t(4);
        this.f1625e = new U.t();
        this.f1636p = -1;
        this.f1641u = w0.q.f9620l;
        this.f1642v = new p[0];
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        p[] pVarArr;
        this.f1627g.clear();
        this.f1634n = 0;
        this.f1636p = -1;
        this.f1637q = 0;
        this.f1638r = 0;
        this.f1639s = 0;
        if (j3 == 0) {
            if (this.f1631k != 3) {
                this.f1631k = 0;
                this.f1634n = 0;
                return;
            }
            s sVar = this.f1628h;
            sVar.f1650a.clear();
            sVar.f1651b = 0;
            this.f1629i.clear();
            return;
        }
        for (p pVar : this.f1642v) {
            x xVar = pVar.f1616b;
            int f3 = A.f(xVar.f1692f, j4, false);
            while (true) {
                if (f3 >= 0) {
                    if ((xVar.f1693g[f3] & 1) != 0) {
                        break;
                    }
                    f3--;
                } else {
                    f3 = -1;
                    break;
                }
            }
            if (f3 == -1) {
                f3 = xVar.a(j4);
            }
            pVar.f1619e = f3;
            H h3 = pVar.f1618d;
            if (h3 != null) {
                h3.f9523b = false;
                h3.f9524c = 0;
            }
        }
    }

    @Override // w0.InterfaceC0890A
    public final boolean c() {
        return true;
    }

    @Override // w0.o
    public final w0.o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(w0.p pVar) {
        boolean z3;
        b0 b0Var;
        if ((this.f1622b & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        E j3 = t.j(pVar, false, z3);
        if (j3 != null) {
            b0Var = I.o(j3);
        } else {
            G g3 = I.f197n;
            b0Var = b0.f231q;
        }
        this.f1630j = b0Var;
        if (j3 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // w0.o
    public final int f(w0.p pVar, R.r rVar) {
        a aVar;
        boolean z3;
        boolean z4;
        F f3;
        int i3;
        boolean z5;
        long j3;
        int i4;
        char c3;
        char c4;
        boolean z6;
        int i5;
        int i6 = 3;
        int i7 = 0;
        int i8 = 2;
        while (true) {
            int i9 = 4;
            int i10 = this.f1631k;
            ArrayDeque arrayDeque = this.f1627g;
            U.t tVar = this.f1625e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != i8) {
                        if (i10 == i6) {
                            ArrayList arrayList = this.f1629i;
                            s sVar = this.f1628h;
                            int i11 = sVar.f1651b;
                            if (i11 != 0) {
                                if (i11 != 1) {
                                    ArrayList arrayList2 = sVar.f1650a;
                                    char c5 = 2819;
                                    short s3 = 2192;
                                    if (i11 != i8) {
                                        if (i11 == i6) {
                                            long D3 = pVar.D();
                                            int m3 = (int) ((pVar.m() - pVar.D()) - sVar.f1652c);
                                            U.t tVar2 = new U.t(m3);
                                            pVar.readFully(tVar2.f2477a, i7, m3);
                                            int i12 = 0;
                                            while (i12 < arrayList2.size()) {
                                                r rVar2 = (r) arrayList2.get(i12);
                                                tVar2.G((int) (rVar2.f1646a - D3));
                                                tVar2.H(i9);
                                                int j4 = tVar2.j();
                                                Charset charset = C1.d.f153c;
                                                String s4 = tVar2.s(j4, charset);
                                                switch (s4.hashCode()) {
                                                    case -1711564334:
                                                        if (s4.equals("SlowMotion_Data")) {
                                                            c3 = 0;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case -1332107749:
                                                        if (s4.equals("Super_SlowMotion_Edit_Data")) {
                                                            c3 = 1;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case -1251387154:
                                                        if (s4.equals("Super_SlowMotion_Data")) {
                                                            c3 = 2;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case -830665521:
                                                        if (s4.equals("Super_SlowMotion_Deflickering_On")) {
                                                            c3 = 3;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    case 1760745220:
                                                        if (s4.equals("Super_SlowMotion_BGM")) {
                                                            c3 = 4;
                                                            break;
                                                        }
                                                        c3 = 65535;
                                                        break;
                                                    default:
                                                        c3 = 65535;
                                                        break;
                                                }
                                                switch (c3) {
                                                    case 0:
                                                        c4 = 2192;
                                                        break;
                                                    case 1:
                                                        c4 = 2819;
                                                        break;
                                                    case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                                                        c4 = 2816;
                                                        break;
                                                    case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                                                        c4 = 2820;
                                                        break;
                                                    case N.k.LONG_FIELD_NUMBER /* 4 */:
                                                        c4 = 2817;
                                                        break;
                                                    default:
                                                        throw R.H.a(null, "Invalid SEF name");
                                                }
                                                int i13 = rVar2.f1647b - (j4 + 8);
                                                if (c4 != 2192) {
                                                    if (c4 != 2816 && c4 != 2817 && c4 != c5 && c4 != 2820) {
                                                        throw new IllegalStateException();
                                                    }
                                                } else {
                                                    ArrayList arrayList3 = new ArrayList();
                                                    List l3 = s.f1649e.l(tVar2.s(i13, charset));
                                                    for (int i14 = 0; i14 < l3.size(); i14++) {
                                                        List l4 = s.f1648d.l((CharSequence) l3.get(i14));
                                                        if (l4.size() == 3) {
                                                            try {
                                                                arrayList3.add(new L0.b(1 << (Integer.parseInt((String) l4.get(2)) - 1), Long.parseLong((String) l4.get(i7)), Long.parseLong((String) l4.get(1))));
                                                            } catch (NumberFormatException e2) {
                                                                throw R.H.a(e2, null);
                                                            }
                                                        } else {
                                                            throw R.H.a(null, null);
                                                        }
                                                    }
                                                    arrayList.add(new L0.c(arrayList3));
                                                }
                                                i12++;
                                                i9 = 4;
                                                c5 = 2819;
                                            }
                                            rVar.f1989a = 0L;
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    } else {
                                        long m4 = pVar.m();
                                        int i15 = sVar.f1652c - 20;
                                        U.t tVar3 = new U.t(i15);
                                        pVar.readFully(tVar3.f2477a, i7, i15);
                                        int i16 = 0;
                                        while (i16 < i15 / 12) {
                                            tVar3.H(2);
                                            byte[] bArr = tVar3.f2477a;
                                            int i17 = tVar3.f2478b;
                                            int i18 = i17 + 1;
                                            tVar3.f2478b = i18;
                                            tVar3.f2478b = i17 + 2;
                                            short s5 = (short) (((bArr[i18] & 255) << 8) | (bArr[i17] & 255));
                                            if (s5 != s3 && s5 != 2816) {
                                                if (s5 != 2817) {
                                                    if (s5 != 2819 && s5 != 2820) {
                                                        tVar3.H(8);
                                                        i16++;
                                                        s3 = 2192;
                                                    }
                                                    arrayList2.add(new r((m4 - sVar.f1652c) - tVar3.j(), tVar3.j()));
                                                    i16++;
                                                    s3 = 2192;
                                                }
                                            }
                                            arrayList2.add(new r((m4 - sVar.f1652c) - tVar3.j(), tVar3.j()));
                                            i16++;
                                            s3 = 2192;
                                        }
                                        if (arrayList2.isEmpty()) {
                                            rVar.f1989a = 0L;
                                        } else {
                                            sVar.f1651b = 3;
                                            rVar.f1989a = ((r) arrayList2.get(0)).f1646a;
                                        }
                                    }
                                } else {
                                    U.t tVar4 = new U.t(8);
                                    pVar.readFully(tVar4.f2477a, 0, 8);
                                    sVar.f1652c = tVar4.j() + 8;
                                    if (tVar4.h() != 1397048916) {
                                        rVar.f1989a = 0L;
                                    } else {
                                        rVar.f1989a = pVar.D() - (sVar.f1652c - 12);
                                        sVar.f1651b = 2;
                                    }
                                }
                                i4 = 1;
                            } else {
                                long m5 = pVar.m();
                                if (m5 != -1 && m5 >= 8) {
                                    j3 = m5 - 8;
                                } else {
                                    j3 = 0;
                                }
                                rVar.f1989a = j3;
                                i4 = 1;
                                sVar.f1651b = 1;
                            }
                            if (rVar.f1989a == 0) {
                                this.f1631k = 0;
                                this.f1634n = 0;
                            }
                            return i4;
                        }
                        throw new IllegalStateException();
                    }
                    long D4 = pVar.D();
                    if (this.f1636p == -1) {
                        int i19 = -1;
                        int i20 = -1;
                        boolean z7 = true;
                        boolean z8 = true;
                        int i21 = 0;
                        long j5 = Long.MAX_VALUE;
                        long j6 = Long.MAX_VALUE;
                        long j7 = Long.MAX_VALUE;
                        while (true) {
                            p[] pVarArr = this.f1642v;
                            if (i21 >= pVarArr.length) {
                                break;
                            }
                            p pVar2 = pVarArr[i21];
                            int i22 = pVar2.f1619e;
                            x xVar = pVar2.f1616b;
                            if (i22 != xVar.f1688b) {
                                long j8 = xVar.f1689c[i22];
                                long[][] jArr = this.f1643w;
                                int i23 = A.f2405a;
                                long j9 = jArr[i21][i22];
                                long j10 = j8 - D4;
                                if (j10 >= 0 && j10 < 262144) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                if ((!z5 && z8) || (z5 == z8 && j10 < j7)) {
                                    z8 = z5;
                                    j6 = j9;
                                    i20 = i21;
                                    j7 = j10;
                                }
                                if (j9 < j5) {
                                    z7 = z5;
                                    j5 = j9;
                                    i19 = i21;
                                }
                            }
                            i21++;
                        }
                        if (j5 == Long.MAX_VALUE || !z7 || j6 < j5 + 10485760) {
                            i19 = i20;
                        }
                        this.f1636p = i19;
                        if (i19 == -1) {
                            return -1;
                        }
                    }
                    p pVar3 = this.f1642v[this.f1636p];
                    w0.G g3 = pVar3.f1617c;
                    int i24 = pVar3.f1619e;
                    x xVar2 = pVar3.f1616b;
                    long j11 = xVar2.f1689c[i24];
                    int i25 = xVar2.f1690d[i24];
                    long j12 = (j11 - D4) + this.f1637q;
                    if (j12 >= 0 && j12 < 262144) {
                        u uVar = pVar3.f1615a;
                        if (uVar.f1660g == 1) {
                            j12 += 8;
                            i25 -= 8;
                        }
                        pVar.d((int) j12);
                        int i26 = uVar.f1663j;
                        H h3 = pVar3.f1618d;
                        if (i26 != 0) {
                            U.t tVar5 = this.f1624d;
                            byte[] bArr2 = tVar5.f2477a;
                            boolean z9 = false;
                            bArr2[0] = 0;
                            bArr2[1] = 0;
                            bArr2[2] = 0;
                            int i27 = 4 - i26;
                            while (this.f1638r < i25) {
                                int i28 = this.f1639s;
                                if (i28 == 0) {
                                    pVar.readFully(bArr2, i27, i26);
                                    this.f1637q += i26;
                                    tVar5.G(z9 ? 1 : 0);
                                    int h4 = tVar5.h();
                                    if (h4 >= 0) {
                                        this.f1639s = h4;
                                        U.t tVar6 = this.f1623c;
                                        tVar6.G(z9 ? 1 : 0);
                                        g3.f(4, tVar6);
                                        this.f1638r += 4;
                                        i25 += i27;
                                    } else {
                                        throw R.H.a(null, "Invalid NAL length");
                                    }
                                } else {
                                    int d3 = g3.d(pVar, i28, z9);
                                    this.f1637q += d3;
                                    this.f1638r += d3;
                                    this.f1639s -= d3;
                                    z9 = false;
                                }
                            }
                        } else {
                            if ("audio/ac4".equals(uVar.f1659f.f1974m)) {
                                if (this.f1638r == 0) {
                                    AbstractC0892b.i(i25, tVar);
                                    i3 = 7;
                                    g3.f(7, tVar);
                                    this.f1638r += 7;
                                } else {
                                    i3 = 7;
                                }
                                i25 += i3;
                            } else if (h3 != null) {
                                h3.c(pVar);
                            }
                            while (true) {
                                int i29 = this.f1638r;
                                if (i29 >= i25) {
                                    break;
                                }
                                int d4 = g3.d(pVar, i25 - i29, false);
                                this.f1637q += d4;
                                this.f1638r += d4;
                                this.f1639s -= d4;
                            }
                        }
                        int i30 = i25;
                        long j13 = xVar2.f1692f[i24];
                        int i31 = xVar2.f1693g[i24];
                        if (h3 != null) {
                            h3.b(g3, j13, i31, i30, 0, null);
                            if (i24 + 1 == xVar2.f1688b) {
                                h3.a(g3, null);
                            }
                        } else {
                            g3.b(j13, i31, i30, 0, null);
                        }
                        pVar3.f1619e++;
                        this.f1636p = -1;
                        this.f1637q = 0;
                        this.f1638r = 0;
                        this.f1639s = 0;
                        return 0;
                    }
                    rVar.f1989a = j11;
                    return 1;
                }
                long j14 = this.f1633m - this.f1634n;
                long D5 = pVar.D() + j14;
                U.t tVar7 = this.f1635o;
                if (tVar7 != null) {
                    pVar.readFully(tVar7.f2477a, this.f1634n, (int) j14);
                    if (this.f1632l == 1718909296) {
                        this.f1640t = true;
                        tVar7.G(8);
                        int h5 = tVar7.h();
                        if (h5 != 1751476579) {
                            if (h5 != 1903435808) {
                                i5 = 0;
                            } else {
                                i5 = 1;
                            }
                        } else {
                            i5 = 2;
                        }
                        if (i5 == 0) {
                            tVar7.H(4);
                            while (true) {
                                if (tVar7.a() > 0) {
                                    int h6 = tVar7.h();
                                    if (h6 != 1751476579) {
                                        if (h6 != 1903435808) {
                                            i5 = 0;
                                            continue;
                                        } else {
                                            i5 = 1;
                                            continue;
                                        }
                                    } else {
                                        i5 = 2;
                                        continue;
                                    }
                                    if (i5 != 0) {
                                        break;
                                    }
                                } else {
                                    i5 = 0;
                                    break;
                                }
                            }
                        }
                        this.f1645z = i5;
                    } else if (!arrayDeque.isEmpty()) {
                        ((a) arrayDeque.peek()).f1525p.add(new b(this.f1632l, tVar7));
                    }
                } else {
                    if (!this.f1640t && this.f1632l == 1835295092) {
                        this.f1645z = 1;
                    }
                    if (j14 < 262144) {
                        pVar.d((int) j14);
                    } else {
                        rVar.f1989a = pVar.D() + j14;
                        z6 = true;
                        m(D5);
                        if (!z6 && this.f1631k != 2) {
                            return 1;
                        }
                    }
                }
                z6 = false;
                m(D5);
                if (!z6) {
                }
            } else {
                int i32 = this.f1634n;
                U.t tVar8 = this.f1626f;
                if (i32 == 0) {
                    if (!pVar.i(tVar8.f2477a, 0, 8, true)) {
                        if (this.f1645z == 2 && (this.f1622b & 2) != 0) {
                            w0.G w3 = this.f1641u.w(0, 4);
                            L0.a aVar2 = this.f1620A;
                            if (aVar2 == null) {
                                f3 = null;
                            } else {
                                f3 = new F(aVar2);
                            }
                            C0112o c0112o = new C0112o();
                            c0112o.f1935j = f3;
                            D2.h.p(c0112o, w3);
                            this.f1641u.s();
                            this.f1641u.n(new w0.s(-9223372036854775807L));
                            return -1;
                        }
                        return -1;
                    }
                    this.f1634n = 8;
                    tVar8.G(0);
                    this.f1633m = tVar8.w();
                    this.f1632l = tVar8.h();
                }
                long j15 = this.f1633m;
                if (j15 == 1) {
                    pVar.readFully(tVar8.f2477a, 8, 8);
                    this.f1634n += 8;
                    this.f1633m = tVar8.z();
                } else if (j15 == 0) {
                    long m6 = pVar.m();
                    if (m6 == -1 && (aVar = (a) arrayDeque.peek()) != null) {
                        m6 = aVar.f1524o;
                    }
                    if (m6 != -1) {
                        this.f1633m = (m6 - pVar.D()) + this.f1634n;
                    }
                }
                long j16 = this.f1633m;
                int i33 = this.f1634n;
                if (j16 >= i33) {
                    int i34 = this.f1632l;
                    if (i34 != 1836019574 && i34 != 1953653099 && i34 != 1835297121 && i34 != 1835626086 && i34 != 1937007212 && i34 != 1701082227 && i34 != 1835365473) {
                        if (i34 != 1835296868 && i34 != 1836476516 && i34 != 1751411826 && i34 != 1937011556 && i34 != 1937011827 && i34 != 1937011571 && i34 != 1668576371 && i34 != 1701606260 && i34 != 1937011555 && i34 != 1937011578 && i34 != 1937013298 && i34 != 1937007471 && i34 != 1668232756 && i34 != 1953196132 && i34 != 1718909296 && i34 != 1969517665 && i34 != 1801812339 && i34 != 1768715124) {
                            long D6 = pVar.D();
                            long j17 = this.f1634n;
                            long j18 = D6 - j17;
                            if (this.f1632l == 1836086884) {
                                this.f1620A = new L0.a(0L, j18, -9223372036854775807L, j18 + j17, this.f1633m - j17);
                            }
                            this.f1635o = null;
                            this.f1631k = 1;
                        } else {
                            if (i33 == 8) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            AbstractC0123a.j(z3);
                            if (this.f1633m <= 2147483647L) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            AbstractC0123a.j(z4);
                            U.t tVar9 = new U.t((int) this.f1633m);
                            System.arraycopy(tVar8.f2477a, 0, tVar9.f2477a, 0, 8);
                            this.f1635o = tVar9;
                            this.f1631k = 1;
                        }
                    } else {
                        long D7 = pVar.D();
                        long j19 = this.f1633m;
                        long j20 = this.f1634n;
                        long j21 = (D7 + j19) - j20;
                        if (j19 != j20 && this.f1632l == 1835365473) {
                            tVar.D(8);
                            pVar.z(tVar.f2477a, 0, 8);
                            byte[] bArr3 = j.f1556a;
                            int i35 = tVar.f2478b;
                            tVar.H(4);
                            if (tVar.h() != 1751411826) {
                                i35 += 4;
                            }
                            tVar.G(i35);
                            pVar.d(tVar.f2478b);
                            pVar.c();
                        }
                        arrayDeque.push(new a(j21, this.f1632l));
                        if (this.f1633m == this.f1634n) {
                            m(j21);
                        } else {
                            this.f1631k = 0;
                            this.f1634n = 0;
                        }
                    }
                    i6 = 3;
                } else {
                    throw R.H.c("Atom size less than header length (unsupported).");
                }
            }
            i7 = 0;
            i8 = 2;
        }
    }

    @Override // w0.o
    public final void h(w0.q qVar) {
        if ((this.f1622b & 16) == 0) {
            qVar = new B1.e(qVar, this.f1621a);
        }
        this.f1641u = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6 A[EDGE_INSN: B:71:0x00d6->B:63:0x00d6 ?: BREAK  , SYNTHETIC] */
    @Override // w0.InterfaceC0890A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w0.z i(long r21) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.q.i(long):w0.z");
    }

    @Override // w0.InterfaceC0890A
    public final long k() {
        return this.f1644y;
    }

    @Override // w0.o
    public final List l() {
        return this.f1630j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e5, code lost:
        if (r4 != 1851878757) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e7, code lost:
        r3 = r12.q(r23 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f1, code lost:
        if (r4 != 1684108385) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f3, code lost:
        r8 = r23;
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f7, code lost:
        r12.H(r23 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fc, code lost:
        r9 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0200, code lost:
        r30 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0202, code lost:
        if (r2 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0204, code lost:
        if (r3 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0207, code lost:
        if (r5 != (-1)) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020a, code lost:
        r12.G(r5);
        r12.H(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x021c, code lost:
        r3 = new K0.k(r2, r3, r12.q(r8 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x021f, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0220, code lost:
        r12.G(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0225, code lost:
        r30 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x022a, code lost:
        r2 = 16777215 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0231, code lost:
        if (r2 != 6516084) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0233, code lost:
        r3 = Q0.t.c(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x023b, code lost:
        if (r2 == 7233901) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0240, code lost:
        if (r2 != 7631467) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0247, code lost:
        if (r2 == 6516589) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x024c, code lost:
        if (r2 != 7828084) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0253, code lost:
        if (r2 != 6578553) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0255, code lost:
        r3 = Q0.t.i(r3, r12, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x025f, code lost:
        if (r2 != 4280916) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0261, code lost:
        r3 = Q0.t.i(r3, r12, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x026b, code lost:
        if (r2 != 7630703) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x026d, code lost:
        r3 = Q0.t.i(r3, r12, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0277, code lost:
        if (r2 != 6384738) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0279, code lost:
        r3 = Q0.t.i(r3, r12, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0283, code lost:
        if (r2 != 7108978) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0285, code lost:
        r3 = Q0.t.i(r3, r12, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x028f, code lost:
        if (r2 != 6776174) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0291, code lost:
        r3 = Q0.t.i(r3, r12, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0299, code lost:
        if (r2 != 6779504) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x029b, code lost:
        r3 = Q0.t.i(r3, r12, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a3, code lost:
        U.AbstractC0123a.m("MetadataUtil", "Skipped unknown metadata entry: " + Q0.c.b(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02b6, code lost:
        r12.G(r13);
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02bb, code lost:
        r3 = Q0.t.i(r3, r12, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c3, code lost:
        r3 = Q0.t.i(r3, r12, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02cb, code lost:
        if (r3 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02cd, code lost:
        r7.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02d0, code lost:
        r5 = r27;
        r9 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02dd, code lost:
        r12.G(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02e0, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02e1, code lost:
        r30 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02e8, code lost:
        if (r7.isEmpty() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02eb, code lost:
        r2 = new R.F(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0335, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
        r12.G(r5);
        r5 = r5 + r14;
        r12.H(r2);
        r7 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
        r13 = r12.f2478b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
        if (r13 >= r5) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
        r13 = r12.h() + r13;
        r3 = r12.h();
        r2 = (r3 >> 24) & 255;
        r27 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        if (r2 == 169) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
        if (r2 != 253) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
        r30 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
        if (r3 != 1735291493) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
        r2 = K0.j.a(Q0.t.f(r12) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
        if (r2 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
        r3 = new K0.n("TCON", null, D1.I.o(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
        U.AbstractC0123a.A("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
        r12.G(r13);
        r30 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
        if (r3 != 1684632427) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f7, code lost:
        r3 = Q0.t.e(r3, r12, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
        if (r3 != 1953655662) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0106, code lost:
        r3 = Q0.t.e(r3, r12, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0110, code lost:
        if (r3 != 1953329263) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0112, code lost:
        r3 = Q0.t.g(r3, "TBPM", r12, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011e, code lost:
        if (r3 != 1668311404) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0120, code lost:
        r3 = Q0.t.g(r3, "TCMP", r12, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
        if (r3 != 1668249202) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        r3 = Q0.t.d(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0135, code lost:
        if (r3 != 1631670868) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0137, code lost:
        r3 = Q0.t.i(r3, r12, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0141, code lost:
        if (r3 != 1936682605) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
        r3 = Q0.t.i(r3, r12, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014d, code lost:
        if (r3 != 1936679276) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014f, code lost:
        r3 = Q0.t.i(r3, r12, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0159, code lost:
        if (r3 != 1936679282) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015b, code lost:
        r3 = Q0.t.i(r3, r12, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0165, code lost:
        if (r3 != 1936679265) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0167, code lost:
        r3 = Q0.t.i(r3, r12, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0172, code lost:
        if (r3 != 1936679791) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0174, code lost:
        r3 = Q0.t.i(r3, r12, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017f, code lost:
        if (r3 != 1920233063) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0181, code lost:
        r3 = Q0.t.g(r3, "ITUNESADVISORY", r12, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018d, code lost:
        if (r3 != 1885823344) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018f, code lost:
        r3 = Q0.t.g(r3, "ITUNESGAPLESS", r12, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019c, code lost:
        if (r3 != 1936683886) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019e, code lost:
        r3 = Q0.t.i(r3, r12, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a9, code lost:
        if (r3 != 1953919848) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ab, code lost:
        r3 = Q0.t.i(r3, r12, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b6, code lost:
        if (r3 != 757935405) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b8, code lost:
        r2 = null;
        r3 = null;
        r5 = -1;
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bc, code lost:
        r14 = r12.f2478b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01be, code lost:
        if (r14 >= r13) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c0, code lost:
        r23 = r12.h();
        r4 = r12.h();
        r12.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d1, code lost:
        if (r4 != 1835360622) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d3, code lost:
        r2 = r12.q(r23 - 12);
        r30 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01de, code lost:
        r30 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:264:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06bd A[LOOP:13: B:337:0x06ba->B:339:0x06bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0699 A[EDGE_INSN: B:405:0x0699->B:336:0x0699 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(long r33) {
        /*
            Method dump skipped, instructions count: 1873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.q.m(long):void");
    }

    @Override // w0.o
    public final void release() {
    }
}
