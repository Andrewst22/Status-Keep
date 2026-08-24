package R0;

import D1.I;
import R.C0112o;
import R.C0113p;
import R.F;
import R.G;
import U.AbstractC0123a;
import U.t;
import java.util.ArrayList;
import java.util.Arrays;
import w0.AbstractC0892b;
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f2042o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f2043p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n  reason: collision with root package name */
    public boolean f2044n;

    public static boolean e(t tVar, byte[] bArr) {
        if (tVar.a() < bArr.length) {
            return false;
        }
        int i3 = tVar.f2478b;
        byte[] bArr2 = new byte[bArr.length];
        tVar.f(bArr2, 0, bArr.length);
        tVar.G(i3);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // R0.i
    public final long b(t tVar) {
        byte[] bArr = tVar.f2477a;
        byte b3 = 0;
        byte b4 = bArr[0];
        if (bArr.length > 1) {
            b3 = bArr[1];
        }
        return (this.f2053i * AbstractC0892b.l(b4, b3)) / 1000000;
    }

    @Override // R0.i
    public final boolean c(t tVar, long j3, B1.a aVar) {
        if (e(tVar, f2042o)) {
            byte[] copyOf = Arrays.copyOf(tVar.f2477a, tVar.f2479c);
            int i3 = copyOf[9] & 255;
            ArrayList c3 = AbstractC0892b.c(copyOf);
            if (((C0113p) aVar.f50n) != null) {
                return true;
            }
            C0112o c0112o = new C0112o();
            c0112o.f1937l = G.l("audio/opus");
            c0112o.f1950z = i3;
            c0112o.f1917A = 48000;
            c0112o.f1940o = c3;
            aVar.f50n = new C0113p(c0112o);
            return true;
        } else if (e(tVar, f2043p)) {
            AbstractC0123a.k((C0113p) aVar.f50n);
            if (this.f2044n) {
                return true;
            }
            this.f2044n = true;
            tVar.H(8);
            F s3 = AbstractC0892b.s(I.k((String[]) AbstractC0892b.v(tVar, false, false).f7632n));
            if (s3 == null) {
                return true;
            }
            C0112o a3 = ((C0113p) aVar.f50n).a();
            a3.f1935j = s3.e(((C0113p) aVar.f50n).f1972k);
            aVar.f50n = new C0113p(a3);
            return true;
        } else {
            AbstractC0123a.k((C0113p) aVar.f50n);
            return false;
        }
    }

    @Override // R0.i
    public final void d(boolean z3) {
        super.d(z3);
        if (z3) {
            this.f2044n = false;
        }
    }
}
