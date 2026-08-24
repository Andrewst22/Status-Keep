package j$.util.function;

import java.util.function.DoublePredicate;
/* renamed from: j$.util.function.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0355j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DoublePredicate f6846a;

    private /* synthetic */ C0355j(DoublePredicate doublePredicate) {
        this.f6846a = doublePredicate;
    }

    public static /* synthetic */ C0355j a(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return new C0355j(doublePredicate);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoublePredicate doublePredicate = this.f6846a;
        if (obj instanceof C0355j) {
            obj = ((C0355j) obj).f6846a;
        }
        return doublePredicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6846a.hashCode();
    }
}
