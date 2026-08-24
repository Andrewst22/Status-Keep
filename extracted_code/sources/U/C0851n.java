package u;
/* renamed from: u.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851n {

    /* renamed from: k  reason: collision with root package name */
    public static final C0851n f9297k;

    /* renamed from: a  reason: collision with root package name */
    public final float f9298a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9299b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9300c;

    /* renamed from: d  reason: collision with root package name */
    public final float f9301d;

    /* renamed from: e  reason: collision with root package name */
    public final float f9302e;

    /* renamed from: f  reason: collision with root package name */
    public final float f9303f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f9304g;

    /* renamed from: h  reason: collision with root package name */
    public final float f9305h;

    /* renamed from: i  reason: collision with root package name */
    public final float f9306i;

    /* renamed from: j  reason: collision with root package name */
    public final float f9307j;

    static {
        float f3;
        float[] fArr = AbstractC0839b.f9275c;
        float l3 = (float) ((AbstractC0839b.l() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC0839b.f9273a;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr[1];
        float f6 = (fArr3[1] * f5) + (fArr3[0] * f4);
        float f7 = fArr[2];
        float f8 = (fArr3[2] * f7) + f6;
        float[] fArr4 = fArr2[1];
        float f9 = (fArr4[2] * f7) + (fArr4[1] * f5) + (fArr4[0] * f4);
        float[] fArr5 = fArr2[2];
        float f10 = (f7 * fArr5[2]) + (f5 * fArr5[1]) + (f4 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f3 = 0.69f;
        } else {
            f3 = 0.655f;
        }
        float exp = (1.0f - (((float) Math.exp(((-l3) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d3 = exp;
        if (d3 > 1.0d) {
            exp = 1.0f;
        } else if (d3 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp};
        float f11 = 1.0f / ((5.0f * l3) + 1.0f);
        float f12 = f11 * f11 * f11 * f11;
        float f13 = 1.0f - f12;
        float cbrt = (0.1f * f13 * f13 * ((float) Math.cbrt(l3 * 5.0d))) + (f12 * l3);
        float l4 = AbstractC0839b.l() / fArr[1];
        double d4 = l4;
        float sqrt = ((float) Math.sqrt(d4)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d4, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f8) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f10) / 100.0d, 0.42d)};
        float f14 = fArr7[0];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[1];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[2];
        float[] fArr8 = {f15, f17, (400.0f * f18) / (f18 + 27.13f)};
        f9297k = new C0851n(l4, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f3, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public C0851n(float f3, float f4, float f5, float f6, float f7, float f8, float[] fArr, float f9, float f10, float f11) {
        this.f9303f = f3;
        this.f9298a = f4;
        this.f9299b = f5;
        this.f9300c = f6;
        this.f9301d = f7;
        this.f9302e = f8;
        this.f9304g = fArr;
        this.f9305h = f9;
        this.f9306i = f10;
        this.f9307j = f11;
    }
}
