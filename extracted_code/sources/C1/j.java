package C1;

import C2.p;
import D1.C0042v;
import D1.X;
import D1.Y;
import D1.r;
import K.InterfaceC0054h;
import K.b0;
import K.c0;
import K1.n;
import N2.q;
import R.AbstractC0100c;
import R.AbstractC0101d;
import R.AbstractC0104g;
import R.C0102e;
import R.C0106i;
import R.C0122z;
import R.H;
import U.A;
import U.AbstractC0123a;
import U.t;
import a.AbstractC0155a;
import a0.C0171o;
import a0.O;
import a0.RunnableC0169m;
import android.media.AudioAttributes;
import android.os.Handler;
import android.util.SparseArray;
import g2.y;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import w0.F;
import w0.s;
/* loaded from: classes.dex */
public final class j implements N2.d, n, InterfaceC0054h, g2.j, T0.d, g2.e, g2.g, b0.h {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f167m;

    /* renamed from: n  reason: collision with root package name */
    public Object f168n;

    public /* synthetic */ j(int i3, boolean z3) {
        this.f167m = i3;
    }

    public static AbstractC0155a w(AbstractC0155a abstractC0155a) {
        new B1.a(9);
        abstractC0155a.getClass();
        new HashMap();
        throw null;
    }

    @Override // T0.d
    public List A(long j3) {
        if (j3 >= 0) {
            return (List) this.f168n;
        }
        return Collections.emptyList();
    }

    @Override // b0.h
    public long B(long j3, long j4) {
        return -9223372036854775807L;
    }

    @Override // b0.h
    public c0.j C(long j3) {
        return (c0.j) this.f168n;
    }

    @Override // g2.e
    public void D(ByteBuffer byteBuffer, Y1.g gVar) {
        y.f5798b.getClass();
        y.c(byteBuffer);
        ((Y1.b) this.f168n).getClass();
    }

    public b0 E() {
        q qVar = (q) this.f168n;
        qVar.getClass();
        f fVar = O2.l.f1350a;
        Object obj = q.f1177q.get(qVar);
        if (obj == fVar) {
            obj = null;
        }
        return (b0) obj;
    }

    @Override // T0.d
    public long F(int i3) {
        boolean z3;
        if (i3 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        return 0L;
    }

    public d0.b G() {
        return (d0.b) this.f168n;
    }

    public UUID H() {
        return AbstractC0104g.f1887a;
    }

    public int I() {
        return 1;
    }

    @Override // K1.n
    public Object K() {
        switch (this.f167m) {
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                Constructor constructor = (Constructor) this.f168n;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e2) {
                    throw new AssertionError(e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException("Failed to invoke " + constructor + " with no args", e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to invoke " + constructor + " with no args", e4.getTargetException());
                }
            default:
                Type type = (Type) this.f168n;
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type2 instanceof Class) {
                        return EnumSet.noneOf((Class) type2);
                    }
                    throw new RuntimeException("Invalid EnumSet type: " + type.toString());
                }
                throw new RuntimeException("Invalid EnumSet type: " + type.toString());
        }
    }

    public void L(long j3, int i3) {
        O0.d dVar = (O0.d) this.f168n;
        dVar.getClass();
        if (i3 != 20529) {
            if (i3 != 20530) {
                boolean z3 = false;
                switch (i3) {
                    case 131:
                        dVar.c(i3);
                        dVar.f1313w.f1234d = (int) j3;
                        return;
                    case 136:
                        dVar.c(i3);
                        O0.c cVar = dVar.f1313w;
                        if (j3 == 1) {
                            z3 = true;
                        }
                        cVar.f1227W = z3;
                        return;
                    case 155:
                        dVar.f1272K = dVar.m(j3);
                        return;
                    case 159:
                        dVar.c(i3);
                        dVar.f1313w.f1220P = (int) j3;
                        return;
                    case 176:
                        dVar.c(i3);
                        dVar.f1313w.f1243m = (int) j3;
                        return;
                    case 179:
                        dVar.a(i3);
                        dVar.f1266E.b(dVar.m(j3));
                        return;
                    case 186:
                        dVar.c(i3);
                        dVar.f1313w.f1244n = (int) j3;
                        return;
                    case 215:
                        dVar.c(i3);
                        dVar.f1313w.f1233c = (int) j3;
                        return;
                    case 231:
                        dVar.f1265D = dVar.m(j3);
                        return;
                    case 238:
                        dVar.f1278R = (int) j3;
                        return;
                    case 241:
                        if (!dVar.f1268G) {
                            dVar.a(i3);
                            dVar.f1267F.b(j3);
                            dVar.f1268G = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.f1279S = true;
                        return;
                    case 16871:
                        dVar.c(i3);
                        dVar.f1313w.f1237g = (int) j3;
                        return;
                    case 16980:
                        if (j3 != 3) {
                            throw H.a(null, "ContentCompAlgo " + j3 + " not supported");
                        }
                        return;
                    case 17029:
                        if (j3 < 1 || j3 > 2) {
                            throw H.a(null, "DocTypeReadVersion " + j3 + " not supported");
                        }
                        return;
                    case 17143:
                        if (j3 != 1) {
                            throw H.a(null, "EBMLReadVersion " + j3 + " not supported");
                        }
                        return;
                    case 18401:
                        if (j3 != 5) {
                            throw H.a(null, "ContentEncAlgo " + j3 + " not supported");
                        }
                        return;
                    case 18408:
                        if (j3 != 1) {
                            throw H.a(null, "AESSettingsCipherMode " + j3 + " not supported");
                        }
                        return;
                    case 21420:
                        dVar.f1315z = j3 + dVar.f1309s;
                        return;
                    case 21432:
                        int i4 = (int) j3;
                        dVar.c(i3);
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (i4 != 3) {
                                    if (i4 == 15) {
                                        dVar.f1313w.x = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f1313w.x = 1;
                                return;
                            }
                            dVar.f1313w.x = 2;
                            return;
                        }
                        dVar.f1313w.x = 0;
                        return;
                    case 21680:
                        dVar.c(i3);
                        dVar.f1313w.f1246p = (int) j3;
                        return;
                    case 21682:
                        dVar.c(i3);
                        dVar.f1313w.f1248r = (int) j3;
                        return;
                    case 21690:
                        dVar.c(i3);
                        dVar.f1313w.f1247q = (int) j3;
                        return;
                    case 21930:
                        dVar.c(i3);
                        O0.c cVar2 = dVar.f1313w;
                        if (j3 == 1) {
                            z3 = true;
                        }
                        cVar2.f1226V = z3;
                        return;
                    case 21938:
                        dVar.c(i3);
                        O0.c cVar3 = dVar.f1313w;
                        cVar3.f1254y = true;
                        cVar3.f1245o = (int) j3;
                        return;
                    case 21998:
                        dVar.c(i3);
                        dVar.f1313w.f1236f = (int) j3;
                        return;
                    case 22186:
                        dVar.c(i3);
                        dVar.f1313w.f1223S = j3;
                        return;
                    case 22203:
                        dVar.c(i3);
                        dVar.f1313w.f1224T = j3;
                        return;
                    case 25188:
                        dVar.c(i3);
                        dVar.f1313w.f1221Q = (int) j3;
                        return;
                    case 30114:
                        dVar.f1280T = j3;
                        return;
                    case 30321:
                        dVar.c(i3);
                        int i5 = (int) j3;
                        if (i5 != 0) {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 == 3) {
                                        dVar.f1313w.f1249s = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f1313w.f1249s = 2;
                                return;
                            }
                            dVar.f1313w.f1249s = 1;
                            return;
                        }
                        dVar.f1313w.f1249s = 0;
                        return;
                    case 2352003:
                        dVar.c(i3);
                        dVar.f1313w.f1235e = (int) j3;
                        return;
                    case 2807729:
                        dVar.f1310t = j3;
                        return;
                    default:
                        switch (i3) {
                            case 21945:
                                dVar.c(i3);
                                int i6 = (int) j3;
                                if (i6 != 1) {
                                    if (i6 == 2) {
                                        dVar.f1313w.f1207B = 1;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f1313w.f1207B = 2;
                                return;
                            case 21946:
                                dVar.c(i3);
                                int g3 = C0106i.g((int) j3);
                                if (g3 != -1) {
                                    dVar.f1313w.f1206A = g3;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.c(i3);
                                dVar.f1313w.f1254y = true;
                                int f3 = C0106i.f((int) j3);
                                if (f3 != -1) {
                                    dVar.f1313w.f1255z = f3;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.c(i3);
                                dVar.f1313w.f1208C = (int) j3;
                                return;
                            case 21949:
                                dVar.c(i3);
                                dVar.f1313w.f1209D = (int) j3;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j3 != 1) {
                throw H.a(null, "ContentEncodingScope " + j3 + " not supported");
            }
        } else if (j3 == 0) {
        } else {
            throw H.a(null, "ContentEncodingOrder " + j3 + " not supported");
        }
    }

    public void M(Exception exc) {
        AbstractC0123a.o("MediaCodecAudioRenderer", "Audio sink error", exc);
        C0171o c0171o = ((O) this.f168n).f3700R0;
        Handler handler = c0171o.f3774b;
        if (handler != null) {
            handler.post(new RunnableC0169m(c0171o, exc, 5));
        }
    }

    public boolean O(String str) {
        return false;
    }

    @Override // T0.d
    public int P() {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [O0.c, java.lang.Object] */
    public void Q(int i3, long j3, long j4) {
        O0.d dVar = (O0.d) this.f168n;
        AbstractC0123a.k(dVar.f1294d0);
        if (i3 != 160) {
            if (i3 != 174) {
                if (i3 != 187) {
                    if (i3 != 19899) {
                        if (i3 != 20533) {
                            if (i3 != 21968) {
                                if (i3 != 408125543) {
                                    if (i3 != 475249515) {
                                        if (i3 == 524531317 && !dVar.x) {
                                            if (dVar.f1293d && dVar.f1263B != -1) {
                                                dVar.f1262A = true;
                                                return;
                                            }
                                            dVar.f1294d0.n(new s(dVar.f1312v));
                                            dVar.x = true;
                                            return;
                                        }
                                        return;
                                    }
                                    dVar.f1266E = new B.b(2, false);
                                    dVar.f1267F = new B.b(2, false);
                                    return;
                                }
                                long j5 = dVar.f1309s;
                                if (j5 != -1 && j5 != j3) {
                                    throw H.a(null, "Multiple Segment elements not supported");
                                }
                                dVar.f1309s = j3;
                                dVar.f1308r = j4;
                                return;
                            }
                            dVar.c(i3);
                            dVar.f1313w.f1254y = true;
                            return;
                        }
                        dVar.c(i3);
                        dVar.f1313w.f1238h = true;
                        return;
                    }
                    dVar.f1314y = -1;
                    dVar.f1315z = -1L;
                    return;
                }
                dVar.f1268G = false;
                return;
            }
            ?? obj = new Object();
            obj.f1243m = -1;
            obj.f1244n = -1;
            obj.f1245o = -1;
            obj.f1246p = -1;
            obj.f1247q = -1;
            obj.f1248r = 0;
            obj.f1249s = -1;
            obj.f1250t = 0.0f;
            obj.f1251u = 0.0f;
            obj.f1252v = 0.0f;
            obj.f1253w = null;
            obj.x = -1;
            obj.f1254y = false;
            obj.f1255z = -1;
            obj.f1206A = -1;
            obj.f1207B = -1;
            obj.f1208C = 1000;
            obj.f1209D = 200;
            obj.f1210E = -1.0f;
            obj.f1211F = -1.0f;
            obj.f1212G = -1.0f;
            obj.f1213H = -1.0f;
            obj.f1214I = -1.0f;
            obj.f1215J = -1.0f;
            obj.f1216K = -1.0f;
            obj.L = -1.0f;
            obj.f1217M = -1.0f;
            obj.f1218N = -1.0f;
            obj.f1220P = 1;
            obj.f1221Q = -1;
            obj.f1222R = 8000;
            obj.f1223S = 0L;
            obj.f1224T = 0L;
            obj.f1227W = true;
            obj.f1228X = "eng";
            dVar.f1313w = obj;
            return;
        }
        dVar.f1279S = false;
        dVar.f1280T = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r7.f605a > r3.f605a) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void R(K.b0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "newState"
            D2.i.e(r7, r0)
        L5:
            java.lang.Object r0 = r6.f168n
            N2.q r0 = (N2.q) r0
            r0.getClass()
            C1.f r1 = O2.l.f1350a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = N2.q.f1177q
            java.lang.Object r2 = r2.get(r0)
            if (r2 != r1) goto L17
            r2 = 0
        L17:
            r3 = r2
            K.b0 r3 = (K.b0) r3
            boolean r4 = r3 instanceof K.U
            if (r4 == 0) goto L20
            r4 = 1
            goto L26
        L20:
            K.c0 r4 = K.c0.f608b
            boolean r4 = D2.i.a(r3, r4)
        L26:
            if (r4 == 0) goto L29
            goto L33
        L29:
            boolean r4 = r3 instanceof K.C0049c
            if (r4 == 0) goto L35
            int r4 = r3.f605a
            int r5 = r7.f605a
            if (r5 <= r4) goto L39
        L33:
            r3 = r7
            goto L39
        L35:
            boolean r4 = r3 instanceof K.S
            if (r4 == 0) goto L47
        L39:
            if (r2 != 0) goto L3c
            r2 = r1
        L3c:
            if (r3 != 0) goto L3f
            goto L40
        L3f:
            r1 = r3
        L40:
            boolean r0 = r0.c(r2, r1)
            if (r0 == 0) goto L5
            return
        L47:
            B1.c r7 = new B1.c
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.j.R(K.b0):void");
    }

    @Override // b0.h
    public long a(long j3) {
        return 0L;
    }

    @Override // b0.h
    public long b(long j3, long j4) {
        return 0L;
    }

    @Override // g2.g
    public void c(String str, ByteBuffer byteBuffer, g2.f fVar) {
        ((Y1.j) this.f168n).c(str, byteBuffer, fVar);
    }

    @Override // K.InterfaceC0054h
    public Object d(p pVar, w2.f fVar) {
        return ((InterfaceC0054h) this.f168n).d(new O.c(pVar, null), fVar);
    }

    @Override // b0.h
    public boolean e() {
        return true;
    }

    @Override // g2.g
    public void f(String str, ByteBuffer byteBuffer) {
        ((Y1.j) this.f168n).c(str, byteBuffer, null);
    }

    @Override // T0.d
    public int g(long j3) {
        if (j3 < 0) {
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [g2.m, java.lang.Object] */
    @Override // g2.g
    public B1.b i() {
        return ((Y1.j) this.f168n).b(new Object());
    }

    @Override // g2.g
    public void j(String str, g2.e eVar) {
        ((Y1.j) this.f168n).l(str, eVar, null);
    }

    @Override // b0.h
    public long k() {
        return 0L;
    }

    @Override // g2.g
    public void l(String str, g2.e eVar, B1.b bVar) {
        ((Y1.j) this.f168n).l(str, eVar, bVar);
    }

    @Override // K.InterfaceC0054h
    public N2.d m() {
        return ((InterfaceC0054h) this.f168n).m();
    }

    public void o(int i3, boolean z3) {
        A.i iVar = (A.i) this.f168n;
        if (z3) {
            iVar.a(i3);
        } else {
            iVar.getClass();
        }
    }

    @Override // g2.j
    public void p() {
        ((R1.g) this.f168n).f2100n.f2084u = null;
    }

    @Override // b0.h
    public long q(long j3) {
        return 1L;
    }

    @Override // b0.h
    public long r(long j3, long j4) {
        return 1L;
    }

    @Override // g2.j
    public void s(g2.i iVar) {
        ((R1.g) this.f168n).f2100n.f2084u = iVar;
    }

    @Override // b0.h
    public long t(long j3, long j4) {
        return 0L;
    }

    public void u(int i3, int i4, w0.l lVar) {
        O0.c cVar;
        O0.c cVar2;
        O0.c cVar3;
        long j3;
        int i5;
        int i6;
        int i7;
        int i8;
        O0.d dVar = (O0.d) this.f168n;
        SparseArray sparseArray = dVar.f1291c;
        int i9 = 4;
        int i10 = 0;
        int i11 = 1;
        if (i3 != 161 && i3 != 163) {
            if (i3 != 165) {
                if (i3 != 16877) {
                    if (i3 != 16981) {
                        if (i3 != 18402) {
                            if (i3 != 21419) {
                                if (i3 != 25506) {
                                    if (i3 == 30322) {
                                        dVar.c(i3);
                                        O0.c cVar4 = dVar.f1313w;
                                        byte[] bArr = new byte[i4];
                                        cVar4.f1253w = bArr;
                                        lVar.i(bArr, 0, i4, false);
                                        return;
                                    }
                                    throw H.a(null, "Unexpected id: " + i3);
                                }
                                dVar.c(i3);
                                O0.c cVar5 = dVar.f1313w;
                                byte[] bArr2 = new byte[i4];
                                cVar5.f1241k = bArr2;
                                lVar.i(bArr2, 0, i4, false);
                                return;
                            }
                            t tVar = dVar.f1301k;
                            Arrays.fill(tVar.f2477a, (byte) 0);
                            lVar.i(tVar.f2477a, 4 - i4, i4, false);
                            tVar.G(0);
                            dVar.f1314y = (int) tVar.w();
                            return;
                        }
                        byte[] bArr3 = new byte[i4];
                        lVar.i(bArr3, 0, i4, false);
                        dVar.c(i3);
                        dVar.f1313w.f1240j = new F(1, 0, 0, bArr3);
                        return;
                    }
                    dVar.c(i3);
                    O0.c cVar6 = dVar.f1313w;
                    byte[] bArr4 = new byte[i4];
                    cVar6.f1239i = bArr4;
                    lVar.i(bArr4, 0, i4, false);
                    return;
                }
                dVar.c(i3);
                O0.c cVar7 = dVar.f1313w;
                int i12 = cVar7.f1237g;
                if (i12 != 1685485123 && i12 != 1685480259) {
                    lVar.d(i4);
                    return;
                }
                byte[] bArr5 = new byte[i4];
                cVar7.f1219O = bArr5;
                lVar.i(bArr5, 0, i4, false);
                return;
            } else if (dVar.f1270I == 2) {
                O0.c cVar8 = (O0.c) sparseArray.get(dVar.f1275O);
                if (dVar.f1278R == 4 && "V_VP9".equals(cVar8.f1232b)) {
                    t tVar2 = dVar.f1306p;
                    tVar2.D(i4);
                    lVar.i(tVar2.f2477a, 0, i4, false);
                    return;
                }
                lVar.d(i4);
                return;
            } else {
                return;
            }
        }
        int i13 = dVar.f1270I;
        t tVar3 = dVar.f1299i;
        if (i13 == 0) {
            O0.e eVar = dVar.f1289b;
            dVar.f1275O = (int) eVar.c(lVar, false, true, 8);
            dVar.f1276P = eVar.f1319c;
            dVar.f1272K = -9223372036854775807L;
            dVar.f1270I = 1;
            tVar3.D(0);
        }
        O0.c cVar9 = (O0.c) sparseArray.get(dVar.f1275O);
        if (cVar9 == null) {
            lVar.d(i4 - dVar.f1276P);
            dVar.f1270I = 0;
            return;
        }
        cVar9.f1229Y.getClass();
        if (dVar.f1270I == 1) {
            dVar.j(lVar, 3);
            int i14 = (tVar3.f2477a[2] & 6) >> 1;
            byte b3 = 255;
            if (i14 == 0) {
                dVar.f1273M = 1;
                int[] iArr = dVar.f1274N;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.f1274N = iArr;
                iArr[0] = (i4 - dVar.f1276P) - 3;
            } else {
                dVar.j(lVar, 4);
                int i15 = (tVar3.f2477a[3] & 255) + 1;
                dVar.f1273M = i15;
                int[] iArr2 = dVar.f1274N;
                if (iArr2 == null) {
                    iArr2 = new int[i15];
                } else if (iArr2.length < i15) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i15)];
                }
                dVar.f1274N = iArr2;
                if (i14 == 2) {
                    int i16 = dVar.f1273M;
                    Arrays.fill(iArr2, 0, i16, ((i4 - dVar.f1276P) - 4) / i16);
                } else if (i14 == 1) {
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        i5 = dVar.f1273M - 1;
                        if (i17 >= i5) {
                            break;
                        }
                        dVar.f1274N[i17] = 0;
                        while (true) {
                            i6 = i9 + 1;
                            dVar.j(lVar, i6);
                            int i19 = tVar3.f2477a[i9] & 255;
                            int[] iArr3 = dVar.f1274N;
                            i7 = iArr3[i17] + i19;
                            iArr3[i17] = i7;
                            if (i19 != 255) {
                                break;
                            }
                            i9 = i6;
                        }
                        i18 += i7;
                        i17++;
                        i9 = i6;
                    }
                    dVar.f1274N[i5] = ((i4 - dVar.f1276P) - i9) - i18;
                } else if (i14 == 3) {
                    int i20 = 0;
                    int i21 = 0;
                    while (true) {
                        int i22 = dVar.f1273M - i11;
                        if (i20 < i22) {
                            dVar.f1274N[i20] = i10;
                            int i23 = i9 + 1;
                            dVar.j(lVar, i23);
                            if (tVar3.f2477a[i9] != 0) {
                                int i24 = 0;
                                while (true) {
                                    if (i24 < 8) {
                                        int i25 = i11 << (7 - i24);
                                        if ((tVar3.f2477a[i9] & i25) != 0) {
                                            int i26 = i23 + i24;
                                            dVar.j(lVar, i26);
                                            O0.c cVar10 = cVar9;
                                            j3 = tVar3.f2477a[i9] & b3 & (~i25);
                                            while (i23 < i26) {
                                                j3 = (j3 << 8) | (tVar3.f2477a[i23] & 255);
                                                i23++;
                                                cVar10 = cVar10;
                                            }
                                            cVar3 = cVar10;
                                            if (i20 > 0) {
                                                j3 -= (1 << ((i24 * 7) + 6)) - 1;
                                            }
                                            i9 = i26;
                                        } else {
                                            i24++;
                                            b3 = 255;
                                            i11 = 1;
                                        }
                                    } else {
                                        cVar3 = cVar9;
                                        j3 = 0;
                                        i9 = i23;
                                        break;
                                    }
                                }
                                if (j3 < -2147483648L || j3 > 2147483647L) {
                                    break;
                                }
                                int i27 = (int) j3;
                                int[] iArr4 = dVar.f1274N;
                                if (i20 != 0) {
                                    i27 += iArr4[i20 - 1];
                                }
                                iArr4[i20] = i27;
                                i21 += i27;
                                i20++;
                                cVar9 = cVar3;
                                b3 = 255;
                                i10 = 0;
                                i11 = 1;
                            } else {
                                throw H.a(null, "No valid varint length mask found");
                            }
                        } else {
                            cVar2 = cVar9;
                            dVar.f1274N[i22] = ((i4 - dVar.f1276P) - i9) - i21;
                            break;
                        }
                    }
                    throw H.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw H.a(null, "Unexpected lacing value: " + i14);
                }
            }
            cVar2 = cVar9;
            byte[] bArr6 = tVar3.f2477a;
            dVar.f1271J = dVar.m((bArr6[1] & 255) | (bArr6[0] << 8)) + dVar.f1265D;
            cVar = cVar2;
            if (cVar.f1234d != 2 && (i3 != 163 || (tVar3.f2477a[2] & 128) != 128)) {
                i8 = 0;
            } else {
                i8 = 1;
            }
            dVar.f1277Q = i8;
            dVar.f1270I = 2;
            dVar.L = 0;
        } else {
            cVar = cVar9;
        }
        if (i3 == 163) {
            while (true) {
                int i28 = dVar.L;
                if (i28 < dVar.f1273M) {
                    dVar.g(cVar, ((dVar.L * cVar.f1235e) / 1000) + dVar.f1271J, dVar.f1277Q, dVar.n(lVar, cVar, dVar.f1274N[i28], false), 0);
                    dVar.L++;
                    cVar = cVar;
                } else {
                    dVar.f1270I = 0;
                    return;
                }
            }
        } else {
            O0.c cVar11 = cVar;
            while (true) {
                int i29 = dVar.L;
                if (i29 < dVar.f1273M) {
                    int[] iArr5 = dVar.f1274N;
                    iArr5[i29] = dVar.n(lVar, cVar11, iArr5[i29], true);
                    dVar.L++;
                } else {
                    return;
                }
            }
        }
    }

    public Y v() {
        Map f3 = ((r) this.f168n).f();
        X x = new X();
        Y y3 = new Y(f3);
        y3.f223r = x;
        return y3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Type inference failed for: r7v8, types: [w2.f, C2.p] */
    @Override // N2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(N2.e r7, u2.InterfaceC0866d r8) {
        /*
            r6 = this;
            int r0 = r6.f167m
            switch(r0) {
                case 6: goto L6a;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof N2.a
            if (r0 == 0) goto L18
            r0 = r8
            N2.a r0 = (N2.a) r0
            int r1 = r0.f1118s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f1118s = r1
            goto L1d
        L18:
            N2.a r0 = new N2.a
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f1116q
            v2.a r1 = v2.EnumC0879a.f9494m
            int r2 = r0.f1118s
            s2.g r3 = s2.C0808g.f9229a
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            O2.n r7 = r0.f1115p
            n2.AbstractC0664g.w(r8)     // Catch: java.lang.Throwable -> L30
            goto L5b
        L30:
            r8 = move-exception
            goto L66
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            n2.AbstractC0664g.w(r8)
            O2.n r8 = new O2.n
            u2.i r2 = r0.f9665n
            D2.i.b(r2)
            r8.<init>(r7, r2)
            r0.f1115p = r8     // Catch: java.lang.Throwable -> L64
            r0.f1118s = r4     // Catch: java.lang.Throwable -> L64
            java.lang.Object r7 = r6.f168n     // Catch: java.lang.Throwable -> L64
            w2.f r7 = (w2.f) r7     // Catch: java.lang.Throwable -> L64
            java.lang.Object r7 = r7.i(r8, r0)     // Catch: java.lang.Throwable -> L64
            if (r7 != r1) goto L56
            goto L57
        L56:
            r7 = r3
        L57:
            if (r7 != r1) goto L5a
            goto L5f
        L5a:
            r7 = r8
        L5b:
            r7.o()
            r1 = r3
        L5f:
            return r1
        L60:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L66
        L64:
            r7 = move-exception
            goto L60
        L66:
            r7.o()
            throw r8
        L6a:
            K.t r0 = new K.t
            r1 = 0
            r0.<init>(r7, r1)
            java.lang.Object r7 = r6.f168n
            B1.a r7 = (B1.a) r7
            java.lang.Object r7 = r7.x(r0, r8)
            v2.a r8 = v2.EnumC0879a.f9494m
            if (r7 != r8) goto L7d
            goto L7f
        L7d:
            s2.g r7 = s2.C0808g.f9229a
        L7f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.j.x(N2.e, u2.d):java.lang.Object");
    }

    public d0.g y(C0122z c0122z) {
        c0122z.f2008b.getClass();
        c0122z.f2008b.getClass();
        return d0.g.f5152e;
    }

    public X.a z() {
        return null;
    }

    public /* synthetic */ j(Object obj, int i3) {
        this.f167m = i3;
        this.f168n = obj;
    }

    public j(C0102e c0102e) {
        this.f167m = 14;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c0102e.f1885a).setFlags(0).setUsage(1);
        int i3 = A.f2405a;
        if (i3 >= 29) {
            AbstractC0100c.a(usage, 1);
        }
        if (i3 >= 32) {
            AbstractC0101d.a(usage, 0);
        }
        this.f168n = usage.build();
    }

    public j(int i3) {
        this.f167m = i3;
        switch (i3) {
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                this.f168n = new AtomicInteger(0);
                return;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f168n = new q(c0.f608b);
                return;
            case 15:
                this.f168n = new A.i();
                return;
            case 28:
                this.f168n = new Object();
                return;
            default:
                this.f168n = C0042v.a();
                return;
        }
    }

    public j(UUID uuid, int i3, byte[] bArr) {
        this.f167m = 13;
        this.f168n = uuid;
    }

    public j(p pVar) {
        this.f167m = 10;
        this.f168n = (w2.f) pVar;
    }

    public void N(d0.d dVar) {
    }

    public void n(d0.d dVar) {
    }

    @Override // b0.h
    public long h(long j3, long j4) {
        return j4;
    }
}
