package k0;

import U.AbstractC0123a;
import android.net.Uri;
/* renamed from: k0.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540C {

    /* renamed from: a  reason: collision with root package name */
    public final long f7505a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7506b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f7507c;

    public C0540C(int i3, long j3, Uri uri) {
        this.f7505a = j3;
        this.f7506b = i3;
        this.f7507c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a A[Catch: Exception -> 0x0058, TRY_LEAVE, TryCatch #0 {Exception -> 0x0058, blocks: (B:7:0x002f, B:31:0x0077, B:34:0x007f, B:35:0x0084, B:36:0x0085, B:37:0x008a, B:14:0x004e, B:19:0x005a, B:22:0x0064), top: B:60:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static D1.b0 a(android.net.Uri r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C0540C.a(android.net.Uri, java.lang.String):D1.b0");
    }

    public static Uri b(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        AbstractC0123a.e(scheme.equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        String host = parse2.getHost();
        host.getClass();
        if (host.equals(uri.getHost())) {
            return parse2;
        }
        if (uri2.endsWith("/")) {
            return AbstractC0123a.y(uri2, str);
        }
        return AbstractC0123a.y(uri2.concat("/"), str);
    }
}
