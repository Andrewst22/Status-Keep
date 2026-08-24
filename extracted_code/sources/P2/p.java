package P2;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final L2.c f1508a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str;
        int i3 = x.f1517a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = Arrays.asList(new Object()).iterator();
            D2.i.e(it, "<this>");
            Iterator it2 = I2.c.Q(new I2.a(new I2.e(it))).iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    int a3 = ((L2.a) obj).a();
                    do {
                        Object next = it2.next();
                        int a4 = ((L2.a) next).a();
                        if (a3 < a4) {
                            obj = next;
                            a3 = a4;
                        }
                    } while (it2.hasNext());
                }
            }
            L2.a aVar = (L2.a) obj;
            if (aVar != null) {
                try {
                    aVar.getClass();
                    Looper mainLooper = Looper.getMainLooper();
                    if (mainLooper != null) {
                        f1508a = new L2.c(L2.d.a(mainLooper));
                        return;
                    }
                    throw new IllegalStateException("The main looper is not available");
                } catch (Throwable th) {
                    aVar.getClass();
                    throw th;
                }
            }
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
