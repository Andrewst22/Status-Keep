package W;

import U.AbstractC0123a;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f2766i = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Uri f2767a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2768b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f2769c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f2770d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2771e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2772f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2773g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2774h;

    static {
        R.A.a("media3.datasource");
    }

    public l(Uri uri, int i3, byte[] bArr, Map map, long j3, long j4, String str, int i4) {
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (j3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        if (j3 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        AbstractC0123a.e(z4);
        AbstractC0123a.e((j4 > 0 || j4 == -1) ? true : true);
        uri.getClass();
        this.f2767a = uri;
        this.f2768b = i3;
        this.f2769c = (bArr == null || bArr.length == 0) ? null : null;
        this.f2770d = Collections.unmodifiableMap(new HashMap(map));
        this.f2771e = j3;
        this.f2772f = j4;
        this.f2773g = str;
        this.f2774h = i4;
    }

    public final l a(long j3) {
        long j4 = this.f2772f;
        long j5 = -1;
        if (j4 != -1) {
            j5 = j4 - j3;
        }
        long j6 = j5;
        if (j3 == 0 && j4 == j6) {
            return this;
        }
        byte[] bArr = this.f2769c;
        int i3 = this.f2774h;
        return new l(this.f2767a, this.f2768b, bArr, this.f2770d, this.f2771e + j3, j6, this.f2773g, i3);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i3 = this.f2768b;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    str = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f2767a);
        sb.append(", ");
        sb.append(this.f2771e);
        sb.append(", ");
        sb.append(this.f2772f);
        sb.append(", ");
        sb.append(this.f2773g);
        sb.append(", ");
        sb.append(this.f2774h);
        sb.append("]");
        return sb.toString();
    }
}
