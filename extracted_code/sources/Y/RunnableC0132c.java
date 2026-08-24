package Y;

import R.C0102e;
import io.flutter.plugin.platform.View$OnSystemUiVisibilityChangeListenerC0325d;
import java.util.Arrays;
/* renamed from: Y.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0132c implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3222m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f3223n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f3224o;

    public /* synthetic */ RunnableC0132c(int i3, int i4, Object obj) {
        this.f3222m = i4;
        this.f3224o = obj;
        this.f3223n = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        Object obj = this.f3224o;
        int i3 = this.f3223n;
        switch (this.f3222m) {
            case 0:
                C0134e c0134e = ((C0133d) obj).f3231b;
                c0134e.getClass();
                if (i3 != -3 && i3 != -2) {
                    if (i3 != -1) {
                        if (i3 != 1) {
                            D2.h.n(i3, "Unknown focus change type: ", "AudioFocusManager");
                            return;
                        }
                        c0134e.c(2);
                        D d3 = c0134e.f3246c;
                        if (d3 != null) {
                            G g3 = d3.f3021a;
                            g3.G(1, 1, g3.u());
                            return;
                        }
                        return;
                    }
                    D d4 = c0134e.f3246c;
                    if (d4 != null) {
                        G g4 = d4.f3021a;
                        g4.G(-1, 2, g4.u());
                    }
                    c0134e.a();
                    c0134e.c(1);
                    return;
                }
                if (i3 != -2) {
                    C0102e c0102e = c0134e.f3247d;
                    if (c0102e != null && c0102e.f1885a == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        c0134e.c(4);
                        return;
                    }
                }
                D d5 = c0134e.f3246c;
                if (d5 != null) {
                    G g5 = d5.f3021a;
                    g5.G(0, 1, g5.u());
                }
                c0134e.c(3);
                return;
            default:
                int i4 = i3 & 4;
                R0.j jVar = ((View$OnSystemUiVisibilityChangeListenerC0325d) obj).f6200b;
                if (i4 == 0) {
                    B1.a aVar = (B1.a) jVar.f2060o;
                    aVar.getClass();
                    ((g2.r) aVar.f50n).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                    return;
                }
                B1.a aVar2 = (B1.a) jVar.f2060o;
                aVar2.getClass();
                ((g2.r) aVar2.f50n).a("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                return;
        }
    }
}
