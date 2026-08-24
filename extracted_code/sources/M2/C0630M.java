package m2;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.LinkedHashSet;
import n2.AbstractC0664g;
/* renamed from: m2.M  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0630M extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) {
        String str;
        String[] strArr = {"java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;"};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0664g.q(4));
        for (int i3 = 0; i3 < 4; i3++) {
            linkedHashSet.add(strArr[i3]);
        }
        if (objectStreamClass != null) {
            str = objectStreamClass.getName();
        } else {
            str = null;
        }
        if (str != null && !linkedHashSet.contains(str)) {
            throw new ClassNotFoundException(objectStreamClass.getName());
        }
        return super.resolveClass(objectStreamClass);
    }
}
