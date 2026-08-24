package w0;
/* renamed from: w0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0895e implements InterfaceC0890A {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0897g f9574a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9575b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9576c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9577d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9578e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9579f;

    public C0895e(InterfaceC0897g interfaceC0897g, long j3, long j4, long j5, long j6, long j7) {
        this.f9574a = interfaceC0897g;
        this.f9575b = j3;
        this.f9576c = j4;
        this.f9577d = j5;
        this.f9578e = j6;
        this.f9579f = j7;
    }

    @Override // w0.InterfaceC0890A
    public final boolean c() {
        return true;
    }

    @Override // w0.InterfaceC0890A
    public final z i(long j3) {
        B b3 = new B(j3, C0896f.a(this.f9574a.a(j3), 0L, this.f9576c, this.f9577d, this.f9578e, this.f9579f));
        return new z(b3, b3);
    }

    @Override // w0.InterfaceC0890A
    public final long k() {
        return this.f9575b;
    }
}
