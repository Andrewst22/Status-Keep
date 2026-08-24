package Z;

import R.T;
import java.util.Arrays;
import o0.C0701z;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f3454a;

    /* renamed from: b  reason: collision with root package name */
    public final T f3455b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3456c;

    /* renamed from: d  reason: collision with root package name */
    public final C0701z f3457d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3458e;

    /* renamed from: f  reason: collision with root package name */
    public final T f3459f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3460g;

    /* renamed from: h  reason: collision with root package name */
    public final C0701z f3461h;

    /* renamed from: i  reason: collision with root package name */
    public final long f3462i;

    /* renamed from: j  reason: collision with root package name */
    public final long f3463j;

    public a(long j3, T t3, int i3, C0701z c0701z, long j4, T t4, int i4, C0701z c0701z2, long j5, long j6) {
        this.f3454a = j3;
        this.f3455b = t3;
        this.f3456c = i3;
        this.f3457d = c0701z;
        this.f3458e = j4;
        this.f3459f = t4;
        this.f3460g = i4;
        this.f3461h = c0701z2;
        this.f3462i = j5;
        this.f3463j = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3454a == aVar.f3454a && this.f3456c == aVar.f3456c && this.f3458e == aVar.f3458e && this.f3460g == aVar.f3460g && this.f3462i == aVar.f3462i && this.f3463j == aVar.f3463j && android.support.v4.media.session.a.s(this.f3455b, aVar.f3455b) && android.support.v4.media.session.a.s(this.f3457d, aVar.f3457d) && android.support.v4.media.session.a.s(this.f3459f, aVar.f3459f) && android.support.v4.media.session.a.s(this.f3461h, aVar.f3461h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3454a), this.f3455b, Integer.valueOf(this.f3456c), this.f3457d, Long.valueOf(this.f3458e), this.f3459f, Integer.valueOf(this.f3460g), this.f3461h, Long.valueOf(this.f3462i), Long.valueOf(this.f3463j)});
    }
}
