package M;

import T2.n;
/* loaded from: classes.dex */
public final class j extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public T2.h f1011p;

    /* renamed from: q  reason: collision with root package name */
    public T2.h f1012q;

    /* renamed from: r  reason: collision with root package name */
    public n f1013r;

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ Object f1014s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ k f1015t;

    /* renamed from: u  reason: collision with root package name */
    public int f1016u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, w2.b bVar) {
        super(bVar);
        this.f1015t = kVar;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f1014s = obj;
        this.f1016u |= Integer.MIN_VALUE;
        return this.f1015t.b(null, this);
    }
}
