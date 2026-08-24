package a;

import C0.e;
import C2.p;
import D2.d;
import D2.h;
import D2.i;
import D2.t;
import H.l;
import H2.b;
import K2.AbstractC0092v;
import K2.C0085n;
import N.k;
import P2.u;
import U.A;
import U.AbstractC0123a;
import U.s;
import X1.c;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.datastore.preferences.protobuf.C0184g;
import d0.g;
import i1.C0292C;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.Map;
import l.r;
import org.json.JSONArray;
import org.json.JSONObject;
import v2.EnumC0879a;
/* renamed from: a.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0155a implements g {

    /* renamed from: m  reason: collision with root package name */
    public static Method f3595m;

    /* renamed from: n  reason: collision with root package name */
    public static boolean f3596n;

    /* renamed from: o  reason: collision with root package name */
    public static Field f3597o;

    /* renamed from: p  reason: collision with root package name */
    public static boolean f3598p;

    /* renamed from: q  reason: collision with root package name */
    public static long f3599q;

    /* renamed from: r  reason: collision with root package name */
    public static Method f3600r;

    /* renamed from: s  reason: collision with root package name */
    public static Method f3601s;

    /* renamed from: t  reason: collision with root package name */
    public static Method f3602t;

    public static void A(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static int B(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    public static int C(int i3) {
        int i4 = i3 % 65536;
        if (i4 < 0) {
            return i4 + 65536;
        }
        return i4;
    }

    public static Long D(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static int E(s sVar, int i3, int i4, int i5) {
        boolean z3;
        if (Math.max(Math.max(i3, i4), i5) <= 31) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        int i6 = (1 << i3) - 1;
        int i7 = (1 << i4) - 1;
        q(q(i6, i7), 1 << i5);
        if (sVar.b() < i3) {
            return -1;
        }
        int i8 = sVar.i(i3);
        if (i8 == i6) {
            if (sVar.b() < i4) {
                return -1;
            }
            int i9 = sVar.i(i4);
            int i10 = i8 + i9;
            if (i9 == i7) {
                if (sVar.b() < i5) {
                    return -1;
                }
                return i10 + sVar.i(i5);
            }
            return i10;
        }
        return i8;
    }

    public static void F(c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", c.class).invoke(null, cVar);
        } catch (Exception e2) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + cVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e2);
        }
    }

    public static Z0.g G(Z0.g gVar, String[] strArr, Map map) {
        int i3 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (Z0.g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                Z0.g gVar2 = new Z0.g();
                int length = strArr.length;
                while (i3 < length) {
                    gVar2.a((Z0.g) map.get(strArr[i3]));
                    i3++;
                }
                return gVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            gVar.a((Z0.g) map.get(strArr[0]));
            return gVar;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i3 < length2) {
                gVar.a((Z0.g) map.get(strArr[i3]));
                i3++;
            }
        }
        return gVar;
    }

    public static void H(r rVar, boolean z3) {
        if (Build.VERSION.SDK_INT >= 23) {
            l.c(rVar, z3);
            return;
        }
        if (!f3598p) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f3597o = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
            }
            f3598p = true;
        }
        Field field = f3597o;
        if (field != null) {
            try {
                field.set(rVar, Boolean.valueOf(z3));
            } catch (IllegalAccessException e3) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
            }
        }
    }

    public static void I(s sVar) {
        sVar.t(3);
        sVar.t(8);
        boolean h3 = sVar.h();
        boolean h4 = sVar.h();
        if (h3) {
            sVar.t(5);
        }
        if (h4) {
            sVar.t(6);
        }
    }

    public static void J(s sVar) {
        int i3;
        int i4;
        int i5 = sVar.i(2);
        int i6 = 6;
        if (i5 == 0) {
            sVar.t(6);
            return;
        }
        int i7 = 5;
        int E3 = E(sVar, 5, 8, 16) + 1;
        if (i5 == 1) {
            sVar.t(E3 * 7);
        } else if (i5 == 2) {
            boolean h3 = sVar.h();
            if (h3) {
                i3 = 1;
            } else {
                i3 = 5;
            }
            if (h3) {
                i7 = 7;
            }
            if (h3) {
                i6 = 8;
            }
            int i8 = 0;
            while (i8 < E3) {
                if (sVar.h()) {
                    sVar.t(7);
                    i4 = 0;
                } else {
                    if (sVar.i(2) == 3 && sVar.i(i7) * i3 != 0) {
                        sVar.s();
                    }
                    i4 = sVar.i(i6) * i3;
                    if (i4 != 0 && i4 != 180) {
                        sVar.s();
                    }
                    sVar.s();
                }
                if (i4 != 0 && i4 != 180 && sVar.h()) {
                    i8++;
                }
                i8++;
            }
        }
    }

    public static final Object K(u uVar, u uVar2, p pVar) {
        Object c0085n;
        Object L;
        try {
            t.a(2, pVar);
            c0085n = pVar.i(uVar2, uVar);
        } catch (Throwable th) {
            c0085n = new C0085n(th, false);
        }
        EnumC0879a enumC0879a = EnumC0879a.f9494m;
        if (c0085n != enumC0879a && (L = uVar.L(c0085n)) != AbstractC0092v.f860d) {
            if (!(L instanceof C0085n)) {
                return AbstractC0092v.l(L);
            }
            throw ((C0085n) L).f845a;
        }
        return enumC0879a;
    }

    public static String L(String str) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i3 < length) {
                    char c3 = charArray[i3];
                    if (c3 >= 'A' && c3 <= 'Z') {
                        charArray[i3] = (char) (c3 ^ ' ');
                    }
                    i3++;
                }
                return String.valueOf(charArray);
            }
            i3++;
        }
        return str;
    }

    public static long M(long j3, long j4, long j5, int i3) {
        int i4 = A.f2405a;
        return j3 + A.U(j4 - j5, 1000000L, i3, RoundingMode.FLOOR);
    }

    public static String N(String str) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i3 < length) {
                    char c3 = charArray[i3];
                    if (c3 >= 'a' && c3 <= 'z') {
                        charArray[i3] = (char) (c3 ^ ' ');
                    }
                    i3++;
                }
                return String.valueOf(charArray);
            }
            i3++;
        }
        return str;
    }

    public static String O(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, 127);
    }

    public static Object P(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (!(obj instanceof JSONArray) && !(obj instanceof JSONObject)) {
            if (obj.equals(JSONObject.NULL)) {
                return obj;
            }
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj2 : (Collection) obj) {
                    jSONArray.put(P(obj2));
                }
                return jSONArray;
            } else if (obj.getClass().isArray()) {
                JSONArray jSONArray2 = new JSONArray();
                int length = Array.getLength(obj);
                for (int i3 = 0; i3 < length; i3++) {
                    jSONArray2.put(P(Array.get(obj, i3)));
                }
                return jSONArray2;
            } else if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    jSONObject.put((String) entry.getKey(), P(entry.getValue()));
                }
                return jSONObject;
            } else {
                if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
                    if (obj.getClass().getPackage().getName().startsWith("java.")) {
                        return obj.toString();
                    }
                    return null;
                }
                return obj;
            }
        }
        return obj;
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, Object obj, int i3, int i4) {
        Object[] spans;
        for (Object obj2 : spannableStringBuilder.getSpans(i3, i4, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i3 && spannableStringBuilder.getSpanEnd(obj2) == i4 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i3, i4, 33);
    }

    public static final boolean e(int i3, int i4, int i5, byte[] bArr, byte[] bArr2) {
        i.e(bArr, "a");
        i.e(bArr2, "b");
        for (int i6 = 0; i6 < i5; i6++) {
            if (bArr[i6 + i3] != bArr2[i6 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static String f(int i3, int i4, String str) {
        if (i3 < 0) {
            return android.support.v4.media.session.a.F("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            return android.support.v4.media.session.a.F("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(h.k("negative size: ", i4));
    }

    public static final T2.p g(T2.t tVar) {
        i.e(tVar, "<this>");
        return new T2.p(tVar);
    }

    public static String j(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i3 = 0; i3 < bArr.length; i3++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i3])));
        }
        return sb.toString();
    }

    public static void k(boolean z3, String str, long j3) {
        if (z3) {
            return;
        }
        throw new IllegalArgumentException(android.support.v4.media.session.a.F(str, Long.valueOf(j3)));
    }

    public static void l(int i3, int i4) {
        String F3;
        if (i3 >= 0 && i3 < i4) {
            return;
        }
        if (i3 >= 0) {
            if (i4 >= 0) {
                F3 = android.support.v4.media.session.a.F("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i4));
            } else {
                throw new IllegalArgumentException(h.k("negative size: ", i4));
            }
        } else {
            F3 = android.support.v4.media.session.a.F("%s (%s) must not be negative", "index", Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(F3);
    }

    public static void m(String str, long j3) {
        if (j3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j3 + ") must be >= 0");
    }

    public static final void n(long j3, long j4, long j5) {
        if ((j4 | j5) >= 0 && j4 <= j3 && j3 - j4 >= j5) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j3 + " offset=" + j4 + " byteCount=" + j5);
    }

    public static void o(int i3, int i4) {
        if (i3 >= 0 && i3 <= i4) {
            return;
        }
        throw new IndexOutOfBoundsException(f(i3, i4, "index"));
    }

    public static void p(int i3, int i4, int i5) {
        String f3;
        if (i3 >= 0 && i4 >= i3 && i4 <= i5) {
            return;
        }
        if (i3 >= 0 && i3 <= i5) {
            if (i4 >= 0 && i4 <= i5) {
                f3 = android.support.v4.media.session.a.F("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i3));
            } else {
                f3 = f(i4, i5, "end index");
            }
        } else {
            f3 = f(i3, i5, "start index");
        }
        throw new IndexOutOfBoundsException(f3);
    }

    public static int q(int i3, int i4) {
        boolean z3;
        long j3 = i3 + i4;
        int i5 = (int) j3;
        if (j3 == i5) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return i5;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i3 + ", " + i4 + ")");
    }

    public static void r(W.h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int s(C0292C c0292c, e eVar, View view, View view2, i1.t tVar, boolean z3) {
        if (tVar.p() != 0 && c0292c.a() != 0 && view != null && view2 != null) {
            if (z3) {
                return Math.min(eVar.h(), eVar.b(view2) - eVar.c(view));
            }
            ((i1.u) view.getLayoutParams()).getClass();
            throw null;
        }
        return 0;
    }

    public static int t(C0292C c0292c, e eVar, View view, View view2, i1.t tVar, boolean z3) {
        if (tVar.p() != 0 && c0292c.a() != 0 && view != null && view2 != null) {
            if (!z3) {
                return c0292c.a();
            }
            eVar.b(view2);
            eVar.c(view);
            ((i1.u) view.getLayoutParams()).getClass();
            throw null;
        }
        return 0;
    }

    public static long[] u(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                jArr[i3] = iArr[i3];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static boolean x(String str, String str2) {
        char c3;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            char charAt2 = str2.charAt(i3);
            if (charAt != charAt2 && ((c3 = (char) ((charAt | ' ') - 97)) >= 26 || c3 != ((char) ((charAt2 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static String y(C0184g c0184g) {
        StringBuilder sb = new StringBuilder(c0184g.size());
        for (int i3 = 0; i3 < c0184g.size(); i3++) {
            byte a3 = c0184g.a(i3);
            if (a3 != 34) {
                if (a3 != 39) {
                    if (a3 != 92) {
                        switch (a3) {
                            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                                sb.append("\\a");
                                continue;
                            case k.BYTES_FIELD_NUMBER /* 8 */:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (a3 >= 32 && a3 <= 126) {
                                    sb.append((char) a3);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((a3 >>> 6) & 3) + 48));
                                    sb.append((char) (((a3 >>> 3) & 7) + 48));
                                    sb.append((char) ((a3 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static final Class z(b bVar) {
        i.e(bVar, "<this>");
        Class a3 = ((d) bVar).a();
        if (!a3.isPrimitive()) {
            return a3;
        }
        String name = a3.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return a3;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return a3;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return a3;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return a3;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return a3;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return a3;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return a3;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return a3;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return a3;
            default:
                return a3;
        }
    }

    public abstract String v(byte[] bArr, int i3, int i4);

    public abstract int w(String str, byte[] bArr, int i3, int i4);
}
