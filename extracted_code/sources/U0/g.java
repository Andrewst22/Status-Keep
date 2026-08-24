package U0;

import C1.j;
import U.AbstractC0123a;
import U.s;
import U.t;
import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: h  reason: collision with root package name */
    public final t f2562h = new t();

    /* renamed from: i  reason: collision with root package name */
    public final s f2563i = new s();

    /* renamed from: j  reason: collision with root package name */
    public int f2564j = -1;

    /* renamed from: k  reason: collision with root package name */
    public final int f2565k;

    /* renamed from: l  reason: collision with root package name */
    public final f[] f2566l;

    /* renamed from: m  reason: collision with root package name */
    public f f2567m;

    /* renamed from: n  reason: collision with root package name */
    public List f2568n;

    /* renamed from: o  reason: collision with root package name */
    public List f2569o;

    /* renamed from: p  reason: collision with root package name */
    public s f2570p;

    /* renamed from: q  reason: collision with root package name */
    public int f2571q;

    public g(int i3, List list) {
        this.f2565k = i3 == -1 ? 1 : i3;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b3 = ((byte[]) list.get(0))[0];
        }
        this.f2566l = new f[8];
        for (int i4 = 0; i4 < 8; i4++) {
            this.f2566l[i4] = new f();
        }
        this.f2567m = this.f2566l[0];
    }

    @Override // U0.i
    public final j f() {
        List list = this.f2568n;
        this.f2569o = list;
        list.getClass();
        return new j(list, 17);
    }

    @Override // U0.i, X.c
    public final void flush() {
        super.flush();
        this.f2568n = null;
        this.f2569o = null;
        this.f2571q = 0;
        this.f2567m = this.f2566l[0];
        l();
        this.f2570p = null;
    }

    @Override // U0.i
    public final void g(h hVar) {
        boolean z3;
        ByteBuffer byteBuffer = hVar.f2934q;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        t tVar = this.f2562h;
        tVar.E(array, limit);
        while (tVar.a() >= 3) {
            int u3 = tVar.u();
            int i3 = u3 & 3;
            boolean z4 = false;
            if ((u3 & 4) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            byte u4 = (byte) tVar.u();
            byte u5 = (byte) tVar.u();
            if (i3 == 2 || i3 == 3) {
                if (z3) {
                    if (i3 == 3) {
                        j();
                        int i4 = (u4 & 192) >> 6;
                        int i5 = this.f2564j;
                        if (i5 != -1 && i4 != (i5 + 1) % 4) {
                            l();
                            AbstractC0123a.A("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f2564j + " current=" + i4);
                        }
                        this.f2564j = i4;
                        int i6 = u4 & 63;
                        if (i6 == 0) {
                            i6 = 64;
                        }
                        s sVar = new s(i4, i6);
                        this.f2570p = sVar;
                        sVar.f2473e = 1;
                        sVar.f2472d[0] = u5;
                    } else {
                        if (i3 == 2) {
                            z4 = true;
                        }
                        AbstractC0123a.e(z4);
                        s sVar2 = this.f2570p;
                        if (sVar2 == null) {
                            AbstractC0123a.n("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = sVar2.f2472d;
                            int i7 = sVar2.f2473e;
                            int i8 = i7 + 1;
                            sVar2.f2473e = i8;
                            bArr[i7] = u4;
                            sVar2.f2473e = i7 + 2;
                            bArr[i8] = u5;
                        }
                    }
                    s sVar3 = this.f2570p;
                    if (sVar3.f2473e == (sVar3.f2471c * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // U0.i
    public final boolean i() {
        if (this.f2568n != this.f2569o) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        int i3;
        f fVar;
        s sVar = this.f2570p;
        if (sVar == null) {
            return;
        }
        int i4 = 2;
        if (sVar.f2473e != (sVar.f2471c * 2) - 1) {
            AbstractC0123a.m("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f2570p.f2471c * 2) - 1) + ", but current index is " + this.f2570p.f2473e + " (sequence number " + this.f2570p.f2470b + ");");
        }
        s sVar2 = this.f2570p;
        byte[] bArr = sVar2.f2472d;
        int i5 = sVar2.f2473e;
        s sVar3 = this.f2563i;
        sVar3.p(bArr, i5);
        boolean z3 = false;
        while (true) {
            if (sVar3.b() > 0) {
                int i6 = 3;
                int i7 = sVar3.i(3);
                int i8 = sVar3.i(5);
                if (i7 == 7) {
                    sVar3.t(i4);
                    i7 = sVar3.i(6);
                    if (i7 < 7) {
                        D2.h.n(i7, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i8 == 0) {
                    if (i7 != 0) {
                        AbstractC0123a.A("Cea708Decoder", "serviceNumber is non-zero (" + i7 + ") when blockSize is 0");
                    }
                } else if (i7 != this.f2565k) {
                    sVar3.u(i8);
                } else {
                    int g3 = (i8 * 8) + sVar3.g();
                    while (sVar3.g() < g3) {
                        int i9 = sVar3.i(8);
                        if (i9 != 16) {
                            if (i9 <= 31) {
                                if (i9 != 0) {
                                    if (i9 != i6) {
                                        if (i9 != 8) {
                                            switch (i9) {
                                                case 12:
                                                    l();
                                                    break;
                                                case 13:
                                                    this.f2567m.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i9 >= 17 && i9 <= 23) {
                                                        AbstractC0123a.A("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i9);
                                                        sVar3.t(8);
                                                        break;
                                                    } else if (i9 >= 24 && i9 <= 31) {
                                                        AbstractC0123a.A("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i9);
                                                        sVar3.t(16);
                                                        break;
                                                    } else {
                                                        D2.h.n(i9, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f2567m.f2542b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f2568n = k();
                                    }
                                }
                                i3 = g3;
                            } else if (i9 <= 127) {
                                if (i9 == 127) {
                                    this.f2567m.a((char) 9835);
                                } else {
                                    this.f2567m.a((char) (i9 & 255));
                                }
                                i3 = g3;
                                z3 = true;
                            } else {
                                if (i9 <= 159) {
                                    f[] fVarArr = this.f2566l;
                                    switch (i9) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i3 = g3;
                                            int i10 = i9 - 128;
                                            if (this.f2571q != i10) {
                                                this.f2571q = i10;
                                                this.f2567m = fVarArr[i10];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            i3 = g3;
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (sVar3.h()) {
                                                    f fVar2 = fVarArr[8 - i11];
                                                    fVar2.f2541a.clear();
                                                    fVar2.f2542b.clear();
                                                    fVar2.f2555o = -1;
                                                    fVar2.f2556p = -1;
                                                    fVar2.f2557q = -1;
                                                    fVar2.f2559s = -1;
                                                    fVar2.f2561u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i3 = g3;
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (sVar3.h()) {
                                                    fVarArr[8 - i12].f2544d = true;
                                                }
                                            }
                                            break;
                                        case 138:
                                            i3 = g3;
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (sVar3.h()) {
                                                    fVarArr[8 - i13].f2544d = false;
                                                }
                                            }
                                            break;
                                        case 139:
                                            i3 = g3;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (sVar3.h()) {
                                                    fVarArr[8 - i14].f2544d = !fVar.f2544d;
                                                }
                                            }
                                            break;
                                        case 140:
                                            i3 = g3;
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (sVar3.h()) {
                                                    fVarArr[8 - i15].d();
                                                }
                                            }
                                            break;
                                        case 141:
                                            i3 = g3;
                                            sVar3.t(8);
                                            break;
                                        case 142:
                                            i3 = g3;
                                            break;
                                        case 143:
                                            i3 = g3;
                                            l();
                                            break;
                                        case 144:
                                            i3 = g3;
                                            if (!this.f2567m.f2543c) {
                                                sVar3.t(16);
                                                break;
                                            } else {
                                                sVar3.i(4);
                                                sVar3.i(2);
                                                sVar3.i(2);
                                                boolean h3 = sVar3.h();
                                                boolean h4 = sVar3.h();
                                                sVar3.i(3);
                                                sVar3.i(3);
                                                this.f2567m.e(h3, h4);
                                            }
                                        case 145:
                                            i3 = g3;
                                            if (!this.f2567m.f2543c) {
                                                sVar3.t(24);
                                            } else {
                                                int c3 = f.c(sVar3.i(2), sVar3.i(2), sVar3.i(2), sVar3.i(2));
                                                int c4 = f.c(sVar3.i(2), sVar3.i(2), sVar3.i(2), sVar3.i(2));
                                                sVar3.t(2);
                                                f.c(sVar3.i(2), sVar3.i(2), sVar3.i(2), 0);
                                                this.f2567m.f(c3, c4);
                                            }
                                            break;
                                        case 146:
                                            i3 = g3;
                                            if (!this.f2567m.f2543c) {
                                                sVar3.t(16);
                                            } else {
                                                sVar3.t(4);
                                                int i16 = sVar3.i(4);
                                                sVar3.t(2);
                                                sVar3.i(6);
                                                f fVar3 = this.f2567m;
                                                if (fVar3.f2561u != i16) {
                                                    fVar3.a('\n');
                                                }
                                                fVar3.f2561u = i16;
                                            }
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            D2.h.n(i9, "Invalid C1 command: ", "Cea708Decoder");
                                            i3 = g3;
                                            break;
                                        case 151:
                                            i3 = g3;
                                            if (!this.f2567m.f2543c) {
                                                sVar3.t(32);
                                            } else {
                                                int c5 = f.c(sVar3.i(2), sVar3.i(2), sVar3.i(2), sVar3.i(2));
                                                sVar3.i(2);
                                                f.c(sVar3.i(2), sVar3.i(2), sVar3.i(2), 0);
                                                sVar3.h();
                                                sVar3.h();
                                                sVar3.i(2);
                                                sVar3.i(2);
                                                int i17 = sVar3.i(2);
                                                sVar3.t(8);
                                                f fVar4 = this.f2567m;
                                                fVar4.f2554n = c5;
                                                fVar4.f2551k = i17;
                                            }
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i18 = i9 - 152;
                                            f fVar5 = fVarArr[i18];
                                            sVar3.t(i4);
                                            boolean h5 = sVar3.h();
                                            sVar3.t(i4);
                                            int i19 = sVar3.i(i6);
                                            boolean h6 = sVar3.h();
                                            int i20 = sVar3.i(7);
                                            int i21 = sVar3.i(8);
                                            int i22 = sVar3.i(4);
                                            int i23 = sVar3.i(4);
                                            sVar3.t(i4);
                                            sVar3.t(6);
                                            sVar3.t(i4);
                                            int i24 = sVar3.i(3);
                                            i3 = g3;
                                            int i25 = sVar3.i(3);
                                            fVar5.f2543c = true;
                                            fVar5.f2544d = h5;
                                            fVar5.f2545e = i19;
                                            fVar5.f2546f = h6;
                                            fVar5.f2547g = i20;
                                            fVar5.f2548h = i21;
                                            fVar5.f2549i = i22;
                                            int i26 = i23 + 1;
                                            if (fVar5.f2550j != i26) {
                                                fVar5.f2550j = i26;
                                                while (true) {
                                                    ArrayList arrayList = fVar5.f2541a;
                                                    if (arrayList.size() >= fVar5.f2550j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i24 != 0 && fVar5.f2552l != i24) {
                                                fVar5.f2552l = i24;
                                                int i27 = i24 - 1;
                                                int i28 = f.f2533B[i27];
                                                boolean z4 = f.f2532A[i27];
                                                int i29 = f.f2539y[i27];
                                                int i30 = f.f2540z[i27];
                                                int i31 = f.x[i27];
                                                fVar5.f2554n = i28;
                                                fVar5.f2551k = i31;
                                            }
                                            if (i25 != 0 && fVar5.f2553m != i25) {
                                                fVar5.f2553m = i25;
                                                int i32 = i25 - 1;
                                                int i33 = f.f2535D[i32];
                                                int i34 = f.f2534C[i32];
                                                fVar5.e(false, false);
                                                fVar5.f(f.f2537v, f.f2536E[i32]);
                                            }
                                            if (this.f2571q != i18) {
                                                this.f2571q = i18;
                                                this.f2567m = fVarArr[i18];
                                            }
                                            break;
                                    }
                                } else {
                                    i3 = g3;
                                    if (i9 <= 255) {
                                        this.f2567m.a((char) (i9 & 255));
                                    } else {
                                        D2.h.n(i9, "Invalid base command: ", "Cea708Decoder");
                                    }
                                }
                                z3 = true;
                            }
                        } else {
                            i3 = g3;
                            int i35 = sVar3.i(8);
                            if (i35 <= 31) {
                                if (i35 > 7) {
                                    if (i35 <= 15) {
                                        sVar3.t(8);
                                    } else if (i35 <= 23) {
                                        sVar3.t(16);
                                    } else if (i35 <= 31) {
                                        sVar3.t(24);
                                    }
                                }
                            } else if (i35 <= 127) {
                                if (i35 != 32) {
                                    if (i35 != 33) {
                                        if (i35 != 37) {
                                            if (i35 != 42) {
                                                if (i35 != 44) {
                                                    if (i35 != 63) {
                                                        if (i35 != 57) {
                                                            if (i35 != 58) {
                                                                if (i35 != 60) {
                                                                    if (i35 != 61) {
                                                                        switch (i35) {
                                                                            case 48:
                                                                                this.f2567m.a((char) 9608);
                                                                                break;
                                                                            case 49:
                                                                                this.f2567m.a((char) 8216);
                                                                                break;
                                                                            case 50:
                                                                                this.f2567m.a((char) 8217);
                                                                                break;
                                                                            case 51:
                                                                                this.f2567m.a((char) 8220);
                                                                                break;
                                                                            case 52:
                                                                                this.f2567m.a((char) 8221);
                                                                                break;
                                                                            case 53:
                                                                                this.f2567m.a((char) 8226);
                                                                                break;
                                                                            default:
                                                                                switch (i35) {
                                                                                    case 118:
                                                                                        this.f2567m.a((char) 8539);
                                                                                        break;
                                                                                    case 119:
                                                                                        this.f2567m.a((char) 8540);
                                                                                        break;
                                                                                    case 120:
                                                                                        this.f2567m.a((char) 8541);
                                                                                        break;
                                                                                    case 121:
                                                                                        this.f2567m.a((char) 8542);
                                                                                        break;
                                                                                    case 122:
                                                                                        this.f2567m.a((char) 9474);
                                                                                        break;
                                                                                    case 123:
                                                                                        this.f2567m.a((char) 9488);
                                                                                        break;
                                                                                    case 124:
                                                                                        this.f2567m.a((char) 9492);
                                                                                        break;
                                                                                    case 125:
                                                                                        this.f2567m.a((char) 9472);
                                                                                        break;
                                                                                    case 126:
                                                                                        this.f2567m.a((char) 9496);
                                                                                        break;
                                                                                    case 127:
                                                                                        this.f2567m.a((char) 9484);
                                                                                        break;
                                                                                    default:
                                                                                        D2.h.n(i35, "Invalid G2 character: ", "Cea708Decoder");
                                                                                        break;
                                                                                }
                                                                        }
                                                                    } else {
                                                                        this.f2567m.a((char) 8480);
                                                                    }
                                                                } else {
                                                                    this.f2567m.a((char) 339);
                                                                }
                                                            } else {
                                                                this.f2567m.a((char) 353);
                                                            }
                                                        } else {
                                                            this.f2567m.a((char) 8482);
                                                        }
                                                    } else {
                                                        this.f2567m.a((char) 376);
                                                    }
                                                } else {
                                                    this.f2567m.a((char) 338);
                                                }
                                            } else {
                                                this.f2567m.a((char) 352);
                                            }
                                        } else {
                                            this.f2567m.a((char) 8230);
                                        }
                                    } else {
                                        this.f2567m.a((char) 160);
                                    }
                                } else {
                                    this.f2567m.a(' ');
                                }
                                z3 = true;
                            } else if (i35 <= 159) {
                                if (i35 <= 135) {
                                    sVar3.t(32);
                                } else if (i35 <= 143) {
                                    sVar3.t(40);
                                } else if (i35 <= 159) {
                                    sVar3.t(2);
                                    sVar3.t(sVar3.i(6) * 8);
                                }
                            } else if (i35 <= 255) {
                                if (i35 == 160) {
                                    this.f2567m.a((char) 13252);
                                } else {
                                    D2.h.n(i35, "Invalid G3 character: ", "Cea708Decoder");
                                    this.f2567m.a('_');
                                }
                                z3 = true;
                            } else {
                                D2.h.n(i35, "Invalid extended command: ", "Cea708Decoder");
                            }
                        }
                        g3 = i3;
                        i4 = 2;
                        i6 = 3;
                    }
                }
            }
        }
        if (z3) {
            this.f2568n = k();
        }
        this.f2570p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.g.k():java.util.List");
    }

    public final void l() {
        for (int i3 = 0; i3 < 8; i3++) {
            this.f2566l[i3].d();
        }
    }
}
