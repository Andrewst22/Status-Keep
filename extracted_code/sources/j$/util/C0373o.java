package j$.util;

import java.util.NoSuchElementException;
/* renamed from: j$.util.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0373o {

    /* renamed from: c  reason: collision with root package name */
    private static final C0373o f6872c = new C0373o();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6873a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6874b;

    private C0373o() {
        this.f6873a = false;
        this.f6874b = 0;
    }

    public static C0373o a() {
        return f6872c;
    }

    private C0373o(int i3) {
        this.f6873a = true;
        this.f6874b = i3;
    }

    public static C0373o d(int i3) {
        return new C0373o(i3);
    }

    public final int b() {
        if (!this.f6873a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f6874b;
    }

    public final boolean c() {
        return this.f6873a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0373o) {
            C0373o c0373o = (C0373o) obj;
            boolean z3 = this.f6873a;
            if (z3 && c0373o.f6873a) {
                if (this.f6874b == c0373o.f6874b) {
                    return true;
                }
            } else if (z3 == c0373o.f6873a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f6873a) {
            return this.f6874b;
        }
        return 0;
    }

    public final String toString() {
        if (this.f6873a) {
            return "OptionalInt[" + this.f6874b + "]";
        }
        return "OptionalInt.empty";
    }
}
