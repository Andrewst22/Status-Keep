package R;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1783a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1784b;

    /* renamed from: c  reason: collision with root package name */
    public final C0122z f1785c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1786d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1787e;

    /* renamed from: f  reason: collision with root package name */
    public final long f1788f;

    /* renamed from: g  reason: collision with root package name */
    public final long f1789g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1790h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1791i;

    static {
        D2.h.m(0, 1, 2, 3, 4);
        U.A.H(5);
        U.A.H(6);
    }

    public M(Object obj, int i3, C0122z c0122z, Object obj2, int i4, long j3, long j4, int i5, int i6) {
        this.f1783a = obj;
        this.f1784b = i3;
        this.f1785c = c0122z;
        this.f1786d = obj2;
        this.f1787e = i4;
        this.f1788f = j3;
        this.f1789g = j4;
        this.f1790h = i5;
        this.f1791i = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M.class != obj.getClass()) {
            return false;
        }
        M m3 = (M) obj;
        if (this.f1784b == m3.f1784b && this.f1787e == m3.f1787e && this.f1788f == m3.f1788f && this.f1789g == m3.f1789g && this.f1790h == m3.f1790h && this.f1791i == m3.f1791i && android.support.v4.media.session.a.s(this.f1785c, m3.f1785c) && android.support.v4.media.session.a.s(this.f1783a, m3.f1783a) && android.support.v4.media.session.a.s(this.f1786d, m3.f1786d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1783a, Integer.valueOf(this.f1784b), this.f1785c, this.f1786d, Integer.valueOf(this.f1787e), Long.valueOf(this.f1788f), Long.valueOf(this.f1789g), Integer.valueOf(this.f1790h), Integer.valueOf(this.f1791i)});
    }
}
