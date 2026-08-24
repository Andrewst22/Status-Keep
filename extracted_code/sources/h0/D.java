package h0;

import D1.F;
import D1.I;
import D1.b0;
import R.C0113p;
import R.G;
import U.AbstractC0123a;
import a.AbstractC0155a;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f5802a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f5803b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static int f5804c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (U.A.f2405a < 26 && U.A.f2406b.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).f5853a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new y(new w(1)));
        }
        int i3 = U.A.f2405a;
        if (i3 < 21 && arrayList.size() > 1) {
            String str2 = ((o) arrayList.get(0)).f5853a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new y(new w(2)));
            }
        }
        if (i3 < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((o) arrayList.get(0)).f5853a)) {
            arrayList.add((o) arrayList.remove(0));
        }
    }

    public static String b(C0113p c0113p) {
        Pair d3;
        if ("audio/eac3-joc".equals(c0113p.f1974m)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(c0113p.f1974m) && (d3 = d(c0113p)) != null) {
            int intValue = ((Integer) d3.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                if (intValue == 1024) {
                    return "video/av01";
                }
                return null;
            }
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
                return "audio/lg-ac3";
            }
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038f A[Catch: NumberFormatException -> 0x03a0, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x03a0, blocks: (B:249:0x033f, B:251:0x0351, B:263:0x0370, B:274:0x038f), top: B:556:0x033f }] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:570:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(R.C0113p r25) {
        /*
            Method dump skipped, instructions count: 2496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.D.d(R.p):android.util.Pair");
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [B.b, java.lang.Object] */
    public static synchronized List e(String str, boolean z3, boolean z4) {
        e0.l lVar;
        int i3;
        synchronized (D.class) {
            try {
                z zVar = new z(str, z3, z4);
                HashMap hashMap = f5803b;
                List list = (List) hashMap.get(zVar);
                if (list != null) {
                    return list;
                }
                int i4 = U.A.f2405a;
                if (i4 >= 21) {
                    ?? obj = new Object();
                    if (!z3 && !z4) {
                        i3 = 0;
                        obj.f22m = i3;
                        lVar = obj;
                    }
                    i3 = 1;
                    obj.f22m = i3;
                    lVar = obj;
                } else {
                    lVar = new e0.l(11);
                }
                ArrayList f3 = f(zVar, lVar);
                if (z3 && f3.isEmpty() && 21 <= i4 && i4 <= 23) {
                    f3 = f(zVar, new e0.l(11));
                    if (!f3.isEmpty()) {
                        AbstractC0123a.A("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((o) f3.get(0)).f5853a);
                    }
                }
                a(str, f3);
                I j3 = I.j(f3);
                hashMap.put(zVar, j3);
                return j3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r8 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(h0.z r23, h0.B r24) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.D.f(h0.z, h0.B):java.util.ArrayList");
    }

    public static b0 g(w wVar, C0113p c0113p, boolean z3, boolean z4) {
        List e2;
        String str = c0113p.f1974m;
        wVar.getClass();
        List e3 = e(str, z3, z4);
        String b3 = b(c0113p);
        if (b3 == null) {
            e2 = b0.f231q;
        } else {
            wVar.getClass();
            e2 = e(b3, z3, z4);
        }
        F i3 = I.i();
        i3.d(e3);
        i3.d(e2);
        return i3.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z3, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z3 && str.endsWith(".secure"))) {
            return false;
        }
        int i3 = U.A.f2405a;
        if (i3 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i3 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(U.A.f2407c))) {
            String str3 = U.A.f2406b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i3 == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(U.A.f2407c)) {
            String str4 = U.A.f2406b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i3 == 19 && U.A.f2406b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i3 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (U.A.f2405a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        } else if (G.h(str)) {
            return true;
        } else {
            String L = AbstractC0155a.L(mediaCodecInfo.getName());
            if (L.startsWith("arc.")) {
                return false;
            }
            if (L.startsWith("omx.google.") || L.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((L.startsWith("omx.sec.") && L.contains(".sw.")) || L.equals("omx.qcom.video.decoder.hevcswvdec") || L.startsWith("c2.android.") || L.startsWith("c2.google.")) {
                return true;
            }
            if (!L.startsWith("omx.") && !L.startsWith("c2.")) {
                return true;
            }
            return false;
        }
    }

    public static int j() {
        o oVar;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i3;
        int i4;
        if (f5804c == -1) {
            int i5 = 0;
            List e2 = e("video/avc", false, false);
            if (e2.isEmpty()) {
                oVar = null;
            } else {
                oVar = (o) e2.get(0);
            }
            if (oVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.f5856d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i6 = 0;
                while (i5 < length) {
                    int i7 = codecProfileLevelArr[i5].level;
                    if (i7 != 1 && i7 != 2) {
                        switch (i7) {
                            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            case 16:
                            case 32:
                                i4 = 101376;
                                continue;
                            case 64:
                                i4 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i4 = 414720;
                                continue;
                            case 512:
                                i4 = 921600;
                                continue;
                            case 1024:
                                i4 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i4 = 2097152;
                                continue;
                            case 8192:
                                i4 = 2228224;
                                continue;
                            case 16384:
                                i4 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i4 = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i4 = 35651584;
                                continue;
                            default:
                                i4 = -1;
                                continue;
                        }
                    } else {
                        i4 = 25344;
                    }
                    i6 = Math.max(i4, i6);
                    i5++;
                }
                if (U.A.f2405a >= 21) {
                    i3 = 345600;
                } else {
                    i3 = 172800;
                }
                i5 = Math.max(i6, i3);
            }
            f5804c = i5;
        }
        return f5804c;
    }
}
