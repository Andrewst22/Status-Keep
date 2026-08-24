package t2;

import java.util.Arrays;
import java.util.List;
import m2.AbstractC0635d;
/* renamed from: t2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0828e extends AbstractC0635d {
    public static int B(List list) {
        D2.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static List C(Object... objArr) {
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            D2.i.d(asList, "asList(...)");
            return asList;
        }
        return C0835l.f9264m;
    }
}
