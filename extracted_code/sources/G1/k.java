package g1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final q.h f5769a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f5770b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static e0.l f5771c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return i.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static e0.l b() {
        e0.l lVar = new e0.l(10);
        f5771c = lVar;
        q.h hVar = f5769a;
        hVar.getClass();
        if (q.g.f8853f.b(hVar, null, lVar)) {
            q.g.b(hVar);
        }
        return f5771c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.k.c(android.content.Context, boolean):void");
    }
}
