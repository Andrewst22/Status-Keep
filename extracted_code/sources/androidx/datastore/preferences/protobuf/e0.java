package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class e0 extends g0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4239b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Unsafe unsafe, int i3) {
        super(unsafe);
        this.f4239b = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final boolean c(long j3, Object obj) {
        switch (this.f4239b) {
            case 0:
                if (h0.f4260g) {
                    return h0.b(j3, obj);
                }
                return h0.c(j3, obj);
            default:
                if (h0.f4260g) {
                    return h0.b(j3, obj);
                }
                return h0.c(j3, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final double d(long j3, Object obj) {
        switch (this.f4239b) {
            case 0:
                return Double.longBitsToDouble(g(j3, obj));
            default:
                return Double.longBitsToDouble(g(j3, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final float e(long j3, Object obj) {
        switch (this.f4239b) {
            case 0:
                return Float.intBitsToFloat(f(j3, obj));
            default:
                return Float.intBitsToFloat(f(j3, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void j(Object obj, long j3, boolean z3) {
        switch (this.f4239b) {
            case 0:
                if (h0.f4260g) {
                    h0.k(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    h0.l(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (h0.f4260g) {
                    h0.k(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    h0.l(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void k(Object obj, long j3, byte b3) {
        switch (this.f4239b) {
            case 0:
                if (h0.f4260g) {
                    h0.k(obj, j3, b3);
                    return;
                } else {
                    h0.l(obj, j3, b3);
                    return;
                }
            default:
                if (h0.f4260g) {
                    h0.k(obj, j3, b3);
                    return;
                } else {
                    h0.l(obj, j3, b3);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void l(Object obj, long j3, double d3) {
        switch (this.f4239b) {
            case 0:
                o(obj, j3, Double.doubleToLongBits(d3));
                return;
            default:
                o(obj, j3, Double.doubleToLongBits(d3));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final void m(Object obj, long j3, float f3) {
        switch (this.f4239b) {
            case 0:
                n(j3, obj, Float.floatToIntBits(f3));
                return;
            default:
                n(j3, obj, Float.floatToIntBits(f3));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final boolean r() {
        switch (this.f4239b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
