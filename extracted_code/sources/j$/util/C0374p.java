package j$.util;

import java.util.NoSuchElementException;
/* renamed from: j$.util.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0374p {

    /* renamed from: c  reason: collision with root package name */
    private static final C0374p f6875c = new C0374p();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6876a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6877b;

    private C0374p() {
        this.f6876a = false;
        this.f6877b = 0L;
    }

    public static C0374p a() {
        return f6875c;
    }

    private C0374p(long j3) {
        this.f6876a = true;
        this.f6877b = j3;
    }

    public static C0374p d(long j3) {
        return new C0374p(j3);
    }

    public final long b() {
        if (!this.f6876a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f6877b;
    }

    public final boolean c() {
        return this.f6876a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0374p) {
            C0374p c0374p = (C0374p) obj;
            boolean z3 = this.f6876a;
            if (z3 && c0374p.f6876a) {
                if (this.f6877b == c0374p.f6877b) {
                    return true;
                }
            } else if (z3 == c0374p.f6876a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f6876a) {
            long j3 = this.f6877b;
            return (int) (j3 ^ (j3 >>> 32));
        }
        return 0;
    }

    public final String toString() {
        if (this.f6876a) {
            return "OptionalLong[" + this.f6877b + "]";
        }
        return "OptionalLong.empty";
    }
}
