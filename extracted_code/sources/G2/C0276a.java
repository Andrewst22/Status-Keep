package g2;

import D1.F;
import D1.I;
import D1.b0;
import K.C0059m;
import R.C0105h;
import R.C0113p;
import R.G;
import R.H;
import U.A;
import U.AbstractC0123a;
import a.AbstractC0155a;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.LocationManager;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import e0.C0262c;
import g0.C0271b;
import h0.C0282b;
import h0.C0283c;
import i1.C0320s;
import i2.InterfaceC0321a;
import j0.InterfaceC0515a;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import k0.C0539B;
import k0.C0540C;
import k0.C0542E;
import k0.C0548c;
import k0.C0550e;
import k0.C0551f;
import k0.C0557l;
import k0.C0558m;
import k0.C0559n;
import k0.RunnableC0556k;
import k0.RunnableC0560o;
import l.AbstractC0582u;
import m2.AbstractC0635d;
import n2.AbstractC0664g;
import o0.T;
import r1.C0760b;
import t0.C0816a;
import w0.InterfaceC0890A;
import x1.C0901b;
import z.C0909e;
/* renamed from: g2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276a implements d, e, h0.k, s0.p, w0.q, r1.h, p {

    /* renamed from: p  reason: collision with root package name */
    public static W1.y f5775p;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f5776m;

    /* renamed from: n  reason: collision with root package name */
    public Object f5777n;

    /* renamed from: o  reason: collision with root package name */
    public Object f5778o;

    public /* synthetic */ C0276a(int i3, Object obj, Object obj2) {
        this.f5776m = i3;
        this.f5778o = obj;
        this.f5777n = obj2;
    }

    @Override // g2.e
    public void D(ByteBuffer byteBuffer, Y1.g gVar) {
        switch (this.f5776m) {
            case 1:
                C0059m c0059m = (C0059m) this.f5778o;
                try {
                    ((InterfaceC0278c) this.f5777n).d(((n) c0059m.f652o).a(byteBuffer), new C0276a(0, this, gVar));
                    return;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0059m.f651n), "Failed to handle message", e2);
                    gVar.a(null);
                    return;
                }
            default:
                r rVar = (r) this.f5778o;
                try {
                    ((p) this.f5777n).onMethodCall(rVar.f5792c.c(byteBuffer), new R1.f(2, this, gVar));
                    return;
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#" + rVar.f5791b, "Failed to handle method call", e3);
                    gVar.a(rVar.f5792c.e(e3.getMessage(), Log.getStackTraceString(e3)));
                    return;
                }
        }
    }

    @Override // h0.k
    /* renamed from: a */
    public C0283c j(h0.j jVar) {
        MediaCodec mediaCodec;
        h0.m c0262c;
        int i3;
        C0283c c0283c;
        String str = jVar.f5847a.f5853a;
        C0283c c0283c2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                C0113p c0113p = jVar.f5849c;
                int i4 = A.f2405a;
                try {
                    if (i4 >= 34) {
                        if (i4 < 35) {
                            if (G.k(c0113p.f1974m)) {
                            }
                        }
                        c0262c = new C0262c(mediaCodec, 22);
                        i3 = 4;
                        c0283c = new C0283c(mediaCodec, (HandlerThread) ((C0282b) this.f5777n).get(), c0262c);
                        Trace.endSection();
                        C0283c.c(c0283c, jVar.f5848b, jVar.f5850d, jVar.f5851e, i3);
                        return c0283c;
                    }
                    Trace.endSection();
                    C0283c.c(c0283c, jVar.f5848b, jVar.f5850d, jVar.f5851e, i3);
                    return c0283c;
                } catch (Exception e2) {
                    e = e2;
                    c0283c2 = c0283c;
                    if (c0283c2 == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        c0283c2.release();
                    }
                    throw e;
                }
                c0262c = new h0.f(mediaCodec, (HandlerThread) ((C0282b) this.f5778o).get());
                i3 = 0;
                c0283c = new C0283c(mediaCodec, (HandlerThread) ((C0282b) this.f5777n).get(), c0262c);
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
            mediaCodec = null;
        }
    }

    public View b(int i3, int i4, int i5, int i6) {
        int s3;
        int i7;
        int t3;
        int i8;
        View o3;
        int left;
        int i9;
        int right;
        int i10;
        C0320s c0320s = (C0320s) this.f5777n;
        switch (c0320s.f6050a) {
            case 0:
                s3 = c0320s.f6051b.s();
                break;
            default:
                s3 = c0320s.f6051b.u();
                break;
        }
        switch (c0320s.f6050a) {
            case 0:
                i1.t tVar = c0320s.f6051b;
                i7 = tVar.f6057f;
                t3 = tVar.t();
                break;
            default:
                i1.t tVar2 = c0320s.f6051b;
                i7 = tVar2.f6058g;
                t3 = tVar2.r();
                break;
        }
        int i11 = i7 - t3;
        if (i4 > i3) {
            i8 = 1;
        } else {
            i8 = -1;
        }
        View view = null;
        while (i3 != i4) {
            switch (c0320s.f6050a) {
                case 0:
                    o3 = c0320s.f6051b.o(i3);
                    break;
                default:
                    o3 = c0320s.f6051b.o(i3);
                    break;
            }
            switch (c0320s.f6050a) {
                case 0:
                    c0320s.f6051b.getClass();
                    left = o3.getLeft() - ((i1.u) o3.getLayoutParams()).f6059a.left;
                    i9 = ((ViewGroup.MarginLayoutParams) ((i1.u) o3.getLayoutParams())).leftMargin;
                    break;
                default:
                    c0320s.f6051b.getClass();
                    left = o3.getTop() - ((i1.u) o3.getLayoutParams()).f6059a.top;
                    i9 = ((ViewGroup.MarginLayoutParams) ((i1.u) o3.getLayoutParams())).topMargin;
                    break;
            }
            int i12 = left - i9;
            switch (c0320s.f6050a) {
                case 0:
                    c0320s.f6051b.getClass();
                    right = o3.getRight() + ((i1.u) o3.getLayoutParams()).f6059a.right;
                    i10 = ((ViewGroup.MarginLayoutParams) ((i1.u) o3.getLayoutParams())).rightMargin;
                    break;
                default:
                    c0320s.f6051b.getClass();
                    right = o3.getBottom() + ((i1.u) o3.getLayoutParams()).f6059a.bottom;
                    i10 = ((ViewGroup.MarginLayoutParams) ((i1.u) o3.getLayoutParams())).bottomMargin;
                    break;
            }
            int i13 = right + i10;
            C0105h c0105h = (C0105h) this.f5778o;
            c0105h.f1893b = s3;
            c0105h.f1894c = i11;
            c0105h.f1895d = i12;
            c0105h.f1896e = i13;
            if (i5 != 0) {
                c0105h.f1892a = i5;
                if (c0105h.a()) {
                    return o3;
                }
            }
            if (i6 != 0) {
                c0105h.f1892a = i6;
                if (c0105h.a()) {
                    view = o3;
                }
            }
            i3 += i8;
        }
        return view;
    }

    public w0.o c(Object... objArr) {
        Constructor b3;
        synchronized (((AtomicBoolean) this.f5778o)) {
            if (!((AtomicBoolean) this.f5778o).get()) {
                try {
                    b3 = ((C0271b) this.f5777n).b();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f5778o).set(true);
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating extension", e2);
                }
            }
            b3 = null;
        }
        if (b3 == null) {
            return null;
        }
        try {
            return (w0.o) b3.newInstance(objArr);
        } catch (Exception e3) {
            throw new IllegalStateException("Unexpected error creating extractor", e3);
        }
    }

    public void d(C0276a c0276a) {
        boolean z3;
        boolean z4;
        boolean z5;
        C0539B c0539b = C0539B.f7501c;
        String str = (String) ((C0542E) c0276a.f5778o).f7520a.get("range");
        C0557l c0557l = (C0557l) this.f5778o;
        if (str != null) {
            try {
                c0539b = C0539B.a(str);
            } catch (H e2) {
                c0557l.f7618m.o("SDP format error.", e2);
                return;
            }
        }
        Uri uri = c0557l.f7625t;
        F f3 = new F();
        int i3 = 0;
        while (true) {
            C0542E c0542e = (C0542E) c0276a.f5778o;
            if (i3 < c0542e.f7521b.size()) {
                C0548c c0548c = (C0548c) c0542e.f7521b.get(i3);
                String N3 = AbstractC0155a.N(c0548c.f7564j.f7552b);
                N3.getClass();
                char c3 = 65535;
                switch (N3.hashCode()) {
                    case -1922091719:
                        if (N3.equals("MPEG4-GENERIC")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case 2412:
                        if (N3.equals("L8")) {
                            c3 = 1;
                            break;
                        }
                        break;
                    case 64593:
                        if (N3.equals("AC3")) {
                            c3 = 2;
                            break;
                        }
                        break;
                    case 64934:
                        if (N3.equals("AMR")) {
                            c3 = 3;
                            break;
                        }
                        break;
                    case 74609:
                        if (N3.equals("L16")) {
                            c3 = 4;
                            break;
                        }
                        break;
                    case 85182:
                        if (N3.equals("VP8")) {
                            c3 = 5;
                            break;
                        }
                        break;
                    case 85183:
                        if (N3.equals("VP9")) {
                            c3 = 6;
                            break;
                        }
                        break;
                    case 2194728:
                        if (N3.equals("H264")) {
                            c3 = 7;
                            break;
                        }
                        break;
                    case 2194729:
                        if (N3.equals("H265")) {
                            c3 = '\b';
                            break;
                        }
                        break;
                    case 2433087:
                        if (N3.equals("OPUS")) {
                            c3 = '\t';
                            break;
                        }
                        break;
                    case 2450119:
                        if (N3.equals("PCMA")) {
                            c3 = '\n';
                            break;
                        }
                        break;
                    case 2450139:
                        if (N3.equals("PCMU")) {
                            c3 = 11;
                            break;
                        }
                        break;
                    case 1061166827:
                        if (N3.equals("MP4A-LATM")) {
                            c3 = '\f';
                            break;
                        }
                        break;
                    case 1934494802:
                        if (N3.equals("AMR-WB")) {
                            c3 = '\r';
                            break;
                        }
                        break;
                    case 1959269366:
                        if (N3.equals("MP4V-ES")) {
                            c3 = 14;
                            break;
                        }
                        break;
                    case 2137188397:
                        if (N3.equals("H263-1998")) {
                            c3 = 15;
                            break;
                        }
                        break;
                    case 2137209252:
                        if (N3.equals("H263-2000")) {
                            c3 = 16;
                            break;
                        }
                        break;
                }
                switch (c3) {
                    case 0:
                    case 1:
                    case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    case N.k.LONG_FIELD_NUMBER /* 4 */:
                    case N.k.STRING_FIELD_NUMBER /* 5 */:
                    case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    case N.k.BYTES_FIELD_NUMBER /* 8 */:
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                        z5 = true;
                        break;
                    default:
                        z5 = false;
                        break;
                }
                if (z5) {
                    f3.c(new k0.v((C0559n) c0276a.f5777n, c0548c, uri));
                }
                i3++;
            } else {
                b0 g3 = f3.g();
                boolean isEmpty = g3.isEmpty();
                C0558m c0558m = c0557l.f7618m;
                if (isEmpty) {
                    c0558m.o("No playable track.", null);
                    return;
                }
                c0558m.getClass();
                int i4 = 0;
                while (true) {
                    int size = g3.size();
                    k0.r rVar = (k0.r) c0558m.f7632n;
                    if (i4 < size) {
                        k0.q qVar = new k0.q(rVar, (k0.v) g3.get(i4), i4, rVar.f7661t);
                        rVar.f7658q.add(qVar);
                        qVar.b();
                        i4++;
                    } else {
                        C0558m j3 = k0.r.j(rVar);
                        j3.getClass();
                        long j4 = c0539b.f7503a;
                        long j5 = c0539b.f7504b;
                        long M3 = A.M(j5 - j4);
                        k0.u uVar = (k0.u) j3.f7632n;
                        uVar.x = M3;
                        if (j5 == -9223372036854775807L) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        uVar.f7674y = !z3;
                        if (j5 == -9223372036854775807L) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        uVar.f7675z = z4;
                        uVar.f7668A = false;
                        uVar.w();
                        c0557l.f7614B = true;
                        return;
                    }
                }
            }
        }
    }

    public void e(C0558m c0558m) {
        C0557l c0557l = (C0557l) this.f5778o;
        if (c0557l.f7629y != null) {
            return;
        }
        I i3 = (I) c0558m.f7632n;
        if (!i3.isEmpty() && !i3.contains(2)) {
            c0557l.f7618m.o("DESCRIBE not supported.", null);
            return;
        }
        c0557l.f7624s.j(c0557l.f7625t, c0557l.f7628w);
    }

    public void f() {
        boolean z3;
        C0557l c0557l = (C0557l) this.f5778o;
        if (c0557l.f7613A == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        c0557l.f7613A = 1;
        c0557l.f7616D = false;
        long j3 = c0557l.f7617E;
        if (j3 != -9223372036854775807L) {
            c0557l.i(A.Z(j3));
        }
    }

    public void g(C0276a c0276a) {
        boolean z3;
        k0.r rVar;
        C0550e c0550e;
        C0557l c0557l = (C0557l) this.f5778o;
        int i3 = c0557l.f7613A;
        if (i3 != 1 && i3 != 2) {
            z3 = false;
        } else {
            z3 = true;
        }
        AbstractC0123a.j(z3);
        c0557l.f7613A = 2;
        if (c0557l.f7629y == null) {
            long j3 = c0557l.x / 2;
            RunnableC0556k runnableC0556k = new RunnableC0556k(c0557l, j3);
            c0557l.f7629y = runnableC0556k;
            if (!runnableC0556k.f7611o) {
                runnableC0556k.f7611o = true;
                runnableC0556k.f7609m.postDelayed(runnableC0556k, j3);
            }
        }
        c0557l.f7617E = -9223372036854775807L;
        C0558m c0558m = c0557l.f7619n;
        long M3 = A.M(((C0539B) c0276a.f5777n).f7503a);
        I i4 = (I) c0276a.f5778o;
        c0558m.getClass();
        ArrayList arrayList = new ArrayList(i4.size());
        for (int i5 = 0; i5 < i4.size(); i5++) {
            String path = ((C0540C) i4.get(i5)).f7507c.getPath();
            AbstractC0123a.h(path);
            arrayList.add(path);
        }
        int i6 = 0;
        while (true) {
            rVar = (k0.r) c0558m.f7632n;
            if (i6 >= k0.r.i(rVar).size()) {
                break;
            }
            if (!arrayList.contains(((k0.p) k0.r.i(rVar).get(i6)).a().getPath())) {
                k0.u uVar = (k0.u) k0.r.j(rVar).f7632n;
                uVar.f7674y = false;
                uVar.w();
                if (k0.r.k(rVar)) {
                    rVar.f7648C = true;
                    k0.r.c(rVar);
                    k0.r.s(rVar);
                    k0.r.f(rVar);
                }
            }
            i6++;
        }
        for (int i7 = 0; i7 < i4.size(); i7++) {
            C0540C c0540c = (C0540C) i4.get(i7);
            Uri uri = c0540c.f7507c;
            int i8 = 0;
            while (true) {
                ArrayList arrayList2 = rVar.f7658q;
                if (i8 < arrayList2.size()) {
                    if (!((k0.q) arrayList2.get(i8)).f7643d) {
                        k0.p pVar = ((k0.q) arrayList2.get(i8)).f7640a;
                        if (pVar.a().equals(uri)) {
                            c0550e = pVar.f7637b;
                            break;
                        }
                    }
                    i8++;
                } else {
                    c0550e = null;
                    break;
                }
            }
            if (c0550e != null) {
                long j4 = c0540c.f7505a;
                if (j4 != -9223372036854775807L) {
                    C0551f c0551f = c0550e.f7572t;
                    c0551f.getClass();
                    if (!c0551f.f7583h) {
                        c0550e.f7572t.f7584i = j4;
                    }
                } else {
                    c0550e.getClass();
                }
                int i9 = c0540c.f7506b;
                C0551f c0551f2 = c0550e.f7572t;
                c0551f2.getClass();
                if (!c0551f2.f7583h) {
                    c0550e.f7572t.f7585j = i9;
                }
                if (k0.r.k(rVar) && k0.r.a(rVar) == k0.r.n(rVar)) {
                    c0550e.f7575w = M3;
                    c0550e.x = j4;
                }
            }
        }
        if (k0.r.k(rVar)) {
            if (k0.r.a(rVar) == k0.r.n(rVar)) {
                k0.r.c(rVar);
                k0.r.s(rVar);
                return;
            }
            k0.r.c(rVar);
            rVar.q(k0.r.n(rVar));
        } else if (k0.r.e(rVar) != -9223372036854775807L && rVar.f7653H) {
            rVar.q(k0.r.e(rVar));
            k0.r.f(rVar);
        }
    }

    public void h(C0558m c0558m) {
        boolean z3;
        C0557l c0557l = (C0557l) this.f5778o;
        if (c0557l.f7613A != -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        c0557l.f7613A = 1;
        E0.c cVar = (E0.c) c0558m.f7632n;
        c0557l.f7628w = (String) cVar.f359o;
        c0557l.x = cVar.f358n;
        c0557l.f();
    }

    public void i(C0909e c0909e) {
        int i3 = c0909e.f9753b;
        Handler handler = (Handler) this.f5778o;
        C0558m c0558m = (C0558m) this.f5777n;
        if (i3 == 0) {
            handler.post(new P2.i(c0558m, c0909e.f9752a, 5, false));
        } else {
            handler.post(new H.b(c0558m, i3));
        }
    }

    @Override // s0.p
    public Object k(Uri uri, W.j jVar) {
        InterfaceC0515a interfaceC0515a = (InterfaceC0515a) ((s0.p) this.f5777n).k(uri, jVar);
        List list = (List) this.f5778o;
        if (list != null && !list.isEmpty()) {
            return (InterfaceC0515a) interfaceC0515a.a(list);
        }
        return interfaceC0515a;
    }

    public w0.G l(int i3) {
        int i4 = 0;
        while (true) {
            int[] iArr = (int[]) this.f5777n;
            if (i4 < iArr.length) {
                if (i3 == iArr[i4]) {
                    return ((T[]) this.f5778o)[i4];
                }
                i4++;
            } else {
                AbstractC0123a.n("BaseMediaChunkOutput", "Unmatched track of type: " + i3);
                return new w0.n();
            }
        }
    }

    @Override // g2.d
    public void o(Object obj) {
        ((Y1.g) this.f5777n).a(((n) ((C0059m) ((C0276a) this.f5778o).f5778o).f652o).b(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // g2.p
    public void onMethodCall(o oVar, q qVar) {
        boolean z3;
        ?? r9;
        boolean isLocationEnabled;
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        String str = oVar.f5788a;
        str.getClass();
        Context context = (Context) this.f5777n;
        C0901b c0901b = (C0901b) this.f5778o;
        Object obj = oVar.f5789b;
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1544053025:
                if (str.equals("checkServiceStatus")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1017315255:
                if (str.equals("shouldShowRequestPermissionRationale")) {
                    c3 = 1;
                    break;
                }
                break;
            case -576207927:
                if (str.equals("checkPermissionStatus")) {
                    c3 = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c3 = 3;
                    break;
                }
                break;
            case 1669188213:
                if (str.equals("requestPermissions")) {
                    c3 = 4;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                int i3 = 2;
                int parseInt = Integer.parseInt(obj.toString());
                if (context == null) {
                    Log.d("permissions_handler", "Context cannot be null.");
                    ((R1.f) qVar).a("PermissionHandler.ServiceManager", "Android context cannot be null.", null);
                    return;
                } else if (parseInt != 3 && parseInt != 4 && parseInt != 5) {
                    if (parseInt == 21) {
                        ((R1.f) qVar).b(Integer.valueOf(((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled() ? 1 : 0));
                        return;
                    } else if (parseInt == 8) {
                        PackageManager packageManager = context.getPackageManager();
                        if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
                            ((R1.f) qVar).b(2);
                            return;
                        }
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (telephonyManager != null && telephonyManager.getPhoneType() != 0) {
                            Intent intent = new Intent("android.intent.action.CALL");
                            intent.setData(Uri.parse("tel:123123"));
                            if (Build.VERSION.SDK_INT >= 33) {
                                of = PackageManager.ResolveInfoFlags.of(0L);
                                queryIntentActivities = packageManager.queryIntentActivities(intent, of);
                            } else {
                                queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                            }
                            if (queryIntentActivities.isEmpty()) {
                                ((R1.f) qVar).b(2);
                                return;
                            } else if (telephonyManager.getSimState() != 5) {
                                ((R1.f) qVar).b(0);
                                return;
                            } else {
                                ((R1.f) qVar).b(1);
                                return;
                            }
                        }
                        ((R1.f) qVar).b(2);
                        return;
                    } else if (parseInt == 16) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            i3 = 1;
                        }
                        ((R1.f) qVar).b(Integer.valueOf(i3));
                        return;
                    } else {
                        ((R1.f) qVar).b(2);
                        return;
                    }
                } else {
                    if (Build.VERSION.SDK_INT >= 28) {
                        LocationManager locationManager = (LocationManager) AbstractC0582u.o(context);
                        if (locationManager != null) {
                            isLocationEnabled = locationManager.isLocationEnabled();
                            r9 = isLocationEnabled;
                        }
                        r9 = 0;
                    } else {
                        try {
                            if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            r9 = z3;
                        } catch (Settings.SettingNotFoundException e2) {
                            e2.printStackTrace();
                        }
                    }
                    ((R1.f) qVar).b(Integer.valueOf((int) r9));
                    return;
                }
            case 1:
                int parseInt2 = Integer.parseInt(obj.toString());
                W1.d dVar = c0901b.f9695o;
                if (dVar == null) {
                    Log.d("permissions_handler", "Unable to detect current Activity.");
                    ((R1.f) qVar).a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                    return;
                }
                ArrayList p3 = AbstractC0635d.p(dVar, parseInt2);
                if (p3 == null) {
                    Log.d("permissions_handler", "No android specific permissions needed for: " + parseInt2);
                    ((R1.f) qVar).b(Boolean.FALSE);
                    return;
                } else if (p3.isEmpty()) {
                    Log.d("permissions_handler", "No permissions found in manifest for: " + parseInt2 + " no need to show request rationale");
                    ((R1.f) qVar).b(Boolean.FALSE);
                    return;
                } else {
                    ((R1.f) qVar).b(Boolean.valueOf(AbstractC0664g.v(c0901b.f9695o, (String) p3.get(0))));
                    return;
                }
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                ((R1.f) qVar).b(Integer.valueOf(c0901b.a(Integer.parseInt(obj.toString()))));
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                if (context == null) {
                    Log.d("permissions_handler", "Context cannot be null.");
                    ((R1.f) qVar).a("PermissionHandler.AppSettingsManager", "Android context cannot be null.", null);
                    return;
                }
                try {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    intent2.setData(Uri.parse("package:" + context.getPackageName()));
                    intent2.addFlags(268435456);
                    intent2.addFlags(1073741824);
                    intent2.addFlags(8388608);
                    context.startActivity(intent2);
                    ((R1.f) qVar).b(Boolean.TRUE);
                    return;
                } catch (Exception unused) {
                    ((R1.f) qVar).b(Boolean.FALSE);
                    return;
                }
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                List<Integer> list = (List) obj;
                R1.f fVar = (R1.f) qVar;
                f2.g gVar = new f2.g(fVar);
                if (c0901b.f9696p > 0) {
                    fVar.a("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).", null);
                    return;
                } else if (c0901b.f9695o == null) {
                    Log.d("permissions_handler", "Unable to detect current Activity.");
                    fVar.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                    return;
                } else {
                    c0901b.f9694n = gVar;
                    c0901b.f9697q = new HashMap();
                    c0901b.f9696p = 0;
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : list) {
                        if (c0901b.a(num.intValue()) == 1) {
                            if (!c0901b.f9697q.containsKey(num)) {
                                c0901b.f9697q.put(num, 1);
                            }
                        } else {
                            ArrayList p4 = AbstractC0635d.p(c0901b.f9695o, num.intValue());
                            if (p4 != null && !p4.isEmpty()) {
                                int i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 23 && num.intValue() == 16) {
                                    c0901b.c("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", 209);
                                } else if (i4 >= 30 && num.intValue() == 22) {
                                    c0901b.c("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", 210);
                                } else if (i4 >= 23 && num.intValue() == 23) {
                                    c0901b.c("android.settings.action.MANAGE_OVERLAY_PERMISSION", 211);
                                } else if (i4 >= 26 && num.intValue() == 24) {
                                    c0901b.c("android.settings.MANAGE_UNKNOWN_APP_SOURCES", 212);
                                } else if (i4 >= 23 && num.intValue() == 27) {
                                    c0901b.c("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS", 213);
                                } else if (i4 >= 31 && num.intValue() == 34) {
                                    c0901b.c("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", 214);
                                } else if (num.intValue() != 37 && num.intValue() != 0) {
                                    arrayList.addAll(p4);
                                    c0901b.f9696p = p4.size() + c0901b.f9696p;
                                } else if (c0901b.b()) {
                                    arrayList.add("android.permission.WRITE_CALENDAR");
                                    arrayList.add("android.permission.READ_CALENDAR");
                                    c0901b.f9696p += 2;
                                } else {
                                    c0901b.f9697q.put(num, 0);
                                }
                            } else if (!c0901b.f9697q.containsKey(num)) {
                                if (num.intValue() == 16 && Build.VERSION.SDK_INT < 23) {
                                    c0901b.f9697q.put(num, 2);
                                } else {
                                    c0901b.f9697q.put(num, 0);
                                }
                                if (num.intValue() == 22 && Build.VERSION.SDK_INT < 30) {
                                    c0901b.f9697q.put(num, 2);
                                } else {
                                    c0901b.f9697q.put(num, 0);
                                }
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        AbstractC0664g.u(c0901b.f9695o, (String[]) arrayList.toArray(new String[0]), 24);
                    }
                    f2.g gVar2 = c0901b.f9694n;
                    if (gVar2 != null && c0901b.f9696p == 0) {
                        gVar2.f5576a.b(c0901b.f9697q);
                        return;
                    }
                    return;
                }
            default:
                ((R1.f) qVar).c();
                return;
        }
    }

    @Override // w0.q
    public void s() {
        k0.r rVar = (k0.r) this.f5778o;
        rVar.f7655n.post(new RunnableC0560o(rVar, 0));
    }

    @Override // w0.q
    public w0.G w(int i3, int i4) {
        return (T) this.f5777n;
    }

    public /* synthetic */ C0276a(Object obj, Object obj2, int i3, boolean z3) {
        this.f5776m = i3;
        this.f5777n = obj;
        this.f5778o = obj2;
    }

    public C0276a(Context context, C0816a c0816a, C0901b c0901b, C0816a c0816a2) {
        this.f5776m = 19;
        this.f5777n = context;
        this.f5778o = c0901b;
    }

    public C0276a(InterfaceC0321a interfaceC0321a, C0262c c0262c) {
        this.f5776m = 5;
        this.f5777n = interfaceC0321a;
        this.f5778o = c0262c;
        c0262c.f5225n = new C0262c(this, 26);
    }

    public C0276a(int i3, byte b3) {
        this.f5776m = i3;
        switch (i3) {
            case 14:
                this.f5777n = new ReentrantLock();
                this.f5778o = new LinkedHashMap();
                return;
            default:
                return;
        }
    }

    public C0276a(View view, InputMethodManager inputMethodManager, C0262c c0262c) {
        this.f5776m = 6;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f5778o = view;
        this.f5777n = inputMethodManager;
        c0262c.f5225n = this;
    }

    public C0276a(C0760b c0760b) {
        this.f5776m = 15;
        C0276a c0276a = new C0276a(14, (byte) 0);
        this.f5777n = c0760b;
        this.f5778o = c0276a;
    }

    public C0276a(C0539B c0539b, b0 b0Var) {
        this.f5776m = 11;
        this.f5777n = c0539b;
        this.f5778o = I.j(b0Var);
    }

    public C0276a(int i3) {
        this.f5776m = 3;
        C0282b c0282b = new C0282b(i3, 0);
        C0282b c0282b2 = new C0282b(i3, 1);
        this.f5777n = c0282b;
        this.f5778o = c0282b2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, R.h] */
    public C0276a(C0320s c0320s) {
        this.f5776m = 4;
        this.f5777n = c0320s;
        ?? obj = new Object();
        obj.f1892a = 0;
        this.f5778o = obj;
    }

    public C0276a(ArrayList arrayList, ArrayList arrayList2) {
        this.f5776m = 16;
        int size = arrayList.size();
        this.f5777n = new int[size];
        this.f5778o = new float[size];
        for (int i3 = 0; i3 < size; i3++) {
            ((int[]) this.f5777n)[i3] = ((Integer) arrayList.get(i3)).intValue();
            ((float[]) this.f5778o)[i3] = ((Float) arrayList2.get(i3)).floatValue();
        }
    }

    public C0276a(int i3, int i4) {
        this.f5776m = 16;
        this.f5777n = new int[]{i3, i4};
        this.f5778o = new float[]{0.0f, 1.0f};
    }

    public C0276a(int i3, int i4, int i5) {
        this.f5776m = 16;
        this.f5777n = new int[]{i3, i4, i5};
        this.f5778o = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0276a(C0557l c0557l) {
        this.f5776m = 8;
        this.f5778o = c0557l;
        this.f5777n = A.n(null);
    }

    public C0276a(C0271b c0271b) {
        this.f5776m = 17;
        this.f5777n = c0271b;
        this.f5778o = new AtomicBoolean(false);
    }

    @Override // w0.q
    public void n(InterfaceC0890A interfaceC0890A) {
    }
}
