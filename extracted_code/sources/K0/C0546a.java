package k0;

import D1.g0;
import U.AbstractC0123a;
import java.util.HashMap;
import java.util.Locale;
/* renamed from: k0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546a {

    /* renamed from: a  reason: collision with root package name */
    public final String f7542a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7543b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7544c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7545d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f7546e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public int f7547f = -1;

    /* renamed from: g  reason: collision with root package name */
    public String f7548g;

    /* renamed from: h  reason: collision with root package name */
    public String f7549h;

    /* renamed from: i  reason: collision with root package name */
    public String f7550i;

    public C0546a(int i3, int i4, String str, String str2) {
        this.f7542a = str;
        this.f7543b = i3;
        this.f7544c = str2;
        this.f7545d = i4;
    }

    public static String b(int i3, int i4, int i5, String str) {
        int i6 = U.A.f2405a;
        Locale locale = Locale.US;
        return i3 + " " + str + "/" + i4 + "/" + i5;
    }

    public final C0548c a() {
        boolean z3;
        String b3;
        C0547b a3;
        HashMap hashMap = this.f7546e;
        try {
            if (hashMap.containsKey("rtpmap")) {
                int i3 = U.A.f2405a;
                a3 = C0547b.a((String) hashMap.get("rtpmap"));
            } else {
                int i4 = this.f7545d;
                if (i4 < 96) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0123a.e(z3);
                if (i4 != 0) {
                    if (i4 != 8) {
                        if (i4 != 10) {
                            if (i4 == 11) {
                                b3 = b(11, 44100, 1, "L16");
                            } else {
                                throw new IllegalStateException(D2.h.k("Unsupported static paylod type ", i4));
                            }
                        } else {
                            b3 = b(10, 44100, 2, "L16");
                        }
                    } else {
                        b3 = b(8, 8000, 1, "PCMA");
                    }
                } else {
                    b3 = b(0, 8000, 1, "PCMU");
                }
                a3 = C0547b.a(b3);
            }
            return new C0548c(this, g0.a(hashMap), a3);
        } catch (R.H e2) {
            throw new IllegalStateException(e2);
        }
    }
}
