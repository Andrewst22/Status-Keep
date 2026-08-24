package d1;

import Q0.i;
import U.A;
import java.math.RoundingMode;
import w0.B;
import w0.InterfaceC0890A;
import w0.z;
/* renamed from: d1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256f implements InterfaceC0890A {

    /* renamed from: a  reason: collision with root package name */
    public final i f5185a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5186b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5187c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5188d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5189e;

    public C0256f(i iVar, int i3, long j3, long j4) {
        this.f5185a = iVar;
        this.f5186b = i3;
        this.f5187c = j3;
        long j5 = (j4 - j3) / iVar.f1553d;
        this.f5188d = j5;
        this.f5189e = b(j5);
    }

    public final long b(long j3) {
        long j4 = j3 * this.f5186b;
        long j5 = this.f5185a.f1552c;
        int i3 = A.f2405a;
        return A.U(j4, 1000000L, j5, RoundingMode.FLOOR);
    }

    @Override // w0.InterfaceC0890A
    public final boolean c() {
        return true;
    }

    @Override // w0.InterfaceC0890A
    public final z i(long j3) {
        i iVar = this.f5185a;
        long j4 = (iVar.f1552c * j3) / (this.f5186b * 1000000);
        long j5 = this.f5188d;
        long k3 = A.k(j4, 0L, j5 - 1);
        long j6 = this.f5187c;
        long b3 = b(k3);
        B b4 = new B(b3, (iVar.f1553d * k3) + j6);
        if (b3 < j3 && k3 != j5 - 1) {
            long j7 = k3 + 1;
            return new z(b4, new B(b(j7), (iVar.f1553d * j7) + j6));
        }
        return new z(b4, b4);
    }

    @Override // w0.InterfaceC0890A
    public final long k() {
        return this.f5189e;
    }
}
