package R0;

import U.AbstractC0123a;
import U.t;
import W.p;
import java.io.EOFException;
import w0.l;
/* loaded from: classes.dex */
public final class e implements W.g {

    /* renamed from: m  reason: collision with root package name */
    public int f2030m;

    /* renamed from: n  reason: collision with root package name */
    public int f2031n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2032o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f2033p;

    /* renamed from: q  reason: collision with root package name */
    public Object f2034q;

    public e(int i3) {
        switch (i3) {
            case 1:
                this.f2033p = new B1.a(9);
                this.f2030m = 8000;
                this.f2031n = 8000;
                return;
            default:
                this.f2033p = new f();
                this.f2034q = new t(new byte[65025], 0);
                this.f2030m = -1;
                return;
        }
    }

    @Override // W.g
    public W.h a() {
        return new p((String) this.f2034q, this.f2030m, this.f2031n, this.f2032o, (B1.a) this.f2033p);
    }

    public int b(int i3) {
        int i4;
        int i5 = 0;
        this.f2031n = 0;
        do {
            int i6 = this.f2031n;
            int i7 = i3 + i6;
            f fVar = (f) this.f2033p;
            if (i7 >= fVar.f2037c) {
                break;
            }
            int[] iArr = fVar.f2040f;
            this.f2031n = i6 + 1;
            i4 = iArr[i6 + i3];
            i5 += i4;
        } while (i4 == 255);
        return i5;
    }

    public boolean c(l lVar) {
        boolean z3;
        boolean z4;
        int i3;
        if (lVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        boolean z5 = this.f2032o;
        t tVar = (t) this.f2034q;
        if (z5) {
            this.f2032o = false;
            tVar.D(0);
        }
        while (!this.f2032o) {
            int i4 = this.f2030m;
            f fVar = (f) this.f2033p;
            if (i4 < 0) {
                if (fVar.b(lVar, -1L) && fVar.a(lVar, true)) {
                    int i5 = fVar.f2038d;
                    if ((fVar.f2035a & 1) == 1 && tVar.f2479c == 0) {
                        i5 += b(0);
                        i3 = this.f2031n;
                    } else {
                        i3 = 0;
                    }
                    try {
                        lVar.d(i5);
                        this.f2030m = i3;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int b3 = b(this.f2030m);
            int i6 = this.f2030m + this.f2031n;
            if (b3 > 0) {
                tVar.b(tVar.f2479c + b3);
                try {
                    lVar.i(tVar.f2477a, tVar.f2479c, b3, false);
                    tVar.F(tVar.f2479c + b3);
                    if (fVar.f2040f[i6 - 1] != 255) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.f2032o = z4;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i6 == fVar.f2037c) {
                i6 = -1;
            }
            this.f2030m = i6;
        }
        return true;
    }
}
