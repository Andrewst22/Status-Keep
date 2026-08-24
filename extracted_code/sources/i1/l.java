package I1;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class l extends m implements Iterable {

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f474m = new ArrayList();

    @Override // I1.m
    public final boolean a() {
        ArrayList arrayList = this.f474m;
        if (arrayList.size() == 1) {
            return ((m) arrayList.get(0)).a();
        }
        throw new IllegalStateException();
    }

    @Override // I1.m
    public final String c() {
        ArrayList arrayList = this.f474m;
        if (arrayList.size() == 1) {
            return ((m) arrayList.get(0)).c();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof l) || !((l) obj).f474m.equals(this.f474m))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f474m.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f474m.iterator();
    }
}
