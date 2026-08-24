package z;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.C0727i;
/* renamed from: z.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0910f {

    /* renamed from: a  reason: collision with root package name */
    public static final Q0.i f9754a = new Q0.i(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f9755b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f9756c;

    /* renamed from: d  reason: collision with root package name */
    public static final C0727i f9757d;

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f9755b = threadPoolExecutor;
        f9756c = new Object();
        f9757d = new C0727i();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static z.C0909e a(java.lang.String r6, android.content.Context r7, T1.d r8, int r9) {
        /*
            Q0.i r0 = z.AbstractC0910f.f9754a
            java.lang.Object r1 = r0.d(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            z.e r6 = new z.e
            r6.<init>(r1)
            return r6
        L10:
            B.b r8 = z.AbstractC0906b.a(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            r1 = 1
            r2 = -3
            java.lang.Object r3 = r8.f23n
            z.g[] r3 = (z.C0911g[]) r3
            int r8 = r8.f22m
            if (r8 == 0) goto L24
            if (r8 == r1) goto L22
        L20:
            r1 = -3
            goto L3d
        L22:
            r1 = -2
            goto L3d
        L24:
            if (r3 == 0) goto L3d
            int r8 = r3.length
            if (r8 != 0) goto L2a
            goto L3d
        L2a:
            int r8 = r3.length
            r1 = 0
            r4 = 0
        L2d:
            if (r4 >= r8) goto L3d
            r5 = r3[r4]
            int r5 = r5.f9762e
            if (r5 == 0) goto L3a
            if (r5 >= 0) goto L38
            goto L20
        L38:
            r1 = r5
            goto L3d
        L3a:
            int r4 = r4 + 1
            goto L2d
        L3d:
            if (r1 == 0) goto L45
            z.e r6 = new z.e
            r6.<init>(r1)
            return r6
        L45:
            n2.g r8 = v.AbstractC0874e.f9470a
            android.graphics.Typeface r7 = r8.h(r7, r3, r9)
            if (r7 == 0) goto L56
            r0.e(r6, r7)
            z.e r6 = new z.e
            r6.<init>(r7)
            return r6
        L56:
            z.e r6 = new z.e
            r6.<init>(r2)
            return r6
        L5c:
            z.e r6 = new z.e
            r7 = -1
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.AbstractC0910f.a(java.lang.String, android.content.Context, T1.d, int):z.e");
    }
}
