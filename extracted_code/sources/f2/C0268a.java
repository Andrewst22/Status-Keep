package f2;

import android.window.BackEvent;
import g2.r;
import g2.x;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* renamed from: f2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268a {

    /* renamed from: a  reason: collision with root package name */
    public final r f5557a;

    public C0268a(Y1.b bVar, int i3) {
        switch (i3) {
            case 1:
                e0.l lVar = new e0.l(6);
                r rVar = new r(bVar, "flutter/navigation", g2.m.f5787a);
                this.f5557a = rVar;
                rVar.b(lVar);
                return;
            default:
                e0.l lVar2 = new e0.l(4);
                r rVar2 = new r(bVar, "flutter/backgesture", x.f5796a);
                this.f5557a = rVar2;
                rVar2.b(lVar2);
                return;
        }
    }

    public static HashMap a(BackEvent backEvent) {
        float touchX;
        float touchY;
        List list;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        if (!Float.isNaN(touchX) && !Float.isNaN(touchY)) {
            list = Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY));
        } else {
            list = null;
        }
        hashMap.put("touchOffset", list);
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }
}
