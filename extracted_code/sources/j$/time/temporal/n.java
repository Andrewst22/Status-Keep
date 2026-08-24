package j$.time.temporal;

import java.util.Objects;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class n {

    /* renamed from: a  reason: collision with root package name */
    static final t f6625a = new q(1);

    /* renamed from: b  reason: collision with root package name */
    static final t f6626b = new q(2);

    /* renamed from: c  reason: collision with root package name */
    static final t f6627c = new q(3);

    /* renamed from: d  reason: collision with root package name */
    static final t f6628d = new q(4);

    /* renamed from: e  reason: collision with root package name */
    static final t f6629e = new q(5);

    /* renamed from: f  reason: collision with root package name */
    static final t f6630f = new q(6);

    /* renamed from: g  reason: collision with root package name */
    static final t f6631g = new q(7);

    public static t k() {
        return f6625a;
    }

    public static w d(TemporalAccessor temporalAccessor, s sVar) {
        if (sVar instanceof a) {
            if (temporalAccessor.f(sVar)) {
                return ((a) sVar).m();
            }
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", sVar));
        }
        Objects.requireNonNull(sVar, "field");
        return sVar.z(temporalAccessor);
    }

    public static t e() {
        return f6626b;
    }

    public static int a(TemporalAccessor temporalAccessor, s sVar) {
        w r3 = temporalAccessor.r(sVar);
        if (!r3.h()) {
            throw new RuntimeException("Invalid field " + sVar + " for get() method, use getLong() instead");
        }
        long v3 = temporalAccessor.v(sVar);
        if (r3.i(v3)) {
            return (int) v3;
        }
        throw new RuntimeException("Invalid value for " + sVar + " (valid values " + r3 + "): " + v3);
    }

    public static t i() {
        return f6627c;
    }

    public static t j() {
        return f6629e;
    }

    public static t h() {
        return f6628d;
    }

    public static Object c(TemporalAccessor temporalAccessor, t tVar) {
        if (tVar == f6625a || tVar == f6626b || tVar == f6627c) {
            return null;
        }
        return tVar.g(temporalAccessor);
    }

    public static t f() {
        return f6630f;
    }

    public static t g() {
        return f6631g;
    }

    public static m b(m mVar, long j3, u uVar) {
        long j4;
        if (j3 == Long.MIN_VALUE) {
            mVar = mVar.e(Long.MAX_VALUE, uVar);
            j4 = 1;
        } else {
            j4 = -j3;
        }
        return mVar.e(j4, uVar);
    }
}
