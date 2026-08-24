package c0;

import D1.I;
import R.C0113p;
import android.net.Uri;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: r  reason: collision with root package name */
    public final j f4759r;

    /* renamed from: s  reason: collision with root package name */
    public final C1.j f4760s;

    public l(long j3, C0113p c0113p, I i3, r rVar, ArrayList arrayList) {
        super(c0113p, i3, rVar, arrayList);
        j jVar;
        Uri.parse(((C0222b) i3.get(0)).f4709a);
        long j4 = rVar.f4779e;
        if (j4 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.f4778d, j4, null);
        }
        this.f4759r = jVar;
        this.f4760s = jVar == null ? new C1.j(new j(0L, -1L, null), 27) : null;
    }

    @Override // c0.m
    public final String c() {
        return null;
    }

    @Override // c0.m
    public final b0.h d() {
        return this.f4760s;
    }

    @Override // c0.m
    public final j f() {
        return this.f4759r;
    }
}
