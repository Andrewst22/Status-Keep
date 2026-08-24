package x0;

import C1.d;
import D1.I;
import D1.b0;
import R.H;
import U.A;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import w0.G;
import w0.InterfaceC0890A;
import w0.k;
import w0.l;
import w0.o;
import w0.p;
import w0.q;
/* renamed from: x0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0899a implements o {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f9670p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f9671q;

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f9672r;

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f9673s;

    /* renamed from: t  reason: collision with root package name */
    public static final int f9674t;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9677c;

    /* renamed from: d  reason: collision with root package name */
    public long f9678d;

    /* renamed from: e  reason: collision with root package name */
    public int f9679e;

    /* renamed from: f  reason: collision with root package name */
    public int f9680f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9681g;

    /* renamed from: h  reason: collision with root package name */
    public long f9682h;

    /* renamed from: j  reason: collision with root package name */
    public int f9684j;

    /* renamed from: k  reason: collision with root package name */
    public long f9685k;

    /* renamed from: l  reason: collision with root package name */
    public q f9686l;

    /* renamed from: m  reason: collision with root package name */
    public G f9687m;

    /* renamed from: n  reason: collision with root package name */
    public InterfaceC0890A f9688n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f9689o;

    /* renamed from: b  reason: collision with root package name */
    public final int f9676b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f9675a = new byte[1];

    /* renamed from: i  reason: collision with root package name */
    public int f9683i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f9671q = iArr;
        int i3 = A.f2405a;
        Charset charset = d.f153c;
        f9672r = "#!AMR\n".getBytes(charset);
        f9673s = "#!AMR-WB\n".getBytes(charset);
        f9674t = iArr[8];
    }

    public final int a(l lVar) {
        String str;
        boolean z3;
        lVar.f9610r = 0;
        byte[] bArr = this.f9675a;
        lVar.p(bArr, 0, 1, false);
        byte b3 = bArr[0];
        if ((b3 & 131) <= 0) {
            int i3 = (b3 >> 3) & 15;
            if (i3 >= 0 && i3 <= 15 && (((z3 = this.f9677c) && (i3 < 10 || i3 > 13)) || (!z3 && (i3 < 12 || i3 > 14)))) {
                if (z3) {
                    return f9671q[i3];
                }
                return f9670p[i3];
            }
            StringBuilder sb = new StringBuilder("Illegal AMR ");
            if (this.f9677c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb.append(str);
            sb.append(" frame type ");
            sb.append(i3);
            throw H.a(null, sb.toString());
        }
        throw H.a(null, "Invalid padding bits for frame header " + ((int) b3));
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        this.f9678d = 0L;
        this.f9679e = 0;
        this.f9680f = 0;
        if (j3 != 0) {
            InterfaceC0890A interfaceC0890A = this.f9688n;
            if (interfaceC0890A instanceof k) {
                k kVar = (k) interfaceC0890A;
                this.f9685k = (Math.max(0L, j3 - kVar.f9599b) * 8000000) / kVar.f9602e;
                return;
            }
        }
        this.f9685k = 0L;
    }

    public final boolean c(l lVar) {
        lVar.f9610r = 0;
        byte[] bArr = f9672r;
        byte[] bArr2 = new byte[bArr.length];
        lVar.p(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f9677c = false;
            lVar.d(bArr.length);
            return true;
        }
        lVar.f9610r = 0;
        byte[] bArr3 = f9673s;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.p(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f9677c = true;
        lVar.d(bArr3.length);
        return true;
    }

    @Override // w0.o
    public final o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(p pVar) {
        return c((l) pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    @Override // w0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(w0.p r20, R.r r21) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C0899a.f(w0.p, R.r):int");
    }

    @Override // w0.o
    public final void h(q qVar) {
        this.f9686l = qVar;
        this.f9687m = qVar.w(0, 1);
        qVar.s();
    }

    @Override // w0.o
    public final List l() {
        D1.G g3 = I.f197n;
        return b0.f231q;
    }

    @Override // w0.o
    public final void release() {
    }
}
