package q0;

import D1.I;
import D1.b0;
import D2.h;
import R.C0113p;
import T0.e;
import T0.i;
import U.AbstractC0123a;
import X.f;
import Y.AbstractC0135f;
import Y.D;
import Y.G;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Objects;
import k0.C0558m;
/* renamed from: q0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0746d extends AbstractC0135f implements Handler.Callback {

    /* renamed from: D  reason: collision with root package name */
    public final B1.b f8861D;

    /* renamed from: E  reason: collision with root package name */
    public final f f8862E;

    /* renamed from: F  reason: collision with root package name */
    public InterfaceC0743a f8863F;

    /* renamed from: G  reason: collision with root package name */
    public final C0558m f8864G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f8865H;

    /* renamed from: I  reason: collision with root package name */
    public int f8866I;

    /* renamed from: J  reason: collision with root package name */
    public e f8867J;

    /* renamed from: K  reason: collision with root package name */
    public i f8868K;
    public T0.c L;

    /* renamed from: M  reason: collision with root package name */
    public T0.c f8869M;

    /* renamed from: N  reason: collision with root package name */
    public int f8870N;

    /* renamed from: O  reason: collision with root package name */
    public final Handler f8871O;

    /* renamed from: P  reason: collision with root package name */
    public final D f8872P;

    /* renamed from: Q  reason: collision with root package name */
    public final B1.a f8873Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f8874R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f8875S;

    /* renamed from: T  reason: collision with root package name */
    public C0113p f8876T;

    /* renamed from: U  reason: collision with root package name */
    public long f8877U;

    /* renamed from: V  reason: collision with root package name */
    public long f8878V;

    /* renamed from: W  reason: collision with root package name */
    public long f8879W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0746d(D d3, Looper looper) {
        super(3);
        Handler handler;
        C0558m c0558m = InterfaceC0745c.f8860i;
        this.f8872P = d3;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.f8871O = handler;
        this.f8864G = c0558m;
        this.f8861D = new B1.b(16);
        this.f8862E = new f(1);
        this.f8873Q = new B1.a(13, false);
        this.f8879W = -9223372036854775807L;
        this.f8877U = -9223372036854775807L;
        this.f8878V = -9223372036854775807L;
    }

    public final void B() {
        boolean z3;
        if (!Objects.equals(this.f8876T.f1974m, "application/cea-608") && !Objects.equals(this.f8876T.f1974m, "application/x-mp4-cea-608") && !Objects.equals(this.f8876T.f1974m, "application/cea-708")) {
            z3 = false;
        } else {
            z3 = true;
        }
        AbstractC0123a.i("Legacy decoding is disabled, can't handle " + this.f8876T.f1974m + " samples (expected application/x-media3-cues).", z3);
    }

    public final long C() {
        if (this.f8870N == -1) {
            return Long.MAX_VALUE;
        }
        this.L.getClass();
        if (this.f8870N >= this.L.P()) {
            return Long.MAX_VALUE;
        }
        return this.L.F(this.f8870N);
    }

    public final long D(long j3) {
        boolean z3;
        boolean z4 = false;
        if (j3 != -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        if (this.f8877U != -9223372036854775807L) {
            z4 = true;
        }
        AbstractC0123a.j(z4);
        return j3 - this.f8877U;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r3.equals("application/cea-608") == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E() {
        /*
            r7 = this;
            r0 = 1
            r7.f8865H = r0
            R.p r1 = r7.f8876T
            r1.getClass()
            k0.m r2 = r7.f8864G
            r2.getClass()
            java.lang.String r3 = r1.f1974m
            if (r3 == 0) goto L4d
            int r4 = r1.f1956F
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L31;
                case 1566015601: goto L28;
                case 1566016562: goto L1d;
                default: goto L1b;
            }
        L1b:
            r0 = -1
            goto L3b
        L1d:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L26
            goto L1b
        L26:
            r0 = 2
            goto L3b
        L28:
            java.lang.String r6 = "application/cea-608"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L3b
            goto L1b
        L31:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3a
            goto L1b
        L3a:
            r0 = 0
        L3b:
            switch(r0) {
                case 0: goto L47;
                case 1: goto L47;
                case 2: goto L3f;
                default: goto L3e;
            }
        L3e:
            goto L4d
        L3f:
            U0.g r0 = new U0.g
            java.util.List r1 = r1.f1977p
            r0.<init>(r4, r1)
            goto L6e
        L47:
            U0.c r0 = new U0.c
            r0.<init>(r3, r4)
            goto L6e
        L4d:
            java.lang.Object r0 = r2.f7632n
            B1.b r0 = (B1.b) r0
            boolean r2 = r0.g(r1)
            if (r2 == 0) goto L76
            T0.l r0 = r0.l(r1)
            g0.c r1 = new g0.c
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6e:
            r7.f8867J = r0
            long r1 = r7.x
            r0.e(r1)
            return
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = D2.h.l(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.C0746d.E():void");
    }

    public final void F(T.c cVar) {
        I i3 = cVar.f2281a;
        D d3 = this.f8872P;
        d3.f3021a.f3067l.e(27, new B0.a(i3, 11));
        G g3 = d3.f3021a;
        g3.getClass();
        g3.f3067l.e(27, new B0.a(cVar, 8));
    }

    public final void G() {
        this.f8868K = null;
        this.f8870N = -1;
        T0.c cVar = this.L;
        if (cVar != null) {
            cVar.f();
            this.L = null;
        }
        T0.c cVar2 = this.f8869M;
        if (cVar2 != null) {
            cVar2.f();
            this.f8869M = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            F((T.c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // Y.AbstractC0135f
    public final String i() {
        return "TextRenderer";
    }

    @Override // Y.AbstractC0135f
    public final boolean k() {
        return this.f8875S;
    }

    @Override // Y.AbstractC0135f
    public final boolean l() {
        return true;
    }

    @Override // Y.AbstractC0135f
    public final void m() {
        this.f8876T = null;
        this.f8879W = -9223372036854775807L;
        b0 b0Var = b0.f231q;
        D(this.f8878V);
        T.c cVar = new T.c(b0Var);
        Handler handler = this.f8871O;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            F(cVar);
        }
        this.f8877U = -9223372036854775807L;
        this.f8878V = -9223372036854775807L;
        if (this.f8867J != null) {
            G();
            e eVar = this.f8867J;
            eVar.getClass();
            eVar.release();
            this.f8867J = null;
            this.f8866I = 0;
        }
    }

    @Override // Y.AbstractC0135f
    public final void o(long j3, boolean z3) {
        this.f8878V = j3;
        InterfaceC0743a interfaceC0743a = this.f8863F;
        if (interfaceC0743a != null) {
            interfaceC0743a.clear();
        }
        b0 b0Var = b0.f231q;
        D(this.f8878V);
        T.c cVar = new T.c(b0Var);
        Handler handler = this.f8871O;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            F(cVar);
        }
        this.f8874R = false;
        this.f8875S = false;
        this.f8879W = -9223372036854775807L;
        C0113p c0113p = this.f8876T;
        if (c0113p != null && !Objects.equals(c0113p.f1974m, "application/x-media3-cues")) {
            if (this.f8866I != 0) {
                G();
                e eVar = this.f8867J;
                eVar.getClass();
                eVar.release();
                this.f8867J = null;
                this.f8866I = 0;
                E();
                return;
            }
            G();
            e eVar2 = this.f8867J;
            eVar2.getClass();
            eVar2.flush();
            eVar2.e(this.x);
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [i1.J, java.lang.Object] */
    @Override // Y.AbstractC0135f
    public final void t(C0113p[] c0113pArr, long j3, long j4) {
        C0744b c0744b;
        this.f8877U = j4;
        C0113p c0113p = c0113pArr[0];
        this.f8876T = c0113p;
        if (!Objects.equals(c0113p.f1974m, "application/x-media3-cues")) {
            B();
            if (this.f8867J != null) {
                this.f8866I = 1;
                return;
            } else {
                E();
                return;
            }
        }
        if (this.f8876T.f1957G == 1) {
            c0744b = new C0744b();
        } else {
            ?? obj = new Object();
            obj.f5973a = new ArrayList();
            c0744b = obj;
        }
        this.f8863F = c0744b;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x023d A[EXC_TOP_SPLITTER, LOOP:2: B:138:0x023d->B:131:0x02ab, LOOP_START, PHI: r15 
      PHI: (r15v2 B1.a) = (r15v1 B1.a), (r15v3 B1.a) binds: [B:100:0x0239, B:131:0x02ab] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01eb  */
    @Override // Y.AbstractC0135f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.C0746d.v(long, long):void");
    }

    @Override // Y.AbstractC0135f
    public final int z(C0113p c0113p) {
        int i3;
        if (!Objects.equals(c0113p.f1974m, "application/x-media3-cues")) {
            C0558m c0558m = this.f8864G;
            c0558m.getClass();
            if (!((B1.b) c0558m.f7632n).g(c0113p)) {
                String str = c0113p.f1974m;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    if (R.G.j(str)) {
                        return h.e(1, 0, 0, 0);
                    }
                    return h.e(0, 0, 0, 0);
                }
            }
        }
        if (c0113p.f1960J == 0) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        return h.e(i3, 0, 0, 0);
    }
}
