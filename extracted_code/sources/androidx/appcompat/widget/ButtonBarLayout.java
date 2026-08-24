package androidx.appcompat.widget;

import C.y;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.example.flutter_application_1.R;
import e.AbstractC0259a;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: m  reason: collision with root package name */
    public boolean f3984m;

    /* renamed from: n  reason: collision with root package name */
    public int f3985n;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3985n = -1;
        int[] iArr = AbstractC0259a.f5199h;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.f3984m = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z3) {
        int i3;
        int i4;
        setOrientation(z3 ? 1 : 0);
        if (z3) {
            i3 = 5;
        } else {
            i3 = 80;
        }
        setGravity(i3);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            if (z3) {
                i4 = 8;
            } else {
                i4 = 4;
            }
            findViewById.setVisibility(i4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        int size = View.MeasureSpec.getSize(i3);
        int i7 = 0;
        if (this.f3984m) {
            if (size > this.f3985n && getOrientation() == 1) {
                setStacked(false);
            }
            this.f3985n = size;
        }
        if (getOrientation() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && View.MeasureSpec.getMode(i3) == 1073741824) {
            i5 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z4 = true;
        } else {
            i5 = i3;
            z4 = false;
        }
        super.onMeasure(i5, i4);
        if (this.f3984m && getOrientation() != 1 && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z4 = true;
        }
        if (z4) {
            super.onMeasure(i3, i4);
        }
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            i6 = -1;
            if (i8 < childCount) {
                if (getChildAt(i8).getVisibility() == 0) {
                    break;
                }
                i8++;
            } else {
                i8 = -1;
                break;
            }
        }
        if (i8 >= 0) {
            View childAt = getChildAt(i8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (getOrientation() == 1) {
                i7 = 1;
            }
            if (i7 != 0) {
                int i9 = i8 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i9 >= childCount2) {
                        break;
                    } else if (getChildAt(i9).getVisibility() == 0) {
                        i6 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
                if (i6 >= 0) {
                    i7 = getChildAt(i6).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    i7 = measuredHeight;
                }
            } else {
                i7 = getPaddingBottom() + measuredHeight;
            }
        }
        Field field = y.f117a;
        if (getMinimumHeight() != i7) {
            setMinimumHeight(i7);
        }
    }

    public void setAllowStacking(boolean z3) {
        if (this.f3984m != z3) {
            this.f3984m = z3;
            if (!z3 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
