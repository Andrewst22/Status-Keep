package j$.util.function;

import java.util.function.ToIntFunction;
/* loaded from: classes2.dex */
public final /* synthetic */ class P implements Q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ToIntFunction f6836a;

    private /* synthetic */ P(ToIntFunction toIntFunction) {
        this.f6836a = toIntFunction;
    }

    public static /* synthetic */ P a(ToIntFunction toIntFunction) {
        if (toIntFunction == null) {
            return null;
        }
        return new P(toIntFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ToIntFunction toIntFunction = this.f6836a;
        if (obj instanceof P) {
            obj = ((P) obj).f6836a;
        }
        return toIntFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6836a.hashCode();
    }

    @Override // j$.util.function.Q
    public final /* synthetic */ int p(Object obj) {
        return this.f6836a.applyAsInt(obj);
    }
}
