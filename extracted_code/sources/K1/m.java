package K1;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
/* loaded from: classes.dex */
public final class m extends AbstractMap implements Serializable {

    /* renamed from: t  reason: collision with root package name */
    public static final i f771t = new i(0);

    /* renamed from: m  reason: collision with root package name */
    public final Comparator f772m;

    /* renamed from: n  reason: collision with root package name */
    public l f773n;

    /* renamed from: o  reason: collision with root package name */
    public int f774o;

    /* renamed from: p  reason: collision with root package name */
    public int f775p;

    /* renamed from: q  reason: collision with root package name */
    public final l f776q;

    /* renamed from: r  reason: collision with root package name */
    public k f777r;

    /* renamed from: s  reason: collision with root package name */
    public k f778s;

    public m() {
        i iVar = f771t;
        this.f774o = 0;
        this.f775p = 0;
        this.f776q = new l();
        this.f772m = iVar;
    }

    public final l a(Object obj, boolean z3) {
        int i3;
        l lVar;
        Comparable comparable;
        l lVar2;
        l lVar3 = this.f773n;
        i iVar = f771t;
        Comparator comparator = this.f772m;
        if (lVar3 != null) {
            if (comparator == iVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = lVar3.f768r;
                if (comparable != null) {
                    i3 = comparable.compareTo(obj2);
                } else {
                    i3 = comparator.compare(obj, obj2);
                }
                if (i3 == 0) {
                    return lVar3;
                }
                if (i3 < 0) {
                    lVar2 = lVar3.f764n;
                } else {
                    lVar2 = lVar3.f765o;
                }
                if (lVar2 == null) {
                    break;
                }
                lVar3 = lVar2;
            }
        } else {
            i3 = 0;
        }
        if (!z3) {
            return null;
        }
        l lVar4 = this.f776q;
        if (lVar3 == null) {
            if (comparator == iVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            lVar = new l(lVar3, obj, lVar4, lVar4.f767q);
            this.f773n = lVar;
        } else {
            lVar = new l(lVar3, obj, lVar4, lVar4.f767q);
            if (i3 < 0) {
                lVar3.f764n = lVar;
            } else {
                lVar3.f765o = lVar;
            }
            b(lVar3, true);
        }
        this.f774o++;
        this.f775p++;
        return lVar;
    }

    public final void b(l lVar, boolean z3) {
        int i3;
        int i4;
        int i5;
        int i6;
        while (lVar != null) {
            l lVar2 = lVar.f764n;
            l lVar3 = lVar.f765o;
            int i7 = 0;
            if (lVar2 != null) {
                i3 = lVar2.f770t;
            } else {
                i3 = 0;
            }
            if (lVar3 != null) {
                i4 = lVar3.f770t;
            } else {
                i4 = 0;
            }
            int i8 = i3 - i4;
            if (i8 == -2) {
                l lVar4 = lVar3.f764n;
                l lVar5 = lVar3.f765o;
                if (lVar5 != null) {
                    i6 = lVar5.f770t;
                } else {
                    i6 = 0;
                }
                if (lVar4 != null) {
                    i7 = lVar4.f770t;
                }
                int i9 = i7 - i6;
                if (i9 != -1 && (i9 != 0 || z3)) {
                    f(lVar3);
                    e(lVar);
                } else {
                    e(lVar);
                }
                if (z3) {
                    return;
                }
            } else if (i8 == 2) {
                l lVar6 = lVar2.f764n;
                l lVar7 = lVar2.f765o;
                if (lVar7 != null) {
                    i5 = lVar7.f770t;
                } else {
                    i5 = 0;
                }
                if (lVar6 != null) {
                    i7 = lVar6.f770t;
                }
                int i10 = i7 - i5;
                if (i10 != 1 && (i10 != 0 || z3)) {
                    e(lVar2);
                    f(lVar);
                } else {
                    f(lVar);
                }
                if (z3) {
                    return;
                }
            } else if (i8 == 0) {
                lVar.f770t = i3 + 1;
                if (z3) {
                    return;
                }
            } else {
                lVar.f770t = Math.max(i3, i4) + 1;
                if (!z3) {
                    return;
                }
            }
            lVar = lVar.f763m;
        }
    }

    public final void c(l lVar, boolean z3) {
        l lVar2;
        l lVar3;
        int i3;
        if (z3) {
            l lVar4 = lVar.f767q;
            lVar4.f766p = lVar.f766p;
            lVar.f766p.f767q = lVar4;
        }
        l lVar5 = lVar.f764n;
        l lVar6 = lVar.f765o;
        l lVar7 = lVar.f763m;
        int i4 = 0;
        if (lVar5 != null && lVar6 != null) {
            if (lVar5.f770t > lVar6.f770t) {
                l lVar8 = lVar5.f765o;
                while (true) {
                    l lVar9 = lVar8;
                    lVar3 = lVar5;
                    lVar5 = lVar9;
                    if (lVar5 == null) {
                        break;
                    }
                    lVar8 = lVar5.f765o;
                }
            } else {
                l lVar10 = lVar6.f764n;
                while (true) {
                    lVar2 = lVar6;
                    lVar6 = lVar10;
                    if (lVar6 == null) {
                        break;
                    }
                    lVar10 = lVar6.f764n;
                }
                lVar3 = lVar2;
            }
            c(lVar3, false);
            l lVar11 = lVar.f764n;
            if (lVar11 != null) {
                i3 = lVar11.f770t;
                lVar3.f764n = lVar11;
                lVar11.f763m = lVar3;
                lVar.f764n = null;
            } else {
                i3 = 0;
            }
            l lVar12 = lVar.f765o;
            if (lVar12 != null) {
                i4 = lVar12.f770t;
                lVar3.f765o = lVar12;
                lVar12.f763m = lVar3;
                lVar.f765o = null;
            }
            lVar3.f770t = Math.max(i3, i4) + 1;
            d(lVar, lVar3);
            return;
        }
        if (lVar5 != null) {
            d(lVar, lVar5);
            lVar.f764n = null;
        } else if (lVar6 != null) {
            d(lVar, lVar6);
            lVar.f765o = null;
        } else {
            d(lVar, null);
        }
        b(lVar7, false);
        this.f774o--;
        this.f775p++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f773n = null;
        this.f774o = 0;
        this.f775p++;
        l lVar = this.f776q;
        lVar.f767q = lVar;
        lVar.f766p = lVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        l lVar = null;
        if (obj != null) {
            try {
                lVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (lVar == null) {
            return false;
        }
        return true;
    }

    public final void d(l lVar, l lVar2) {
        l lVar3 = lVar.f763m;
        lVar.f763m = null;
        if (lVar2 != null) {
            lVar2.f763m = lVar3;
        }
        if (lVar3 != null) {
            if (lVar3.f764n == lVar) {
                lVar3.f764n = lVar2;
                return;
            } else {
                lVar3.f765o = lVar2;
                return;
            }
        }
        this.f773n = lVar2;
    }

    public final void e(l lVar) {
        int i3;
        int i4;
        l lVar2 = lVar.f764n;
        l lVar3 = lVar.f765o;
        l lVar4 = lVar3.f764n;
        l lVar5 = lVar3.f765o;
        lVar.f765o = lVar4;
        if (lVar4 != null) {
            lVar4.f763m = lVar;
        }
        d(lVar, lVar3);
        lVar3.f764n = lVar;
        lVar.f763m = lVar3;
        int i5 = 0;
        if (lVar2 != null) {
            i3 = lVar2.f770t;
        } else {
            i3 = 0;
        }
        if (lVar4 != null) {
            i4 = lVar4.f770t;
        } else {
            i4 = 0;
        }
        int max = Math.max(i3, i4) + 1;
        lVar.f770t = max;
        if (lVar5 != null) {
            i5 = lVar5.f770t;
        }
        lVar3.f770t = Math.max(max, i5) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        k kVar = this.f777r;
        if (kVar == null) {
            k kVar2 = new k(this, 0);
            this.f777r = kVar2;
            return kVar2;
        }
        return kVar;
    }

    public final void f(l lVar) {
        int i3;
        int i4;
        l lVar2 = lVar.f764n;
        l lVar3 = lVar.f765o;
        l lVar4 = lVar2.f764n;
        l lVar5 = lVar2.f765o;
        lVar.f764n = lVar5;
        if (lVar5 != null) {
            lVar5.f763m = lVar;
        }
        d(lVar, lVar2);
        lVar2.f765o = lVar;
        lVar.f763m = lVar2;
        int i5 = 0;
        if (lVar3 != null) {
            i3 = lVar3.f770t;
        } else {
            i3 = 0;
        }
        if (lVar5 != null) {
            i4 = lVar5.f770t;
        } else {
            i4 = 0;
        }
        int max = Math.max(i3, i4) + 1;
        lVar.f770t = max;
        if (lVar4 != null) {
            i5 = lVar4.f770t;
        }
        lVar2.f770t = Math.max(max, i5) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto La
            r1 = 0
            K1.l r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto Lb
        L9:
        La:
            r3 = r0
        Lb:
            if (r3 == 0) goto Lf
            java.lang.Object r0 = r3.f769s
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.m.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        k kVar = this.f778s;
        if (kVar == null) {
            k kVar2 = new k(this, 1);
            this.f778s = kVar2;
            return kVar2;
        }
        return kVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            l a3 = a(obj, true);
            Object obj3 = a3.f769s;
            a3.f769s = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto La
            r1 = 0
            K1.l r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto Lb
        L9:
        La:
            r3 = r0
        Lb:
            if (r3 == 0) goto L11
            r1 = 1
            r2.c(r3, r1)
        L11:
            if (r3 == 0) goto L15
            java.lang.Object r0 = r3.f769s
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.m.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f774o;
    }
}
