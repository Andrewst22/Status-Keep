package w0;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final int f9518a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f9519b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9520c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9521d;

    public F(int i3, int i4, int i5, byte[] bArr) {
        this.f9518a = i3;
        this.f9519b = bArr;
        this.f9520c = i4;
        this.f9521d = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f3 = (F) obj;
        if (this.f9518a == f3.f9518a && this.f9520c == f3.f9520c && this.f9521d == f3.f9521d && Arrays.equals(this.f9519b, f3.f9519b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f9519b) + (this.f9518a * 31)) * 31) + this.f9520c) * 31) + this.f9521d;
    }
}
