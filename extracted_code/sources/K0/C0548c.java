package k0;

import D1.g0;
/* renamed from: k0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548c {

    /* renamed from: a  reason: collision with root package name */
    public final String f7555a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7556b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7557c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7558d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7559e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7560f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7561g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7562h;

    /* renamed from: i  reason: collision with root package name */
    public final g0 f7563i;

    /* renamed from: j  reason: collision with root package name */
    public final C0547b f7564j;

    public C0548c(C0546a c0546a, g0 g0Var, C0547b c0547b) {
        this.f7555a = c0546a.f7542a;
        this.f7556b = c0546a.f7543b;
        this.f7557c = c0546a.f7544c;
        this.f7558d = c0546a.f7545d;
        this.f7560f = c0546a.f7548g;
        this.f7561g = c0546a.f7549h;
        this.f7559e = c0546a.f7547f;
        this.f7562h = c0546a.f7550i;
        this.f7563i = g0Var;
        this.f7564j = c0547b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0548c.class != obj.getClass()) {
            return false;
        }
        C0548c c0548c = (C0548c) obj;
        if (this.f7555a.equals(c0548c.f7555a) && this.f7556b == c0548c.f7556b && this.f7557c.equals(c0548c.f7557c) && this.f7558d == c0548c.f7558d && this.f7559e == c0548c.f7559e) {
            g0 g0Var = this.f7563i;
            g0Var.getClass();
            if (D1.r.h(g0Var, c0548c.f7563i) && this.f7564j.equals(c0548c.f7564j) && U.A.a(this.f7560f, c0548c.f7560f) && U.A.a(this.f7561g, c0548c.f7561g) && U.A.a(this.f7562h, c0548c.f7562h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f7557c.hashCode();
        int hashCode4 = this.f7563i.hashCode();
        int hashCode5 = (this.f7564j.hashCode() + ((hashCode4 + ((((((hashCode3 + ((((this.f7555a.hashCode() + 217) * 31) + this.f7556b) * 31)) * 31) + this.f7558d) * 31) + this.f7559e) * 31)) * 31)) * 31;
        int i3 = 0;
        String str = this.f7560f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (hashCode5 + hashCode) * 31;
        String str2 = this.f7561g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        String str3 = this.f7562h;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }
}
