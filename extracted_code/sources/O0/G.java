package o0;

import R.C0115s;
import R.C0117u;
import R.C0118v;
import R.C0120x;
import R.C0122z;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class G extends AbstractC0686j {

    /* renamed from: D  reason: collision with root package name */
    public static final C0122z f8428D;

    /* renamed from: A  reason: collision with root package name */
    public int f8429A;

    /* renamed from: B  reason: collision with root package name */
    public long[][] f8430B;

    /* renamed from: C  reason: collision with root package name */
    public A2.b f8431C;

    /* renamed from: w  reason: collision with root package name */
    public final AbstractC0677a[] f8432w;
    public final R.T[] x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList f8433y;

    /* renamed from: z  reason: collision with root package name */
    public final e0.l f8434z;

    /* JADX WARN: Type inference failed for: r4v0, types: [R.s, R.t] */
    static {
        R.r rVar = new R.r();
        D1.G g3 = D1.I.f197n;
        D1.b0 b0Var = D1.b0.f231q;
        Collections.emptyList();
        D1.b0 b0Var2 = D1.b0.f231q;
        C0117u c0117u = new C0117u();
        f8428D = new C0122z("MergingMediaSource", new C0115s(rVar), null, new C0118v(c0117u), R.C.f1745y, C0120x.f2006a);
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, D1.r] */
    public G(AbstractC0677a... abstractC0677aArr) {
        e0.l lVar = new e0.l(25);
        this.f8432w = abstractC0677aArr;
        this.f8434z = lVar;
        this.f8433y = new ArrayList(Arrays.asList(abstractC0677aArr));
        this.f8429A = -1;
        this.x = new R.T[abstractC0677aArr.length];
        this.f8430B = new long[0];
        new HashMap();
        D1.r.e("expectedKeys", 8);
        new Object().a().v();
    }

    @Override // o0.AbstractC0677a
    public final InterfaceC0699x b(C0701z c0701z, s0.e eVar, long j3) {
        AbstractC0677a[] abstractC0677aArr = this.f8432w;
        int length = abstractC0677aArr.length;
        InterfaceC0699x[] interfaceC0699xArr = new InterfaceC0699x[length];
        R.T[] tArr = this.x;
        int b3 = tArr[0].b(c0701z.f8653a);
        for (int i3 = 0; i3 < length; i3++) {
            interfaceC0699xArr[i3] = abstractC0677aArr[i3].b(c0701z.a(tArr[i3].l(b3)), eVar, j3 - this.f8430B[b3][i3]);
        }
        return new F(this.f8434z, this.f8430B[b3], interfaceC0699xArr);
    }

    @Override // o0.AbstractC0677a
    public final C0122z k() {
        AbstractC0677a[] abstractC0677aArr = this.f8432w;
        if (abstractC0677aArr.length > 0) {
            return abstractC0677aArr[0].k();
        }
        return f8428D;
    }

    @Override // o0.AbstractC0686j, o0.AbstractC0677a
    public final void m() {
        A2.b bVar = this.f8431C;
        if (bVar == null) {
            super.m();
            return;
        }
        throw bVar;
    }

    @Override // o0.AbstractC0677a
    public final void o(W.B b3) {
        this.f8611v = b3;
        this.f8610u = U.A.n(null);
        int i3 = 0;
        while (true) {
            AbstractC0677a[] abstractC0677aArr = this.f8432w;
            if (i3 < abstractC0677aArr.length) {
                A(Integer.valueOf(i3), abstractC0677aArr[i3]);
                i3++;
            } else {
                return;
            }
        }
    }

    @Override // o0.AbstractC0677a
    public final void q(InterfaceC0699x interfaceC0699x) {
        F f3 = (F) interfaceC0699x;
        int i3 = 0;
        while (true) {
            AbstractC0677a[] abstractC0677aArr = this.f8432w;
            if (i3 < abstractC0677aArr.length) {
                AbstractC0677a abstractC0677a = abstractC0677aArr[i3];
                InterfaceC0699x interfaceC0699x2 = f3.f8419m[i3];
                if (interfaceC0699x2 instanceof a0) {
                    interfaceC0699x2 = ((a0) interfaceC0699x2).f8575m;
                }
                abstractC0677a.q(interfaceC0699x2);
                i3++;
            } else {
                return;
            }
        }
    }

    @Override // o0.AbstractC0686j, o0.AbstractC0677a
    public final void s() {
        super.s();
        Arrays.fill(this.x, (Object) null);
        this.f8429A = -1;
        this.f8431C = null;
        ArrayList arrayList = this.f8433y;
        arrayList.clear();
        Collections.addAll(arrayList, this.f8432w);
    }

    @Override // o0.AbstractC0677a
    public final void v(C0122z c0122z) {
        this.f8432w[0].v(c0122z);
    }

    @Override // o0.AbstractC0686j
    public final C0701z w(Object obj, C0701z c0701z) {
        if (((Integer) obj).intValue() != 0) {
            return null;
        }
        return c0701z;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.IOException, A2.b] */
    @Override // o0.AbstractC0686j
    public final void z(Object obj, AbstractC0677a abstractC0677a, R.T t3) {
        Integer num = (Integer) obj;
        if (this.f8431C == null) {
            if (this.f8429A == -1) {
                this.f8429A = t3.h();
            } else if (t3.h() != this.f8429A) {
                this.f8431C = new IOException();
                return;
            }
            int length = this.f8430B.length;
            R.T[] tArr = this.x;
            if (length == 0) {
                this.f8430B = (long[][]) Array.newInstance(Long.TYPE, this.f8429A, tArr.length);
            }
            ArrayList arrayList = this.f8433y;
            arrayList.remove(abstractC0677a);
            tArr[num.intValue()] = t3;
            if (arrayList.isEmpty()) {
                p(tArr[0]);
            }
        }
    }
}
