package f0;

import D1.I;
import D1.g0;
import D1.r;
import R.C0110m;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class i extends m {

    /* renamed from: d  reason: collision with root package name */
    public final int f5454d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5455e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5456f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5457g;

    /* renamed from: h  reason: collision with root package name */
    public final long f5458h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5459i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5460j;

    /* renamed from: k  reason: collision with root package name */
    public final long f5461k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5462l;

    /* renamed from: m  reason: collision with root package name */
    public final long f5463m;

    /* renamed from: n  reason: collision with root package name */
    public final long f5464n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f5465o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f5466p;

    /* renamed from: q  reason: collision with root package name */
    public final C0110m f5467q;

    /* renamed from: r  reason: collision with root package name */
    public final I f5468r;

    /* renamed from: s  reason: collision with root package name */
    public final I f5469s;

    /* renamed from: t  reason: collision with root package name */
    public final g0 f5470t;

    /* renamed from: u  reason: collision with root package name */
    public final long f5471u;

    /* renamed from: v  reason: collision with root package name */
    public final h f5472v;

    public i(int i3, String str, List list, long j3, boolean z3, long j4, boolean z4, int i4, long j5, int i5, long j6, long j7, boolean z5, boolean z6, boolean z7, C0110m c0110m, List list2, List list3, h hVar, Map map) {
        super(str, list, z5);
        this.f5454d = i3;
        this.f5458h = j4;
        this.f5457g = z3;
        this.f5459i = z4;
        this.f5460j = i4;
        this.f5461k = j5;
        this.f5462l = i5;
        this.f5463m = j6;
        this.f5464n = j7;
        this.f5465o = z6;
        this.f5466p = z7;
        this.f5467q = c0110m;
        this.f5468r = I.j(list2);
        this.f5469s = I.j(list3);
        this.f5470t = g0.a(map);
        if (!list3.isEmpty()) {
            d dVar = (d) r.l(list3);
            this.f5471u = dVar.f5442q + dVar.f5440o;
        } else if (!list2.isEmpty()) {
            f fVar = (f) r.l(list2);
            this.f5471u = fVar.f5442q + fVar.f5440o;
        } else {
            this.f5471u = 0L;
        }
        long j8 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j8 = Math.min(this.f5471u, j3);
            } else {
                j8 = Math.max(0L, this.f5471u + j3);
            }
        }
        this.f5455e = j8;
        this.f5456f = j3 >= 0;
        this.f5472v = hVar;
    }

    @Override // j0.InterfaceC0515a
    public final Object a(List list) {
        return this;
    }
}
