package androidx.appcompat.view.menu;

import B1.e;
import C.y;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.example.flutter_application_1.R;
import e.AbstractC0259a;
import java.lang.reflect.Field;
import k.InterfaceC0534p;
import k.MenuItemC0528j;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0534p, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f3914A;

    /* renamed from: B  reason: collision with root package name */
    public LayoutInflater f3915B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f3916C;

    /* renamed from: m  reason: collision with root package name */
    public MenuItemC0528j f3917m;

    /* renamed from: n  reason: collision with root package name */
    public ImageView f3918n;

    /* renamed from: o  reason: collision with root package name */
    public RadioButton f3919o;

    /* renamed from: p  reason: collision with root package name */
    public TextView f3920p;

    /* renamed from: q  reason: collision with root package name */
    public CheckBox f3921q;

    /* renamed from: r  reason: collision with root package name */
    public TextView f3922r;

    /* renamed from: s  reason: collision with root package name */
    public ImageView f3923s;

    /* renamed from: t  reason: collision with root package name */
    public ImageView f3924t;

    /* renamed from: u  reason: collision with root package name */
    public LinearLayout f3925u;

    /* renamed from: v  reason: collision with root package name */
    public final Drawable f3926v;

    /* renamed from: w  reason: collision with root package name */
    public final int f3927w;
    public final Context x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3928y;

    /* renamed from: z  reason: collision with root package name */
    public final Drawable f3929z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e n02 = e.n0(getContext(), attributeSet, AbstractC0259a.f5205n, R.attr.listMenuViewStyle);
        this.f3926v = n02.b0(5);
        TypedArray typedArray = (TypedArray) n02.f57o;
        this.f3927w = typedArray.getResourceId(1, -1);
        this.f3928y = typedArray.getBoolean(7, false);
        this.x = context;
        this.f3929z = n02.b0(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f3914A = obtainStyledAttributes.hasValue(0);
        n02.r0();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f3915B == null) {
            this.f3915B = LayoutInflater.from(getContext());
        }
        return this.f3915B;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        int i3;
        ImageView imageView = this.f3923s;
        if (imageView != null) {
            if (z3) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f3924t;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3924t.getLayoutParams();
            rect.top = this.f3924t.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r0 == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    @Override // k.InterfaceC0534p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(k.MenuItemC0528j r11) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(k.j):void");
    }

    @Override // k.InterfaceC0534p
    public MenuItemC0528j getItemData() {
        return this.f3917m;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = y.f117a;
        setBackground(this.f3926v);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f3920p = textView;
        int i3 = this.f3927w;
        if (i3 != -1) {
            textView.setTextAppearance(this.x, i3);
        }
        this.f3922r = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f3923s = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f3929z);
        }
        this.f3924t = (ImageView) findViewById(R.id.group_divider);
        this.f3925u = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        if (this.f3918n != null && this.f3928y) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f3918n.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i3, i4);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f3919o == null && this.f3921q == null) {
            return;
        }
        if ((this.f3917m.x & 4) != 0) {
            if (this.f3919o == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3919o = radioButton;
                LinearLayout linearLayout = this.f3925u;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3919o;
            view = this.f3921q;
        } else {
            if (this.f3921q == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3921q = checkBox;
                LinearLayout linearLayout2 = this.f3925u;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3921q;
            view = this.f3919o;
        }
        if (z3) {
            compoundButton.setChecked(this.f3917m.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f3921q;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f3919o;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f3917m.x & 4) != 0) {
            if (this.f3919o == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3919o = radioButton;
                LinearLayout linearLayout = this.f3925u;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3919o;
        } else {
            if (this.f3921q == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3921q = checkBox;
                LinearLayout linearLayout2 = this.f3925u;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3921q;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f3916C = z3;
        this.f3928y = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        int i3;
        ImageView imageView = this.f3924t;
        if (imageView != null) {
            if (!this.f3914A && z3) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3917m.f7452n.getClass();
        boolean z3 = this.f3916C;
        if (!z3 && !this.f3928y) {
            return;
        }
        ImageView imageView = this.f3918n;
        if (imageView == null && drawable == null && !this.f3928y) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f3918n = imageView2;
            LinearLayout linearLayout = this.f3925u;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.f3928y) {
            this.f3918n.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f3918n;
        if (!z3) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f3918n.getVisibility() != 0) {
            this.f3918n.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f3920p.setText(charSequence);
            if (this.f3920p.getVisibility() != 0) {
                this.f3920p.setVisibility(0);
            }
        } else if (this.f3920p.getVisibility() != 8) {
            this.f3920p.setVisibility(8);
        }
    }
}
