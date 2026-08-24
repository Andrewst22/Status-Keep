package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
/* loaded from: classes.dex */
public final class r extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final D f6264a;

    /* renamed from: b  reason: collision with root package name */
    public D f6265b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f6266c;

    public r(Context context, D d3, Context context2) {
        super(context);
        this.f6264a = d3;
        this.f6266c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("window".equals(str)) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i3 = 0; i3 < stackTrace.length && i3 < 11; i3++) {
                if (stackTrace[i3].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i3].getMethodName().equals("<init>")) {
                    return this.f6266c.getSystemService(str);
                }
            }
            if (this.f6265b == null) {
                this.f6265b = this.f6264a;
            }
            return this.f6265b;
        }
        return super.getSystemService(str);
    }
}
