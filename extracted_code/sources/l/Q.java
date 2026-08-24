package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.example.flutter_application_1.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import l1.C0607p;
import m2.AbstractC0635d;
import org.xmlpull.v1.XmlPullParserException;
import p.AbstractC0725g;
import p.C0723e;
import p.C0726h;
import p.C0727i;
import t.AbstractC0809a;
import w.AbstractC0880a;
/* loaded from: classes.dex */
public final class Q {

    /* renamed from: i  reason: collision with root package name */
    public static Q f7768i;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f7770a;

    /* renamed from: b  reason: collision with root package name */
    public C0723e f7771b;

    /* renamed from: c  reason: collision with root package name */
    public p.j f7772c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap f7773d = new WeakHashMap(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f7774e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7775f;

    /* renamed from: g  reason: collision with root package name */
    public Z.e f7776g;

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f7767h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    public static final P f7769j = new Q0.i(6);

    public static synchronized Q d() {
        Q q3;
        synchronized (Q.class) {
            try {
                if (f7768i == null) {
                    Q q4 = new Q();
                    f7768i = q4;
                    if (Build.VERSION.SDK_INT < 24) {
                        q4.a("vector", new O(2));
                        q4.a("animated-vector", new O(1));
                        q4.a("animated-selector", new O(0));
                    }
                }
                q3 = f7768i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return q3;
    }

    public static synchronized PorterDuffColorFilter h(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (Q.class) {
            P p3 = f7769j;
            p3.getClass();
            int i4 = (31 + i3) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) p3.d(Integer.valueOf(mode.hashCode() + i4));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) p3.e(Integer.valueOf(mode.hashCode() + i4), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p.e, p.i] */
    public final void a(String str, O o3) {
        if (this.f7771b == null) {
            this.f7771b = new C0727i();
        }
        this.f7771b.put(str, o3);
    }

    public final synchronized void b(Context context, long j3, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C0726h c0726h = (C0726h) this.f7773d.get(context);
                if (c0726h == null) {
                    c0726h = new C0726h();
                    this.f7773d.put(context, c0726h);
                }
                c0726h.e(j3, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i3) {
        if (this.f7774e == null) {
            this.f7774e = new TypedValue();
        }
        TypedValue typedValue = this.f7774e;
        context.getResources().getValue(i3, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e2 = e(context, j3);
        if (e2 != null) {
            return e2;
        }
        LayerDrawable layerDrawable = null;
        if (this.f7776g != null && i3 == R.drawable.abc_cab_background_top_material) {
            layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j3, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j3) {
        C0726h c0726h = (C0726h) this.f7773d.get(context);
        if (c0726h == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c0726h.d(j3, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b3 = AbstractC0725g.b(c0726h.f8741n, c0726h.f8743p, j3);
            if (b3 >= 0) {
                Object[] objArr = c0726h.f8742o;
                Object obj = objArr[b3];
                Object obj2 = C0726h.f8739q;
                if (obj != obj2) {
                    objArr[b3] = obj2;
                    c0726h.f8740m = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i3) {
        return g(context, i3);
    }

    public final synchronized Drawable g(Context context, int i3) {
        Drawable j3;
        try {
            if (!this.f7775f) {
                this.f7775f = true;
                Drawable f3 = f(context, R.drawable.abc_vector_test);
                if (f3 == null || (!(f3 instanceof C0607p) && !"android.graphics.drawable.VectorDrawable".equals(f3.getClass().getName()))) {
                    this.f7775f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            j3 = j(context, i3);
            if (j3 == null) {
                j3 = c(context, i3);
            }
            if (j3 == null) {
                j3 = AbstractC0809a.b(context, i3);
            }
            if (j3 != null) {
                j3 = l(context, i3, j3);
            }
            if (j3 != null) {
                AbstractC0586y.b(j3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return j3;
    }

    public final synchronized ColorStateList i(Context context, int i3) {
        ColorStateList colorStateList;
        p.j jVar;
        WeakHashMap weakHashMap = this.f7770a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (jVar = (p.j) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) jVar.c(i3, null);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            Z.e eVar = this.f7776g;
            if (eVar != null) {
                colorStateList2 = eVar.e(context, i3);
            }
            if (colorStateList2 != null) {
                if (this.f7770a == null) {
                    this.f7770a = new WeakHashMap();
                }
                p.j jVar2 = (p.j) this.f7770a.get(context);
                if (jVar2 == null) {
                    jVar2 = new p.j();
                    this.f7770a.put(context, jVar2);
                }
                jVar2.a(i3, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable j(Context context, int i3) {
        int next;
        C0723e c0723e = this.f7771b;
        if (c0723e == null || c0723e.isEmpty()) {
            return null;
        }
        p.j jVar = this.f7772c;
        if (jVar != null) {
            String str = (String) jVar.c(i3, null);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f7771b.getOrDefault(str, null) == null)) {
                return null;
            }
        } else {
            this.f7772c = new p.j();
        }
        if (this.f7774e == null) {
            this.f7774e = new TypedValue();
        }
        TypedValue typedValue = this.f7774e;
        Resources resources = context.getResources();
        resources.getValue(i3, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e2 = e(context, j3);
        if (e2 != null) {
            return e2;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i3);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.f7772c.a(i3, name);
                    O o3 = (O) this.f7771b.getOrDefault(name, null);
                    if (o3 != null) {
                        e2 = o3.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (e2 != null) {
                        e2.setChangingConfigurations(typedValue.changingConfigurations);
                        b(context, j3, e2);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e3) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e3);
            }
        }
        if (e2 == null) {
            this.f7772c.a(i3, "appcompat_skip_skip");
        }
        return e2;
    }

    public final synchronized void k(Z.e eVar) {
        this.f7776g = eVar;
    }

    public final Drawable l(Context context, int i3, Drawable drawable) {
        int i4;
        int i5;
        Drawable drawable2;
        PorterDuffColorFilter h3;
        ColorStateList i6 = i(context, i3);
        if (i6 != null) {
            if (AbstractC0586y.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = AbstractC0635d.z(drawable);
            AbstractC0880a.h(drawable, i6);
            PorterDuff.Mode mode = null;
            if (this.f7776g != null && i3 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                AbstractC0880a.i(drawable, mode);
            }
        } else {
            if (this.f7776g != null) {
                if (i3 == R.drawable.abc_seekbar_track_material) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                    int b3 = j0.b(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode2 = C0577o.f7881b;
                    Z.e.g(findDrawableByLayerId, b3, mode2);
                    Z.e.g(layerDrawable.findDrawableByLayerId(16908303), j0.b(context, R.attr.colorControlNormal), mode2);
                    Z.e.g(layerDrawable.findDrawableByLayerId(16908301), j0.b(context, R.attr.colorControlActivated), mode2);
                } else if (i3 == R.drawable.abc_ratingbar_material || i3 == R.drawable.abc_ratingbar_indicator_material || i3 == R.drawable.abc_ratingbar_small_material) {
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                    int a3 = j0.a(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode3 = C0577o.f7881b;
                    Z.e.g(findDrawableByLayerId2, a3, mode3);
                    Z.e.g(layerDrawable2.findDrawableByLayerId(16908303), j0.b(context, R.attr.colorControlActivated), mode3);
                    Z.e.g(layerDrawable2.findDrawableByLayerId(16908301), j0.b(context, R.attr.colorControlActivated), mode3);
                }
            }
            Z.e eVar = this.f7776g;
            boolean z3 = false;
            if (eVar != null) {
                PorterDuff.Mode mode4 = C0577o.f7881b;
                if (Z.e.b((int[]) eVar.f3470a, i3)) {
                    i5 = -1;
                    z3 = true;
                    i4 = R.attr.colorControlNormal;
                } else if (Z.e.b((int[]) eVar.f3472c, i3)) {
                    i5 = -1;
                    z3 = true;
                    i4 = R.attr.colorControlActivated;
                } else {
                    i4 = 16842801;
                    if (Z.e.b((int[]) eVar.f3473d, i3)) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i3 == R.drawable.abc_list_divider_mtrl_alpha) {
                        i5 = Math.round(40.8f);
                        z3 = true;
                        i4 = 16842800;
                    } else if (i3 != R.drawable.abc_dialog_material_background) {
                        i5 = -1;
                        i4 = 0;
                    }
                    i5 = -1;
                    z3 = true;
                }
                if (z3) {
                    if (AbstractC0586y.a(drawable)) {
                        drawable2 = drawable.mutate();
                    } else {
                        drawable2 = drawable;
                    }
                    int b4 = j0.b(context, i4);
                    synchronized (C0577o.class) {
                        h3 = h(b4, mode4);
                    }
                    drawable2.setColorFilter(h3);
                    if (i5 != -1) {
                        drawable2.setAlpha(i5);
                    }
                }
            }
        }
        return drawable;
    }
}
