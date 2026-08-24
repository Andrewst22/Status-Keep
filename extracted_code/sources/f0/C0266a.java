package f0;

import U.A;
import android.net.Uri;
import android.os.SystemClock;
import d1.C0255e;
import java.util.HashMap;
import java.util.List;
/* renamed from: f0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266a implements q {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ c f5407m;

    public C0266a(c cVar) {
        this.f5407m = cVar;
    }

    @Override // f0.q
    public final void a() {
        this.f5407m.f5424q.remove(this);
    }

    @Override // f0.q
    public final boolean c(Uri uri, B.b bVar, boolean z3) {
        HashMap hashMap;
        b bVar2;
        c cVar = this.f5407m;
        if (cVar.x == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            l lVar = cVar.f5429v;
            int i3 = A.f2405a;
            List list = lVar.f5484e;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int size = list.size();
                hashMap = cVar.f5423p;
                if (i4 >= size) {
                    break;
                }
                b bVar3 = (b) hashMap.get(((k) list.get(i4)).f5476a);
                if (bVar3 != null && elapsedRealtime < bVar3.f5415t) {
                    i5++;
                }
                i4++;
            }
            s0.h hVar = new s0.h(1, 0, cVar.f5429v.f5484e.size(), i5);
            cVar.f5422o.getClass();
            C0255e t3 = e0.l.t(hVar, bVar);
            if (t3 != null && t3.f5183a == 2 && (bVar2 = (b) hashMap.get(uri)) != null) {
                b.a(bVar2, t3.f5184b);
            }
        }
        return false;
    }
}
