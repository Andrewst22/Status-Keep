package Q0;

import D1.I;
import D1.b0;
import R.C0109l;
import R.C0110m;
import R.C0112o;
import R.C0113p;
import R.H;
import U.A;
import U.AbstractC0123a;
import U.y;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import w0.E;
import w0.G;
/* loaded from: classes.dex */
public final class n implements w0.o {

    /* renamed from: K  reason: collision with root package name */
    public static final byte[] f1576K = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final C0113p L;

    /* renamed from: A  reason: collision with root package name */
    public long f1577A;

    /* renamed from: B  reason: collision with root package name */
    public m f1578B;

    /* renamed from: C  reason: collision with root package name */
    public int f1579C;

    /* renamed from: D  reason: collision with root package name */
    public int f1580D;

    /* renamed from: E  reason: collision with root package name */
    public int f1581E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f1582F;

    /* renamed from: G  reason: collision with root package name */
    public w0.q f1583G;

    /* renamed from: H  reason: collision with root package name */
    public G[] f1584H;

    /* renamed from: I  reason: collision with root package name */
    public G[] f1585I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f1586J;

    /* renamed from: a  reason: collision with root package name */
    public final T0.j f1587a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1588b;

    /* renamed from: c  reason: collision with root package name */
    public final u f1589c;

    /* renamed from: d  reason: collision with root package name */
    public final List f1590d;

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f1595i;

    /* renamed from: j  reason: collision with root package name */
    public final U.t f1596j;

    /* renamed from: k  reason: collision with root package name */
    public final y f1597k;

    /* renamed from: p  reason: collision with root package name */
    public final b0.n f1602p;

    /* renamed from: q  reason: collision with root package name */
    public b0 f1603q;

    /* renamed from: r  reason: collision with root package name */
    public int f1604r;

    /* renamed from: s  reason: collision with root package name */
    public int f1605s;

    /* renamed from: t  reason: collision with root package name */
    public long f1606t;

    /* renamed from: u  reason: collision with root package name */
    public int f1607u;

    /* renamed from: v  reason: collision with root package name */
    public U.t f1608v;

    /* renamed from: w  reason: collision with root package name */
    public long f1609w;
    public int x;

    /* renamed from: y  reason: collision with root package name */
    public long f1610y;

    /* renamed from: z  reason: collision with root package name */
    public long f1611z;

    /* renamed from: l  reason: collision with root package name */
    public final B1.a f1598l = new B1.a(1);

    /* renamed from: m  reason: collision with root package name */
    public final U.t f1599m = new U.t(16);

    /* renamed from: f  reason: collision with root package name */
    public final U.t f1592f = new U.t(V.g.f2652a);

    /* renamed from: g  reason: collision with root package name */
    public final U.t f1593g = new U.t(5);

    /* renamed from: h  reason: collision with root package name */
    public final U.t f1594h = new U.t();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayDeque f1600n = new ArrayDeque();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayDeque f1601o = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray f1591e = new SparseArray();

    static {
        C0112o c0112o = new C0112o();
        c0112o.f1937l = R.G.l("application/x-emsg");
        L = new C0113p(c0112o);
    }

    public n(T0.j jVar, int i3, y yVar, u uVar, List list, b0.n nVar) {
        this.f1587a = jVar;
        this.f1588b = i3;
        this.f1597k = yVar;
        this.f1589c = uVar;
        this.f1590d = Collections.unmodifiableList(list);
        this.f1602p = nVar;
        byte[] bArr = new byte[16];
        this.f1595i = bArr;
        this.f1596j = new U.t(bArr);
        D1.G g3 = I.f197n;
        this.f1603q = b0.f231q;
        this.f1611z = -9223372036854775807L;
        this.f1610y = -9223372036854775807L;
        this.f1577A = -9223372036854775807L;
        this.f1583G = w0.q.f9620l;
        this.f1584H = new G[0];
        this.f1585I = new G[0];
    }

    public static C0110m a(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = (b) arrayList.get(i3);
            if (bVar.f1529n == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f1527o.f2477a;
                C1.j h3 = t.h(bArr);
                if (h3 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) h3.f168n;
                }
                if (uuid == null) {
                    AbstractC0123a.A("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C0109l(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C0110m(null, false, (C0109l[]) arrayList2.toArray(new C0109l[0]));
    }

    public static void c(U.t tVar, int i3, w wVar) {
        boolean z3;
        tVar.G(i3 + 8);
        int h3 = tVar.h();
        if ((h3 & 1) == 0) {
            if ((h3 & 2) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int y3 = tVar.y();
            if (y3 == 0) {
                Arrays.fill(wVar.f1681l, 0, wVar.f1674e, false);
                return;
            } else if (y3 == wVar.f1674e) {
                Arrays.fill(wVar.f1681l, 0, y3, z3);
                int a3 = tVar.a();
                U.t tVar2 = wVar.f1683n;
                tVar2.D(a3);
                wVar.f1680k = true;
                wVar.f1684o = true;
                tVar.f(tVar2.f2477a, 0, tVar2.f2479c);
                tVar2.G(0);
                wVar.f1684o = false;
                return;
            } else {
                throw H.a(null, "Senc sample count " + y3 + " is different from fragment sample count" + wVar.f1674e);
            }
        }
        throw H.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        SparseArray sparseArray = this.f1591e;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((m) sparseArray.valueAt(i3)).d();
        }
        this.f1601o.clear();
        this.x = 0;
        this.f1610y = j4;
        this.f1600n.clear();
        this.f1604r = 0;
        this.f1607u = 0;
    }

    @Override // w0.o
    public final w0.o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(w0.p pVar) {
        b0 b0Var;
        E j3 = t.j(pVar, true, false);
        if (j3 != null) {
            b0Var = I.o(j3);
        } else {
            D1.G g3 = I.f197n;
            b0Var = b0.f231q;
        }
        this.f1603q = b0Var;
        if (j3 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ef, code lost:
        if ("video/hevc".equals(r2) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f7, code lost:
        if (((r13 & 126) >> 1) != 39) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f9, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fb, code lost:
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fe, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ff, code lost:
        r30.f1582F = r2;
        r30.f1580D += 5;
        r30.f1579C += r8;
        r4 = r19;
        r5 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0210, code lost:
        r13 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021b, code lost:
        throw R.H.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021c, code lost:
        r19 = r4;
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0223, code lost:
        if (r30.f1582F == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0225, code lost:
        r4 = r30.f1594h;
        r4.D(r2);
        r23 = r8;
        r24 = r14;
        ((w0.l) r31).i(r4.f2477a, 0, r30.f1581E, false);
        r11.f(r30.f1581E, r4);
        r2 = r30.f1581E;
        r5 = V.g.f(r4.f2477a, r4.f2479c);
        r4.G("video/hevc".equals(r13.f1974m) ? 1 : 0);
        r4.F(r5);
        w0.AbstractC0892b.f(r9, r4, r30.f1585I);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x025a, code lost:
        r23 = r8;
        r24 = r14;
        r2 = r11.d(r31, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0263, code lost:
        r30.f1580D += r2;
        r30.f1581E -= r2;
        r4 = r19;
        r5 = r22;
        r8 = r23;
        r14 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0276, code lost:
        r29 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0279, code lost:
        r29 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x027b, code lost:
        r2 = r30.f1580D;
        r4 = r30.f1579C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x027f, code lost:
        if (r2 >= r4) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0281, code lost:
        r30.f1580D += r11.d(r31, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x028f, code lost:
        if (r3.f1575l != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0291, code lost:
        r1 = r3.f1567d.f1693g[r3.f1569f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a0, code lost:
        if (r7.f1679j[r3.f1569f] == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a2, code lost:
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a4, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a9, code lost:
        if (r3.a() == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02ab, code lost:
        r1 = r1 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ae, code lost:
        r25 = r1;
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b4, code lost:
        if (r1 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b6, code lost:
        r28 = r1.f1667c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02bb, code lost:
        r28 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02bd, code lost:
        r11.b(r9, r25, r30.f1579C, 0, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ce, code lost:
        if (r12.isEmpty() != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d0, code lost:
        r1 = (Q0.l) r12.removeFirst();
        r30.x -= r1.f1563c;
        r2 = r1.f1562b;
        r4 = r1.f1561a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e1, code lost:
        if (r2 == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e3, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e4, code lost:
        r2 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02e6, code lost:
        if (r29 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e8, code lost:
        r4 = r2.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ec, code lost:
        r6 = r30.f1584H;
        r7 = r6.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f0, code lost:
        if (r8 >= r7) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f2, code lost:
        r6[r8].b(r4, 1, r1.f1563c, r30.x, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0308, code lost:
        r29 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x030f, code lost:
        if (r3.b() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0311, code lost:
        r30.f1578B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0314, code lost:
        r30.f1604r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
        r4 = r30.f1604r;
        r7 = r3.f1565b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
        if (r4 != 3) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
        if (r3.f1575l != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
        r4 = r3.f1567d.f1690d[r3.f1569f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
        r4 = r7.f1677h[r3.f1569f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
        r30.f1579C = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
        if (r3.f1569f >= r3.f1572i) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
        ((w0.l) r31).d(r4);
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
        if (r1 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
        r2 = r7.f1683n;
        r1 = r1.f1668d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
        if (r1 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ee, code lost:
        r2.H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f1, code lost:
        r1 = r3.f1569f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f5, code lost:
        if (r7.f1680k == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fb, code lost:
        if (r7.f1681l[r1] == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fd, code lost:
        r2.H(r2.A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010a, code lost:
        if (r3.b() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010c, code lost:
        r30.f1578B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010f, code lost:
        r30.f1604r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0112, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011b, code lost:
        if (r3.f1567d.f1687a.f1660g != 1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011d, code lost:
        r30.f1579C = r4 - 8;
        ((w0.l) r31).d(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0136, code lost:
        if ("audio/ac4".equals(r3.f1567d.f1687a.f1659f.f1974m) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0138, code lost:
        r30.f1580D = r3.c(r30.f1579C, 7);
        r4 = r30.f1579C;
        r9 = r30.f1596j;
        w0.AbstractC0892b.i(r4, r9);
        r3.f1564a.f(7, r9);
        r30.f1580D += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0153, code lost:
        r30.f1580D = r3.c(r30.f1579C, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015b, code lost:
        r30.f1579C += r30.f1580D;
        r30.f1604r = 4;
        r30.f1581E = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0167, code lost:
        r4 = r3.f1567d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016b, code lost:
        if (r3.f1575l != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016d, code lost:
        r9 = r4.f1692f[r3.f1569f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0174, code lost:
        r9 = r7.f1678i[r3.f1569f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017b, code lost:
        if (r13 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017d, code lost:
        r9 = r13.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0181, code lost:
        r4 = r4.f1687a;
        r8 = r4.f1663j;
        r11 = r3.f1564a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0187, code lost:
        if (r8 == 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0189, code lost:
        r14 = r30.f1593g;
        r15 = r14.f2477a;
        r15[0] = 0;
        r15[1] = 0;
        r15[2] = 0;
        r5 = r8 + 1;
        r8 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019f, code lost:
        if (r30.f1580D >= r30.f1579C) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a1, code lost:
        r2 = r30.f1581E;
        r29 = r13;
        r13 = r4.f1659f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a9, code lost:
        if (r2 != 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ab, code lost:
        r19 = r4;
        ((w0.l) r31).i(r15, r8, r5, false);
        r14.G(0);
        r2 = r14.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bc, code lost:
        if (r2 < 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01be, code lost:
        r30.f1581E = r2 - 1;
        r2 = r30.f1592f;
        r2.G(0);
        r11.f(4, r2);
        r11.f(1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d2, code lost:
        if (r30.f1585I.length <= 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d4, code lost:
        r2 = r13.f1974m;
        r13 = r15[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
        if ("video/avc".equals(r2) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e0, code lost:
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e5, code lost:
        if ((r13 & 31) == 6) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e8, code lost:
        r22 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // w0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(w0.p r31, R.r r32) {
        /*
            Method dump skipped, instructions count: 1986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.n.f(w0.p, R.r):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x03aa, code lost:
        if (U.A.U(r36 + r0[0], 1000000, r15.f1657d, java.math.RoundingMode.FLOOR) >= r15.f1658e) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x07f7, code lost:
        r4 = r0;
        r4.f1604r = 0;
        r4.f1607u = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x07fd, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r55) {
        /*
            Method dump skipped, instructions count: 2046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.n.g(long):void");
    }

    @Override // w0.o
    public final void h(w0.q qVar) {
        w0.q qVar2;
        int i3;
        int i4 = this.f1588b;
        if ((i4 & 32) == 0) {
            qVar2 = new B1.e(qVar, this.f1587a);
        } else {
            qVar2 = qVar;
        }
        this.f1583G = qVar2;
        this.f1604r = 0;
        this.f1607u = 0;
        G[] gArr = new G[2];
        this.f1584H = gArr;
        b0.n nVar = this.f1602p;
        if (nVar != null) {
            gArr[0] = nVar;
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i5 = 100;
        if ((i4 & 4) != 0) {
            gArr[i3] = qVar2.w(100, 5);
            i5 = 101;
            i3++;
        }
        G[] gArr2 = (G[]) A.O(i3, this.f1584H);
        this.f1584H = gArr2;
        for (G g3 : gArr2) {
            g3.c(L);
        }
        List list = this.f1590d;
        this.f1585I = new G[list.size()];
        int i6 = 0;
        while (i6 < this.f1585I.length) {
            G w3 = this.f1583G.w(i5, 3);
            w3.c((C0113p) list.get(i6));
            this.f1585I[i6] = w3;
            i6++;
            i5++;
        }
        u uVar = this.f1589c;
        if (uVar != null) {
            this.f1591e.put(0, new m(qVar.w(0, uVar.f1655b), new x(this.f1589c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new k(0, 0, 0, 0)));
            this.f1583G.s();
        }
    }

    @Override // w0.o
    public final List l() {
        return this.f1603q;
    }

    @Override // w0.o
    public final void release() {
    }
}
