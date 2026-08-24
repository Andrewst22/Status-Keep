package Q0;

import D1.I;
import U.AbstractC0123a;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;
import w0.E;
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1653a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i3;
        int i4;
        if (bArr != null) {
            i3 = bArr.length;
        } else {
            i3 = 0;
        }
        int i5 = i3 + 32;
        if (uuidArr != null) {
            i5 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i5);
        allocate.putInt(i5);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i4 = 16777216;
        } else {
            i4 = 0;
        }
        allocate.putInt(i4);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        } else {
            allocate.putInt(0);
        }
        return allocate.array();
    }

    public static boolean b(int i3, boolean z3) {
        if ((i3 >>> 8) == 3368816) {
            return true;
        }
        if (i3 == 1751476579 && z3) {
            return true;
        }
        int[] iArr = f1653a;
        for (int i4 = 0; i4 < 29; i4++) {
            if (iArr[i4] == i3) {
                return true;
            }
        }
        return false;
    }

    public static K0.e c(int i3, U.t tVar) {
        int h3 = tVar.h();
        if (tVar.h() == 1684108385) {
            tVar.H(8);
            String q3 = tVar.q(h3 - 16);
            return new K0.e("und", q3, q3);
        }
        AbstractC0123a.A("MetadataUtil", "Failed to parse comment attribute: " + c.b(i3));
        return null;
    }

    public static K0.a d(U.t tVar) {
        String str;
        int h3 = tVar.h();
        if (tVar.h() == 1684108385) {
            int h4 = tVar.h() & 16777215;
            if (h4 == 13) {
                str = "image/jpeg";
            } else if (h4 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                D2.h.n(h4, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            tVar.H(4);
            int i3 = h3 - 16;
            byte[] bArr = new byte[i3];
            tVar.f(bArr, 0, i3);
            return new K0.a(str, null, 3, bArr);
        }
        AbstractC0123a.A("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static K0.n e(int i3, U.t tVar, String str) {
        int h3 = tVar.h();
        if (tVar.h() == 1684108385 && h3 >= 22) {
            tVar.H(10);
            int A3 = tVar.A();
            if (A3 > 0) {
                String k3 = D2.h.k("", A3);
                int A4 = tVar.A();
                if (A4 > 0) {
                    k3 = k3 + "/" + A4;
                }
                return new K0.n(str, null, I.o(k3));
            }
        }
        AbstractC0123a.A("MetadataUtil", "Failed to parse index/count attribute: " + c.b(i3));
        return null;
    }

    public static int f(U.t tVar) {
        int h3 = tVar.h();
        if (tVar.h() == 1684108385) {
            tVar.H(8);
            int i3 = h3 - 16;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4 && (tVar.e() & 128) == 0) {
                            return tVar.y();
                        }
                    } else {
                        return tVar.x();
                    }
                } else {
                    return tVar.A();
                }
            } else {
                return tVar.u();
            }
        }
        AbstractC0123a.A("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static K0.i g(int i3, String str, U.t tVar, boolean z3, boolean z4) {
        int f3 = f(tVar);
        if (z4) {
            f3 = Math.min(1, f3);
        }
        if (f3 >= 0) {
            if (z3) {
                return new K0.n(str, null, I.o(Integer.toString(f3)));
            }
            return new K0.e("und", str, Integer.toString(f3));
        }
        AbstractC0123a.A("MetadataUtil", "Failed to parse uint8 attribute: " + c.b(i3));
        return null;
    }

    public static C1.j h(byte[] bArr) {
        U.t tVar = new U.t(bArr);
        if (tVar.f2479c < 32) {
            return null;
        }
        tVar.G(0);
        int a3 = tVar.a();
        int h3 = tVar.h();
        if (h3 != a3) {
            AbstractC0123a.A("PsshAtomUtil", "Advertised atom size (" + h3 + ") does not match buffer size: " + a3);
            return null;
        }
        int h4 = tVar.h();
        if (h4 != 1886614376) {
            D2.h.n(h4, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int d3 = c.d(tVar.h());
        if (d3 > 1) {
            D2.h.n(d3, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(tVar.o(), tVar.o());
        if (d3 == 1) {
            int y3 = tVar.y();
            UUID[] uuidArr = new UUID[y3];
            for (int i3 = 0; i3 < y3; i3++) {
                uuidArr[i3] = new UUID(tVar.o(), tVar.o());
            }
        }
        int y4 = tVar.y();
        int a4 = tVar.a();
        if (y4 != a4) {
            AbstractC0123a.A("PsshAtomUtil", "Atom data size (" + y4 + ") does not match the bytes left: " + a4);
            return null;
        }
        byte[] bArr2 = new byte[y4];
        tVar.f(bArr2, 0, y4);
        return new C1.j(uuid, d3, bArr2);
    }

    public static K0.n i(int i3, U.t tVar, String str) {
        int h3 = tVar.h();
        if (tVar.h() == 1684108385) {
            tVar.H(8);
            return new K0.n(str, null, I.o(tVar.q(h3 - 16)));
        }
        AbstractC0123a.A("MetadataUtil", "Failed to parse text attribute: " + c.b(i3));
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [w0.E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [w0.E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [w0.E, java.lang.Object] */
    public static E j(w0.p pVar, boolean z3, boolean z4) {
        boolean z5;
        long j3;
        long j4;
        int i3;
        U.t tVar;
        int[] iArr;
        long j5;
        boolean z6 = true;
        long m3 = pVar.m();
        long j6 = 4096;
        long j7 = -1;
        int i4 = (m3 > (-1L) ? 1 : (m3 == (-1L) ? 0 : -1));
        if (i4 != 0 && m3 <= 4096) {
            j6 = m3;
        }
        int i5 = (int) j6;
        U.t tVar2 = new U.t(64);
        int i6 = 0;
        boolean z7 = false;
        while (i6 < i5) {
            tVar2.D(8);
            if (!pVar.p(tVar2.f2477a, 0, 8, z6)) {
                break;
            }
            long w3 = tVar2.w();
            int h3 = tVar2.h();
            if (w3 == 1) {
                pVar.z(tVar2.f2477a, 8, 8);
                i3 = 16;
                tVar2.F(16);
                j4 = tVar2.o();
                j3 = m3;
            } else {
                if (w3 == 0) {
                    long m4 = pVar.m();
                    if (m4 != j7) {
                        w3 = (m4 - pVar.u()) + 8;
                    }
                }
                j3 = m3;
                j4 = w3;
                i3 = 8;
            }
            long j8 = i3;
            if (j4 < j8) {
                return new Object();
            }
            i6 += i3;
            if (h3 == 1836019574) {
                i5 += (int) j4;
                if (i4 != 0 && i5 > j3) {
                    j5 = j3;
                    i5 = (int) j5;
                } else {
                    j5 = j3;
                }
                m3 = j5;
            } else if (h3 != 1836019558 && h3 != 1836475768) {
                if (h3 == 1835295092) {
                    z7 = true;
                }
                U.t tVar3 = tVar2;
                if ((i6 + j4) - j8 >= i5) {
                    break;
                }
                int i7 = (int) (j4 - j8);
                i6 += i7;
                if (h3 == 1718909296) {
                    if (i7 < 8) {
                        return new Object();
                    }
                    tVar = tVar3;
                    tVar.D(i7);
                    pVar.z(tVar.f2477a, 0, i7);
                    if (b(tVar.h(), z4)) {
                        z7 = true;
                    }
                    tVar.H(4);
                    int a3 = tVar.a() / 4;
                    if (!z7 && a3 > 0) {
                        iArr = new int[a3];
                        int i8 = 0;
                        while (true) {
                            if (i8 >= a3) {
                                break;
                            }
                            int h4 = tVar.h();
                            iArr[i8] = h4;
                            if (b(h4, z4)) {
                                z7 = true;
                                break;
                            }
                            i8++;
                        }
                    } else {
                        iArr = null;
                    }
                    if (!z7) {
                        ?? obj = new Object();
                        if (iArr != null) {
                            int i9 = G1.a.f378o;
                            if (iArr.length != 0) {
                                new G1.a(Arrays.copyOf(iArr, iArr.length));
                            }
                        } else {
                            int i10 = G1.a.f378o;
                        }
                        return obj;
                    }
                } else {
                    tVar = tVar3;
                    if (i7 != 0) {
                        pVar.A(i7);
                    }
                }
                tVar2 = tVar;
                m3 = j3;
            } else {
                z5 = true;
                break;
            }
            z6 = true;
            j7 = -1;
        }
        z5 = false;
        if (!z7) {
            return o.f1614c;
        }
        if (z3 != z5) {
            if (z5) {
                return o.f1612a;
            }
            return o.f1613b;
        }
        return null;
    }
}
