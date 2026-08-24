package a2;

import android.content.Context;
import android.os.Trace;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.Callable;
import n2.AbstractC0664g;
import r2.AbstractC0766a;
/* loaded from: classes.dex */
public final class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f3853a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f3854b;

    public c(e eVar, Context context) {
        this.f3854b = eVar;
        this.f3853a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        Context context = this.f3853a;
        e eVar = this.f3854b;
        AbstractC0766a.b("FlutterLoader initTask");
        try {
            eVar.getClass();
            FlutterJNI flutterJNI = eVar.f3861e;
            try {
                flutterJNI.loadLibrary(context);
                flutterJNI.updateRefreshRate();
                eVar.f3862f.execute(new Z.d(this, 2));
                File filesDir = context.getFilesDir();
                if (filesDir == null) {
                    filesDir = new File(AbstractC0664g.o(context), "files");
                }
                String path = filesDir.getPath();
                File codeCacheDir = context.getCodeCacheDir();
                if (codeCacheDir == null) {
                    codeCacheDir = context.getCacheDir();
                }
                if (codeCacheDir == null) {
                    codeCacheDir = new File(AbstractC0664g.o(context), "cache");
                }
                String path2 = codeCacheDir.getPath();
                File dir = context.getDir("flutter", 0);
                if (dir == null) {
                    dir = new File(AbstractC0664g.o(context), "app_flutter");
                }
                dir.getPath();
                d dVar = new d(path, path2);
                Trace.endSection();
                return dVar;
            } catch (UnsatisfiedLinkError e2) {
                if (!e2.toString().contains("couldn't find \"libflutter.so\"") && !e2.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                    throw e2;
                }
                String property = System.getProperty("os.arch");
                File file = new File(eVar.f3860d.f3851d);
                String[] list = file.list();
                StringBuilder sb = new StringBuilder("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                sb.append(property);
                sb.append(", and the native libraries directory (with path ");
                sb.append(file.getAbsolutePath());
                sb.append(") ");
                if (file.exists()) {
                    str = "contains the following files: " + Arrays.toString(list);
                } else {
                    str = "does not exist.";
                }
                sb.append(str);
                throw new UnsupportedOperationException(sb.toString(), e2);
            }
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
