package o1;

import android.graphics.Rect;
/* renamed from: o1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0703b {

    /* renamed from: a  reason: collision with root package name */
    public final int f8659a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8660b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8661c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8662d;

    public C0703b(Rect rect) {
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        this.f8659a = i3;
        this.f8660b = i4;
        this.f8661c = i5;
        this.f8662d = i6;
        if (i3 <= i5) {
            if (i4 <= i6) {
                return;
            }
            throw new IllegalArgumentException(D2.h.j(i4, i6, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
        throw new IllegalArgumentException(D2.h.j(i3, i5, "Left must be less than or equal to right, left: ", ", right: ").toString());
    }

    public final int a() {
        return this.f8662d - this.f8660b;
    }

    public final int b() {
        return this.f8661c - this.f8659a;
    }

    public final Rect c() {
        return new Rect(this.f8659a, this.f8660b, this.f8661c, this.f8662d);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C0703b.class.equals(cls)) {
            return false;
        }
        D2.i.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C0703b c0703b = (C0703b) obj;
        if (this.f8659a == c0703b.f8659a && this.f8660b == c0703b.f8660b && this.f8661c == c0703b.f8661c && this.f8662d == c0703b.f8662d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f8659a * 31) + this.f8660b) * 31) + this.f8661c) * 31) + this.f8662d;
    }

    public final String toString() {
        return C0703b.class.getSimpleName() + " { [" + this.f8659a + ',' + this.f8660b + ',' + this.f8661c + ',' + this.f8662d + "] }";
    }
}
