package s0;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final /* synthetic */ class f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9163a;

    public final void a(int i3) {
        int i4;
        g gVar = this.f9163a;
        synchronized (gVar) {
            int i5 = gVar.f9183m;
            if (i5 == 0 || gVar.f9174d) {
                if (i5 != i3) {
                    gVar.f9183m = i3;
                    if (i3 != 1 && i3 != 0 && i3 != 8) {
                        gVar.f9181k = gVar.b(i3);
                        gVar.f9173c.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (gVar.f9176f > 0) {
                            i4 = (int) (elapsedRealtime - gVar.f9177g);
                        } else {
                            i4 = 0;
                        }
                        gVar.c(i4, gVar.f9178h, gVar.f9181k);
                        gVar.f9177g = elapsedRealtime;
                        gVar.f9178h = 0L;
                        gVar.f9180j = 0L;
                        gVar.f9179i = 0L;
                        s sVar = gVar.f9175e;
                        sVar.f9216b.clear();
                        sVar.f9218d = -1;
                        sVar.f9219e = 0;
                        sVar.f9220f = 0;
                    }
                }
            }
        }
    }
}
