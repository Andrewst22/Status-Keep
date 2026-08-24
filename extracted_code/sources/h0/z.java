package h0;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final String f5937a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5938b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5939c;

    public z(String str, boolean z3, boolean z4) {
        this.f5937a = str;
        this.f5938b = z3;
        this.f5939c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != z.class) {
            return false;
        }
        z zVar = (z) obj;
        if (TextUtils.equals(this.f5937a, zVar.f5937a) && this.f5938b == zVar.f5938b && this.f5939c == zVar.f5939c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int hashCode = (this.f5937a.hashCode() + 31) * 31;
        int i4 = 1237;
        if (this.f5938b) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        int i5 = (hashCode + i3) * 31;
        if (this.f5939c) {
            i4 = 1231;
        }
        return i5 + i4;
    }
}
