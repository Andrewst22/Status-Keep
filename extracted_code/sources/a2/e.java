package a2;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.t;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import r2.AbstractC0766a;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3857a;

    /* renamed from: b  reason: collision with root package name */
    public B1.b f3858b;

    /* renamed from: c  reason: collision with root package name */
    public long f3859c;

    /* renamed from: d  reason: collision with root package name */
    public C0177b f3860d;

    /* renamed from: e  reason: collision with root package name */
    public FlutterJNI f3861e;

    /* renamed from: f  reason: collision with root package name */
    public ExecutorService f3862f;

    /* renamed from: g  reason: collision with root package name */
    public Future f3863g;

    public final void a(Context context, String[] strArr) {
        int i3;
        boolean z3;
        String str;
        if (this.f3857a) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f3858b != null) {
                try {
                    AbstractC0766a.b("FlutterLoader#ensureInitializationComplete");
                    d dVar = (d) this.f3863g.get();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                    StringBuilder sb = new StringBuilder("--icu-native-lib-path=");
                    sb.append(this.f3860d.f3851d);
                    String str2 = File.separator;
                    sb.append(str2);
                    sb.append("libflutter.so");
                    arrayList.add(sb.toString());
                    if (strArr != null) {
                        Collections.addAll(arrayList, strArr);
                    }
                    arrayList.add("--aot-shared-library-name=".concat(this.f3860d.f3848a));
                    arrayList.add("--aot-shared-library-name=" + this.f3860d.f3851d + str2 + this.f3860d.f3848a);
                    StringBuilder sb2 = new StringBuilder("--cache-dir-path=");
                    sb2.append(dVar.f3856b);
                    arrayList.add(sb2.toString());
                    arrayList.add("--domain-network-policy=".concat(this.f3860d.f3850c));
                    this.f3858b.getClass();
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        i3 = bundle.getInt("io.flutter.embedding.android.OldGenHeapSize");
                    } else {
                        i3 = 0;
                    }
                    if (i3 == 0) {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                        i3 = (int) ((memoryInfo.totalMem / 1000000.0d) / 2.0d);
                    }
                    arrayList.add("--old-gen-heap-size=" + i3);
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                    arrayList.add("--prefetched-default-font-manager");
                    if (bundle != null) {
                        if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                            if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                                arrayList.add("--enable-impeller=true");
                            } else {
                                arrayList.add("--enable-impeller=false");
                            }
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                            arrayList.add("--enable-vulkan-validation");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                            arrayList.add("--enable-opengl-gpu-tracing");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                            arrayList.add("--enable-vulkan-gpu-tracing");
                        }
                        if (bundle.containsKey("io.flutter.embedding.android.DisableMergedPlatformUIThread") && bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread")) {
                            arrayList.add("--no-enable-merged-platform-ui-thread");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                            arrayList.add("--enable-surface-control");
                        }
                        String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                        if (string != null) {
                            arrayList.add("--impeller-backend=".concat(string));
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization")) {
                            arrayList.add("--impeller-lazy-shader-mode");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines")) {
                            arrayList.add("--impeller-antialias-lines");
                        }
                    }
                    if (bundle == null) {
                        z3 = true;
                    } else {
                        z3 = bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
                    }
                    if (z3) {
                        str = "true";
                    } else {
                        str = "false";
                    }
                    arrayList.add("--leak-vm=".concat(str));
                    this.f3861e.init(context, (String[]) arrayList.toArray(new String[0]), null, dVar.f3855a, dVar.f3856b, SystemClock.uptimeMillis() - this.f3859c, Build.VERSION.SDK_INT);
                    this.f3857a = true;
                    Trace.endSection();
                    return;
                } catch (Exception e2) {
                    Log.e("FlutterLoader", "Flutter initialization failed.", e2);
                    throw new RuntimeException(e2);
                }
            }
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
    }

    public final String b(String str) {
        return this.f3860d.f3849b + File.separator + str;
    }

    public final void c(Context context) {
        B1.b bVar = new B1.b(26);
        if (this.f3858b == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                AbstractC0766a.b("FlutterLoader#startInitialization");
                try {
                    Context applicationContext = context.getApplicationContext();
                    this.f3858b = bVar;
                    this.f3859c = SystemClock.uptimeMillis();
                    this.f3860d = AbstractC0176a.a(applicationContext);
                    t a3 = t.a((DisplayManager) applicationContext.getSystemService("display"), this.f3861e);
                    a3.f6412b.setAsyncWaitForVsyncDelegate(a3.f6414d);
                    this.f3863g = this.f3862f.submit(new c(this, applicationContext));
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
    }
}
