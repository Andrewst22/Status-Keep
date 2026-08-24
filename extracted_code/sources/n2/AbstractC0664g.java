package n2;

import K2.AbstractC0089s;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import m2.AbstractC0635d;
import s.AbstractC0777a;
import s.AbstractC0778b;
import s.AbstractC0779c;
import s.S;
import s2.C0804c;
import t0.C0816a;
import u.C0843f;
import u2.C0867e;
import u2.InterfaceC0866d;
import u2.InterfaceC0868f;
import u2.InterfaceC0869g;
import z.C0911g;
/* renamed from: n2.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0664g {
    public AbstractC0664g() {
        new ConcurrentHashMap();
    }

    public static int d(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new S(context).a()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static final void e(int i3, int i4) {
        if (i3 <= i4) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i4 + ").");
    }

    public static final C0804c f(Throwable th) {
        D2.i.e(th, "exception");
        return new C0804c(th);
    }

    public static boolean k(Method method, D2.e eVar) {
        Class a3 = eVar.a();
        D2.i.c(a3, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a3);
    }

    public static InterfaceC0869g m(InterfaceC0869g interfaceC0869g, u2.h hVar) {
        D2.i.e(hVar, "key");
        if (!D2.i.a(interfaceC0869g.getKey(), hVar)) {
            return null;
        }
        return interfaceC0869g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r5.f9291c == r8.hashCode()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList n(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            u.l r1 = new u.l
            r1.<init>(r0, r8)
            java.lang.Object r2 = u.AbstractC0850m.f9296c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = u.AbstractC0850m.f9295b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L4f
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L4f
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            u.k r5 = (u.C0848k) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L4f
            android.content.res.Configuration r6 = r5.f9290b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4c
            if (r8 != 0) goto L3e
            int r6 = r5.f9291c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L48
            goto L3e
        L3c:
            r8 = move-exception
            goto L9d
        L3e:
            if (r8 == 0) goto L4c
            int r6 = r5.f9291c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4c
        L48:
            android.content.res.ColorStateList r3 = r5.f9289a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L51
        L4c:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L51:
            if (r3 == 0) goto L54
            goto L9c
        L54:
            java.lang.ThreadLocal r2 = u.AbstractC0850m.f9294a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L66
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L66:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L75
            r3 = 31
            if (r2 > r3) goto L75
            goto L86
        L75:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = u.AbstractC0840c.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7e
            goto L86
        L7e:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L86:
            if (r4 == 0) goto L8d
            u.AbstractC0850m.a(r1, r9, r4, r8)
            r3 = r4
            goto L9c
        L8d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L98
            android.content.res.ColorStateList r3 = u.AbstractC0847j.b(r0, r9, r8)
            goto L9c
        L98:
            android.content.res.ColorStateList r3 = r0.getColorStateList(r9)
        L9c:
            return r3
        L9d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.AbstractC0664g.n(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static String o(Context context) {
        File dataDir;
        if (Build.VERSION.SDK_INT >= 24) {
            dataDir = context.getDataDir();
            return dataDir.getPath();
        }
        return context.getApplicationInfo().dataDir;
    }

    public static InterfaceC0866d p(InterfaceC0866d interfaceC0866d) {
        w2.b bVar;
        InterfaceC0866d interfaceC0866d2;
        D2.i.e(interfaceC0866d, "<this>");
        if (interfaceC0866d instanceof w2.b) {
            bVar = (w2.b) interfaceC0866d;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            InterfaceC0866d interfaceC0866d3 = bVar.f9666o;
            if (interfaceC0866d3 == null) {
                InterfaceC0868f interfaceC0868f = (InterfaceC0868f) bVar.h().d(C0867e.f9460m);
                if (interfaceC0868f != null) {
                    interfaceC0866d2 = new P2.h((AbstractC0089s) interfaceC0868f, bVar);
                } else {
                    interfaceC0866d2 = bVar;
                }
                bVar.f9666o = interfaceC0866d2;
                return interfaceC0866d2;
            }
            return interfaceC0866d3;
        }
        return interfaceC0866d;
    }

    public static int q(int i3) {
        if (i3 >= 0) {
            if (i3 < 3) {
                return i3 + 1;
            }
            if (i3 < 1073741824) {
                return (int) ((i3 / 0.75f) + 1.0f);
            }
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public static u2.i r(InterfaceC0869g interfaceC0869g, u2.h hVar) {
        D2.i.e(hVar, "key");
        if (D2.i.a(interfaceC0869g.getKey(), hVar)) {
            return u2.j.f9461m;
        }
        return interfaceC0869g;
    }

    public static void u(Activity activity, String[] strArr, int i3) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (!TextUtils.isEmpty(strArr[i4])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i4], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i4));
                }
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < strArr.length; i6++) {
                if (!hashSet.contains(Integer.valueOf(i6))) {
                    strArr2[i5] = strArr[i6];
                    i5++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0777a.b(activity, strArr, i3);
        }
    }

    public static boolean v(W1.d dVar, String str) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i3 >= 32) {
            return AbstractC0779c.a(dVar, str);
        }
        if (i3 == 31) {
            return AbstractC0778b.b(dVar, str);
        }
        if (i3 < 23) {
            return false;
        }
        return AbstractC0777a.c(dVar, str);
    }

    public static final void w(Object obj) {
        if (!(obj instanceof C0804c)) {
            return;
        }
        throw ((C0804c) obj).f9224m;
    }

    public static final boolean x(String str, C2.a aVar) {
        try {
            boolean booleanValue = ((Boolean) aVar.c()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static ArrayList y(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C0659b) {
            C0659b c0659b = (C0659b) th;
            arrayList.add(c0659b.f8400m);
            arrayList.add(c0659b.getMessage());
            arrayList.add(null);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public abstract boolean a(q.g gVar, q.c cVar, q.c cVar2);

    public abstract boolean b(q.g gVar, Object obj, Object obj2);

    public abstract boolean c(q.g gVar, q.f fVar, q.f fVar2);

    public abstract Typeface g(Context context, C0843f c0843f, Resources resources, int i3);

    public abstract Typeface h(Context context, C0911g[] c0911gArr, int i3);

    public Typeface i(Context context, InputStream inputStream) {
        File q3 = AbstractC0635d.q(context);
        if (q3 == null) {
            return null;
        }
        try {
            if (!AbstractC0635d.h(q3, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(q3.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            q3.delete();
        }
    }

    public Typeface j(Context context, Resources resources, int i3, String str, int i4) {
        File q3 = AbstractC0635d.q(context);
        if (q3 == null) {
            return null;
        }
        try {
            if (!AbstractC0635d.g(q3, resources, i3)) {
                return null;
            }
            return Typeface.createFromFile(q3.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            q3.delete();
        }
    }

    public C0911g l(C0911g[] c0911gArr, int i3) {
        int i4;
        boolean z3;
        int i5;
        new C0816a(2);
        if ((i3 & 1) == 0) {
            i4 = 400;
        } else {
            i4 = 700;
        }
        if ((i3 & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C0911g c0911g = null;
        int i6 = Integer.MAX_VALUE;
        for (C0911g c0911g2 : c0911gArr) {
            int abs = Math.abs(c0911g2.f9760c - i4) * 2;
            if (c0911g2.f9761d == z3) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            int i7 = abs + i5;
            if (c0911g == null || i6 > i7) {
                c0911g = c0911g2;
                i6 = i7;
            }
        }
        return c0911g;
    }

    public abstract void s(q.f fVar, q.f fVar2);

    public abstract void t(q.f fVar, Thread thread);
}
