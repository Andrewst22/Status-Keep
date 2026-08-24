package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import e.AbstractC0259a;
/* loaded from: classes.dex */
public abstract class E extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public int f7717A;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7718m;

    /* renamed from: n  reason: collision with root package name */
    public int f7719n;

    /* renamed from: o  reason: collision with root package name */
    public int f7720o;

    /* renamed from: p  reason: collision with root package name */
    public int f7721p;

    /* renamed from: q  reason: collision with root package name */
    public int f7722q;

    /* renamed from: r  reason: collision with root package name */
    public int f7723r;

    /* renamed from: s  reason: collision with root package name */
    public float f7724s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f7725t;

    /* renamed from: u  reason: collision with root package name */
    public int[] f7726u;

    /* renamed from: v  reason: collision with root package name */
    public int[] f7727v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f7728w;
    public int x;

    /* renamed from: y  reason: collision with root package name */
    public int f7729y;

    /* renamed from: z  reason: collision with root package name */
    public int f7730z;

    public E(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f7718m = true;
        this.f7719n = -1;
        this.f7720o = 0;
        this.f7722q = 8388659;
        B1.e n02 = B1.e.n0(context, attributeSet, AbstractC0259a.f5200i, i3);
        TypedArray typedArray = (TypedArray) n02.f57o;
        int i4 = typedArray.getInt(1, -1);
        if (i4 >= 0) {
            setOrientation(i4);
        }
        int i5 = typedArray.getInt(0, -1);
        if (i5 >= 0) {
            setGravity(i5);
        }
        boolean z3 = typedArray.getBoolean(2, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.f7724s = typedArray.getFloat(4, -1.0f);
        this.f7719n = typedArray.getInt(3, -1);
        this.f7725t = typedArray.getBoolean(7, false);
        setDividerDrawable(n02.b0(5));
        this.f7730z = typedArray.getInt(8, 0);
        this.f7717A = typedArray.getDimensionPixelSize(6, 0);
        n02.r0();
    }

    public final void b(Canvas canvas, int i3) {
        this.f7728w.setBounds(getPaddingLeft() + this.f7717A, i3, (getWidth() - getPaddingRight()) - this.f7717A, this.f7729y + i3);
        this.f7728w.draw(canvas);
    }

    public final void c(Canvas canvas, int i3) {
        this.f7728w.setBounds(i3, getPaddingTop() + this.f7717A, this.x + i3, (getHeight() - getPaddingBottom()) - this.f7717A);
        this.f7728w.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof D;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d */
    public D generateDefaultLayoutParams() {
        int i3 = this.f7721p;
        if (i3 == 0) {
            return new D(-2);
        }
        if (i3 == 1) {
            return new D(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: e */
    public D generateLayoutParams(AttributeSet attributeSet) {
        return new D(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f */
    public D generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new D(layoutParams);
    }

    public final boolean g(int i3) {
        if (i3 == 0) {
            if ((this.f7730z & 1) == 0) {
                return false;
            }
            return true;
        } else if (i3 == getChildCount()) {
            if ((this.f7730z & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.f7730z & 2) == 0) {
            return false;
        } else {
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                if (getChildAt(i4).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i3;
        if (this.f7719n < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.f7719n;
        if (childCount > i4) {
            View childAt = getChildAt(i4);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f7719n == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i5 = this.f7720o;
            if (this.f7721p == 1 && (i3 = this.f7722q & 112) != 48) {
                if (i3 != 16) {
                    if (i3 == 80) {
                        i5 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f7723r;
                    }
                } else {
                    i5 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f7723r) / 2;
                }
            }
            return i5 + ((ViewGroup.MarginLayoutParams) ((D) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f7719n;
    }

    public Drawable getDividerDrawable() {
        return this.f7728w;
    }

    public int getDividerPadding() {
        return this.f7717A;
    }

    public int getDividerWidth() {
        return this.x;
    }

    public int getGravity() {
        return this.f7722q;
    }

    public int getOrientation() {
        return this.f7721p;
    }

    public int getShowDividers() {
        return this.f7730z;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f7724s;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i3;
        int left2;
        int bottom;
        if (this.f7728w == null) {
            return;
        }
        int i4 = 0;
        if (this.f7721p == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i4 < virtualChildCount) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8 && g(i4)) {
                    b(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((D) childAt.getLayoutParams())).topMargin) - this.f7729y);
                }
                i4++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f7729y;
                } else {
                    bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((D) childAt2.getLayoutParams())).bottomMargin;
                }
                b(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a3 = y0.a(this);
        while (i4 < virtualChildCount2) {
            View childAt3 = getChildAt(i4);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i4)) {
                D d3 = (D) childAt3.getLayoutParams();
                if (a3) {
                    left2 = childAt3.getRight() + ((ViewGroup.MarginLayoutParams) d3).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) d3).leftMargin) - this.x;
                }
                c(canvas, left2);
            }
            i4++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a3) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i3 = this.x;
                    right = left - i3;
                }
            } else {
                D d4 = (D) childAt4.getLayoutParams();
                if (a3) {
                    left = childAt4.getLeft() - ((ViewGroup.MarginLayoutParams) d4).leftMargin;
                    i3 = this.x;
                    right = left - i3;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) d4).rightMargin;
                }
            }
            c(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.E.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x02db, code lost:
        if (((android.view.ViewGroup.MarginLayoutParams) r9).width == (-1)) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:444:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.E.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z3) {
        this.f7718m = z3;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 >= 0 && i3 < getChildCount()) {
            this.f7719n = i3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f7728w) {
            return;
        }
        this.f7728w = drawable;
        boolean z3 = false;
        if (drawable != null) {
            this.x = drawable.getIntrinsicWidth();
            this.f7729y = drawable.getIntrinsicHeight();
        } else {
            this.x = 0;
            this.f7729y = 0;
        }
        if (drawable == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        requestLayout();
    }

    public void setDividerPadding(int i3) {
        this.f7717A = i3;
    }

    public void setGravity(int i3) {
        if (this.f7722q != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f7722q = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i4 = i3 & 8388615;
        int i5 = this.f7722q;
        if ((8388615 & i5) != i4) {
            this.f7722q = i4 | ((-8388616) & i5);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f7725t = z3;
    }

    public void setOrientation(int i3) {
        if (this.f7721p != i3) {
            this.f7721p = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.f7730z) {
            requestLayout();
        }
        this.f7730z = i3;
    }

    public void setVerticalGravity(int i3) {
        int i4 = i3 & 112;
        int i5 = this.f7722q;
        if ((i5 & 112) != i4) {
            this.f7722q = i4 | (i5 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.f7724s = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
