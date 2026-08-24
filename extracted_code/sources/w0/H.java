package w0;

import U.AbstractC0123a;
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f9522a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    public boolean f9523b;

    /* renamed from: c  reason: collision with root package name */
    public int f9524c;

    /* renamed from: d  reason: collision with root package name */
    public long f9525d;

    /* renamed from: e  reason: collision with root package name */
    public int f9526e;

    /* renamed from: f  reason: collision with root package name */
    public int f9527f;

    /* renamed from: g  reason: collision with root package name */
    public int f9528g;

    public final void a(G g3, F f3) {
        if (this.f9524c > 0) {
            g3.b(this.f9525d, this.f9526e, this.f9527f, this.f9528g, f3);
            this.f9524c = 0;
        }
    }

    public final void b(G g3, long j3, int i3, int i4, int i5, F f3) {
        boolean z3;
        if (this.f9528g <= i4 + i5) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.i("TrueHD chunk samples must be contiguous in the sample queue.", z3);
        if (!this.f9523b) {
            return;
        }
        int i6 = this.f9524c;
        int i7 = i6 + 1;
        this.f9524c = i7;
        if (i6 == 0) {
            this.f9525d = j3;
            this.f9526e = i3;
            this.f9527f = 0;
        }
        this.f9527f += i4;
        this.f9528g = i5;
        if (i7 >= 16) {
            a(g3, f3);
        }
    }

    public final void c(p pVar) {
        char c3;
        if (this.f9523b) {
            return;
        }
        byte[] bArr = this.f9522a;
        int i3 = 0;
        pVar.z(bArr, 0, 10);
        pVar.c();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b3 = bArr[7];
            if ((b3 & 254) == 186) {
                if ((b3 & 255) == 187) {
                    c3 = '\t';
                } else {
                    c3 = '\b';
                }
                i3 = 40 << ((bArr[c3] >> 4) & 7);
            }
        }
        if (i3 == 0) {
            return;
        }
        this.f9523b = true;
    }
}
