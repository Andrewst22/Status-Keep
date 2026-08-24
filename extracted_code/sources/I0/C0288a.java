package i0;

import G0.c;
import K0.h;
import N.k;
import R.C0113p;
/* renamed from: i0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0288a f5944a = new Object();

    public final android.support.v4.media.session.a a(C0113p c0113p) {
        String str = c0113p.f1974m;
        if (str != null) {
            char c3 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c3 = 4;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    return new c(0);
                case 1:
                    return new J0.a();
                case k.FLOAT_FIELD_NUMBER /* 2 */:
                    return new h(null);
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                    return new c(1);
                case k.LONG_FIELD_NUMBER /* 4 */:
                    return new M0.c();
            }
        }
        throw new IllegalArgumentException(D2.h.l("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(C0113p c0113p) {
        String str = c0113p.f1974m;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }
}
