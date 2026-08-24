package j$.util.function;

import java.util.Comparator;
/* renamed from: j$.util.function.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0346a implements InterfaceC0348c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6840a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Comparator f6841b;

    public /* synthetic */ C0346a(Comparator comparator, int i3) {
        this.f6840a = i3;
        this.f6841b = comparator;
    }

    @Override // j$.util.function.BiFunction
    public final Object c(Object obj, Object obj2) {
        switch (this.f6840a) {
            case 0:
                return this.f6841b.compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return this.f6841b.compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }
}
