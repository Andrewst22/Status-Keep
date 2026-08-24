package androidx.datastore.preferences.protobuf;

import java.util.Map;
/* loaded from: classes.dex */
public final class X implements Map.Entry, Comparable {

    /* renamed from: m  reason: collision with root package name */
    public final Comparable f4217m;

    /* renamed from: n  reason: collision with root package name */
    public Object f4218n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ W f4219o;

    public X(W w3, Comparable comparable, Object obj) {
        this.f4219o = w3;
        this.f4217m = comparable;
        this.f4218n = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4217m.compareTo(((X) obj).f4217m);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f4217m;
        if (comparable == null) {
            if (key == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = comparable.equals(key);
        }
        if (equals) {
            Object obj2 = this.f4218n;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    equals2 = true;
                } else {
                    equals2 = false;
                }
            } else {
                equals2 = obj2.equals(value);
            }
            if (equals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4217m;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4218n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i3 = 0;
        Comparable comparable = this.f4217m;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f4218n;
        if (obj != null) {
            i3 = obj.hashCode();
        }
        return i3 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f4219o.b();
        Object obj2 = this.f4218n;
        this.f4218n = obj;
        return obj2;
    }

    public final String toString() {
        return this.f4217m + "=" + this.f4218n;
    }
}
