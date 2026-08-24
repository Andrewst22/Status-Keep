package P0;

import U.A;
import java.math.RoundingMode;
import w0.B;
import w0.z;
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final long f1424a;

    /* renamed from: b  reason: collision with root package name */
    public final B.b f1425b;

    /* renamed from: c  reason: collision with root package name */
    public final B.b f1426c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1427d;

    /* renamed from: e  reason: collision with root package name */
    public long f1428e;

    public b(long j3, long j4, long j5) {
        this.f1428e = j3;
        this.f1424a = j5;
        B.b bVar = new B.b(2, false);
        this.f1425b = bVar;
        B.b bVar2 = new B.b(2, false);
        this.f1426c = bVar2;
        bVar.b(0L);
        bVar2.b(j4);
        int i3 = -2147483647;
        if (j3 != -9223372036854775807L) {
            long U3 = A.U(j4 - j5, 8L, j3, RoundingMode.HALF_UP);
            if (U3 > 0 && U3 <= 2147483647L) {
                i3 = (int) U3;
            }
            this.f1427d = i3;
            return;
        }
        this.f1427d = -2147483647;
    }

    @Override // P0.f
    public final long a(long j3) {
        return this.f1425b.h(A.c(this.f1426c, j3));
    }

    public final boolean b(long j3) {
        B.b bVar = this.f1425b;
        if (j3 - bVar.h(bVar.f22m - 1) < 100000) {
            return true;
        }
        return false;
    }

    @Override // w0.InterfaceC0890A
    public final boolean c() {
        return true;
    }

    @Override // P0.f
    public final long g() {
        return this.f1424a;
    }

    @Override // w0.InterfaceC0890A
    public final z i(long j3) {
        B.b bVar = this.f1425b;
        int c3 = A.c(bVar, j3);
        long h3 = bVar.h(c3);
        B.b bVar2 = this.f1426c;
        B b3 = new B(h3, bVar2.h(c3));
        if (h3 != j3 && c3 != bVar.f22m - 1) {
            int i3 = c3 + 1;
            return new z(b3, new B(bVar.h(i3), bVar2.h(i3)));
        }
        return new z(b3, b3);
    }

    @Override // P0.f
    public final int j() {
        return this.f1427d;
    }

    @Override // w0.InterfaceC0890A
    public final long k() {
        return this.f1428e;
    }
}
