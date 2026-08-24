package q;

import java.util.concurrent.CancellationException;
/* renamed from: q.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0742a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0742a f8838b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0742a f8839c;

    /* renamed from: a  reason: collision with root package name */
    public final CancellationException f8840a;

    static {
        if (g.f8851d) {
            f8839c = null;
            f8838b = null;
            return;
        }
        f8839c = new C0742a(false, null);
        f8838b = new C0742a(true, null);
    }

    public C0742a(boolean z3, CancellationException cancellationException) {
        this.f8840a = cancellationException;
    }
}
