package E0;

import w0.B;
import w0.InterfaceC0890A;
import w0.u;
import w0.z;
/* loaded from: classes.dex */
public final class d extends u {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0890A f360b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f361c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, InterfaceC0890A interfaceC0890A, InterfaceC0890A interfaceC0890A2) {
        super(interfaceC0890A);
        this.f361c = cVar;
        this.f360b = interfaceC0890A2;
    }

    @Override // w0.u, w0.InterfaceC0890A
    public final z i(long j3) {
        z i3 = this.f360b.i(j3);
        B b3 = i3.f9661a;
        long j4 = b3.f9509a;
        long j5 = this.f361c.f358n;
        B b4 = new B(j4, b3.f9510b + j5);
        B b5 = i3.f9662b;
        return new z(b4, new B(b5.f9509a, b5.f9510b + j5));
    }
}
