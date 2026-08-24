package j$.util;

import j$.util.function.Function;
import java.io.Serializable;
import java.util.Comparator;
/* renamed from: j$.util.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0344e implements Comparator, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6818a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Comparator f6819b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6820c;

    public /* synthetic */ C0344e(Comparator comparator, Object obj, int i3) {
        this.f6818a = i3;
        this.f6819b = comparator;
        this.f6820c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6818a) {
            case 0:
                int compare = this.f6819b.compare(obj, obj2);
                return compare != 0 ? compare : ((Comparator) this.f6820c).compare(obj, obj2);
            default:
                Function function = (Function) this.f6820c;
                return this.f6819b.compare(function.a(obj), function.a(obj2));
        }
    }
}
