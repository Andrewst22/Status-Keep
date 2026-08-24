package j$.util.stream;

import j$.util.function.Consumer;
/* renamed from: j$.util.stream.g3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0411g3 extends AbstractC0416h3 implements Consumer {

    /* renamed from: b  reason: collision with root package name */
    final Object[] f7170b;

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0411g3(int i3) {
        this.f7170b = new Object[i3];
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i3 = this.f7177a;
        this.f7177a = i3 + 1;
        this.f7170b[i3] = obj;
    }
}
