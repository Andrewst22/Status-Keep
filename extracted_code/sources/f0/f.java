package f0;

import D1.G;
import D1.I;
import D1.b0;
import R.C0110m;
import java.util.List;
/* loaded from: classes.dex */
public final class f extends g {
    public final String x;

    /* renamed from: y  reason: collision with root package name */
    public final I f5437y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(String str, long j3, long j4, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j3, j4, false, b0.f231q);
        G g3 = I.f197n;
    }

    public f(String str, f fVar, String str2, long j3, int i3, long j4, C0110m c0110m, String str3, String str4, long j5, long j6, boolean z3, List list) {
        super(str, fVar, j3, i3, j4, c0110m, str3, str4, j5, j6, z3);
        this.x = str2;
        this.f5437y = I.j(list);
    }
}
