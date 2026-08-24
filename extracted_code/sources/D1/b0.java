package D1;

import a.AbstractC0155a;
import java.util.Objects;
/* loaded from: classes.dex */
public final class b0 extends I {

    /* renamed from: q  reason: collision with root package name */
    public static final b0 f231q = new b0(0, new Object[0]);

    /* renamed from: o  reason: collision with root package name */
    public final transient Object[] f232o;

    /* renamed from: p  reason: collision with root package name */
    public final transient int f233p;

    public b0(int i3, Object[] objArr) {
        this.f232o = objArr;
        this.f233p = i3;
    }

    @Override // D1.I, D1.D
    public final int b(int i3, Object[] objArr) {
        Object[] objArr2 = this.f232o;
        int i4 = this.f233p;
        System.arraycopy(objArr2, 0, objArr, i3, i4);
        return i3 + i4;
    }

    @Override // D1.D
    public final Object[] c() {
        return this.f232o;
    }

    @Override // D1.D
    public final int d() {
        return this.f233p;
    }

    @Override // D1.D
    public final int e() {
        return 0;
    }

    @Override // D1.D
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0155a.l(i3, this.f233p);
        Object obj = this.f232o[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f233p;
    }
}
