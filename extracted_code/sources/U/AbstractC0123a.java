package U;

import android.media.MediaFormat;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: U.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0123a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f2421a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f2422b = {"", "A", "B", "C"};

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2423c = new Object();

    public static void A(String str, String str2) {
        synchronized (f2423c) {
            Log.w(str, a(str2, null));
        }
    }

    public static void B(String str, String str2, Throwable th) {
        synchronized (f2423c) {
            Log.w(str, a(str2, th));
        }
    }

    public static String a(String str, Throwable th) {
        String replace;
        if (th == null) {
            replace = null;
        } else {
            synchronized (f2423c) {
                Throwable th2 = th;
                while (true) {
                    if (th2 != null) {
                        try {
                            if (th2 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th2 = th2.getCause();
                            }
                        } finally {
                        }
                    } else {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            return str + "\n  " + replace.replace("\n", "\n  ") + '\n';
        }
        return str;
    }

    public static String b(int i3, int i4, int i5) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String c(int i3, boolean z3, int i4, int i5, int[] iArr, int i6) {
        char c3;
        String str = f2422b[i3];
        Integer valueOf = Integer.valueOf(i4);
        Integer valueOf2 = Integer.valueOf(i5);
        if (z3) {
            c3 = 'H';
        } else {
            c3 = 'L';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c3), Integer.valueOf(i6)};
        int i7 = A.f2405a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i8 = 0; i8 < length; i8++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i8])));
        }
        return sb.toString();
    }

    public static void d(String str, boolean z3) {
        if (z3) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void e(boolean z3) {
        if (z3) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void f(String str, boolean z3) {
        if (z3) {
            return;
        }
        throw new Exception(str);
    }

    public static void g(int i3, int i4) {
        if (i3 >= 0 && i3 < i4) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void h(Object obj) {
        obj.getClass();
    }

    public static void i(String str, boolean z3) {
        if (z3) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static void j(boolean z3) {
        if (z3) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void k(Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void m(String str, String str2) {
        synchronized (f2423c) {
            Log.d(str, a(str2, null));
        }
    }

    public static void n(String str, String str2) {
        synchronized (f2423c) {
            Log.e(str, a(str2, null));
        }
    }

    public static void o(String str, String str2, Throwable th) {
        synchronized (f2423c) {
            Log.e(str, a(str2, th));
        }
    }

    public static String p(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i3 = 0; i3 < attributeCount; i3++) {
            if (xmlPullParser.getAttributeName(i3).equals(str)) {
                return xmlPullParser.getAttributeValue(i3);
            }
        }
        return null;
    }

    public static int[] q(String str) {
        int i3;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i4 = indexOf4 + 2;
        if (i4 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i4) == '/') {
            i3 = str.indexOf(47, indexOf4 + 3);
            if (i3 == -1 || i3 > indexOf2) {
                i3 = indexOf2;
            }
        } else {
            i3 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i3;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static void r(String str, String str2) {
        synchronized (f2423c) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean s(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean t(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean u(XmlPullParser xmlPullParser, String str) {
        if (t(xmlPullParser) && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static void v(MediaFormat mediaFormat, String str, int i3) {
        if (i3 != -1) {
            mediaFormat.setInteger(str, i3);
        }
    }

    public static String w(StringBuilder sb, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (i3 >= i4) {
            return sb.toString();
        }
        if (sb.charAt(i3) == '/') {
            i3++;
        }
        int i8 = i3;
        int i9 = i8;
        while (i8 <= i4) {
            if (i8 == i4) {
                i5 = i8;
            } else if (sb.charAt(i8) == '/') {
                i5 = i8 + 1;
            } else {
                i8++;
            }
            int i10 = i9 + 1;
            if (i8 == i10 && sb.charAt(i9) == '.') {
                sb.delete(i9, i5);
                i4 -= i5 - i9;
            } else {
                if (i8 == i9 + 2 && sb.charAt(i9) == '.' && sb.charAt(i10) == '.') {
                    i6 = sb.lastIndexOf("/", i9 - 2) + 1;
                    if (i6 > i3) {
                        i7 = i6;
                    } else {
                        i7 = i3;
                    }
                    sb.delete(i7, i5);
                    i4 -= i5 - i7;
                } else {
                    i6 = i8 + 1;
                }
                i9 = i6;
            }
            i8 = i9;
        }
        return sb.toString();
    }

    public static String x(String str, String str2) {
        int i3;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] q3 = q(str2);
        if (q3[0] != -1) {
            sb.append(str2);
            w(sb, q3[1], q3[2]);
            return sb.toString();
        }
        int[] q4 = q(str);
        if (q3[3] == 0) {
            sb.append((CharSequence) str, 0, q4[3]);
            sb.append(str2);
            return sb.toString();
        } else if (q3[2] == 0) {
            sb.append((CharSequence) str, 0, q4[2]);
            sb.append(str2);
            return sb.toString();
        } else {
            int i4 = q3[1];
            if (i4 != 0) {
                int i5 = q4[0] + 1;
                sb.append((CharSequence) str, 0, i5);
                sb.append(str2);
                return w(sb, q3[1] + i5, i5 + q3[2]);
            } else if (str2.charAt(i4) == '/') {
                sb.append((CharSequence) str, 0, q4[1]);
                sb.append(str2);
                int i6 = q4[1];
                return w(sb, i6, q3[2] + i6);
            } else {
                int i7 = q4[0] + 2;
                int i8 = q4[1];
                if (i7 < i8 && i8 == q4[2]) {
                    sb.append((CharSequence) str, 0, i8);
                    sb.append('/');
                    sb.append(str2);
                    int i9 = q4[1];
                    return w(sb, i9, q3[2] + i9 + 1);
                }
                int lastIndexOf = str.lastIndexOf(47, q4[2] - 1);
                if (lastIndexOf == -1) {
                    i3 = q4[1];
                } else {
                    i3 = lastIndexOf + 1;
                }
                sb.append((CharSequence) str, 0, i3);
                sb.append(str2);
                return w(sb, q4[1], i3 + q3[2]);
            }
        }
    }

    public static Uri y(String str, String str2) {
        return Uri.parse(x(str, str2));
    }

    public static void z(MediaFormat mediaFormat, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            mediaFormat.setByteBuffer(D2.h.k("csd-", i3), ByteBuffer.wrap((byte[]) list.get(i3)));
        }
    }
}
