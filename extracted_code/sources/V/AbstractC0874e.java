package v;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import n2.AbstractC0664g;
/* renamed from: v.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0874e {

    /* renamed from: a  reason: collision with root package name */
    public static final AbstractC0664g f9470a;

    /* renamed from: b  reason: collision with root package name */
    public static final Q0.i f9471b;

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            f9470a = new AbstractC0664g();
        } else if (i3 >= 28) {
            f9470a = new h();
        } else if (i3 >= 26) {
            f9470a = new h();
        } else {
            if (i3 >= 24) {
                Method method = C0876g.f9479c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f9470a = new AbstractC0664g();
                }
            }
            f9470a = new AbstractC0664g();
        }
        f9471b = new Q0.i(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r6.equals(r10) == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [z.j, java.lang.Object, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r14, u.InterfaceC0842e r15, android.content.res.Resources r16, int r17, java.lang.String r18, int r19, int r20, Q0.h r21) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.AbstractC0874e.a(android.content.Context, u.e, android.content.res.Resources, int, java.lang.String, int, int, Q0.h):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i3, String str, int i4, int i5) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i4 + '-' + i3 + '-' + i5;
    }
}
