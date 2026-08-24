package j$.util.concurrent;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class l implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    final int f6780a;

    /* renamed from: b  reason: collision with root package name */
    final Object f6781b;

    /* renamed from: c  reason: collision with root package name */
    volatile Object f6782c;

    /* renamed from: d  reason: collision with root package name */
    volatile l f6783d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i3, Object obj, Object obj2) {
        this.f6780a = i3;
        this.f6781b = obj;
        this.f6782c = obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i3, Object obj, Object obj2, l lVar) {
        this(i3, obj, obj2);
        this.f6783d = lVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6781b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6782c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f6781b.hashCode() ^ this.f6782c.hashCode();
    }

    public final String toString() {
        return u.b(this.f6781b, this.f6782c);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f6781b) || key.equals(obj2)) && (value == (obj3 = this.f6782c) || value.equals(obj3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l a(int i3, Object obj) {
        Object obj2;
        if (obj != null) {
            l lVar = this;
            do {
                if (lVar.f6780a == i3 && ((obj2 = lVar.f6781b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVar;
                }
                lVar = lVar.f6783d;
            } while (lVar != null);
            return null;
        }
        return null;
    }
}
