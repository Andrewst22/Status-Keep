package j$.util.concurrent;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    final Object f6777a;

    /* renamed from: b  reason: collision with root package name */
    Object f6778b;

    /* renamed from: c  reason: collision with root package name */
    final ConcurrentHashMap f6779c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f6777a = obj;
        this.f6778b = obj2;
        this.f6779c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6777a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6778b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f6777a.hashCode() ^ this.f6778b.hashCode();
    }

    public final String toString() {
        return u.b(this.f6777a, this.f6778b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f6777a) || key.equals(obj2)) && (value == (obj3 = this.f6778b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f6778b;
        this.f6778b = obj;
        this.f6779c.put(this.f6777a, obj);
        return obj2;
    }
}
