package K;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class F extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public Object f522p;

    /* renamed from: q  reason: collision with root package name */
    public Object f523q;

    /* renamed from: r  reason: collision with root package name */
    public Serializable f524r;

    /* renamed from: s  reason: collision with root package name */
    public D2.q f525s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f526t;

    /* renamed from: u  reason: collision with root package name */
    public int f527u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f528v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Q f529w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Q q3, w2.b bVar) {
        super(bVar);
        this.f529w = q3;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f528v = obj;
        this.x |= Integer.MIN_VALUE;
        return Q.f(this.f529w, false, this);
    }
}
