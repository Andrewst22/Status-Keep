package B0;

import C1.e;
import D1.F;
import D1.b0;
import N.k;
import Q0.u;
import R.C0102e;
import R.C0113p;
import R.I;
import R.L;
import R.U;
import T0.g;
import T0.h;
import U.A;
import U.i;
import Y.C0136g;
import Y.D;
import android.util.Log;
import android.view.View;
import h0.C;
import h0.o;
import java.io.IOException;
import java.util.List;
import o0.r;
import org.json.JSONException;
import org.json.JSONObject;
import r0.C0754g;
import r0.C0757j;
import r0.n;
import r2.InterfaceC0768c;
import w0.InterfaceC0897g;
import w0.t;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0897g, e, U.d, i, g2.d, C, n, InterfaceC0768c {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f24m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f25n;

    public /* synthetic */ a(Z.a aVar, Object obj, int i3) {
        this.f24m = i3;
        this.f25n = obj;
    }

    @Override // w0.InterfaceC0897g
    public long a(long j3) {
        t tVar = (t) this.f25n;
        return A.k((j3 * tVar.f9628e) / 1000000, 0L, tVar.f9633j - 1);
    }

    @Override // U.d
    public void accept(Object obj) {
        T0.a aVar = (T0.a) obj;
        switch (this.f24m) {
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                h hVar = (h) this.f25n;
                hVar.getClass();
                g gVar = new g(aVar.f2298b, B1.b.o(aVar.f2297a, aVar.f2299c));
                hVar.f2312c.add(gVar);
                long j3 = hVar.f2319j;
                if (j3 == -9223372036854775807L || aVar.f2298b >= j3) {
                    hVar.a(gVar);
                    return;
                }
                return;
            default:
                ((F) this.f25n).a(aVar);
                return;
        }
    }

    @Override // C1.e
    public Object apply(Object obj) {
        u uVar = (u) obj;
        ((Q0.n) this.f25n).getClass();
        return uVar;
    }

    @Override // U.i
    public void b(Object obj) {
        switch (this.f24m) {
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((L) obj).r((R.C) this.f25n);
                return;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((L) obj).d((C0102e) this.f25n);
                return;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                ((L) obj).f((T.c) this.f25n);
                return;
            case 9:
                ((L) obj).r(((D) this.f25n).f3021a.f3036K);
                return;
            case 10:
                ((L) obj).k((R.F) this.f25n);
                return;
            case 11:
                ((L) obj).u((List) this.f25n);
                return;
            case 12:
            default:
                ((Z.k) obj).getClass();
                return;
            case 13:
                Z.k kVar = (Z.k) obj;
                int i3 = kVar.x;
                C0136g c0136g = (C0136g) this.f25n;
                kVar.x = i3 + c0136g.f3295g;
                kVar.f3525y += c0136g.f3293e;
                return;
            case 14:
                Z.k kVar2 = (Z.k) obj;
                kVar2.getClass();
                kVar2.f3523v = ((l0.g) this.f25n).f8021a;
                return;
            case 15:
                ((Z.k) obj).f3515n = (I) this.f25n;
                return;
        }
    }

    @Override // h0.C
    public int c(Object obj) {
        boolean z3;
        o oVar = (o) obj;
        oVar.getClass();
        C0113p c0113p = (C0113p) this.f25n;
        String str = c0113p.f1974m;
        String str2 = oVar.f5854b;
        if (!str2.equals(str) && !str2.equals(h0.D.b(c0113p))) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3 && oVar.c(c0113p, false)) {
            return 1;
        }
        return 0;
    }

    @Override // r2.InterfaceC0768c
    public boolean d(View view) {
        int i3 = 0;
        while (true) {
            Class[] clsArr = (Class[]) this.f25n;
            if (i3 >= clsArr.length) {
                return false;
            }
            if (clsArr[i3].isInstance(view)) {
                return true;
            }
            i3++;
        }
    }

    @Override // r0.n
    public b0 e(int i3, U u3, int[] iArr) {
        F i4 = D1.I.i();
        for (int i5 = 0; i5 < u3.f1821a; i5++) {
            int i6 = i5;
            i4.a(new C0754g(i3, u3, i6, (C0757j) this.f25n, iArr[i5]));
        }
        return i4.g();
    }

    @Override // g2.d
    public void o(Object obj) {
        boolean z3 = false;
        if (obj != null) {
            try {
                z3 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e2) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
            }
        }
        ((A.i) ((a) this.f25n).f25n).e(z3);
    }

    public /* synthetic */ a(Z.a aVar, Object obj, long j3) {
        this.f24m = 16;
        this.f25n = obj;
    }

    public /* synthetic */ a(Z.a aVar, r rVar, l0.g gVar, IOException iOException, boolean z3) {
        this.f24m = 14;
        this.f25n = gVar;
    }

    public /* synthetic */ a(Object obj, int i3) {
        this.f24m = i3;
        this.f25n = obj;
    }
}
