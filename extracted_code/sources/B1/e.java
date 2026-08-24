package B1;

import D1.C;
import D1.I;
import D1.b0;
import H.f;
import K.C0059m;
import K1.n;
import K1.p;
import R.C0112o;
import R.C0113p;
import R.H;
import U.A;
import U.AbstractC0123a;
import U.t;
import U.y;
import W1.u;
import W1.v;
import W1.w;
import Y1.g;
import a0.D;
import a0.Q;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import b1.C0214d;
import c1.C0232F;
import c1.InterfaceC0227A;
import e.AbstractC0259a;
import e0.C0262c;
import g0.C0271b;
import g2.h;
import g2.i;
import g2.j;
import g2.x;
import h0.C0281a;
import h0.l;
import i1.AbstractC0302a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import k0.C0558m;
import l.AbstractC0586y;
import l.C0577o;
import l.l0;
import m2.AbstractC0628K;
import m2.C0627J;
import m2.C0631N;
import m2.C0637f;
import m2.C0639h;
import m2.EnumC0629L;
import m2.InterfaceC0638g;
import n2.C0658a;
import n2.C0659b;
import n2.C0663f;
import o.AbstractC0669a;
import o.AbstractC0670b;
import o.AbstractC0671c;
import o0.M;
import org.xmlpull.v1.XmlPullParserException;
import s2.C0808g;
import t2.AbstractC0827d;
import u.AbstractC0839b;
import u.AbstractC0850m;
import u.InterfaceC0842e;
import u0.k;
import u2.InterfaceC0866d;
import v.AbstractC0874e;
import v2.EnumC0879a;
import w0.G;
import w0.InterfaceC0890A;
import w0.o;
import w0.q;
import w0.r;
/* loaded from: classes.dex */
public final class e implements n, q, T0.d, InterfaceC0227A, g2.e, l, InterfaceC0638g, N2.d {

    /* renamed from: q  reason: collision with root package name */
    public static e f54q;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f55m;

    /* renamed from: n  reason: collision with root package name */
    public Object f56n;

    /* renamed from: o  reason: collision with root package name */
    public Object f57o;

    /* renamed from: p  reason: collision with root package name */
    public Object f58p;

    public /* synthetic */ e(Object obj, int i3) {
        this.f55m = i3;
        this.f56n = obj;
    }

    public static Bundle X(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [V1.a, java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r3v0, types: [a2.e, java.lang.Object] */
    public static e j0() {
        if (f54q == null) {
            b bVar = new b(22);
            ?? obj = new Object();
            obj.f2703a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(obj);
            FlutterJNI flutterJNI = new FlutterJNI();
            ?? obj2 = new Object();
            obj2.f3857a = false;
            obj2.f3861e = flutterJNI;
            obj2.f3862f = newCachedThreadPool;
            e eVar = new e(3);
            eVar.f56n = obj2;
            eVar.f57o = bVar;
            eVar.f58p = newCachedThreadPool;
            f54q = eVar;
        }
        return f54q;
    }

    public static void l0(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public static e n0(Context context, AttributeSet attributeSet, int[] iArr, int i3) {
        return new e(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    @Override // T0.d
    public List A(long j3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (true) {
            List list = (List) this.f56n;
            if (i3 >= list.size()) {
                break;
            }
            int i4 = i3 * 2;
            long[] jArr = (long[]) this.f57o;
            if (jArr[i4] <= j3 && j3 < jArr[i4 + 1]) {
                C0214d c0214d = (C0214d) list.get(i3);
                T.b bVar = c0214d.f4656a;
                if (bVar.f2267e == -3.4028235E38f) {
                    arrayList2.add(c0214d);
                } else {
                    arrayList.add(bVar);
                }
            }
            i3++;
        }
        Collections.sort(arrayList2, new U0.d(3));
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            T.b bVar2 = ((C0214d) arrayList2.get(i5)).f4656a;
            int i6 = bVar2.f2278p;
            float f3 = bVar2.f2279q;
            arrayList.add(new T.b(bVar2.f2263a, bVar2.f2264b, bVar2.f2265c, bVar2.f2266d, (-1) - i5, 1, bVar2.f2269g, bVar2.f2270h, bVar2.f2271i, bVar2.f2276n, bVar2.f2277o, bVar2.f2272j, bVar2.f2273k, bVar2.f2274l, bVar2.f2275m, i6, f3));
        }
        return arrayList;
    }

    @Override // h0.l
    public int B() {
        return ((MediaCodec) this.f56n).dequeueInputBuffer(0L);
    }

    @Override // h0.l
    public void C(int i3) {
        ((MediaCodec) this.f56n).setVideoScalingMode(i3);
    }

    @Override // g2.e
    public void D(ByteBuffer byteBuffer, g gVar) {
        e eVar = (e) this.f58p;
        String str = ((x) eVar.f58p).c(byteBuffer).f5788a;
        boolean equals = str.equals("listen");
        AtomicReference atomicReference = (AtomicReference) this.f57o;
        String str2 = (String) eVar.f57o;
        x xVar = (x) eVar.f58p;
        j jVar = (j) this.f56n;
        if (equals) {
            i iVar = new i(this);
            if (((h) atomicReference.getAndSet(iVar)) != null) {
                try {
                    jVar.p();
                } catch (RuntimeException e2) {
                    Log.e("EventChannel#" + str2, "Failed to close existing event stream", e2);
                }
            }
            try {
                jVar.s(iVar);
                gVar.a(xVar.b(null));
            } catch (RuntimeException e3) {
                atomicReference.set(null);
                Log.e("EventChannel#" + str2, "Failed to open event stream", e3);
                gVar.a(xVar.f("error", e3.getMessage(), null));
            }
        } else if (str.equals("cancel")) {
            if (((h) atomicReference.getAndSet(null)) != null) {
                try {
                    jVar.p();
                    gVar.a(xVar.b(null));
                    return;
                } catch (RuntimeException e4) {
                    Log.e("EventChannel#" + str2, "Failed to close event stream", e4);
                    gVar.a(xVar.f("error", e4.getMessage(), null));
                    return;
                }
            }
            gVar.a(xVar.f("error", "No active stream to cancel", null));
        } else {
            gVar.a(null);
        }
    }

    @Override // m2.InterfaceC0638g
    public Double E(String str, C0639h c0639h) {
        SharedPreferences U3 = U(c0639h);
        if (U3.contains(str)) {
            Object c3 = AbstractC0628K.c(U3.getString(str, ""), (e0.l) this.f58p);
            D2.i.c(c3, "null cannot be cast to non-null type kotlin.Double");
            return (Double) c3;
        }
        return null;
    }

    @Override // T0.d
    public long F(int i3) {
        boolean z3;
        boolean z4 = false;
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        long[] jArr = (long[]) this.f58p;
        if (i3 < jArr.length) {
            z4 = true;
        }
        AbstractC0123a.e(z4);
        return jArr[i3];
    }

    @Override // m2.InterfaceC0638g
    public ArrayList G(String str, C0639h c0639h) {
        List list;
        SharedPreferences U3 = U(c0639h);
        ArrayList arrayList = null;
        if (U3.contains(str)) {
            String string = U3.getString(str, "");
            D2.i.b(string);
            if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && (list = (List) AbstractC0628K.c(U3.getString(str, ""), (e0.l) this.f58p)) != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // h0.l
    public void H(k kVar, Handler handler) {
        D.D((MediaCodec) this.f56n, new C0281a(this, kVar, 1), handler);
    }

    @Override // m2.InterfaceC0638g
    public Map I(List list, C0639h c0639h) {
        Set set;
        Object value;
        Map<String, ?> all = U(c0639h).getAll();
        D2.i.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value2 = entry.getValue();
            if (list != null) {
                set = AbstractC0827d.I(list);
            } else {
                set = null;
            }
            if (AbstractC0628K.b(key, value2, set) && (value = entry.getValue()) != null) {
                String key2 = entry.getKey();
                Object c3 = AbstractC0628K.c(value, (e0.l) this.f58p);
                D2.i.c(c3, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key2, c3);
            }
        }
        return hashMap;
    }

    @Override // K1.n
    public Object K() {
        try {
            return ((K1.d) this.f56n).i((Class) this.f57o);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + ((Type) this.f58p) + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
        }
    }

    @Override // h0.l
    public MediaFormat L() {
        return ((MediaCodec) this.f56n).getOutputFormat();
    }

    @Override // m2.InterfaceC0638g
    public void M(String str, long j3, C0639h c0639h) {
        U(c0639h).edit().putLong(str, j3).apply();
    }

    @Override // m2.InterfaceC0638g
    public void N(String str, boolean z3, C0639h c0639h) {
        U(c0639h).edit().putBoolean(str, z3).apply();
    }

    @Override // m2.InterfaceC0638g
    public String O(String str, C0639h c0639h) {
        SharedPreferences U3 = U(c0639h);
        if (U3.contains(str)) {
            return U3.getString(str, "");
        }
        return null;
    }

    @Override // T0.d
    public int P() {
        return ((long[]) this.f58p).length;
    }

    public void Q() {
        ImageView imageView = (ImageView) this.f56n;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0586y.b(drawable);
        }
        if (drawable != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 <= 21 && i3 == 21) {
                if (((l0) this.f58p) == null) {
                    this.f58p = new Object();
                }
                l0 l0Var = (l0) this.f58p;
                l0Var.f7866a = null;
                l0Var.f7869d = false;
                l0Var.f7867b = null;
                l0Var.f7868c = false;
                ColorStateList a3 = f.a(imageView);
                if (a3 != null) {
                    l0Var.f7869d = true;
                    l0Var.f7866a = a3;
                }
                PorterDuff.Mode b3 = f.b(imageView);
                if (b3 != null) {
                    l0Var.f7868c = true;
                    l0Var.f7867b = b3;
                }
                if (l0Var.f7869d || l0Var.f7868c) {
                    C0577o.c(drawable, l0Var, imageView.getDrawableState());
                    return;
                }
            }
            l0 l0Var2 = (l0) this.f57o;
            if (l0Var2 != null) {
                C0577o.c(drawable, l0Var2, imageView.getDrawableState());
            }
        }
    }

    public String R(String str, long j3, int i3, long j4) {
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f57o;
            int size = arrayList.size();
            ArrayList arrayList2 = (ArrayList) this.f56n;
            if (i4 < size) {
                sb.append((String) arrayList2.get(i4));
                if (((Integer) arrayList.get(i4)).intValue() == 1) {
                    sb.append(str);
                } else {
                    int intValue = ((Integer) arrayList.get(i4)).intValue();
                    ArrayList arrayList3 = (ArrayList) this.f58p;
                    if (intValue == 2) {
                        sb.append(String.format(Locale.US, (String) arrayList3.get(i4), Long.valueOf(j3)));
                    } else if (((Integer) arrayList.get(i4)).intValue() == 3) {
                        sb.append(String.format(Locale.US, (String) arrayList3.get(i4), Integer.valueOf(i3)));
                    } else if (((Integer) arrayList.get(i4)).intValue() == 4) {
                        sb.append(String.format(Locale.US, (String) arrayList3.get(i4), Long.valueOf(j4)));
                    }
                }
                i4++;
            } else {
                sb.append((String) arrayList2.get(arrayList.size()));
                return sb.toString();
            }
        }
    }

    public Boolean S(String str) {
        String shortString;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(((Context) ((B0.a) this.f57o).f25n).getPackageManager());
        if (resolveActivity == null) {
            shortString = null;
        } else {
            shortString = resolveActivity.toShortString();
        }
        if (shortString == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString));
    }

    public void T(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f57o;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f58p).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public SharedPreferences U(C0639h c0639h) {
        String str = c0639h.f8257a;
        Context context = (Context) this.f57o;
        if (str == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
            D2.i.b(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
        D2.i.b(sharedPreferences2);
        return sharedPreferences2;
    }

    public void V(int i3, io.flutter.view.d dVar) {
        ((FlutterJNI) this.f57o).dispatchSemanticsAction(i3, dVar);
    }

    public void W(int i3, io.flutter.view.d dVar, Serializable serializable) {
        ((FlutterJNI) this.f57o).dispatchSemanticsAction(i3, dVar, serializable);
    }

    public int Y(int i3, int i4) {
        ArrayList arrayList = (ArrayList) this.f58p;
        int size = arrayList.size();
        while (i4 < size) {
            ((AbstractC0302a) arrayList.get(i4)).getClass();
            i4++;
        }
        return i3;
    }

    public ColorStateList Z(int i3) {
        int resourceId;
        ColorStateList b3;
        TypedArray typedArray = (TypedArray) this.f57o;
        if (typedArray.hasValue(i3) && (resourceId = typedArray.getResourceId(i3, 0)) != 0 && (b3 = f.b.b((Context) this.f56n, resourceId)) != null) {
            return b3;
        }
        return typedArray.getColorStateList(i3);
    }

    @Override // h0.l
    public void a(Bundle bundle) {
        ((MediaCodec) this.f56n).setParameters(bundle);
    }

    public long a0() {
        w0.l lVar = (w0.l) this.f58p;
        if (lVar != null) {
            return lVar.f9608p;
        }
        return -1L;
    }

    @Override // h0.l
    public void b(int i3, X.b bVar, long j3, int i4) {
        ((MediaCodec) this.f56n).queueSecureInputBuffer(i3, 0, bVar.f2930i, j3, i4);
    }

    public Drawable b0(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f57o;
        if (typedArray.hasValue(i3) && (resourceId = typedArray.getResourceId(i3, 0)) != 0) {
            return f.b.c((Context) this.f56n, resourceId);
        }
        return typedArray.getDrawable(i3);
    }

    @Override // c1.InterfaceC0227A
    public void c(y yVar, q qVar, C0232F c0232f) {
        this.f57o = yVar;
        c0232f.a();
        c0232f.c();
        G w3 = qVar.w(c0232f.f4819c, 5);
        this.f58p = w3;
        w3.c((C0113p) this.f56n);
    }

    public Typeface c0(int i3, int i4, Q0.h hVar) {
        int resourceId = ((TypedArray) this.f57o).getResourceId(i3, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f58p) == null) {
            this.f58p = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f58p;
        ThreadLocal threadLocal = AbstractC0850m.f9294a;
        Context context = (Context) this.f56n;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (!charSequence2.startsWith("res/")) {
                hVar.d();
                return null;
            }
            int i5 = typedValue.assetCookie;
            Q0.i iVar = AbstractC0874e.f9471b;
            Typeface typeface = (Typeface) iVar.d(AbstractC0874e.b(resources, resourceId, charSequence2, i5, i4));
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new U.n(11, hVar, typeface));
                return typeface;
            }
            try {
                if (charSequence2.toLowerCase().endsWith(".xml")) {
                    InterfaceC0842e i6 = AbstractC0839b.i(resources.getXml(resourceId), resources);
                    if (i6 == null) {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        hVar.d();
                        return null;
                    }
                    return AbstractC0874e.a(context, i6, resources, resourceId, charSequence2, typedValue.assetCookie, i4, hVar);
                }
                int i7 = typedValue.assetCookie;
                Typeface j3 = AbstractC0874e.f9470a.j(context, resources, resourceId, charSequence2, i4);
                if (j3 != null) {
                    iVar.e(AbstractC0874e.b(resources, resourceId, charSequence2, i7, i4), j3);
                }
                if (j3 != null) {
                    new Handler(Looper.getMainLooper()).post(new U.n(11, hVar, j3));
                } else {
                    hVar.d();
                }
                return j3;
            } catch (IOException e2) {
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e2);
                hVar.d();
                return null;
            } catch (XmlPullParserException e3) {
                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e3);
                hVar.d();
                return null;
            }
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
    }

    @Override // c1.InterfaceC0227A
    public void d(t tVar) {
        long d3;
        long j3;
        AbstractC0123a.k((y) this.f57o);
        int i3 = A.f2405a;
        y yVar = (y) this.f57o;
        synchronized (yVar) {
            try {
                long j4 = yVar.f2489c;
                if (j4 != -9223372036854775807L) {
                    d3 = j4 + yVar.f2488b;
                } else {
                    d3 = yVar.d();
                }
                j3 = d3;
            } finally {
            }
        }
        long e2 = ((y) this.f57o).e();
        if (j3 != -9223372036854775807L && e2 != -9223372036854775807L) {
            C0113p c0113p = (C0113p) this.f56n;
            if (e2 != c0113p.f1979r) {
                C0112o a3 = c0113p.a();
                a3.f1942q = e2;
                C0113p c0113p2 = new C0113p(a3);
                this.f56n = c0113p2;
                ((G) this.f58p).c(c0113p2);
            }
            int a4 = tVar.a();
            ((G) this.f58p).f(a4, tVar);
            ((G) this.f58p).b(j3, 1, a4, 0, null);
        }
    }

    public View d0(int i3) {
        return ((RecyclerView) ((C0262c) this.f56n).f5225n).getChildAt(i3);
    }

    @Override // h0.l
    public void e(int i3, int i4, long j3, int i5) {
        ((MediaCodec) this.f56n).queueInputBuffer(i3, 0, i4, j3, i5);
    }

    public int e0() {
        return ((RecyclerView) ((C0262c) this.f56n).f5225n).getChildCount();
    }

    @Override // h0.l
    public int f(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.f56n;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && A.f2405a < 21) {
                this.f58p = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public File f0(Context context) {
        ((b) this.f57o).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    @Override // h0.l
    public void flush() {
        ((MediaCodec) this.f56n).flush();
    }

    @Override // T0.d
    public int g(long j3) {
        long[] jArr = (long[]) this.f58p;
        int b3 = A.b(jArr, j3, false);
        if (b3 >= jArr.length) {
            return -1;
        }
        return b3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, A.i] */
    public boolean g0(KeyEvent keyEvent) {
        if (((HashSet) this.f56n).remove(keyEvent)) {
            return false;
        }
        w[] wVarArr = (w[]) this.f57o;
        if (wVarArr.length > 0) {
            v vVar = new v(this, keyEvent);
            for (u uVar : wVarArr) {
                ?? obj = new Object();
                obj.f16b = vVar;
                obj.f15a = false;
                uVar.j(keyEvent, obj);
            }
            return true;
        }
        o0(keyEvent);
        return true;
    }

    @Override // m2.InterfaceC0638g
    public void h(String str, String str2, C0639h c0639h) {
        U(c0639h).edit().putString(str, str2).apply();
    }

    public boolean h0() {
        String trim;
        if (((String) this.f58p) != null) {
            return true;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f57o;
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.f58p = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.f56n).readLine();
            this.f58p = readLine;
            if (readLine != null) {
                trim = readLine.trim();
                this.f58p = trim;
            } else {
                return false;
            }
        } while (trim.isEmpty());
        return true;
    }

    @Override // m2.InterfaceC0638g
    public Boolean i(String str, C0639h c0639h) {
        SharedPreferences U3 = U(c0639h);
        if (U3.contains(str)) {
            return Boolean.valueOf(U3.getBoolean(str, true));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [D1.F, D1.C] */
    public void i0(W.h hVar, Uri uri, Map map, long j3, long j4, M m3) {
        boolean z3;
        boolean z4 = true;
        w0.l lVar = new w0.l(hVar, j3, j4);
        this.f58p = lVar;
        if (((o) this.f57o) != null) {
            return;
        }
        o[] a3 = ((r) this.f56n).a(uri, map);
        int length = a3.length;
        D1.G g3 = I.f197n;
        D1.r.e("expectedSize", length);
        ?? c3 = new C(length);
        if (a3.length == 1) {
            this.f57o = a3[0];
        } else {
            int length2 = a3.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                o oVar = a3[i3];
                try {
                } catch (EOFException unused) {
                    if (((o) this.f57o) == null && lVar.f9608p != j3) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } catch (Throwable th) {
                    if (((o) this.f57o) == null && lVar.f9608p != j3) {
                        z4 = false;
                    }
                    AbstractC0123a.j(z4);
                    lVar.f9610r = 0;
                    throw th;
                }
                if (oVar.e(lVar)) {
                    this.f57o = oVar;
                    lVar.f9610r = 0;
                    break;
                }
                c3.d(oVar.l());
                if (((o) this.f57o) == null && lVar.f9608p != j3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                AbstractC0123a.j(z3);
                lVar.f9610r = 0;
                i3++;
            }
            if (((o) this.f57o) == null) {
                uri.getClass();
                b0 g4 = c3.g();
                H h3 = new H("None of the available extractors (" + new C1.f(", ").b(D1.r.w(I.k(a3), new C0271b(2))) + ") could read the stream.", null, false, 1);
                I.j(g4);
                throw h3;
            }
        }
        ((o) this.f57o).h(m3);
    }

    @Override // h0.l
    public void j(long j3, int i3) {
        ((MediaCodec) this.f56n).releaseOutputBuffer(i3, j3);
    }

    @Override // m2.InterfaceC0638g
    public void k(List list, C0639h c0639h) {
        Set set;
        SharedPreferences U3 = U(c0639h);
        SharedPreferences.Editor edit = U3.edit();
        D2.i.d(edit, "edit(...)");
        Map<String, ?> all = U3.getAll();
        D2.i.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            Object obj = all.get(str);
            if (list != null) {
                set = AbstractC0827d.I(list);
            } else {
                set = null;
            }
            if (AbstractC0628K.b(str, obj, set)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        D2.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            D2.i.d(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    public void k0(int i3) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.f56n;
        e n02 = n0(imageView.getContext(), null, AbstractC0259a.f5196e, i3);
        try {
            Drawable drawable3 = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) n02.f57o;
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = f.b.c(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                AbstractC0586y.b(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList Z2 = n02.Z(2);
                int i4 = Build.VERSION.SDK_INT;
                f.c(imageView, Z2);
                if (i4 == 21 && (drawable2 = imageView.getDrawable()) != null && f.a(imageView) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode d3 = AbstractC0586y.d(typedArray.getInt(3, -1), null);
                int i5 = Build.VERSION.SDK_INT;
                f.d(imageView, d3);
                if (i5 == 21 && (drawable = imageView.getDrawable()) != null && f.a(imageView) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            n02.r0();
        } catch (Throwable th) {
            n02.r0();
            throw th;
        }
    }

    @Override // h0.l
    public ByteBuffer l(int i3) {
        if (A.f2405a >= 21) {
            return ((MediaCodec) this.f56n).getInputBuffer(i3);
        }
        return ((ByteBuffer[]) this.f57o)[i3];
    }

    @Override // h0.l
    public void m(Surface surface) {
        D.t((MediaCodec) this.f56n, surface);
    }

    public String m0() {
        if (h0()) {
            String str = (String) this.f58p;
            this.f58p = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // w0.q
    public void n(InterfaceC0890A interfaceC0890A) {
        ((q) this.f56n).n(interfaceC0890A);
    }

    @Override // m2.InterfaceC0638g
    public List o(List list, C0639h c0639h) {
        Set set;
        Map<String, ?> all = U(c0639h).getAll();
        D2.i.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            D2.i.d(key, "<get-key>(...)");
            String str = key;
            Object value = entry.getValue();
            if (list != null) {
                set = AbstractC0827d.I(list);
            } else {
                set = null;
            }
            if (AbstractC0628K.b(str, value, set)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return AbstractC0827d.H(linkedHashMap.keySet());
    }

    public void o0(KeyEvent keyEvent) {
        InputConnection inputConnection;
        W1.x xVar = (W1.x) this.f58p;
        if (xVar != null) {
            io.flutter.plugin.editing.i iVar = ((W1.o) xVar).f2897w;
            boolean z3 = false;
            if (iVar.f6165b.isAcceptingText() && (inputConnection = iVar.f6173j) != null) {
                if (inputConnection instanceof io.flutter.plugin.editing.b) {
                    io.flutter.plugin.editing.b bVar = (io.flutter.plugin.editing.b) inputConnection;
                    if (keyEvent.getAction() == 0) {
                        if (keyEvent.getKeyCode() == 21) {
                            z3 = bVar.d(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 22) {
                            z3 = bVar.d(false, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 19) {
                            z3 = bVar.e(true, keyEvent.isShiftPressed());
                        } else if (keyEvent.getKeyCode() == 20) {
                            z3 = bVar.e(false, keyEvent.isShiftPressed());
                        } else {
                            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                                EditorInfo editorInfo = bVar.f6130e;
                                if ((editorInfo.inputType & 131072) == 0) {
                                    bVar.performEditorAction(editorInfo.imeOptions & 255);
                                    z3 = true;
                                }
                            }
                            io.flutter.plugin.editing.e eVar = bVar.f6129d;
                            int selectionStart = Selection.getSelectionStart(eVar);
                            int selectionEnd = Selection.getSelectionEnd(eVar);
                            int unicodeChar = keyEvent.getUnicodeChar();
                            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                                int min = Math.min(selectionStart, selectionEnd);
                                int max = Math.max(selectionStart, selectionEnd);
                                bVar.beginBatchEdit();
                                if (min != max) {
                                    eVar.delete(min, max);
                                }
                                eVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                                int i3 = min + 1;
                                bVar.setSelection(i3, i3);
                                bVar.endBatchEdit();
                                z3 = true;
                            }
                        }
                    }
                } else {
                    z3 = inputConnection.sendKeyEvent(keyEvent);
                }
            }
            if (!z3) {
                HashSet hashSet = (HashSet) this.f56n;
                hashSet.add(keyEvent);
                ((W1.o) xVar).getRootView().dispatchKeyEvent(keyEvent);
                if (hashSet.remove(keyEvent)) {
                    Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
                }
            }
        }
    }

    @Override // m2.InterfaceC0638g
    public C0631N p(String str, C0639h c0639h) {
        SharedPreferences U3 = U(c0639h);
        if (!U3.contains(str)) {
            return null;
        }
        String string = U3.getString(str, "");
        D2.i.b(string);
        if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new C0631N(string, EnumC0629L.f8233p);
        }
        if (string.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            return new C0631N(null, EnumC0629L.f8232o);
        }
        return new C0631N(null, EnumC0629L.f8234q);
    }

    public void p0(Activity activity, r1.j jVar) {
        D2.i.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f57o;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f58p;
        try {
            if (jVar.equals((r1.j) weakHashMap.get(activity))) {
                return;
            }
            r1.j jVar2 = (r1.j) weakHashMap.put(activity, jVar);
            reentrantLock.unlock();
            Iterator it = ((u1.j) ((C0558m) this.f56n).f7632n).f9455b.iterator();
            while (it.hasNext()) {
                u1.i iVar = (u1.i) it.next();
                if (iVar.f9449a.equals(activity)) {
                    iVar.f9451c = jVar;
                    iVar.f9450b.accept(jVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // m2.InterfaceC0638g
    public void q(String str, String str2, C0639h c0639h) {
        U(c0639h).edit().putString(str, str2).apply();
    }

    public Boolean q0(String str, Boolean bool, C0663f c0663f, C0658a c0658a) {
        ActivityOptions activityOptions;
        Bundle bundle;
        if (((W1.d) this.f58p) != null) {
            Bundle X2 = X(c0663f.f8406c);
            if (bool.booleanValue()) {
                Iterator it = c0663f.f8406c.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
                        lowerCase.getClass();
                        char c3 = 65535;
                        switch (lowerCase.hashCode()) {
                            case -1423461112:
                                if (lowerCase.equals("accept")) {
                                    c3 = 0;
                                    continue;
                                } else {
                                    continue;
                                }
                            case -1229727188:
                                if (lowerCase.equals("content-language")) {
                                    c3 = 1;
                                    continue;
                                } else {
                                    continue;
                                }
                            case 785670158:
                                if (lowerCase.equals("content-type")) {
                                    c3 = 2;
                                    continue;
                                } else {
                                    continue;
                                }
                            case 802785917:
                                if (lowerCase.equals("accept-language")) {
                                    c3 = 3;
                                    continue;
                                } else {
                                    continue;
                                }
                        }
                        switch (c3) {
                        }
                    } else {
                        Uri parse = Uri.parse(str);
                        W1.d dVar = (W1.d) this.f58p;
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", c0658a.f8399a.booleanValue() ? 1 : 0);
                        Bundle bundle2 = null;
                        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBinder("android.support.customtabs.extra.SESSION", null);
                            intent.putExtras(bundle3);
                        }
                        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                        intent.putExtras(new Bundle());
                        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 24) {
                            String a3 = AbstractC0670b.a();
                            if (!TextUtils.isEmpty(a3)) {
                                if (intent.hasExtra("com.android.browser.headers")) {
                                    bundle = intent.getBundleExtra("com.android.browser.headers");
                                } else {
                                    bundle = new Bundle();
                                }
                                if (!bundle.containsKey("Accept-Language")) {
                                    bundle.putString("Accept-Language", a3);
                                    intent.putExtra("com.android.browser.headers", bundle);
                                }
                            }
                        }
                        if (i3 >= 34) {
                            activityOptions = AbstractC0669a.a();
                            AbstractC0671c.a(activityOptions, false);
                        } else {
                            activityOptions = null;
                        }
                        if (activityOptions != null) {
                            bundle2 = activityOptions.toBundle();
                        }
                        intent.putExtra("com.android.browser.headers", X2);
                        try {
                            intent.setData(parse);
                            dVar.startActivity(intent, bundle2);
                            return Boolean.TRUE;
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                }
            }
            boolean booleanValue = c0663f.f8404a.booleanValue();
            boolean booleanValue2 = c0663f.f8405b.booleanValue();
            int i4 = WebViewActivity.f6279q;
            try {
                ((W1.d) this.f58p).startActivity(new Intent((W1.d) this.f58p, WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", booleanValue).putExtra("enableDomStorage", booleanValue2).putExtra("com.android.browser.headers", X2));
                return Boolean.TRUE;
            } catch (ActivityNotFoundException unused2) {
                return Boolean.FALSE;
            }
        }
        throw new C0659b();
    }

    @Override // h0.l
    public void r(int i3, boolean z3) {
        ((MediaCodec) this.f56n).releaseOutputBuffer(i3, z3);
    }

    public void r0() {
        ((TypedArray) this.f57o).recycle();
    }

    @Override // h0.l
    public void release() {
        MediaCodec mediaCodec = (MediaCodec) this.f56n;
        this.f57o = null;
        this.f58p = null;
        try {
            int i3 = A.f2405a;
            if (i3 >= 30 && i3 < 33) {
                mediaCodec.stop();
            }
        } finally {
            mediaCodec.release();
        }
    }

    @Override // w0.q
    public void s() {
        ((q) this.f56n).s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        r4 = r3.f22m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r4 >= r6.length) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        r6[r4] = r2;
        r3.f22m = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s0(java.util.ArrayList r8) {
        /*
            r7 = this;
            int r0 = r8.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L42
            java.lang.Object r2 = r8.get(r1)
            i1.a r2 = (i1.AbstractC0302a) r2
            r2.getClass()
            java.lang.Object r3 = r7.f56n
            B.b r3 = (B.b) r3
            r3.getClass()
            java.lang.String r4 = "instance"
            D2.i.e(r2, r4)
            int r4 = r3.f22m
            r5 = 0
        L1f:
            java.lang.Object r6 = r3.f23n
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            if (r5 >= r4) goto L34
            r6 = r6[r5]
            if (r6 == r2) goto L2c
            int r5 = r5 + 1
            goto L1f
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already in the pool!"
            r8.<init>(r0)
            throw r8
        L34:
            int r4 = r3.f22m
            int r5 = r6.length
            if (r4 >= r5) goto L3f
            r6[r4] = r2
            int r4 = r4 + 1
            r3.f22m = r4
        L3f:
            int r1 = r1 + 1
            goto L5
        L42:
            r8.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.e.s0(java.util.ArrayList):void");
    }

    @Override // m2.InterfaceC0638g
    public Long t(String str, C0639h c0639h) {
        long j3;
        SharedPreferences U3 = U(c0639h);
        if (U3.contains(str)) {
            try {
                j3 = U3.getLong(str, 0L);
            } catch (ClassCastException unused) {
                j3 = U3.getInt(str, 0);
            }
            return Long.valueOf(j3);
        }
        return null;
    }

    public void t0(j jVar) {
        e eVar;
        if (jVar == null) {
            eVar = null;
        } else {
            eVar = new e(this, jVar);
        }
        ((g2.g) this.f56n).j((String) this.f57o, eVar);
    }

    public String toString() {
        switch (this.f55m) {
            case 16:
                return ((E0.c) this.f57o).toString() + ", hidden list:" + ((ArrayList) this.f58p).size();
            default:
                return super.toString();
        }
    }

    @Override // m2.InterfaceC0638g
    public void u(String str, double d3, C0639h c0639h) {
        SharedPreferences.Editor edit = U(c0639h).edit();
        edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).apply();
    }

    public Boolean u0() {
        ArrayList arrayList;
        String str;
        List emptyList = Collections.emptyList();
        PackageManager packageManager = ((Context) this.f56n).getPackageManager();
        if (emptyList == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = emptyList;
        }
        boolean z3 = false;
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str2 = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str2);
            if (emptyList != null) {
                arrayList2.addAll(emptyList);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                str = (String) it.next();
                intent.setPackage(str);
                if (packageManager.resolveService(intent, 0) != null) {
                    break;
                }
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
                }
                str = null;
            }
        }
        if (str != null) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    @Override // h0.l
    public ByteBuffer v(int i3) {
        if (A.f2405a >= 21) {
            return ((MediaCodec) this.f56n).getOutputBuffer(i3);
        }
        return ((ByteBuffer[]) this.f58p)[i3];
    }

    @Override // w0.q
    public G w(int i3, int i4) {
        q qVar = (q) this.f56n;
        if (i4 != 3) {
            return qVar.w(i3, i4);
        }
        SparseArray sparseArray = (SparseArray) this.f58p;
        T0.o oVar = (T0.o) sparseArray.get(i3);
        if (oVar != null) {
            return oVar;
        }
        T0.o oVar2 = new T0.o(qVar.w(i3, i4), (T0.j) this.f57o);
        sparseArray.put(i3, oVar2);
        return oVar2;
    }

    @Override // N2.d
    public Object x(N2.e eVar, InterfaceC0866d interfaceC0866d) {
        Object x = ((N2.d) this.f56n).x(new N2.l(eVar, (O.e) this.f57o, (C0627J) this.f58p), interfaceC0866d);
        if (x == EnumC0879a.f9494m) {
            return x;
        }
        return C0808g.f9229a;
    }

    @Override // m2.InterfaceC0638g
    public void y(String str, List list, C0639h c0639h) {
        U(c0639h).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(((e0.l) this.f58p).s(list))).apply();
    }

    @Override // h0.l
    public /* synthetic */ boolean z(h0.t tVar) {
        return false;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i3) {
        this.f55m = i3;
        this.f56n = obj;
        this.f57o = obj2;
        this.f58p = obj3;
    }

    public e(ArrayList arrayList) {
        this.f55m = 6;
        this.f56n = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f57o = new long[arrayList.size() * 2];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0214d c0214d = (C0214d) arrayList.get(i3);
            int i4 = i3 * 2;
            long[] jArr = (long[]) this.f57o;
            jArr[i4] = c0214d.f4657b;
            jArr[i4 + 1] = c0214d.f4658c;
        }
        long[] jArr2 = (long[]) this.f57o;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f58p = copyOf;
        Arrays.sort(copyOf);
    }

    public e(int i3) {
        this.f55m = i3;
        switch (i3) {
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return;
            case 11:
                this.f56n = new ConcurrentLinkedQueue();
                return;
            default:
                b bVar = new b(1);
                b bVar2 = new b(0);
                this.f56n = new HashSet();
                this.f57o = bVar;
                this.f58p = bVar2;
                return;
        }
    }

    public e(String str) {
        this.f55m = 8;
        C0112o c0112o = new C0112o();
        c0112o.f1937l = R.G.l(str);
        this.f56n = new C0113p(c0112o);
    }

    public e(C0262c c0262c) {
        this.f55m = 16;
        this.f56n = c0262c;
        this.f57o = new E0.c(5);
        this.f58p = new ArrayList();
    }

    public e(g2.g gVar, String str) {
        this.f55m = 13;
        x xVar = x.f5796a;
        this.f56n = gVar;
        this.f57o = str;
        this.f58p = xVar;
    }

    public e(q qVar, T0.j jVar) {
        this.f55m = 2;
        this.f56n = qVar;
        this.f57o = jVar;
        this.f58p = new SparseArray();
    }

    public e(Context context) {
        this.f55m = 21;
        B0.a aVar = new B0.a(context, 21);
        this.f56n = context;
        this.f57o = aVar;
    }

    public e(Context context, TypedArray typedArray) {
        this.f55m = 18;
        this.f56n = context;
        this.f57o = typedArray;
    }

    public e(e0.l lVar) {
        this.f55m = 15;
        this.f56n = new B.b(30);
        this.f57o = new ArrayList();
        this.f58p = new ArrayList();
        new e0.l(this, 14);
    }

    public e(MediaCodec mediaCodec) {
        this.f55m = 14;
        this.f56n = mediaCodec;
        if (A.f2405a < 21) {
            this.f57o = mediaCodec.getInputBuffers();
            this.f58p = mediaCodec.getOutputBuffers();
        }
    }

    public e(Y1.b bVar, FlutterJNI flutterJNI) {
        this.f55m = 10;
        C0262c c0262c = new C0262c(this, 4);
        C0059m c0059m = new C0059m(bVar, "flutter/accessibility", g2.w.f5793a, (b) null);
        this.f56n = c0059m;
        c0059m.o(c0262c);
        this.f57o = flutterJNI;
    }

    public e(W1.x xVar) {
        this.f55m = 4;
        this.f56n = new HashSet();
        this.f58p = xVar;
        W1.o oVar = (W1.o) xVar;
        this.f57o = new w[]{new u(oVar.getBinaryMessenger()), new a(new f2.b(oVar.getBinaryMessenger()))};
        new C0262c(oVar.getBinaryMessenger()).f5225n = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, S.g] */
    public e(S.d[] dVarArr) {
        this.f55m = 5;
        Q q3 = new Q();
        ?? obj = new Object();
        obj.f2190c = 1.0f;
        obj.f2191d = 1.0f;
        S.b bVar = S.b.f2154e;
        obj.f2192e = bVar;
        obj.f2193f = bVar;
        obj.f2194g = bVar;
        obj.f2195h = bVar;
        ByteBuffer byteBuffer = S.d.f2159a;
        obj.f2198k = byteBuffer;
        obj.f2199l = byteBuffer.asShortBuffer();
        obj.f2200m = byteBuffer;
        obj.f2189b = -1;
        S.d[] dVarArr2 = new S.d[dVarArr.length + 2];
        this.f56n = dVarArr2;
        System.arraycopy(dVarArr, 0, dVarArr2, 0, dVarArr.length);
        this.f57o = q3;
        this.f58p = obj;
        dVarArr2[dVarArr.length] = q3;
        dVarArr2[dVarArr.length + 1] = obj;
    }

    public e(e eVar, j jVar) {
        this.f55m = 12;
        this.f58p = eVar;
        this.f57o = new AtomicReference(null);
        this.f56n = jVar;
    }

    public e(Class cls, Type type) {
        Object obj;
        this.f55m = 1;
        this.f57o = cls;
        this.f58p = type;
        try {
            try {
                try {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    obj = new K1.o(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    obj = new Object();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                obj = new K1.q(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            obj = new p(intValue, declaredMethod3);
        }
        this.f56n = obj;
    }

    public e(g2.g gVar, Context context, e0.l lVar) {
        this.f55m = 19;
        D2.i.e(gVar, "messenger");
        D2.i.e(context, "context");
        this.f56n = gVar;
        this.f57o = context;
        this.f58p = lVar;
        try {
            InterfaceC0638g.f8256g.getClass();
            C0637f.b(gVar, this, "shared_preferences");
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e2);
        }
    }

    public e(C0558m c0558m) {
        this.f55m = 23;
        this.f56n = c0558m;
        this.f57o = new ReentrantLock();
        this.f58p = new WeakHashMap();
    }

    public e(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f55m = 9;
        this.f57o = arrayDeque;
        this.f56n = bufferedReader;
    }
}
