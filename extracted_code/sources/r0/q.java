package r0;

import D1.C0043w;
import D1.I;
import D1.a0;
import R.C0102e;
import R.C0113p;
import R.U;
import U.A;
import Y.M;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import l.C0576n;
import o0.b0;
/* loaded from: classes.dex */
public final class q extends u {

    /* renamed from: i  reason: collision with root package name */
    public static final a0 f8985i = new C0043w(new U0.d(6));

    /* renamed from: c  reason: collision with root package name */
    public final Object f8986c;

    /* renamed from: d  reason: collision with root package name */
    public final e0.l f8987d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8988e;

    /* renamed from: f  reason: collision with root package name */
    public final C0757j f8989f;

    /* renamed from: g  reason: collision with root package name */
    public final l f8990g;

    /* renamed from: h  reason: collision with root package name */
    public C0102e f8991h;

    public q(Context context) {
        Spatializer spatializer;
        l lVar;
        e0.l lVar2 = new e0.l(27);
        int i3 = C0757j.f8945A;
        C0757j c0757j = new C0757j(new C0756i(context));
        this.f8986c = new Object();
        context.getApplicationContext();
        this.f8987d = lVar2;
        this.f8989f = c0757j;
        this.f8991h = C0102e.f1884c;
        boolean L = A.L(context);
        this.f8988e = L;
        if (!L && A.f2405a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                spatializer = audioManager.getSpatializer();
                lVar = new l(spatializer);
            } else {
                lVar = null;
            }
            this.f8990g = lVar;
        }
    }

    public static int c(int i3, int i4) {
        if (i3 != 0 && i3 == i4) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i3 & i4);
    }

    public static int d(C0113p c0113p, String str, boolean z3) {
        if (!TextUtils.isEmpty(str) && str.equals(c0113p.f1965d)) {
            return 4;
        }
        String f3 = f(str);
        String f4 = f(c0113p.f1965d);
        if (f4 != null && f3 != null) {
            if (!f4.startsWith(f3) && !f3.startsWith(f4)) {
                int i3 = A.f2405a;
                if (!f4.split("-", 2)[0].equals(f3.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z3 || f4 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair h(int i3, C0576n c0576n, int[][][] iArr, n nVar, Comparator comparator) {
        RandomAccess randomAccess;
        C0576n c0576n2 = c0576n;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < c0576n2.f7873a) {
            if (i3 == ((int[]) c0576n2.f7874b)[i4]) {
                b0 b0Var = ((b0[]) c0576n2.f7875c)[i4];
                for (int i5 = 0; i5 < b0Var.f8579a; i5++) {
                    U a3 = b0Var.a(i5);
                    D1.b0 e2 = nVar.e(i4, a3, iArr[i4][i5]);
                    int i6 = a3.f1821a;
                    boolean[] zArr = new boolean[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        o oVar = (o) e2.get(i7);
                        int a4 = oVar.a();
                        if (!zArr[i7] && a4 != 0) {
                            if (a4 == 1) {
                                randomAccess = I.o(oVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(oVar);
                                for (int i8 = i7 + 1; i8 < i6; i8++) {
                                    o oVar2 = (o) e2.get(i8);
                                    if (oVar2.a() == 2 && oVar.b(oVar2)) {
                                        arrayList2.add(oVar2);
                                        zArr[i8] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i4++;
            c0576n2 = c0576n;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((o) list.get(i9)).f8969o;
        }
        o oVar3 = (o) list.get(0);
        return Pair.create(new r(oVar3.f8968n, iArr2), Integer.valueOf(oVar3.f8967m));
    }

    @Override // r0.u
    public final void a() {
        l lVar;
        C0758k c0758k;
        synchronized (this.f8986c) {
            try {
                if (A.f2405a >= 32 && (lVar = this.f8990g) != null && (c0758k = lVar.f8958d) != null && lVar.f8957c != null) {
                    lVar.f8955a.removeOnSpatializerStateChangedListener(c0758k);
                    lVar.f8957c.removeCallbacksAndMessages(null);
                    lVar.f8957c = null;
                    lVar.f8958d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8994a = null;
        this.f8995b = null;
    }

    @Override // r0.u
    public final void b(C0102e c0102e) {
        boolean equals;
        synchronized (this.f8986c) {
            equals = this.f8991h.equals(c0102e);
            this.f8991h = c0102e;
        }
        if (!equals) {
            e();
        }
    }

    public final void e() {
        boolean z3;
        M m3;
        l lVar;
        synchronized (this.f8986c) {
            try {
                if (this.f8989f.f8950v && !this.f8988e && A.f2405a >= 32 && (lVar = this.f8990g) != null && lVar.f8956b) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3 && (m3 = this.f8994a) != null) {
            m3.f3138t.e(10);
        }
    }

    public final void g() {
        synchronized (this.f8986c) {
            this.f8989f.getClass();
        }
    }
}
