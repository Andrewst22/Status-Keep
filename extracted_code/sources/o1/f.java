package o1;

import C2.l;
import N.j;
import android.util.Log;
import java.util.ArrayList;
import m2.AbstractC0635d;
import t2.C0824a;
import t2.C0835l;
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8668a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8669b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8670c;

    /* renamed from: d  reason: collision with root package name */
    public final U1.a f8671d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [t2.l] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Throwable, U1.a, java.lang.Exception] */
    public f(Object obj, String str, C0702a c0702a, int i3) {
        D2.i.e(obj, "value");
        D2.h.r("verificationMode", i3);
        this.f8668a = obj;
        this.f8669b = str;
        this.f8670c = i3;
        String b3 = g.b(obj, str);
        D2.i.e(b3, "message");
        ?? exc = new Exception(b3);
        StackTraceElement[] stackTrace = exc.getStackTrace();
        D2.i.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length >= 0) {
            ?? r02 = C0835l.f9264m;
            if (length != 0) {
                int length2 = stackTrace.length;
                if (length >= length2) {
                    int length3 = stackTrace.length;
                    if (length3 != 0) {
                        r02 = length3 != 1 ? new ArrayList(new C0824a(stackTrace, false)) : AbstractC0635d.s(stackTrace[0]);
                    }
                } else if (length == 1) {
                    r02 = AbstractC0635d.s(stackTrace[length2 - 1]);
                } else {
                    r02 = new ArrayList(length);
                    for (int i4 = length2 - length; i4 < length2; i4++) {
                        r02.add(stackTrace[i4]);
                    }
                }
            }
            exc.setStackTrace((StackTraceElement[]) r02.toArray(new StackTraceElement[0]));
            this.f8671d = exc;
            return;
        }
        throw new IllegalArgumentException(("Requested element count " + length + " is less than zero.").toString());
    }

    @Override // o1.g
    public final Object a() {
        int b3 = j.b(this.f8670c);
        if (b3 != 0) {
            if (b3 != 1) {
                if (b3 != 2) {
                    throw new RuntimeException();
                }
                return null;
            }
            String b4 = g.b(this.f8668a, this.f8669b);
            D2.i.e(b4, "message");
            Log.d("f", b4);
            return null;
        }
        throw this.f8671d;
    }

    @Override // o1.g
    public final g d(String str, l lVar) {
        return this;
    }
}
