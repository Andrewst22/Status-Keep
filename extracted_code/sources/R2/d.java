package R2;

import K2.AbstractC0089s;
/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: p  reason: collision with root package name */
    public static final d f2129p;

    /* JADX WARN: Type inference failed for: r0v0, types: [R2.d, K2.s, R2.g] */
    static {
        int i3 = k.f2138c;
        int i4 = k.f2139d;
        long j3 = k.f2140e;
        String str = k.f2136a;
        ?? abstractC0089s = new AbstractC0089s();
        abstractC0089s.f2131o = new b(i3, i4, j3, str);
        f2129p = abstractC0089s;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // K2.AbstractC0089s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
