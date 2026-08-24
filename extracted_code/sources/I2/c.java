package I2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m2.AbstractC0635d;
import t2.C0835l;
/* loaded from: classes.dex */
public abstract class c extends d {
    public static List Q(b bVar) {
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return C0835l.f9264m;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0635d.s(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
