package L1;

import java.util.Calendar;
import java.util.GregorianCalendar;
/* loaded from: classes.dex */
public final class k implements I1.s {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f904m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ I1.r f905n;

    public /* synthetic */ k(I1.r rVar, int i3) {
        this.f904m = i3;
        this.f905n = rVar;
    }

    @Override // I1.s
    public final I1.r create(I1.k kVar, P1.a aVar) {
        switch (this.f904m) {
            case 0:
                if (aVar.f1465a == Number.class) {
                    return (l) this.f905n;
                }
                return null;
            default:
                Class cls = aVar.f1465a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (l) this.f905n;
        }
    }

    public String toString() {
        switch (this.f904m) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((l) this.f905n) + "]";
            default:
                return super.toString();
        }
    }
}
