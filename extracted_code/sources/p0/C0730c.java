package p0;

import R.C0113p;
import R.InterfaceC0107j;
import U.A;
import U.t;
import n2.AbstractC0662e;
import w0.F;
import w0.G;
/* renamed from: p0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730c implements G {

    /* renamed from: a  reason: collision with root package name */
    public final int f8761a;

    /* renamed from: b  reason: collision with root package name */
    public final C0113p f8762b;

    /* renamed from: c  reason: collision with root package name */
    public final w0.n f8763c = new w0.n();

    /* renamed from: d  reason: collision with root package name */
    public C0113p f8764d;

    /* renamed from: e  reason: collision with root package name */
    public G f8765e;

    /* renamed from: f  reason: collision with root package name */
    public long f8766f;

    public C0730c(int i3, int i4, C0113p c0113p) {
        this.f8761a = i4;
        this.f8762b = c0113p;
    }

    @Override // w0.G
    public final void a(t tVar, int i3, int i4) {
        G g3 = this.f8765e;
        int i5 = A.f2405a;
        g3.f(i3, tVar);
    }

    @Override // w0.G
    public final void b(long j3, int i3, int i4, int i5, F f3) {
        long j4 = this.f8766f;
        if (j4 != -9223372036854775807L && j3 >= j4) {
            this.f8765e = this.f8763c;
        }
        G g3 = this.f8765e;
        int i6 = A.f2405a;
        g3.b(j3, i3, i4, i5, f3);
    }

    @Override // w0.G
    public final void c(C0113p c0113p) {
        C0113p c0113p2 = this.f8762b;
        if (c0113p2 != null) {
            c0113p = c0113p.d(c0113p2);
        }
        this.f8764d = c0113p;
        G g3 = this.f8765e;
        int i3 = A.f2405a;
        g3.c(c0113p);
    }

    @Override // w0.G
    public final int d(InterfaceC0107j interfaceC0107j, int i3, boolean z3) {
        return e(interfaceC0107j, i3, z3);
    }

    @Override // w0.G
    public final int e(InterfaceC0107j interfaceC0107j, int i3, boolean z3) {
        G g3 = this.f8765e;
        int i4 = A.f2405a;
        return g3.d(interfaceC0107j, i3, z3);
    }

    @Override // w0.G
    public final /* synthetic */ void f(int i3, t tVar) {
        AbstractC0662e.a(this, tVar, i3);
    }
}
