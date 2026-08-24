package e0;

import java.util.List;
import p0.AbstractC0729b;
/* loaded from: classes.dex */
public final class g extends AbstractC0729b {

    /* renamed from: p  reason: collision with root package name */
    public final List f5231p;

    /* renamed from: q  reason: collision with root package name */
    public final long f5232q;

    public g(long j3, List list) {
        super(0L, list.size() - 1);
        this.f5232q = j3;
        this.f5231p = list;
    }

    @Override // p0.m
    public final long e() {
        a();
        f0.g gVar = (f0.g) this.f5231p.get((int) this.f8760o);
        return this.f5232q + gVar.f5442q + gVar.f5440o;
    }

    @Override // p0.m
    public final long k() {
        a();
        return this.f5232q + ((f0.g) this.f5231p.get((int) this.f8760o)).f5442q;
    }
}
