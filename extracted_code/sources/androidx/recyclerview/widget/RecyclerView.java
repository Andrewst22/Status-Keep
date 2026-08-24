package androidx.recyclerview.widget;

import B1.e;
import C.AbstractC0016q;
import C.AbstractC0017s;
import C.C;
import C.C0006g;
import C.y;
import D2.i;
import H.b;
import J.c;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.example.flutter_application_1.R;
import e0.C0262c;
import e0.l;
import h1.AbstractC0285a;
import i1.AbstractC0293D;
import i1.AbstractC0301L;
import i1.AbstractC0316o;
import i1.AbstractC0319r;
import i1.C0291B;
import i1.C0292C;
import i1.C0296G;
import i1.C0307f;
import i1.C0308g;
import i1.C0318q;
import i1.InterfaceC0290A;
import i1.InterfaceC0317p;
import i1.RunnableC0294E;
import i1.RunnableC0310i;
import i1.animation.InterpolatorC0315n;
import i1.t;
import i1.u;
import i1.v;
import i1.w;
import i1.x;
import i1.z;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import y.AbstractC0903b;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: t0  reason: collision with root package name */
    public static final int[] f4427t0 = {16843830};

    /* renamed from: u0  reason: collision with root package name */
    public static final int[] f4428u0 = {16842987};

    /* renamed from: v0  reason: collision with root package name */
    public static final boolean f4429v0 = true;

    /* renamed from: w0  reason: collision with root package name */
    public static final Class[] f4430w0;

    /* renamed from: x0  reason: collision with root package name */
    public static final animation.InterpolatorC0315n f4431x0;

    /* renamed from: A  reason: collision with root package name */
    public boolean f4432A;

    /* renamed from: B  reason: collision with root package name */
    public int f4433B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f4434C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f4435D;

    /* renamed from: E  reason: collision with root package name */
    public int f4436E;

    /* renamed from: F  reason: collision with root package name */
    public final AccessibilityManager f4437F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f4438G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f4439H;

    /* renamed from: I  reason: collision with root package name */
    public int f4440I;

    /* renamed from: J  reason: collision with root package name */
    public final int f4441J;

    /* renamed from: K  reason: collision with root package name */
    public C0318q f4442K;
    public EdgeEffect L;

    /* renamed from: M  reason: collision with root package name */
    public EdgeEffect f4443M;

    /* renamed from: N  reason: collision with root package name */
    public EdgeEffect f4444N;

    /* renamed from: O  reason: collision with root package name */
    public EdgeEffect f4445O;

    /* renamed from: P  reason: collision with root package name */
    public AbstractC0319r f4446P;

    /* renamed from: Q  reason: collision with root package name */
    public int f4447Q;

    /* renamed from: R  reason: collision with root package name */
    public int f4448R;

    /* renamed from: S  reason: collision with root package name */
    public VelocityTracker f4449S;

    /* renamed from: T  reason: collision with root package name */
    public int f4450T;

    /* renamed from: U  reason: collision with root package name */
    public int f4451U;

    /* renamed from: V  reason: collision with root package name */
    public int f4452V;

    /* renamed from: W  reason: collision with root package name */
    public int f4453W;

    /* renamed from: a0  reason: collision with root package name */
    public int f4454a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f4455b0;

    /* renamed from: c0  reason: collision with root package name */
    public final int f4456c0;

    /* renamed from: d0  reason: collision with root package name */
    public final float f4457d0;

    /* renamed from: e0  reason: collision with root package name */
    public final float f4458e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f4459f0;

    /* renamed from: g0  reason: collision with root package name */
    public final RunnableC0294E f4460g0;

    /* renamed from: h0  reason: collision with root package name */
    public RunnableC0310i f4461h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C0308g f4462i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C0292C f4463j0;

    /* renamed from: k0  reason: collision with root package name */
    public ArrayList f4464k0;

    /* renamed from: l0  reason: collision with root package name */
    public final l f4465l0;

    /* renamed from: m  reason: collision with root package name */
    public final z f4466m;

    /* renamed from: m0  reason: collision with root package name */
    public C0296G f4467m0;

    /* renamed from: n  reason: collision with root package name */
    public C0291B f4468n;

    /* renamed from: n0  reason: collision with root package name */
    public C0006g f4469n0;

    /* renamed from: o  reason: collision with root package name */
    public final e f4470o;

    /* renamed from: o0  reason: collision with root package name */
    public final int[] f4471o0;

    /* renamed from: p  reason: collision with root package name */
    public final e f4472p;

    /* renamed from: p0  reason: collision with root package name */
    public final int[] f4473p0;

    /* renamed from: q  reason: collision with root package name */
    public final l f4474q;

    /* renamed from: q0  reason: collision with root package name */
    public final int[] f4475q0;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4476r;

    /* renamed from: r0  reason: collision with root package name */
    public final ArrayList f4477r0;

    /* renamed from: s  reason: collision with root package name */
    public final Rect f4478s;

    /* renamed from: s0  reason: collision with root package name */
    public final b f4479s0;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f4480t;

    /* renamed from: u  reason: collision with root package name */
    public t f4481u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f4482v;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f4483w;
    public C0307f x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4484y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4485z;

    /* JADX WARN: Type inference failed for: r0v2, types: [i1.n, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        f4430w0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f4431x0 = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, i1.q] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, i1.r, i1.b] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, i1.C] */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C0308g c0308g;
        float a3;
        float a4;
        boolean z3;
        int i3;
        TypedArray typedArray;
        char c3;
        char c4;
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        this.f4466m = new z(this);
        this.f4474q = new l();
        this.f4478s = new Rect();
        this.f4480t = new Rect();
        new RectF();
        this.f4482v = new ArrayList();
        this.f4483w = new ArrayList();
        this.f4433B = 0;
        this.f4438G = false;
        this.f4439H = false;
        this.f4440I = 0;
        this.f4441J = 0;
        this.f4442K = new Object();
        ?? obj = new Object();
        obj.f6046a = null;
        obj.f6047b = new ArrayList();
        obj.f6048c = 250L;
        obj.f6049d = 250L;
        obj.f5985e = new ArrayList();
        obj.f5986f = new ArrayList();
        obj.f5987g = new ArrayList();
        obj.f5988h = new ArrayList();
        obj.f5989i = new ArrayList();
        obj.f5990j = new ArrayList();
        obj.f5991k = new ArrayList();
        obj.f5992l = new ArrayList();
        obj.f5993m = new ArrayList();
        obj.f5994n = new ArrayList();
        obj.f5995o = new ArrayList();
        this.f4446P = obj;
        this.f4447Q = 0;
        this.f4448R = -1;
        this.f4457d0 = Float.MIN_VALUE;
        this.f4458e0 = Float.MIN_VALUE;
        boolean z4 = true;
        this.f4459f0 = true;
        this.f4460g0 = new RunnableC0294E(this);
        if (f4429v0) {
            c0308g = new Object();
        } else {
            c0308g = null;
        }
        this.f4462i0 = c0308g;
        ?? obj2 = new Object();
        obj2.f5955a = 0;
        obj2.f5956b = false;
        obj2.f5957c = false;
        obj2.f5958d = false;
        obj2.f5959e = false;
        this.f4463j0 = obj2;
        l lVar = new l(16);
        this.f4465l0 = lVar;
        this.f4471o0 = new int[2];
        this.f4473p0 = new int[2];
        this.f4475q0 = new int[2];
        this.f4477r0 = new ArrayList();
        this.f4479s0 = new b(this, 4);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4428u0, 0, 0);
            this.f4476r = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f4476r = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4454a0 = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = C.f59a;
            a3 = C.z.a(viewConfiguration);
        } else {
            a3 = C.a(viewConfiguration, context);
        }
        this.f4457d0 = a3;
        if (i4 >= 26) {
            a4 = C.z.b(viewConfiguration);
        } else {
            a4 = C.a(viewConfiguration, context);
        }
        this.f4458e0 = a4;
        this.f4455b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4456c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        setWillNotDraw(z3);
        this.f4446P.f6046a = lVar;
        this.f4470o = new e(new l(this, 15));
        this.f4472p = new e(new C0262c(this, 25));
        Field field = y.f117a;
        if (i4 >= 26) {
            i3 = AbstractC0017s.c(this);
        } else {
            i3 = 0;
        }
        if (i3 == 0 && i4 >= 26) {
            AbstractC0017s.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f4437F = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0296G(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0285a.f5940a, 0, 0);
            String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (obtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                    Resources resources = getContext().getResources();
                    c3 = 3;
                    typedArray = obtainStyledAttributes2;
                    c4 = 2;
                    new C0307f(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
                } else {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + h());
                }
            } else {
                typedArray = obtainStyledAttributes2;
                c3 = 3;
                c4 = 2;
            }
            typedArray.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        trim = context.getPackageName() + trim;
                    } else if (!trim.contains(".")) {
                        trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        Class<? extends U> asSubclass = classLoader.loadClass(trim).asSubclass(t.class);
                        try {
                            constructor = asSubclass.getConstructor(f4430w0);
                            Object[] objArr2 = new Object[4];
                            objArr2[0] = context;
                            objArr2[1] = attributeSet;
                            objArr2[c4] = 0;
                            objArr2[c3] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e2) {
                            try {
                                objArr = null;
                                constructor = asSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e3) {
                                e3.initCause(e2);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e3);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((t) constructor.newInstance(objArr));
                    } catch (ClassCastException e4) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e4);
                    } catch (ClassNotFoundException e5) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e5);
                    } catch (IllegalAccessException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e6);
                    } catch (InstantiationException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e7);
                    } catch (InvocationTargetException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e8);
                    }
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f4427t0, 0, 0);
            z4 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z4);
    }

    private C0006g getScrollingChildHelper() {
        if (this.f4469n0 == null) {
            this.f4469n0 = new C0006g(this);
        }
        return this.f4469n0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((u) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i3, int i4) {
        t tVar = this.f4481u;
        if (tVar != null) {
            tVar.getClass();
        }
        super.addFocusables(arrayList, i3, i4);
    }

    public final void b(String str) {
        if (this.f4440I > 0) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
            }
            throw new IllegalStateException(str);
        } else if (this.f4441J > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i3, int i4) {
        boolean z3;
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect != null && !edgeEffect.isFinished() && i3 > 0) {
            this.L.onRelease();
            z3 = this.L.isFinished();
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f4444N;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i3 < 0) {
            this.f4444N.onRelease();
            z3 |= this.f4444N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4443M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.f4443M.onRelease();
            z3 |= this.f4443M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4445O;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.f4445O.onRelease();
            z3 |= this.f4445O.isFinished();
        }
        if (z3) {
            Field field = y.f117a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof u) && this.f4481u.d((u) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        t tVar = this.f4481u;
        if (tVar == null || !tVar.b()) {
            return 0;
        }
        return this.f4481u.f(this.f4463j0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        t tVar = this.f4481u;
        if (tVar != null && tVar.b()) {
            this.f4481u.g(this.f4463j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        t tVar = this.f4481u;
        if (tVar == null || !tVar.b()) {
            return 0;
        }
        return this.f4481u.h(this.f4463j0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        t tVar = this.f4481u;
        if (tVar == null || !tVar.c()) {
            return 0;
        }
        return this.f4481u.i(this.f4463j0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        t tVar = this.f4481u;
        if (tVar != null && tVar.c()) {
            this.f4481u.j(this.f4463j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        t tVar = this.f4481u;
        if (tVar == null || !tVar.c()) {
            return 0;
        }
        return this.f4481u.k(this.f4463j0);
    }

    public final void d() {
        e eVar = this.f4470o;
        if (this.f4432A && !this.f4438G) {
            if (((ArrayList) eVar.f57o).size() > 0) {
                eVar.getClass();
                if (((ArrayList) eVar.f57o).size() > 0) {
                    int i3 = AbstractC0903b.f9700a;
                    Trace.beginSection("RV FullInvalidate");
                    Log.e("RecyclerView", "No adapter attached; skipping layout");
                    Trace.endSection();
                    return;
                }
                return;
            }
            return;
        }
        int i4 = AbstractC0903b.f9700a;
        Trace.beginSection("RV FullInvalidate");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f4, boolean z3) {
        return getScrollingChildHelper().a(f3, f4, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f4) {
        return getScrollingChildHelper().b(f3, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return getScrollingChildHelper().d(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        boolean z6 = true;
        super.draw(canvas);
        ArrayList arrayList = this.f4482v;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C0307f c0307f = (C0307f) arrayList.get(i5);
            if (c0307f.f6011l == c0307f.f6013n.getWidth() && c0307f.f6012m == c0307f.f6013n.getHeight()) {
                if (c0307f.f6021v != 0) {
                    if (c0307f.f6014o) {
                        int i6 = c0307f.f6011l;
                        int i7 = c0307f.f6003d;
                        int i8 = i6 - i7;
                        int i9 = 0 - (0 / 2);
                        StateListDrawable stateListDrawable = c0307f.f6001b;
                        stateListDrawable.setBounds(0, 0, i7, 0);
                        int i10 = c0307f.f6012m;
                        Drawable drawable = c0307f.f6002c;
                        drawable.setBounds(0, 0, c0307f.f6004e, i10);
                        RecyclerView recyclerView = c0307f.f6013n;
                        Field field = y.f117a;
                        if (recyclerView.getLayoutDirection() == 1) {
                            drawable.draw(canvas);
                            canvas.translate(i7, i9);
                            canvas.scale(-1.0f, 1.0f);
                            stateListDrawable.draw(canvas);
                            canvas.scale(1.0f, 1.0f);
                            canvas.translate(-i7, -i9);
                        } else {
                            canvas.translate(i8, 0.0f);
                            drawable.draw(canvas);
                            canvas.translate(0.0f, i9);
                            stateListDrawable.draw(canvas);
                            canvas.translate(-i8, -i9);
                        }
                    }
                    if (c0307f.f6015p) {
                        int i11 = c0307f.f6012m;
                        int i12 = c0307f.f6007h;
                        int i13 = i11 - i12;
                        int i14 = 0 - (0 / 2);
                        StateListDrawable stateListDrawable2 = c0307f.f6005f;
                        stateListDrawable2.setBounds(0, 0, 0, i12);
                        int i15 = c0307f.f6011l;
                        Drawable drawable2 = c0307f.f6006g;
                        drawable2.setBounds(0, 0, i15, c0307f.f6008i);
                        canvas.translate(0.0f, i13);
                        drawable2.draw(canvas);
                        canvas.translate(i14, 0.0f);
                        stateListDrawable2.draw(canvas);
                        canvas.translate(-i14, -i13);
                    }
                }
            } else {
                c0307f.f6011l = c0307f.f6013n.getWidth();
                c0307f.f6012m = c0307f.f6013n.getHeight();
                c0307f.e(0);
            }
        }
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f4476r) {
                i4 = getPaddingBottom();
            } else {
                i4 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i4, 0.0f);
            EdgeEffect edgeEffect2 = this.L;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect3 = this.f4443M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f4476r) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4443M;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z5 = true;
            } else {
                z5 = false;
            }
            z3 |= z5;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f4444N;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f4476r) {
                i3 = getPaddingTop();
            } else {
                i3 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(-i3, -width);
            EdgeEffect edgeEffect6 = this.f4444N;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z4 = true;
            } else {
                z4 = false;
            }
            z3 |= z4;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f4445O;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4476r) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f4445O;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z7 = true;
            }
            z3 |= z7;
            canvas.restoreToCount(save4);
        }
        if (z3 || this.f4446P == null || arrayList.size() <= 0 || !this.f4446P.b()) {
            z6 = z3;
        }
        if (z6) {
            Field field2 = y.f117a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(int i3, int i4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = y.f117a;
        setMeasuredDimension(t.e(i3, paddingRight, getMinimumWidth()), t.e(i4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i4, i5, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i3) {
        int i4;
        int i5;
        this.f4481u.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i3);
        if (findNextFocus != null && !findNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i3);
            }
            o(findNextFocus, null);
            return view;
        }
        if (findNextFocus != null && findNextFocus != this && i(findNextFocus) != null) {
            if (view != null && i(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f4478s;
                char c3 = 0;
                rect.set(0, 0, width, height);
                int width2 = findNextFocus.getWidth();
                int height2 = findNextFocus.getHeight();
                Rect rect2 = this.f4480t;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(findNextFocus, rect2);
                RecyclerView recyclerView = this.f4481u.f6053b;
                Field field = y.f117a;
                if (recyclerView.getLayoutDirection() == 1) {
                    i4 = -1;
                } else {
                    i4 = 1;
                }
                int i6 = rect.left;
                int i7 = rect2.left;
                if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                    i5 = 1;
                } else {
                    int i8 = rect.right;
                    int i9 = rect2.right;
                    if ((i8 > i9 || i6 >= i9) && i6 > i7) {
                        i5 = -1;
                    } else {
                        i5 = 0;
                    }
                }
                int i10 = rect.top;
                int i11 = rect2.top;
                if ((i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom) {
                    c3 = 1;
                } else {
                    int i12 = rect.bottom;
                    int i13 = rect2.bottom;
                    if ((i12 > i13 || i10 >= i13) && i10 > i11) {
                        c3 = 65535;
                    }
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 17) {
                            if (i3 != 33) {
                                if (i3 != 66) {
                                    if (i3 == 130) {
                                        if (c3 > 0) {
                                            return findNextFocus;
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Invalid direction: " + i3 + h());
                                    }
                                } else if (i5 > 0) {
                                    return findNextFocus;
                                }
                            } else if (c3 < 0) {
                                return findNextFocus;
                            }
                        } else if (i5 < 0) {
                            return findNextFocus;
                        }
                    } else if (c3 <= 0) {
                        if (c3 == 0 && i5 * i4 >= 0) {
                            return findNextFocus;
                        }
                    } else {
                        return findNextFocus;
                    }
                } else if (c3 >= 0) {
                    if (c3 == 0 && i5 * i4 <= 0) {
                        return findNextFocus;
                    }
                } else {
                    return findNextFocus;
                }
            } else {
                return findNextFocus;
            }
        }
        return super.focusSearch(view, i3);
    }

    public final boolean g(int[] iArr, int i3) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i3, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        t tVar = this.f4481u;
        if (tVar != null) {
            return tVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        t tVar = this.f4481u;
        if (tVar != null) {
            return tVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public AbstractC0316o getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        t tVar = this.f4481u;
        if (tVar != null) {
            tVar.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i3, int i4) {
        return super.getChildDrawingOrder(i3, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4476r;
    }

    public C0296G getCompatAccessibilityDelegate() {
        return this.f4467m0;
    }

    public C0318q getEdgeEffectFactory() {
        return this.f4442K;
    }

    public AbstractC0319r getItemAnimator() {
        return this.f4446P;
    }

    public int getItemDecorationCount() {
        return this.f4482v.size();
    }

    public t getLayoutManager() {
        return this.f4481u;
    }

    public int getMaxFlingVelocity() {
        return this.f4456c0;
    }

    public int getMinFlingVelocity() {
        return this.f4455b0;
    }

    public long getNanoTime() {
        if (f4429v0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public v getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4459f0;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [i1.y, java.lang.Object] */
    public i1.y getRecycledViewPool() {
        z zVar = this.f4466m;
        if (((i1.y) zVar.f6067e) == null) {
            ?? obj = new Object();
            obj.f6061a = new SparseArray();
            obj.f6062b = 0;
            zVar.f6067e = obj;
        }
        return (i1.y) zVar.f6067e;
    }

    public int getScrollState() {
        return this.f4447Q;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f4481u + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View i(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.i(android.view.View):android.view.View");
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f4484y;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f104d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        if (this.f4432A && !this.f4438G && ((ArrayList) this.f4470o.f57o).size() <= 0) {
            return false;
        }
        return true;
    }

    public final void m() {
        int e02 = this.f4472p.e0();
        for (int i3 = 0; i3 < e02; i3++) {
            ((u) this.f4472p.d0(i3).getLayoutParams()).f6060b = true;
        }
        ArrayList arrayList = (ArrayList) this.f4466m.f6066d;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void n(MotionEvent motionEvent) {
        int i3;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4448R) {
            if (actionIndex == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            this.f4448R = motionEvent.getPointerId(i3);
            int x = (int) (motionEvent.getX(i3) + 0.5f);
            this.f4452V = x;
            this.f4450T = x;
            int y3 = (int) (motionEvent.getY(i3) + 0.5f);
            this.f4453W = y3;
            this.f4451U = y3;
        }
    }

    public final void o(View view, View view2) {
        View view3;
        boolean z3;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f4478s;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof u) {
            u uVar = (u) layoutParams;
            if (!uVar.f6060b) {
                int i3 = rect.left;
                Rect rect2 = uVar.f6059a;
                rect.left = i3 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        t tVar = this.f4481u;
        boolean z4 = !this.f4432A;
        if (view2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        tVar.G(this, view, this.f4478s, z4, z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r1 >= 30.0f) goto L18;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [i1.i, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f4440I = r0
            r1 = 1
            r5.f4484y = r1
            boolean r2 = r5.f4432A
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            r0 = 1
        L14:
            r5.f4432A = r0
            i1.t r0 = r5.f4481u
            if (r0 == 0) goto L1c
            r0.f6056e = r1
        L1c:
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f4429v0
            if (r0 == 0) goto L6f
            java.lang.ThreadLocal r0 = i1.RunnableC0310i.f6031q
            java.lang.Object r1 = r0.get()
            i1.i r1 = (i1.RunnableC0310i) r1
            r5.f4461h0 = r1
            if (r1 != 0) goto L68
            i1.i r1 = new i1.i
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f6033m = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f6036p = r2
            r5.f4461h0 = r1
            java.lang.reflect.Field r1 = C.y.f117a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5a
            if (r1 == 0) goto L5a
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5a
            goto L5c
        L5a:
            r1 = 1114636288(0x42700000, float:60.0)
        L5c:
            i1.i r2 = r5.f4461h0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f6035o = r3
            r0.set(r2)
        L68:
            i1.i r0 = r5.f4461h0
            java.util.ArrayList r0 = r0.f6033m
            r0.add(r5)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        RunnableC0310i runnableC0310i;
        super.onDetachedFromWindow();
        AbstractC0319r abstractC0319r = this.f4446P;
        if (abstractC0319r != null) {
            abstractC0319r.a();
        }
        setScrollState(0);
        RunnableC0294E runnableC0294E = this.f4460g0;
        runnableC0294E.f5966s.removeCallbacks(runnableC0294E);
        runnableC0294E.f5962o.abortAnimation();
        this.f4484y = false;
        t tVar = this.f4481u;
        if (tVar != null) {
            tVar.f6056e = false;
            tVar.z(this);
        }
        this.f4477r0.clear();
        removeCallbacks(this.f4479s0);
        this.f4474q.getClass();
        do {
            B.b bVar = AbstractC0301L.f5984a;
            int i3 = bVar.f22m;
            obj = null;
            if (i3 > 0) {
                int i4 = i3 - 1;
                Object[] objArr = (Object[]) bVar.f23n;
                Object obj2 = objArr[i4];
                i.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i4] = null;
                bVar.f22m--;
                obj = obj2;
                continue;
            }
        } while (obj != null);
        if (f4429v0 && (runnableC0310i = this.f4461h0) != null) {
            runnableC0310i.f6033m.remove(this);
            this.f4461h0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f4482v;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0307f) arrayList.get(i3)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            i1.t r0 = r5.f4481u
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f4434C
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L79
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            i1.t r0 = r5.f4481u
            boolean r0 = r0.c()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            i1.t r3 = r5.f4481u
            boolean r3 = r3.b()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = 0
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            i1.t r3 = r5.f4481u
            boolean r3 = r3.c()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            i1.t r3 = r5.f4481u
            boolean r3 = r3.b()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = 0
            goto L64
        L62:
            r0 = 0
            goto L3c
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
        L6c:
            float r2 = r5.f4457d0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f4458e0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.q(r2, r0, r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (this.f4434C) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.x = null;
        }
        ArrayList arrayList = this.f4483w;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0307f c0307f = (C0307f) arrayList.get(i3);
            if (c0307f.c(motionEvent) && action != 3) {
                this.x = c0307f;
                p();
                setScrollState(0);
                return true;
            }
        }
        t tVar = this.f4481u;
        if (tVar == null) {
            return false;
        }
        boolean b3 = tVar.b();
        boolean c3 = this.f4481u.c();
        if (this.f4449S == null) {
            this.f4449S = VelocityTracker.obtain();
        }
        this.f4449S.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                n(motionEvent);
                            }
                        } else {
                            this.f4448R = motionEvent.getPointerId(actionIndex);
                            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f4452V = x;
                            this.f4450T = x;
                            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f4453W = y3;
                            this.f4451U = y3;
                        }
                    } else {
                        p();
                        setScrollState(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f4448R);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4448R + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f4447Q != 1) {
                        int i4 = x3 - this.f4450T;
                        int i5 = y4 - this.f4451U;
                        if (b3 && Math.abs(i4) > this.f4454a0) {
                            this.f4452V = x3;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (c3 && Math.abs(i5) > this.f4454a0) {
                            this.f4453W = y4;
                            z3 = true;
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.f4449S.clear();
                s(0);
            }
        } else {
            if (this.f4435D) {
                this.f4435D = false;
            }
            this.f4448R = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.f4452V = x4;
            this.f4450T = x4;
            int y5 = (int) (motionEvent.getY() + 0.5f);
            this.f4453W = y5;
            this.f4451U = y5;
            if (this.f4447Q == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f4475q0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i6 = b3;
            if (c3) {
                i6 = (b3 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i6, 0);
        }
        if (this.f4447Q != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7 = AbstractC0903b.f9700a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f4432A = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        t tVar = this.f4481u;
        if (tVar == null) {
            e(i3, i4);
        } else if (tVar.y()) {
            View.MeasureSpec.getMode(i3);
            View.MeasureSpec.getMode(i4);
            this.f4481u.f6053b.e(i3, i4);
        } else if (this.f4485z) {
            this.f4481u.f6053b.e(i3, i4);
        } else {
            C0292C c0292c = this.f4463j0;
            if (c0292c.f5959e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            c0292c.getClass();
            this.f4433B++;
            this.f4481u.f6053b.e(i3, i4);
            if (this.f4433B < 1) {
                this.f4433B = 1;
            }
            this.f4433B--;
            c0292c.f5957c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (this.f4440I > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i3, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0291B)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0291B c0291b = (C0291B) parcelable;
        this.f4468n = c0291b;
        super.onRestoreInstanceState(c0291b.f482m);
        t tVar = this.f4481u;
        if (tVar != null && (parcelable2 = this.f4468n.f5954o) != null) {
            tVar.B(parcelable2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, i1.B, J.c] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? cVar = new c(super.onSaveInstanceState());
        C0291B c0291b = this.f4468n;
        if (c0291b != null) {
            cVar.f5954o = c0291b.f5954o;
        } else {
            t tVar = this.f4481u;
            if (tVar != null) {
                cVar.f5954o = tVar.C();
            } else {
                cVar.f5954o = null;
            }
        }
        return cVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        if (i3 != i5 || i4 != i6) {
            this.f4445O = null;
            this.f4443M = null;
            this.f4444N = null;
            this.L = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f4449S;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z3 = false;
        s(0);
        EdgeEffect edgeEffect = this.L;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = this.L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4443M;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 |= this.f4443M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4444N;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 |= this.f4444N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4445O;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 |= this.f4445O.isFinished();
        }
        if (z3) {
            Field field = y.f117a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(int r11, int r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q(int, int, android.view.MotionEvent):void");
    }

    public final void r(int i3, int i4) {
        int i5;
        int i6;
        boolean z3;
        int height;
        int i7;
        t tVar = this.f4481u;
        if (tVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f4434C) {
            if (!tVar.b()) {
                i5 = 0;
            } else {
                i5 = i3;
            }
            if (!this.f4481u.c()) {
                i6 = 0;
            } else {
                i6 = i4;
            }
            if (i5 != 0 || i6 != 0) {
                RunnableC0294E runnableC0294E = this.f4460g0;
                runnableC0294E.getClass();
                int abs = Math.abs(i5);
                int abs2 = Math.abs(i6);
                if (abs > abs2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int sqrt = (int) Math.sqrt(0);
                int sqrt2 = (int) Math.sqrt((i6 * i6) + (i5 * i5));
                RecyclerView recyclerView = runnableC0294E.f5966s;
                if (z3) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                int i8 = height / 2;
                float f3 = height;
                float f4 = i8;
                float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f3) - 0.5f) * 0.47123894f)) * f4) + f4;
                if (sqrt > 0) {
                    i7 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
                } else {
                    if (!z3) {
                        abs = abs2;
                    }
                    i7 = (int) (((abs / f3) + 1.0f) * 300.0f);
                }
                int min = Math.min(i7, 2000);
                Interpolator interpolator = runnableC0294E.f5963p;
                animation.InterpolatorC0315n animation_interpolatorc0315n = f4431x0;
                if (interpolator != animation_interpolatorc0315n) {
                    runnableC0294E.f5963p = animation_interpolatorc0315n;
                    runnableC0294E.f5962o = new OverScroller(recyclerView.getContext(), animation_interpolatorc0315n);
                }
                recyclerView.setScrollState(2);
                runnableC0294E.f5961n = 0;
                runnableC0294E.f5960m = 0;
                runnableC0294E.f5962o.startScroll(0, 0, i5, i6, min);
                if (Build.VERSION.SDK_INT < 23) {
                    runnableC0294E.f5962o.computeScrollOffset();
                }
                runnableC0294E.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z3) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f4481u.getClass();
        if (this.f4440I <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f4481u.G(this, view, rect, z3, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        ArrayList arrayList = this.f4483w;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0307f) arrayList.get(i3)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f4433B == 0 && !this.f4434C) {
            super.requestLayout();
        }
    }

    public final void s(int i3) {
        getScrollingChildHelper().h(i3);
    }

    @Override // android.view.View
    public final void scrollBy(int i3, int i4) {
        t tVar = this.f4481u;
        if (tVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f4434C) {
        } else {
            boolean b3 = tVar.b();
            boolean c3 = this.f4481u.c();
            if (b3 || c3) {
                if (!b3) {
                    i3 = 0;
                }
                if (!c3) {
                    i4 = 0;
                }
                q(i3, i4, null);
            }
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i3;
        if (this.f4440I > 0) {
            int i4 = 0;
            if (accessibilityEvent != null) {
                i3 = accessibilityEvent.getContentChangeTypes();
            } else {
                i3 = 0;
            }
            if (i3 != 0) {
                i4 = i3;
            }
            this.f4436E |= i4;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0296G c0296g) {
        this.f4467m0 = c0296g;
        y.a(this, c0296g);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [i1.y, java.lang.Object] */
    public void setAdapter(AbstractC0316o abstractC0316o) {
        setLayoutFrozen(false);
        AbstractC0319r abstractC0319r = this.f4446P;
        if (abstractC0319r != null) {
            abstractC0319r.a();
        }
        t tVar = this.f4481u;
        z zVar = this.f4466m;
        if (tVar != null) {
            tVar.E();
            this.f4481u.F(zVar);
        }
        ((ArrayList) zVar.f6065c).clear();
        zVar.c();
        e eVar = this.f4470o;
        eVar.s0((ArrayList) eVar.f57o);
        eVar.s0((ArrayList) eVar.f58p);
        ((ArrayList) zVar.f6065c).clear();
        zVar.c();
        if (((i1.y) zVar.f6067e) == null) {
            ?? obj = new Object();
            obj.f6061a = new SparseArray();
            obj.f6062b = 0;
            zVar.f6067e = obj;
        }
        i1.y yVar = (i1.y) zVar.f6067e;
        if (yVar.f6062b == 0) {
            SparseArray sparseArray = yVar.f6061a;
            if (sparseArray.size() > 0) {
                ((x) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f4463j0.f5956b = true;
        this.f4439H = this.f4439H;
        this.f4438G = true;
        int e02 = this.f4472p.e0();
        for (int i3 = 0; i3 < e02; i3++) {
            j(this.f4472p.d0(i3));
        }
        m();
        ArrayList arrayList = (ArrayList) zVar.f6066d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (arrayList.get(i4) != null) {
                throw new ClassCastException();
            }
        }
        ((RecyclerView) zVar.f6068f).getClass();
        zVar.c();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0317p interfaceC0317p) {
        if (interfaceC0317p == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.f4476r) {
            this.f4445O = null;
            this.f4443M = null;
            this.f4444N = null;
            this.L = null;
        }
        this.f4476r = z3;
        super.setClipToPadding(z3);
        if (this.f4432A) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0318q c0318q) {
        c0318q.getClass();
        this.f4442K = c0318q;
        this.f4445O = null;
        this.f4443M = null;
        this.f4444N = null;
        this.L = null;
    }

    public void setHasFixedSize(boolean z3) {
        this.f4485z = z3;
    }

    public void setItemAnimator(AbstractC0319r abstractC0319r) {
        AbstractC0319r abstractC0319r2 = this.f4446P;
        if (abstractC0319r2 != null) {
            abstractC0319r2.a();
            this.f4446P.f6046a = null;
        }
        this.f4446P = abstractC0319r;
        if (abstractC0319r != null) {
            abstractC0319r.f6046a = this.f4465l0;
        }
    }

    public void setItemViewCacheSize(int i3) {
        z zVar = this.f4466m;
        zVar.f6063a = i3;
        zVar.e();
    }

    public void setLayoutFrozen(boolean z3) {
        if (z3 != this.f4434C) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z3) {
                this.f4434C = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4434C = true;
            this.f4435D = true;
            setScrollState(0);
            RunnableC0294E runnableC0294E = this.f4460g0;
            runnableC0294E.f5966s.removeCallbacks(runnableC0294E);
            runnableC0294E.f5962o.abortAnimation();
        }
    }

    public void setLayoutManager(t tVar) {
        C0262c c0262c;
        if (tVar == this.f4481u) {
            return;
        }
        setScrollState(0);
        RunnableC0294E runnableC0294E = this.f4460g0;
        runnableC0294E.f5966s.removeCallbacks(runnableC0294E);
        runnableC0294E.f5962o.abortAnimation();
        t tVar2 = this.f4481u;
        z zVar = this.f4466m;
        if (tVar2 != null) {
            AbstractC0319r abstractC0319r = this.f4446P;
            if (abstractC0319r != null) {
                abstractC0319r.a();
            }
            this.f4481u.E();
            this.f4481u.F(zVar);
            ((ArrayList) zVar.f6065c).clear();
            zVar.c();
            if (this.f4484y) {
                t tVar3 = this.f4481u;
                tVar3.f6056e = false;
                tVar3.z(this);
            }
            this.f4481u.I(null);
            this.f4481u = null;
        } else {
            ((ArrayList) zVar.f6065c).clear();
            zVar.c();
        }
        e eVar = this.f4472p;
        ((E0.c) eVar.f57o).G();
        ArrayList arrayList = (ArrayList) eVar.f58p;
        int size = arrayList.size() - 1;
        while (true) {
            c0262c = (C0262c) eVar.f56n;
            if (size < 0) {
                break;
            }
            j((View) arrayList.get(size));
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView = (RecyclerView) c0262c.f5225n;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f4481u = tVar;
        if (tVar != null) {
            if (tVar.f6053b == null) {
                tVar.I(this);
                if (this.f4484y) {
                    this.f4481u.f6056e = true;
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + tVar + " is already attached to a RecyclerView:" + tVar.f6053b.h());
            }
        }
        zVar.e();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        C0006g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f104d) {
            Field field = y.f117a;
            AbstractC0016q.z(scrollingChildHelper.f103c);
        }
        scrollingChildHelper.f104d = z3;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f4459f0 = z3;
    }

    public void setRecycledViewPool(i1.y yVar) {
        i1.y yVar2;
        z zVar = this.f4466m;
        if (((i1.y) zVar.f6067e) != null) {
            yVar2.f6062b--;
        }
        zVar.f6067e = yVar;
        if (yVar != null) {
            ((RecyclerView) zVar.f6068f).getAdapter();
        }
    }

    public void setScrollState(int i3) {
        if (i3 == this.f4447Q) {
            return;
        }
        this.f4447Q = i3;
        if (i3 != 2) {
            RunnableC0294E runnableC0294E = this.f4460g0;
            runnableC0294E.f5966s.removeCallbacks(runnableC0294E);
            runnableC0294E.f5962o.abortAnimation();
        }
        t tVar = this.f4481u;
        if (tVar != null) {
            tVar.D(i3);
        }
        ArrayList arrayList = this.f4464k0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((w) this.f4464k0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i3 != 0) {
            if (i3 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i3 + "; using default value");
            } else {
                this.f4454a0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f4454a0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0293D abstractC0293D) {
        this.f4466m.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return getScrollingChildHelper().g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        t tVar = this.f4481u;
        if (tVar != null) {
            return tVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(v vVar) {
    }

    @Deprecated
    public void setOnScrollListener(w wVar) {
    }

    public void setRecyclerListener(InterfaceC0290A interfaceC0290A) {
    }
}
