package p;

import androidx.datastore.preferences.protobuf.Z;
import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
/* renamed from: p.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0723e extends C0727i implements Map, j$.util.Map {

    /* renamed from: t  reason: collision with root package name */
    public Z f8725t;

    /* renamed from: u  reason: collision with root package name */
    public C0720b f8726u;

    /* renamed from: v  reason: collision with root package name */
    public C0722d f8727v;

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Z z3 = this.f8725t;
        if (z3 == null) {
            Z z4 = new Z(this, 1);
            this.f8725t = z4;
            return z4;
        }
        return z3;
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final Object[] j(int i3, Object[] objArr) {
        int i4 = this.f8750o;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = this.f8749n[(i5 << 1) + i3];
        }
        if (objArr.length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0720b c0720b = this.f8726u;
        if (c0720b == null) {
            C0720b c0720b2 = new C0720b(this);
            this.f8726u = c0720b2;
            return c0720b2;
        }
        return c0720b;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        int size = map.size() + this.f8750o;
        int i3 = this.f8750o;
        int[] iArr = this.f8748m;
        if (iArr.length < size) {
            Object[] objArr = this.f8749n;
            a(size);
            if (this.f8750o > 0) {
                System.arraycopy(iArr, 0, this.f8748m, 0, i3);
                System.arraycopy(objArr, 0, this.f8749n, 0, i3 << 1);
            }
            C0727i.b(iArr, objArr, i3);
        }
        if (this.f8750o == i3) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map
    public final Collection values() {
        C0722d c0722d = this.f8727v;
        if (c0722d == null) {
            C0722d c0722d2 = new C0722d(this);
            this.f8727v = c0722d2;
            return c0722d2;
        }
        return c0722d;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object compute(Object obj, j$.util.function.BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, j$.util.function.Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, j$.util.function.BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(j$.util.function.BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, j$.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(j$.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }
}
