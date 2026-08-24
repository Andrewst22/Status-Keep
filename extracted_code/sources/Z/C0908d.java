package z;

import g2.C0276a;
import java.util.ArrayList;
import p.C0727i;
/* renamed from: z.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0908d implements B.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9750a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9751b;

    public /* synthetic */ C0908d(Object obj, int i3) {
        this.f9750a = i3;
        this.f9751b = obj;
    }

    @Override // B.a
    public final void accept(Object obj) {
        switch (this.f9750a) {
            case 0:
                C0909e c0909e = (C0909e) obj;
                if (c0909e == null) {
                    c0909e = new C0909e(-3);
                }
                ((C0276a) this.f9751b).i(c0909e);
                return;
            default:
                C0909e c0909e2 = (C0909e) obj;
                synchronized (AbstractC0910f.f9756c) {
                    try {
                        C0727i c0727i = AbstractC0910f.f9757d;
                        ArrayList arrayList = (ArrayList) c0727i.getOrDefault((String) this.f9751b, null);
                        if (arrayList != null) {
                            c0727i.remove((String) this.f9751b);
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                ((B.a) arrayList.get(i3)).accept(c0909e2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
