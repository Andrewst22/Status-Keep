package R;

import C.C0009j;
import a.AbstractC0155a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f1772a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f1773b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] X2 = U.A.X(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : X2) {
            if (str2.equals(c(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        return sb.toString();
    }

    public static int b(String str, String str2) {
        C0009j e2;
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c3 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c3 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c3 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c3 = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c3 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c3 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c3 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c3 = '\b';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c3 = '\t';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c3 = '\n';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c3 = 11;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return 18;
            case 1:
                return 8;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return 7;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                if (str2 == null || (e2 = e(str2)) == null) {
                    return 0;
                }
                return e2.a();
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return 5;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return 17;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 30;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 6;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            case '\t':
                return 20;
            case '\n':
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        C0009j e2;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String L = AbstractC0155a.L(str.trim());
        if (!L.startsWith("avc1") && !L.startsWith("avc3")) {
            if (!L.startsWith("hev1") && !L.startsWith("hvc1")) {
                if (!L.startsWith("dvav") && !L.startsWith("dva1") && !L.startsWith("dvhe") && !L.startsWith("dvh1")) {
                    if (L.startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!L.startsWith("vp9") && !L.startsWith("vp09")) {
                        if (!L.startsWith("vp8") && !L.startsWith("vp08")) {
                            if (L.startsWith("mp4a")) {
                                if (L.startsWith("mp4a.") && (e2 = e(L)) != null) {
                                    str2 = d(e2.f107b);
                                }
                                if (str2 == null) {
                                    return "audio/mp4a-latm";
                                }
                                return str2;
                            } else if (L.startsWith("mha1")) {
                                return "audio/mha1";
                            } else {
                                if (L.startsWith("mhm1")) {
                                    return "audio/mhm1";
                                }
                                if (!L.startsWith("ac-3") && !L.startsWith("dac3")) {
                                    if (!L.startsWith("ec-3") && !L.startsWith("dec3")) {
                                        if (L.startsWith("ec+3")) {
                                            return "audio/eac3-joc";
                                        }
                                        if (!L.startsWith("ac-4") && !L.startsWith("dac4")) {
                                            if (L.startsWith("dtsc")) {
                                                return "audio/vnd.dts";
                                            }
                                            if (L.startsWith("dtse")) {
                                                return "audio/vnd.dts.hd;profile=lbr";
                                            }
                                            if (!L.startsWith("dtsh") && !L.startsWith("dtsl")) {
                                                if (L.startsWith("dtsx")) {
                                                    return "audio/vnd.dts.uhd;profile=p2";
                                                }
                                                if (L.startsWith("opus")) {
                                                    return "audio/opus";
                                                }
                                                if (L.startsWith("vorbis")) {
                                                    return "audio/vorbis";
                                                }
                                                if (L.startsWith("flac")) {
                                                    return "audio/flac";
                                                }
                                                if (L.startsWith("stpp")) {
                                                    return "application/ttml+xml";
                                                }
                                                if (L.startsWith("wvtt")) {
                                                    return "text/vtt";
                                                }
                                                if (L.contains("cea708")) {
                                                    return "application/cea-708";
                                                }
                                                if (!L.contains("eia608") && !L.contains("cea608")) {
                                                    ArrayList arrayList = f1772a;
                                                    if (arrayList.size() <= 0) {
                                                        return null;
                                                    }
                                                    arrayList.get(0).getClass();
                                                    throw new ClassCastException();
                                                }
                                                return "application/cea-608";
                                            }
                                            return "audio/vnd.dts.hd";
                                        }
                                        return "audio/ac4";
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                        }
                        return "video/x-vnd.on2.vp8";
                    }
                    return "video/x-vnd.on2.vp9";
                }
                return "video/dolby-vision";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    public static String d(int i3) {
        if (i3 != 32) {
            if (i3 != 33) {
                if (i3 != 35) {
                    if (i3 != 64) {
                        if (i3 != 163) {
                            if (i3 != 177) {
                                if (i3 != 221) {
                                    if (i3 != 165) {
                                        if (i3 != 166) {
                                            switch (i3) {
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case 101:
                                                    return "video/mpeg2";
                                                case 102:
                                                case 103:
                                                case 104:
                                                    return "audio/mp4a-latm";
                                                case 105:
                                                case 107:
                                                    return "audio/mpeg";
                                                case 106:
                                                    return "video/mpeg";
                                                case 108:
                                                    return "image/jpeg";
                                                default:
                                                    switch (i3) {
                                                        case 169:
                                                        case 172:
                                                            return "audio/vnd.dts";
                                                        case 170:
                                                        case 171:
                                                            return "audio/vnd.dts.hd";
                                                        case 173:
                                                            return "audio/opus";
                                                        case 174:
                                                            return "audio/ac4";
                                                        default:
                                                            return null;
                                                    }
                                            }
                                        }
                                        return "audio/eac3";
                                    }
                                    return "audio/ac3";
                                }
                                return "audio/vorbis";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    public static C0009j e(String str) {
        int i3;
        Matcher matcher = f1773b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(group, 16);
            if (group2 != null) {
                i3 = Integer.parseInt(group2);
            } else {
                i3 = 0;
            }
            return new C0009j(parseInt, i3, 2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String f(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (k(str)) {
            return 2;
        }
        if (j(str)) {
            return 3;
        }
        if (i(str)) {
            return 4;
        }
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
            if ("application/x-camera-motion".equals(str)) {
                return 6;
            }
            ArrayList arrayList = f1772a;
            if (arrayList.size() <= 0) {
                return -1;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        return 5;
    }

    public static boolean h(String str) {
        return "audio".equals(f(str));
    }

    public static boolean i(String str) {
        if (!"image".equals(f(str)) && !"application/x-image-uri".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean j(String str) {
        if (!"text".equals(f(str)) && !"application/x-media3-cues".equals(str) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean k(String str) {
        return "video".equals(f(str));
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        String L = AbstractC0155a.L(str);
        L.getClass();
        char c3 = 65535;
        switch (L.hashCode()) {
            case -1007807498:
                if (L.equals("audio/x-flac")) {
                    c3 = 0;
                    break;
                }
                break;
            case -979095690:
                if (L.equals("application/x-mpegurl")) {
                    c3 = 1;
                    break;
                }
                break;
            case -586683234:
                if (L.equals("audio/x-wav")) {
                    c3 = 2;
                    break;
                }
                break;
            case -432836268:
                if (L.equals("audio/mpeg-l1")) {
                    c3 = 3;
                    break;
                }
                break;
            case -432836267:
                if (L.equals("audio/mpeg-l2")) {
                    c3 = 4;
                    break;
                }
                break;
            case 187090231:
                if (L.equals("audio/mp3")) {
                    c3 = 5;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return "audio/flac";
            case 1:
                return "application/x-mpegURL";
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return "audio/wav";
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return "audio/mpeg-L1";
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return "audio/mpeg-L2";
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return "audio/mpeg";
            default:
                return L;
        }
    }
}
