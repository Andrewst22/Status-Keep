package B;

import C1.d;
import N.k;
import R.C0112o;
import R.C0113p;
import R.G;
import U.t;
import X.f;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import h0.B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k0.q;
import k0.r;
import o0.T;
import o0.U;
import w0.l;
/* loaded from: classes.dex */
public final class b implements B, U {

    /* renamed from: m  reason: collision with root package name */
    public int f22m;

    /* renamed from: n  reason: collision with root package name */
    public Object f23n;

    public /* synthetic */ b(int i3, Object obj) {
        this.f22m = i3;
        this.f23n = obj;
    }

    @Override // o0.U
    public void a() {
        A2.b bVar = ((r) this.f23n).x;
        if (bVar == null) {
            return;
        }
        throw bVar;
    }

    public void b(long j3) {
        int i3 = this.f22m;
        long[] jArr = (long[]) this.f23n;
        if (i3 == jArr.length) {
            this.f23n = Arrays.copyOf(jArr, i3 * 2);
        }
        int i4 = this.f22m;
        this.f22m = i4 + 1;
        ((long[]) this.f23n)[i4] = j3;
    }

    @Override // h0.B
    public boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // h0.B
    public int d() {
        if (((MediaCodecInfo[]) this.f23n) == null) {
            this.f23n = new MediaCodecList(this.f22m).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f23n).length;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c1.InterfaceC0233G e(int r6, U.r r7) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B.b.e(int, U.r):c1.G");
    }

    @Override // o0.U
    public boolean f() {
        r rVar = (r) this.f23n;
        if (!rVar.f7648C) {
            q qVar = (q) rVar.f7658q.get(this.f22m);
            if (qVar.f7642c.w(qVar.f7643d)) {
                return true;
            }
        }
        return false;
    }

    @Override // h0.B
    public MediaCodecInfo g(int i3) {
        if (((MediaCodecInfo[]) this.f23n) == null) {
            this.f23n = new MediaCodecList(this.f22m).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f23n)[i3];
    }

    public long h(int i3) {
        if (i3 >= 0 && i3 < this.f22m) {
            return ((long[]) this.f23n)[i3];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i3 + ", size is " + this.f22m);
    }

    @Override // o0.U
    public int i(B1.a aVar, f fVar, int i3) {
        r rVar = (r) this.f23n;
        if (rVar.f7648C) {
            return -3;
        }
        q qVar = (q) rVar.f7658q.get(this.f22m);
        return qVar.f7642c.B(aVar, fVar, i3, qVar.f7643d);
    }

    public List j(U.r rVar) {
        boolean z3;
        String str;
        int i3;
        List list;
        boolean k3 = k(32);
        List list2 = (List) this.f23n;
        if (k3) {
            return list2;
        }
        t tVar = new t((byte[]) rVar.f2468d);
        while (tVar.a() > 0) {
            int u3 = tVar.u();
            int u4 = tVar.f2478b + tVar.u();
            if (u3 == 134) {
                ArrayList arrayList = new ArrayList();
                int u5 = tVar.u() & 31;
                for (int i4 = 0; i4 < u5; i4++) {
                    String s3 = tVar.s(3, d.f153c);
                    int u6 = tVar.u();
                    if ((u6 & 128) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i3 = u6 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i3 = 1;
                    }
                    byte u7 = (byte) tVar.u();
                    tVar.H(1);
                    if (z3) {
                        list = Collections.singletonList((u7 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C0112o c0112o = new C0112o();
                    c0112o.f1937l = G.l(str);
                    c0112o.f1929d = s3;
                    c0112o.f1921E = i3;
                    c0112o.f1940o = list;
                    arrayList.add(new C0113p(c0112o));
                }
                list2 = arrayList;
            }
            tVar.G(u4);
        }
        return list2;
    }

    public boolean k(int i3) {
        if ((i3 & this.f22m) != 0) {
            return true;
        }
        return false;
    }

    public long l(l lVar) {
        t tVar = (t) this.f23n;
        int i3 = 0;
        lVar.p(tVar.f2477a, 0, 1, false);
        int i4 = tVar.f2477a[0] & 255;
        if (i4 == 0) {
            return Long.MIN_VALUE;
        }
        int i5 = 128;
        int i6 = 0;
        while ((i4 & i5) == 0) {
            i5 >>= 1;
            i6++;
        }
        int i7 = i4 & (~i5);
        lVar.p(tVar.f2477a, 1, i6, false);
        while (i3 < i6) {
            i3++;
            i7 = (tVar.f2477a[i3] & 255) + (i7 << 8);
        }
        this.f22m = i6 + 1 + this.f22m;
        return i7;
    }

    @Override // h0.B
    public boolean m(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // o0.U
    public int n(long j3) {
        r rVar = (r) this.f23n;
        if (rVar.f7648C) {
            return -3;
        }
        q qVar = (q) rVar.f7658q.get(this.f22m);
        T t3 = qVar.f7642c;
        int t4 = t3.t(j3, qVar.f7643d);
        t3.H(t4);
        return t4;
    }

    @Override // h0.B
    public boolean o() {
        return true;
    }

    public /* synthetic */ b(Object obj, int i3) {
        this.f23n = obj;
        this.f22m = i3;
    }

    public b(int i3, boolean z3) {
        switch (i3) {
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f23n = new long[32];
                return;
            default:
                this.f23n = new t(8);
                return;
        }
    }

    public b(int i3) {
        if (i3 > 0) {
            this.f23n = new Object[i3];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
}
