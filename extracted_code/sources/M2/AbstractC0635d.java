package m2;

import C.S;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.AbstractC0582u;
import n2.AbstractC0664g;
import r2.InterfaceC0767b;
import r2.InterfaceC0768c;
import t2.AbstractC0828e;
import v.C0873d;
import v1.C0878a;
import w.AbstractC0880a;
import w.AbstractC0881b;
import w.C0888i;
import w.InterfaceC0886g;
/* renamed from: m2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0635d {

    /* renamed from: a  reason: collision with root package name */
    public static Constructor f8245a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f8246b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f8247c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f8248d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f8249e;

    /* renamed from: f  reason: collision with root package name */
    public static Method f8250f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f8251g;

    public static ArrayList A(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static final List a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String th2 = th.toString();
        Throwable cause = th.getCause();
        String stackTraceString = Log.getStackTraceString(th);
        return AbstractC0828e.C(simpleName, th2, "Cause: " + cause + ", Stacktrace: " + stackTraceString);
    }

    public static void b(Throwable th, Throwable th2) {
        D2.i.e(th, "<this>");
        D2.i.e(th2, "exception");
        if (th != th2) {
            Integer num = y2.a.f9741a;
            if (num != null && num.intValue() < 19) {
                Method method = x2.a.f9698a;
                if (method != null) {
                    method.invoke(th, th2);
                    return;
                }
                return;
            }
            th.addSuppressed(th2);
        }
    }

    public static void c(Context context, InterfaceC0767b interfaceC0767b) {
        Rect rect;
        C.J f3;
        S b3;
        WindowMetrics maximumWindowMetrics;
        Activity n3 = n(context);
        if (n3 != null) {
            int i3 = r1.l.f9031a;
            r1.m.f9032a.getClass();
            int i4 = r1.n.f9033b;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                maximumWindowMetrics = ((WindowManager) AbstractC0582u.f(n3)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                D2.i.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = n3.getSystemService("window");
                D2.i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                D2.i.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i5 >= 30) {
                if (i5 >= 30) {
                    b3 = C0878a.f9493a.a(n3);
                } else {
                    throw new Exception("Incompatible SDK version");
                }
            } else {
                if (i5 >= 30) {
                    f3 = new C.I();
                } else if (i5 >= 29) {
                    f3 = new C.H();
                } else {
                    f3 = new C.F();
                }
                b3 = f3.b();
                D2.i.d(b3, "{\n            WindowInse…ilder().build()\n        }");
            }
            int i6 = rect.left;
            int i7 = rect.top;
            int i8 = rect.right;
            int i9 = rect.bottom;
            if (i6 <= i8) {
                if (i7 <= i9) {
                    D2.i.e(b3, "_windowInsetsCompat");
                    float f4 = context.getResources().getDisplayMetrics().density;
                    ((X1.c) interfaceC0767b).f2976a.updateDisplayMetrics(0, new Rect(i6, i7, i8, i9).width(), new Rect(i6, i7, i8, i9).height(), f4);
                    return;
                }
                throw new IllegalArgumentException(D2.h.j(i7, i9, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
            }
            throw new IllegalArgumentException(D2.h.j(i6, i8, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
    }

    public static boolean d(C0873d[] c0873dArr, C0873d[] c0873dArr2) {
        if (c0873dArr == null || c0873dArr2 == null || c0873dArr.length != c0873dArr2.length) {
            return false;
        }
        for (int i3 = 0; i3 < c0873dArr.length; i3++) {
            C0873d c0873d = c0873dArr[i3];
            char c3 = c0873d.f9468a;
            C0873d c0873d2 = c0873dArr2[i3];
            if (c3 != c0873d2.f9468a || c0873d.f9469b.length != c0873d2.f9469b.length) {
                return false;
            }
        }
        return true;
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float[] f(float[] fArr, int i3) {
        if (i3 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i3, length);
                float[] fArr2 = new float[i3];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static boolean g(File file, Resources resources, int i3) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i3);
            try {
                boolean h3 = h(file, inputStream);
                e(inputStream);
                return h3;
            } catch (Throwable th) {
                th = th;
                e(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean h(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    e(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            e(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            e(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static s0.h i(r0.s sVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (sVar.o(elapsedRealtime, i4)) {
                i3++;
            }
        }
        return new s0.h(1, 0, length, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098 A[Catch: NumberFormatException -> 0x00ac, LOOP:3: B:25:0x006a->B:44:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static v.C0873d[] j(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.AbstractC0635d.j(java.lang.String):v.d[]");
    }

    public static C0873d[] k(C0873d[] c0873dArr) {
        C0873d[] c0873dArr2 = new C0873d[c0873dArr.length];
        for (int i3 = 0; i3 < c0873dArr.length; i3++) {
            c0873dArr2[i3] = new C0873d(c0873dArr[i3]);
        }
        return c0873dArr2;
    }

    public static String l(Context context, String str) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 && r(context, null, str)) {
            return str;
        }
        if (i3 < 29) {
            if (r(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            if (!r(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
                return null;
            }
            return "android.permission.ACCESS_COARSE_LOCATION";
        } else if (!r(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
            return null;
        } else {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
    }

    public static int m(W1.d dVar, String str) {
        if (dVar == null || Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        boolean z3 = dVar.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
        boolean v3 = AbstractC0664g.v(dVar, str);
        if (z3) {
            if (!v3) {
                v3 = true;
            } else {
                v3 = false;
            }
        }
        if (!z3 && v3) {
            dVar.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
        }
        if (!z3 || !v3) {
            return 0;
        }
        return 4;
    }

    public static Activity n(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return n(((ContextWrapper) context).getBaseContext());
    }

    public static int o(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC0881b.a(drawable);
        }
        if (!f8251g) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f8250f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
            }
            f8251g = true;
        }
        Method method = f8250f;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, null)).intValue();
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
                f8250f = null;
                return 0;
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x014e, code lost:
        if (r8 != false) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList p(android.content.Context r7, int r8) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.AbstractC0635d.p(android.content.Context, int):java.util.ArrayList");
    }

    public static File q(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i3 = 0; i3 < 100; i3++) {
            File file = new File(cacheDir, str + i3);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean r(Context context, ArrayList arrayList, String str) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e2) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e2);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            String packageName = context.getPackageName();
            of = PackageManager.PackageInfoFlags.of(4096L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
        } else {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 4096);
        }
        if (packageInfo == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(packageInfo.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static List s(Object obj) {
        List singletonList = Collections.singletonList(obj);
        D2.i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static MappedByteBuffer t(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    public static void u() {
        if (f8245a == null || f8246b == null || f8247c == null) {
            Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            f8245a = cls.getConstructor(null);
            f8246b = cls.getMethod("setRotationDegrees", Float.TYPE);
            f8247c = cls.getMethod("build", null);
        }
    }

    public static void v(Drawable drawable, int i3) {
        AbstractC0880a.g(drawable, i3);
    }

    public static Integer w(HashSet hashSet) {
        if (hashSet.contains(4)) {
            return 4;
        }
        if (hashSet.contains(2)) {
            return 2;
        }
        if (hashSet.contains(0)) {
            return 0;
        }
        if (hashSet.contains(3)) {
            return 3;
        }
        return 1;
    }

    public static int x(W1.d dVar, String str, int i3) {
        if (i3 == -1) {
            return m(dVar, str);
        }
        return 1;
    }

    public static boolean y(View view, InterfaceC0768c interfaceC0768c) {
        if (view == null) {
            return false;
        }
        if (interfaceC0768c.d(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                if (y(viewGroup.getChildAt(i3), interfaceC0768c)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [w.i, android.graphics.drawable.Drawable] */
    public static Drawable z(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (!(drawable instanceof InterfaceC0886g)) {
            ?? drawable2 = new Drawable();
            drawable2.f9501p = drawable2.c();
            drawable2.h(drawable);
            C0888i.a();
            return drawable2;
        }
        return drawable;
    }
}
