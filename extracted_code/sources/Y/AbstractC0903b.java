package y;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
/* renamed from: y.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0903b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f9700a = 0;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e2) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
            }
        }
    }
}
