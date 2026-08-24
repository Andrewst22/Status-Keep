package o0;

import R.C0099b;
import R.C0122z;
/* renamed from: o0.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0696u extends R.T {

    /* renamed from: b  reason: collision with root package name */
    public final C0122z f8645b;

    public C0696u(C0122z c0122z) {
        this.f8645b = c0122z;
    }

    @Override // R.T
    public final int b(Object obj) {
        if (obj == C0695t.f8642e) {
            return 0;
        }
        return -1;
    }

    @Override // R.T
    public final R.Q f(int i3, R.Q q3, boolean z3) {
        Integer num;
        Object obj = null;
        if (z3) {
            num = 0;
        } else {
            num = null;
        }
        if (z3) {
            obj = C0695t.f8642e;
        }
        q3.h(num, obj, 0, -9223372036854775807L, 0L, C0099b.f1875c, true);
        return q3;
    }

    @Override // R.T
    public final int h() {
        return 1;
    }

    @Override // R.T
    public final Object l(int i3) {
        return C0695t.f8642e;
    }

    @Override // R.T
    public final R.S m(int i3, R.S s3, long j3) {
        Object obj = R.S.f1802q;
        s3.b(this.f8645b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        s3.f1814k = true;
        return s3;
    }

    @Override // R.T
    public final int o() {
        return 1;
    }
}
