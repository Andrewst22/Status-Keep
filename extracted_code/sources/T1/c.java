package T1;

import android.os.Build;
import m2.C0633b;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements C2.a {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f2340m;

    public /* synthetic */ c(int i3) {
        this.f2340m = i3;
    }

    @Override // C2.a
    public final Object c() {
        int i3;
        switch (this.f2340m) {
            case 0:
                if (Build.VERSION.SDK_INT >= 23) {
                    i3 = 33554432;
                } else {
                    i3 = 0;
                }
                return Integer.valueOf(i3);
            case 1:
                return new Object();
            default:
                return new C0633b(1);
        }
    }
}
