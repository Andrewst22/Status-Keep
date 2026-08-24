package c0;

import U.A;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f4749a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4750b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4751c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4752d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4753e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f4749a = str;
        this.f4750b = str2;
        this.f4751c = str3;
        this.f4752d = str4;
        this.f4753e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (A.a(this.f4749a, iVar.f4749a) && A.a(this.f4750b, iVar.f4750b) && A.a(this.f4751c, iVar.f4751c) && A.a(this.f4752d, iVar.f4752d) && A.a(this.f4753e, iVar.f4753e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        String str = this.f4749a;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (527 + i3) * 31;
        String str2 = this.f4750b;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str3 = this.f4751c;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        String str4 = this.f4752d;
        if (str4 != null) {
            i6 = str4.hashCode();
        } else {
            i6 = 0;
        }
        int i11 = (i10 + i6) * 31;
        String str5 = this.f4753e;
        if (str5 != null) {
            i7 = str5.hashCode();
        }
        return i11 + i7;
    }
}
