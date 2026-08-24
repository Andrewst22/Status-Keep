package k0;

import D1.b0;
import D1.g0;
import android.net.Uri;
/* renamed from: k0.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542E {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f7520a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f7521b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7522c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7523d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7524e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7525f;

    /* renamed from: g  reason: collision with root package name */
    public final Uri f7526g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7527h;

    /* renamed from: i  reason: collision with root package name */
    public final String f7528i;

    /* renamed from: j  reason: collision with root package name */
    public final String f7529j;

    /* renamed from: k  reason: collision with root package name */
    public final String f7530k;

    /* renamed from: l  reason: collision with root package name */
    public final String f7531l;

    public C0542E(C0541D c0541d) {
        this.f7520a = g0.a(c0541d.f7508a);
        this.f7521b = c0541d.f7509b.g();
        String str = c0541d.f7511d;
        int i3 = U.A.f2405a;
        this.f7522c = str;
        this.f7523d = c0541d.f7512e;
        this.f7524e = c0541d.f7513f;
        this.f7526g = c0541d.f7514g;
        this.f7527h = c0541d.f7515h;
        this.f7525f = c0541d.f7510c;
        this.f7528i = c0541d.f7516i;
        this.f7529j = c0541d.f7518k;
        this.f7530k = c0541d.f7519l;
        this.f7531l = c0541d.f7517j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0542E.class != obj.getClass()) {
            return false;
        }
        C0542E c0542e = (C0542E) obj;
        if (this.f7525f == c0542e.f7525f) {
            g0 g0Var = this.f7520a;
            g0Var.getClass();
            if (D1.r.h(g0Var, c0542e.f7520a) && this.f7521b.equals(c0542e.f7521b) && U.A.a(this.f7523d, c0542e.f7523d) && U.A.a(this.f7522c, c0542e.f7522c) && U.A.a(this.f7524e, c0542e.f7524e) && U.A.a(this.f7531l, c0542e.f7531l) && U.A.a(this.f7526g, c0542e.f7526g) && U.A.a(this.f7529j, c0542e.f7529j) && U.A.a(this.f7530k, c0542e.f7530k) && U.A.a(this.f7527h, c0542e.f7527h) && U.A.a(this.f7528i, c0542e.f7528i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9 = (this.f7521b.hashCode() + ((this.f7520a.hashCode() + 217) * 31)) * 31;
        int i3 = 0;
        String str = this.f7523d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (hashCode9 + hashCode) * 31;
        String str2 = this.f7522c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        String str3 = this.f7524e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i6 = (((i5 + hashCode3) * 31) + this.f7525f) * 31;
        String str4 = this.f7531l;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        Uri uri = this.f7526g;
        if (uri == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = uri.hashCode();
        }
        int i8 = (i7 + hashCode5) * 31;
        String str5 = this.f7529j;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i9 = (i8 + hashCode6) * 31;
        String str6 = this.f7530k;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i10 = (i9 + hashCode7) * 31;
        String str7 = this.f7527h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i11 = (i10 + hashCode8) * 31;
        String str8 = this.f7528i;
        if (str8 != null) {
            i3 = str8.hashCode();
        }
        return i11 + i3;
    }
}
