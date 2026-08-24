package R0;

import U.A;
import java.math.BigInteger;
import w0.B;
import w0.InterfaceC0890A;
import w0.z;
/* loaded from: classes.dex */
public final class a implements InterfaceC0890A {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f2013a;

    public a(b bVar) {
        this.f2013a = bVar;
    }

    @Override // w0.InterfaceC0890A
    public final boolean c() {
        return true;
    }

    @Override // w0.InterfaceC0890A
    public final z i(long j3) {
        b bVar = this.f2013a;
        BigInteger valueOf = BigInteger.valueOf((bVar.f2017p.f2053i * j3) / 1000000);
        long j4 = bVar.f2016o;
        long j5 = bVar.f2015n;
        B b3 = new B(j3, A.k((valueOf.multiply(BigInteger.valueOf(j4 - j5)).divide(BigInteger.valueOf(bVar.f2019r)).longValue() + j5) - 30000, bVar.f2015n, j4 - 1));
        return new z(b3, b3);
    }

    @Override // w0.InterfaceC0890A
    public final long k() {
        b bVar = this.f2013a;
        return (bVar.f2019r * 1000000) / bVar.f2017p.f2053i;
    }
}
