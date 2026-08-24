package D1;

import java.util.Comparator;
/* renamed from: D1.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044x extends AbstractC0046z {
    public static AbstractC0046z f(int i3) {
        if (i3 < 0) {
            return AbstractC0046z.f318b;
        }
        if (i3 > 0) {
            return AbstractC0046z.f319c;
        }
        return AbstractC0046z.f317a;
    }

    @Override // D1.AbstractC0046z
    public final AbstractC0046z a(int i3, int i4) {
        int i5;
        if (i3 < i4) {
            i5 = -1;
        } else if (i3 > i4) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        return f(i5);
    }

    @Override // D1.AbstractC0046z
    public final AbstractC0046z b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // D1.AbstractC0046z
    public final AbstractC0046z c(boolean z3, boolean z4) {
        int i3;
        if (z3 == z4) {
            i3 = 0;
        } else if (z3) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        return f(i3);
    }

    @Override // D1.AbstractC0046z
    public final AbstractC0046z d(boolean z3, boolean z4) {
        int i3;
        if (z4 == z3) {
            i3 = 0;
        } else if (z4) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        return f(i3);
    }

    @Override // D1.AbstractC0046z
    public final int e() {
        return 0;
    }
}
