package I1;
/* loaded from: classes.dex */
public final class h extends r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f464a;

    @Override // I1.r
    public final Object a(Q1.b bVar) {
        switch (this.f464a) {
            case 0:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                return Double.valueOf(bVar.n());
            default:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                return Float.valueOf((float) bVar.n());
        }
    }

    @Override // I1.r
    public final void b(Q1.c cVar, Object obj) {
        switch (this.f464a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    cVar.j();
                    return;
                }
                k.a(number.doubleValue());
                cVar.o(number);
                return;
            default:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    cVar.j();
                    return;
                }
                k.a(number2.floatValue());
                cVar.o(number2);
                return;
        }
    }
}
