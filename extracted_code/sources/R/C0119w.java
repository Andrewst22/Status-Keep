package R;

import a.AbstractC0155a;
import android.net.Uri;
import java.util.List;
/* renamed from: R.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119w {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f2001a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2002b;

    /* renamed from: c  reason: collision with root package name */
    public final List f2003c;

    /* renamed from: d  reason: collision with root package name */
    public final D1.I f2004d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2005e;

    static {
        D2.h.m(0, 1, 2, 3, 4);
        U.A.H(5);
        U.A.H(6);
        U.A.H(7);
    }

    public C0119w(Uri uri, String str, AbstractC0155a abstractC0155a, List list, D1.I i3, long j3) {
        this.f2001a = uri;
        this.f2002b = G.l(str);
        this.f2003c = list;
        this.f2004d = i3;
        D1.F i4 = D1.I.i();
        for (int i5 = 0; i5 < i3.size(); i5++) {
            ((C0121y) i3.get(i5)).getClass();
            new B1.b(14);
            i4.c(new Object());
        }
        i4.g();
        this.f2005e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0119w)) {
            return false;
        }
        C0119w c0119w = (C0119w) obj;
        if (this.f2001a.equals(c0119w.f2001a) && U.A.a(this.f2002b, c0119w.f2002b) && U.A.a(null, null) && U.A.a(null, null) && this.f2003c.equals(c0119w.f2003c) && U.A.a(null, null) && this.f2004d.equals(c0119w.f2004d) && U.A.a(null, null) && Long.valueOf(this.f2005e).equals(Long.valueOf(c0119w.f2005e))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f2001a.hashCode() * 31;
        String str = this.f2002b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = this.f2003c.hashCode();
        return (int) (((this.f2004d.hashCode() + ((hashCode3 + ((hashCode2 + hashCode) * 29791)) * 961)) * 31 * 31) + this.f2005e);
    }
}
