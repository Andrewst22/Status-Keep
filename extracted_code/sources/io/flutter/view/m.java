package io.flutter.view;

import android.view.View;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final View f6402a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6403b;

    public m(View view, int i3) {
        this.f6402a = view;
        this.f6403b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f6403b == mVar.f6403b && this.f6402a.equals(mVar.f6402a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6402a.hashCode() + 31) * 31) + this.f6403b;
    }
}
