package R1;

import P2.i;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import f2.k;
import g2.C0276a;
import g2.q;
import g2.r;
/* loaded from: classes.dex */
public final class f implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2092a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2093b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2094c;

    public /* synthetic */ f(int i3, Object obj, Object obj2) {
        this.f2092a = i3;
        this.f2094c = obj;
        this.f2093b = obj2;
    }

    @Override // g2.q
    public final void a(String str, String str2, Object obj) {
        switch (this.f2092a) {
            case 0:
                ((Handler) this.f2094c).post(new e(this, str, str2, obj, 0));
                return;
            case 1:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                return;
            default:
                ((Y1.g) this.f2093b).a(((r) ((C0276a) this.f2094c).f5778o).f5792c.f(str, str2, obj));
                return;
        }
    }

    @Override // g2.q
    public final void b(Object obj) {
        switch (this.f2092a) {
            case 0:
                ((Handler) this.f2094c).post(new i(2, this, obj));
                return;
            case 1:
                ((k) this.f2094c).f5606b = (byte[]) this.f2093b;
                return;
            default:
                ((Y1.g) this.f2093b).a(((r) ((C0276a) this.f2094c).f5778o).f5792c.b(obj));
                return;
        }
    }

    @Override // g2.q
    public final void c() {
        switch (this.f2092a) {
            case 0:
                ((Handler) this.f2094c).post(new H.b(this, 1));
                return;
            case 1:
                return;
            default:
                ((Y1.g) this.f2093b).a(null);
                return;
        }
    }

    public f(f fVar) {
        this.f2092a = 0;
        this.f2093b = fVar;
        this.f2094c = new Handler(Looper.getMainLooper());
    }

    private final void d() {
    }
}
