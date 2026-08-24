package D2;

import D1.F;
import D1.I;
import K.C0059m;
import N.k;
import R.C0112o;
import R.C0113p;
import U.A;
import U.AbstractC0123a;
import android.content.Context;
import android.content.SharedPreferences;
import g2.C0276a;
import g2.InterfaceC0278c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l2.C0609b;
import l2.C0611d;
import m2.C0632a;
import m2.C0633b;
import n2.AbstractC0664g;
import w0.G;
/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static T0.b a(T0.l lVar, byte[] bArr, int i3) {
        F i4 = I.i();
        lVar.e(bArr, 0, i3, T0.k.f2322c, new B0.a(i4, 3));
        return new T0.b(i4.g());
    }

    public static int b(String str) {
        int[] c3;
        String str2;
        for (int i3 : N.j.c(2)) {
            if (i3 != 1) {
                if (i3 == 2) {
                    str2 = "Brightness.dark";
                } else {
                    throw null;
                }
            } else {
                str2 = "Brightness.light";
            }
            if (str2.equals(str)) {
                return i3;
            }
        }
        throw new NoSuchFieldException(l("No such Brightness: ", str));
    }

    public static int c(String str) {
        int[] c3;
        for (int i3 : N.j.c(5)) {
            String str2 = null;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                str2 = "HapticFeedbackType.selectionClick";
                            } else {
                                throw null;
                            }
                        } else {
                            str2 = "HapticFeedbackType.heavyImpact";
                        }
                    } else {
                        str2 = "HapticFeedbackType.mediumImpact";
                    }
                } else {
                    str2 = "HapticFeedbackType.lightImpact";
                }
            }
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return i3;
            }
        }
        throw new NoSuchFieldException(l("No such HapticFeedbackType: ", str));
    }

    public static int d(String str) {
        int[] c3;
        String str2;
        for (int i3 : N.j.c(2)) {
            if (i3 != 1) {
                if (i3 == 2) {
                    str2 = "SystemSoundType.alert";
                } else {
                    throw null;
                }
            } else {
                str2 = "SystemSoundType.click";
            }
            if (str2.equals(str)) {
                return i3;
            }
        }
        throw new NoSuchFieldException(l("No such SoundType: ", str));
    }

    public static int e(int i3, int i4, int i5, int i6) {
        return i3 | i4 | i5 | 128 | i6;
    }

    public static int f(int i3) {
        return i3 & 384;
    }

    public static int g(int i3) {
        return i3 & 64;
    }

    public static /* synthetic */ int h(int i3) {
        switch (i3) {
            case 1:
                return 1;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return 2;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return 8;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return 16;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 32;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 64;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                return 128;
            case 9:
                return 256;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return 2048;
            case 13:
                return 4096;
            case 14:
                return 8192;
            case 15:
                return 16384;
            case 16:
                return 32768;
            case 17:
                return 65536;
            case 18:
                return 131072;
            case 19:
                return 262144;
            case 20:
                return 524288;
            case 21:
                return 1048576;
            case 22:
                return 2097152;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case 25:
                return 16777216;
            case 26:
                return 33554432;
            case 27:
                return 67108864;
            case 28:
                return 134217728;
            case 29:
                return 268435456;
            case 30:
                return 536870912;
            case 31:
                return 1073741824;
            default:
                throw null;
        }
    }

    public static boolean i(int i3, boolean z3) {
        int i4 = i3 & 7;
        if (i4 != 4 && (!z3 || i4 != 3)) {
            return false;
        }
        return true;
    }

    public static String j(int i3, int i4, String str, String str2) {
        return str + i3 + str2 + i4;
    }

    public static String k(String str, int i3) {
        return str + i3;
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static void m(int i3, int i4, int i5, int i6, int i7) {
        A.H(i3);
        A.H(i4);
        A.H(i5);
        A.H(i6);
        A.H(i7);
    }

    public static void n(int i3, String str, String str2) {
        AbstractC0123a.A(str2, str + i3);
    }

    public static void o(int i3, HashMap hashMap, String str, int i4, String str2) {
        hashMap.put(str, Integer.valueOf(i3));
        hashMap.put(str2, Integer.valueOf(i4));
    }

    public static void p(C0112o c0112o, G g3) {
        g3.c(new C0113p(c0112o));
    }

    public static /* synthetic */ void q(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void r(String str, int i3) {
        if (i3 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = i.class.getName();
            int i4 = 0;
            while (!stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            while (stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
            i.f(nullPointerException, i.class.getName());
            throw nullPointerException;
        }
    }

    public static void s(String str, String str2, String str3) {
        AbstractC0123a.A(str3, str + str2);
    }

    public static void t(g2.g gVar, final C0611d c0611d) {
        B1.b i3 = gVar.i();
        C0609b c0609b = C0609b.f8137d;
        C0059m c0059m = new C0059m(gVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", c0609b, i3);
        if (c0611d != null) {
            c0059m.o(new InterfaceC0278c() { // from class: l2.a
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case 0:
                            C0611d c0611d2 = c0611d;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c0611d2.f8140m.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.a0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0611d c0611d3 = c0611d;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = c0611d3.f8140m;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(AbstractC0664g.o(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.a0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0611d c0611d4 = c0611d;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = c0611d4.f8140m;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(AbstractC0664g.o(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = android.support.v4.media.session.a.a0(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0611d c0611d5 = c0611d;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0611d5.f8140m.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = android.support.v4.media.session.a.a0(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0611d c0611d6 = c0611d;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = c0611d6.f8140m.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = android.support.v4.media.session.a.a0(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0611d c0611d7 = c0611d;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c0611d7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : c0611d7.f8140m.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = android.support.v4.media.session.a.a0(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        default:
                            C0611d c0611d8 = c0611d;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, c0611d8.a((EnumC0610c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = android.support.v4.media.session.a.a0(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0059m.o(null);
        }
        C0059m c0059m2 = new C0059m(gVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", c0609b, gVar.i());
        if (c0611d != null) {
            c0059m2.o(new InterfaceC0278c() { // from class: l2.a
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case 0:
                            C0611d c0611d2 = c0611d;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c0611d2.f8140m.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.a0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0611d c0611d3 = c0611d;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = c0611d3.f8140m;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(AbstractC0664g.o(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.a0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0611d c0611d4 = c0611d;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = c0611d4.f8140m;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(AbstractC0664g.o(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = android.support.v4.media.session.a.a0(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0611d c0611d5 = c0611d;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0611d5.f8140m.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = android.support.v4.media.session.a.a0(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0611d c0611d6 = c0611d;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = c0611d6.f8140m.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = android.support.v4.media.session.a.a0(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0611d c0611d7 = c0611d;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c0611d7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : c0611d7.f8140m.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = android.support.v4.media.session.a.a0(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        default:
                            C0611d c0611d8 = c0611d;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, c0611d8.a((EnumC0610c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = android.support.v4.media.session.a.a0(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0059m2.o(null);
        }
        C0059m c0059m3 = new C0059m(gVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", c0609b, gVar.i());
        if (c0611d != null) {
            c0059m3.o(new InterfaceC0278c() { // from class: l2.a
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case 0:
                            C0611d c0611d2 = c0611d;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c0611d2.f8140m.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.a0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0611d c0611d3 = c0611d;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = c0611d3.f8140m;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(AbstractC0664g.o(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.a0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0611d c0611d4 = c0611d;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = c0611d4.f8140m;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(AbstractC0664g.o(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = android.support.v4.media.session.a.a0(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0611d c0611d5 = c0611d;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0611d5.f8140m.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = android.support.v4.media.session.a.a0(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0611d c0611d6 = c0611d;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = c0611d6.f8140m.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = android.support.v4.media.session.a.a0(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0611d c0611d7 = c0611d;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c0611d7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : c0611d7.f8140m.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = android.support.v4.media.session.a.a0(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        default:
                            C0611d c0611d8 = c0611d;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, c0611d8.a((EnumC0610c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = android.support.v4.media.session.a.a0(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0059m3.o(null);
        }
        C0059m c0059m4 = new C0059m(gVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", c0609b, gVar.i());
        if (c0611d != null) {
            c0059m4.o(new InterfaceC0278c() { // from class: l2.a
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case 0:
                            C0611d c0611d2 = c0611d;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c0611d2.f8140m.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.a0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0611d c0611d3 = c0611d;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = c0611d3.f8140m;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(AbstractC0664g.o(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.a0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0611d c0611d4 = c0611d;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = c0611d4.f8140m;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(AbstractC0664g.o(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = android.support.v4.media.session.a.a0(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0611d c0611d5 = c0611d;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0611d5.f8140m.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = android.support.v4.media.session.a.a0(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0611d c0611d6 = c0611d;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = c0611d6.f8140m.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = android.support.v4.media.session.a.a0(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0611d c0611d7 = c0611d;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c0611d7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : c0611d7.f8140m.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = android.support.v4.media.session.a.a0(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        default:
                            C0611d c0611d8 = c0611d;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, c0611d8.a((EnumC0610c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = android.support.v4.media.session.a.a0(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0059m4.o(null);
        }
        C0059m c0059m5 = new C0059m(gVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", c0609b, gVar.i());
        if (c0611d != null) {
            c0059m5.o(new InterfaceC0278c() { // from class: l2.a
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case 0:
                            C0611d c0611d2 = c0611d;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c0611d2.f8140m.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.a0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0611d c0611d3 = c0611d;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = c0611d3.f8140m;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(AbstractC0664g.o(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.a0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0611d c0611d4 = c0611d;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = c0611d4.f8140m;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(AbstractC0664g.o(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = android.support.v4.media.session.a.a0(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0611d c0611d5 = c0611d;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0611d5.f8140m.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = android.support.v4.media.session.a.a0(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0611d c0611d6 = c0611d;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = c0611d6.f8140m.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = android.support.v4.media.session.a.a0(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0611d c0611d7 = c0611d;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c0611d7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : c0611d7.f8140m.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = android.support.v4.media.session.a.a0(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        default:
                            C0611d c0611d8 = c0611d;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, c0611d8.a((EnumC0610c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = android.support.v4.media.session.a.a0(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0059m5.o(null);
        }
        C0059m c0059m6 = new C0059m(gVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", c0609b, gVar.i());
        if (c0611d != null) {
            c0059m6.o(new InterfaceC0278c() { // from class: l2.a
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case 0:
                            C0611d c0611d2 = c0611d;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c0611d2.f8140m.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.a0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0611d c0611d3 = c0611d;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = c0611d3.f8140m;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(AbstractC0664g.o(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.a0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0611d c0611d4 = c0611d;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = c0611d4.f8140m;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(AbstractC0664g.o(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = android.support.v4.media.session.a.a0(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0611d c0611d5 = c0611d;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0611d5.f8140m.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = android.support.v4.media.session.a.a0(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0611d c0611d6 = c0611d;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = c0611d6.f8140m.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = android.support.v4.media.session.a.a0(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0611d c0611d7 = c0611d;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c0611d7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : c0611d7.f8140m.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = android.support.v4.media.session.a.a0(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        default:
                            C0611d c0611d8 = c0611d;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, c0611d8.a((EnumC0610c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = android.support.v4.media.session.a.a0(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0059m6.o(null);
        }
        C0059m c0059m7 = new C0059m(gVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", c0609b, gVar.i());
        if (c0611d != null) {
            c0059m7.o(new InterfaceC0278c() { // from class: l2.a
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case 0:
                            C0611d c0611d2 = c0611d;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, c0611d2.f8140m.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.a0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0611d c0611d3 = c0611d;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = c0611d3.f8140m;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(AbstractC0664g.o(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.a0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0611d c0611d4 = c0611d;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = c0611d4.f8140m;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(AbstractC0664g.o(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = android.support.v4.media.session.a.a0(th3);
                            }
                            c0276a.o(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0611d c0611d5 = c0611d;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, c0611d5.f8140m.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = android.support.v4.media.session.a.a0(th4);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            C0611d c0611d6 = c0611d;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = c0611d6.f8140m.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = android.support.v4.media.session.a.a0(th5);
                            }
                            c0276a.o(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            C0611d c0611d7 = c0611d;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                c0611d7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : c0611d7.f8140m.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = android.support.v4.media.session.a.a0(th6);
                            }
                            c0276a.o(arrayList6);
                            return;
                        default:
                            C0611d c0611d8 = c0611d;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, c0611d8.a((EnumC0610c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = android.support.v4.media.session.a.a0(th7);
                            }
                            c0276a.o(arrayList8);
                            return;
                    }
                }
            });
        } else {
            c0059m7.o(null);
        }
    }

    public static void u(g2.g gVar, final C0632a c0632a) {
        B1.b i3 = gVar.i();
        C0633b c0633b = C0633b.f8241e;
        C0059m c0059m = new C0059m(gVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", c0633b, i3);
        if (c0632a != null) {
            c0059m.o(new InterfaceC0278c() { // from class: m2.c
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    switch (r2) {
                        case 0:
                            C0632a c0632a2 = c0632a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0632a2.f8239m.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.b0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0632a c0632a3 = c0632a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0632a3.f8239m.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.b0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0632a c0632a4 = c0632a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0632a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.b0(th3);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0632a c0632a5 = c0632a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0632a5.f8239m.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.b0(th4);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0632a c0632a6 = c0632a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0632a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                SharedPreferences.Editor edit = c0632a6.f8239m.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.b0(th5);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0632a c0632a7 = c0632a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0632a7.f8239m.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.b0(th6);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0632a c0632a8 = c0632a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0632a8.f8239m.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0632a8.f8240n.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.b0(th7);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0632a c0632a9 = c0632a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0632a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.b0(th8);
                            }
                            c0276a.o(arrayList14);
                            return;
                        default:
                            C0632a c0632a10 = c0632a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0632a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.b0(th9);
                            }
                            c0276a.o(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0059m.o(null);
        }
        C0059m c0059m2 = new C0059m(gVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", c0633b, i3);
        if (c0632a != null) {
            c0059m2.o(new InterfaceC0278c() { // from class: m2.c
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    switch (r2) {
                        case 0:
                            C0632a c0632a2 = c0632a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0632a2.f8239m.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.b0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0632a c0632a3 = c0632a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0632a3.f8239m.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.b0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0632a c0632a4 = c0632a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0632a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.b0(th3);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0632a c0632a5 = c0632a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0632a5.f8239m.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.b0(th4);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0632a c0632a6 = c0632a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0632a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                SharedPreferences.Editor edit = c0632a6.f8239m.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.b0(th5);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0632a c0632a7 = c0632a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0632a7.f8239m.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.b0(th6);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0632a c0632a8 = c0632a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0632a8.f8239m.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0632a8.f8240n.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.b0(th7);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0632a c0632a9 = c0632a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0632a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.b0(th8);
                            }
                            c0276a.o(arrayList14);
                            return;
                        default:
                            C0632a c0632a10 = c0632a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0632a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.b0(th9);
                            }
                            c0276a.o(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0059m2.o(null);
        }
        C0059m c0059m3 = new C0059m(gVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", c0633b, i3);
        if (c0632a != null) {
            c0059m3.o(new InterfaceC0278c() { // from class: m2.c
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    switch (r2) {
                        case 0:
                            C0632a c0632a2 = c0632a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0632a2.f8239m.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.b0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0632a c0632a3 = c0632a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0632a3.f8239m.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.b0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0632a c0632a4 = c0632a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0632a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.b0(th3);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0632a c0632a5 = c0632a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0632a5.f8239m.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.b0(th4);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0632a c0632a6 = c0632a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0632a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                SharedPreferences.Editor edit = c0632a6.f8239m.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.b0(th5);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0632a c0632a7 = c0632a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0632a7.f8239m.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.b0(th6);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0632a c0632a8 = c0632a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0632a8.f8239m.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0632a8.f8240n.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.b0(th7);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0632a c0632a9 = c0632a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0632a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.b0(th8);
                            }
                            c0276a.o(arrayList14);
                            return;
                        default:
                            C0632a c0632a10 = c0632a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0632a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.b0(th9);
                            }
                            c0276a.o(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0059m3.o(null);
        }
        C0059m c0059m4 = new C0059m(gVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", c0633b, i3);
        if (c0632a != null) {
            c0059m4.o(new InterfaceC0278c() { // from class: m2.c
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    switch (r2) {
                        case 0:
                            C0632a c0632a2 = c0632a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0632a2.f8239m.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.b0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0632a c0632a3 = c0632a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0632a3.f8239m.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.b0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0632a c0632a4 = c0632a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0632a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.b0(th3);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0632a c0632a5 = c0632a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0632a5.f8239m.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.b0(th4);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0632a c0632a6 = c0632a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0632a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                SharedPreferences.Editor edit = c0632a6.f8239m.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.b0(th5);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0632a c0632a7 = c0632a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0632a7.f8239m.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.b0(th6);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0632a c0632a8 = c0632a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0632a8.f8239m.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0632a8.f8240n.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.b0(th7);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0632a c0632a9 = c0632a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0632a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.b0(th8);
                            }
                            c0276a.o(arrayList14);
                            return;
                        default:
                            C0632a c0632a10 = c0632a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0632a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.b0(th9);
                            }
                            c0276a.o(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0059m4.o(null);
        }
        C0059m c0059m5 = new C0059m(gVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", c0633b, i3);
        if (c0632a != null) {
            c0059m5.o(new InterfaceC0278c() { // from class: m2.c
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    switch (r2) {
                        case 0:
                            C0632a c0632a2 = c0632a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0632a2.f8239m.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.b0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0632a c0632a3 = c0632a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0632a3.f8239m.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.b0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0632a c0632a4 = c0632a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0632a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.b0(th3);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0632a c0632a5 = c0632a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0632a5.f8239m.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.b0(th4);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0632a c0632a6 = c0632a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0632a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                SharedPreferences.Editor edit = c0632a6.f8239m.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.b0(th5);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0632a c0632a7 = c0632a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0632a7.f8239m.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.b0(th6);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0632a c0632a8 = c0632a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0632a8.f8239m.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0632a8.f8240n.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.b0(th7);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0632a c0632a9 = c0632a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0632a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.b0(th8);
                            }
                            c0276a.o(arrayList14);
                            return;
                        default:
                            C0632a c0632a10 = c0632a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0632a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.b0(th9);
                            }
                            c0276a.o(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0059m5.o(null);
        }
        C0059m c0059m6 = new C0059m(gVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", c0633b, i3);
        if (c0632a != null) {
            c0059m6.o(new InterfaceC0278c() { // from class: m2.c
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    switch (r2) {
                        case 0:
                            C0632a c0632a2 = c0632a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0632a2.f8239m.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.b0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0632a c0632a3 = c0632a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0632a3.f8239m.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.b0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0632a c0632a4 = c0632a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0632a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.b0(th3);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0632a c0632a5 = c0632a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0632a5.f8239m.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.b0(th4);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0632a c0632a6 = c0632a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0632a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                SharedPreferences.Editor edit = c0632a6.f8239m.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.b0(th5);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0632a c0632a7 = c0632a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0632a7.f8239m.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.b0(th6);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0632a c0632a8 = c0632a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0632a8.f8239m.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0632a8.f8240n.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.b0(th7);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0632a c0632a9 = c0632a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0632a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.b0(th8);
                            }
                            c0276a.o(arrayList14);
                            return;
                        default:
                            C0632a c0632a10 = c0632a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0632a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.b0(th9);
                            }
                            c0276a.o(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0059m6.o(null);
        }
        C0059m c0059m7 = new C0059m(gVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", c0633b, i3);
        if (c0632a != null) {
            c0059m7.o(new InterfaceC0278c() { // from class: m2.c
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    switch (r2) {
                        case 0:
                            C0632a c0632a2 = c0632a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0632a2.f8239m.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.b0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0632a c0632a3 = c0632a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0632a3.f8239m.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.b0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0632a c0632a4 = c0632a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0632a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.b0(th3);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0632a c0632a5 = c0632a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0632a5.f8239m.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.b0(th4);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0632a c0632a6 = c0632a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0632a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                SharedPreferences.Editor edit = c0632a6.f8239m.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.b0(th5);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0632a c0632a7 = c0632a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0632a7.f8239m.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.b0(th6);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0632a c0632a8 = c0632a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0632a8.f8239m.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0632a8.f8240n.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.b0(th7);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0632a c0632a9 = c0632a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0632a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.b0(th8);
                            }
                            c0276a.o(arrayList14);
                            return;
                        default:
                            C0632a c0632a10 = c0632a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0632a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.b0(th9);
                            }
                            c0276a.o(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0059m7.o(null);
        }
        C0059m c0059m8 = new C0059m(gVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", c0633b, i3);
        if (c0632a != null) {
            c0059m8.o(new InterfaceC0278c() { // from class: m2.c
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    switch (r2) {
                        case 0:
                            C0632a c0632a2 = c0632a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0632a2.f8239m.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.b0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0632a c0632a3 = c0632a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0632a3.f8239m.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.b0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0632a c0632a4 = c0632a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0632a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.b0(th3);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0632a c0632a5 = c0632a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0632a5.f8239m.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.b0(th4);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0632a c0632a6 = c0632a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0632a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                SharedPreferences.Editor edit = c0632a6.f8239m.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.b0(th5);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0632a c0632a7 = c0632a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0632a7.f8239m.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.b0(th6);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0632a c0632a8 = c0632a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0632a8.f8239m.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0632a8.f8240n.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.b0(th7);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0632a c0632a9 = c0632a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0632a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.b0(th8);
                            }
                            c0276a.o(arrayList14);
                            return;
                        default:
                            C0632a c0632a10 = c0632a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0632a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.b0(th9);
                            }
                            c0276a.o(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0059m8.o(null);
        }
        C0059m c0059m9 = new C0059m(gVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", c0633b, i3);
        if (c0632a != null) {
            c0059m9.o(new InterfaceC0278c() { // from class: m2.c
                @Override // g2.InterfaceC0278c
                public final void d(Object obj, C0276a c0276a) {
                    switch (r2) {
                        case 0:
                            C0632a c0632a2 = c0632a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0632a2.f8239m.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = android.support.v4.media.session.a.b0(th);
                            }
                            c0276a.o(arrayList);
                            return;
                        case 1:
                            C0632a c0632a3 = c0632a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0632a3.f8239m.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = android.support.v4.media.session.a.b0(th2);
                            }
                            c0276a.o(arrayList2);
                            return;
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0632a c0632a4 = c0632a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0632a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = android.support.v4.media.session.a.b0(th3);
                            }
                            c0276a.o(arrayList4);
                            return;
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0632a c0632a5 = c0632a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0632a5.f8239m.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = android.support.v4.media.session.a.b0(th4);
                            }
                            c0276a.o(arrayList6);
                            return;
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            C0632a c0632a6 = c0632a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d3 = (Double) arrayList9.get(1);
                            try {
                                c0632a6.getClass();
                                String d4 = Double.toString(d3.doubleValue());
                                SharedPreferences.Editor edit = c0632a6.f8239m.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = android.support.v4.media.session.a.b0(th5);
                            }
                            c0276a.o(arrayList8);
                            return;
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            C0632a c0632a7 = c0632a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0632a7.f8239m.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = android.support.v4.media.session.a.b0(th6);
                            }
                            c0276a.o(arrayList10);
                            return;
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0632a c0632a8 = c0632a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0632a8.f8239m.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0632a8.f8240n.s(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = android.support.v4.media.session.a.b0(th7);
                            }
                            c0276a.o(arrayList12);
                            return;
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0632a c0632a9 = c0632a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0632a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = android.support.v4.media.session.a.b0(th8);
                            }
                            c0276a.o(arrayList14);
                            return;
                        default:
                            C0632a c0632a10 = c0632a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0632a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = android.support.v4.media.session.a.b0(th9);
                            }
                            c0276a.o(arrayList16);
                            return;
                    }
                }
            });
        } else {
            c0059m9.o(null);
        }
    }

    public static /* synthetic */ String v(int i3) {
        switch (i3) {
            case 1:
                return "BEGIN_ARRAY";
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return "END_ARRAY";
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return "BEGIN_OBJECT";
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return "END_OBJECT";
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return "NAME";
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return "STRING";
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NUMBER";
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
