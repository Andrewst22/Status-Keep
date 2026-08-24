package l0;

import U.A;
import U.AbstractC0123a;
import U.s;
import U.t;
import a.AbstractC0155a;
import k0.C0555j;
import w0.AbstractC0892b;
import w0.C0893c;
import w0.G;
import w0.q;
/* renamed from: l0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589b implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0555j f7974a;

    /* renamed from: c  reason: collision with root package name */
    public G f7976c;

    /* renamed from: d  reason: collision with root package name */
    public int f7977d;

    /* renamed from: f  reason: collision with root package name */
    public long f7979f;

    /* renamed from: g  reason: collision with root package name */
    public long f7980g;

    /* renamed from: b  reason: collision with root package name */
    public final s f7975b = new s();

    /* renamed from: e  reason: collision with root package name */
    public long f7978e = -9223372036854775807L;

    public C0589b(C0555j c0555j) {
        this.f7974a = c0555j;
    }

    @Override // l0.i
    public final void b(long j3, long j4) {
        this.f7978e = j3;
        this.f7980g = j4;
    }

    @Override // l0.i
    public final void c(t tVar, long j3, int i3, boolean z3) {
        int u3 = tVar.u() & 3;
        int u4 = tVar.u() & 255;
        long M3 = AbstractC0155a.M(this.f7980g, j3, this.f7978e, this.f7974a.f7605b);
        if (u3 != 0) {
            if (u3 != 1 && u3 != 2) {
                if (u3 != 3) {
                    throw new IllegalArgumentException(String.valueOf(u3));
                }
            } else {
                int i4 = this.f7977d;
                if (i4 > 0) {
                    G g3 = this.f7976c;
                    int i5 = A.f2405a;
                    g3.b(this.f7979f, 1, i4, 0, null);
                    this.f7977d = 0;
                }
            }
            int a3 = tVar.a();
            G g4 = this.f7976c;
            g4.getClass();
            g4.f(a3, tVar);
            int i6 = this.f7977d + a3;
            this.f7977d = i6;
            this.f7979f = M3;
            if (z3 && u3 == 3) {
                G g5 = this.f7976c;
                int i7 = A.f2405a;
                g5.b(M3, 1, i6, 0, null);
                this.f7977d = 0;
                return;
            }
            return;
        }
        int i8 = this.f7977d;
        if (i8 > 0) {
            G g6 = this.f7976c;
            int i9 = A.f2405a;
            g6.b(this.f7979f, 1, i8, 0, null);
            this.f7977d = 0;
        }
        if (u4 == 1) {
            int a4 = tVar.a();
            G g7 = this.f7976c;
            g7.getClass();
            g7.f(a4, tVar);
            G g8 = this.f7976c;
            int i10 = A.f2405a;
            g8.b(M3, 1, a4, 0, null);
            return;
        }
        byte[] bArr = tVar.f2477a;
        s sVar = this.f7975b;
        sVar.getClass();
        sVar.p(bArr, bArr.length);
        sVar.u(2);
        for (int i11 = 0; i11 < u4; i11++) {
            C0893c o3 = AbstractC0892b.o(sVar);
            G g9 = this.f7976c;
            g9.getClass();
            int i12 = o3.f9559d;
            g9.f(i12, tVar);
            G g10 = this.f7976c;
            int i13 = A.f2405a;
            g10.b(M3, 1, o3.f9559d, 0, null);
            M3 += (o3.f9560e / o3.f9557b) * 1000000;
            sVar.u(i12);
        }
    }

    @Override // l0.i
    public final void d(long j3) {
        boolean z3;
        if (this.f7978e == -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        this.f7978e = j3;
    }

    @Override // l0.i
    public final void e(q qVar, int i3) {
        G w3 = qVar.w(i3, 1);
        this.f7976c = w3;
        w3.c(this.f7974a.f7606c);
    }
}
