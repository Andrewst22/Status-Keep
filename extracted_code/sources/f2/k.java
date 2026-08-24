package f2;

import e0.C0262c;
import g2.r;
import g2.x;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5605a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f5606b;

    /* renamed from: c  reason: collision with root package name */
    public final r f5607c;

    /* renamed from: d  reason: collision with root package name */
    public R1.f f5608d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5609e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5610f;

    public k(Y1.b bVar, boolean z3) {
        r rVar = new r(bVar, "flutter/restoration", x.f5796a);
        this.f5609e = false;
        this.f5610f = false;
        C0262c c0262c = new C0262c(this, 14);
        this.f5607c = rVar;
        this.f5605a = z3;
        rVar.b(c0262c);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
