package io.flutter.plugin.platform;

import Y.RunnableC0132c;
import android.view.View;
/* renamed from: io.flutter.plugin.platform.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnSystemUiVisibilityChangeListenerC0325d implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f6199a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ R0.j f6200b;

    public View$OnSystemUiVisibilityChangeListenerC0325d(R0.j jVar, View view) {
        this.f6200b = jVar;
        this.f6199a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i3) {
        this.f6199a.post(new RunnableC0132c(i3, 1, this));
    }
}
