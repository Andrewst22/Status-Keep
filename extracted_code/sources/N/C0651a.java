package n;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* renamed from: n.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651a implements Iterable {

    /* renamed from: m  reason: collision with root package name */
    public C0653c f8325m;

    /* renamed from: n  reason: collision with root package name */
    public C0653c f8326n;

    /* renamed from: o  reason: collision with root package name */
    public final WeakHashMap f8327o = new WeakHashMap();

    /* renamed from: p  reason: collision with root package name */
    public int f8328p = 0;

    /* renamed from: q  reason: collision with root package name */
    public final HashMap f8329q = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((n.C0652b) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof n.C0651a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            n.a r7 = (n.C0651a) r7
            int r1 = r6.f8328p
            int r3 = r7.f8328p
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            n.b r3 = (n.C0652b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            n.b r4 = (n.C0652b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            n.b r7 = (n.C0652b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0651a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (true) {
            C0652b c0652b = (C0652b) it;
            if (c0652b.hasNext()) {
                i3 += ((Map.Entry) c0652b.next()).hashCode();
            } else {
                return i3;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0652b c0652b = new C0652b(this.f8325m, this.f8326n, 0);
        this.f8327o.put(c0652b, Boolean.FALSE);
        return c0652b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0652b c0652b = (C0652b) it;
            if (c0652b.hasNext()) {
                sb.append(((Map.Entry) c0652b.next()).toString());
                if (c0652b.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
