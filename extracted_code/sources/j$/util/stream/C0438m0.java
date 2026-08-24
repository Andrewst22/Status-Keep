package j$.util.stream;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer;
import j$.util.function.C0355j;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: j$.util.stream.m0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0438m0 implements j$.util.function.M, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7205a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7206b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f7207c;

    public /* synthetic */ C0438m0(int i3, Object obj, Object obj2) {
        this.f7205a = i3;
        this.f7206b = obj;
        this.f7207c = obj2;
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer h(Consumer consumer) {
        switch (this.f7205a) {
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return j$.com.android.tools.r8.a.a(this, consumer);
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return j$.com.android.tools.r8.a.a(this, consumer);
            default:
                return j$.com.android.tools.r8.a.a(this, consumer);
        }
    }

    @Override // j$.util.function.M
    public Object get() {
        switch (this.f7205a) {
            case 0:
                return new C0453p0((j$.util.function.B) this.f7207c, (EnumC0467s0) this.f7206b);
            case 1:
                return new C0448o0((j$.util.function.r) this.f7207c, (EnumC0467s0) this.f7206b);
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0458q0((C0355j) this.f7207c, (EnumC0467s0) this.f7206b);
            default:
                return new C0443n0((Predicate) this.f7207c, (EnumC0467s0) this.f7206b);
        }
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f7205a) {
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                ((C0421i3) this.f7206b).q((Consumer) this.f7207c, obj);
                return;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                if (obj == null) {
                    ((AtomicBoolean) this.f7206b).set(true);
                    return;
                }
                ((ConcurrentHashMap) this.f7207c).putIfAbsent(obj, Boolean.TRUE);
                return;
            default:
                ((BiConsumer) this.f7206b).u(this.f7207c, obj);
                return;
        }
    }
}
