package b0;

import U.A;
import android.os.Handler;
import android.os.Message;
import c0.C0223c;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class o implements Handler.Callback {

    /* renamed from: m  reason: collision with root package name */
    public final s0.e f4626m;

    /* renamed from: n  reason: collision with root package name */
    public final C0210d f4627n;

    /* renamed from: r  reason: collision with root package name */
    public C0223c f4631r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4632s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4633t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4634u;

    /* renamed from: q  reason: collision with root package name */
    public final TreeMap f4630q = new TreeMap();

    /* renamed from: p  reason: collision with root package name */
    public final Handler f4629p = A.n(this);

    /* renamed from: o  reason: collision with root package name */
    public final G0.c f4628o = new G0.c(1);

    public o(C0223c c0223c, C0210d c0210d, s0.e eVar) {
        this.f4631r = c0223c;
        this.f4627n = c0210d;
        this.f4626m = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f4634u) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        m mVar = (m) message.obj;
        long j3 = mVar.f4619a;
        TreeMap treeMap = this.f4630q;
        long j4 = mVar.f4620b;
        Long l3 = (Long) treeMap.get(Long.valueOf(j4));
        if (l3 == null) {
            treeMap.put(Long.valueOf(j4), Long.valueOf(j3));
        } else if (l3.longValue() > j3) {
            treeMap.put(Long.valueOf(j4), Long.valueOf(j3));
        }
        return true;
    }
}
