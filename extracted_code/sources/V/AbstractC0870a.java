package v;

import android.graphics.Color;
/* renamed from: v.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0870a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f9462a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(double d3, double d4, double d5) {
        double d6;
        double d7;
        double d8;
        int min;
        int min2;
        double d9 = (((-0.4986d) * d5) + (((-1.5372d) * d4) + (3.2406d * d3))) / 100.0d;
        double d10 = ((0.0415d * d5) + ((1.8758d * d4) + ((-0.9689d) * d3))) / 100.0d;
        double d11 = ((1.057d * d5) + (((-0.204d) * d4) + (0.0557d * d3))) / 100.0d;
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        if (d10 > 0.0031308d) {
            d7 = (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d7 = d10 * 12.92d;
        }
        if (d11 > 0.0031308d) {
            d8 = (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d8 = 12.92d * d11;
        }
        int round = (int) Math.round(d6 * 255.0d);
        int i3 = 0;
        if (round < 0) {
            min = 0;
        } else {
            min = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d7 * 255.0d);
        if (round2 < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d8 * 255.0d);
        if (round3 >= 0) {
            i3 = Math.min(round3, 255);
        }
        return Color.rgb(min, min2, i3);
    }

    public static int b(int i3, int i4) {
        int alpha = Color.alpha(i4);
        int alpha2 = Color.alpha(i3);
        int i5 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i5, c(Color.red(i3), alpha2, Color.red(i4), alpha, i5), c(Color.green(i3), alpha2, Color.green(i4), alpha, i5), c(Color.blue(i3), alpha2, Color.blue(i4), alpha, i5));
    }

    public static int c(int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        return (((255 - i4) * (i5 * i6)) + ((i3 * 255) * i4)) / (i7 * 255);
    }
}
