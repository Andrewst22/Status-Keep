package e0;

import a.AbstractC0155a;
import java.util.Arrays;
import p0.AbstractC0732e;
/* loaded from: classes.dex */
public final class f extends AbstractC0732e {

    /* renamed from: v  reason: collision with root package name */
    public byte[] f5229v;

    /* renamed from: w  reason: collision with root package name */
    public volatile boolean f5230w;
    public byte[] x;

    @Override // s0.k
    public final void b() {
        try {
            this.f8786u.j(this.f8779n);
            int i3 = 0;
            int i4 = 0;
            while (i3 != -1 && !this.f5230w) {
                byte[] bArr = this.f5229v;
                if (bArr.length < i4 + 16384) {
                    this.f5229v = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i3 = this.f8786u.read(this.f5229v, i4, 16384);
                if (i3 != -1) {
                    i4 += i3;
                }
            }
            if (!this.f5230w) {
                this.x = Arrays.copyOf(this.f5229v, i4);
            }
            AbstractC0155a.r(this.f8786u);
        } catch (Throwable th) {
            AbstractC0155a.r(this.f8786u);
            throw th;
        }
    }

    @Override // s0.k
    public final void c() {
        this.f5230w = true;
    }
}
