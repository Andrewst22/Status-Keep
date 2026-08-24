package f2;

import K.C0059m;
import a.AbstractC0155a;
import g2.y;
import java.util.TreeSet;
import k0.C0553h;
import k0.C0554i;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f5559a;

    /* renamed from: b  reason: collision with root package name */
    public int f5560b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5561c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f5562d;

    public c(Y1.b bVar) {
        C0059m c0059m = new C0059m(bVar, "flutter/lifecycle", y.f5798b, (B1.b) null);
        this.f5559a = 0;
        this.f5560b = 0;
        this.f5561c = true;
        this.f5562d = c0059m;
    }

    public static int b(int i3, int i4) {
        int min;
        int i5 = i3 - i4;
        if (Math.abs(i5) > 1000 && (min = (Math.min(i3, i4) - Math.max(i3, i4)) + 65535) < 1000) {
            if (i3 >= i4) {
                return -min;
            }
            return min;
        }
        return i5;
    }

    public synchronized void a(C0554i c0554i) {
        this.f5559a = c0554i.f7602a.f7598c;
        ((TreeSet) this.f5562d).add(c0554i);
    }

    public synchronized void c(C0553h c0553h, long j3) {
        if (((TreeSet) this.f5562d).size() < 5000) {
            int i3 = c0553h.f7598c;
            if (!this.f5561c) {
                e();
                this.f5560b = AbstractC0155a.C(i3 - 1);
                this.f5561c = true;
                a(new C0554i(c0553h, j3));
                return;
            } else if (Math.abs(b(i3, C0553h.a(this.f5559a))) < 1000) {
                if (b(i3, this.f5560b) > 0) {
                    a(new C0554i(c0553h, j3));
                    return;
                }
                return;
            } else {
                this.f5560b = AbstractC0155a.C(i3 - 1);
                ((TreeSet) this.f5562d).clear();
                a(new C0554i(c0553h, j3));
                return;
            }
        }
        throw new IllegalStateException("Queue size limit of 5000 reached.");
    }

    public synchronized C0553h d(long j3) {
        if (((TreeSet) this.f5562d).isEmpty()) {
            return null;
        }
        C0554i c0554i = (C0554i) ((TreeSet) this.f5562d).first();
        int i3 = c0554i.f7602a.f7598c;
        if (i3 != C0553h.a(this.f5560b) && j3 < c0554i.f7603b) {
            return null;
        }
        ((TreeSet) this.f5562d).pollFirst();
        this.f5560b = i3;
        return c0554i.f7602a;
    }

    public synchronized void e() {
        ((TreeSet) this.f5562d).clear();
        this.f5561c = false;
        this.f5560b = -1;
        this.f5559a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(int r5, boolean r6) {
        /*
            r4 = this;
            int r0 = r4.f5559a
            if (r0 != r5) goto L9
            boolean r1 = r4.f5561c
            if (r6 != r1) goto L9
            return
        L9:
            if (r5 != 0) goto L10
            if (r0 != 0) goto L10
            r4.f5561c = r6
            return
        L10:
            int r0 = N.j.b(r5)
            if (r0 == 0) goto L29
            r1 = 1
            r2 = 3
            r3 = 2
            if (r0 == r1) goto L24
            if (r0 == r3) goto L29
            if (r0 == r2) goto L29
            r1 = 4
            if (r0 == r1) goto L29
            r0 = 0
            goto L2a
        L24:
            if (r6 == 0) goto L27
            r2 = 2
        L27:
            r0 = r2
            goto L2a
        L29:
            r0 = r5
        L2a:
            r4.f5559a = r5
            r4.f5561c = r6
            int r5 = r4.f5560b
            if (r0 != r5) goto L33
            return
        L33:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "AppLifecycleState."
            r5.<init>(r6)
            r6 = 1
            if (r0 == r6) goto L57
            r6 = 2
            if (r0 == r6) goto L54
            r6 = 3
            if (r0 == r6) goto L51
            r6 = 4
            if (r0 == r6) goto L4e
            r6 = 5
            if (r0 != r6) goto L4c
            java.lang.String r6 = "PAUSED"
            goto L59
        L4c:
            r5 = 0
            throw r5
        L4e:
            java.lang.String r6 = "HIDDEN"
            goto L59
        L51:
            java.lang.String r6 = "INACTIVE"
            goto L59
        L54:
            java.lang.String r6 = "RESUMED"
            goto L59
        L57:
            java.lang.String r6 = "DETACHED"
        L59:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r6 = r4.f5562d
            K.m r6 = (K.C0059m) r6
            r1 = 0
            r6.n(r5, r1)
            r4.f5560b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.c.f(int, boolean):void");
    }

    public c() {
        this.f5562d = new TreeSet(new U0.d(4));
        e();
    }
}
