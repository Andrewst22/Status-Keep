package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import p.C0726h;
import p.j;
/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* renamed from: A  reason: collision with root package name */
    public boolean f5638A;

    /* renamed from: B  reason: collision with root package name */
    public ColorFilter f5639B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f5640C;

    /* renamed from: D  reason: collision with root package name */
    public ColorStateList f5641D;

    /* renamed from: E  reason: collision with root package name */
    public PorterDuff.Mode f5642E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f5643F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f5644G;

    /* renamed from: H  reason: collision with root package name */
    public int[][] f5645H;

    /* renamed from: I  reason: collision with root package name */
    public C0726h f5646I;

    /* renamed from: J  reason: collision with root package name */
    public j f5647J;

    /* renamed from: a  reason: collision with root package name */
    public final e f5648a;

    /* renamed from: b  reason: collision with root package name */
    public Resources f5649b;

    /* renamed from: c  reason: collision with root package name */
    public int f5650c;

    /* renamed from: d  reason: collision with root package name */
    public int f5651d;

    /* renamed from: e  reason: collision with root package name */
    public int f5652e;

    /* renamed from: f  reason: collision with root package name */
    public SparseArray f5653f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable[] f5654g;

    /* renamed from: h  reason: collision with root package name */
    public int f5655h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5656i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5657j;

    /* renamed from: k  reason: collision with root package name */
    public Rect f5658k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5659l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5660m;

    /* renamed from: n  reason: collision with root package name */
    public int f5661n;

    /* renamed from: o  reason: collision with root package name */
    public int f5662o;

    /* renamed from: p  reason: collision with root package name */
    public int f5663p;

    /* renamed from: q  reason: collision with root package name */
    public int f5664q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5665r;

    /* renamed from: s  reason: collision with root package name */
    public int f5666s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5667t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5668u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5669v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5670w;
    public int x;

    /* renamed from: y  reason: collision with root package name */
    public int f5671y;

    /* renamed from: z  reason: collision with root package name */
    public int f5672z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i3;
        this.f5650c = 160;
        this.f5656i = false;
        this.f5659l = false;
        this.f5670w = true;
        this.f5671y = 0;
        this.f5672z = 0;
        this.f5648a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f5649b;
        } else {
            resources2 = null;
        }
        this.f5649b = resources2;
        if (bVar != null) {
            i3 = bVar.f5650c;
        } else {
            i3 = 0;
        }
        int i4 = g.f5687y;
        i3 = resources != null ? resources.getDisplayMetrics().densityDpi : i3;
        int i5 = i3 != 0 ? i3 : 160;
        this.f5650c = i5;
        if (bVar != null) {
            this.f5651d = bVar.f5651d;
            this.f5652e = bVar.f5652e;
            this.f5668u = true;
            this.f5669v = true;
            this.f5656i = bVar.f5656i;
            this.f5659l = bVar.f5659l;
            this.f5670w = bVar.f5670w;
            this.x = bVar.x;
            this.f5671y = bVar.f5671y;
            this.f5672z = bVar.f5672z;
            this.f5638A = bVar.f5638A;
            this.f5639B = bVar.f5639B;
            this.f5640C = bVar.f5640C;
            this.f5641D = bVar.f5641D;
            this.f5642E = bVar.f5642E;
            this.f5643F = bVar.f5643F;
            this.f5644G = bVar.f5644G;
            if (bVar.f5650c == i5) {
                if (bVar.f5657j) {
                    this.f5658k = new Rect(bVar.f5658k);
                    this.f5657j = true;
                }
                if (bVar.f5660m) {
                    this.f5661n = bVar.f5661n;
                    this.f5662o = bVar.f5662o;
                    this.f5663p = bVar.f5663p;
                    this.f5664q = bVar.f5664q;
                    this.f5660m = true;
                }
            }
            if (bVar.f5665r) {
                this.f5666s = bVar.f5666s;
                this.f5665r = true;
            }
            if (bVar.f5667t) {
                this.f5667t = true;
            }
            Drawable[] drawableArr = bVar.f5654g;
            this.f5654g = new Drawable[drawableArr.length];
            this.f5655h = bVar.f5655h;
            SparseArray sparseArray = bVar.f5653f;
            if (sparseArray != null) {
                this.f5653f = sparseArray.clone();
            } else {
                this.f5653f = new SparseArray(this.f5655h);
            }
            int i6 = this.f5655h;
            for (int i7 = 0; i7 < i6; i7++) {
                Drawable drawable = drawableArr[i7];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f5653f.put(i7, constantState);
                    } else {
                        this.f5654g[i7] = drawableArr[i7];
                    }
                }
            }
        } else {
            this.f5654g = new Drawable[10];
            this.f5655h = 0;
        }
        if (bVar != null) {
            this.f5645H = bVar.f5645H;
        } else {
            this.f5645H = new int[this.f5654g.length];
        }
        if (bVar != null) {
            this.f5646I = bVar.f5646I;
            this.f5647J = bVar.f5647J;
            return;
        }
        this.f5646I = new C0726h();
        this.f5647J = new j();
    }

    public final int a(Drawable drawable) {
        int i3 = this.f5655h;
        if (i3 >= this.f5654g.length) {
            int i4 = i3 + 10;
            Drawable[] drawableArr = new Drawable[i4];
            System.arraycopy(this.f5654g, 0, drawableArr, 0, i3);
            this.f5654g = drawableArr;
            int[][] iArr = new int[i4];
            System.arraycopy(this.f5645H, 0, iArr, 0, i3);
            this.f5645H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f5648a);
        this.f5654g[i3] = drawable;
        this.f5655h++;
        this.f5652e = drawable.getChangingConfigurations() | this.f5652e;
        this.f5665r = false;
        this.f5667t = false;
        this.f5658k = null;
        this.f5657j = false;
        this.f5660m = false;
        this.f5668u = false;
        return i3;
    }

    public final void b() {
        this.f5660m = true;
        c();
        int i3 = this.f5655h;
        Drawable[] drawableArr = this.f5654g;
        this.f5662o = -1;
        this.f5661n = -1;
        this.f5664q = 0;
        this.f5663p = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f5661n) {
                this.f5661n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f5662o) {
                this.f5662o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f5663p) {
                this.f5663p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f5664q) {
                this.f5664q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f5653f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.f5653f.keyAt(i3);
                Drawable[] drawableArr = this.f5654g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f5653f.valueAt(i3)).newDrawable(this.f5649b);
                if (Build.VERSION.SDK_INT >= 23) {
                    newDrawable.setLayoutDirection(this.x);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f5648a);
                drawableArr[keyAt] = mutate;
            }
            this.f5653f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i3 = this.f5655h;
        Drawable[] drawableArr = this.f5654g;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f5653f.get(i4);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i3) {
        int indexOfKey;
        Drawable drawable = this.f5654g[i3];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f5653f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i3)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f5653f.valueAt(indexOfKey)).newDrawable(this.f5649b);
        if (Build.VERSION.SDK_INT >= 23) {
            newDrawable.setLayoutDirection(this.x);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f5648a);
        this.f5654g[i3] = mutate;
        this.f5653f.removeAt(indexOfKey);
        if (this.f5653f.size() == 0) {
            this.f5653f = null;
        }
        return mutate;
    }

    public final int e(int[] iArr) {
        int[][] iArr2 = this.f5645H;
        int i3 = this.f5655h;
        for (int i4 = 0; i4 < i3; i4++) {
            if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f5651d | this.f5652e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
