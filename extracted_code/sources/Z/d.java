package Z;

import C.C0002c;
import a0.L;
import a0.O;
import android.os.HandlerThread;
import androidx.lifecycle.t;
import androidx.lifecycle.y;
import e0.C0262c;
import io.flutter.plugin.platform.n;
import m0.C0616c;
import u0.C0856e;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3468m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f3469n;

    public /* synthetic */ d(Object obj, int i3) {
        this.f3468m = i3;
        this.f3469n = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3468m) {
            case 0:
                f fVar = (f) this.f3469n;
                fVar.J(fVar.E(), 1028, new C0002c(20));
                fVar.f3481r.d();
                return;
            case 1:
                L l3 = (L) this.f3469n;
                if (l3.f3682k0 >= 300000) {
                    ((O) l3.f3691s.f168n).f3709b1 = true;
                    l3.f3682k0 = 0L;
                    return;
                }
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                ((a2.c) this.f3469n).f3854b.f3861e.prefetchDefaultFontManager();
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                y yVar = (y) this.f3469n;
                D2.i.e(yVar, "this$0");
                int i3 = yVar.f4364n;
                t tVar = yVar.f4368r;
                if (i3 == 0) {
                    yVar.f4365o = true;
                    tVar.d(androidx.lifecycle.k.ON_PAUSE);
                }
                if (yVar.f4363m == 0 && yVar.f4365o) {
                    tVar.d(androidx.lifecycle.k.ON_STOP);
                    yVar.f4366p = true;
                    return;
                }
                return;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                ((C0262c) this.f3469n).s();
                return;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                h0.g gVar = (h0.g) this.f3469n;
                synchronized (gVar.f5829a) {
                    try {
                        if (!gVar.f5841m) {
                            long j3 = gVar.f5840l - 1;
                            gVar.f5840l = j3;
                            int i4 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                            if (i4 <= 0) {
                                if (i4 < 0) {
                                    gVar.b(new IllegalStateException());
                                    return;
                                } else {
                                    gVar.a();
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((n) this.f3469n).i(false);
                return;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((HandlerThread) this.f3469n).quit();
                return;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                ((C0616c) this.f3469n).x();
                return;
            case 9:
                ((Q0.h) this.f3469n).getClass();
                return;
            default:
                C0856e c0856e = (C0856e) this.f3469n;
                int i5 = c0856e.f9332k - 1;
                c0856e.f9332k = i5;
                if (i5 <= 0) {
                    if (i5 >= 0) {
                        c0856e.f9324c.a();
                        return;
                    }
                    throw new IllegalStateException(String.valueOf(c0856e.f9332k));
                }
                return;
        }
    }
}
