package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.ArrayList;
/* renamed from: j$.util.stream.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0377a implements j$.util.function.M, j$.util.function.A, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7092a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7093b;

    public /* synthetic */ C0377a(int i3, Object obj) {
        this.f7092a = i3;
        this.f7093b = obj;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f7092a) {
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                ((InterfaceC0440m2) this.f7093b).accept(obj);
                return;
            default:
                ((ArrayList) this.f7093b).add(obj);
                return;
        }
    }

    @Override // j$.util.function.M
    public Object get() {
        switch (this.f7092a) {
            case 0:
                return ((AbstractC0382b) this.f7093b).Q();
            default:
                return (Spliterator) this.f7093b;
        }
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer h(Consumer consumer) {
        switch (this.f7092a) {
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return j$.com.android.tools.r8.a.a(this, consumer);
            default:
                return j$.com.android.tools.r8.a.a(this, consumer);
        }
    }

    @Override // j$.util.function.A
    public Object o(long j3) {
        return AbstractC0482v0.D(j3, (IntFunction) this.f7093b);
    }
}
