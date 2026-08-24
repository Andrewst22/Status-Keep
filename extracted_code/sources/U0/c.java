package U0;

import C1.j;
import U.AbstractC0123a;
import U.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: i  reason: collision with root package name */
    public final int f2512i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2513j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2514k;

    /* renamed from: o  reason: collision with root package name */
    public List f2518o;

    /* renamed from: p  reason: collision with root package name */
    public List f2519p;

    /* renamed from: q  reason: collision with root package name */
    public int f2520q;

    /* renamed from: r  reason: collision with root package name */
    public int f2521r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2522s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2523t;

    /* renamed from: u  reason: collision with root package name */
    public byte f2524u;

    /* renamed from: v  reason: collision with root package name */
    public byte f2525v;
    public boolean x;

    /* renamed from: y  reason: collision with root package name */
    public long f2527y;

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f2510z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A  reason: collision with root package name */
    public static final int[] f2503A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B  reason: collision with root package name */
    public static final int[] f2504B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f2505C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f2506D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E  reason: collision with root package name */
    public static final int[] f2507E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F  reason: collision with root package name */
    public static final int[] f2508F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G  reason: collision with root package name */
    public static final boolean[] f2509G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h  reason: collision with root package name */
    public final t f2511h = new t();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f2516m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public b f2517n = new b(0, 4);

    /* renamed from: w  reason: collision with root package name */
    public int f2526w = 0;

    /* renamed from: l  reason: collision with root package name */
    public final long f2515l = 16000000;

    public c(String str, int i3) {
        int i4;
        if ("application/x-mp4-cea-608".equals(str)) {
            i4 = 2;
        } else {
            i4 = 3;
        }
        this.f2512i = i4;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        AbstractC0123a.A("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f2514k = 0;
                        this.f2513j = 0;
                    } else {
                        this.f2514k = 1;
                        this.f2513j = 1;
                    }
                } else {
                    this.f2514k = 0;
                    this.f2513j = 1;
                }
            } else {
                this.f2514k = 1;
                this.f2513j = 0;
            }
        } else {
            this.f2514k = 0;
            this.f2513j = 0;
        }
        l(0);
        k();
        this.x = true;
        this.f2527y = -9223372036854775807L;
    }

    @Override // U0.i
    public final j f() {
        List list = this.f2518o;
        this.f2519p = list;
        list.getClass();
        return new j(list, 17);
    }

    @Override // U0.i, X.c
    public final void flush() {
        super.flush();
        this.f2518o = null;
        this.f2519p = null;
        l(0);
        this.f2521r = 4;
        this.f2517n.f2502h = 4;
        k();
        this.f2522s = false;
        this.f2523t = false;
        this.f2524u = (byte) 0;
        this.f2525v = (byte) 0;
        this.f2526w = 0;
        this.x = true;
        this.f2527y = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x007e A[SYNTHETIC] */
    @Override // U0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(U0.h r15) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.c.g(U0.h):void");
    }

    @Override // U0.i, X.c
    /* renamed from: h */
    public final T0.c c() {
        T0.c cVar;
        T0.c c3 = super.c();
        if (c3 != null) {
            return c3;
        }
        long j3 = this.f2515l;
        if (j3 != -9223372036854775807L) {
            long j4 = this.f2527y;
            if (j4 != -9223372036854775807L && this.f2577e - j4 >= j3 && (cVar = (T0.c) this.f2574b.pollFirst()) != null) {
                this.f2518o = Collections.emptyList();
                this.f2527y = -9223372036854775807L;
                j f3 = f();
                long j5 = this.f2577e;
                cVar.f2939o = j5;
                cVar.f2304q = f3;
                cVar.f2305r = j5;
                return cVar;
            }
            return null;
        }
        return null;
    }

    @Override // U0.i
    public final boolean i() {
        if (this.f2518o != this.f2519p) {
            return true;
        }
        return false;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f2516m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i3 = 2;
        for (int i4 = 0; i4 < size; i4++) {
            T.b c3 = ((b) arrayList.get(i4)).c(Integer.MIN_VALUE);
            arrayList2.add(c3);
            if (c3 != null) {
                i3 = Math.min(i3, c3.f2271i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            T.b bVar = (T.b) arrayList2.get(i5);
            if (bVar != null) {
                if (bVar.f2271i != i3) {
                    bVar = ((b) arrayList.get(i5)).c(i3);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.f2517n;
        bVar.f2501g = this.f2520q;
        bVar.f2495a.clear();
        bVar.f2496b.clear();
        bVar.f2497c.setLength(0);
        bVar.f2498d = 15;
        bVar.f2499e = 0;
        bVar.f2500f = 0;
        ArrayList arrayList = this.f2516m;
        arrayList.clear();
        arrayList.add(this.f2517n);
    }

    public final void l(int i3) {
        int i4 = this.f2520q;
        if (i4 == i3) {
            return;
        }
        this.f2520q = i3;
        if (i3 == 3) {
            int i5 = 0;
            while (true) {
                ArrayList arrayList = this.f2516m;
                if (i5 < arrayList.size()) {
                    ((b) arrayList.get(i5)).f2501g = i3;
                    i5++;
                } else {
                    return;
                }
            }
        } else {
            k();
            if (i4 == 3 || i3 == 1 || i3 == 0) {
                this.f2518o = Collections.emptyList();
            }
        }
    }

    @Override // U0.i, X.c
    public final void release() {
    }
}
