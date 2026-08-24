package c0;

import U.A;
/* renamed from: c0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226f {

    /* renamed from: a  reason: collision with root package name */
    public final String f4738a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4739b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4740c;

    public C0226f(String str, String str2, String str3) {
        this.f4738a = str;
        this.f4739b = str2;
        this.f4740c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0226f.class != obj.getClass()) {
            return false;
        }
        C0226f c0226f = (C0226f) obj;
        if (A.a(this.f4738a, c0226f.f4738a) && A.a(this.f4739b, c0226f.f4739b) && A.a(this.f4740c, c0226f.f4740c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int hashCode = this.f4738a.hashCode() * 31;
        int i4 = 0;
        String str = this.f4739b;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i5 = (hashCode + i3) * 31;
        String str2 = this.f4740c;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }
}
