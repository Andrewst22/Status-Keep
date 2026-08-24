package androidx.lifecycle;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public l f4349a;

    /* renamed from: b  reason: collision with root package name */
    public p f4350b;

    public final void a(r rVar, k kVar) {
        l a3 = kVar.a();
        l lVar = this.f4349a;
        D2.i.e(lVar, "state1");
        if (a3.compareTo(lVar) < 0) {
            lVar = a3;
        }
        this.f4349a = lVar;
        this.f4350b.d(rVar, kVar);
        this.f4349a = a3;
    }
}
