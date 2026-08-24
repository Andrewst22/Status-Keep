package U;

import D1.I;
import D1.b0;
import D1.q0;
import R.C0113p;
import R.H;
import R.Q;
import R.T;
import R.c0;
import Y.C;
import Y.C0136g;
import Y.C0142m;
import Y.D;
import Y.F;
import Y.G;
import Y.J;
import Y.M;
import Y.e0;
import Y.h0;
import Y.j0;
import a0.C0171o;
import a0.O;
import a0.RunnableC0169m;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.profileinstaller.ProfileInstallerInitializer;
import g2.C0276a;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k0.AbstractC0543F;
import k0.C0538A;
import k0.C0539B;
import k0.C0540C;
import k0.C0557l;
import k0.C0558m;
import k0.C0559n;
import o0.C0701z;
import w0.InterfaceC0890A;
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f2458m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f2459n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f2460o;

    public /* synthetic */ n(int i3, Object obj, Object obj2) {
        this.f2458m = i3;
        this.f2459n = obj;
        this.f2460o = obj2;
    }

    private final void a() {
        h0 h0Var = (h0) this.f2460o;
        ((M) this.f2459n).getClass();
        try {
            synchronized (h0Var) {
            }
            h0Var.f3306a.d(h0Var.f3309d, h0Var.f3310e);
            h0Var.b(true);
        } catch (C0142m e2) {
            AbstractC0123a.o("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private final void b() {
        C0171o c0171o = (C0171o) this.f2459n;
        C0136g c0136g = (C0136g) this.f2460o;
        c0171o.getClass();
        synchronized (c0136g) {
        }
        D d3 = c0171o.f3775c;
        int i3 = A.f2405a;
        Z.f fVar = d3.f3021a.f3073r;
        fVar.J(fVar.G((C0701z) fVar.f3479p.f3474e), 1013, new Z.c(13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [Y.G] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.io.IOException, A2.b] */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.io.IOException] */
    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        boolean z3;
        ?? r20;
        boolean z4;
        Handler handler;
        boolean z5;
        boolean z6;
        String str;
        boolean z7;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        C0539B a3;
        b0 m3;
        Uri uri;
        B0.b bVar;
        A2.b bVar2;
        B0.b bVar3;
        Uri uri2;
        InterfaceC0890A sVar;
        long j4 = -9223372036854775807L;
        boolean z8 = false;
        int i3 = 1;
        switch (this.f2458m) {
            case 0:
                ((s0.f) this.f2460o).a(((r) this.f2459n).d());
                return;
            case 1:
                ?? r02 = (G) this.f2459n;
                J j5 = (J) this.f2460o;
                int i4 = r02.f3029D - j5.f3086a;
                r02.f3029D = i4;
                if (j5.f3088c) {
                    r02.f3030E = j5.f3089d;
                    r02.f3031F = true;
                }
                if (i4 == 0) {
                    T t3 = ((e0) j5.f3090e).f3253a;
                    if (!r02.f3057d0.f3253a.p() && t3.p()) {
                        r02.f3059e0 = -1;
                        r02.f3061f0 = 0L;
                    }
                    if (!t3.p()) {
                        List asList = Arrays.asList(((j0) t3).f3340h);
                        if (asList.size() == r02.f3070o.size()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        AbstractC0123a.j(z4);
                        for (int i5 = 0; i5 < asList.size(); i5++) {
                            ((F) r02.f3070o.get(i5)).f3025b = (T) asList.get(i5);
                        }
                    }
                    if (r02.f3031F) {
                        if (((e0) j5.f3090e).f3254b.equals(r02.f3057d0.f3254b) && ((e0) j5.f3090e).f3256d == r02.f3057d0.f3271s) {
                            i3 = 0;
                        }
                        if (i3 != 0) {
                            if (!t3.p() && !((e0) j5.f3090e).f3254b.b()) {
                                e0 e0Var = (e0) j5.f3090e;
                                C0701z c0701z = e0Var.f3254b;
                                long j6 = e0Var.f3256d;
                                Object obj = c0701z.f8653a;
                                Q q3 = r02.f3069n;
                                t3.g(obj, q3);
                                j4 = j6 + q3.f1799e;
                            } else {
                                j4 = ((e0) j5.f3090e).f3256d;
                            }
                        }
                        j3 = j4;
                        r20 = i3;
                        z3 = false;
                    } else {
                        j3 = -9223372036854775807L;
                        z3 = false;
                        r20 = 0;
                    }
                    r02.f3031F = z3;
                    r02.H((e0) j5.f3090e, 1, r20, r02.f3030E, j3, -1);
                    return;
                }
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                a();
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                b();
                return;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                a0.M m4 = (a0.M) this.f2460o;
                C0171o c0171o = ((O) ((C1.j) this.f2459n).f168n).f3700R0;
                Handler handler2 = c0171o.f3774b;
                if (handler2 != null) {
                    handler2.post(new RunnableC0169m(c0171o, m4, 2));
                    return;
                }
                return;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                ((f0.b) ((e0.n) ((e0.t) this.f2459n).f5372o.f5225n).f5297n.f5423p.get(((e0.m) this.f2460o).f5285y)).d(true);
                return;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                f0.b bVar4 = (f0.b) this.f2459n;
                bVar4.f5416u = false;
                bVar4.f((Uri) this.f2460o);
                return;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((ProfileInstallerInitializer) this.f2459n).getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = g1.h.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new g1.e((Context) this.f2460o, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                C0276a c0276a = (C0276a) this.f2459n;
                I i6 = (I) this.f2460o;
                C0557l c0557l = (C0557l) c0276a.f5778o;
                c0557l.getClass();
                Pattern pattern = k0.z.f7693a;
                if (k0.z.f7694b.matcher((CharSequence) i6.get(0)).matches()) {
                    Matcher matcher = k0.z.f7694b.matcher((CharSequence) i6.get(0));
                    AbstractC0123a.e(matcher.matches());
                    String group = matcher.group(1);
                    group.getClass();
                    int parseInt = Integer.parseInt(group);
                    int indexOf = i6.indexOf("");
                    if (indexOf > 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    AbstractC0123a.e(z7);
                    List subList = i6.subList(1, indexOf);
                    C0558m c0558m = new C0558m(0);
                    c0558m.h(subList);
                    B0.b bVar5 = new B0.b(parseInt, new C0559n(c0558m), new C1.f(k0.z.f7700h).b(i6.subList(indexOf + 1, i6.size())));
                    C0559n c0559n = (C0559n) bVar5.f28o;
                    String c3 = c0559n.c("CSeq");
                    AbstractC0123a.h(c3);
                    int parseInt2 = Integer.parseInt(c3);
                    sparseArray = c0557l.f7623r;
                    C0538A c0538a = (C0538A) sparseArray.get(parseInt2);
                    if (c0538a != null) {
                        sparseArray2 = c0557l.f7623r;
                        sparseArray2.remove(parseInt2);
                        int i7 = bVar5.f27n;
                        int i8 = c0538a.f7498b;
                        try {
                            try {
                                if (i7 != 200) {
                                    if (i7 != 401) {
                                        if (i7 != 461) {
                                            if (i7 != 301 && i7 != 302) {
                                                C0557l.c(c0557l, new A2.b(k0.z.h(i8) + " " + i7));
                                                return;
                                            }
                                            if (c0557l.f7613A != -1) {
                                                c0557l.f7613A = 0;
                                            }
                                            String c4 = c0559n.c("Location");
                                            if (c4 == null) {
                                                c0557l.f7618m.o("Redirection without new location.", null);
                                                return;
                                            }
                                            Uri parse = Uri.parse(c4);
                                            c0557l.f7625t = k0.z.f(parse);
                                            c0557l.f7627v = k0.z.d(parse);
                                            bVar3 = c0557l.f7624s;
                                            uri2 = c0557l.f7625t;
                                            bVar3.j(uri2, c0557l.f7628w);
                                            return;
                                        }
                                        String str2 = k0.z.h(i8) + " " + i7;
                                        String c5 = c0538a.f7499c.c("Transport");
                                        AbstractC0123a.h(c5);
                                        if (i8 == 10 && !c5.contains("TCP")) {
                                            bVar2 = new IOException(str2);
                                        } else {
                                            bVar2 = new A2.b(str2);
                                        }
                                        C0557l.c(c0557l, bVar2);
                                        return;
                                    } else if (c0557l.f7627v != null && !c0557l.f7615C) {
                                        c0559n.getClass();
                                        I d3 = c0559n.f7633a.d(C0559n.b("WWW-Authenticate"));
                                        if (!d3.isEmpty()) {
                                            for (int i9 = 0; i9 < d3.size(); i9++) {
                                                c0557l.f7630z = k0.z.e((String) d3.get(i9));
                                                if (c0557l.f7630z.f2465a == 2) {
                                                    bVar = c0557l.f7624s;
                                                    bVar.i();
                                                    c0557l.f7615C = true;
                                                    return;
                                                }
                                            }
                                            bVar = c0557l.f7624s;
                                            bVar.i();
                                            c0557l.f7615C = true;
                                            return;
                                        }
                                        throw H.b("Missing WWW-Authenticate header in a 401 response.", null);
                                    } else {
                                        C0557l.c(c0557l, new A2.b(k0.z.h(i8) + " " + i7));
                                        return;
                                    }
                                }
                                switch (i8) {
                                    case 1:
                                    case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                                    case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                    case N.k.BYTES_FIELD_NUMBER /* 8 */:
                                    case 9:
                                    case 11:
                                    case 12:
                                        return;
                                    case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                                        c0276a.d(new C0276a((Object) c0559n, (Object) AbstractC0543F.a((String) bVar5.f29p), 9, false));
                                        return;
                                    case N.k.LONG_FIELD_NUMBER /* 4 */:
                                        c0276a.e(new C0558m(k0.z.b(c0559n.c("Public"))));
                                        return;
                                    case N.k.STRING_FIELD_NUMBER /* 5 */:
                                        c0276a.f();
                                        return;
                                    case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                        String c6 = c0559n.c("Range");
                                        if (c6 == null) {
                                            a3 = C0539B.f7501c;
                                        } else {
                                            a3 = C0539B.a(c6);
                                        }
                                        try {
                                            String c7 = c0559n.c("RTP-Info");
                                            if (c7 != null) {
                                                uri = c0557l.f7625t;
                                                m3 = C0540C.a(uri, c7);
                                            } else {
                                                m3 = I.m();
                                            }
                                        } catch (H unused) {
                                            m3 = I.m();
                                        }
                                        c0276a.g(new C0276a(a3, m3));
                                        return;
                                    case 10:
                                        String c8 = c0559n.c("Session");
                                        String c9 = c0559n.c("Transport");
                                        if (c8 != null && c9 != null) {
                                            c0276a.h(new C0558m(k0.z.c(c8), 5));
                                            return;
                                        }
                                        throw H.b("Missing mandatory session or transport header", null);
                                    default:
                                        throw new IllegalStateException();
                                }
                            } catch (H e2) {
                                e = e2;
                                C0557l.c(c0557l, new IOException(e));
                                return;
                            }
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            C0557l.c(c0557l, new IOException(e));
                            return;
                        }
                    }
                    return;
                }
                Matcher matcher2 = k0.z.f7693a.matcher((CharSequence) i6.get(0));
                AbstractC0123a.e(matcher2.matches());
                String group2 = matcher2.group(1);
                group2.getClass();
                k0.z.a(group2);
                String group3 = matcher2.group(2);
                group3.getClass();
                Uri.parse(group3);
                int indexOf2 = i6.indexOf("");
                if (indexOf2 > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                AbstractC0123a.e(z5);
                List subList2 = i6.subList(1, indexOf2);
                C0558m c0558m2 = new C0558m(0);
                c0558m2.h(subList2);
                C0559n i10 = c0558m2.i();
                new C1.f(k0.z.f7700h).b(i6.subList(indexOf2 + 1, i6.size()));
                String c10 = i10.c("CSeq");
                c10.getClass();
                int parseInt3 = Integer.parseInt(c10);
                B0.b bVar6 = c0557l.f7624s;
                C0557l c0557l2 = (C0557l) bVar6.f29p;
                B0.b bVar7 = new B0.b(405, new C0558m(parseInt3, c0557l2.f7620o, c0557l2.f7628w).i(), "");
                C0559n c0559n2 = (C0559n) bVar7.f28o;
                if (c0559n2.c("CSeq") != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                AbstractC0123a.e(z6);
                D1.F f3 = new D1.F();
                int i11 = bVar7.f27n;
                Integer valueOf = Integer.valueOf(i11);
                if (i11 != 200) {
                    if (i11 != 461) {
                        if (i11 != 500) {
                            if (i11 != 505) {
                                if (i11 != 301) {
                                    if (i11 != 302) {
                                        if (i11 != 400) {
                                            if (i11 != 401) {
                                                if (i11 != 404) {
                                                    if (i11 != 405) {
                                                        switch (i11) {
                                                            case 454:
                                                                str = "Session Not Found";
                                                                break;
                                                            case 455:
                                                                str = "Method Not Valid In This State";
                                                                break;
                                                            case 456:
                                                                str = "Header Field Not Valid";
                                                                break;
                                                            case 457:
                                                                str = "Invalid Range";
                                                                break;
                                                            default:
                                                                throw new IllegalArgumentException();
                                                        }
                                                    } else {
                                                        str = "Method Not Allowed";
                                                    }
                                                } else {
                                                    str = "Not Found";
                                                }
                                            } else {
                                                str = "Unauthorized";
                                            }
                                        } else {
                                            str = "Bad Request";
                                        }
                                    } else {
                                        str = "Move Temporarily";
                                    }
                                } else {
                                    str = "Move Permanently";
                                }
                            } else {
                                str = "RTSP Version Not Supported";
                            }
                        } else {
                            str = "Internal Server Error";
                        }
                    } else {
                        str = "Unsupported Transport";
                    }
                } else {
                    str = "OK";
                }
                f3.c(A.o("%s %s %s", "RTSP/1.0", valueOf, str));
                D1.J a4 = c0559n2.a();
                q0 it = a4.e().iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    I d4 = a4.d(str3);
                    for (int i12 = 0; i12 < d4.size(); i12++) {
                        f3.c(A.o("%s: %s", str3, d4.get(i12)));
                    }
                }
                f3.c("");
                f3.c((String) bVar7.f29p);
                c0557l2.f7626u.b(f3.g());
                bVar6.f27n = Math.max(bVar6.f27n, parseInt3 + 1);
                return;
            case 9:
                k0.x xVar = (k0.x) this.f2459n;
                byte[] bArr = (byte[]) this.f2460o;
                xVar.getClass();
                try {
                    xVar.f7682m.write(bArr);
                    return;
                } catch (Exception unused2) {
                    if (!xVar.f7685p.f7692r) {
                        C0276a c0276a2 = xVar.f7685p.f7687m;
                        return;
                    }
                    return;
                }
            case 10:
                o0.M m5 = (o0.M) this.f2459n;
                J0.b bVar8 = m5.f8460D;
                InterfaceC0890A interfaceC0890A = (InterfaceC0890A) this.f2460o;
                if (bVar8 == null) {
                    sVar = interfaceC0890A;
                } else {
                    sVar = new w0.s(-9223372036854775807L);
                }
                m5.L = sVar;
                m5.f8468M = interfaceC0890A.k();
                if (!m5.f8474S && interfaceC0890A.k() == -9223372036854775807L) {
                    z8 = true;
                }
                m5.f8469N = z8;
                if (z8) {
                    i3 = 7;
                }
                m5.f8470O = i3;
                if (m5.f8464H) {
                    m5.f8487s.x(m5.f8468M, interfaceC0890A.c(), m5.f8469N);
                    return;
                } else {
                    m5.z();
                    return;
                }
            case 11:
                ((Q0.h) this.f2459n).e((Typeface) this.f2460o);
                return;
            case 12:
                C0171o c0171o2 = (C0171o) this.f2459n;
                c0171o2.getClass();
                int i13 = A.f2405a;
                G g3 = c0171o2.f3775c.f3021a;
                c0 c0Var = (c0) this.f2460o;
                g3.f3053b0 = c0Var;
                g3.f3067l.e(25, new C(c0Var));
                return;
            case 13:
                C0171o c0171o3 = (C0171o) this.f2459n;
                c0171o3.getClass();
                int i14 = A.f2405a;
                G g4 = c0171o3.f3775c.f3021a;
                g4.L = (C0113p) this.f2460o;
                Z.f fVar = g4.f3073r;
                fVar.J(fVar.I(), 1017, new Z.c(15));
                return;
            default:
                C0171o c0171o4 = (C0171o) this.f2459n;
                C0136g c0136g = (C0136g) this.f2460o;
                c0171o4.getClass();
                synchronized (c0136g) {
                }
                D d5 = c0171o4.f3775c;
                int i15 = A.f2405a;
                G g5 = d5.f3021a;
                Z.f fVar2 = g5.f3073r;
                Z.a G3 = fVar2.G((C0701z) fVar2.f3479p.f3474e);
                fVar2.J(G3, 1020, new B0.a(G3, (Object) c0136g, 13));
                g5.L = null;
                return;
        }
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i3) {
        this.f2458m = i3;
        this.f2459n = obj;
        this.f2460o = obj2;
    }
}
