package v;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import m2.AbstractC0635d;
import n2.AbstractC0664g;
import p.C0727i;
import z.C0911g;
/* renamed from: v.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0876g extends AbstractC0664g {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f9477a;

    /* renamed from: b  reason: collision with root package name */
    public static final Constructor f9478b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f9479c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f9480d;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f9478b = constructor;
        f9477a = cls;
        f9479c = method2;
        f9480d = method;
    }

    public static Typeface A(Object obj) {
        try {
            Object newInstance = Array.newInstance(f9477a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f9480d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean z(Object obj, ByteBuffer byteBuffer, int i3, int i4, boolean z3) {
        try {
            return ((Boolean) f9479c.invoke(obj, byteBuffer, Integer.valueOf(i3), null, Integer.valueOf(i4), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005c A[SYNTHETIC] */
    @Override // n2.AbstractC0664g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface g(android.content.Context r17, u.C0843f r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = v.C0876g.f9478b     // Catch: java.lang.Throwable -> L9
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L9
            r2 = r0
            goto Lb
        L9:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            return r1
        Le:
            r0 = r18
            u.g[] r3 = r0.f9278a
            int r4 = r3.length
            r0 = 0
            r5 = 0
        L15:
            if (r5 >= r4) goto L72
            r6 = r3[r5]
            int r0 = r6.f9284f
            java.io.File r7 = m2.AbstractC0635d.q(r17)
            if (r7 != 0) goto L25
            r8 = r19
        L23:
            r0 = r1
            goto L5a
        L25:
            r8 = r19
            boolean r0 = m2.AbstractC0635d.g(r7, r8, r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L31
            r7.delete()
            goto L23
        L31:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            r9.<init>(r7)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L4a
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L4a
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L4a
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L4a
            r9.close()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            goto L57
        L4a:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L50
            goto L55
        L50:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
        L55:
            throw r10     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
        L56:
            r0 = r1
        L57:
            r7.delete()
        L5a:
            if (r0 != 0) goto L5d
            return r1
        L5d:
            int r7 = r6.f9280b
            boolean r9 = r6.f9281c
            int r6 = r6.f9283e
            boolean r0 = z(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L6a
            return r1
        L6a:
            int r5 = r5 + 1
            goto L15
        L6d:
            r0 = move-exception
            r7.delete()
            throw r0
        L72:
            android.graphics.Typeface r0 = A(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C0876g.g(android.content.Context, u.f, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // n2.AbstractC0664g
    public final Typeface h(Context context, C0911g[] c0911gArr, int i3) {
        Object obj;
        try {
            obj = f9478b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C0727i c0727i = new C0727i();
        for (C0911g c0911g : c0911gArr) {
            Uri uri = c0911g.f9758a;
            ByteBuffer byteBuffer = (ByteBuffer) c0727i.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = AbstractC0635d.t(context, uri);
                c0727i.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!z(obj, byteBuffer, c0911g.f9759b, c0911g.f9760c, c0911g.f9761d)) {
                return null;
            }
        }
        Typeface A3 = A(obj);
        if (A3 == null) {
            return null;
        }
        return Typeface.create(A3, i3);
    }
}
