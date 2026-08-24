package s0;

import U.A;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public int f9159c;

    /* renamed from: d  reason: collision with root package name */
    public int f9160d;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9157a = true;

    /* renamed from: b  reason: collision with root package name */
    public final int f9158b = 65536;

    /* renamed from: e  reason: collision with root package name */
    public int f9161e = 0;

    /* renamed from: f  reason: collision with root package name */
    public a[] f9162f = new a[100];

    public final synchronized void a(int i3) {
        boolean z3;
        if (i3 < this.f9159c) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f9159c = i3;
        if (z3) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, A.g(this.f9159c, this.f9158b) - this.f9160d);
        int i3 = this.f9161e;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.f9162f, max, i3, (Object) null);
        this.f9161e = max;
    }
}
