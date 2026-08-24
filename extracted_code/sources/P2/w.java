package P2;

import a.AbstractC0155a;
import n2.AbstractC0664g;
import s2.AbstractC0805d;
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f1516a = 0;

    static {
        Object f3;
        Object f4;
        Exception exc = new Exception();
        String simpleName = AbstractC0155a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            f3 = w2.b.class.getCanonicalName();
        } catch (Throwable th) {
            f3 = AbstractC0664g.f(th);
        }
        if (AbstractC0805d.a(f3) != null) {
            f3 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) f3;
        try {
            f4 = w.class.getCanonicalName();
        } catch (Throwable th2) {
            f4 = AbstractC0664g.f(th2);
        }
        if (AbstractC0805d.a(f4) != null) {
            f4 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) f4;
    }
}
