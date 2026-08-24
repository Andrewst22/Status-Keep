package k0;

import D1.g0;
import android.os.Handler;
import java.io.Closeable;
/* renamed from: k0.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0556k implements Runnable, Closeable {

    /* renamed from: m  reason: collision with root package name */
    public final Handler f7609m = U.A.n(null);

    /* renamed from: n  reason: collision with root package name */
    public final long f7610n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7611o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ C0557l f7612p;

    public RunnableC0556k(C0557l c0557l, long j3) {
        this.f7612p = c0557l;
        this.f7610n = j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7611o = false;
        this.f7609m.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0557l c0557l = this.f7612p;
        B0.b bVar = c0557l.f7624s;
        bVar.k(bVar.e(4, c0557l.f7628w, g0.f255s, c0557l.f7625t));
        this.f7609m.postDelayed(this, this.f7610n);
    }
}
