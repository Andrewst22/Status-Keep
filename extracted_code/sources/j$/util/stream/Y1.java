package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntFunction;
/* loaded from: classes2.dex */
public final /* synthetic */ class Y1 implements IntFunction, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7063a;

    private final void b(Object obj) {
    }

    private final void c(Object obj) {
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        int i3 = this.f7063a;
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer h(Consumer consumer) {
        switch (this.f7063a) {
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return j$.com.android.tools.r8.a.a(this, consumer);
            default:
                return j$.com.android.tools.r8.a.a(this, consumer);
        }
    }

    @Override // j$.util.function.IntFunction
    public Object j(int i3) {
        switch (this.f7063a) {
            case 0:
                return new Object[i3];
            case 1:
                return new Integer[i3];
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new Long[i3];
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new Double[i3];
            case N.k.LONG_FIELD_NUMBER /* 4 */:
            case N.k.STRING_FIELD_NUMBER /* 5 */:
            default:
                return new Double[i3];
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new Integer[i3];
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new Integer[i3];
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                return new Long[i3];
            case 9:
                return new Long[i3];
            case 10:
                return new Double[i3];
        }
    }
}
