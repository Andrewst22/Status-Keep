package p0;

import java.util.NoSuchElementException;
/* renamed from: p0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0729b implements m {

    /* renamed from: m  reason: collision with root package name */
    public final long f8758m;

    /* renamed from: n  reason: collision with root package name */
    public final long f8759n;

    /* renamed from: o  reason: collision with root package name */
    public long f8760o;

    public AbstractC0729b(long j3, long j4) {
        this.f8758m = j3;
        this.f8759n = j4;
        this.f8760o = j3 - 1;
    }

    public final void a() {
        long j3 = this.f8760o;
        if (j3 >= this.f8758m && j3 <= this.f8759n) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override // p0.m
    public final boolean next() {
        boolean z3;
        long j3 = this.f8760o + 1;
        this.f8760o = j3;
        if (j3 > this.f8759n) {
            z3 = true;
        } else {
            z3 = false;
        }
        return !z3;
    }
}
