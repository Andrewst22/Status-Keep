package U;

import D1.I;
import R.G;
import R.H;
import a.AbstractC0155a;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    public static final int f2405a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f2406b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f2407c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f2408d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f2409e;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f2410f;

    /* renamed from: g  reason: collision with root package name */
    public static final long[] f2411g;

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f2412h;

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f2413i;

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f2414j;

    /* renamed from: k  reason: collision with root package name */
    public static HashMap f2415k;

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f2416l;

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f2417m;

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f2418n;

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f2419o;

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f2420p;

    static {
        int i3 = Build.VERSION.SDK_INT;
        f2405a = i3;
        String str = Build.DEVICE;
        f2406b = str;
        String str2 = Build.MANUFACTURER;
        f2407c = str2;
        String str3 = Build.MODEL;
        f2408d = str3;
        f2409e = str + ", " + str3 + ", " + str2 + ", " + i3;
        f2410f = new byte[0];
        f2411g = new long[0];
        f2412h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f2413i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f2414j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f2416l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f2417m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f2418n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f2419o = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f2420p = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int A(int i3) {
        if (i3 != 8) {
            if (i3 != 16) {
                if (i3 != 24) {
                    if (i3 != 32) {
                        return 0;
                    }
                    return 22;
                }
                return 21;
            }
            return 2;
        }
        return 3;
    }

    public static int B(int i3, int i4) {
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 21) {
                        if (i3 != 22) {
                            if (i3 != 268435456) {
                                if (i3 != 1342177280) {
                                    if (i3 != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                    return i4 * 3;
                }
                return i4 * 4;
            }
            return i4;
        }
        return i4 * 2;
    }

    public static long C(long j3, float f3) {
        if (f3 == 1.0f) {
            return j3;
        }
        return Math.round(j3 / f3);
    }

    public static String[] D() {
        String locale;
        String[] strArr;
        LocaleList locales;
        String languageTags;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i3 = f2405a;
        if (i3 >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(",", -1);
        } else {
            Locale locale2 = configuration.locale;
            if (i3 >= 21) {
                locale = locale2.toLanguageTag();
            } else {
                locale = locale2.toString();
            }
            strArr = new String[]{locale};
        }
        for (int i4 = 0; i4 < strArr.length; i4++) {
            strArr[i4] = N(strArr[i4]);
        }
        return strArr;
    }

    public static String E(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            AbstractC0123a.o("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String F(int i3) {
        switch (i3) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return "video";
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return "text";
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return "image";
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return "metadata";
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return "camera motion";
            default:
                if (i3 >= 10000) {
                    return "custom (" + i3 + ")";
                }
                return "?";
        }
    }

    public static int G(Uri uri, String str) {
        int i3;
        char c3 = 65535;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme != null && AbstractC0155a.x("rtsp", scheme)) {
                return 3;
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int lastIndexOf = lastPathSegment.lastIndexOf(46);
                if (lastIndexOf >= 0) {
                    String L = AbstractC0155a.L(lastPathSegment.substring(lastIndexOf + 1));
                    L.getClass();
                    switch (L.hashCode()) {
                        case 104579:
                            if (L.equals("ism")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case 108321:
                            if (L.equals("mpd")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 3242057:
                            if (L.equals("isml")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 3299913:
                            if (L.equals("m3u8")) {
                                c3 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            i3 = 1;
                            break;
                        case 1:
                            i3 = 0;
                            break;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            i3 = 2;
                            break;
                        default:
                            i3 = 4;
                            break;
                    }
                    if (i3 != 4) {
                        return i3;
                    }
                }
                String path = uri.getPath();
                path.getClass();
                Matcher matcher = f2414j.matcher(path);
                if (matcher.matches()) {
                    String group = matcher.group(2);
                    if (group == null) {
                        return 1;
                    }
                    if (group.contains("format=mpd-time-csf")) {
                        return 0;
                    }
                    if (!group.contains("format=m3u8-aapl")) {
                        return 1;
                    }
                    return 2;
                }
            }
            return 4;
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c3 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c3 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c3 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c3 = 3;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return 2;
            case 1:
                return 1;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return 0;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            default:
                return 4;
        }
    }

    public static void H(int i3) {
        Integer.toString(i3, 36);
    }

    public static boolean I(int i3) {
        if (i3 != 3 && i3 != 2 && i3 != 268435456 && i3 != 21 && i3 != 1342177280 && i3 != 22 && i3 != 1610612736 && i3 != 4) {
            return false;
        }
        return true;
    }

    public static boolean J(Context context) {
        int i3 = f2405a;
        if (i3 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i3 == 30) {
                String str = f2408d;
                if (AbstractC0155a.x(str, "moto g(20)") || AbstractC0155a.x(str, "rmx3231")) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean K(int i3) {
        if (i3 != 10 && i3 != 13) {
            return false;
        }
        return true;
    }

    public static boolean L(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static long M(long j3) {
        if (j3 != -9223372036854775807L && j3 != Long.MIN_VALUE) {
            return j3 * 1000;
        }
        return j3;
    }

    public static String N(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String L = AbstractC0155a.L(str);
        int i3 = 0;
        String str2 = L.split("-", 2)[0];
        if (f2415k == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f2416l;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i4 = 0; i4 < strArr.length; i4 += 2) {
                hashMap.put(strArr[i4], strArr[i4 + 1]);
            }
            f2415k = hashMap;
        }
        String str4 = (String) f2415k.get(str2);
        if (str4 != null) {
            L = str4 + L.substring(str2.length());
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return L;
        }
        while (true) {
            String[] strArr2 = f2417m;
            if (i3 < strArr2.length) {
                if (L.startsWith(strArr2[i3])) {
                    return strArr2[i3 + 1] + L.substring(strArr2[i3].length());
                }
                i3 += 2;
            } else {
                return L;
            }
        }
    }

    public static Object[] O(int i3, Object[] objArr) {
        boolean z3;
        if (i3 <= objArr.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        return Arrays.copyOf(objArr, i3);
    }

    public static long P(String str) {
        Matcher matcher = f2412h.matcher(str);
        if (matcher.matches()) {
            int i3 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i3 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                if ("-".equals(matcher.group(11))) {
                    i3 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i3 != 0) {
                return timeInMillis - (i3 * 60000);
            }
            return timeInMillis;
        }
        throw H.a(null, "Invalid date/time format: " + str);
    }

    public static void Q(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void R(ArrayList arrayList, int i3, int i4) {
        if (i3 >= 0 && i4 <= arrayList.size() && i3 <= i4) {
            if (i3 != i4) {
                arrayList.subList(i3, i4).clear();
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static long S(long j3, int i3) {
        return U(j3, 1000000L, i3, RoundingMode.FLOOR);
    }

    public static void T(long[] jArr, long j3) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i3 = 0;
        int i4 = (j3 > 1000000L ? 1 : (j3 == 1000000L ? 0 : -1));
        if (i4 >= 0 && j3 % 1000000 == 0) {
            long q3 = android.support.v4.media.session.a.q(j3, 1000000L, RoundingMode.UNNECESSARY);
            while (i3 < jArr.length) {
                jArr[i3] = android.support.v4.media.session.a.q(jArr[i3], q3, roundingMode);
                i3++;
            }
        } else if (i4 < 0 && 1000000 % j3 == 0) {
            long q4 = android.support.v4.media.session.a.q(1000000L, j3, RoundingMode.UNNECESSARY);
            while (i3 < jArr.length) {
                jArr[i3] = android.support.v4.media.session.a.N(jArr[i3], q4);
                i3++;
            }
        } else {
            for (int i5 = 0; i5 < jArr.length; i5++) {
                long j4 = jArr[i5];
                if (j4 != 0) {
                    int i6 = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
                    if (i6 >= 0 && j3 % j4 == 0) {
                        jArr[i5] = android.support.v4.media.session.a.q(1000000L, android.support.v4.media.session.a.q(j3, j4, RoundingMode.UNNECESSARY), roundingMode);
                    } else if (i6 < 0 && j4 % j3 == 0) {
                        jArr[i5] = android.support.v4.media.session.a.N(1000000L, android.support.v4.media.session.a.q(j4, j3, RoundingMode.UNNECESSARY));
                    } else {
                        jArr[i5] = V(j4, 1000000L, j3, roundingMode);
                    }
                }
            }
        }
    }

    public static long U(long j3, long j4, long j5, RoundingMode roundingMode) {
        if (j3 == 0 || j4 == 0) {
            return 0L;
        }
        int i3 = (j5 > j4 ? 1 : (j5 == j4 ? 0 : -1));
        if (i3 >= 0 && j5 % j4 == 0) {
            return android.support.v4.media.session.a.q(j3, android.support.v4.media.session.a.q(j5, j4, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i3 < 0 && j4 % j5 == 0) {
            return android.support.v4.media.session.a.N(j3, android.support.v4.media.session.a.q(j4, j5, RoundingMode.UNNECESSARY));
        }
        int i4 = (j5 > j3 ? 1 : (j5 == j3 ? 0 : -1));
        if (i4 >= 0 && j5 % j3 == 0) {
            return android.support.v4.media.session.a.q(j4, android.support.v4.media.session.a.q(j5, j3, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i4 < 0 && j3 % j5 == 0) {
            return android.support.v4.media.session.a.N(j4, android.support.v4.media.session.a.q(j3, j5, RoundingMode.UNNECESSARY));
        }
        return V(j3, j4, j5, roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long V(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U.A.V(long, long, long, java.math.RoundingMode):long");
    }

    public static String[] W(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] X(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.trim().split("(\\s*,\\s*)", -1);
    }

    public static String Y(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i3 = 0; i3 < bArr.length; i3++) {
            sb.append(Character.forDigit((bArr[i3] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i3] & 15, 16));
        }
        return sb.toString();
    }

    public static long Z(long j3) {
        if (j3 != -9223372036854775807L && j3 != Long.MIN_VALUE) {
            return j3 / 1000;
        }
        return j3;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int b(long[] jArr, long j3, boolean z3) {
        int i3;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i3 = binarySearch + 1;
            if (i3 >= jArr.length || jArr[i3] != j3) {
                break;
            }
            binarySearch = i3;
        }
        if (z3) {
            return binarySearch;
        }
        return i3;
    }

    public static int c(B.b bVar, long j3) {
        int i3 = bVar.f22m - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            if (bVar.h(i5) < j3) {
                i4 = i5 + 1;
            } else {
                i3 = i5 - 1;
            }
        }
        int i6 = i3 + 1;
        if (i6 < bVar.f22m && bVar.h(i6) == j3) {
            return i6;
        }
        if (i3 == -1) {
            return 0;
        }
        return i3;
    }

    public static int d(I i3, Long l3, boolean z3) {
        int i4;
        int binarySearch = Collections.binarySearch(i3, l3);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                int i5 = binarySearch - 1;
                if (i5 < 0 || ((Comparable) i3.get(i5)).compareTo(l3) != 0) {
                    break;
                }
                binarySearch = i5;
            }
            i4 = binarySearch;
        }
        if (z3) {
            return Math.max(0, i4);
        }
        return i4;
    }

    public static int e(int[] iArr, int i3, boolean z3, boolean z4) {
        int i4;
        int i5;
        int binarySearch = Arrays.binarySearch(iArr, i3);
        if (binarySearch < 0) {
            i5 = -(binarySearch + 2);
        } else {
            while (true) {
                i4 = binarySearch - 1;
                if (i4 < 0 || iArr[i4] != i3) {
                    break;
                }
                binarySearch = i4;
            }
            if (z3) {
                i5 = binarySearch;
            } else {
                i5 = i4;
            }
        }
        if (z4) {
            return Math.max(0, i5);
        }
        return i5;
    }

    public static int f(long[] jArr, long j3, boolean z3) {
        int i3;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                int i4 = binarySearch - 1;
                if (i4 < 0 || jArr[i4] != j3) {
                    break;
                }
                binarySearch = i4;
            }
            i3 = binarySearch;
        }
        if (z3) {
            return Math.max(0, i3);
        }
        return i3;
    }

    public static int g(int i3, int i4) {
        return ((i3 + i4) - 1) / i4;
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float i(float f3, float f4, float f5) {
        return Math.max(f4, Math.min(f3, f5));
    }

    public static int j(int i3, int i4, int i5) {
        return Math.max(i4, Math.min(i3, i5));
    }

    public static long k(long j3, long j4, long j5) {
        return Math.max(j4, Math.min(j3, j5));
    }

    public static boolean l(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int m(int i3, int i4, int i5, byte[] bArr) {
        while (i3 < i4) {
            i5 = f2418n[((i5 >>> 24) ^ (bArr[i3] & 255)) & 255] ^ (i5 << 8);
            i3++;
        }
        return i5;
    }

    public static Handler n(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        AbstractC0123a.k(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String o(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String p(byte[] bArr) {
        return new String(bArr, C1.d.f153c);
    }

    public static int q(int i3) {
        if (i3 == 20) {
            return 30;
        }
        if (i3 != 22) {
            if (i3 != 30) {
                switch (i3) {
                    case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                        return 3;
                    case N.k.LONG_FIELD_NUMBER /* 4 */:
                    case N.k.STRING_FIELD_NUMBER /* 5 */:
                    case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        return 21;
                    case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    case N.k.BYTES_FIELD_NUMBER /* 8 */:
                        return 23;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return 28;
                    default:
                        switch (i3) {
                            case 14:
                                return 25;
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                                return 28;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
            }
            return 34;
        }
        return 31;
    }

    public static AudioFormat r(int i3, int i4, int i5) {
        return new AudioFormat.Builder().setSampleRate(i3).setChannelMask(i4).setEncoding(i5).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int s(int i3) {
        switch (i3) {
            case 1:
                return 4;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return 12;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return 28;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return 204;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return 220;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 252;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 1276;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f2405a >= 32) {
                    return 737532;
                }
                break;
            case 12:
                return 743676;
        }
        return 6396;
    }

    public static byte[] t(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 2;
            bArr[i3] = (byte) (Character.digit(str.charAt(i4 + 1), 16) + (Character.digit(str.charAt(i4), 16) << 4));
        }
        return bArr;
    }

    public static int u(String str, int i3) {
        int i4 = 0;
        for (String str2 : X(str)) {
            if (i3 == G.g(G.c(str2))) {
                i4++;
            }
        }
        return i4;
    }

    public static String v(String str, int i3) {
        String[] X2 = X(str);
        if (X2.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : X2) {
            if (i3 == G.g(G.c(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        return sb.toString();
    }

    public static int w(int i3) {
        if (i3 != 2 && i3 != 4) {
            if (i3 != 10) {
                if (i3 != 7) {
                    if (i3 != 8) {
                        switch (i3) {
                            case 15:
                                return 6003;
                            case 16:
                            case 18:
                                return 6005;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                return 6004;
                            default:
                                switch (i3) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }

    public static int x(String str) {
        String[] split;
        int length;
        boolean z3;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z3 = true;
        } else {
            z3 = false;
        }
        try {
            str2.getClass();
            int parseInt = Integer.parseInt(str2);
            if (z3) {
                return -parseInt;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long y(long j3, float f3) {
        if (f3 == 1.0f) {
            return j3;
        }
        return Math.round(j3 * f3);
    }

    public static long z(long j3) {
        if (j3 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j3 + SystemClock.elapsedRealtime();
    }
}
