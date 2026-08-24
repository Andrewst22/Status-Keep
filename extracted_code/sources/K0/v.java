package k0;

import D1.I;
import D1.b0;
import D1.g0;
import R.C0105h;
import R.C0112o;
import U.AbstractC0123a;
import a.AbstractC0155a;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import w0.AbstractC0892b;
import w0.C0891a;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final C0555j f7676a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f7677b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public v(C0559n c0559n, C0548c c0548c, Uri uri) {
        Object obj;
        char c3;
        String str;
        C0547b c0547b;
        int i3;
        g0 g0Var;
        Object obj2;
        int i4;
        boolean z3;
        int i5;
        g0 a3;
        char c4;
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i7;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        int i8;
        boolean z21;
        g0 g0Var2 = c0548c.f7563i;
        AbstractC0123a.d("missing attribute control", g0Var2.containsKey("control"));
        C0112o c0112o = new C0112o();
        int i9 = c0548c.f7559e;
        if (i9 > 0) {
            c0112o.f1932g = i9;
        }
        C0547b c0547b2 = c0548c.f7564j;
        String str2 = c0547b2.f7552b;
        String N3 = AbstractC0155a.N(str2);
        N3.getClass();
        switch (N3.hashCode()) {
            case -1922091719:
                obj = "audio/3gpp";
                if (N3.equals("MPEG4-GENERIC")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 2412:
                obj = "audio/3gpp";
                if (N3.equals("L8")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 64593:
                obj = "audio/3gpp";
                if (N3.equals("AC3")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 64934:
                obj = "audio/3gpp";
                if (N3.equals("AMR")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 74609:
                obj = "audio/3gpp";
                if (N3.equals("L16")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 85182:
                obj = "audio/3gpp";
                if (N3.equals("VP8")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 85183:
                obj = "audio/3gpp";
                if (N3.equals("VP9")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 2194728:
                obj = "audio/3gpp";
                if (N3.equals("H264")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 2194729:
                obj = "audio/3gpp";
                if (N3.equals("H265")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 2433087:
                obj = "audio/3gpp";
                if (N3.equals("OPUS")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 2450119:
                obj = "audio/3gpp";
                if (N3.equals("PCMA")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 2450139:
                obj = "audio/3gpp";
                if (N3.equals("PCMU")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case 1061166827:
                obj = "audio/3gpp";
                if (N3.equals("MP4A-LATM")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 1934494802:
                obj = "audio/3gpp";
                if (N3.equals("AMR-WB")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            case 1959269366:
                obj = "audio/3gpp";
                if (N3.equals("MP4V-ES")) {
                    c3 = 14;
                    break;
                }
                c3 = 65535;
                break;
            case 2137188397:
                obj = "audio/3gpp";
                if (N3.equals("H263-1998")) {
                    c3 = 15;
                    break;
                }
                c3 = 65535;
                break;
            case 2137209252:
                obj = "audio/3gpp";
                if (N3.equals("H263-2000")) {
                    c3 = 16;
                    break;
                }
                c3 = 65535;
                break;
            default:
                obj = "audio/3gpp";
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
            case '\f':
                str = "audio/mp4a-latm";
                break;
            case 1:
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                str = "audio/raw";
                break;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                str = "audio/ac3";
                break;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                str = obj;
                break;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                str = "video/x-vnd.on2.vp8";
                break;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "video/x-vnd.on2.vp9";
                break;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "video/avc";
                break;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                str = "video/hevc";
                break;
            case '\t':
                str = "audio/opus";
                break;
            case '\n':
                str = "audio/g711-alaw";
                break;
            case 11:
                str = "audio/g711-mlaw";
                break;
            case '\r':
                str = "audio/amr-wb";
                break;
            case 14:
                str = "video/mp4v-es";
                break;
            case 15:
            case 16:
                str = "video/3gpp";
                break;
            default:
                throw new IllegalArgumentException(str2);
        }
        c0112o.g(str);
        boolean equals = "audio".equals(c0548c.f7555a);
        int i10 = c0547b2.f7553c;
        if (equals) {
            int i11 = c0547b2.f7554d;
            c0547b = c0547b2;
            if (i11 == -1) {
                if (str.equals("audio/ac3")) {
                    i11 = 6;
                } else {
                    i11 = 1;
                }
            }
            c0112o.f1917A = i10;
            c0112o.f1950z = i11;
            i3 = i11;
        } else {
            c0547b = c0547b2;
            i3 = -1;
        }
        String str3 = (String) g0Var2.get("fmtp");
        if (str3 == null) {
            a3 = g0.f255s;
            g0Var = g0Var2;
            obj2 = "MP4A-LATM";
            i5 = i3;
            i4 = i10;
        } else {
            int i12 = U.A.f2405a;
            g0Var = g0Var2;
            obj2 = "MP4A-LATM";
            String[] split = str3.split(" ", 2);
            i4 = i10;
            if (split.length == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0123a.d(str3, z3);
            String[] split2 = split[1].split(";\\s?", 0);
            B0.b bVar = new B0.b(4);
            int length = split2.length;
            int i13 = 0;
            while (i13 < length) {
                String[] strArr = split2;
                String[] split3 = split2[i13].split("=", 2);
                bVar.h(split3[0], split3[1]);
                i13++;
                length = length;
                split2 = strArr;
                i3 = i3;
            }
            i5 = i3;
            a3 = bVar.a();
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 1503095341:
                if (str.equals(obj)) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                i6 = i4;
                int i14 = i5;
                if (i14 != -1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                AbstractC0123a.e(z4);
                AbstractC0123a.d("missing attribute fmtp", !a3.isEmpty());
                Object obj3 = obj2;
                if (str2.equals(obj3)) {
                    if (a3.containsKey("cpresent") && ((String) a3.get("cpresent")).equals("0")) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    AbstractC0123a.d("Only supports cpresent=0 in AAC audio.", z6);
                    String str4 = (String) a3.get("config");
                    if (str4 != null) {
                        if (str4.length() % 2 == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        AbstractC0123a.d("Malformat MPEG4 config: ".concat(str4), z7);
                        byte[] t3 = U.A.t(str4);
                        U.s sVar = new U.s(t3, t3.length);
                        if (sVar.i(1) == 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        AbstractC0123a.d("Only supports audio mux version 0.", z8);
                        if (sVar.i(1) == 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        AbstractC0123a.d("Only supports allStreamsSameTimeFraming.", z9);
                        sVar.t(6);
                        if (sVar.i(4) == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        AbstractC0123a.d("Only supports one program.", z10);
                        if (sVar.i(3) == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        AbstractC0123a.d("Only supports one numLayer.", z11);
                        try {
                            C0891a q3 = AbstractC0892b.q(sVar, false);
                            c0112o.f1917A = q3.f9530b;
                            c0112o.f1950z = q3.f9531c;
                            c0112o.b(q3.f9529a);
                        } catch (R.H e2) {
                            throw new IllegalArgumentException(e2);
                        }
                    } else {
                        throw new NullPointerException("AAC audio stream must include config fmtp parameter");
                    }
                }
                String str5 = (String) a3.get("profile-level-id");
                if (str5 == null && str2.equals(obj3)) {
                    str5 = "30";
                }
                if (str5 != null && !str5.isEmpty()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                AbstractC0123a.d("missing profile-level-id param", z5);
                c0112o.f1934i = "mp4a.40." + str5;
                c0112o.f1940o = I.o(AbstractC0892b.a(i6, i14));
                break;
            case 1:
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                i6 = i4;
                if (i5 == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                AbstractC0123a.d("Multi channel AMR is not currently supported.", z12);
                AbstractC0123a.d("fmtp parameters must include octet-align.", !a3.isEmpty());
                AbstractC0123a.d("Only octet aligned mode is currently supported.", a3.containsKey("octet-align"));
                AbstractC0123a.d("Interleaving mode is not currently supported.", !a3.containsKey("interleaving"));
                break;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                if (i5 != -1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                AbstractC0123a.e(z13);
                i6 = i4;
                if (i6 == 48000) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                AbstractC0123a.d("Invalid OPUS clock rate.", z14);
                break;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0123a.e(!a3.isEmpty());
                String str6 = (String) a3.get("config");
                if (str6 != null) {
                    byte[] t4 = U.A.t(str6);
                    c0112o.f1940o = I.o(t4);
                    U.t tVar = new U.t(t4);
                    int i15 = 0;
                    while (true) {
                        int i16 = i15 + 3;
                        if (i16 < t4.length) {
                            if (tVar.x() == 1 && (t4[i16] & 240) == 32) {
                                z15 = true;
                            } else {
                                tVar.G(tVar.f2478b - 2);
                                i15++;
                            }
                        } else {
                            z15 = false;
                        }
                    }
                    AbstractC0123a.d("Invalid input: VOL not found.", z15);
                    U.s sVar2 = new U.s(t4, t4.length);
                    sVar2.t((i15 + 4) * 8);
                    sVar2.t(1);
                    sVar2.t(8);
                    if (sVar2.h()) {
                        sVar2.t(4);
                        sVar2.t(3);
                    }
                    if (sVar2.i(4) == 15) {
                        sVar2.t(8);
                        sVar2.t(8);
                    }
                    if (sVar2.h()) {
                        i7 = 2;
                        sVar2.t(2);
                        sVar2.t(1);
                        if (sVar2.h()) {
                            sVar2.t(79);
                        }
                    } else {
                        i7 = 2;
                    }
                    if (sVar2.i(i7) == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    AbstractC0123a.d("Only supports rectangular video object layer shape.", z16);
                    AbstractC0123a.e(sVar2.h());
                    int i17 = sVar2.i(16);
                    AbstractC0123a.e(sVar2.h());
                    if (sVar2.h()) {
                        if (i17 > 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        AbstractC0123a.e(z17);
                        int i18 = 0;
                        for (int i19 = i17 - 1; i19 > 0; i19 >>= 1) {
                            i18++;
                        }
                        sVar2.t(i18);
                    }
                    AbstractC0123a.e(sVar2.h());
                    int i20 = sVar2.i(13);
                    AbstractC0123a.e(sVar2.h());
                    int i21 = sVar2.i(13);
                    AbstractC0123a.e(sVar2.h());
                    sVar2.t(1);
                    Pair create = Pair.create(Integer.valueOf(i20), Integer.valueOf(i21));
                    c0112o.f1943r = ((Integer) create.first).intValue();
                    c0112o.f1944s = ((Integer) create.second).intValue();
                } else {
                    c0112o.f1943r = 352;
                    c0112o.f1944s = 288;
                }
                String str7 = (String) a3.get("profile-level-id");
                c0112o.f1934i = "mp4v.".concat(str7 == null ? "1" : str7);
                i6 = i4;
                break;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                c0112o.h(352);
                c0112o.d(288);
                i6 = i4;
                break;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractC0123a.d("missing attribute fmtp", !a3.isEmpty());
                AbstractC0123a.d("missing sprop parameter", a3.containsKey("sprop-parameter-sets"));
                String str8 = (String) a3.get("sprop-parameter-sets");
                AbstractC0123a.h(str8);
                String[] W2 = U.A.W(str8, ",");
                if (W2.length == 2) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                AbstractC0123a.d("empty sprop value", z18);
                b0 p3 = I.p(a(W2[0]), a(W2[1]));
                c0112o.e(p3);
                byte[] bArr = (byte[]) p3.get(0);
                V.f d3 = V.g.d(bArr, 4, bArr.length);
                c0112o.f(d3.f2639g);
                c0112o.d(d3.f2638f);
                c0112o.h(d3.f2637e);
                C0105h c0105h = new C0105h();
                c0105h.f(d3.f2648p);
                c0105h.e(d3.f2649q);
                c0105h.g(d3.f2650r);
                c0105h.h(d3.f2640h + 8);
                c0105h.d(d3.f2641i + 8);
                c0112o.c(c0105h.b());
                String str9 = (String) a3.get("profile-level-id");
                if (str9 != null) {
                    c0112o.b("avc1.".concat(str9));
                } else {
                    c0112o.b(AbstractC0123a.b(d3.f2633a, d3.f2634b, d3.f2635c));
                }
                i6 = i4;
                break;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC0123a.d("missing attribute fmtp", !a3.isEmpty());
                if (a3.containsKey("sprop-max-don-diff")) {
                    String str10 = (String) a3.get("sprop-max-don-diff");
                    AbstractC0123a.h(str10);
                    int parseInt = Integer.parseInt(str10);
                    if (parseInt == 0) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    AbstractC0123a.d("non-zero sprop-max-don-diff " + parseInt + " is not supported", z19);
                }
                AbstractC0123a.d("missing sprop-vps parameter", a3.containsKey("sprop-vps"));
                String str11 = (String) a3.get("sprop-vps");
                AbstractC0123a.h(str11);
                AbstractC0123a.d("missing sprop-sps parameter", a3.containsKey("sprop-sps"));
                String str12 = (String) a3.get("sprop-sps");
                AbstractC0123a.h(str12);
                AbstractC0123a.d("missing sprop-pps parameter", a3.containsKey("sprop-pps"));
                String str13 = (String) a3.get("sprop-pps");
                AbstractC0123a.h(str13);
                b0 q4 = I.q(a(str11), a(str12), a(str13));
                c0112o.e(q4);
                byte[] bArr2 = (byte[]) q4.get(1);
                V.d c5 = V.g.c(bArr2, 4, bArr2.length);
                c0112o.f(c5.f2626k);
                c0112o.d(c5.f2625j);
                c0112o.h(c5.f2624i);
                C0105h c0105h2 = new C0105h();
                c0105h2.f(c5.f2628m);
                c0105h2.e(c5.f2629n);
                c0105h2.g(c5.f2630o);
                c0105h2.h(c5.f2620e + 8);
                c0105h2.d(c5.f2621f + 8);
                c0112o.c(c0105h2.b());
                c0112o.b(AbstractC0123a.c(c5.f2616a, c5.f2617b, c5.f2618c, c5.f2619d, c5.f2622g, c5.f2623h));
                i6 = i4;
                break;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                c0112o.f1943r = 320;
                c0112o.f1944s = 240;
                i6 = i4;
                break;
            case '\t':
                c0112o.f1943r = 320;
                c0112o.f1944s = 240;
                i6 = i4;
                break;
            case '\n':
                if (!str2.equals("L8") && !str2.equals("L16")) {
                    z20 = false;
                } else {
                    z20 = true;
                }
                AbstractC0123a.e(z20);
                if (str2.equals("L8")) {
                    i8 = 3;
                } else {
                    i8 = 268435456;
                }
                c0112o.f1918B = i8;
                i6 = i4;
                break;
            default:
                i6 = i4;
                break;
        }
        if (i6 > 0) {
            z21 = true;
        } else {
            z21 = false;
        }
        AbstractC0123a.e(z21);
        this.f7676a = new C0555j(c0112o.a(), c0547b.f7551a, i6, a3, str2);
        String str14 = (String) g0Var.get("control");
        int i22 = U.A.f2405a;
        Uri parse = Uri.parse(str14);
        if (!parse.isAbsolute()) {
            if (!TextUtils.isEmpty(c0559n.c("Content-Base"))) {
                parse = Uri.parse(c0559n.c("Content-Base"));
            } else if (!TextUtils.isEmpty(c0559n.c("Content-Location"))) {
                parse = Uri.parse(c0559n.c("Content-Location"));
            } else {
                parse = uri;
            }
            if (!str14.equals("*")) {
                parse = parse.buildUpon().appendEncodedPath(str14).build();
            }
        }
        this.f7677b = parse;
    }

    public static byte[] a(String str) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length + 4];
        System.arraycopy(V.g.f2652a, 0, bArr, 0, 4);
        System.arraycopy(decode, 0, bArr, 4, decode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f7676a.equals(vVar.f7676a) && this.f7677b.equals(vVar.f7677b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7677b.hashCode() + ((this.f7676a.hashCode() + 217) * 31);
    }
}
