package M0;

import R.E;
import R.F;
import U.s;
import U.t;
import U.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class c extends android.support.v4.media.session.a {

    /* renamed from: b  reason: collision with root package name */
    public final t f1020b = new t();

    /* renamed from: c  reason: collision with root package name */
    public final s f1021c = new s();

    /* renamed from: d  reason: collision with root package name */
    public y f1022d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.media.session.a
    public final F n(F0.a aVar, ByteBuffer byteBuffer) {
        Object obj;
        boolean z3;
        int i3;
        long j3;
        ArrayList arrayList;
        long j4;
        long j5;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        int i6;
        boolean z7;
        boolean z8;
        boolean z9;
        long j6;
        long j7;
        boolean z10;
        boolean z11;
        List list;
        long j8;
        long j9;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i7;
        int i8;
        int i9;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        long j10;
        boolean z20;
        long j11;
        int i10 = 32;
        y yVar = this.f1022d;
        if (yVar == null || aVar.f368v != yVar.e()) {
            y yVar2 = new y(aVar.f2936s);
            this.f1022d = yVar2;
            yVar2.a(aVar.f2936s - aVar.f368v);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        t tVar = this.f1020b;
        tVar.E(array, limit);
        s sVar = this.f1021c;
        sVar.p(array, limit);
        sVar.t(39);
        long i11 = (sVar.i(1) << 32) | sVar.i(32);
        sVar.t(20);
        int i12 = sVar.i(12);
        int i13 = sVar.i(8);
        tVar.H(14);
        if (i13 != 0) {
            if (i13 != 255) {
                long j12 = 1;
                long j13 = -9223372036854775807L;
                if (i13 != 4) {
                    if (i13 != 5) {
                        if (i13 != 6) {
                            obj = null;
                        } else {
                            y yVar3 = this.f1022d;
                            long d3 = j.d(i11, tVar);
                            obj = new j(d3, yVar3.b(d3));
                        }
                    } else {
                        y yVar4 = this.f1022d;
                        long w3 = tVar.w();
                        if ((tVar.u() & 128) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        List emptyList = Collections.emptyList();
                        if (!z11) {
                            int u3 = tVar.u();
                            if ((u3 & 128) != 0) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if ((u3 & 64) != 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if ((u3 & 32) != 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if ((u3 & 16) != 0) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z17 && !z19) {
                                j10 = j.d(i11, tVar);
                            } else {
                                j10 = -9223372036854775807L;
                            }
                            if (!z17) {
                                int u4 = tVar.u();
                                ArrayList arrayList2 = new ArrayList(u4);
                                for (int i14 = 0; i14 < u4; i14++) {
                                    int u5 = tVar.u();
                                    if (!z19) {
                                        j11 = j.d(i11, tVar);
                                    } else {
                                        j11 = -9223372036854775807L;
                                    }
                                    arrayList2.add(new d(u5, j11, yVar4.b(j11)));
                                }
                                emptyList = arrayList2;
                            }
                            if (z18) {
                                long u6 = tVar.u();
                                if ((u6 & 128) != 0) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                j13 = ((((u6 & 1) << 32) | tVar.w()) * 1000) / 90;
                            } else {
                                z20 = false;
                            }
                            int A3 = tVar.A();
                            int u7 = tVar.u();
                            z15 = z20;
                            i7 = A3;
                            list = emptyList;
                            i9 = tVar.u();
                            i8 = u7;
                            z12 = z16;
                            j9 = j13;
                            j8 = j10;
                            z14 = z19;
                            z13 = z17;
                        } else {
                            list = emptyList;
                            j8 = -9223372036854775807L;
                            j9 = -9223372036854775807L;
                            z12 = false;
                            z13 = false;
                            z14 = false;
                            z15 = false;
                            i7 = 0;
                            i8 = 0;
                            i9 = 0;
                        }
                        obj = new e(w3, z11, z12, z13, z14, j8, yVar4.b(j8), list, z15, j9, i7, i8, i9);
                    }
                } else {
                    int u8 = tVar.u();
                    ArrayList arrayList3 = new ArrayList(u8);
                    int i15 = 0;
                    while (i15 < u8) {
                        long w4 = tVar.w();
                        if ((tVar.u() & 128) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        if (!z3) {
                            int u9 = tVar.u();
                            if ((u9 & 128) != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if ((u9 & 64) != 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if ((u9 & i10) != 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z8) {
                                j6 = tVar.w();
                            } else {
                                j6 = -9223372036854775807L;
                            }
                            if (!z8) {
                                int u10 = tVar.u();
                                ArrayList arrayList5 = new ArrayList(u10);
                                int i16 = 0;
                                while (i16 < u10) {
                                    arrayList5.add(new g(tVar.w(), tVar.u()));
                                    i16++;
                                    i15 = i15;
                                }
                                i3 = i15;
                                arrayList4 = arrayList5;
                            } else {
                                i3 = i15;
                            }
                            if (z9) {
                                long u11 = tVar.u();
                                if ((u11 & 128) != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                j3 = 1;
                                j7 = ((((u11 & 1) << 32) | tVar.w()) * 1000) / 90;
                            } else {
                                j3 = 1;
                                j7 = -9223372036854775807L;
                                z10 = false;
                            }
                            j5 = j7;
                            z6 = z10;
                            arrayList = arrayList4;
                            z4 = z7;
                            z5 = z8;
                            j4 = j6;
                            i4 = tVar.A();
                            i5 = tVar.u();
                            i6 = tVar.u();
                        } else {
                            i3 = i15;
                            j3 = j12;
                            arrayList = arrayList4;
                            j4 = -9223372036854775807L;
                            j5 = -9223372036854775807L;
                            z4 = false;
                            z5 = false;
                            z6 = false;
                            i4 = 0;
                            i5 = 0;
                            i6 = 0;
                        }
                        arrayList3.add(new h(w4, z3, z4, z5, arrayList, j4, z6, j5, i4, i5, i6));
                        i15 = i3 + 1;
                        j12 = j3;
                        i10 = 32;
                    }
                    obj = new i(arrayList3);
                }
            } else {
                long w5 = tVar.w();
                int i17 = i12 - 4;
                byte[] bArr = new byte[i17];
                tVar.f(bArr, 0, i17);
                obj = new a(w5, bArr, i11);
            }
        } else {
            obj = new Object();
        }
        if (obj == null) {
            return new F(new E[0]);
        }
        return new F(obj);
    }
}
