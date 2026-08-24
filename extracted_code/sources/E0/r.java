package e0;

import R.C0112o;
import R.C0113p;
import R.InterfaceC0107j;
import U.A;
import U.AbstractC0123a;
import java.io.EOFException;
import java.util.Arrays;
import n2.AbstractC0662e;
import w0.F;
import w0.G;
/* loaded from: classes.dex */
public final class r implements G {

    /* renamed from: f  reason: collision with root package name */
    public static final C0113p f5325f;

    /* renamed from: g  reason: collision with root package name */
    public static final C0113p f5326g;

    /* renamed from: a  reason: collision with root package name */
    public final G f5327a;

    /* renamed from: b  reason: collision with root package name */
    public final C0113p f5328b;

    /* renamed from: c  reason: collision with root package name */
    public C0113p f5329c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f5330d;

    /* renamed from: e  reason: collision with root package name */
    public int f5331e;

    static {
        C0112o c0112o = new C0112o();
        c0112o.f1937l = R.G.l("application/id3");
        f5325f = new C0113p(c0112o);
        C0112o c0112o2 = new C0112o();
        c0112o2.f1937l = R.G.l("application/x-emsg");
        f5326g = new C0113p(c0112o2);
    }

    public r(G g3, int i3) {
        this.f5327a = g3;
        if (i3 != 1) {
            if (i3 == 3) {
                this.f5328b = f5326g;
            } else {
                throw new IllegalArgumentException(D2.h.k("Unknown metadataType: ", i3));
            }
        } else {
            this.f5328b = f5325f;
        }
        this.f5330d = new byte[0];
        this.f5331e = 0;
    }

    @Override // w0.G
    public final void a(U.t tVar, int i3, int i4) {
        int i5 = this.f5331e + i3;
        byte[] bArr = this.f5330d;
        if (bArr.length < i5) {
            this.f5330d = Arrays.copyOf(bArr, (i5 / 2) + i5);
        }
        tVar.f(this.f5330d, this.f5331e, i3);
        this.f5331e += i3;
    }

    @Override // w0.G
    public final void b(long j3, int i3, int i4, int i5, F f3) {
        this.f5329c.getClass();
        int i6 = this.f5331e - i5;
        U.t tVar = new U.t(Arrays.copyOfRange(this.f5330d, i6 - i4, i6));
        byte[] bArr = this.f5330d;
        System.arraycopy(bArr, i6, bArr, 0, i5);
        this.f5331e = i5;
        String str = this.f5329c.f1974m;
        C0113p c0113p = this.f5328b;
        if (!A.a(str, c0113p.f1974m)) {
            if ("application/x-emsg".equals(this.f5329c.f1974m)) {
                H0.a d02 = G0.c.d0(tVar);
                C0113p c3 = d02.c();
                String str2 = c0113p.f1974m;
                if (c3 != null && A.a(str2, c3.f1974m)) {
                    byte[] b3 = d02.b();
                    b3.getClass();
                    tVar = new U.t(b3);
                } else {
                    C0113p c4 = d02.c();
                    AbstractC0123a.A("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + c4);
                    return;
                }
            } else {
                AbstractC0123a.A("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f5329c.f1974m);
                return;
            }
        }
        int a3 = tVar.a();
        G g3 = this.f5327a;
        g3.f(a3, tVar);
        g3.b(j3, i3, a3, 0, f3);
    }

    @Override // w0.G
    public final void c(C0113p c0113p) {
        this.f5329c = c0113p;
        this.f5327a.c(this.f5328b);
    }

    @Override // w0.G
    public final int d(InterfaceC0107j interfaceC0107j, int i3, boolean z3) {
        return e(interfaceC0107j, i3, z3);
    }

    @Override // w0.G
    public final int e(InterfaceC0107j interfaceC0107j, int i3, boolean z3) {
        int i4 = this.f5331e + i3;
        byte[] bArr = this.f5330d;
        if (bArr.length < i4) {
            this.f5330d = Arrays.copyOf(bArr, (i4 / 2) + i4);
        }
        int read = interfaceC0107j.read(this.f5330d, this.f5331e, i3);
        if (read == -1) {
            if (z3) {
                return -1;
            }
            throw new EOFException();
        }
        this.f5331e += read;
        return read;
    }

    @Override // w0.G
    public final /* synthetic */ void f(int i3, U.t tVar) {
        AbstractC0662e.a(this, tVar, i3);
    }
}
