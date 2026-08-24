package i1;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* renamed from: i1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307f {
    public static final int[] x = {16842919};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f5999y = new int[0];

    /* renamed from: a  reason: collision with root package name */
    public final int f6000a;

    /* renamed from: b  reason: collision with root package name */
    public final StateListDrawable f6001b;

    /* renamed from: c  reason: collision with root package name */
    public final Drawable f6002c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6003d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6004e;

    /* renamed from: f  reason: collision with root package name */
    public final StateListDrawable f6005f;

    /* renamed from: g  reason: collision with root package name */
    public final Drawable f6006g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6007h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6008i;

    /* renamed from: j  reason: collision with root package name */
    public float f6009j;

    /* renamed from: k  reason: collision with root package name */
    public float f6010k;

    /* renamed from: n  reason: collision with root package name */
    public final RecyclerView f6013n;

    /* renamed from: u  reason: collision with root package name */
    public final ValueAnimator f6020u;

    /* renamed from: v  reason: collision with root package name */
    public int f6021v;

    /* renamed from: w  reason: collision with root package name */
    public final H.b f6022w;

    /* renamed from: l  reason: collision with root package name */
    public int f6011l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f6012m = 0;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f6014o = false;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f6015p = false;

    /* renamed from: q  reason: collision with root package name */
    public int f6016q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f6017r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f6018s = new int[2];

    /* renamed from: t  reason: collision with root package name */
    public final int[] f6019t = new int[2];

    public C0307f(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i3, int i4, int i5) {
        boolean z3;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6020u = ofFloat;
        this.f6021v = 0;
        H.b bVar = new H.b(this, 3);
        this.f6022w = bVar;
        Object obj = new Object();
        this.f6001b = stateListDrawable;
        this.f6002c = drawable;
        this.f6005f = stateListDrawable2;
        this.f6006g = drawable2;
        this.f6003d = Math.max(i3, stateListDrawable.getIntrinsicWidth());
        this.f6004e = Math.max(i3, drawable.getIntrinsicWidth());
        this.f6007h = Math.max(i3, stateListDrawable2.getIntrinsicWidth());
        this.f6008i = Math.max(i3, drawable2.getIntrinsicWidth());
        this.f6000a = i5;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0305d(this));
        ofFloat.addUpdateListener(new C0306e(this));
        RecyclerView recyclerView2 = this.f6013n;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                t tVar = recyclerView2.f4481u;
                if (tVar != null) {
                    tVar.a("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList arrayList = recyclerView2.f4482v;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    if (recyclerView2.getOverScrollMode() == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    recyclerView2.setWillNotDraw(z3);
                }
                recyclerView2.m();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f6013n;
                recyclerView3.f4483w.remove(this);
                if (recyclerView3.x == this) {
                    recyclerView3.x = null;
                }
                ArrayList arrayList2 = this.f6013n.f4464k0;
                if (arrayList2 != null) {
                    arrayList2.remove(obj);
                }
                this.f6013n.removeCallbacks(bVar);
            }
            this.f6013n = recyclerView;
            if (recyclerView != null) {
                t tVar2 = recyclerView.f4481u;
                if (tVar2 != null) {
                    tVar2.a("Cannot add item decoration during a scroll  or layout");
                }
                ArrayList arrayList3 = recyclerView.f4482v;
                if (arrayList3.isEmpty()) {
                    recyclerView.setWillNotDraw(false);
                }
                arrayList3.add(this);
                recyclerView.m();
                recyclerView.requestLayout();
                this.f6013n.f4483w.add(this);
                RecyclerView recyclerView4 = this.f6013n;
                if (recyclerView4.f4464k0 == null) {
                    recyclerView4.f4464k0 = new ArrayList();
                }
                recyclerView4.f4464k0.add(obj);
            }
        }
    }

    public static int d(float f3, float f4, int[] iArr, int i3, int i4, int i5) {
        int i6 = iArr[1] - iArr[0];
        if (i6 == 0) {
            return 0;
        }
        int i7 = i3 - i5;
        int i8 = (int) (((f4 - f3) / i6) * i7);
        int i9 = i4 + i8;
        if (i9 >= i7 || i9 < 0) {
            return 0;
        }
        return i8;
    }

    public final boolean a(float f3, float f4) {
        if (f4 >= this.f6012m - this.f6007h && f3 >= 0 - (0 / 2) && f3 <= (0 / 2) + 0) {
            return true;
        }
        return false;
    }

    public final boolean b(float f3, float f4) {
        boolean z3;
        RecyclerView recyclerView = this.f6013n;
        Field field = C.y.f117a;
        if (recyclerView.getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i3 = this.f6003d;
        if (z3) {
            if (f3 > i3 / 2) {
                return false;
            }
        } else if (f3 < this.f6011l - i3) {
            return false;
        }
        int i4 = 0 / 2;
        if (f4 < 0 - i4 || f4 > i4 + 0) {
            return false;
        }
        return true;
    }

    public final boolean c(MotionEvent motionEvent) {
        int i3 = this.f6016q;
        if (i3 == 1) {
            boolean b3 = b(motionEvent.getX(), motionEvent.getY());
            boolean a3 = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b3 && !a3) {
                return false;
            }
            if (a3) {
                this.f6017r = 1;
                this.f6010k = (int) motionEvent.getX();
            } else if (b3) {
                this.f6017r = 2;
                this.f6009j = (int) motionEvent.getY();
            }
            e(2);
        } else if (i3 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i3) {
        H.b bVar = this.f6022w;
        StateListDrawable stateListDrawable = this.f6001b;
        if (i3 == 2 && this.f6016q != 2) {
            stateListDrawable.setState(x);
            this.f6013n.removeCallbacks(bVar);
        }
        if (i3 == 0) {
            this.f6013n.invalidate();
        } else {
            f();
        }
        if (this.f6016q == 2 && i3 != 2) {
            stateListDrawable.setState(f5999y);
            this.f6013n.removeCallbacks(bVar);
            this.f6013n.postDelayed(bVar, 1200);
        } else if (i3 == 1) {
            this.f6013n.removeCallbacks(bVar);
            this.f6013n.postDelayed(bVar, 1500);
        }
        this.f6016q = i3;
    }

    public final void f() {
        int i3 = this.f6021v;
        ValueAnimator valueAnimator = this.f6020u;
        if (i3 != 0) {
            if (i3 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.f6021v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
