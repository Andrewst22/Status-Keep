package V2;

import R1.f;
import android.content.Context;
import android.util.Log;
import c2.C0247a;
import c2.InterfaceC0248b;
import g2.o;
import g2.p;
import g2.q;
import g2.r;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class d implements InterfaceC0248b, p {

    /* renamed from: m  reason: collision with root package name */
    public Context f2719m;

    /* renamed from: n  reason: collision with root package name */
    public ExecutorService f2720n;

    /* renamed from: o  reason: collision with root package name */
    public r f2721o;

    public static String a(d dVar, String str, HashMap hashMap, String str2, int i3, int i4, int i5, int i6, int i7) {
        String str3;
        boolean z3;
        String str4;
        dVar.getClass();
        byte[] b3 = b(str, hashMap, i3, i4, i5, i6, i7);
        if (i3 != 1) {
            if (i3 != 2) {
                str3 = "jpg";
            } else {
                str3 = "webp";
            }
        } else {
            str3 = "png";
        }
        int lastIndexOf = str.lastIndexOf(".");
        String str5 = str.substring(0, lastIndexOf + 1) + str3;
        if (!str.startsWith("/") && !str.startsWith("file://")) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (str2 == null && !z3) {
            str4 = dVar.f2719m.getCacheDir().getAbsolutePath();
        } else {
            str4 = str2;
        }
        if (str4 != null) {
            if (str4.endsWith(str3)) {
                str5 = str4;
            } else {
                int lastIndexOf2 = str5.lastIndexOf("/");
                if (str4.endsWith("/")) {
                    str5 = str4 + str5.substring(lastIndexOf2 + 1);
                } else {
                    str5 = str4 + str5.substring(lastIndexOf2);
                }
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str5);
            fileOutputStream.write(b3);
            fileOutputStream.close();
            Log.d("ThumbnailPlugin", String.format("buildThumbnailFile( written:%d )", Integer.valueOf(b3.length)));
            return str5;
        } catch (IOException e2) {
            e2.printStackTrace();
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00eb -> B:55:0x0103). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(java.lang.String r16, java.util.HashMap r17, int r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.d.b(java.lang.String, java.util.HashMap, int, int, int, int, int):byte[]");
    }

    @Override // c2.InterfaceC0248b
    public final void onAttachedToEngine(C0247a c0247a) {
        this.f2719m = c0247a.f5123a;
        this.f2720n = Executors.newCachedThreadPool();
        r rVar = new r(c0247a.f5124b, "plugins.justsoft.xyz/video_thumbnail");
        this.f2721o = rVar;
        rVar.b(this);
    }

    @Override // c2.InterfaceC0248b
    public final void onDetachedFromEngine(C0247a c0247a) {
        this.f2721o.b(null);
        this.f2721o = null;
        this.f2720n.shutdown();
        this.f2720n = null;
    }

    @Override // g2.p
    public final void onMethodCall(o oVar, q qVar) {
        Map map = (Map) oVar.f5789b;
        this.f2720n.execute(new b(this, oVar.f5788a, map, (String) map.get("video"), (HashMap) map.get("headers"), ((Integer) map.get("format")).intValue(), ((Integer) map.get("maxh")).intValue(), ((Integer) map.get("maxw")).intValue(), ((Integer) map.get("timeMs")).intValue(), ((Integer) map.get("quality")).intValue(), (f) qVar));
    }
}
