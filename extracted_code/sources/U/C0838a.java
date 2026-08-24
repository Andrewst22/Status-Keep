package u;

import android.graphics.Color;
import v.AbstractC0870a;
/* renamed from: u.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0838a {

    /* renamed from: a  reason: collision with root package name */
    public final float f9267a;

    /* renamed from: b  reason: collision with root package name */
    public final float f9268b;

    /* renamed from: c  reason: collision with root package name */
    public final float f9269c;

    /* renamed from: d  reason: collision with root package name */
    public final float f9270d;

    /* renamed from: e  reason: collision with root package name */
    public final float f9271e;

    /* renamed from: f  reason: collision with root package name */
    public final float f9272f;

    public C0838a(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f9267a = f3;
        this.f9268b = f4;
        this.f9269c = f5;
        this.f9270d = f6;
        this.f9271e = f7;
        this.f9272f = f8;
    }

    public static C0838a a(int i3) {
        float f3;
        float pow;
        C0851n c0851n = C0851n.f9297k;
        float g3 = AbstractC0839b.g(Color.red(i3));
        float g4 = AbstractC0839b.g(Color.green(i3));
        float g5 = AbstractC0839b.g(Color.blue(i3));
        float[][] fArr = AbstractC0839b.f9276d;
        float[] fArr2 = fArr[0];
        float f4 = (fArr2[2] * g5) + (fArr2[1] * g4) + (fArr2[0] * g3);
        float[] fArr3 = fArr[1];
        float f5 = (fArr3[2] * g5) + (fArr3[1] * g4) + (fArr3[0] * g3);
        float[] fArr4 = fArr[2];
        float f6 = (g5 * fArr4[2]) + (g4 * fArr4[1]) + (g3 * fArr4[0]);
        float[][] fArr5 = AbstractC0839b.f9273a;
        float[] fArr6 = fArr5[0];
        float f7 = (fArr6[2] * f6) + (fArr6[1] * f5) + (fArr6[0] * f4);
        float[] fArr7 = fArr5[1];
        float f8 = fArr7[1] * f5;
        float f9 = fArr7[2] * f6;
        float[] fArr8 = fArr5[2];
        float f10 = f4 * fArr8[0];
        float f11 = f6 * fArr8[2];
        float[] fArr9 = c0851n.f9304g;
        float f12 = fArr9[0] * f7;
        float f13 = fArr9[1] * (f9 + f8 + (fArr7[0] * f4));
        float f14 = fArr9[2] * (f11 + (f5 * fArr8[1]) + f10);
        float abs = Math.abs(f12);
        float f15 = c0851n.f9305h;
        float pow2 = (float) Math.pow((abs * f15) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f13) * f15) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f14) * f15) / 100.0d, 0.42d);
        float signum = ((Math.signum(f12) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f13) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f14) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d3 = signum3;
        float f16 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d3)) / 11.0f;
        float f17 = ((float) ((signum + signum2) - (d3 * 2.0d))) / 9.0f;
        float f18 = signum2 * 20.0f;
        float f19 = ((21.0f * signum3) + ((signum * 20.0f) + f18)) / 20.0f;
        float f20 = (((signum * 40.0f) + f18) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f21 = atan2;
        float f22 = (3.1415927f * f21) / 180.0f;
        float f23 = f20 * c0851n.f9299b;
        float f24 = c0851n.f9298a;
        float f25 = c0851n.f9301d;
        float pow5 = ((float) Math.pow(f23 / f24, c0851n.f9307j * f25)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        float f26 = f24 + 4.0f;
        if (f21 < 20.14d) {
            f3 = 360.0f + f21;
        } else {
            f3 = f21;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, c0851n.f9303f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f3 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c0851n.f9302e) * c0851n.f9300c) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        Math.sqrt((pow * f25) / f26);
        float f27 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((c0851n.f9306i * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d4 = f22;
        return new C0838a(f21, pow6, pow5, f27, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    public static C0838a b(float f3, float f4, float f5) {
        C0851n c0851n;
        double d3;
        float f6 = C0851n.f9297k.f9301d;
        Math.sqrt(f3 / 100.0d);
        Math.sqrt(((f4 / ((float) Math.sqrt(d3))) * c0851n.f9301d) / (c0851n.f9298a + 4.0f));
        float f7 = (1.7f * f3) / ((0.007f * f3) + 1.0f);
        float log = ((float) Math.log((c0851n.f9306i * f4 * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (3.1415927f * f5) / 180.0f;
        return new C0838a(f5, f4, f3, f7, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    public final int c(C0851n c0851n) {
        float f3;
        float[] fArr;
        float f4 = this.f9268b;
        float f5 = this.f9269c;
        if (f4 != 0.0d) {
            double d3 = f5;
            if (d3 != 0.0d) {
                f3 = f4 / ((float) Math.sqrt(d3 / 100.0d));
                float pow = (float) Math.pow(f3 / Math.pow(1.64d - Math.pow(0.29d, c0851n.f9303f), 0.73d), 1.1111111111111112d);
                double d4 = (this.f9267a * 3.1415927f) / 180.0f;
                float pow2 = c0851n.f9298a * ((float) Math.pow(f5 / 100.0d, (1.0d / c0851n.f9301d) / c0851n.f9307j));
                float cos = ((float) (Math.cos(2.0d + d4) + 3.8d)) * 0.25f * 3846.1538f * c0851n.f9302e * c0851n.f9300c;
                float f6 = pow2 / c0851n.f9299b;
                float sin = (float) Math.sin(d4);
                float cos2 = (float) Math.cos(d4);
                float f7 = (((0.305f + f6) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f8 = cos2 * f7;
                float f9 = f7 * sin;
                float f10 = f6 * 460.0f;
                float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
                float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
                float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
                float signum = Math.signum(f11);
                float f14 = 100.0f / c0851n.f9305h;
                float pow3 = signum * f14 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
                float signum2 = Math.signum(f12) * f14 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
                float[] fArr2 = c0851n.f9304g;
                float f15 = pow3 / fArr2[0];
                float f16 = signum2 / fArr2[1];
                float signum3 = ((Math.signum(f13) * f14) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d))) / fArr2[2];
                float[][] fArr3 = AbstractC0839b.f9274b;
                float[] fArr4 = fArr3[0];
                float f17 = (fArr4[2] * signum3) + (fArr4[1] * f16) + (fArr4[0] * f15);
                float[] fArr5 = fArr3[1];
                float f18 = fArr5[1] * f16;
                float f19 = fArr5[2] * signum3;
                float f20 = f15 * fArr3[2][0];
                return AbstractC0870a.a(f17, f19 + f18 + (fArr5[0] * f15), (signum3 * fArr[2]) + (f16 * fArr[1]) + f20);
            }
        }
        f3 = 0.0f;
        float pow4 = (float) Math.pow(f3 / Math.pow(1.64d - Math.pow(0.29d, c0851n.f9303f), 0.73d), 1.1111111111111112d);
        double d42 = (this.f9267a * 3.1415927f) / 180.0f;
        float pow22 = c0851n.f9298a * ((float) Math.pow(f5 / 100.0d, (1.0d / c0851n.f9301d) / c0851n.f9307j));
        float cos3 = ((float) (Math.cos(2.0d + d42) + 3.8d)) * 0.25f * 3846.1538f * c0851n.f9302e * c0851n.f9300c;
        float f62 = pow22 / c0851n.f9299b;
        float sin2 = (float) Math.sin(d42);
        float cos22 = (float) Math.cos(d42);
        float f72 = (((0.305f + f62) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (cos3 * 23.0f)));
        float f82 = cos22 * f72;
        float f92 = f72 * sin2;
        float f102 = f62 * 460.0f;
        float f112 = ((288.0f * f92) + ((451.0f * f82) + f102)) / 1403.0f;
        float f122 = ((f102 - (891.0f * f82)) - (261.0f * f92)) / 1403.0f;
        float f132 = ((f102 - (f82 * 220.0f)) - (f92 * 6300.0f)) / 1403.0f;
        float signum4 = Math.signum(f112);
        float f142 = 100.0f / c0851n.f9305h;
        float pow32 = signum4 * f142 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f112) * 27.13d) / (400.0d - Math.abs(f112))), 2.380952380952381d));
        float signum22 = Math.signum(f122) * f142 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f122) * 27.13d) / (400.0d - Math.abs(f122))), 2.380952380952381d));
        float[] fArr22 = c0851n.f9304g;
        float f152 = pow32 / fArr22[0];
        float f162 = signum22 / fArr22[1];
        float signum32 = ((Math.signum(f132) * f142) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f132) * 27.13d) / (400.0d - Math.abs(f132))), 2.380952380952381d))) / fArr22[2];
        float[][] fArr32 = AbstractC0839b.f9274b;
        float[] fArr42 = fArr32[0];
        float f172 = (fArr42[2] * signum32) + (fArr42[1] * f162) + (fArr42[0] * f152);
        float[] fArr52 = fArr32[1];
        float f182 = fArr52[1] * f162;
        float f192 = fArr52[2] * signum32;
        float f202 = f152 * fArr32[2][0];
        return AbstractC0870a.a(f172, f192 + f182 + (fArr52[0] * f152), (signum32 * fArr[2]) + (f162 * fArr[1]) + f202);
    }
}
