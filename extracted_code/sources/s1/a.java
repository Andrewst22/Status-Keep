package S1;

import D2.i;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import c2.C0247a;
import c2.InterfaceC0248b;
import g2.p;
import g2.r;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import t2.AbstractC0826c;
/* loaded from: classes.dex */
public final class a implements p, InterfaceC0248b {

    /* renamed from: m  reason: collision with root package name */
    public Context f2204m;

    /* renamed from: n  reason: collision with root package name */
    public r f2205n;

    public static String b(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        i.b(digest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[digest.length * 2];
        int length = digest.length;
        for (int i3 = 0; i3 < length; i3++) {
            byte b3 = digest[i3];
            int i4 = i3 * 2;
            cArr2[i4] = cArr[(b3 & 255) >>> 4];
            cArr2[i4 + 1] = cArr[b3 & 15];
        }
        return new String(cArr2);
    }

    public final String a(PackageManager packageManager) {
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] apkContentsSigners;
        String str = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.f2204m;
                i.b(context);
                signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                if (hasMultipleSigners) {
                    apkContentsSigners = signingInfo.getApkContentsSigners();
                    i.d(apkContentsSigners, "getApkContentsSigners(...)");
                    byte[] byteArray = ((Signature) AbstractC0826c.B(apkContentsSigners)).toByteArray();
                    i.d(byteArray, "toByteArray(...)");
                    str = b(byteArray);
                } else {
                    signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    i.d(signingCertificateHistory, "getSigningCertificateHistory(...)");
                    byte[] byteArray2 = ((Signature) AbstractC0826c.B(signingCertificateHistory)).toByteArray();
                    i.d(byteArray2, "toByteArray(...)");
                    str = b(byteArray2);
                }
            } else {
                Context context2 = this.f2204m;
                i.b(context2);
                Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
                if (signatureArr != null && signatureArr.length != 0 && AbstractC0826c.B(signatureArr) != null) {
                    byte[] byteArray3 = ((Signature) AbstractC0826c.B(signatureArr)).toByteArray();
                    i.d(byteArray3, "toByteArray(...)");
                    str = b(byteArray3);
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        return str;
    }

    @Override // c2.InterfaceC0248b
    public final void onAttachedToEngine(C0247a c0247a) {
        i.e(c0247a, "binding");
        this.f2204m = c0247a.f5123a;
        r rVar = new r(c0247a.f5124b, "dev.fluttercommunity.plus/package_info");
        this.f2205n = rVar;
        rVar.b(this);
    }

    @Override // c2.InterfaceC0248b
    public final void onDetachedFromEngine(C0247a c0247a) {
        i.e(c0247a, "binding");
        this.f2204m = null;
        r rVar = this.f2205n;
        i.b(rVar);
        rVar.b(null);
        this.f2205n = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[Catch: NameNotFoundException -> 0x006d, TryCatch #0 {NameNotFoundException -> 0x006d, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0042, B:9:0x004f, B:12:0x0060, B:14:0x0066, B:20:0x0070, B:24:0x0089, B:26:0x0092, B:28:0x009a, B:30:0x00a3, B:32:0x00aa, B:33:0x00af, B:27:0x0097, B:8:0x004b, B:34:0x00c8), top: B:38:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097 A[Catch: NameNotFoundException -> 0x006d, TryCatch #0 {NameNotFoundException -> 0x006d, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0042, B:9:0x004f, B:12:0x0060, B:14:0x0066, B:20:0x0070, B:24:0x0089, B:26:0x0092, B:28:0x009a, B:30:0x00a3, B:32:0x00aa, B:33:0x00af, B:27:0x0097, B:8:0x004b, B:34:0x00c8), top: B:38:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[Catch: NameNotFoundException -> 0x006d, TryCatch #0 {NameNotFoundException -> 0x006d, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0042, B:9:0x004f, B:12:0x0060, B:14:0x0066, B:20:0x0070, B:24:0x0089, B:26:0x0092, B:28:0x009a, B:30:0x00a3, B:32:0x00aa, B:33:0x00af, B:27:0x0097, B:8:0x004b, B:34:0x00c8), top: B:38:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[Catch: NameNotFoundException -> 0x006d, TryCatch #0 {NameNotFoundException -> 0x006d, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x0042, B:9:0x004f, B:12:0x0060, B:14:0x0066, B:20:0x0070, B:24:0x0089, B:26:0x0092, B:28:0x009a, B:30:0x00a3, B:32:0x00aa, B:33:0x00af, B:27:0x0097, B:8:0x004b, B:34:0x00c8), top: B:38:0x0005 }] */
    @Override // g2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(g2.o r13, g2.q r14) {
        /*
            r12 = this;
            java.lang.String r0 = "call"
            D2.i.e(r13, r0)
            java.lang.String r13 = r13.f5788a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r0 = "getAll"
            boolean r13 = D2.i.a(r13, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            if (r13 == 0) goto Lc8
            android.content.Context r13 = r12.f2204m     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            D2.i.b(r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            android.content.Context r0 = r12.f2204m     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            D2.i.b(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r0 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r1 = 0
            android.content.pm.PackageInfo r0 = r13.getPackageInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r1 = r12.a(r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            android.content.Context r2 = r12.f2204m     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            D2.i.b(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            android.content.Context r3 = r12.f2204m     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            D2.i.b(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r5 = 30
            if (r4 < r5) goto L4b
            android.content.pm.InstallSourceInfo r2 = C.O.d(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r2 = C.O.n(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            goto L4f
        L4b:
            java.lang.String r2 = r2.getInstallerPackageName(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
        L4f:
            long r5 = r0.firstInstallTime     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            long r7 = r0.lastUpdateTime     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.util.HashMap r3 = new java.util.HashMap     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r9 = "appName"
            android.content.pm.ApplicationInfo r10 = r0.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r11 = ""
            if (r10 == 0) goto L6f
            java.lang.CharSequence r13 = r10.loadLabel(r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            if (r13 == 0) goto L6f
            java.lang.String r13 = r13.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            if (r13 != 0) goto L70
            goto L6f
        L6d:
            r13 = move-exception
            goto Lcf
        L6f:
            r13 = r11
        L70:
            r3.put(r9, r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r13 = "packageName"
            android.content.Context r9 = r12.f2204m     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            D2.i.b(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r9 = r9.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r3.put(r13, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r13 = "version"
            java.lang.String r9 = r0.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            if (r9 != 0) goto L88
            goto L89
        L88:
            r11 = r9
        L89:
            r3.put(r13, r11)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r13 = "buildNumber"
            r9 = 28
            if (r4 < r9) goto L97
            long r9 = A.d.c(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            goto L9a
        L97:
            int r0 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            long r9 = (long) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
        L9a:
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r3.put(r13, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            if (r1 == 0) goto La8
            java.lang.String r13 = "buildSignature"
            r3.put(r13, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
        La8:
            if (r2 == 0) goto Laf
            java.lang.String r13 = "installerStore"
            r3.put(r13, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
        Laf:
            java.lang.String r13 = "installTime"
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r3.put(r13, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            java.lang.String r13 = "updateTime"
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r3.put(r13, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r13 = r14
            R1.f r13 = (R1.f) r13     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r13.b(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            goto Ldb
        Lc8:
            r13 = r14
            R1.f r13 = (R1.f) r13     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            r13.c()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6d
            goto Ldb
        Lcf:
            java.lang.String r13 = r13.getMessage()
            java.lang.String r0 = "Name not found"
            R1.f r14 = (R1.f) r14
            r1 = 0
            r14.a(r0, r13, r1)
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.a.onMethodCall(g2.o, g2.q):void");
    }
}
