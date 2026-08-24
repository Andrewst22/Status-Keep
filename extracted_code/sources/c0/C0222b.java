package c0;

import java.util.Arrays;
/* renamed from: c0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4709a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4710b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4711c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4712d;

    public C0222b(int i3, int i4, String str, String str2) {
        this.f4709a = str;
        this.f4710b = str2;
        this.f4711c = i3;
        this.f4712d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0222b)) {
            return false;
        }
        C0222b c0222b = (C0222b) obj;
        if (this.f4711c == c0222b.f4711c && this.f4712d == c0222b.f4712d && android.support.v4.media.session.a.s(this.f4709a, c0222b.f4709a) && android.support.v4.media.session.a.s(this.f4710b, c0222b.f4710b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4709a, this.f4710b, Integer.valueOf(this.f4711c), Integer.valueOf(this.f4712d)});
    }
}
