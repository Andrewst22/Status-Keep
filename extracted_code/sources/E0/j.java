package e0;

import D1.G;
import D1.I;
import D1.b0;
import R.C0113p;
import R.U;
import U.A;
import U.AbstractC0123a;
import W.B;
import android.net.Uri;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0.C0678b;
import p0.AbstractC0732e;
import r0.AbstractC0750c;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final C0263d f5238a;

    /* renamed from: b  reason: collision with root package name */
    public final W.h f5239b;

    /* renamed from: c  reason: collision with root package name */
    public final W.h f5240c;

    /* renamed from: d  reason: collision with root package name */
    public final C0262c f5241d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri[] f5242e;

    /* renamed from: f  reason: collision with root package name */
    public final C0113p[] f5243f;

    /* renamed from: g  reason: collision with root package name */
    public final f0.c f5244g;

    /* renamed from: h  reason: collision with root package name */
    public final U f5245h;

    /* renamed from: i  reason: collision with root package name */
    public final List f5246i;

    /* renamed from: k  reason: collision with root package name */
    public final Z.m f5248k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5249l;

    /* renamed from: n  reason: collision with root package name */
    public C0678b f5251n;

    /* renamed from: o  reason: collision with root package name */
    public Uri f5252o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5253p;

    /* renamed from: q  reason: collision with root package name */
    public r0.s f5254q;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5256s;

    /* renamed from: j  reason: collision with root package name */
    public final C0262c f5247j = new C0262c(1);

    /* renamed from: m  reason: collision with root package name */
    public byte[] f5250m = A.f2410f;

    /* renamed from: r  reason: collision with root package name */
    public long f5255r = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r3v1, types: [r0.c, r0.s, e0.h] */
    public j(C0263d c0263d, f0.c cVar, Uri[] uriArr, C0113p[] c0113pArr, C0262c c0262c, B b3, C0262c c0262c2, List list, Z.m mVar) {
        this.f5238a = c0263d;
        this.f5244g = cVar;
        this.f5242e = uriArr;
        this.f5243f = c0113pArr;
        this.f5241d = c0262c2;
        this.f5246i = list;
        this.f5248k = mVar;
        W.h a3 = ((W.g) c0262c.f5225n).a();
        this.f5239b = a3;
        if (b3 != null) {
            a3.y(b3);
        }
        this.f5240c = ((W.g) c0262c.f5225n).a();
        this.f5245h = new U("", c0113pArr);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < uriArr.length; i3++) {
            if ((c0113pArr[i3].f1967f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        U u3 = this.f5245h;
        int[] X2 = android.support.v4.media.session.a.X(arrayList);
        ?? abstractC0750c = new AbstractC0750c(u3, X2);
        abstractC0750c.f5233g = abstractC0750c.i(u3.f1824d[X2[0]]);
        this.f5254q = abstractC0750c;
    }

    public final p0.m[] a(m mVar, long j3) {
        int b3;
        boolean z3;
        int i3;
        List list;
        if (mVar == null) {
            b3 = -1;
        } else {
            b3 = this.f5245h.b(mVar.f8781p);
        }
        int length = this.f5254q.length();
        p0.m[] mVarArr = new p0.m[length];
        boolean z4 = false;
        int i4 = 0;
        while (i4 < length) {
            int k3 = this.f5254q.k(i4);
            Uri uri = this.f5242e[k3];
            f0.c cVar = this.f5244g;
            if (!cVar.d(uri)) {
                mVarArr[i4] = p0.m.f8824h;
                i3 = i4;
            } else {
                f0.i a3 = cVar.a(z4, uri);
                a3.getClass();
                long j4 = a3.f5458h - cVar.f5432z;
                if (k3 != b3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i3 = i4;
                Pair c3 = c(mVar, z3, a3, j4, j3);
                long longValue = ((Long) c3.first).longValue();
                int intValue = ((Integer) c3.second).intValue();
                int i5 = (int) (longValue - a3.f5461k);
                if (i5 >= 0) {
                    I i6 = a3.f5468r;
                    if (i6.size() >= i5) {
                        ArrayList arrayList = new ArrayList();
                        if (i5 < i6.size()) {
                            if (intValue != -1) {
                                f0.f fVar = (f0.f) i6.get(i5);
                                if (intValue == 0) {
                                    arrayList.add(fVar);
                                } else if (intValue < fVar.f5437y.size()) {
                                    I i7 = fVar.f5437y;
                                    arrayList.addAll(i7.subList(intValue, i7.size()));
                                }
                                i5++;
                            }
                            arrayList.addAll(i6.subList(i5, i6.size()));
                            intValue = 0;
                        }
                        if (a3.f5464n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            I i8 = a3.f5469s;
                            if (intValue < i8.size()) {
                                arrayList.addAll(i8.subList(intValue, i8.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        mVarArr[i3] = new g(j4, list);
                    }
                }
                G g3 = I.f197n;
                list = b0.f231q;
                mVarArr[i3] = new g(j4, list);
            }
            i4 = i3 + 1;
            z4 = false;
        }
        return mVarArr;
    }

    public final int b(m mVar) {
        I i3;
        if (mVar.f5262A == -1) {
            return 1;
        }
        f0.i a3 = this.f5244g.a(false, this.f5242e[this.f5245h.b(mVar.f8781p)]);
        a3.getClass();
        int i4 = (int) (mVar.f8823v - a3.f5461k);
        if (i4 < 0) {
            return 1;
        }
        I i5 = a3.f5468r;
        if (i4 < i5.size()) {
            i3 = ((f0.f) i5.get(i4)).f5437y;
        } else {
            i3 = a3.f5469s;
        }
        int size = i3.size();
        int i6 = mVar.f5262A;
        if (i6 >= size) {
            return 2;
        }
        f0.d dVar = (f0.d) i3.get(i6);
        if (dVar.f5433y) {
            return 0;
        }
        if (A.a(Uri.parse(AbstractC0123a.x(a3.f5491a, dVar.f5438m)), mVar.f8779n.f2767a)) {
            return 1;
        }
        return 2;
    }

    public final Pair c(m mVar, boolean z3, f0.i iVar, long j3, long j4) {
        I i3;
        long j5;
        boolean z4 = true;
        int i4 = -1;
        if (mVar != null && !z3) {
            boolean z5 = mVar.f5280T;
            long j6 = mVar.f8823v;
            int i5 = mVar.f5262A;
            if (z5) {
                if (i5 == -1) {
                    j6 = mVar.a();
                }
                Long valueOf = Long.valueOf(j6);
                if (i5 != -1) {
                    i4 = i5 + 1;
                }
                return new Pair(valueOf, Integer.valueOf(i4));
            }
            return new Pair(Long.valueOf(j6), Integer.valueOf(i5));
        }
        long j7 = iVar.f5471u + j3;
        if (mVar != null && !this.f5253p) {
            j4 = mVar.f8784s;
        }
        boolean z6 = iVar.f5465o;
        long j8 = iVar.f5461k;
        I i6 = iVar.f5468r;
        if (!z6 && j4 >= j7) {
            return new Pair(Long.valueOf(j8 + i6.size()), -1);
        }
        long j9 = j4 - j3;
        Long valueOf2 = Long.valueOf(j9);
        int i7 = 0;
        if (this.f5244g.f5431y && mVar != null) {
            z4 = false;
        }
        int d3 = A.d(i6, valueOf2, z4);
        long j10 = d3 + j8;
        if (d3 >= 0) {
            f0.f fVar = (f0.f) i6.get(d3);
            I i8 = iVar.f5469s;
            if (j9 < fVar.f5442q + fVar.f5440o) {
                i3 = fVar.f5437y;
            } else {
                i3 = i8;
            }
            while (true) {
                if (i7 >= i3.size()) {
                    break;
                }
                f0.d dVar = (f0.d) i3.get(i7);
                if (j9 < dVar.f5442q + dVar.f5440o) {
                    if (dVar.x) {
                        if (i3 == i8) {
                            j5 = 1;
                        } else {
                            j5 = 0;
                        }
                        j10 += j5;
                        i4 = i7;
                    }
                } else {
                    i7++;
                }
            }
        }
        return new Pair(Long.valueOf(j10), Integer.valueOf(i4));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [p0.e, e0.f] */
    public final f d(Uri uri, int i3, boolean z3) {
        if (uri == null) {
            return null;
        }
        C0262c c0262c = this.f5247j;
        byte[] bArr = (byte[]) ((C0264e) c0262c.f5225n).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((C0264e) c0262c.f5225n).put(uri, bArr);
            return null;
        }
        W.l lVar = new W.l(uri, 1, null, Collections.emptyMap(), 0L, -1L, null, 1);
        C0113p c0113p = this.f5243f[i3];
        int e2 = this.f5254q.e();
        Object l3 = this.f5254q.l();
        byte[] bArr3 = this.f5250m;
        ?? abstractC0732e = new AbstractC0732e(this.f5240c, lVar, 3, c0113p, e2, l3, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = A.f2410f;
        }
        abstractC0732e.f5229v = bArr3;
        return abstractC0732e;
    }
}
