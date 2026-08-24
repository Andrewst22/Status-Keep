package j$.util;

import java.util.NoSuchElementException;
import java.util.Objects;
/* renamed from: j$.util.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0371m {

    /* renamed from: b  reason: collision with root package name */
    private static final C0371m f6867b = new C0371m();

    /* renamed from: a  reason: collision with root package name */
    private final Object f6868a;

    private C0371m() {
        this.f6868a = null;
    }

    public static C0371m a() {
        return f6867b;
    }

    private C0371m(Object obj) {
        Objects.requireNonNull(obj);
        this.f6868a = obj;
    }

    public static C0371m d(Object obj) {
        return new C0371m(obj);
    }

    public final Object b() {
        Object obj = this.f6868a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f6868a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0371m) {
            return Objects.equals(this.f6868a, ((C0371m) obj).f6868a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f6868a);
    }

    public final String toString() {
        Object obj = this.f6868a;
        if (obj != null) {
            return String.format("Optional[%s]", obj);
        }
        return "Optional.empty";
    }
}
