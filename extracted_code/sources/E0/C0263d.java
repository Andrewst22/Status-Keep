package e0;

import R.C0112o;
import R.C0113p;
import R.G;
import java.util.ArrayList;
/* renamed from: e0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263d implements k {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f5226d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b  reason: collision with root package name */
    public B1.b f5227b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5228c;

    public static void a(int i3, ArrayList arrayList) {
        if (android.support.v4.media.session.a.B(i3, 0, 7, f5226d) != -1 && !arrayList.contains(Integer.valueOf(i3))) {
            arrayList.add(Integer.valueOf(i3));
        }
    }

    public final C0113p b(C0113p c0113p) {
        String str;
        if (this.f5228c && this.f5227b.g(c0113p)) {
            C0112o a3 = c0113p.a();
            a3.f1937l = G.l("application/x-media3-cues");
            a3.f1922F = this.f5227b.e(c0113p);
            StringBuilder sb = new StringBuilder();
            sb.append(c0113p.f1974m);
            String str2 = c0113p.f1971j;
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb.append(str);
            a3.f1934i = sb.toString();
            a3.f1942q = Long.MAX_VALUE;
            return new C0113p(a3);
        }
        return c0113p;
    }
}
