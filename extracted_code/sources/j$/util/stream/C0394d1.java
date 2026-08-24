package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0394d1 extends C0389c1 implements InterfaceC0492x0 {
    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        t((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final /* synthetic */ void d(double d3) {
        AbstractC0482v0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void f(long j3) {
        AbstractC0482v0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0430k2
    public final /* synthetic */ void t(Integer num) {
        AbstractC0482v0.f(this, num);
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

    @Override // j$.util.stream.InterfaceC0492x0, j$.util.stream.InterfaceC0502z0
    public final D0 a() {
        int i3 = this.f7132b;
        int[] iArr = this.f7131a;
        if (i3 >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f7132b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        int[] iArr = this.f7131a;
        if (j3 != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j3), Integer.valueOf(iArr.length)));
        }
        this.f7132b = 0;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        int i4 = this.f7132b;
        int[] iArr = this.f7131a;
        if (i4 < iArr.length) {
            this.f7132b = 1 + i4;
            iArr[i4] = i3;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void r() {
        int i3 = this.f7132b;
        int[] iArr = this.f7131a;
        if (i3 < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f7132b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // j$.util.stream.C0389c1
    public final String toString() {
        int[] iArr = this.f7131a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f7132b), Arrays.toString(iArr));
    }
}
