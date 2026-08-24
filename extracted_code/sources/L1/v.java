package L1;

import java.lang.reflect.Field;
import java.security.PrivilegedAction;
/* loaded from: classes.dex */
public final class v implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Field f944a;

    public v(Field field) {
        this.f944a = field;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        this.f944a.setAccessible(true);
        return null;
    }
}
