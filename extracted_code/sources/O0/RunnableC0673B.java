package o0;
/* renamed from: o0.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0673B implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f8410m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ d0.d f8411n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f8412o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ r f8413p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ l0.g f8414q;

    public /* synthetic */ RunnableC0673B(d0.d dVar, InterfaceC0675D interfaceC0675D, r rVar, l0.g gVar, int i3) {
        this.f8410m = i3;
        this.f8411n = dVar;
        this.f8412o = interfaceC0675D;
        this.f8413p = rVar;
        this.f8414q = gVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [o0.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [o0.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o0.D, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8410m) {
            case 0:
                d0.d dVar = this.f8411n;
                int i3 = dVar.f5148a;
                this.f8412o.B(i3, dVar.f5149b, this.f8413p, this.f8414q);
                return;
            case 1:
                d0.d dVar2 = this.f8411n;
                int i4 = dVar2.f5148a;
                this.f8412o.C(i4, dVar2.f5149b, this.f8413p, this.f8414q);
                return;
            default:
                d0.d dVar3 = this.f8411n;
                int i5 = dVar3.f5148a;
                this.f8412o.h(i5, dVar3.f5149b, this.f8413p, this.f8414q);
                return;
        }
    }
}
