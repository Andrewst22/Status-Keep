package j$.time.temporal;
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6632a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6633b;

    public /* synthetic */ p(int i3, int i4) {
        this.f6632a = i4;
        this.f6633b = i3;
    }

    @Override // j$.time.temporal.o
    public final m A(m mVar) {
        switch (this.f6632a) {
            case 0:
                int o3 = mVar.o(a.DAY_OF_WEEK);
                int i3 = this.f6633b;
                if (o3 == i3) {
                    return mVar;
                }
                int i4 = o3 - i3;
                return mVar.e(i4 >= 0 ? 7 - i4 : -i4, b.DAYS);
            default:
                int o4 = mVar.o(a.DAY_OF_WEEK);
                int i5 = this.f6633b;
                if (o4 == i5) {
                    return mVar;
                }
                int i6 = i5 - o4;
                return mVar.m(i6 >= 0 ? 7 - i6 : -i6, b.DAYS);
        }
    }
}
