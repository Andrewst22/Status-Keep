package T;

import U.A;
import android.os.Bundle;
import android.text.Spanned;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2282a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f2283b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f2284c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f2285d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f2286e;

    static {
        int i3 = A.f2405a;
        f2282a = Integer.toString(0, 36);
        f2283b = Integer.toString(1, 36);
        f2284c = Integer.toString(2, 36);
        f2285d = Integer.toString(3, 36);
        f2286e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i3, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f2282a, spanned.getSpanStart(obj));
        bundle2.putInt(f2283b, spanned.getSpanEnd(obj));
        bundle2.putInt(f2284c, spanned.getSpanFlags(obj));
        bundle2.putInt(f2285d, i3);
        if (bundle != null) {
            bundle2.putBundle(f2286e, bundle);
        }
        return bundle2;
    }
}
