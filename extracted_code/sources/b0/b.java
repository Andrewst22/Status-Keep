package B0;

import C1.j;
import D1.C;
import D1.G;
import D1.J;
import D1.K;
import D1.e0;
import D1.g0;
import D1.q0;
import R.C0113p;
import R.H;
import R.r;
import U.A;
import U.AbstractC0123a;
import U.y;
import W.g;
import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.net.Uri;
import android.util.SparseArray;
import g0.C0271b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k0.C0538A;
import k0.C0557l;
import k0.C0558m;
import k0.C0559n;
import k0.z;
import p0.C0731d;
import w0.AbstractC0892b;
import w0.i;
import w0.l;
import w0.t;
/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f26m;

    /* renamed from: n  reason: collision with root package name */
    public int f27n;

    /* renamed from: o  reason: collision with root package name */
    public Object f28o;

    /* renamed from: p  reason: collision with root package name */
    public Object f29p;

    public b(int i3, C0559n c0559n, String str) {
        this.f26m = 7;
        this.f27n = i3;
        this.f28o = c0559n;
        this.f29p = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c8, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static B0.b b(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.b.b(android.content.res.Resources, int, android.content.res.Resources$Theme):B0.b");
    }

    private final /* synthetic */ void g() {
    }

    public g0 a() {
        K k3 = (K) this.f29p;
        if (k3 == null) {
            g0 b3 = g0.b(this.f27n, (Object[]) this.f28o, this);
            K k4 = (K) this.f29p;
            if (k4 == null) {
                return b3;
            }
            throw k4.a();
        }
        throw k3.a();
    }

    public long c(l lVar) {
        long j3;
        r rVar;
        t tVar;
        boolean d3;
        int e2;
        while (true) {
            long u3 = lVar.u();
            j3 = lVar.f9607o;
            rVar = (r) this.f29p;
            tVar = (t) this.f28o;
            if (u3 >= j3 - 6) {
                break;
            }
            long u4 = lVar.u();
            byte[] bArr = new byte[2];
            lVar.p(bArr, 0, 2, false);
            int i3 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i4 = this.f27n;
            if (i3 != i4) {
                lVar.f9610r = 0;
                lVar.a((int) (u4 - lVar.f9608p), false);
                d3 = false;
            } else {
                U.t tVar2 = new U.t(16);
                System.arraycopy(bArr, 0, tVar2.f2477a, 0, 2);
                byte[] bArr2 = tVar2.f2477a;
                int i5 = 0;
                for (int i6 = 2; i5 < 14 && (e2 = lVar.e(bArr2, i6 + i5, 14 - i5)) != -1; i6 = 2) {
                    i5 += e2;
                }
                tVar2.F(i5);
                lVar.f9610r = 0;
                lVar.a((int) (u4 - lVar.f9608p), false);
                d3 = AbstractC0892b.d(tVar2, tVar, i4, rVar);
            }
            if (d3) {
                break;
            }
            lVar.a(1, false);
        }
        if (lVar.u() >= j3 - 6) {
            lVar.a((int) (j3 - lVar.u()), false);
            return tVar.f9633j;
        }
        return rVar.f1989a;
    }

    public Object d(int i3) {
        SparseArray sparseArray;
        if (this.f27n == -1) {
            this.f27n = 0;
        }
        while (true) {
            int i4 = this.f27n;
            sparseArray = (SparseArray) this.f28o;
            if (i4 <= 0 || i3 >= sparseArray.keyAt(i4)) {
                break;
            }
            this.f27n--;
        }
        while (this.f27n < sparseArray.size() - 1 && i3 >= sparseArray.keyAt(this.f27n + 1)) {
            this.f27n++;
        }
        return sparseArray.valueAt(this.f27n);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.IOException, A2.b] */
    public C0538A e(int i3, String str, Map map, Uri uri) {
        C0557l c0557l = (C0557l) this.f29p;
        String str2 = c0557l.f7620o;
        int i4 = this.f27n;
        this.f27n = i4 + 1;
        C0558m c0558m = new C0558m(i4, str2, str);
        if (c0557l.f7630z != null) {
            AbstractC0123a.k(c0557l.f7627v);
            try {
                c0558m.g("Authorization", c0557l.f7630z.b(c0557l.f7627v, uri, i3));
            } catch (H e2) {
                C0557l.c(c0557l, new IOException(e2));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            c0558m.g((String) entry.getKey(), (String) entry.getValue());
        }
        return new C0538A(uri, i3, new C0559n(c0558m), "");
    }

    public boolean f() {
        ColorStateList colorStateList;
        if (((Shader) this.f28o) == null && (colorStateList = (ColorStateList) this.f29p) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void h(Object obj, Object obj2) {
        int i3 = (this.f27n + 1) * 2;
        Object[] objArr = (Object[]) this.f28o;
        if (i3 > objArr.length) {
            this.f28o = Arrays.copyOf(objArr, C.e(objArr.length, i3));
        }
        D1.r.d(obj, obj2);
        Object[] objArr2 = (Object[]) this.f28o;
        int i4 = this.f27n;
        int i5 = i4 * 2;
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        this.f27n = i4 + 1;
    }

    public void i() {
        AbstractC0123a.k((C0538A) this.f28o);
        C0559n c0559n = ((C0538A) this.f28o).f7499c;
        HashMap hashMap = new HashMap();
        J j3 = c0559n.f7633a;
        q0 g3 = ((e0) j3.f198p.keySet()).g();
        while (true) {
            G g4 = (G) g3;
            if (g4.hasNext()) {
                String str = (String) g4.next();
                if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                    hashMap.put(str, (String) D1.r.l(j3.d(str)));
                }
            } else {
                C0538A c0538a = (C0538A) this.f28o;
                k(e(c0538a.f7498b, ((C0557l) this.f29p).f7628w, hashMap, c0538a.f7497a));
                return;
            }
        }
    }

    public void j(Uri uri, String str) {
        k(e(2, str, g0.f255s, uri));
    }

    public void k(C0538A c0538a) {
        boolean z3;
        String c3 = c0538a.f7499c.c("CSeq");
        c3.getClass();
        int parseInt = Integer.parseInt(c3);
        C0557l c0557l = (C0557l) this.f29p;
        if (c0557l.f7623r.get(parseInt) == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        c0557l.f7623r.append(parseInt, c0538a);
        c0557l.f7626u.b(z.g(c0538a));
        this.f28o = c0538a;
    }

    public List l(CharSequence charSequence) {
        charSequence.getClass();
        j jVar = (j) this.f29p;
        jVar.getClass();
        C1.i iVar = new C1.i(jVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (iVar.hasNext()) {
            arrayList.add((String) iVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // w0.i
    public void m() {
        switch (this.f26m) {
            case 0:
                return;
            default:
                byte[] bArr = A.f2410f;
                U.t tVar = (U.t) this.f29p;
                tVar.getClass();
                tVar.E(bArr, bArr.length);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    @Override // w0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w0.C0898h n(w0.l r21, long r22) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.b.n(w0.l, long):w0.h");
    }

    public b(C0271b c0271b) {
        this.f26m = 8;
        this.f28o = new SparseArray();
        this.f29p = c0271b;
        this.f27n = -1;
    }

    public b(Shader shader, ColorStateList colorStateList, int i3) {
        this.f26m = 9;
        this.f28o = shader;
        this.f29p = colorStateList;
        this.f27n = i3;
    }

    public b(t tVar, int i3) {
        this.f26m = 0;
        this.f28o = tVar;
        this.f27n = i3;
        this.f29p = new Object();
    }

    public b(int i3, y yVar) {
        this.f26m = 5;
        this.f27n = i3;
        this.f28o = yVar;
        this.f29p = new U.t();
    }

    public b(g gVar) {
        this.f26m = 4;
        this.f29p = C0731d.f8767v;
        this.f28o = gVar;
        this.f27n = 1;
    }

    public b(j jVar) {
        this.f26m = 1;
        this.f29p = jVar;
        this.f28o = C1.c.f150m;
        this.f27n = Integer.MAX_VALUE;
    }

    public b(C0557l c0557l) {
        this.f26m = 6;
        this.f29p = c0557l;
    }

    public b(int i3) {
        this.f26m = 2;
        this.f28o = new Object[i3 * 2];
        this.f27n = 0;
    }

    public b(C0113p c0113p, int i3, String str) {
        this.f26m = 3;
        this.f28o = c0113p;
        this.f27n = i3;
        this.f29p = str;
    }
}
