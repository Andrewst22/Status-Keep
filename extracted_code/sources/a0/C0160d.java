package a0;

import D1.q0;
import java.util.Set;
/* renamed from: a0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160d {

    /* renamed from: d  reason: collision with root package name */
    public static final C0160d f3738d;

    /* renamed from: a  reason: collision with root package name */
    public final int f3739a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3740b;

    /* renamed from: c  reason: collision with root package name */
    public final D1.M f3741c;

    /* JADX WARN: Type inference failed for: r1v1, types: [D1.L, D1.C] */
    static {
        C0160d c0160d;
        if (U.A.f2405a >= 33) {
            ?? c3 = new D1.C(4);
            for (int i3 = 1; i3 <= 10; i3++) {
                c3.a(Integer.valueOf(U.A.s(i3)));
            }
            c0160d = new C0160d(2, c3.g());
        } else {
            c0160d = new C0160d(2, 10);
        }
        f3738d = c0160d;
    }

    public C0160d(int i3, Set set) {
        this.f3739a = i3;
        D1.M j3 = D1.M.j(set);
        this.f3741c = j3;
        q0 it = j3.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 = Math.max(i4, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f3740b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0160d)) {
            return false;
        }
        C0160d c0160d = (C0160d) obj;
        if (this.f3739a == c0160d.f3739a && this.f3740b == c0160d.f3740b && U.A.a(this.f3741c, c0160d.f3741c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i3 = ((this.f3739a * 31) + this.f3740b) * 31;
        D1.M m3 = this.f3741c;
        if (m3 == null) {
            hashCode = 0;
        } else {
            hashCode = m3.hashCode();
        }
        return i3 + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f3739a + ", maxChannelCount=" + this.f3740b + ", channelMasks=" + this.f3741c + "]";
    }

    public C0160d(int i3, int i4) {
        this.f3739a = i3;
        this.f3740b = i4;
        this.f3741c = null;
    }
}
