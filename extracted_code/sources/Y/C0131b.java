package Y;

import android.content.Context;
/* renamed from: Y.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3216a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3217b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3218c;

    public void a(double d3, double d4) {
        boolean z3 = this.f3216a;
        double[] dArr = (double[]) this.f3217b;
        double d5 = 1.0d;
        if (!z3) {
            d5 = 1.0d / (((dArr[7] * d4) + (dArr[3] * d3)) + dArr[15]);
        }
        double d6 = ((dArr[4] * d4) + (dArr[0] * d3) + dArr[12]) * d5;
        double d7 = ((dArr[5] * d4) + (dArr[1] * d3) + dArr[13]) * d5;
        double[] dArr2 = (double[]) this.f3218c;
        if (d6 < dArr2[0]) {
            dArr2[0] = d6;
        } else if (d6 > dArr2[1]) {
            dArr2[1] = d6;
        }
        if (d7 < dArr2[2]) {
            dArr2[2] = d7;
        } else if (d7 > dArr2[3]) {
            dArr2[3] = d7;
        }
    }

    public void b() {
        if (this.f3216a) {
            ((Context) this.f3217b).unregisterReceiver((RunnableC0130a) this.f3218c);
            this.f3216a = false;
        }
    }
}
