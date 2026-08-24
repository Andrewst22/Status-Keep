package W1;

import K.C0059m;
import K2.AbstractC0072a;
import K2.AbstractC0092v;
import K2.C0090t;
import K2.J;
import K2.P;
import K2.T;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import e0.C0262c;
import g2.C0276a;
import h2.C0286a;
import i2.InterfaceC0321a;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import m2.AbstractC0635d;
import o1.C0703b;
import p1.C0736a;
import r1.C0760b;
import r1.C0761c;
import r1.C0765g;
import t.AbstractC0812d;
import u2.C0867e;
import y.ExecutorC0902a;
/* loaded from: classes.dex */
public final class o extends FrameLayout implements InterfaceC0321a, x {

    /* renamed from: A  reason: collision with root package name */
    public C0128a f2877A;

    /* renamed from: B  reason: collision with root package name */
    public io.flutter.view.k f2878B;

    /* renamed from: C  reason: collision with root package name */
    public TextServicesManager f2879C;

    /* renamed from: D  reason: collision with root package name */
    public C1.j f2880D;

    /* renamed from: E  reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.k f2881E;

    /* renamed from: F  reason: collision with root package name */
    public final C1.j f2882F;

    /* renamed from: G  reason: collision with root package name */
    public final I.a f2883G;

    /* renamed from: H  reason: collision with root package name */
    public final e f2884H;

    /* renamed from: I  reason: collision with root package name */
    public m f2885I;

    /* renamed from: J  reason: collision with root package name */
    public q f2886J;

    /* renamed from: m  reason: collision with root package name */
    public final j f2887m;

    /* renamed from: n  reason: collision with root package name */
    public final l f2888n;

    /* renamed from: o  reason: collision with root package name */
    public h f2889o;

    /* renamed from: p  reason: collision with root package name */
    public View f2890p;

    /* renamed from: q  reason: collision with root package name */
    public View f2891q;

    /* renamed from: r  reason: collision with root package name */
    public final HashSet f2892r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2893s;

    /* renamed from: t  reason: collision with root package name */
    public X1.c f2894t;

    /* renamed from: u  reason: collision with root package name */
    public final HashSet f2895u;

    /* renamed from: v  reason: collision with root package name */
    public C0276a f2896v;

    /* renamed from: w  reason: collision with root package name */
    public io.flutter.plugin.editing.i f2897w;
    public io.flutter.plugin.editing.f x;

    /* renamed from: y  reason: collision with root package name */
    public C0286a f2898y;

    /* renamed from: z  reason: collision with root package name */
    public B1.e f2899z;

    /* JADX WARN: Type inference failed for: r3v7, types: [W1.q, java.lang.Object] */
    public o(d dVar, j jVar) {
        super(dVar, null);
        this.f2892r = new HashSet();
        this.f2895u = new HashSet();
        this.f2881E = new io.flutter.embedding.engine.renderer.k();
        this.f2882F = new C1.j(this, 19);
        this.f2883G = new I.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f2884H = new e(this, 2);
        this.f2886J = new Object();
        this.f2887m = jVar;
        this.f2890p = jVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f2894t);
        if (!c()) {
            return;
        }
        Iterator it = this.f2895u.iterator();
        if (!it.hasNext()) {
            getContext().getContentResolver().unregisterContentObserver(this.f2883G);
            io.flutter.plugin.platform.n nVar = this.f2894t.f2993r;
            int i3 = 0;
            while (true) {
                SparseArray sparseArray2 = nVar.f6250n;
                if (i3 >= sparseArray2.size()) {
                    break;
                }
                nVar.f6240d.removeView((io.flutter.plugin.platform.g) sparseArray2.valueAt(i3));
                i3++;
            }
            int i4 = 0;
            while (true) {
                SparseArray sparseArray3 = nVar.f6248l;
                if (i4 >= sparseArray3.size()) {
                    break;
                }
                nVar.f6240d.removeView((b2.b) sparseArray3.valueAt(i4));
                i4++;
            }
            nVar.g();
            if (nVar.f6240d == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                int i5 = 0;
                while (true) {
                    sparseArray = nVar.f6249m;
                    if (i5 >= sparseArray.size()) {
                        break;
                    }
                    nVar.f6240d.removeView((View) sparseArray.valueAt(i5));
                    i5++;
                }
                sparseArray.clear();
            }
            nVar.f6240d = null;
            nVar.f6252p = false;
            int i6 = 0;
            while (true) {
                SparseArray sparseArray4 = nVar.f6247k;
                if (i6 >= sparseArray4.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.e) sparseArray4.valueAt(i6)).getClass();
                i6++;
            }
            io.flutter.plugin.platform.m mVar = this.f2894t.f2994s;
            int i7 = 0;
            while (true) {
                SparseArray sparseArray5 = mVar.f6229j;
                if (i7 >= sparseArray5.size()) {
                    break;
                }
                mVar.f6223d.removeView((b2.b) sparseArray5.valueAt(i7));
                i7++;
            }
            Surface surface = mVar.f6233n;
            if (surface != null) {
                surface.release();
                mVar.f6233n = null;
                mVar.f6234o = null;
            }
            mVar.f6223d = null;
            int i8 = 0;
            while (true) {
                SparseArray sparseArray6 = mVar.f6228i;
                if (i8 >= sparseArray6.size()) {
                    break;
                }
                ((io.flutter.plugin.platform.e) sparseArray6.valueAt(i8)).getClass();
                i8++;
            }
            this.f2894t.f2993r.a();
            this.f2894t.f2994s.a();
            io.flutter.view.k kVar = this.f2878B;
            kVar.f6392u = true;
            kVar.f6376e.a();
            kVar.f6390s = null;
            AccessibilityManager accessibilityManager = kVar.f6374c;
            accessibilityManager.removeAccessibilityStateChangeListener(kVar.f6394w);
            accessibilityManager.removeTouchExplorationStateChangeListener(kVar.x);
            kVar.f6377f.unregisterContentObserver(kVar.f6395y);
            B1.e eVar = kVar.f6373b;
            eVar.f58p = null;
            ((FlutterJNI) eVar.f57o).setAccessibilityDelegate(null);
            this.f2878B = null;
            this.f2897w.f6165b.restartInput(this);
            this.f2897w.c();
            int size = ((HashSet) this.f2899z.f56n).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
            }
            io.flutter.plugin.editing.f fVar = this.x;
            if (fVar != null) {
                fVar.f6152a.f5225n = null;
                SpellCheckerSession spellCheckerSession = fVar.f6154c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            C0276a c0276a = this.f2896v;
            if (c0276a != null) {
                ((C0262c) c0276a.f5778o).f5225n = null;
            }
            io.flutter.embedding.engine.renderer.l lVar = this.f2894t.f2977b;
            this.f2893s = false;
            lVar.f6109a.removeIsDisplayingFlutterUiListener(this.f2884H);
            lVar.g();
            lVar.f6109a.setSemanticsEnabled(false);
            View view = this.f2891q;
            if (view != null && this.f2890p == this.f2889o) {
                this.f2890p = view;
            }
            this.f2890p.c();
            h hVar = this.f2889o;
            if (hVar != null) {
                hVar.f2855m.close();
                removeView(this.f2889o);
                this.f2889o = null;
            }
            this.f2891q = null;
            this.f2894t = null;
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C0059m c0059m;
        C0059m c0059m2;
        CharSequence textValue;
        io.flutter.plugin.editing.i iVar = this.f2897w;
        if (Build.VERSION.SDK_INT < 26) {
            iVar.getClass();
            return;
        }
        f2.n nVar = iVar.f6169f;
        if (nVar != null && iVar.f6170g != null && (c0059m = nVar.f5625j) != null) {
            HashMap hashMap = new HashMap();
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                f2.n nVar2 = (f2.n) iVar.f6170g.get(sparseArray.keyAt(i3));
                if (nVar2 != null && (c0059m2 = nVar2.f5625j) != null) {
                    textValue = com.dexterous.flutterlocalnotifications.b.i(sparseArray.valueAt(i3)).getTextValue();
                    String charSequence = textValue.toString();
                    f2.p pVar = new f2.p(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    String str = (String) c0059m2.f650m;
                    if (str.equals((String) c0059m.f650m)) {
                        iVar.f6171h.f(pVar);
                    } else {
                        hashMap.put(str, pVar);
                    }
                }
            }
            int i4 = iVar.f6168e.f108c;
            B1.a aVar = iVar.f6167d;
            aVar.getClass();
            String.valueOf(hashMap.size());
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                f2.p pVar2 = (f2.p) entry.getValue();
                hashMap2.put((String) entry.getKey(), B1.a.z(pVar2.f5631a, pVar2.f5632b, pVar2.f5633c, -1, -1));
            }
            ((g2.r) aVar.f50n).a("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i4), hashMap2), null);
        }
    }

    public final void b() {
        j jVar = this.f2887m;
        if (jVar != null) {
            addView(jVar);
        } else {
            l lVar = this.f2888n;
            if (lVar != null) {
                addView(lVar);
            } else {
                addView(this.f2889o);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final boolean c() {
        X1.c cVar = this.f2894t;
        if (cVar != null) {
            if (cVar.f2977b == this.f2890p.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        X1.c cVar = this.f2894t;
        if (cVar != null) {
            io.flutter.plugin.platform.n nVar = cVar.f2993r;
            if (view == null) {
                nVar.getClass();
                return false;
            }
            HashMap hashMap = nVar.f6246j;
            if (!hashMap.containsKey(view.getContext())) {
                return false;
            }
            View view2 = (View) hashMap.get(view.getContext());
            if (view2 == view) {
                return true;
            }
            return view2.checkInputConnectionProxy(view);
        }
        return super.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.o.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        if ((c() && this.f2899z.g0(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f3 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.k kVar = this.f2881E;
        kVar.f6091a = f3;
        kVar.f6106p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.l lVar = this.f2894t.f2977b;
        lVar.getClass();
        if (kVar.f6092b > 0 && kVar.f6093c > 0 && kVar.f6091a > 0.0f) {
            ArrayList arrayList = kVar.f6107q;
            arrayList.size();
            ArrayList arrayList2 = kVar.f6108r;
            arrayList2.size();
            int size = arrayList2.size() + arrayList.size();
            int[] iArr = new int[size * 4];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                io.flutter.embedding.engine.renderer.c cVar = (io.flutter.embedding.engine.renderer.c) arrayList.get(i3);
                int i4 = i3 * 4;
                Rect rect = cVar.f6071a;
                iArr[i4] = rect.left;
                iArr[i4 + 1] = rect.top;
                iArr[i4 + 2] = rect.right;
                iArr[i4 + 3] = rect.bottom;
                iArr2[i3] = N.j.b(cVar.f6072b);
                iArr3[i3] = N.j.b(cVar.f6073c);
            }
            int size2 = arrayList.size() * 4;
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                io.flutter.embedding.engine.renderer.c cVar2 = (io.flutter.embedding.engine.renderer.c) arrayList2.get(i5);
                int i6 = (i5 * 4) + size2;
                Rect rect2 = cVar2.f6071a;
                iArr[i6] = rect2.left;
                iArr[i6 + 1] = rect2.top;
                iArr[i6 + 2] = rect2.right;
                iArr[i6 + 3] = rect2.bottom;
                iArr2[arrayList.size() + i5] = N.j.b(cVar2.f6072b);
                iArr3[arrayList.size() + i5] = N.j.b(cVar2.f6073c);
            }
            lVar.f6109a.setViewportMetrics(kVar.f6091a, kVar.f6092b, kVar.f6093c, kVar.f6094d, kVar.f6095e, kVar.f6096f, kVar.f6097g, kVar.f6098h, kVar.f6099i, kVar.f6100j, kVar.f6101k, kVar.f6102l, kVar.f6103m, kVar.f6104n, kVar.f6105o, kVar.f6106p, iArr, iArr2, iArr3);
        }
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.k kVar = this.f2878B;
        if (kVar != null && kVar.f6374c.isEnabled()) {
            return this.f2878B;
        }
        return null;
    }

    public X1.c getAttachedFlutterEngine() {
        return this.f2894t;
    }

    public g2.g getBinaryMessenger() {
        return this.f2894t.f2978c;
    }

    public h getCurrentImageSurface() {
        return this.f2889o;
    }

    public io.flutter.embedding.engine.renderer.k getViewportMetrics() {
        return this.f2881E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b7, code lost:
        r1 = r16.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r16) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.o.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [N2.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C1.j jVar;
        Executor executorC0902a;
        u2.j jVar2 = u2.j.f9461m;
        super.onAttachedToWindow();
        try {
            C0765g c0765g = r1.h.f9023j;
            Context context = getContext();
            c0765g.getClass();
            jVar = new C1.j(new C0276a(C0765g.a(context)), 20);
        } catch (NoClassDefFoundError unused) {
            jVar = null;
        }
        this.f2880D = jVar;
        Activity n3 = AbstractC0635d.n(getContext());
        C1.j jVar3 = this.f2880D;
        if (jVar3 != null && n3 != null) {
            this.f2885I = new m(this, 0);
            Context context2 = getContext();
            if (Build.VERSION.SDK_INT >= 28) {
                executorC0902a = AbstractC0812d.a(context2);
            } else {
                executorC0902a = new ExecutorC0902a(new Handler(context2.getMainLooper()));
            }
            m mVar = this.f2885I;
            C0276a c0276a = (C0276a) jVar3.f168n;
            D2.i.e(executorC0902a, "executor");
            D2.i.e(mVar, "consumer");
            C0760b c0760b = (C0760b) c0276a.f5777n;
            c0760b.getClass();
            N2.c cVar = new N2.c(new r1.i(c0760b, n3, null), jVar2, -2, 1);
            R2.d dVar = K2.B.f785a;
            L2.c cVar2 = P2.p.f1508a;
            if (cVar2.d(C0090t.f856n) == null) {
                N2.c cVar3 = cVar;
                if (!cVar2.equals(jVar2)) {
                    cVar3 = O2.l.a(cVar, cVar2, 0, 0, 6);
                }
                C0276a c0276a2 = (C0276a) c0276a.f5778o;
                c0276a2.getClass();
                D2.i.e(cVar3, "flow");
                ReentrantLock reentrantLock = (ReentrantLock) c0276a2.f5777n;
                reentrantLock.lock();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0276a2.f5778o;
                try {
                    if (linkedHashMap.get(mVar) == null) {
                        u2.i j3 = new J(executorC0902a);
                        if (j3.d(C0090t.f856n) == null) {
                            j3 = j3.n(new T(null));
                        }
                        C0736a c0736a = new C0736a(cVar3, mVar, null);
                        u2.i a3 = AbstractC0092v.a(j3, jVar2, true);
                        R2.d dVar2 = K2.B.f785a;
                        if (a3 != dVar2 && a3.d(C0867e.f9460m) == null) {
                            a3 = a3.n(dVar2);
                        }
                        AbstractC0072a abstractC0072a = new AbstractC0072a(a3, true);
                        abstractC0072a.W(1, abstractC0072a, c0736a);
                        linkedHashMap.put(mVar, abstractC0072a);
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            }
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar2).toString());
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f2894t != null) {
            this.f2898y.b(configuration);
            d();
            AbstractC0635d.c(getContext(), this.f2894t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r11) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.o.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m mVar;
        C1.j jVar = this.f2880D;
        if (jVar != null && (mVar = this.f2885I) != null) {
            C0276a c0276a = (C0276a) ((C0276a) jVar.f168n).f5778o;
            c0276a.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) c0276a.f5777n;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) c0276a.f5778o;
            try {
                P p3 = (P) linkedHashMap.get(mVar);
                if (p3 != null) {
                    p3.b(null);
                }
                P p4 = (P) linkedHashMap.remove(mVar);
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f2885I = null;
        this.f2880D = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z3;
        if (c()) {
            C0128a c0128a = this.f2877A;
            Context context = getContext();
            c0128a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            if (motionEvent.getActionMasked() != 7 && motionEvent.getActionMasked() != 8) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (isFromSource && z3) {
                int b3 = C0128a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0128a.a(motionEvent, motionEvent.getActionIndex(), b3, 0, C0128a.f2827f, allocateDirect, context);
                if (allocateDirect.position() % 288 == 0) {
                    c0128a.f2828a.f6109a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                    return true;
                }
                throw new AssertionError("Packet position is not on field boundary.");
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.f2878B.e(motionEvent, false);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i3) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i3);
        io.flutter.plugin.editing.i iVar = this.f2897w;
        if (Build.VERSION.SDK_INT >= 26) {
            if (iVar.f6170g != null) {
                String str = (String) iVar.f6169f.f5625j.f650m;
                AutofillId autofillId = viewStructure.getAutofillId();
                for (int i4 = 0; i4 < iVar.f6170g.size(); i4++) {
                    int keyAt = iVar.f6170g.keyAt(i4);
                    C0059m c0059m = ((f2.n) iVar.f6170g.valueAt(i4)).f5625j;
                    if (c0059m != null) {
                        viewStructure.addChildCount(1);
                        ViewStructure newChild = viewStructure.newChild(i4);
                        newChild.setAutofillId(autofillId, keyAt);
                        String[] strArr = (String[]) c0059m.f651n;
                        if (strArr.length > 0) {
                            newChild.setAutofillHints(strArr);
                        }
                        newChild.setAutofillType(1);
                        newChild.setVisibility(0);
                        String str2 = (String) c0059m.f653p;
                        if (str2 != null) {
                            newChild.setHint(str2);
                        }
                        if (str.hashCode() == keyAt && (rect = iVar.f6176m) != null) {
                            newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), iVar.f6176m.height());
                            newChild.setAutofillValue(AutofillValue.forText(iVar.f6171h));
                        } else {
                            newChild.setDimens(0, 0, 0, 0, 1, 1);
                            newChild.setAutofillValue(AutofillValue.forText(((f2.p) c0059m.f652o).f5631a));
                        }
                    }
                }
                return;
            }
            return;
        }
        iVar.getClass();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        io.flutter.embedding.engine.renderer.k kVar = this.f2881E;
        kVar.f6092b = i3;
        kVar.f6093c = i4;
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        this.f2877A.d(motionEvent, C0128a.f2827f);
        return true;
    }

    public void setDelegate(q qVar) {
        this.f2886J = qVar;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        View view = this.f2890p;
        if (view instanceof j) {
            ((j) view).setVisibility(i3);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.lang.Object] */
    @TargetApi(28)
    public void setWindowInfoListenerDisplayFeatures(r1.j jVar) {
        C0760b c0760b;
        int i3;
        ?? r8 = jVar.f9028a;
        ArrayList arrayList = new ArrayList();
        for (C0761c c0761c : r8) {
            c0761c.f9011a.c().toString();
            C0703b c0703b = c0761c.f9011a;
            int b3 = c0703b.b();
            C0760b c0760b2 = C0760b.f9004p;
            if (b3 != 0 && c0703b.a() != 0) {
                c0760b = c0760b2;
            } else {
                c0760b = C0760b.f9003o;
            }
            int i4 = 2;
            if (c0760b == c0760b2) {
                i3 = 3;
            } else {
                i3 = 2;
            }
            C0760b c0760b3 = C0760b.f9005q;
            C0760b c0760b4 = c0761c.f9013c;
            if (c0760b4 != c0760b3) {
                if (c0760b4 == C0760b.f9006r) {
                    i4 = 3;
                } else {
                    i4 = 1;
                }
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.c(c0703b.c(), i3, i4));
        }
        ArrayList arrayList2 = this.f2881E.f6107q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [W1.q, java.lang.Object] */
    public o(d dVar, l lVar) {
        super(dVar, null);
        this.f2892r = new HashSet();
        this.f2895u = new HashSet();
        this.f2881E = new io.flutter.embedding.engine.renderer.k();
        this.f2882F = new C1.j(this, 19);
        this.f2883G = new I.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f2884H = new e(this, 2);
        this.f2886J = new Object();
        this.f2888n = lVar;
        this.f2890p = lVar;
        b();
    }
}
