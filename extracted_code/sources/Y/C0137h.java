package Y;

import R.C0113p;
import U.AbstractC0123a;
import android.text.TextUtils;
/* renamed from: Y.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137h {

    /* renamed from: a  reason: collision with root package name */
    public final String f3301a;

    /* renamed from: b  reason: collision with root package name */
    public final C0113p f3302b;

    /* renamed from: c  reason: collision with root package name */
    public final C0113p f3303c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3304d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3305e;

    public C0137h(String str, C0113p c0113p, C0113p c0113p2, int i3, int i4) {
        boolean z3;
        if (i3 != 0 && i4 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        AbstractC0123a.e(z3);
        if (!TextUtils.isEmpty(str)) {
            this.f3301a = str;
            c0113p.getClass();
            this.f3302b = c0113p;
            c0113p2.getClass();
            this.f3303c = c0113p2;
            this.f3304d = i3;
            this.f3305e = i4;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0137h.class != obj.getClass()) {
            return false;
        }
        C0137h c0137h = (C0137h) obj;
        if (this.f3304d == c0137h.f3304d && this.f3305e == c0137h.f3305e && this.f3301a.equals(c0137h.f3301a) && this.f3302b.equals(c0137h.f3302b) && this.f3303c.equals(c0137h.f3303c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f3301a.hashCode();
        int hashCode2 = this.f3302b.hashCode();
        return this.f3303c.hashCode() + ((hashCode2 + ((hashCode + ((((527 + this.f3304d) * 31) + this.f3305e) * 31)) * 31)) * 31);
    }
}
