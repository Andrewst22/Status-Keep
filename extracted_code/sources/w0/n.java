package w0;

import R.C0113p;
import R.InterfaceC0107j;
import java.io.EOFException;
import n2.AbstractC0662e;
/* loaded from: classes.dex */
public final class n implements G {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f9619a = new byte[4096];

    @Override // w0.G
    public final void a(U.t tVar, int i3, int i4) {
        tVar.H(i3);
    }

    @Override // w0.G
    public final int d(InterfaceC0107j interfaceC0107j, int i3, boolean z3) {
        return e(interfaceC0107j, i3, z3);
    }

    @Override // w0.G
    public final int e(InterfaceC0107j interfaceC0107j, int i3, boolean z3) {
        byte[] bArr = this.f9619a;
        int read = interfaceC0107j.read(bArr, 0, Math.min(bArr.length, i3));
        if (read == -1) {
            if (z3) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // w0.G
    public final /* synthetic */ void f(int i3, U.t tVar) {
        AbstractC0662e.a(this, tVar, i3);
    }

    @Override // w0.G
    public final void c(C0113p c0113p) {
    }

    @Override // w0.G
    public final void b(long j3, int i3, int i4, int i5, F f3) {
    }
}
