package T0;

import D1.I;
import java.util.List;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final I f2297a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2298b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2299c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2300d;

    public a(List list, long j3, long j4) {
        this.f2297a = I.j(list);
        this.f2298b = j3;
        this.f2299c = j4;
        long j5 = -9223372036854775807L;
        if (j3 != -9223372036854775807L && j4 != -9223372036854775807L) {
            j5 = j3 + j4;
        }
        this.f2300d = j5;
    }
}
