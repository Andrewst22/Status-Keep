package o2;

import R.J;
import U.A;
import U.w;
import U.x;
import Y.C0152x;
import Y.G;
import Y.e0;
import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import c2.C0247a;
import c2.InterfaceC0248b;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;
import n2.AbstractC0662e;
import p2.C0738b;
import p2.C0740d;
/* renamed from: o2.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0718o implements InterfaceC0248b {

    /* renamed from: n  reason: collision with root package name */
    public T1.d f8711n;

    /* renamed from: m  reason: collision with root package name */
    public final LongSparseArray f8710m = new LongSparseArray();

    /* renamed from: o  reason: collision with root package name */
    public final U.c f8712o = new Object();

    /* renamed from: p  reason: collision with root package name */
    public Long f8713p = Long.MAX_VALUE;

    /* JADX WARN: Type inference failed for: r0v12, types: [q2.b, o2.l, io.flutter.view.p] */
    public final Long a(C0708e c0708e) {
        C0.e c0705b;
        AbstractC0715l abstractC0715l;
        long j3;
        String b3;
        int i3 = 2;
        boolean z3 = false;
        String str = c0708e.f8690a;
        if (str != null) {
            String str2 = c0708e.f8692c;
            if (str2 != null) {
                a2.e eVar = ((C0717n) this.f8711n.f2345q).f8709a;
                StringBuilder sb = new StringBuilder("packages");
                String str3 = File.separator;
                sb.append(str3);
                sb.append(str2);
                sb.append(str3);
                sb.append(str);
                b3 = eVar.b(sb.toString());
            } else {
                b3 = ((C0717n) this.f8711n.f2344p).f8709a.b(str);
            }
            String l3 = D2.h.l("asset:///", b3);
            if (l3.startsWith("asset:///")) {
                c0705b = new C0706c(l3, 0);
            } else {
                throw new IllegalArgumentException("assetUrl must start with 'asset:///'");
            }
        } else if (c0708e.f8691b.startsWith("rtsp://")) {
            String str4 = c0708e.f8691b;
            if (str4.startsWith("rtsp://")) {
                c0705b = new C0706c(str4, 1);
            } else {
                throw new IllegalArgumentException("rtspUrl must start with 'rtsp://'");
            }
        } else {
            String str5 = c0708e.f8693d;
            if (str5 != null) {
                char c3 = 65535;
                switch (str5.hashCode()) {
                    case 3680:
                        if (str5.equals("ss")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case 103407:
                        if (str5.equals("hls")) {
                            c3 = 1;
                            break;
                        }
                        break;
                    case 3075986:
                        if (str5.equals("dash")) {
                            c3 = 2;
                            break;
                        }
                        break;
                }
                switch (c3) {
                    case 1:
                        i3 = 4;
                        break;
                    case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                        i3 = 3;
                        break;
                }
                c0705b = new C0705b(c0708e.f8691b, i3, new HashMap(c0708e.f8694e));
            }
            i3 = 1;
            c0705b = new C0705b(c0708e.f8691b, i3, new HashMap(c0708e.f8694e));
        }
        if (c0708e.f8695f == EnumC0711h.f8698n) {
            Long l4 = this.f8713p;
            this.f8713p = Long.valueOf(l4.longValue() - 1);
            j3 = l4.longValue();
            T1.d dVar = this.f8711n;
            B1.e eVar2 = new B1.e((g2.g) dVar.f2343o, "flutter.io/videoPlayer/videoEvents" + j3);
            C0714k c0714k = new C0714k();
            eVar2.t0(new C0716m(c0714k));
            abstractC0715l = new AbstractC0715l(new C0716m(c0714k), c0705b.e(), this.f8712o, null, new C0740d((Context) dVar.f2342n, c0705b, 0));
        } else {
            TextureRegistry$SurfaceProducer c4 = ((io.flutter.embedding.engine.renderer.l) this.f8711n.f2346r).c(1);
            long id = c4.id();
            T1.d dVar2 = this.f8711n;
            B1.e eVar3 = new B1.e((g2.g) dVar2.f2343o, "flutter.io/videoPlayer/videoEvents" + id);
            C0714k c0714k2 = new C0714k();
            eVar3.t0(new C0716m(c0714k2));
            ?? abstractC0715l2 = new AbstractC0715l(new C0716m(c0714k2), c0705b.e(), this.f8712o, c4, new C0740d((Context) dVar2.f2342n, c0705b, 1));
            abstractC0715l2.f8881d = true;
            c4.setCallback(abstractC0715l2);
            Surface surface = c4.getSurface();
            ((G) abstractC0715l2.f8707c).E(surface);
            if (surface == null) {
                z3 = true;
            }
            abstractC0715l2.f8881d = z3;
            abstractC0715l = abstractC0715l2;
            j3 = id;
        }
        this.f8710m.put(j3, abstractC0715l);
        return Long.valueOf(j3);
    }

    public final AbstractC0715l b(long j3) {
        LongSparseArray longSparseArray = this.f8710m;
        AbstractC0715l abstractC0715l = (AbstractC0715l) longSparseArray.get(j3);
        if (abstractC0715l == null) {
            String str = "No player found with playerId <" + j3 + ">";
            if (longSparseArray.size() == 0) {
                str = str + " and no active players created by the plugin.";
            }
            throw new IllegalStateException(str);
        }
        return abstractC0715l;
    }

    public final void c(Long l3, Boolean bool) {
        int i3;
        AbstractC0715l b3 = b(l3.longValue());
        if (bool.booleanValue()) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        G g3 = (G) b3.f8707c;
        g3.J();
        if (g3.f3028C != i3) {
            g3.f3028C = i3;
            x xVar = g3.f3066k.f3138t;
            xVar.getClass();
            w b4 = x.b();
            b4.f2484a = xVar.f2486a.obtainMessage(11, i3, 0);
            b4.b();
            C0152x c0152x = new C0152x(i3);
            U.l lVar = g3.f3067l;
            lVar.c(8, c0152x);
            g3.F();
            lVar.b();
        }
    }

    public final void d(Long l3, Double d3) {
        AbstractC0715l b3 = b(l3.longValue());
        J j3 = new J((float) d3.doubleValue());
        G g3 = (G) b3.f8707c;
        g3.J();
        if (!g3.f3057d0.f3267o.equals(j3)) {
            e0 f3 = g3.f3057d0.f(j3);
            g3.f3029D++;
            g3.f3066k.f3138t.a(4, j3).b();
            g3.H(f3, 0, false, 5, -9223372036854775807L, -1);
        }
    }

    public final void e(Long l3, Double d3) {
        G g3 = (G) b(l3.longValue()).f8707c;
        g3.J();
        final float i3 = A.i((float) Math.max(0.0d, Math.min(1.0d, d3.doubleValue())), 0.0f, 1.0f);
        if (g3.f3046V != i3) {
            g3.f3046V = i3;
            g3.C(1, 2, Float.valueOf(g3.f3079y.f3250g * i3));
            g3.f3067l.e(22, new U.i() { // from class: Y.v
                @Override // U.i
                public final void b(Object obj) {
                    ((R.L) obj).z(i3);
                }
            });
        }
    }

    @Override // c2.InterfaceC0248b
    public final void onAttachedToEngine(C0247a c0247a) {
        B1.e j02 = B1.e.j0();
        Context context = c0247a.f5123a;
        a2.e eVar = (a2.e) j02.f56n;
        C0717n c0717n = new C0717n(eVar);
        C0717n c0717n2 = new C0717n(eVar);
        io.flutter.embedding.engine.renderer.l lVar = c0247a.f5125c;
        g2.g gVar = c0247a.f5124b;
        this.f8711n = new T1.d(context, gVar, c0717n, c0717n2, lVar);
        AbstractC0662e.e(gVar, this);
        LongSparseArray longSparseArray = this.f8710m;
        Objects.requireNonNull(longSparseArray);
        C0738b c0738b = new C0738b(new B0.a(longSparseArray, 23));
        HashMap hashMap = (HashMap) c0247a.f5126d.f6219b;
        if (!hashMap.containsKey("plugins.flutter.dev/video_player_android")) {
            hashMap.put("plugins.flutter.dev/video_player_android", c0738b);
        }
    }

    @Override // c2.InterfaceC0248b
    public final void onDetachedFromEngine(C0247a c0247a) {
        if (this.f8711n == null) {
            Log.wtf("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        T1.d dVar = this.f8711n;
        g2.g gVar = c0247a.f5124b;
        dVar.getClass();
        AbstractC0662e.e(gVar, null);
        this.f8711n = null;
        int i3 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.f8710m;
            if (i3 < longSparseArray.size()) {
                ((AbstractC0715l) longSparseArray.valueAt(i3)).b();
                i3++;
            } else {
                longSparseArray.clear();
                return;
            }
        }
    }
}
