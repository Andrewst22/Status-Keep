package o2;

import C.C0002c;
import D1.I;
import D1.b0;
import R.C0102e;
import R.C0122z;
import U.A;
import U.AbstractC0123a;
import U.x;
import Y.C0134e;
import Y.C0143n;
import Y.C0146q;
import Y.F;
import Y.G;
import Y.InterfaceC0147s;
import Y.c0;
import Y.e0;
import Y.j0;
import android.content.Context;
import android.media.AudioTrack;
import android.view.Surface;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import o0.AbstractC0677a;
import o0.InterfaceC0700y;
import o0.X;
import p2.C0740d;
/* renamed from: o2.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0715l {

    /* renamed from: a  reason: collision with root package name */
    public final C0716m f8705a;

    /* renamed from: b  reason: collision with root package name */
    public final TextureRegistry$SurfaceProducer f8706b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC0147s f8707c;

    public AbstractC0715l(C0716m c0716m, C0122z c0122z, U.c cVar, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer, C0740d c0740d) {
        G g3;
        boolean z3;
        C0102e c0102e;
        this.f8705a = c0716m;
        this.f8706b = textureRegistry$SurfaceProducer;
        switch (c0740d.f8835a) {
            case 0:
                Context context = c0740d.f8836b;
                C0146q c0146q = new C0146q(context);
                InterfaceC0700y f3 = c0740d.f8837c.f(context);
                AbstractC0123a.j(!c0146q.f3393q);
                c0146q.f3380d = new C0143n(f3, 0);
                AbstractC0123a.j(!c0146q.f3393q);
                c0146q.f3393q = true;
                g3 = new G(c0146q);
                break;
            default:
                Context context2 = c0740d.f8836b;
                C0146q c0146q2 = new C0146q(context2);
                InterfaceC0700y f4 = c0740d.f8837c.f(context2);
                AbstractC0123a.j(!c0146q2.f3393q);
                c0146q2.f3380d = new C0143n(f4, 0);
                AbstractC0123a.j(!c0146q2.f3393q);
                c0146q2.f3393q = true;
                g3 = new G(c0146q2);
                break;
        }
        G g4 = g3;
        this.f8707c = g4;
        b0 o3 = I.o(c0122z);
        g4.J();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < o3.f233p; i3++) {
            arrayList.add(g4.f3072q.c((C0122z) o3.get(i3)));
        }
        g4.J();
        g4.s(g4.f3057d0);
        g4.p();
        g4.f3029D++;
        ArrayList arrayList2 = g4.f3070o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i4 = size - 1; i4 >= 0; i4--) {
                arrayList2.remove(i4);
            }
            X x = g4.f3033H;
            int[] iArr = x.f8551b;
            int[] iArr2 = new int[iArr.length - size];
            int i5 = 0;
            for (int i6 = 0; i6 < iArr.length; i6++) {
                int i7 = iArr[i6];
                if (i7 >= 0 && i7 < size) {
                    i5++;
                } else {
                    iArr2[i6 - i5] = i7 >= 0 ? i7 - size : i7;
                }
            }
            g4.f3033H = new X(iArr2, new Random(x.f8550a.nextLong()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            c0 c0Var = new c0((AbstractC0677a) arrayList.get(i8), g4.f3071p);
            arrayList3.add(c0Var);
            arrayList2.add(i8, new F(c0Var.f3226b, c0Var.f3225a));
        }
        g4.f3033H = g4.f3033H.a(arrayList3.size());
        j0 j0Var = new j0(arrayList2, g4.f3033H);
        boolean p3 = j0Var.p();
        int i9 = j0Var.f3336d;
        if (!p3 && -1 >= i9) {
            throw new IllegalStateException();
        }
        int a3 = j0Var.a(false);
        e0 x3 = g4.x(g4.f3057d0, j0Var, g4.y(j0Var, a3, -9223372036854775807L));
        int i10 = x3.f3257e;
        if (a3 != -1 && i10 != 1) {
            i10 = (j0Var.p() || a3 >= i9) ? 4 : 2;
        }
        e0 g5 = x3.g(i10);
        g4.f3066k.f3138t.a(17, new Y.I(arrayList3, g4.f3033H, a3, A.M(-9223372036854775807L))).b();
        if (!g4.f3057d0.f3254b.f8653a.equals(g5.f3254b.f8653a) && !g4.f3057d0.f3253a.p()) {
            z3 = true;
        } else {
            z3 = false;
        }
        g4.H(g5, 0, z3, 4, g4.q(g5), -1);
        ((G) this.f8707c).A();
        InterfaceC0147s interfaceC0147s = this.f8707c;
        AbstractC0704a a4 = a(interfaceC0147s, textureRegistry$SurfaceProducer);
        G g6 = (G) interfaceC0147s;
        g6.getClass();
        g6.f3067l.a(a4);
        InterfaceC0147s interfaceC0147s2 = this.f8707c;
        boolean z4 = cVar.f2428a;
        C0102e c0102e2 = new C0102e(3);
        G g7 = (G) interfaceC0147s2;
        g7.J();
        if (!g7.f3051a0) {
            boolean a5 = A.a(g7.f3045U, c0102e2);
            U.l lVar = g7.f3067l;
            if (!a5) {
                g7.f3045U = c0102e2;
                g7.C(1, 3, c0102e2);
                lVar.c(20, new B0.a(c0102e2, 7));
            }
            if (!z4) {
                c0102e = c0102e2;
            } else {
                c0102e = null;
            }
            C0134e c0134e = g7.f3079y;
            c0134e.b(c0102e);
            g7.f3063h.b(c0102e2);
            boolean u3 = g7.u();
            g7.J();
            int d3 = c0134e.d(g7.f3057d0.f3257e, u3);
            g7.G(d3, d3 == -1 ? 2 : 1, u3);
            lVar.b();
        }
    }

    public abstract AbstractC0704a a(InterfaceC0147s interfaceC0147s, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer);

    public void b() {
        String str;
        AudioTrack audioTrack;
        G g3 = (G) this.f8707c;
        g3.getClass();
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(g3)));
        sb.append(" [AndroidXMedia3/1.4.1] [");
        sb.append(A.f2409e);
        sb.append("] [");
        HashSet hashSet = R.A.f1720a;
        synchronized (R.A.class) {
            str = R.A.f1721b;
        }
        sb.append(str);
        sb.append("]");
        AbstractC0123a.r("ExoPlayerImpl", sb.toString());
        g3.J();
        if (A.f2405a < 21 && (audioTrack = g3.f3037M) != null) {
            audioTrack.release();
            g3.f3037M = null;
        }
        g3.x.b();
        g3.f3080z.getClass();
        g3.f3026A.getClass();
        C0134e c0134e = g3.f3079y;
        c0134e.f3246c = null;
        c0134e.a();
        c0134e.c(0);
        if (!g3.f3066k.x()) {
            g3.f3067l.e(10, new C0002c(9));
        }
        g3.f3067l.d();
        g3.f3064i.f2486a.removeCallbacksAndMessages(null);
        s0.d dVar = g3.f3075t;
        Z.f fVar = g3.f3073r;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((s0.g) dVar).f9172b.f7632n;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            s0.c cVar = (s0.c) it.next();
            if (cVar.f9155b == fVar) {
                cVar.f9156c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        e0 e0Var = g3.f3057d0;
        if (e0Var.f3268p) {
            g3.f3057d0 = e0Var.a();
        }
        e0 g4 = g3.f3057d0.g(1);
        g3.f3057d0 = g4;
        e0 b3 = g4.b(g4.f3254b);
        g3.f3057d0 = b3;
        b3.f3269q = b3.f3271s;
        g3.f3057d0.f3270r = 0L;
        Z.f fVar2 = g3.f3073r;
        x xVar = fVar2.f3483t;
        AbstractC0123a.k(xVar);
        xVar.c(new Z.d(fVar2, 0));
        g3.f3063h.a();
        g3.B();
        Surface surface = g3.f3039O;
        if (surface != null) {
            surface.release();
            g3.f3039O = null;
        }
        int i3 = T.c.f2280b;
        g3.f3051a0 = true;
    }
}
