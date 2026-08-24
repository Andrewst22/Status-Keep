package y0;

import D1.C;
import D1.I;
import D1.b0;
import D1.r;
import R.C0112o;
import R.C0113p;
import R.G;
import U.A;
import U.AbstractC0123a;
import U.t;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class f implements InterfaceC0904a {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f9737a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9738b;

    public f(int i3, b0 b0Var) {
        this.f9738b = i3;
        this.f9737a = b0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f c(int i3, t tVar) {
        String str;
        int i4;
        String str2;
        InterfaceC0904a cVar;
        int i5 = 4;
        r.e("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i6 = tVar.f2479c;
        int i7 = 0;
        int i8 = -2;
        int i9 = 0;
        while (tVar.a() > 8) {
            int j3 = tVar.j();
            int j4 = tVar.f2478b + tVar.j();
            tVar.F(j4);
            if (j3 == 1414744396) {
                cVar = c(tVar.j(), tVar);
            } else {
                g gVar = null;
                switch (j3) {
                    case 1718776947:
                        if (i8 == 2) {
                            tVar.H(i5);
                            int j5 = tVar.j();
                            int j6 = tVar.j();
                            tVar.H(i5);
                            int j7 = tVar.j();
                            switch (j7) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                D2.h.n(j7, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                            } else {
                                C0112o c0112o = new C0112o();
                                c0112o.f1943r = j5;
                                c0112o.f1944s = j6;
                                c0112o.g(str2);
                                gVar = new g(new C0113p(c0112o));
                            }
                        } else if (i8 == 1) {
                            int n3 = tVar.n();
                            if (n3 == 1) {
                                str = "audio/raw";
                            } else if (n3 != 85) {
                                if (n3 == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (n3 != 8192) {
                                    if (n3 != 8193) {
                                        str = null;
                                    } else {
                                        str = "audio/vnd.dts";
                                    }
                                } else {
                                    str = "audio/ac3";
                                }
                            } else {
                                str = "audio/mpeg";
                            }
                            if (str == null) {
                                D2.h.n(n3, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                            } else {
                                int n4 = tVar.n();
                                int j8 = tVar.j();
                                tVar.H(6);
                                int A3 = A.A(tVar.n());
                                if (tVar.a() > 0) {
                                    i4 = tVar.n();
                                } else {
                                    i4 = 0;
                                }
                                byte[] bArr = new byte[i4];
                                tVar.f(bArr, i7, i4);
                                C0112o c0112o2 = new C0112o();
                                c0112o2.f1937l = G.l(str);
                                c0112o2.f1950z = n4;
                                c0112o2.f1917A = j8;
                                if ("audio/raw".equals(str) && A3 != 0) {
                                    c0112o2.f1918B = A3;
                                }
                                if ("audio/mp4a-latm".equals(str) && i4 > 0) {
                                    c0112o2.f1940o = I.o(bArr);
                                }
                                gVar = new g(new C0113p(c0112o2));
                            }
                        } else {
                            AbstractC0123a.A("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + A.F(i8));
                        }
                        cVar = gVar;
                        break;
                    case 1751742049:
                        int j9 = tVar.j();
                        tVar.H(8);
                        int j10 = tVar.j();
                        int j11 = tVar.j();
                        tVar.H(i5);
                        tVar.j();
                        tVar.H(12);
                        cVar = new c(j9, j10, j11);
                        break;
                    case 1752331379:
                        int j12 = tVar.j();
                        tVar.H(12);
                        tVar.j();
                        int j13 = tVar.j();
                        int j14 = tVar.j();
                        tVar.H(i5);
                        int j15 = tVar.j();
                        int j16 = tVar.j();
                        tVar.H(8);
                        cVar = new d(j12, j13, j14, j15, j16);
                        break;
                    case 1852994675:
                        cVar = new h(tVar.s(tVar.a(), C1.d.f153c));
                        break;
                    default:
                        cVar = gVar;
                        break;
                }
            }
            if (cVar != null) {
                if (cVar.a() == 1752331379) {
                    int i10 = ((d) cVar).f9720a;
                    if (i10 != 1935960438) {
                        if (i10 != 1935963489) {
                            if (i10 != 1937012852) {
                                AbstractC0123a.A("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i10));
                                i8 = -1;
                            } else {
                                i8 = 3;
                            }
                        } else {
                            i8 = 1;
                        }
                    } else {
                        i8 = 2;
                    }
                }
                int i11 = i9 + 1;
                if (objArr.length < i11) {
                    objArr = Arrays.copyOf(objArr, C.e(objArr.length, i11));
                }
                objArr[i9] = cVar;
                i9 = i11;
            }
            tVar.G(j4);
            tVar.F(i6);
            i5 = 4;
            i7 = 0;
        }
        return new f(i3, I.h(i9, objArr));
    }

    @Override // y0.InterfaceC0904a
    public final int a() {
        return this.f9738b;
    }

    public final InterfaceC0904a b(Class cls) {
        D1.G listIterator = this.f9737a.listIterator(0);
        while (listIterator.hasNext()) {
            InterfaceC0904a interfaceC0904a = (InterfaceC0904a) listIterator.next();
            if (interfaceC0904a.getClass() == cls) {
                return interfaceC0904a;
            }
        }
        return null;
    }
}
