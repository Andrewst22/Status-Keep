package l1;

import android.animation.TypeEvaluator;
import m2.AbstractC0635d;
import v.C0873d;
/* renamed from: l1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596e implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public C0873d[] f8069a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f3, Object obj, Object obj2) {
        C0873d[] c0873dArr = (C0873d[]) obj;
        C0873d[] c0873dArr2 = (C0873d[]) obj2;
        if (AbstractC0635d.d(c0873dArr, c0873dArr2)) {
            if (!AbstractC0635d.d(this.f8069a, c0873dArr)) {
                this.f8069a = AbstractC0635d.k(c0873dArr);
            }
            for (int i3 = 0; i3 < c0873dArr.length; i3++) {
                C0873d c0873d = this.f8069a[i3];
                C0873d c0873d2 = c0873dArr[i3];
                C0873d c0873d3 = c0873dArr2[i3];
                c0873d.getClass();
                c0873d.f9468a = c0873d2.f9468a;
                int i4 = 0;
                while (true) {
                    float[] fArr = c0873d2.f9469b;
                    if (i4 < fArr.length) {
                        c0873d.f9469b[i4] = (c0873d3.f9469b[i4] * f3) + ((1.0f - f3) * fArr[i4]);
                        i4++;
                    }
                }
            }
            return this.f8069a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
