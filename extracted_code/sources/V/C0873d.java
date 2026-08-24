package v;

import android.graphics.Path;
import android.util.Log;
import m2.AbstractC0635d;
/* renamed from: v.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0873d {

    /* renamed from: a  reason: collision with root package name */
    public char f9468a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f9469b;

    public C0873d(char c3, float[] fArr) {
        this.f9468a = c3;
        this.f9469b = fArr;
    }

    public static void a(Path path, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z3, boolean z4) {
        double d3;
        double d4;
        double radians = Math.toRadians(f9);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d5 = f3;
        double d6 = f4;
        double d7 = (d6 * sin) + (d5 * cos);
        double d8 = d5;
        double d9 = f7;
        double d10 = d7 / d9;
        double d11 = f8;
        double d12 = ((d6 * cos) + ((-f3) * sin)) / d11;
        double d13 = d6;
        double d14 = f6;
        double d15 = ((d14 * sin) + (f5 * cos)) / d9;
        double d16 = ((d14 * cos) + ((-f5) * sin)) / d11;
        double d17 = d10 - d15;
        double d18 = d12 - d16;
        double d19 = (d10 + d15) / 2.0d;
        double d20 = (d12 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d21);
            float sqrt = (float) (Math.sqrt(d21) / 1.99999d);
            a(path, f3, f4, f5, f6, f7 * sqrt, f8 * sqrt, f9, z3, z4);
            return;
        }
        double sqrt2 = Math.sqrt(d22);
        double d23 = d17 * sqrt2;
        double d24 = sqrt2 * d18;
        if (z3 == z4) {
            d3 = d19 - d24;
            d4 = d20 + d23;
        } else {
            d3 = d19 + d24;
            d4 = d20 - d23;
        }
        double atan2 = Math.atan2(d12 - d4, d10 - d3);
        double atan22 = Math.atan2(d16 - d4, d15 - d3) - atan2;
        int i3 = 0;
        int i4 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z4 != (i4 >= 0)) {
            atan22 = i4 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d25 = d3 * d9;
        double d26 = d4 * d11;
        double d27 = (d25 * cos) - (d26 * sin);
        double d28 = (d26 * cos) + (d25 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d29 = -d9;
        double d30 = d29 * cos2;
        double d31 = d11 * sin2;
        double d32 = (d30 * sin3) - (d31 * cos3);
        double d33 = d29 * sin2;
        double d34 = d11 * cos2;
        double d35 = (cos3 * d34) + (sin3 * d33);
        double d36 = atan22 / ceil;
        double d37 = atan2;
        while (i3 < ceil) {
            double d38 = d37 + d36;
            double sin4 = Math.sin(d38);
            double cos4 = Math.cos(d38);
            double d39 = d36;
            double d40 = (((d9 * cos2) * cos4) + d27) - (d31 * sin4);
            double d41 = d27;
            double d42 = (d34 * sin4) + (d9 * sin2 * cos4) + d28;
            double d43 = (d30 * sin4) - (d31 * cos4);
            double d44 = (cos4 * d34) + (sin4 * d33);
            double d45 = d38 - d37;
            double tan = Math.tan(d45 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d32 * sqrt3) + d8), (float) ((d35 * sqrt3) + d13), (float) (d40 - (sqrt3 * d43)), (float) (d42 - (sqrt3 * d44)), (float) d40, (float) d42);
            i3++;
            d34 = d34;
            d33 = d33;
            ceil = ceil;
            cos2 = cos2;
            d37 = d38;
            d9 = d9;
            d35 = d44;
            d32 = d43;
            d8 = d40;
            d13 = d42;
            d36 = d39;
            d27 = d41;
        }
    }

    public static void b(C0873d[] c0873dArr, Path path) {
        int i3;
        int i4;
        char c3;
        int i5;
        int i6;
        C0873d c0873d;
        boolean z3;
        boolean z4;
        float f3;
        float f4;
        boolean z5;
        boolean z6;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        C0873d[] c0873dArr2 = c0873dArr;
        float[] fArr = new float[6];
        int length = c0873dArr2.length;
        char c4 = 'm';
        int i7 = 0;
        while (i7 < length) {
            C0873d c0873d2 = c0873dArr2[i7];
            char c5 = c0873d2.f9468a;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[2];
            float f18 = fArr[3];
            float f19 = fArr[4];
            float f20 = fArr[5];
            switch (c5) {
                case 'A':
                case 'a':
                    i3 = 7;
                    break;
                case 'C':
                case 'c':
                    i3 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i3 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i3 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                default:
                    i3 = 2;
                    break;
            }
            float f21 = f19;
            float f22 = f20;
            float f23 = f15;
            float f24 = f16;
            int i8 = 0;
            while (true) {
                float[] fArr2 = c0873d2.f9469b;
                if (i8 < fArr2.length) {
                    if (c5 != 'A') {
                        if (c5 != 'C') {
                            if (c5 != 'H') {
                                if (c5 != 'Q') {
                                    if (c5 != 'V') {
                                        if (c5 != 'a') {
                                            if (c5 != 'c') {
                                                if (c5 != 'h') {
                                                    if (c5 != 'q') {
                                                        if (c5 != 'v') {
                                                            if (c5 != 'L') {
                                                                if (c5 != 'M') {
                                                                    if (c5 != 'S') {
                                                                        if (c5 != 'T') {
                                                                            if (c5 != 'l') {
                                                                                if (c5 != 'm') {
                                                                                    if (c5 != 's') {
                                                                                        if (c5 != 't') {
                                                                                            i4 = i8;
                                                                                        } else {
                                                                                            if (c4 != 'q' && c4 != 't' && c4 != 'Q' && c4 != 'T') {
                                                                                                f14 = 0.0f;
                                                                                                f13 = 0.0f;
                                                                                            } else {
                                                                                                f13 = f23 - f17;
                                                                                                f14 = f24 - f18;
                                                                                            }
                                                                                            int i9 = i8 + 1;
                                                                                            path.rQuadTo(f13, f14, fArr2[i8], fArr2[i9]);
                                                                                            float f25 = f13 + f23;
                                                                                            float f26 = f14 + f24;
                                                                                            f23 += fArr2[i8];
                                                                                            f24 += fArr2[i9];
                                                                                            f18 = f26;
                                                                                            i4 = i8;
                                                                                            c3 = c5;
                                                                                            i5 = i7;
                                                                                            i6 = length;
                                                                                            f17 = f25;
                                                                                        }
                                                                                    } else {
                                                                                        if (c4 != 'c' && c4 != 's' && c4 != 'C' && c4 != 'S') {
                                                                                            f11 = 0.0f;
                                                                                            f12 = 0.0f;
                                                                                        } else {
                                                                                            float f27 = f23 - f17;
                                                                                            f11 = f24 - f18;
                                                                                            f12 = f27;
                                                                                        }
                                                                                        int i10 = i8 + 1;
                                                                                        int i11 = i8 + 2;
                                                                                        int i12 = i8 + 3;
                                                                                        i4 = i8;
                                                                                        float f28 = f24;
                                                                                        float f29 = f23;
                                                                                        path.rCubicTo(f12, f11, fArr2[i8], fArr2[i10], fArr2[i11], fArr2[i12]);
                                                                                        f5 = f29 + fArr2[i4];
                                                                                        f6 = f28 + fArr2[i10];
                                                                                        f7 = f29 + fArr2[i11];
                                                                                        f8 = fArr2[i12] + f28;
                                                                                    }
                                                                                } else {
                                                                                    i4 = i8;
                                                                                    float f30 = fArr2[i4];
                                                                                    f23 += f30;
                                                                                    float f31 = fArr2[i4 + 1];
                                                                                    f24 += f31;
                                                                                    if (i4 > 0) {
                                                                                        path.rLineTo(f30, f31);
                                                                                    } else {
                                                                                        path.rMoveTo(f30, f31);
                                                                                        f22 = f24;
                                                                                        f21 = f23;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i4 = i8;
                                                                                int i13 = i4 + 1;
                                                                                path.rLineTo(fArr2[i4], fArr2[i13]);
                                                                                f23 += fArr2[i4];
                                                                                f24 += fArr2[i13];
                                                                            }
                                                                        } else {
                                                                            i4 = i8;
                                                                            float f32 = f24;
                                                                            float f33 = f23;
                                                                            if (c4 != 'q' && c4 != 't' && c4 != 'Q' && c4 != 'T') {
                                                                                f5 = f33;
                                                                                f6 = f32;
                                                                            } else {
                                                                                f5 = (f33 * 2.0f) - f17;
                                                                                f6 = (f32 * 2.0f) - f18;
                                                                            }
                                                                            int i14 = i4 + 1;
                                                                            path.quadTo(f5, f6, fArr2[i4], fArr2[i14]);
                                                                            f7 = fArr2[i4];
                                                                            f8 = fArr2[i14];
                                                                        }
                                                                    } else {
                                                                        i4 = i8;
                                                                        float f34 = f24;
                                                                        float f35 = f23;
                                                                        if (c4 != 'c' && c4 != 's' && c4 != 'C' && c4 != 'S') {
                                                                            f10 = f35;
                                                                            f9 = f34;
                                                                        } else {
                                                                            f9 = (f34 * 2.0f) - f18;
                                                                            f10 = (f35 * 2.0f) - f17;
                                                                        }
                                                                        int i15 = i4 + 1;
                                                                        int i16 = i4 + 2;
                                                                        int i17 = i4 + 3;
                                                                        path.cubicTo(f10, f9, fArr2[i4], fArr2[i15], fArr2[i16], fArr2[i17]);
                                                                        float f36 = fArr2[i4];
                                                                        float f37 = fArr2[i15];
                                                                        f23 = fArr2[i16];
                                                                        f24 = fArr2[i17];
                                                                        f18 = f37;
                                                                        f17 = f36;
                                                                    }
                                                                } else {
                                                                    i4 = i8;
                                                                    f23 = fArr2[i4];
                                                                    f24 = fArr2[i4 + 1];
                                                                    if (i4 > 0) {
                                                                        path.lineTo(f23, f24);
                                                                    } else {
                                                                        path.moveTo(f23, f24);
                                                                        f22 = f24;
                                                                        f21 = f23;
                                                                    }
                                                                }
                                                            } else {
                                                                i4 = i8;
                                                                int i18 = i4 + 1;
                                                                path.lineTo(fArr2[i4], fArr2[i18]);
                                                                f23 = fArr2[i4];
                                                                f24 = fArr2[i18];
                                                            }
                                                        } else {
                                                            i4 = i8;
                                                            path.rLineTo(0.0f, fArr2[i4]);
                                                            f24 += fArr2[i4];
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                        float f38 = f24;
                                                        float f39 = f23;
                                                        int i19 = i4 + 1;
                                                        int i20 = i4 + 2;
                                                        int i21 = i4 + 3;
                                                        path.rQuadTo(fArr2[i4], fArr2[i19], fArr2[i20], fArr2[i21]);
                                                        float f40 = f39 + fArr2[i4];
                                                        float f41 = f39 + fArr2[i20];
                                                        f24 = f38 + fArr2[i21];
                                                        f18 = fArr2[i19] + f38;
                                                        f17 = f40;
                                                        c3 = c5;
                                                        i5 = i7;
                                                        i6 = length;
                                                        f23 = f41;
                                                    }
                                                    c0873d = c0873d2;
                                                } else {
                                                    i4 = i8;
                                                    path.rLineTo(fArr2[i4], 0.0f);
                                                    f23 += fArr2[i4];
                                                }
                                                c3 = c5;
                                                i5 = i7;
                                                i6 = length;
                                                c0873d = c0873d2;
                                            } else {
                                                i4 = i8;
                                                float f42 = f24;
                                                float f43 = f23;
                                                int i22 = i4 + 2;
                                                int i23 = i4 + 3;
                                                int i24 = i4 + 4;
                                                int i25 = i4 + 5;
                                                path.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i22], fArr2[i23], fArr2[i24], fArr2[i25]);
                                                f5 = f43 + fArr2[i22];
                                                f6 = f42 + fArr2[i23];
                                                f7 = f43 + fArr2[i24];
                                                f8 = fArr2[i25] + f42;
                                            }
                                            f18 = f6;
                                            f17 = f5;
                                            c3 = c5;
                                            i5 = i7;
                                            i6 = length;
                                            f23 = f7;
                                            f24 = f8;
                                            c0873d = c0873d2;
                                        } else {
                                            i4 = i8;
                                            float f44 = f24;
                                            float f45 = f23;
                                            int i26 = i4 + 5;
                                            float f46 = fArr2[i26] + f45;
                                            int i27 = i4 + 6;
                                            float f47 = fArr2[i27] + f44;
                                            float f48 = fArr2[i4];
                                            float f49 = fArr2[i4 + 1];
                                            float f50 = fArr2[i4 + 2];
                                            if (fArr2[i4 + 3] != 0.0f) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (fArr2[i4 + 4] != 0.0f) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            c3 = c5;
                                            i6 = length;
                                            c0873d = c0873d2;
                                            i5 = i7;
                                            a(path, f45, f44, f46, f47, f48, f49, f50, z5, z6);
                                            f23 = f45 + fArr2[i26];
                                            f24 = f44 + fArr2[i27];
                                        }
                                    } else {
                                        i4 = i8;
                                        c3 = c5;
                                        i5 = i7;
                                        i6 = length;
                                        c0873d = c0873d2;
                                        path.lineTo(f23, fArr2[i4]);
                                        f24 = fArr2[i4];
                                    }
                                } else {
                                    i4 = i8;
                                    c3 = c5;
                                    i5 = i7;
                                    i6 = length;
                                    c0873d = c0873d2;
                                    float f51 = fArr2[i4];
                                    int i28 = i4 + 1;
                                    float f52 = fArr2[i28];
                                    int i29 = i4 + 2;
                                    int i30 = i4 + 3;
                                    path.quadTo(f51, f52, fArr2[i29], fArr2[i30]);
                                    f3 = fArr2[i4];
                                    f4 = fArr2[i28];
                                    f23 = fArr2[i29];
                                    f24 = fArr2[i30];
                                }
                            } else {
                                i4 = i8;
                                c3 = c5;
                                i5 = i7;
                                i6 = length;
                                c0873d = c0873d2;
                                path.lineTo(fArr2[i4], f24);
                                f23 = fArr2[i4];
                            }
                            i8 = i4 + i3;
                            c0873d2 = c0873d;
                            length = i6;
                            c4 = c3;
                            c5 = c4;
                            i7 = i5;
                        } else {
                            i4 = i8;
                            c3 = c5;
                            i5 = i7;
                            i6 = length;
                            c0873d = c0873d2;
                            int i31 = i4 + 2;
                            int i32 = i4 + 3;
                            int i33 = i4 + 4;
                            int i34 = i4 + 5;
                            path.cubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i31], fArr2[i32], fArr2[i33], fArr2[i34]);
                            f23 = fArr2[i33];
                            f24 = fArr2[i34];
                            f3 = fArr2[i31];
                            f4 = fArr2[i32];
                        }
                        f17 = f3;
                        f18 = f4;
                        i8 = i4 + i3;
                        c0873d2 = c0873d;
                        length = i6;
                        c4 = c3;
                        c5 = c4;
                        i7 = i5;
                    } else {
                        i4 = i8;
                        float f53 = f24;
                        float f54 = f23;
                        c3 = c5;
                        i5 = i7;
                        i6 = length;
                        c0873d = c0873d2;
                        int i35 = i4 + 5;
                        float f55 = fArr2[i35];
                        int i36 = i4 + 6;
                        float f56 = fArr2[i36];
                        float f57 = fArr2[i4];
                        float f58 = fArr2[i4 + 1];
                        float f59 = fArr2[i4 + 2];
                        if (fArr2[i4 + 3] != 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (fArr2[i4 + 4] != 0.0f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        a(path, f54, f53, f55, f56, f57, f58, f59, z3, z4);
                        f23 = fArr2[i35];
                        f24 = fArr2[i36];
                    }
                    f18 = f24;
                    f17 = f23;
                    i8 = i4 + i3;
                    c0873d2 = c0873d;
                    length = i6;
                    c4 = c3;
                    c5 = c4;
                    i7 = i5;
                }
            }
            fArr[0] = f23;
            fArr[1] = f24;
            fArr[2] = f17;
            fArr[3] = f18;
            fArr[4] = f21;
            fArr[5] = f22;
            c4 = c0873d2.f9468a;
            i7++;
            c0873dArr2 = c0873dArr;
            length = length;
        }
    }

    public C0873d(C0873d c0873d) {
        this.f9468a = c0873d.f9468a;
        float[] fArr = c0873d.f9469b;
        this.f9469b = AbstractC0635d.f(fArr, fArr.length);
    }
}
