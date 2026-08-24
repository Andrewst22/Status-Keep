package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.m1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0439m1 extends C0434l1 implements InterfaceC0497y0 {
    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final /* synthetic */ void d(double d3) {
        AbstractC0482v0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void e(int i3) {
        AbstractC0482v0.k();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0435l2
    public final /* synthetic */ void n(Long l3) {
        AbstractC0482v0.i(this, l3);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0502z0
    public final /* bridge */ /* synthetic */ H0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.InterfaceC0497y0, j$.util.stream.InterfaceC0502z0
    public final F0 a() {
        int i3 = this.f7202b;
        long[] jArr = this.f7201a;
        if (i3 >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f7202b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        long[] jArr = this.f7201a;
        if (j3 != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j3), Integer.valueOf(jArr.length)));
        }
        this.f7202b = 0;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void f(long j3) {
        int i3 = this.f7202b;
        long[] jArr = this.f7201a;
        if (i3 < jArr.length) {
            this.f7202b = 1 + i3;
            jArr[i3] = j3;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void r() {
        int i3 = this.f7202b;
        long[] jArr = this.f7201a;
        if (i3 < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f7202b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // j$.util.stream.C0434l1
    public final String toString() {
        long[] jArr = this.f7201a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f7202b), Arrays.toString(jArr));
    }
}
