package f0;

import R.C0110m;
/* loaded from: classes.dex */
public abstract class g implements Comparable {

    /* renamed from: m  reason: collision with root package name */
    public final String f5438m;

    /* renamed from: n  reason: collision with root package name */
    public final f f5439n;

    /* renamed from: o  reason: collision with root package name */
    public final long f5440o;

    /* renamed from: p  reason: collision with root package name */
    public final int f5441p;

    /* renamed from: q  reason: collision with root package name */
    public final long f5442q;

    /* renamed from: r  reason: collision with root package name */
    public final C0110m f5443r;

    /* renamed from: s  reason: collision with root package name */
    public final String f5444s;

    /* renamed from: t  reason: collision with root package name */
    public final String f5445t;

    /* renamed from: u  reason: collision with root package name */
    public final long f5446u;

    /* renamed from: v  reason: collision with root package name */
    public final long f5447v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f5448w;

    public g(String str, f fVar, long j3, int i3, long j4, C0110m c0110m, String str2, String str3, long j5, long j6, boolean z3) {
        this.f5438m = str;
        this.f5439n = fVar;
        this.f5440o = j3;
        this.f5441p = i3;
        this.f5442q = j4;
        this.f5443r = c0110m;
        this.f5444s = str2;
        this.f5445t = str3;
        this.f5446u = j5;
        this.f5447v = j6;
        this.f5448w = z3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l3 = (Long) obj;
        long longValue = l3.longValue();
        long j3 = this.f5442q;
        if (j3 > longValue) {
            return 1;
        }
        if (j3 < l3.longValue()) {
            return -1;
        }
        return 0;
    }
}
