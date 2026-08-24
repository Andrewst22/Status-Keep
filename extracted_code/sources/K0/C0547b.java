package k0;

import U.AbstractC0123a;
import java.util.regex.Pattern;
/* renamed from: k0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547b {

    /* renamed from: a  reason: collision with root package name */
    public final int f7551a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7552b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7553c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7554d;

    public C0547b(int i3, int i4, int i5, String str) {
        this.f7551a = i3;
        this.f7552b = str;
        this.f7553c = i4;
        this.f7554d = i5;
    }

    public static C0547b a(String str) {
        boolean z3;
        boolean z4;
        int i3 = U.A.f2405a;
        String[] split = str.split(" ", 2);
        if (split.length == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        String str2 = split[0];
        Pattern pattern = z.f7693a;
        try {
            int parseInt = Integer.parseInt(str2);
            int i4 = -1;
            String[] split2 = split[1].trim().split("/", -1);
            if (split2.length >= 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            AbstractC0123a.e(z4);
            String str3 = split2[1];
            try {
                int parseInt2 = Integer.parseInt(str3);
                if (split2.length == 3) {
                    String str4 = split2[2];
                    try {
                        i4 = Integer.parseInt(str4);
                    } catch (NumberFormatException e2) {
                        throw R.H.b(str4, e2);
                    }
                }
                return new C0547b(parseInt, parseInt2, i4, split2[0]);
            } catch (NumberFormatException e3) {
                throw R.H.b(str3, e3);
            }
        } catch (NumberFormatException e4) {
            throw R.H.b(str2, e4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0547b.class != obj.getClass()) {
            return false;
        }
        C0547b c0547b = (C0547b) obj;
        if (this.f7551a == c0547b.f7551a && this.f7552b.equals(c0547b.f7552b) && this.f7553c == c0547b.f7553c && this.f7554d == c0547b.f7554d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7552b.hashCode() + ((217 + this.f7551a) * 31)) * 31) + this.f7553c) * 31) + this.f7554d;
    }
}
