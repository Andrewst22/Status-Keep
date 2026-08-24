package v;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m2.AbstractC0635d;
import n2.AbstractC0664g;
import u.C0843f;
import u.C0844g;
import z.C0911g;
/* renamed from: v.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0875f extends AbstractC0664g {

    /* renamed from: a  reason: collision with root package name */
    public static Class f9472a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Constructor f9473b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Method f9474c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f9475d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f9476e = false;

    public static void A() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f9476e) {
            return;
        }
        f9476e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f9473b = constructor;
        f9472a = cls;
        f9474c = method2;
        f9475d = method;
    }

    public static boolean z(Object obj, String str, int i3, boolean z3) {
        A();
        try {
            return ((Boolean) f9474c.invoke(obj, str, Integer.valueOf(i3), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // n2.AbstractC0664g
    public Typeface g(Context context, C0843f c0843f, Resources resources, int i3) {
        C0844g[] c0844gArr;
        A();
        try {
            Object newInstance = f9473b.newInstance(null);
            for (C0844g c0844g : c0843f.f9278a) {
                File q3 = AbstractC0635d.q(context);
                if (q3 == null) {
                    return null;
                }
                try {
                    if (!AbstractC0635d.g(q3, resources, c0844g.f9284f)) {
                        return null;
                    }
                    if (!z(newInstance, q3.getPath(), c0844g.f9280b, c0844g.f9281c)) {
                        return null;
                    }
                    q3.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    q3.delete();
                }
            }
            A();
            try {
                Object newInstance2 = Array.newInstance(f9472a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f9475d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // n2.AbstractC0664g
    public Typeface h(Context context, C0911g[] c0911gArr, int i3) {
        File file;
        String readlink;
        if (c0911gArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l(c0911gArr, i3).f9758a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                file = new File(readlink);
                if (file != null && file.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface i4 = i(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return i4;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface i42 = i(context, fileInputStream2);
            fileInputStream2.close();
            openFileDescriptor.close();
            return i42;
        } catch (IOException unused2) {
            return null;
        }
    }
}
