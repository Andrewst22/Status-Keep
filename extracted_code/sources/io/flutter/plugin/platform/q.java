package io.flutter.plugin.platform;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.inputmethod.InputMethodManager;
/* loaded from: classes.dex */
public final class q extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final InputMethodManager f6263a;

    public q(Context context, InputMethodManager inputMethodManager) {
        super(context);
        this.f6263a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDisplayContext(Display display) {
        return new q(super.createDisplayContext(display), this.f6263a);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("input_method".equals(str)) {
            return this.f6263a;
        }
        return super.getSystemService(str);
    }
}
