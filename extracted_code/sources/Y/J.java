package Y;

import U.AbstractC0123a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a  reason: collision with root package name */
    public int f3086a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3087b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3088c;

    /* renamed from: d  reason: collision with root package name */
    public int f3089d;

    /* renamed from: e  reason: collision with root package name */
    public Object f3090e;

    public J(int i3) {
        this.f3086a = i3;
        byte[] bArr = new byte[131];
        this.f3090e = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i3, int i4) {
        if (!this.f3087b) {
            return;
        }
        int i5 = i4 - i3;
        byte[] bArr2 = (byte[]) this.f3090e;
        int length = bArr2.length;
        int i6 = this.f3089d;
        if (length < i6 + i5) {
            this.f3090e = Arrays.copyOf(bArr2, (i6 + i5) * 2);
        }
        System.arraycopy(bArr, i3, (byte[]) this.f3090e, this.f3089d, i5);
        this.f3089d += i5;
    }

    public boolean b(int i3) {
        if (!this.f3087b) {
            return false;
        }
        this.f3089d -= i3;
        this.f3087b = false;
        this.f3088c = true;
        return true;
    }

    public void c(int i3) {
        boolean z3;
        boolean z4 = this.f3087b;
        if (i3 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f3087b = z4 | z3;
        this.f3086a += i3;
    }

    public void d() {
        this.f3087b = false;
        this.f3088c = false;
    }

    public void e(int i3) {
        boolean z3 = true;
        AbstractC0123a.j(!this.f3087b);
        if (i3 != this.f3086a) {
            z3 = false;
        }
        this.f3087b = z3;
        if (z3) {
            this.f3089d = 3;
            this.f3088c = false;
        }
    }

    public J(e0 e0Var) {
        this.f3090e = e0Var;
    }
}
