package j$.util;

import java.util.NoSuchElementException;
/* renamed from: j$.util.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0372n {

    /* renamed from: c  reason: collision with root package name */
    private static final C0372n f6869c = new C0372n();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6870a;

    /* renamed from: b  reason: collision with root package name */
    private final double f6871b;

    private C0372n() {
        this.f6870a = false;
        this.f6871b = Double.NaN;
    }

    public static C0372n a() {
        return f6869c;
    }

    private C0372n(double d3) {
        this.f6870a = true;
        this.f6871b = d3;
    }

    public static C0372n d(double d3) {
        return new C0372n(d3);
    }

    public final double b() {
        if (!this.f6870a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f6871b;
    }

    public final boolean c() {
        return this.f6870a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0372n) {
            C0372n c0372n = (C0372n) obj;
            boolean z3 = this.f6870a;
            if (z3 && c0372n.f6870a) {
                if (Double.compare(this.f6871b, c0372n.f6871b) == 0) {
                    return true;
                }
            } else if (z3 == c0372n.f6870a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f6870a) {
            long doubleToLongBits = Double.doubleToLongBits(this.f6871b);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
        return 0;
    }

    public final String toString() {
        if (this.f6870a) {
            return "OptionalDouble[" + this.f6871b + "]";
        }
        return "OptionalDouble.empty";
    }
}
