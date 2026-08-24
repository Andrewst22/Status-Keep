package d1;

import U.AbstractC0123a;
import U.t;
import w0.l;
/* renamed from: d1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255e {

    /* renamed from: a  reason: collision with root package name */
    public final int f5183a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5184b;

    public /* synthetic */ C0255e(int i3, long j3, boolean z3) {
        this.f5183a = i3;
        this.f5184b = j3;
    }

    public static C0255e b(l lVar, t tVar) {
        lVar.p(tVar.f2477a, 0, 8, false);
        tVar.G(0);
        return new C0255e(tVar.h(), tVar.l(), false);
    }

    public boolean a() {
        int i3 = this.f5183a;
        if (i3 == 0 || i3 == 1) {
            return true;
        }
        return false;
    }

    public C0255e(long j3, int i3) {
        AbstractC0123a.e(j3 >= 0);
        this.f5183a = i3;
        this.f5184b = j3;
    }
}
