package v;

import android.graphics.Insets;
/* renamed from: v.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0872c {

    /* renamed from: e  reason: collision with root package name */
    public static final C0872c f9463e = new C0872c(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f9464a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9465b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9466c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9467d;

    public C0872c(int i3, int i4, int i5, int i6) {
        this.f9464a = i3;
        this.f9465b = i4;
        this.f9466c = i5;
        this.f9467d = i6;
    }

    public static C0872c a(int i3, int i4, int i5, int i6) {
        if (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            return f9463e;
        }
        return new C0872c(i3, i4, i5, i6);
    }

    public final Insets b() {
        return AbstractC0871b.a(this.f9464a, this.f9465b, this.f9466c, this.f9467d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0872c.class != obj.getClass()) {
            return false;
        }
        C0872c c0872c = (C0872c) obj;
        if (this.f9467d == c0872c.f9467d && this.f9464a == c0872c.f9464a && this.f9466c == c0872c.f9466c && this.f9465b == c0872c.f9465b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f9464a * 31) + this.f9465b) * 31) + this.f9466c) * 31) + this.f9467d;
    }

    public final String toString() {
        return "Insets{left=" + this.f9464a + ", top=" + this.f9465b + ", right=" + this.f9466c + ", bottom=" + this.f9467d + '}';
    }
}
