package c1;

import U.AbstractC0123a;
/* renamed from: c1.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245l {

    /* renamed from: a  reason: collision with root package name */
    public final w0.G f4928a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4929b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4930c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4931d;

    /* renamed from: e  reason: collision with root package name */
    public int f4932e;

    /* renamed from: f  reason: collision with root package name */
    public int f4933f;

    /* renamed from: g  reason: collision with root package name */
    public long f4934g;

    /* renamed from: h  reason: collision with root package name */
    public long f4935h;

    public C0245l(w0.G g3) {
        this.f4928a = g3;
    }

    public final void a(byte[] bArr, int i3, int i4) {
        boolean z3;
        if (this.f4930c) {
            int i5 = this.f4933f;
            int i6 = (i3 + 1) - i5;
            if (i6 < i4) {
                if (((bArr[i6] & 192) >> 6) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f4931d = z3;
                this.f4930c = false;
                return;
            }
            this.f4933f = (i4 - i3) + i5;
        }
    }

    public final void b(int i3, long j3, boolean z3) {
        boolean z4;
        if (this.f4935h != -9223372036854775807L) {
            z4 = true;
        } else {
            z4 = false;
        }
        AbstractC0123a.j(z4);
        if (this.f4932e == 182 && z3 && this.f4929b) {
            boolean z5 = this.f4931d;
            long j4 = this.f4935h;
            this.f4928a.b(j4, z5 ? 1 : 0, (int) (j3 - this.f4934g), i3, null);
        }
        if (this.f4932e != 179) {
            this.f4934g = j3;
        }
    }
}
