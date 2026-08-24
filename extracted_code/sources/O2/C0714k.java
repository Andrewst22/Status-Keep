package o2;

import g2.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: o2.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714k implements g2.h {

    /* renamed from: a  reason: collision with root package name */
    public g2.i f8702a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f8703b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8704c = false;

    public final void a() {
        if (this.f8702a == null) {
            return;
        }
        ArrayList arrayList = this.f8703b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof AbstractC0712i) {
                g2.i iVar = this.f8702a;
                if (!iVar.f5782a.getAndSet(true)) {
                    B1.e eVar = iVar.f5783b;
                    if (((AtomicReference) eVar.f57o).get() == iVar) {
                        B1.e eVar2 = (B1.e) eVar.f58p;
                        ((g2.g) eVar2.f56n).f((String) eVar2.f57o, null);
                    }
                }
            } else if (next instanceof C0713j) {
                C0713j c0713j = (C0713j) next;
                g2.i iVar2 = this.f8702a;
                c0713j.getClass();
                String str = c0713j.f8701a;
                if (!iVar2.f5782a.get()) {
                    B1.e eVar3 = iVar2.f5783b;
                    if (((AtomicReference) eVar3.f57o).get() == iVar2) {
                        B1.e eVar4 = (B1.e) eVar3.f58p;
                        ((g2.g) eVar4.f56n).f((String) eVar4.f57o, ((x) eVar4.f58p).f("VideoError", str, null));
                    }
                }
            } else {
                this.f8702a.a(next);
            }
        }
        arrayList.clear();
    }

    public final void b(Object obj) {
        if (!this.f8704c) {
            this.f8703b.add(obj);
        }
        a();
    }
}
