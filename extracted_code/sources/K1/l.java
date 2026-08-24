package K1;

import java.util.Map;
/* loaded from: classes.dex */
public final class l implements Map.Entry {

    /* renamed from: m  reason: collision with root package name */
    public l f763m;

    /* renamed from: n  reason: collision with root package name */
    public l f764n;

    /* renamed from: o  reason: collision with root package name */
    public l f765o;

    /* renamed from: p  reason: collision with root package name */
    public l f766p;

    /* renamed from: q  reason: collision with root package name */
    public l f767q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f768r;

    /* renamed from: s  reason: collision with root package name */
    public Object f769s;

    /* renamed from: t  reason: collision with root package name */
    public int f770t;

    public l() {
        this.f768r = null;
        this.f767q = this;
        this.f766p = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f768r;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f769s;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f768r;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f769s;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i3 = 0;
        Object obj = this.f768r;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f769s;
        if (obj2 != null) {
            i3 = obj2.hashCode();
        }
        return i3 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f769s;
        this.f769s = obj;
        return obj2;
    }

    public final String toString() {
        return this.f768r + "=" + this.f769s;
    }

    public l(l lVar, Object obj, l lVar2, l lVar3) {
        this.f763m = lVar;
        this.f768r = obj;
        this.f770t = 1;
        this.f766p = lVar2;
        this.f767q = lVar3;
        lVar3.f766p = this;
        lVar2.f767q = this;
    }
}
