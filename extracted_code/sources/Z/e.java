package Z;

import D1.I;
import D1.b0;
import D1.g0;
import R.N;
import R.Q;
import R.T;
import U.A;
import Y.G;
import Y.e0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.example.flutter_application_1.R;
import java.io.Serializable;
import l.AbstractC0586y;
import l.C0577o;
import l.j0;
import o0.C0701z;
import v.AbstractC0870a;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3470a;

    /* renamed from: b  reason: collision with root package name */
    public Serializable f3471b;

    /* renamed from: c  reason: collision with root package name */
    public Serializable f3472c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3473d;

    /* renamed from: e  reason: collision with root package name */
    public Object f3474e;

    /* renamed from: f  reason: collision with root package name */
    public Object f3475f;

    /* JADX WARN: Type inference failed for: r0v3, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int[], java.io.Serializable] */
    public e() {
        this.f3470a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f3471b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f3472c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
        this.f3473d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f3474e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f3475f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean b(int[] iArr, int i3) {
        for (int i4 : iArr) {
            if (i4 == i3) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList c(Context context, int i3) {
        int b3 = j0.b(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{j0.f7853b, j0.f7855d, j0.f7854c, j0.f7857f}, new int[]{j0.a(context, R.attr.colorButtonNormal), AbstractC0870a.b(b3, i3), AbstractC0870a.b(b3, i3), i3});
    }

    public static C0701z d(N n3, I i3, C0701z c0701z, Q q3) {
        int b3;
        Object l3;
        int i4;
        G g3 = (G) n3;
        T r3 = g3.r();
        g3.J();
        if (g3.f3057d0.f3253a.p()) {
            b3 = 0;
        } else {
            e0 e0Var = g3.f3057d0;
            b3 = e0Var.f3253a.b(e0Var.f3254b.f8653a);
        }
        if (r3.p()) {
            l3 = null;
        } else {
            l3 = r3.l(b3);
        }
        if (!g3.w() && !r3.p()) {
            i4 = r3.f(b3, q3, false).b(A.M(g3.p()) - q3.f1799e);
        } else {
            i4 = -1;
        }
        for (int i5 = 0; i5 < i3.size(); i5++) {
            C0701z c0701z2 = (C0701z) i3.get(i5);
            if (f(c0701z2, l3, g3.w(), g3.m(), g3.n(), i4)) {
                return c0701z2;
            }
        }
        if (i3.isEmpty() && c0701z != null) {
            if (f(c0701z, l3, g3.w(), g3.m(), g3.n(), i4)) {
                return c0701z;
            }
        }
        return null;
    }

    public static boolean f(C0701z c0701z, Object obj, boolean z3, int i3, int i4, int i5) {
        if (!c0701z.f8653a.equals(obj)) {
            return false;
        }
        int i6 = c0701z.f8654b;
        if ((!z3 || i6 != i3 || c0701z.f8655c != i4) && (z3 || i6 != -1 || c0701z.f8657e != i5)) {
            return false;
        }
        return true;
    }

    public static void g(Drawable drawable, int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter h3;
        if (AbstractC0586y.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C0577o.f7881b;
        }
        PorterDuff.Mode mode2 = C0577o.f7881b;
        synchronized (C0577o.class) {
            h3 = l.Q.h(i3, mode);
        }
        drawable.setColorFilter(h3);
    }

    public void a(B0.b bVar, C0701z c0701z, T t3) {
        if (c0701z == null) {
            return;
        }
        if (t3.b(c0701z.f8653a) != -1) {
            bVar.h(c0701z, t3);
            return;
        }
        T t4 = (T) ((g0) this.f3472c).get(c0701z);
        if (t4 != null) {
            bVar.h(c0701z, t4);
        }
    }

    public ColorStateList e(Context context, int i3) {
        if (i3 == R.drawable.abc_edit_text_material) {
            return f.b.b(context, R.color.abc_tint_edittext);
        }
        if (i3 == R.drawable.abc_switch_track_mtrl_alpha) {
            return f.b.b(context, R.color.abc_tint_switch_track);
        }
        if (i3 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList c3 = j0.c(context, R.attr.colorSwitchThumbNormal);
            if (c3 != null && c3.isStateful()) {
                int[] iArr3 = j0.f7853b;
                iArr[0] = iArr3;
                iArr2[0] = c3.getColorForState(iArr3, 0);
                iArr[1] = j0.f7856e;
                iArr2[1] = j0.b(context, R.attr.colorControlActivated);
                iArr[2] = j0.f7857f;
                iArr2[2] = c3.getDefaultColor();
            } else {
                iArr[0] = j0.f7853b;
                iArr2[0] = j0.a(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = j0.f7856e;
                iArr2[1] = j0.b(context, R.attr.colorControlActivated);
                iArr[2] = j0.f7857f;
                iArr2[2] = j0.b(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i3 == R.drawable.abc_btn_default_mtrl_shape) {
            return c(context, j0.b(context, R.attr.colorButtonNormal));
        } else {
            if (i3 == R.drawable.abc_btn_borderless_material) {
                return c(context, 0);
            }
            if (i3 == R.drawable.abc_btn_colored_material) {
                return c(context, j0.b(context, R.attr.colorAccent));
            }
            if (i3 != R.drawable.abc_spinner_mtrl_am_alpha && i3 != R.drawable.abc_spinner_textfield_background_material) {
                if (b((int[]) this.f3471b, i3)) {
                    return j0.c(context, R.attr.colorControlNormal);
                }
                if (b((int[]) this.f3474e, i3)) {
                    return f.b.b(context, R.color.abc_tint_default);
                }
                if (b((int[]) this.f3475f, i3)) {
                    return f.b.b(context, R.color.abc_tint_btn_checkable);
                }
                if (i3 == R.drawable.abc_seekbar_thumb_material) {
                    return f.b.b(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            return f.b.b(context, R.color.abc_tint_spinner);
        }
    }

    public void h(T t3) {
        B0.b bVar = new B0.b(4);
        if (((I) this.f3471b).isEmpty()) {
            a(bVar, (C0701z) this.f3474e, t3);
            if (!android.support.v4.media.session.a.s((C0701z) this.f3475f, (C0701z) this.f3474e)) {
                a(bVar, (C0701z) this.f3475f, t3);
            }
            if (!android.support.v4.media.session.a.s((C0701z) this.f3473d, (C0701z) this.f3474e) && !android.support.v4.media.session.a.s((C0701z) this.f3473d, (C0701z) this.f3475f)) {
                a(bVar, (C0701z) this.f3473d, t3);
            }
        } else {
            for (int i3 = 0; i3 < ((I) this.f3471b).size(); i3++) {
                a(bVar, (C0701z) ((I) this.f3471b).get(i3), t3);
            }
            if (!((I) this.f3471b).contains((C0701z) this.f3473d)) {
                a(bVar, (C0701z) this.f3473d, t3);
            }
        }
        this.f3472c = bVar.a();
    }

    public e(Q q3) {
        this.f3470a = q3;
        D1.G g3 = I.f197n;
        this.f3471b = b0.f231q;
        this.f3472c = g0.f255s;
    }
}
