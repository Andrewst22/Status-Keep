package C0;

import R.C0122z;
import R.N;
import R.S;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import i1.C0314m;
import i1.t;
import o0.InterfaceC0700y;
/* loaded from: classes.dex */
public abstract class e implements N {

    /* renamed from: a  reason: collision with root package name */
    public final Object f142a;

    public static e a(t tVar, int i3) {
        if (i3 != 0) {
            if (i3 == 1) {
                return new C0314m(tVar, 1);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C0314m(tVar, 0);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d();

    public abstract C0122z e();

    public abstract InterfaceC0700y f(Context context);

    public abstract int g();

    public abstract int h();

    public abstract void i(long j3, int i3);

    public e() {
        this.f142a = new S();
    }

    public e(t tVar) {
        new Rect();
        this.f142a = tVar;
    }
}
