package O0;

import D1.G;
import D1.I;
import D1.b0;
import D2.h;
import R.H;
import T0.j;
import U.A;
import U.AbstractC0123a;
import U.t;
import V.g;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import w0.l;
import w0.o;
import w0.p;
import w0.q;
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: e0  reason: collision with root package name */
    public static final byte[] f1256e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: f0  reason: collision with root package name */
    public static final byte[] f1257f0;

    /* renamed from: g0  reason: collision with root package name */
    public static final byte[] f1258g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final byte[] f1259h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final UUID f1260i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final Map f1261j0;

    /* renamed from: A  reason: collision with root package name */
    public boolean f1262A;

    /* renamed from: B  reason: collision with root package name */
    public long f1263B;

    /* renamed from: C  reason: collision with root package name */
    public long f1264C;

    /* renamed from: D  reason: collision with root package name */
    public long f1265D;

    /* renamed from: E  reason: collision with root package name */
    public B.b f1266E;

    /* renamed from: F  reason: collision with root package name */
    public B.b f1267F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f1268G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f1269H;

    /* renamed from: I  reason: collision with root package name */
    public int f1270I;

    /* renamed from: J  reason: collision with root package name */
    public long f1271J;

    /* renamed from: K  reason: collision with root package name */
    public long f1272K;
    public int L;

    /* renamed from: M  reason: collision with root package name */
    public int f1273M;

    /* renamed from: N  reason: collision with root package name */
    public int[] f1274N;

    /* renamed from: O  reason: collision with root package name */
    public int f1275O;

    /* renamed from: P  reason: collision with root package name */
    public int f1276P;

    /* renamed from: Q  reason: collision with root package name */
    public int f1277Q;

    /* renamed from: R  reason: collision with root package name */
    public int f1278R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f1279S;

    /* renamed from: T  reason: collision with root package name */
    public long f1280T;

    /* renamed from: U  reason: collision with root package name */
    public int f1281U;

    /* renamed from: V  reason: collision with root package name */
    public int f1282V;

    /* renamed from: W  reason: collision with root package name */
    public int f1283W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f1284X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f1285Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f1286Z;

    /* renamed from: a  reason: collision with root package name */
    public final b f1287a;

    /* renamed from: a0  reason: collision with root package name */
    public int f1288a0;

    /* renamed from: b  reason: collision with root package name */
    public final e f1289b;

    /* renamed from: b0  reason: collision with root package name */
    public byte f1290b0;

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray f1291c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1292c0;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1293d;

    /* renamed from: d0  reason: collision with root package name */
    public q f1294d0;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1295e;

    /* renamed from: f  reason: collision with root package name */
    public final j f1296f;

    /* renamed from: g  reason: collision with root package name */
    public final t f1297g;

    /* renamed from: h  reason: collision with root package name */
    public final t f1298h;

    /* renamed from: i  reason: collision with root package name */
    public final t f1299i;

    /* renamed from: j  reason: collision with root package name */
    public final t f1300j;

    /* renamed from: k  reason: collision with root package name */
    public final t f1301k;

    /* renamed from: l  reason: collision with root package name */
    public final t f1302l;

    /* renamed from: m  reason: collision with root package name */
    public final t f1303m;

    /* renamed from: n  reason: collision with root package name */
    public final t f1304n;

    /* renamed from: o  reason: collision with root package name */
    public final t f1305o;

    /* renamed from: p  reason: collision with root package name */
    public final t f1306p;

    /* renamed from: q  reason: collision with root package name */
    public ByteBuffer f1307q;

    /* renamed from: r  reason: collision with root package name */
    public long f1308r;

    /* renamed from: s  reason: collision with root package name */
    public long f1309s;

    /* renamed from: t  reason: collision with root package name */
    public long f1310t;

    /* renamed from: u  reason: collision with root package name */
    public long f1311u;

    /* renamed from: v  reason: collision with root package name */
    public long f1312v;

    /* renamed from: w  reason: collision with root package name */
    public c f1313w;
    public boolean x;

    /* renamed from: y  reason: collision with root package name */
    public int f1314y;

    /* renamed from: z  reason: collision with root package name */
    public long f1315z;

    static {
        int i3 = A.f2405a;
        f1257f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(C1.d.f153c);
        f1258g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f1259h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f1260i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        h.o(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        h.o(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f1261j0 = Collections.unmodifiableMap(hashMap);
    }

    public d(j jVar, int i3) {
        boolean z3;
        b bVar = new b();
        this.f1309s = -1L;
        this.f1310t = -9223372036854775807L;
        this.f1311u = -9223372036854775807L;
        this.f1312v = -9223372036854775807L;
        this.f1263B = -1L;
        this.f1264C = -1L;
        this.f1265D = -9223372036854775807L;
        this.f1287a = bVar;
        bVar.f1202d = new C1.j(this, 12);
        this.f1296f = jVar;
        if ((i3 & 1) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f1293d = z3;
        this.f1295e = (i3 & 2) == 0;
        this.f1289b = new e();
        this.f1291c = new SparseArray();
        this.f1299i = new t(4);
        this.f1300j = new t(ByteBuffer.allocate(4).putInt(-1).array());
        this.f1301k = new t(4);
        this.f1297g = new t(g.f2652a);
        this.f1298h = new t(4);
        this.f1302l = new t();
        this.f1303m = new t();
        this.f1304n = new t(8);
        this.f1305o = new t();
        this.f1306p = new t();
        this.f1274N = new int[1];
    }

    public static byte[] i(long j3, long j4, String str) {
        boolean z3;
        if (j3 != -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        int i3 = (int) (j3 / 3600000000L);
        long j5 = j3 - (i3 * 3600000000L);
        int i4 = (int) (j5 / 60000000);
        long j6 = j5 - (i4 * 60000000);
        int i5 = (int) (j6 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf((int) ((j6 - (i5 * 1000000)) / j4)));
        int i6 = A.f2405a;
        return format.getBytes(C1.d.f153c);
    }

    public final void a(int i3) {
        if (this.f1266E != null && this.f1267F != null) {
            return;
        }
        throw H.a(null, "Element " + i3 + " must be in a Cues");
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        this.f1265D = -9223372036854775807L;
        this.f1270I = 0;
        b bVar = this.f1287a;
        bVar.f1203e = 0;
        bVar.f1200b.clear();
        e eVar = bVar.f1201c;
        eVar.f1318b = 0;
        eVar.f1319c = 0;
        e eVar2 = this.f1289b;
        eVar2.f1318b = 0;
        eVar2.f1319c = 0;
        k();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f1291c;
            if (i3 < sparseArray.size()) {
                w0.H h3 = ((c) sparseArray.valueAt(i3)).f1225U;
                if (h3 != null) {
                    h3.f9523b = false;
                    h3.f9524c = 0;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final void c(int i3) {
        if (this.f1313w != null) {
            return;
        }
        throw H.a(null, "Element " + i3 + " must be in a TrackEntry");
    }

    @Override // w0.o
    public final o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(p pVar) {
        long l3;
        int i3;
        B.b bVar = new B.b(1, false);
        l lVar = (l) pVar;
        long j3 = lVar.f9607o;
        long j4 = 1024;
        int i4 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
        if (i4 != 0 && j3 <= 1024) {
            j4 = j3;
        }
        int i5 = (int) j4;
        t tVar = (t) bVar.f23n;
        lVar.p(tVar.f2477a, 0, 4, false);
        bVar.f22m = 4;
        for (long w3 = tVar.w(); w3 != 440786851; w3 = ((w3 << 8) & (-256)) | (tVar.f2477a[0] & 255)) {
            int i6 = bVar.f22m + 1;
            bVar.f22m = i6;
            if (i6 == i5) {
                return false;
            }
            lVar.p(tVar.f2477a, 0, 1, false);
        }
        long l4 = bVar.l(lVar);
        long j5 = bVar.f22m;
        if (l4 == Long.MIN_VALUE) {
            return false;
        }
        if (i4 != 0 && j5 + l4 >= j3) {
            return false;
        }
        while (true) {
            int i7 = (bVar.f22m > (j5 + l4) ? 1 : (bVar.f22m == (j5 + l4) ? 0 : -1));
            if (i7 < 0) {
                if (bVar.l(lVar) == Long.MIN_VALUE || (bVar.l(lVar)) < 0 || l3 > 2147483647L) {
                    return false;
                }
                if (i3 != 0) {
                    int i8 = (int) l3;
                    lVar.a(i8, false);
                    bVar.f22m += i8;
                }
            } else if (i7 != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:508:0x0b42, code lost:
        if (r1.o() == r3.getLeastSignificantBits()) goto L531;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [O0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r5v26, types: [w0.l] */
    @Override // w0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(w0.p r43, R.r r44) {
        /*
            Method dump skipped, instructions count: 5442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.d.f(w0.p, R.r):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(O0.c r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.d.g(O0.c, long, int, int, int):void");
    }

    @Override // w0.o
    public final void h(q qVar) {
        this.f1294d0 = qVar;
        if (this.f1295e) {
            qVar = new B1.e(qVar, this.f1296f);
        }
        this.f1294d0 = qVar;
    }

    public final void j(l lVar, int i3) {
        t tVar = this.f1299i;
        if (tVar.f2479c >= i3) {
            return;
        }
        byte[] bArr = tVar.f2477a;
        if (bArr.length < i3) {
            tVar.b(Math.max(bArr.length * 2, i3));
        }
        byte[] bArr2 = tVar.f2477a;
        int i4 = tVar.f2479c;
        lVar.i(bArr2, i4, i3 - i4, false);
        tVar.F(i3);
    }

    public final void k() {
        this.f1281U = 0;
        this.f1282V = 0;
        this.f1283W = 0;
        this.f1284X = false;
        this.f1285Y = false;
        this.f1286Z = false;
        this.f1288a0 = 0;
        this.f1290b0 = (byte) 0;
        this.f1292c0 = false;
        this.f1302l.D(0);
    }

    @Override // w0.o
    public final List l() {
        G g3 = I.f197n;
        return b0.f231q;
    }

    public final long m(long j3) {
        long j4 = this.f1310t;
        if (j4 != -9223372036854775807L) {
            int i3 = A.f2405a;
            return A.U(j3, j4, 1000L, RoundingMode.FLOOR);
        }
        throw H.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int n(l lVar, c cVar, int i3, boolean z3) {
        int d3;
        int d4;
        boolean z4;
        boolean z5;
        int i4;
        if ("S_TEXT/UTF8".equals(cVar.f1232b)) {
            o(lVar, f1256e0, i3);
            int i5 = this.f1282V;
            k();
            return i5;
        } else if ("S_TEXT/ASS".equals(cVar.f1232b)) {
            o(lVar, f1258g0, i3);
            int i6 = this.f1282V;
            k();
            return i6;
        } else if ("S_TEXT/WEBVTT".equals(cVar.f1232b)) {
            o(lVar, f1259h0, i3);
            int i7 = this.f1282V;
            k();
            return i7;
        } else {
            w0.G g3 = cVar.f1229Y;
            boolean z6 = this.f1284X;
            boolean z7 = true;
            t tVar = this.f1302l;
            if (!z6) {
                boolean z8 = cVar.f1238h;
                t tVar2 = this.f1299i;
                if (z8) {
                    this.f1277Q &= -1073741825;
                    int i8 = 128;
                    if (!this.f1285Y) {
                        lVar.i(tVar2.f2477a, 0, 1, false);
                        this.f1281U++;
                        byte b3 = tVar2.f2477a[0];
                        if ((b3 & 128) != 128) {
                            this.f1290b0 = b3;
                            this.f1285Y = true;
                        } else {
                            throw H.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b4 = this.f1290b0;
                    if ((b4 & 1) == 1) {
                        if ((b4 & 2) == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        this.f1277Q |= 1073741824;
                        if (!this.f1292c0) {
                            t tVar3 = this.f1304n;
                            lVar.i(tVar3.f2477a, 0, 8, false);
                            this.f1281U += 8;
                            this.f1292c0 = true;
                            byte[] bArr = tVar2.f2477a;
                            if (!z5) {
                                i8 = 0;
                            }
                            bArr[0] = (byte) (i8 | 8);
                            tVar2.G(0);
                            g3.a(tVar2, 1, 1);
                            this.f1282V++;
                            tVar3.G(0);
                            g3.a(tVar3, 8, 1);
                            this.f1282V += 8;
                        }
                        if (z5) {
                            if (!this.f1286Z) {
                                lVar.i(tVar2.f2477a, 0, 1, false);
                                this.f1281U++;
                                tVar2.G(0);
                                this.f1288a0 = tVar2.u();
                                this.f1286Z = true;
                            }
                            int i9 = this.f1288a0 * 4;
                            tVar2.D(i9);
                            lVar.i(tVar2.f2477a, 0, i9, false);
                            this.f1281U += i9;
                            short s3 = (short) ((this.f1288a0 / 2) + 1);
                            int i10 = (s3 * 6) + 2;
                            ByteBuffer byteBuffer = this.f1307q;
                            if (byteBuffer == null || byteBuffer.capacity() < i10) {
                                this.f1307q = ByteBuffer.allocate(i10);
                            }
                            this.f1307q.position(0);
                            this.f1307q.putShort(s3);
                            int i11 = 0;
                            int i12 = 0;
                            while (true) {
                                i4 = this.f1288a0;
                                if (i11 >= i4) {
                                    break;
                                }
                                int y3 = tVar2.y();
                                if (i11 % 2 == 0) {
                                    this.f1307q.putShort((short) (y3 - i12));
                                } else {
                                    this.f1307q.putInt(y3 - i12);
                                }
                                i11++;
                                i12 = y3;
                            }
                            int i13 = (i3 - this.f1281U) - i12;
                            if (i4 % 2 == 1) {
                                this.f1307q.putInt(i13);
                            } else {
                                this.f1307q.putShort((short) i13);
                                this.f1307q.putInt(0);
                            }
                            byte[] array = this.f1307q.array();
                            t tVar4 = this.f1305o;
                            tVar4.E(array, i10);
                            g3.a(tVar4, i10, 1);
                            this.f1282V += i10;
                        }
                    }
                } else {
                    byte[] bArr2 = cVar.f1239i;
                    if (bArr2 != null) {
                        tVar.E(bArr2, bArr2.length);
                    }
                }
                if ("A_OPUS".equals(cVar.f1232b)) {
                    z4 = z3;
                } else if (cVar.f1236f > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    this.f1277Q |= 268435456;
                    this.f1306p.D(0);
                    int i14 = (tVar.f2479c + i3) - this.f1281U;
                    tVar2.D(4);
                    byte[] bArr3 = tVar2.f2477a;
                    bArr3[0] = (byte) ((i14 >> 24) & 255);
                    bArr3[1] = (byte) ((i14 >> 16) & 255);
                    bArr3[2] = (byte) ((i14 >> 8) & 255);
                    bArr3[3] = (byte) (i14 & 255);
                    g3.a(tVar2, 4, 2);
                    this.f1282V += 4;
                }
                this.f1284X = true;
            }
            int i15 = i3 + tVar.f2479c;
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f1232b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f1232b)) {
                if (cVar.f1225U != null) {
                    if (tVar.f2479c != 0) {
                        z7 = false;
                    }
                    AbstractC0123a.j(z7);
                    cVar.f1225U.c(lVar);
                }
                while (true) {
                    int i16 = this.f1281U;
                    if (i16 >= i15) {
                        break;
                    }
                    int i17 = i15 - i16;
                    int a3 = tVar.a();
                    if (a3 > 0) {
                        d4 = Math.min(i17, a3);
                        g3.f(d4, tVar);
                    } else {
                        d4 = g3.d(lVar, i17, false);
                    }
                    this.f1281U += d4;
                    this.f1282V += d4;
                }
            } else {
                t tVar5 = this.f1298h;
                byte[] bArr4 = tVar5.f2477a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i18 = cVar.f1230Z;
                int i19 = 4 - i18;
                while (this.f1281U < i15) {
                    int i20 = this.f1283W;
                    if (i20 == 0) {
                        int min = Math.min(i18, tVar.a());
                        lVar.i(bArr4, i19 + min, i18 - min, false);
                        if (min > 0) {
                            tVar.f(bArr4, i19, min);
                        }
                        this.f1281U += i18;
                        tVar5.G(0);
                        this.f1283W = tVar5.y();
                        t tVar6 = this.f1297g;
                        tVar6.G(0);
                        g3.f(4, tVar6);
                        this.f1282V += 4;
                    } else {
                        int a4 = tVar.a();
                        if (a4 > 0) {
                            d3 = Math.min(i20, a4);
                            g3.f(d3, tVar);
                        } else {
                            d3 = g3.d(lVar, i20, false);
                        }
                        this.f1281U += d3;
                        this.f1282V += d3;
                        this.f1283W -= d3;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f1232b)) {
                t tVar7 = this.f1300j;
                tVar7.G(0);
                g3.f(4, tVar7);
                this.f1282V += 4;
            }
            int i21 = this.f1282V;
            k();
            return i21;
        }
    }

    public final void o(l lVar, byte[] bArr, int i3) {
        int length = bArr.length + i3;
        t tVar = this.f1303m;
        byte[] bArr2 = tVar.f2477a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i3);
            tVar.E(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.i(tVar.f2477a, bArr.length, i3, false);
        tVar.G(0);
        tVar.F(length);
    }

    @Override // w0.o
    public final void release() {
    }
}
