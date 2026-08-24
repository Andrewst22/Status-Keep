package m2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class v extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public C0627J f8303p;

    /* renamed from: q  reason: collision with root package name */
    public Set f8304q;

    /* renamed from: r  reason: collision with root package name */
    public Map f8305r;

    /* renamed from: s  reason: collision with root package name */
    public Iterator f8306s;

    /* renamed from: t  reason: collision with root package name */
    public O.e f8307t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f8308u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0627J f8309v;

    /* renamed from: w  reason: collision with root package name */
    public int f8310w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C0627J c0627j, w2.b bVar) {
        super(bVar);
        this.f8309v = c0627j;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f8308u = obj;
        this.f8310w |= Integer.MIN_VALUE;
        return C0627J.b(this.f8309v, null, this);
    }
}
