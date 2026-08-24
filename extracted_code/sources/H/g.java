package H;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import l.A;
/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: r  reason: collision with root package name */
    public static final int f404r = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    public final a f405a;

    /* renamed from: b  reason: collision with root package name */
    public final AccelerateInterpolator f406b;

    /* renamed from: c  reason: collision with root package name */
    public final ListView f407c;

    /* renamed from: d  reason: collision with root package name */
    public b f408d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f409e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f410f;

    /* renamed from: g  reason: collision with root package name */
    public final int f411g;

    /* renamed from: h  reason: collision with root package name */
    public final int f412h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f413i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f414j;

    /* renamed from: k  reason: collision with root package name */
    public final float[] f415k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f416l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f417m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f418n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f419o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f420p;

    /* renamed from: q  reason: collision with root package name */
    public final A f421q;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, H.a] */
    public g(A a3) {
        ?? obj = new Object();
        obj.f396e = Long.MIN_VALUE;
        obj.f398g = -1L;
        obj.f397f = 0L;
        this.f405a = obj;
        this.f406b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f409e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f410f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f413i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f414j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f415k = fArr5;
        this.f407c = a3;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f4 = ((int) ((1575.0f * f3) + 0.5f)) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f5 = ((int) ((f3 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f5;
        fArr4[1] = f5;
        this.f411g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f412h = f404r;
        obj.f392a = 500;
        obj.f393b = 500;
        this.f421q = a3;
    }

    public static float b(float f3, float f4, float f5) {
        if (f3 > f5) {
            return f5;
        }
        if (f3 < f4) {
            return f4;
        }
        return f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f409e
            r0 = r0[r4]
            float[] r1 = r3.f410f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            android.view.animation.AccelerateInterpolator r6 = r3.f406b
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L26
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L2e
        L26:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L37
            float r5 = r6.getInterpolation(r5)
        L2e:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L38
        L37:
            r5 = 0
        L38:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3d
            return r2
        L3d:
            float[] r0 = r3.f413i
            r0 = r0[r4]
            float[] r1 = r3.f414j
            r1 = r1[r4]
            float[] r2 = r3.f415k
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L54
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L54:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: H.g.a(int, float, float, float):float");
    }

    public final float c(float f3, float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        int i3 = this.f411g;
        if (i3 != 0 && i3 != 1) {
            if (i3 == 2 && f3 < 0.0f) {
                return f3 / (-f4);
            }
        } else if (f3 < f4) {
            if (f3 >= 0.0f) {
                return 1.0f - (f3 / f4);
            }
            if (this.f419o && i3 == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i3 = 0;
        if (this.f417m) {
            this.f419o = false;
            return;
        }
        a aVar = this.f405a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i4 = (int) (currentAnimationTimeMillis - aVar.f396e);
        int i5 = aVar.f393b;
        if (i4 > i5) {
            i3 = i5;
        } else if (i4 >= 0) {
            i3 = i4;
        }
        aVar.f400i = i3;
        aVar.f399h = aVar.a(currentAnimationTimeMillis);
        aVar.f398g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        A a3;
        int count;
        a aVar = this.f405a;
        float f3 = aVar.f395d;
        int abs = (int) (f3 / Math.abs(f3));
        Math.abs(aVar.f394c);
        if (abs == 0 || (count = (a3 = this.f421q).getCount()) == 0) {
            return false;
        }
        int childCount = a3.getChildCount();
        int firstVisiblePosition = a3.getFirstVisiblePosition();
        int i3 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i3 >= count && a3.getChildAt(childCount - 1).getBottom() <= a3.getHeight()) {
                return false;
            }
        } else if (abs >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && a3.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f420p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7b
        L16:
            r7.d()
            goto L7b
        L1a:
            r7.f418n = r2
            r7.f416l = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f407c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            H.a r9 = r7.f405a
            r9.f394c = r0
            r9.f395d = r8
            boolean r8 = r7.f419o
            if (r8 != 0) goto L7b
            boolean r8 = r7.e()
            if (r8 == 0) goto L7b
            H.b r8 = r7.f408d
            if (r8 != 0) goto L5f
            H.b r8 = new H.b
            r8.<init>(r7, r1)
            r7.f408d = r8
        L5f:
            r7.f419o = r2
            r7.f417m = r2
            boolean r8 = r7.f416l
            if (r8 != 0) goto L74
            int r8 = r7.f412h
            if (r8 <= 0) goto L74
            H.b r9 = r7.f408d
            long r5 = (long) r8
            java.lang.reflect.Field r8 = C.y.f117a
            r4.postOnAnimationDelayed(r9, r5)
            goto L79
        L74:
            H.b r8 = r7.f408d
            r8.run()
        L79:
            r7.f416l = r2
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: H.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
