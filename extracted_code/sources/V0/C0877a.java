package v0;

import D2.h;
import R.C0113p;
import U.A;
import U.t;
import X.f;
import Y.AbstractC0135f;
import Y.E;
import java.nio.ByteBuffer;
/* renamed from: v0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0877a extends AbstractC0135f {

    /* renamed from: D  reason: collision with root package name */
    public final f f9488D;

    /* renamed from: E  reason: collision with root package name */
    public final t f9489E;

    /* renamed from: F  reason: collision with root package name */
    public long f9490F;

    /* renamed from: G  reason: collision with root package name */
    public E f9491G;

    /* renamed from: H  reason: collision with root package name */
    public long f9492H;

    public C0877a() {
        super(6);
        this.f9488D = new f(1);
        this.f9489E = new t();
    }

    @Override // Y.AbstractC0135f, Y.g0
    public final void d(int i3, Object obj) {
        if (i3 == 8) {
            this.f9491G = (E) obj;
        }
    }

    @Override // Y.AbstractC0135f
    public final String i() {
        return "CameraMotionRenderer";
    }

    @Override // Y.AbstractC0135f
    public final boolean k() {
        return j();
    }

    @Override // Y.AbstractC0135f
    public final boolean l() {
        return true;
    }

    @Override // Y.AbstractC0135f
    public final void m() {
        E e2 = this.f9491G;
        if (e2 != null) {
            e2.b();
        }
    }

    @Override // Y.AbstractC0135f
    public final void o(long j3, boolean z3) {
        this.f9492H = Long.MIN_VALUE;
        E e2 = this.f9491G;
        if (e2 != null) {
            e2.b();
        }
    }

    @Override // Y.AbstractC0135f
    public final void t(C0113p[] c0113pArr, long j3, long j4) {
        this.f9490F = j4;
    }

    @Override // Y.AbstractC0135f
    public final void v(long j3, long j4) {
        boolean z3;
        float[] fArr;
        while (!j() && this.f9492H < 100000 + j3) {
            f fVar = this.f9488D;
            fVar.e();
            B1.a aVar = this.f3278o;
            aVar.y();
            if (u(aVar, fVar, 0) == -4 && !fVar.c(4)) {
                long j5 = fVar.f2936s;
                this.f9492H = j5;
                if (j5 < this.x) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.f9491G != null && !z3) {
                    fVar.i();
                    ByteBuffer byteBuffer = fVar.f2934q;
                    int i3 = A.f2405a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        t tVar = this.f9489E;
                        tVar.E(array, limit);
                        tVar.G(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i4 = 0; i4 < 3; i4++) {
                            fArr2[i4] = Float.intBitsToFloat(tVar.j());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.f9491G.a(this.f9492H - this.f9490F, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // Y.AbstractC0135f
    public final int z(C0113p c0113p) {
        if ("application/x-camera-motion".equals(c0113p.f1974m)) {
            return h.e(4, 0, 0, 0);
        }
        return h.e(0, 0, 0, 0);
    }
}
