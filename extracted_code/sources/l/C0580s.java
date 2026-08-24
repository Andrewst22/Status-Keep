package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import e.AbstractC0259a;
/* renamed from: l.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580s {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f7895a;

    /* renamed from: b  reason: collision with root package name */
    public l0 f7896b;

    /* renamed from: c  reason: collision with root package name */
    public l0 f7897c;

    /* renamed from: d  reason: collision with root package name */
    public l0 f7898d;

    /* renamed from: e  reason: collision with root package name */
    public l0 f7899e;

    /* renamed from: f  reason: collision with root package name */
    public l0 f7900f;

    /* renamed from: g  reason: collision with root package name */
    public l0 f7901g;

    /* renamed from: h  reason: collision with root package name */
    public l0 f7902h;

    /* renamed from: i  reason: collision with root package name */
    public final C0583v f7903i;

    /* renamed from: j  reason: collision with root package name */
    public int f7904j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f7905k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f7906l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7907m;

    public C0580s(TextView textView) {
        this.f7895a = textView;
        this.f7903i = new C0583v(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.l0, java.lang.Object] */
    public static l0 c(Context context, C0577o c0577o, int i3) {
        ColorStateList i4;
        synchronized (c0577o) {
            i4 = c0577o.f7883a.i(context, i3);
        }
        if (i4 != null) {
            ?? obj = new Object();
            obj.f7869d = true;
            obj.f7866a = i4;
            return obj;
        }
        return null;
    }

    public final void a(Drawable drawable, l0 l0Var) {
        if (drawable != null && l0Var != null) {
            C0577o.c(drawable, l0Var, this.f7895a.getDrawableState());
        }
    }

    public final void b() {
        l0 l0Var = this.f7896b;
        TextView textView = this.f7895a;
        if (l0Var != null || this.f7897c != null || this.f7898d != null || this.f7899e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f7896b);
            a(compoundDrawables[1], this.f7897c);
            a(compoundDrawables[2], this.f7898d);
            a(compoundDrawables[3], this.f7899e);
        }
        if (this.f7900f != null || this.f7901g != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f7900f);
            a(compoundDrawablesRelative[2], this.f7901g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0451 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.util.AttributeSet r29, int r30) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0580s.d(android.util.AttributeSet, int):void");
    }

    public final void e(Context context, int i3) {
        String string;
        ColorStateList Z2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC0259a.f5210s);
        B1.e eVar = new B1.e(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f7895a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23 && obtainStyledAttributes.hasValue(3) && (Z2 = eVar.Z(3)) != null) {
            textView.setTextColor(Z2);
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, eVar);
        if (i4 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        eVar.r0();
        Typeface typeface = this.f7906l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f7904j);
        }
    }

    public final void f(Context context, B1.e eVar) {
        String string;
        Typeface create;
        boolean z3;
        boolean z4;
        Typeface create2;
        int i3 = this.f7904j;
        TypedArray typedArray = (TypedArray) eVar.f57o;
        this.f7904j = typedArray.getInt(2, i3);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = typedArray.getInt(11, -1);
            this.f7905k = i5;
            if (i5 != -1) {
                this.f7904j &= 2;
            }
        }
        int i6 = 10;
        boolean z5 = false;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f7907m = false;
                int i7 = typedArray.getInt(1, 1);
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            this.f7906l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f7906l = Typeface.SERIF;
                    return;
                }
                this.f7906l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f7906l = null;
        if (typedArray.hasValue(12)) {
            i6 = 12;
        }
        int i8 = this.f7905k;
        int i9 = this.f7904j;
        if (!context.isRestricted()) {
            try {
                Typeface c02 = eVar.c0(i6, this.f7904j, new Q0.h(this, i8, i9));
                if (c02 != null) {
                    if (i4 >= 28 && this.f7905k != -1) {
                        Typeface create3 = Typeface.create(c02, 0);
                        int i10 = this.f7905k;
                        if ((this.f7904j & 2) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        create2 = Typeface.create(create3, i10, z4);
                        this.f7906l = create2;
                    } else {
                        this.f7906l = c02;
                    }
                }
                if (this.f7906l == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f7907m = z3;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f7906l == null && (string = typedArray.getString(i6)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f7905k != -1) {
                Typeface create4 = Typeface.create(string, 0);
                int i11 = this.f7905k;
                if ((this.f7904j & 2) != 0) {
                    z5 = true;
                }
                create = Typeface.create(create4, i11, z5);
                this.f7906l = create;
                return;
            }
            this.f7906l = Typeface.create(string, this.f7904j);
        }
    }
}
