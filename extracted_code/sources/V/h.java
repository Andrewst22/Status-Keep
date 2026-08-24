package v;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m2.AbstractC0635d;
import u.C0843f;
import u.C0844g;
import z.C0911g;
/* loaded from: classes.dex */
public class h extends C0875f {

    /* renamed from: f  reason: collision with root package name */
    public final Class f9481f;

    /* renamed from: g  reason: collision with root package name */
    public final Constructor f9482g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f9483h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f9484i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f9485j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f9486k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f9487l;

    public h() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = H(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = I(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f9481f = cls;
        this.f9482g = constructor;
        this.f9483h = method2;
        this.f9484i = method3;
        this.f9485j = method4;
        this.f9486k = method5;
        this.f9487l = method;
    }

    public static Method H(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void B(Object obj) {
        try {
            this.f9486k.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean C(Context context, Object obj, String str, int i3, int i4, int i5, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f9483h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface D(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f9481f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f9487l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean E(Object obj) {
        try {
            return ((Boolean) this.f9485j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean F() {
        Method method = this.f9483h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    public final Object G() {
        try {
            return this.f9482g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method I(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // v.C0875f, n2.AbstractC0664g
    public final Typeface g(Context context, C0843f c0843f, Resources resources, int i3) {
        C0844g[] c0844gArr;
        if (!F()) {
            return super.g(context, c0843f, resources, i3);
        }
        Object G3 = G();
        if (G3 == null) {
            return null;
        }
        for (C0844g c0844g : c0843f.f9278a) {
            if (!C(context, G3, c0844g.f9279a, c0844g.f9283e, c0844g.f9280b, c0844g.f9281c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0844g.f9282d))) {
                B(G3);
                return null;
            }
        }
        if (!E(G3)) {
            return null;
        }
        return D(G3);
    }

    @Override // v.C0875f, n2.AbstractC0664g
    public final Typeface h(Context context, C0911g[] c0911gArr, int i3) {
        Typeface D3;
        boolean z3;
        if (c0911gArr.length < 1) {
            return null;
        }
        if (!F()) {
            C0911g l3 = l(c0911gArr, i3);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l3.f9758a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(l3.f9760c).setItalic(l3.f9761d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (C0911g c0911g : c0911gArr) {
            if (c0911g.f9762e == 0) {
                Uri uri = c0911g.f9758a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, AbstractC0635d.t(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object G3 = G();
        if (G3 == null) {
            return null;
        }
        boolean z4 = false;
        for (C0911g c0911g2 : c0911gArr) {
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c0911g2.f9758a);
            if (byteBuffer != null) {
                try {
                    z3 = ((Boolean) this.f9484i.invoke(G3, byteBuffer, Integer.valueOf(c0911g2.f9759b), null, Integer.valueOf(c0911g2.f9760c), Integer.valueOf(c0911g2.f9761d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z3 = false;
                }
                if (!z3) {
                    B(G3);
                    return null;
                }
                z4 = true;
            }
        }
        if (!z4) {
            B(G3);
            return null;
        } else if (!E(G3) || (D3 = D(G3)) == null) {
            return null;
        } else {
            return Typeface.create(D3, i3);
        }
    }

    @Override // n2.AbstractC0664g
    public final Typeface j(Context context, Resources resources, int i3, String str, int i4) {
        if (!F()) {
            return super.j(context, resources, i3, str, i4);
        }
        Object G3 = G();
        if (G3 == null) {
            return null;
        }
        if (!C(context, G3, str, 0, -1, -1, null)) {
            B(G3);
            return null;
        } else if (!E(G3)) {
            return null;
        } else {
            return D(G3);
        }
    }
}
