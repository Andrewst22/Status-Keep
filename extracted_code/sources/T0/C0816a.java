package t0;

import s0.k;
import u0.v;
import w0.G;
import w0.InterfaceC0890A;
import w0.InterfaceC0897g;
import w0.n;
import w0.q;
/* renamed from: t0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0816a implements k, v, InterfaceC0897g, q {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f9238m;

    public /* synthetic */ C0816a(int i3) {
        this.f9238m = i3;
    }

    @Override // s0.k
    public void b() {
        synchronized (AbstractC0817b.f9239a) {
            Object obj = AbstractC0817b.f9240b;
            synchronized (obj) {
                if (AbstractC0817b.f9241c) {
                    return;
                }
                long a3 = AbstractC0817b.a();
                synchronized (obj) {
                    AbstractC0817b.f9242d = a3;
                    AbstractC0817b.f9241c = true;
                }
            }
        }
    }

    @Override // w0.q
    public void n(InterfaceC0890A interfaceC0890A) {
        switch (this.f9238m) {
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // w0.q
    public void s() {
        switch (this.f9238m) {
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    @Override // w0.q
    public G w(int i3, int i4) {
        switch (this.f9238m) {
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                throw new UnsupportedOperationException();
            default:
                return new n();
        }
    }

    private final void e() {
    }

    @Override // s0.k
    public void c() {
    }

    @Override // u0.v
    public void d() {
    }

    @Override // u0.v
    public void f() {
    }

    private final void g(InterfaceC0890A interfaceC0890A) {
    }

    @Override // w0.InterfaceC0897g
    public long a(long j3) {
        return j3;
    }
}
