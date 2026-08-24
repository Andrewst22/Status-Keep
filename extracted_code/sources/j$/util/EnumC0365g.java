package j$.util;

import j$.util.function.Function;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0365g implements Comparator, InterfaceC0345f {
    public static final EnumC0365g INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ EnumC0365g[] f6859a;

    public static EnumC0365g valueOf(String str) {
        return (EnumC0365g) Enum.valueOf(EnumC0365g.class, str);
    }

    public static EnumC0365g[] values() {
        return (EnumC0365g[]) f6859a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.util.g] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        INSTANCE = r12;
        f6859a = new EnumC0365g[]{r12};
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return new C0344e(this, comparator, 0);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function, Comparator comparator) {
        j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        Objects.requireNonNull(convert);
        Objects.requireNonNull(comparator);
        return AbstractC0340b.x(this, new C0344e(comparator, convert, 1));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(java.util.function.Function function) {
        j$.util.function.Function convert = Function.VivifiedWrapper.convert(function);
        Objects.requireNonNull(convert);
        return AbstractC0340b.x(this, new C0343d(2, convert));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        j$.util.function.P a3 = j$.util.function.P.a(toIntFunction);
        Objects.requireNonNull(a3);
        return AbstractC0340b.x(this, new C0343d(0, a3));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        j$.util.function.S a3 = j$.util.function.S.a(toLongFunction);
        Objects.requireNonNull(a3);
        return AbstractC0340b.x(this, new C0343d(3, a3));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        j$.util.function.N a3 = j$.util.function.N.a(toDoubleFunction);
        Objects.requireNonNull(a3);
        return AbstractC0340b.x(this, new C0343d(1, a3));
    }
}
