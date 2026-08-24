package o2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
/* renamed from: o2.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0716m implements g2.j {

    /* renamed from: m  reason: collision with root package name */
    public final C0714k f8708m;

    public void a(long j3) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "bufferingUpdate");
        hashMap.put("values", Collections.singletonList(Arrays.asList(0, Long.valueOf(j3))));
        this.f8708m.b(hashMap);
    }

    public void b(int i3, int i4, long j3, int i5) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "initialized");
        D2.h.o(i3, hashMap, "width", i4, "height");
        hashMap.put("duration", Long.valueOf(j3));
        if (i5 != 0) {
            hashMap.put("rotationCorrection", Integer.valueOf(i5));
        }
        this.f8708m.b(hashMap);
    }

    @Override // g2.j
    public void p() {
        C0714k c0714k = this.f8708m;
        c0714k.f8702a = null;
        c0714k.a();
    }

    @Override // g2.j
    public void s(g2.i iVar) {
        C0714k c0714k = this.f8708m;
        c0714k.f8702a = iVar;
        c0714k.a();
    }
}
