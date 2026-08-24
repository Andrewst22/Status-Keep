package io.flutter.plugin.platform;

import android.os.Build;
/* loaded from: classes.dex */
public final class w implements io.flutter.view.o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f6270a;

    public w(x xVar) {
        this.f6270a = xVar;
    }

    @Override // io.flutter.view.o
    public final void onTrimMemory(int i3) {
        if (i3 == 80 && Build.VERSION.SDK_INT >= 29) {
            this.f6270a.f6276f = true;
        }
    }
}
