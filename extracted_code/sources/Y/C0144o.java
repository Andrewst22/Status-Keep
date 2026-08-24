package Y;

import android.content.Context;
import h0.C0283c;
import java.util.HashMap;
import o0.C0690n;
/* renamed from: Y.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0144o implements C1.k {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3374m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Context f3375n;

    public /* synthetic */ C0144o(Context context, int i3) {
        this.f3374m = i3;
        this.f3375n = context;
    }

    @Override // C1.k
    public final Object get() {
        s0.g gVar;
        switch (this.f3374m) {
            case 0:
                return new C0141l(this.f3375n);
            case 1:
                return new C0690n(new B1.a(this.f3375n, 8), new w0.m());
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new r0.q(this.f3375n);
            default:
                Context context = this.f3375n;
                D1.b0 b0Var = s0.g.f9164n;
                synchronized (s0.g.class) {
                    try {
                        if (s0.g.f9170t == null) {
                            C0283c c0283c = new C0283c(context);
                            s0.g.f9170t = new s0.g((Context) c0283c.f5812o, (HashMap) c0283c.f5813p, c0283c.f5810m, (U.v) c0283c.f5814q, c0283c.f5811n);
                        }
                        gVar = s0.g.f9170t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return gVar;
        }
    }
}
