package f0;

import D1.I;
import D1.r;
import Q0.t;
import R.AbstractC0104g;
import R.C0109l;
import R.C0110m;
import R.H;
import U.A;
import U.AbstractC0123a;
import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class o implements s0.p {

    /* renamed from: m  reason: collision with root package name */
    public final l f5544m;

    /* renamed from: n  reason: collision with root package name */
    public final i f5545n;

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f5533o = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f5534p = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f5535q = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f5536r = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f5537s = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: t  reason: collision with root package name */
    public static final Pattern f5538t = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: u  reason: collision with root package name */
    public static final Pattern f5539u = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: v  reason: collision with root package name */
    public static final Pattern f5540v = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: w  reason: collision with root package name */
    public static final Pattern f5541w = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern x = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: y  reason: collision with root package name */
    public static final Pattern f5542y = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: z  reason: collision with root package name */
    public static final Pattern f5543z = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: A  reason: collision with root package name */
    public static final Pattern f5494A = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: B  reason: collision with root package name */
    public static final Pattern f5495B = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: C  reason: collision with root package name */
    public static final Pattern f5496C = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: D  reason: collision with root package name */
    public static final Pattern f5497D = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: E  reason: collision with root package name */
    public static final Pattern f5498E = a("CAN-SKIP-DATERANGES");

    /* renamed from: F  reason: collision with root package name */
    public static final Pattern f5499F = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: G  reason: collision with root package name */
    public static final Pattern f5500G = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: H  reason: collision with root package name */
    public static final Pattern f5501H = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: I  reason: collision with root package name */
    public static final Pattern f5502I = a("CAN-BLOCK-RELOAD");

    /* renamed from: J  reason: collision with root package name */
    public static final Pattern f5503J = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: K  reason: collision with root package name */
    public static final Pattern f5504K = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern L = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: M  reason: collision with root package name */
    public static final Pattern f5505M = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: N  reason: collision with root package name */
    public static final Pattern f5506N = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: O  reason: collision with root package name */
    public static final Pattern f5507O = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: P  reason: collision with root package name */
    public static final Pattern f5508P = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: Q  reason: collision with root package name */
    public static final Pattern f5509Q = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: R  reason: collision with root package name */
    public static final Pattern f5510R = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: S  reason: collision with root package name */
    public static final Pattern f5511S = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: T  reason: collision with root package name */
    public static final Pattern f5512T = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: U  reason: collision with root package name */
    public static final Pattern f5513U = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: V  reason: collision with root package name */
    public static final Pattern f5514V = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: W  reason: collision with root package name */
    public static final Pattern f5515W = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: X  reason: collision with root package name */
    public static final Pattern f5516X = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: Y  reason: collision with root package name */
    public static final Pattern f5517Y = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: Z  reason: collision with root package name */
    public static final Pattern f5518Z = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: a0  reason: collision with root package name */
    public static final Pattern f5519a0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: b0  reason: collision with root package name */
    public static final Pattern f5520b0 = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: c0  reason: collision with root package name */
    public static final Pattern f5521c0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: d0  reason: collision with root package name */
    public static final Pattern f5522d0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: e0  reason: collision with root package name */
    public static final Pattern f5523e0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: f0  reason: collision with root package name */
    public static final Pattern f5524f0 = a("AUTOSELECT");

    /* renamed from: g0  reason: collision with root package name */
    public static final Pattern f5525g0 = a("DEFAULT");

    /* renamed from: h0  reason: collision with root package name */
    public static final Pattern f5526h0 = a("FORCED");

    /* renamed from: i0  reason: collision with root package name */
    public static final Pattern f5527i0 = a("INDEPENDENT");

    /* renamed from: j0  reason: collision with root package name */
    public static final Pattern f5528j0 = a("GAP");

    /* renamed from: k0  reason: collision with root package name */
    public static final Pattern f5529k0 = a("PRECISE");

    /* renamed from: l0  reason: collision with root package name */
    public static final Pattern f5530l0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: m0  reason: collision with root package name */
    public static final Pattern f5531m0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: n0  reason: collision with root package name */
    public static final Pattern f5532n0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public o(l lVar, i iVar) {
        this.f5544m = lVar;
        this.f5545n = iVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static C0110m b(String str, C0109l[] c0109lArr) {
        C0109l[] c0109lArr2 = new C0109l[c0109lArr.length];
        for (int i3 = 0; i3 < c0109lArr.length; i3++) {
            C0109l c0109l = c0109lArr[i3];
            c0109lArr2[i3] = new C0109l(c0109l.f1908n, c0109l.f1909o, c0109l.f1910p, null);
        }
        return new C0110m(str, true, c0109lArr2);
    }

    public static C0109l c(String str, String str2, HashMap hashMap) {
        String i3 = i(str, f5514V, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f5515W;
        if (equals) {
            String j3 = j(str, pattern, hashMap);
            return new C0109l(AbstractC0104g.f1890d, null, "video/mp4", Base64.decode(j3.substring(j3.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC0104g.f1890d;
            int i4 = A.f2405a;
            return new C0109l(uuid, null, "hls", str.getBytes(C1.d.f153c));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(i3)) {
            return null;
        } else {
            String j4 = j(str, pattern, hashMap);
            byte[] decode = Base64.decode(j4.substring(j4.indexOf(44)), 0);
            UUID uuid2 = AbstractC0104g.f1891e;
            return new C0109l(uuid2, null, "video/mp4", t.a(uuid2, null, decode));
        }
    }

    public static i d(l lVar, i iVar, B1.e eVar, String str) {
        int i3;
        String str2;
        HashMap hashMap;
        HashMap hashMap2;
        d dVar;
        ArrayList arrayList;
        String str3;
        d dVar2;
        int i4;
        String str4;
        HashMap hashMap3;
        String str5;
        int i5;
        String hexString;
        String hexString2;
        long j3;
        String hexString3;
        long j4;
        HashMap hashMap4;
        f fVar;
        C0110m c0110m;
        l lVar2 = lVar;
        i iVar2 = iVar;
        boolean z3 = lVar2.f5493c;
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        h hVar = new h(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str6 = "";
        boolean z4 = z3;
        h hVar2 = hVar;
        String str7 = "";
        long j5 = -1;
        int i6 = 0;
        boolean z5 = false;
        long j6 = -9223372036854775807L;
        long j7 = 0;
        boolean z6 = false;
        int i7 = 0;
        long j8 = 0;
        int i8 = 1;
        long j9 = -9223372036854775807L;
        long j10 = -9223372036854775807L;
        boolean z7 = false;
        C0110m c0110m2 = null;
        long j11 = 0;
        C0110m c0110m3 = null;
        long j12 = 0;
        long j13 = 0;
        boolean z8 = false;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        int i9 = 0;
        long j14 = 0;
        boolean z9 = false;
        f fVar2 = null;
        long j15 = 0;
        long j16 = 0;
        ArrayList arrayList6 = arrayList3;
        d dVar3 = null;
        while (eVar.h0()) {
            String m02 = eVar.m0();
            if (m02.startsWith("#EXT")) {
                arrayList5.add(m02);
            }
            if (m02.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String j17 = j(m02, f5496C, hashMap5);
                if ("VOD".equals(j17)) {
                    i6 = 1;
                } else if ("EVENT".equals(j17)) {
                    i6 = 2;
                }
            } else if (m02.equals("#EXT-X-I-FRAMES-ONLY")) {
                z9 = true;
            } else {
                if (m02.startsWith("#EXT-X-START")) {
                    Map emptyMap = Collections.emptyMap();
                    str2 = str6;
                    z5 = f(m02, f5529k0);
                    j6 = (long) (Double.parseDouble(j(m02, f5507O, emptyMap)) * 1000000.0d);
                } else {
                    str2 = str6;
                    if (m02.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double g3 = g(m02, f5497D);
                        long j18 = g3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g3 * 1000000.0d);
                        boolean f3 = f(m02, f5498E);
                        double g4 = g(m02, f5500G);
                        long j19 = g4 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g4 * 1000000.0d);
                        double g5 = g(m02, f5501H);
                        hVar2 = new h(j18, f3, j19, g5 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g5 * 1000000.0d), f(m02, f5502I));
                    } else if (m02.startsWith("#EXT-X-PART-INF")) {
                        j10 = (long) (Double.parseDouble(j(m02, f5494A, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean startsWith = m02.startsWith("#EXT-X-MAP");
                        Pattern pattern = f5509Q;
                        boolean z10 = z5;
                        Pattern pattern2 = f5515W;
                        if (startsWith) {
                            String j20 = j(m02, pattern2, hashMap5);
                            String i10 = i(m02, pattern, null, hashMap5);
                            if (i10 != null) {
                                int i11 = A.f2405a;
                                String[] split = i10.split("@", -1);
                                j5 = Long.parseLong(split[0]);
                                if (split.length > 1) {
                                    j11 = Long.parseLong(split[1]);
                                }
                            }
                            int i12 = (j5 > (-1L) ? 1 : (j5 == (-1L) ? 0 : -1));
                            if (i12 == 0) {
                                j11 = 0;
                            }
                            if (str8 != null && str9 == null) {
                                throw H.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            fVar2 = new f(j20, j11, j5, str8, str9);
                            if (i12 != 0) {
                                j11 += j5;
                            }
                            j5 = -1;
                            str6 = str2;
                            z5 = z10;
                        } else {
                            ArrayList arrayList7 = arrayList6;
                            ArrayList arrayList8 = arrayList5;
                            if (m02.startsWith("#EXT-X-TARGETDURATION")) {
                                j9 = Integer.parseInt(j(m02, f5542y, Collections.emptyMap())) * 1000000;
                            } else if (m02.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j12 = Long.parseLong(j(m02, f5503J, Collections.emptyMap()));
                                j8 = j12;
                            } else if (m02.startsWith("#EXT-X-VERSION")) {
                                i8 = Integer.parseInt(j(m02, f5495B, Collections.emptyMap()));
                            } else {
                                if (m02.startsWith("#EXT-X-DEFINE")) {
                                    String i13 = i(m02, f5531m0, null, hashMap5);
                                    if (i13 != null) {
                                        String str11 = (String) lVar2.f5489j.get(i13);
                                        if (str11 != null) {
                                            hashMap5.put(i13, str11);
                                        }
                                    } else {
                                        hashMap5.put(j(m02, f5520b0, hashMap5), j(m02, f5530l0, hashMap5));
                                    }
                                    hashMap = hashMap5;
                                    hashMap2 = hashMap6;
                                    dVar = dVar3;
                                    arrayList = arrayList7;
                                    str3 = str10;
                                } else if (m02.startsWith("#EXTINF")) {
                                    j15 = new BigDecimal(j(m02, f5504K, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                    str7 = i(m02, L, str2, hashMap5);
                                    str6 = str2;
                                    arrayList6 = arrayList7;
                                    z5 = z10;
                                    arrayList5 = arrayList8;
                                } else {
                                    String str12 = str2;
                                    if (m02.startsWith("#EXT-X-SKIP")) {
                                        int parseInt = Integer.parseInt(j(m02, f5499F, Collections.emptyMap()));
                                        AbstractC0123a.j(iVar2 != null && arrayList2.isEmpty());
                                        int i14 = A.f2405a;
                                        int i15 = (int) (j8 - iVar2.f5461k);
                                        int i16 = parseInt + i15;
                                        if (i15 >= 0) {
                                            I i17 = iVar2.f5468r;
                                            if (i16 <= i17.size()) {
                                                while (i15 < i16) {
                                                    f fVar3 = (f) i17.get(i15);
                                                    if (j8 != iVar2.f5461k) {
                                                        int i18 = (iVar2.f5460j - i7) + fVar3.f5441p;
                                                        ArrayList arrayList9 = new ArrayList();
                                                        long j21 = j14;
                                                        int i19 = 0;
                                                        while (true) {
                                                            I i20 = fVar3.f5437y;
                                                            i4 = i16;
                                                            if (i19 >= i20.size()) {
                                                                break;
                                                            }
                                                            d dVar4 = (d) i20.get(i19);
                                                            arrayList9.add(new d(dVar4.f5438m, dVar4.f5439n, dVar4.f5440o, i18, j21, dVar4.f5443r, dVar4.f5444s, dVar4.f5445t, dVar4.f5446u, dVar4.f5447v, dVar4.f5448w, dVar4.x, dVar4.f5433y));
                                                            j21 += dVar4.f5440o;
                                                            i19++;
                                                            hashMap6 = hashMap6;
                                                            i16 = i4;
                                                            str12 = str12;
                                                            dVar3 = dVar3;
                                                        }
                                                        dVar2 = dVar3;
                                                        str4 = str12;
                                                        hashMap3 = hashMap6;
                                                        fVar3 = new f(fVar3.f5438m, fVar3.f5439n, fVar3.x, fVar3.f5440o, i18, j14, fVar3.f5443r, fVar3.f5444s, fVar3.f5445t, fVar3.f5446u, fVar3.f5447v, fVar3.f5448w, arrayList9);
                                                    } else {
                                                        dVar2 = dVar3;
                                                        i4 = i16;
                                                        str4 = str12;
                                                        hashMap3 = hashMap6;
                                                    }
                                                    arrayList2.add(fVar3);
                                                    j14 += fVar3.f5440o;
                                                    long j22 = fVar3.f5447v;
                                                    if (j22 != -1) {
                                                        j11 = fVar3.f5446u + j22;
                                                    }
                                                    String str13 = fVar3.f5445t;
                                                    if (str13 == null || !str13.equals(Long.toHexString(j12))) {
                                                        str9 = str13;
                                                    }
                                                    j12++;
                                                    i15++;
                                                    i9 = fVar3.f5441p;
                                                    fVar2 = fVar3.f5439n;
                                                    c0110m3 = fVar3.f5443r;
                                                    str8 = fVar3.f5444s;
                                                    hashMap6 = hashMap3;
                                                    i16 = i4;
                                                    j13 = j14;
                                                    str12 = str4;
                                                    dVar3 = dVar2;
                                                    iVar2 = iVar;
                                                }
                                                str2 = str12;
                                                lVar2 = lVar;
                                                iVar2 = iVar;
                                            }
                                        }
                                        throw new IOException();
                                    }
                                    dVar = dVar3;
                                    str2 = str12;
                                    hashMap2 = hashMap6;
                                    if (m02.startsWith("#EXT-X-KEY")) {
                                        String j23 = j(m02, f5512T, hashMap5);
                                        String i21 = i(m02, f5513U, "identity", hashMap5);
                                        if ("NONE".equals(j23)) {
                                            treeMap.clear();
                                            c0110m3 = null;
                                            str8 = null;
                                            str9 = null;
                                        } else {
                                            String i22 = i(m02, f5516X, null, hashMap5);
                                            if ("identity".equals(i21)) {
                                                if ("AES-128".equals(j23)) {
                                                    str8 = j(m02, pattern2, hashMap5);
                                                    str9 = i22;
                                                }
                                            } else {
                                                String str14 = str10;
                                                if (str14 == null) {
                                                    if (!"SAMPLE-AES-CENC".equals(j23) && !"SAMPLE-AES-CTR".equals(j23)) {
                                                        str5 = "cbcs";
                                                    } else {
                                                        str5 = "cenc";
                                                    }
                                                    str10 = str5;
                                                } else {
                                                    str10 = str14;
                                                }
                                                C0109l c3 = c(m02, i21, hashMap5);
                                                if (c3 != null) {
                                                    treeMap.put(i21, c3);
                                                    str9 = i22;
                                                    c0110m3 = null;
                                                    str8 = null;
                                                }
                                            }
                                            str9 = i22;
                                            str8 = null;
                                        }
                                        lVar2 = lVar;
                                        iVar2 = iVar;
                                        hashMap6 = hashMap2;
                                    } else {
                                        str3 = str10;
                                        if (m02.startsWith("#EXT-X-BYTERANGE")) {
                                            String j24 = j(m02, f5508P, hashMap5);
                                            int i23 = A.f2405a;
                                            String[] split2 = j24.split("@", -1);
                                            j5 = Long.parseLong(split2[0]);
                                            if (split2.length > 1) {
                                                j11 = Long.parseLong(split2[1]);
                                            }
                                        } else if (m02.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i7 = Integer.parseInt(m02.substring(m02.indexOf(58) + 1));
                                            lVar2 = lVar;
                                            iVar2 = iVar;
                                            hashMap6 = hashMap2;
                                            str10 = str3;
                                            arrayList6 = arrayList7;
                                            str6 = str2;
                                            z5 = z10;
                                            arrayList5 = arrayList8;
                                            dVar3 = dVar;
                                            z6 = true;
                                        } else if (m02.equals("#EXT-X-DISCONTINUITY")) {
                                            i9++;
                                        } else {
                                            if (m02.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j7 == 0) {
                                                    j7 = A.M(A.P(m02.substring(m02.indexOf(58) + 1))) - j14;
                                                } else {
                                                    hashMap = hashMap5;
                                                    arrayList = arrayList7;
                                                }
                                            } else if (m02.equals("#EXT-X-GAP")) {
                                                lVar2 = lVar;
                                                iVar2 = iVar;
                                                hashMap6 = hashMap2;
                                                str10 = str3;
                                                arrayList6 = arrayList7;
                                                str6 = str2;
                                                z5 = z10;
                                                arrayList5 = arrayList8;
                                                dVar3 = dVar;
                                                z8 = true;
                                            } else if (m02.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                lVar2 = lVar;
                                                iVar2 = iVar;
                                                hashMap6 = hashMap2;
                                                str10 = str3;
                                                arrayList6 = arrayList7;
                                                str6 = str2;
                                                z5 = z10;
                                                arrayList5 = arrayList8;
                                                dVar3 = dVar;
                                                z4 = true;
                                            } else if (m02.equals("#EXT-X-ENDLIST")) {
                                                lVar2 = lVar;
                                                iVar2 = iVar;
                                                hashMap6 = hashMap2;
                                                str10 = str3;
                                                arrayList6 = arrayList7;
                                                str6 = str2;
                                                z5 = z10;
                                                arrayList5 = arrayList8;
                                                dVar3 = dVar;
                                                z7 = true;
                                            } else {
                                                if (m02.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                    long h3 = h(m02, f5505M);
                                                    Matcher matcher = f5506N.matcher(m02);
                                                    if (matcher.find()) {
                                                        String group = matcher.group(1);
                                                        group.getClass();
                                                        i5 = Integer.parseInt(group);
                                                    } else {
                                                        i5 = -1;
                                                    }
                                                    arrayList4.add(new e(i5, h3, Uri.parse(AbstractC0123a.x(str, j(m02, pattern2, hashMap5)))));
                                                } else if (m02.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                    if (dVar == null && "PART".equals(j(m02, f5518Z, hashMap5))) {
                                                        String j25 = j(m02, pattern2, hashMap5);
                                                        long h4 = h(m02, f5510R);
                                                        long h5 = h(m02, f5511S);
                                                        if (str8 == null) {
                                                            hexString = null;
                                                        } else {
                                                            hexString = str9 != null ? str9 : Long.toHexString(j12);
                                                        }
                                                        if (c0110m3 == null && !treeMap.isEmpty()) {
                                                            C0109l[] c0109lArr = (C0109l[]) treeMap.values().toArray(new C0109l[0]);
                                                            C0110m c0110m4 = new C0110m(str3, true, c0109lArr);
                                                            if (c0110m2 == null) {
                                                                c0110m2 = b(str3, c0109lArr);
                                                            }
                                                            c0110m3 = c0110m4;
                                                        }
                                                        int i24 = (h4 > (-1L) ? 1 : (h4 == (-1L) ? 0 : -1));
                                                        if (i24 == 0 || h5 != -1) {
                                                            dVar = new d(j25, fVar2, 0L, i9, j13, c0110m3, str8, hexString, i24 != 0 ? h4 : 0L, h5, false, false, true);
                                                        }
                                                    }
                                                } else if (m02.startsWith("#EXT-X-PART")) {
                                                    if (str8 == null) {
                                                        hexString2 = null;
                                                    } else {
                                                        hexString2 = str9 != null ? str9 : Long.toHexString(j12);
                                                    }
                                                    String j26 = j(m02, pattern2, hashMap5);
                                                    long parseDouble = (long) (Double.parseDouble(j(m02, f5543z, Collections.emptyMap())) * 1000000.0d);
                                                    boolean f4 = f(m02, f5527i0) | (z4 && arrayList7.isEmpty());
                                                    boolean f5 = f(m02, f5528j0);
                                                    String i25 = i(m02, pattern, null, hashMap5);
                                                    if (i25 != null) {
                                                        int i26 = A.f2405a;
                                                        String[] split3 = i25.split("@", -1);
                                                        j3 = Long.parseLong(split3[0]);
                                                        if (split3.length > 1) {
                                                            j16 = Long.parseLong(split3[1]);
                                                        }
                                                    } else {
                                                        j3 = -1;
                                                    }
                                                    int i27 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                                                    if (i27 == 0) {
                                                        j16 = 0;
                                                    }
                                                    if (c0110m3 == null && !treeMap.isEmpty()) {
                                                        C0109l[] c0109lArr2 = (C0109l[]) treeMap.values().toArray(new C0109l[0]);
                                                        C0110m c0110m5 = new C0110m(str3, true, c0109lArr2);
                                                        if (c0110m2 == null) {
                                                            c0110m2 = b(str3, c0109lArr2);
                                                        }
                                                        c0110m3 = c0110m5;
                                                    }
                                                    arrayList7.add(new d(j26, fVar2, parseDouble, i9, j13, c0110m3, str8, hexString2, j16, j3, f5, f4, false));
                                                    j13 += parseDouble;
                                                    if (i27 != 0) {
                                                        j16 += j3;
                                                    }
                                                    lVar2 = lVar;
                                                    iVar2 = iVar;
                                                    hashMap6 = hashMap2;
                                                    str10 = str3;
                                                    arrayList6 = arrayList7;
                                                } else {
                                                    arrayList = arrayList7;
                                                    if (m02.startsWith("#")) {
                                                        hashMap = hashMap5;
                                                    } else {
                                                        if (str8 == null) {
                                                            hexString3 = null;
                                                        } else {
                                                            hexString3 = str9 != null ? str9 : Long.toHexString(j12);
                                                        }
                                                        long j27 = j12 + 1;
                                                        String l3 = l(m02, hashMap5);
                                                        f fVar4 = (f) hashMap2.get(l3);
                                                        int i28 = (j5 > (-1L) ? 1 : (j5 == (-1L) ? 0 : -1));
                                                        if (i28 == 0) {
                                                            j4 = 0;
                                                        } else {
                                                            if (z9 && fVar2 == null && fVar4 == null) {
                                                                fVar4 = new f(l3, 0L, j11, null, null);
                                                                hashMap2.put(l3, fVar4);
                                                            }
                                                            j4 = j11;
                                                        }
                                                        if (c0110m3 != null || treeMap.isEmpty()) {
                                                            hashMap4 = hashMap5;
                                                            fVar = fVar4;
                                                            c0110m = c0110m3;
                                                        } else {
                                                            hashMap4 = hashMap5;
                                                            fVar = fVar4;
                                                            C0109l[] c0109lArr3 = (C0109l[]) treeMap.values().toArray(new C0109l[0]);
                                                            c0110m = new C0110m(str3, true, c0109lArr3);
                                                            if (c0110m2 == null) {
                                                                c0110m2 = b(str3, c0109lArr3);
                                                            }
                                                        }
                                                        arrayList2.add(new f(l3, fVar2 != null ? fVar2 : fVar, str7, j15, i9, j14, c0110m, str8, hexString3, j4, j5, z8, arrayList));
                                                        j13 = j14 + j15;
                                                        ArrayList arrayList10 = new ArrayList();
                                                        if (i28 != 0) {
                                                            j4 += j5;
                                                        }
                                                        j11 = j4;
                                                        iVar2 = iVar;
                                                        arrayList6 = arrayList10;
                                                        hashMap6 = hashMap2;
                                                        str10 = str3;
                                                        c0110m3 = c0110m;
                                                        j5 = -1;
                                                        j14 = j13;
                                                        j12 = j27;
                                                        hashMap5 = hashMap4;
                                                        str6 = str2;
                                                        str7 = str6;
                                                        z5 = z10;
                                                        arrayList5 = arrayList8;
                                                        dVar3 = dVar;
                                                        z8 = false;
                                                        j15 = 0;
                                                        lVar2 = lVar;
                                                    }
                                                }
                                                hashMap = hashMap5;
                                                arrayList = arrayList7;
                                            }
                                            str6 = str2;
                                            z5 = z10;
                                            arrayList5 = arrayList8;
                                            dVar3 = dVar;
                                        }
                                        lVar2 = lVar;
                                        iVar2 = iVar;
                                        hashMap6 = hashMap2;
                                        str10 = str3;
                                    }
                                    arrayList6 = arrayList7;
                                    str6 = str2;
                                    z5 = z10;
                                    arrayList5 = arrayList8;
                                    dVar3 = dVar;
                                }
                                lVar2 = lVar;
                                iVar2 = iVar;
                                hashMap6 = hashMap2;
                                str10 = str3;
                                arrayList6 = arrayList;
                                hashMap5 = hashMap;
                                str6 = str2;
                                z5 = z10;
                                arrayList5 = arrayList8;
                                dVar3 = dVar;
                            }
                            arrayList6 = arrayList7;
                            str6 = str2;
                            z5 = z10;
                            arrayList5 = arrayList8;
                        }
                    }
                }
                str6 = str2;
            }
        }
        d dVar5 = dVar3;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList5;
        boolean z11 = z5;
        HashMap hashMap7 = new HashMap();
        int i29 = 0;
        while (i29 < arrayList4.size()) {
            e eVar2 = (e) arrayList4.get(i29);
            long j28 = eVar2.f5435b;
            if (j28 == -1) {
                j28 = (j8 + arrayList2.size()) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int i30 = eVar2.f5436c;
            if (i30 != -1 || j10 == -9223372036854775807L) {
                i3 = 1;
            } else {
                i3 = 1;
                i30 = (arrayList11.isEmpty() ? ((f) r.l(arrayList2)).f5437y : arrayList11).size() - 1;
            }
            Uri uri = eVar2.f5434a;
            hashMap7.put(uri, new e(i30, j28, uri));
            i29 += i3;
        }
        if (dVar5 != null) {
            arrayList11.add(dVar5);
        }
        return new i(i6, str, arrayList12, j6, z11, j7, z6, i7, j8, i8, j9, j10, z4, z7, j7 != 0, c0110m2, arrayList2, arrayList11, hVar2, hashMap7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015f, code lost:
        if (r9 > 0) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f0.l e(B1.e r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.o.e(B1.e, java.lang.String):f0.l");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return -9.223372036854776E18d;
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return l(str2, map);
        }
        return str2;
    }

    public static String j(String str, Pattern pattern, Map map) {
        String i3 = i(str, pattern, null, map);
        if (i3 != null) {
            return i3;
        }
        throw H.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map) {
        Matcher matcher = f5532n0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069 A[Catch: all -> 0x0096, LOOP:0: B:32:0x0069->B:83:0x0069, LOOP_START, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:43:0x0098, B:45:0x00a0, B:47:0x00a8, B:49:0x00b0, B:51:0x00b8, B:53:0x00c0, B:55:0x00c8, B:57:0x00d0, B:60:0x00d9, B:61:0x00dd, B:66:0x00fd, B:67:0x0103, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd A[Catch: all -> 0x0096, TRY_ENTER, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:43:0x0098, B:45:0x00a0, B:47:0x00a8, B:49:0x00b0, B:51:0x00b8, B:53:0x00c0, B:55:0x00c8, B:57:0x00d0, B:60:0x00d9, B:61:0x00dd, B:66:0x00fd, B:67:0x0103, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    @Override // s0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(android.net.Uri r7, W.j r8) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.o.k(android.net.Uri, W.j):java.lang.Object");
    }
}
