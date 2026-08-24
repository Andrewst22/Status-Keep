package Q0;

import java.util.LinkedHashMap;
import java.util.Locale;
/* loaded from: classes.dex */
public class i implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1550a = 2;

    /* renamed from: b  reason: collision with root package name */
    public int f1551b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1552c;

    /* renamed from: d  reason: collision with root package name */
    public int f1553d;

    /* renamed from: e  reason: collision with root package name */
    public int f1554e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f1555f;

    public i(int i3) {
        if (i3 > 0) {
            this.f1552c = i3;
            this.f1555f = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private final synchronized String f() {
        int i3;
        int i4;
        int i5;
        int i6;
        try {
            i3 = this.f1553d;
            i4 = this.f1554e;
            int i7 = i3 + i4;
            if (i7 != 0) {
                i5 = (i3 * 100) / i7;
            } else {
                i5 = 0;
            }
            Locale locale = Locale.US;
            i6 = this.f1552c;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + i6 + ",hits=" + i3 + ",misses=" + i4 + ",hitRate=" + i5 + "%]";
    }

    @Override // Q0.f
    public int a() {
        return -1;
    }

    @Override // Q0.f
    public int b() {
        return this.f1551b;
    }

    @Override // Q0.f
    public int c() {
        U.t tVar = (U.t) this.f1555f;
        int i3 = this.f1552c;
        if (i3 == 8) {
            return tVar.u();
        }
        if (i3 == 16) {
            return tVar.A();
        }
        int i4 = this.f1553d;
        this.f1553d = i4 + 1;
        if (i4 % 2 == 0) {
            int u3 = tVar.u();
            this.f1554e = u3;
            return (u3 & 240) >> 4;
        }
        return this.f1554e & 15;
    }

    public Object d(Object obj) {
        if (obj != null) {
            synchronized (this) {
                try {
                    Object obj2 = ((LinkedHashMap) this.f1555f).get(obj);
                    if (obj2 != null) {
                        this.f1553d++;
                        return obj2;
                    }
                    this.f1554e++;
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new NullPointerException("key == null");
    }

    public Object e(Object obj, Object obj2) {
        Object put;
        if (obj != null) {
            synchronized (this) {
                try {
                    this.f1551b++;
                    put = ((LinkedHashMap) this.f1555f).put(obj, obj2);
                    if (put != null) {
                        this.f1551b--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            g(this.f1552c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f1551b     // Catch: java.lang.Throwable -> L14
            if (r0 < 0) goto L4f
            java.lang.Object r0 = r2.f1555f     // Catch: java.lang.Throwable -> L14
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            int r0 = r2.f1551b     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L4f
            goto L16
        L14:
            r3 = move-exception
            goto L6e
        L16:
            int r0 = r2.f1551b     // Catch: java.lang.Throwable -> L14
            if (r0 <= r3) goto L4d
            java.lang.Object r0 = r2.f1555f     // Catch: java.lang.Throwable -> L14
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L25
            goto L4d
        L25:
            java.lang.Object r0 = r2.f1555f     // Catch: java.lang.Throwable -> L14
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L14
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L14
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L14
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L14
            r0.getValue()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r2.f1555f     // Catch: java.lang.Throwable -> L14
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L14
            r0.remove(r1)     // Catch: java.lang.Throwable -> L14
            int r0 = r2.f1551b     // Catch: java.lang.Throwable -> L14
            int r0 = r0 + (-1)
            r2.f1551b = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            goto L0
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            return
        L4f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r0.<init>()     // Catch: java.lang.Throwable -> L14
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L14
            r0.append(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L14
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L14
        L6e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.i.g(int):void");
    }

    public synchronized String toString() {
        switch (this.f1550a) {
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return f();
            default:
                return super.toString();
        }
    }

    public i(int i3, int i4, int i5, int i6, int i7, byte[] bArr) {
        this.f1551b = i4;
        this.f1552c = i5;
        this.f1553d = i6;
        this.f1554e = i7;
        this.f1555f = bArr;
    }

    public i(b bVar) {
        U.t tVar = bVar.f1527o;
        this.f1555f = tVar;
        tVar.G(12);
        this.f1552c = tVar.y() & 255;
        this.f1551b = tVar.y();
    }
}
