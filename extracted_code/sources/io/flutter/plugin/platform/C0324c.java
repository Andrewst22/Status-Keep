package io.flutter.plugin.platform;

import android.view.MotionEvent;
/* renamed from: io.flutter.plugin.platform.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324c extends W1.h {

    /* renamed from: s  reason: collision with root package name */
    public C0322a f6198s;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean e2;
        C0322a c0322a = this.f6198s;
        if (c0322a != null) {
            io.flutter.view.k kVar = c0322a.f6196a;
            if (kVar == null) {
                e2 = false;
            } else {
                e2 = kVar.e(motionEvent, true);
            }
            if (e2) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
