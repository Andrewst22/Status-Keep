package k0;

import a.AbstractC0155a;
import java.util.Locale;
/* renamed from: k0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0553h {

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f7595g = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7596a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f7597b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7598c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7599d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7600e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f7601f;

    public C0553h(C0552g c0552g) {
        this.f7596a = c0552g.f7589a;
        this.f7597b = c0552g.f7590b;
        this.f7598c = c0552g.f7591c;
        this.f7599d = c0552g.f7592d;
        this.f7600e = c0552g.f7593e;
        this.f7601f = c0552g.f7594f;
    }

    public static int a(int i3) {
        return AbstractC0155a.C(i3 + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0553h.class != obj.getClass()) {
            return false;
        }
        C0553h c0553h = (C0553h) obj;
        if (this.f7597b == c0553h.f7597b && this.f7598c == c0553h.f7598c && this.f7596a == c0553h.f7596a && this.f7599d == c0553h.f7599d && this.f7600e == c0553h.f7600e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f7599d;
        return ((((((((527 + this.f7597b) * 31) + this.f7598c) * 31) + (this.f7596a ? 1 : 0)) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f7600e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.f7597b), Integer.valueOf(this.f7598c), Long.valueOf(this.f7599d), Integer.valueOf(this.f7600e), Boolean.valueOf(this.f7596a)};
        int i3 = U.A.f2405a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
