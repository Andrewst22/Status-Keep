package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r extends l {

    /* renamed from: e  reason: collision with root package name */
    r f6801e;

    /* renamed from: f  reason: collision with root package name */
    r f6802f;

    /* renamed from: g  reason: collision with root package name */
    r f6803g;

    /* renamed from: h  reason: collision with root package name */
    r f6804h;

    /* renamed from: i  reason: collision with root package name */
    boolean f6805i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(int i3, Object obj, Object obj2, l lVar, r rVar) {
        super(i3, obj, obj2, lVar);
        this.f6801e = rVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(int i3, Object obj) {
        return b(i3, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r b(int i3, Object obj, Class cls) {
        if (obj != null) {
            r rVar = this;
            do {
                r rVar2 = rVar.f6802f;
                r rVar3 = rVar.f6803g;
                int i4 = rVar.f6780a;
                if (i4 <= i3) {
                    if (i4 >= i3) {
                        Object obj2 = rVar.f6781b;
                        if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                            return rVar;
                        }
                        if (rVar2 != null) {
                            if (rVar3 != null) {
                                if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                                    int i5 = ConcurrentHashMap.f6746g;
                                    int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                    if (compareTo != 0) {
                                        if (compareTo >= 0) {
                                            rVar2 = rVar3;
                                        }
                                    }
                                }
                                r b3 = rVar3.b(i3, obj, cls);
                                if (b3 != null) {
                                    return b3;
                                }
                            }
                        }
                    }
                    rVar = rVar3;
                    continue;
                }
                rVar = rVar2;
                continue;
            } while (rVar != null);
            return null;
        }
        return null;
    }
}
