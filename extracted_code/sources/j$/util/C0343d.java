package j$.util;

import j$.util.function.Function;
import java.io.Serializable;
import java.util.Comparator;
/* renamed from: j$.util.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0343d implements Comparator, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6816a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6817b;

    public /* synthetic */ C0343d(int i3, Object obj) {
        this.f6816a = i3;
        this.f6817b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6816a) {
            case 0:
                j$.util.function.P p3 = (j$.util.function.P) this.f6817b;
                return j$.com.android.tools.r8.a.b(p3.f6836a.applyAsInt(obj), p3.f6836a.applyAsInt(obj2));
            case 1:
                j$.util.function.N n3 = (j$.util.function.N) this.f6817b;
                return Double.compare(n3.f6835a.applyAsDouble(obj), n3.f6835a.applyAsDouble(obj2));
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                Function function = (Function) this.f6817b;
                return ((Comparable) function.a(obj)).compareTo(function.a(obj2));
            default:
                j$.util.function.S s3 = (j$.util.function.S) this.f6817b;
                return j$.com.android.tools.r8.a.c(s3.f6838a.applyAsLong(obj), s3.f6838a.applyAsLong(obj2));
        }
    }
}
