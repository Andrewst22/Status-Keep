package androidx.lifecycle;

import java.lang.reflect.Method;
/* renamed from: androidx.lifecycle.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204b {

    /* renamed from: a  reason: collision with root package name */
    public final int f4331a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f4332b;

    public C0204b(int i3, Method method) {
        this.f4331a = i3;
        this.f4332b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0204b)) {
            return false;
        }
        C0204b c0204b = (C0204b) obj;
        if (this.f4331a == c0204b.f4331a && this.f4332b.getName().equals(c0204b.f4332b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4332b.getName().hashCode() + (this.f4331a * 31);
    }
}
