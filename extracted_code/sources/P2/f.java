package P2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final List f1481a;

    static {
        try {
            Iterator it = Arrays.asList(new L2.b()).iterator();
            D2.i.e(it, "<this>");
            f1481a = I2.c.Q(new I2.a(new I2.e(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
