package S;

import U.A;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f2154e = new b(-1, -1, -1);

    /* renamed from: a  reason: collision with root package name */
    public final int f2155a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2156b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2157c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2158d;

    public b(int i3, int i4, int i5) {
        int i6;
        this.f2155a = i3;
        this.f2156b = i4;
        this.f2157c = i5;
        if (A.I(i5)) {
            i6 = A.B(i5, i4);
        } else {
            i6 = -1;
        }
        this.f2158d = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2155a == bVar.f2155a && this.f2156b == bVar.f2156b && this.f2157c == bVar.f2157c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2155a), Integer.valueOf(this.f2156b), Integer.valueOf(this.f2157c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f2155a + ", channelCount=" + this.f2156b + ", encoding=" + this.f2157c + ']';
    }
}
