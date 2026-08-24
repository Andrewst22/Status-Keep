package X0;

import D2.h;
import N.k;
import U.AbstractC0123a;
import android.graphics.Color;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f2964a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2965b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f2966c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f2967d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2968e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2969f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2970g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2971h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2972i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2973j;

    public d(String str, int i3, Integer num, Integer num2, float f3, boolean z3, boolean z4, boolean z5, boolean z6, int i4) {
        this.f2964a = str;
        this.f2965b = i3;
        this.f2966c = num;
        this.f2967d = num2;
        this.f2968e = f3;
        this.f2969f = z3;
        this.f2970g = z4;
        this.f2971h = z5;
        this.f2972i = z6;
        this.f2973j = i4;
    }

    public static int a(String str) {
        boolean z3;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case k.FLOAT_FIELD_NUMBER /* 2 */:
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                case k.LONG_FIELD_NUMBER /* 4 */:
                case k.STRING_FIELD_NUMBER /* 5 */:
                case k.STRING_SET_FIELD_NUMBER /* 6 */:
                case k.DOUBLE_FIELD_NUMBER /* 7 */:
                case k.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                    z3 = true;
                    break;
                default:
                    z3 = false;
                    break;
            }
            if (z3) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        h.s("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e2) {
            AbstractC0123a.B("SsaStyle", "Failed to parse boolean value: '" + str + "'", e2);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z3;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0123a.e(z3);
            int i3 = android.support.v4.media.session.a.i(((parseLong >> 24) & 255) ^ 255);
            int i4 = android.support.v4.media.session.a.i((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(i3, android.support.v4.media.session.a.i(parseLong & 255), android.support.v4.media.session.a.i((parseLong >> 8) & 255), i4));
        } catch (IllegalArgumentException e2) {
            AbstractC0123a.B("SsaStyle", "Failed to parse color expression: '" + str + "'", e2);
            return null;
        }
    }
}
