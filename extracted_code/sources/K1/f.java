package K1;

import I1.s;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class f implements s, Cloneable {

    /* renamed from: o  reason: collision with root package name */
    public static final f f750o;

    /* renamed from: m  reason: collision with root package name */
    public List f751m;

    /* renamed from: n  reason: collision with root package name */
    public List f752n;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, K1.f] */
    static {
        ?? obj = new Object();
        obj.f751m = Collections.emptyList();
        obj.f752n = Collections.emptyList();
        f750o = obj;
    }

    public static boolean b(Class cls) {
        if (!Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return true;
        }
        return false;
    }

    public final void a(boolean z3) {
        List list;
        if (z3) {
            list = this.f751m;
        } else {
            list = this.f752n;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public final Object clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // I1.s
    public final I1.r create(I1.k kVar, P1.a aVar) {
        boolean z3;
        boolean z4;
        boolean b3 = b(aVar.f1465a);
        if (!b3) {
            a(true);
            z3 = false;
        } else {
            z3 = true;
        }
        if (!b3) {
            a(false);
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z3 && !z4) {
            return null;
        }
        return new e(this, z4, z3, kVar, aVar);
    }
}
