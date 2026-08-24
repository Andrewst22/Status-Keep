package t2;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import m2.AbstractC0635d;
import n2.AbstractC0664g;
/* renamed from: t2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0827d extends AbstractC0833j {
    public static Object D(List list) {
        D2.i.e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final void E(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, C2.l lVar) {
        D2.i.e(collection, "<this>");
        D2.i.e(charSequence, "separator");
        D2.i.e(charSequence2, "prefix");
        D2.i.e(charSequence3, "postfix");
        D2.i.e(charSequence4, "truncated");
        sb.append(charSequence2);
        int i4 = 0;
        for (Object obj : collection) {
            i4++;
            boolean z3 = true;
            if (i4 > 1) {
                sb.append(charSequence);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            } else if (lVar != null) {
                sb.append((CharSequence) lVar.b(obj));
            } else {
                if (obj != null) {
                    z3 = obj instanceof CharSequence;
                }
                if (z3) {
                    sb.append((CharSequence) obj);
                } else if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                } else {
                    sb.append((CharSequence) obj.toString());
                }
            }
        }
        if (i3 >= 0 && i4 > i3) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String F(Collection collection, String str, String str2, String str3, C2.l lVar, int i3) {
        String str4;
        String str5;
        if ((i3 & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i3 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        D2.i.e(collection, "<this>");
        D2.i.e(str4, "prefix");
        D2.i.e(str5, "postfix");
        StringBuilder sb = new StringBuilder();
        E(collection, sb, str, str4, str5, -1, "...", lVar);
        return sb.toString();
    }

    public static final void G(Iterable iterable, AbstractCollection abstractCollection) {
        D2.i.e(iterable, "<this>");
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static List H(Iterable iterable) {
        ArrayList arrayList;
        Object next;
        D2.i.e(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        C0835l c0835l = C0835l.f9264m;
        if (z3) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return AbstractC0635d.s(next);
            }
            return c0835l;
        }
        if (z3) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            G(iterable, arrayList);
        }
        int size2 = arrayList.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return arrayList;
            }
            return AbstractC0635d.s(arrayList.get(0));
        }
        return c0835l;
    }

    public static Set I(Collection collection) {
        Object next;
        D2.i.e(collection, "<this>");
        C0837n c0837n = C0837n.f9266m;
        int size = collection.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0664g.q(collection.size()));
                G(collection, linkedHashSet);
                return linkedHashSet;
            }
            if (collection instanceof List) {
                next = ((List) collection).get(0);
            } else {
                next = collection.iterator().next();
            }
            Set singleton = Collections.singleton(next);
            D2.i.d(singleton, "singleton(...)");
            return singleton;
        }
        return c0837n;
    }
}
