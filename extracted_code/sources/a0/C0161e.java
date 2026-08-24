package a0;

import D1.b0;
import D1.g0;
import R.C0102e;
import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import java.util.Objects;
/* renamed from: a0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161e {

    /* renamed from: c  reason: collision with root package name */
    public static final C0161e f3742c = new C0161e(D1.I.o(C0160d.f3738d));

    /* renamed from: d  reason: collision with root package name */
    public static final b0 f3743d = D1.I.q(2, 5, 6);

    /* renamed from: e  reason: collision with root package name */
    public static final g0 f3744e;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f3745a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    public final int f3746b;

    static {
        B0.b bVar = new B0.b(4);
        bVar.h(5, 6);
        bVar.h(17, 6);
        bVar.h(7, 6);
        bVar.h(30, 10);
        bVar.h(18, 6);
        bVar.h(6, 8);
        bVar.h(8, 8);
        bVar.h(14, 8);
        f3744e = bVar.a();
    }

    public C0161e(b0 b0Var) {
        for (int i3 = 0; i3 < b0Var.f233p; i3++) {
            C0160d c0160d = (C0160d) b0Var.get(i3);
            this.f3745a.put(c0160d.f3739a, c0160d);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f3745a.size(); i5++) {
            i4 = Math.max(i4, ((C0160d) this.f3745a.valueAt(i5)).f3740b);
        }
        this.f3746b = i4;
    }

    public static b0 a(int[] iArr, int i3) {
        D1.F i4 = D1.I.i();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i5 : iArr) {
            i4.a(new C0160d(i5, i3));
        }
        return i4.g();
    }

    public static C0161e b(Context context, C0102e c0102e, C0166j c0166j) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c0102e, c0166j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
        if ("Xiaomi".equals(r3) == false) goto L39;
     */
    /* JADX WARN: Type inference failed for: r8v2, types: [D1.L, D1.C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a0.C0161e c(android.content.Context r5, android.content.Intent r6, R.C0102e r7, a0.C0166j r8) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0161e.c(android.content.Context, android.content.Intent, R.e, a0.j):a0.e");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cf, code lost:
        if (r15 != 5) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair d(R.C0102e r17, R.C0113p r18) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0161e.d(R.e, R.p):android.util.Pair");
    }

    public final boolean e(int i3) {
        SparseArray sparseArray = this.f3745a;
        int i4 = U.A.f2405a;
        if (sparseArray.indexOfKey(i3) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r3 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof a0.C0161e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a0.e r9 = (a0.C0161e) r9
            android.util.SparseArray r1 = r8.f3745a
            android.util.SparseArray r3 = r9.f3745a
            int r4 = U.A.f2405a
            if (r1 != 0) goto L17
            if (r3 != 0) goto L19
            goto L49
        L17:
            if (r3 != 0) goto L1b
        L19:
            r1 = 0
            goto L4a
        L1b:
            int r4 = U.A.f2405a
            r5 = 31
            if (r4 < r5) goto L26
            boolean r1 = U.o.t(r1, r3)
            goto L4a
        L26:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L31
            goto L19
        L31:
            r5 = 0
        L32:
            if (r5 >= r4) goto L49
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 != 0) goto L47
            goto L19
        L47:
            int r5 = r5 + r0
            goto L32
        L49:
            r1 = 1
        L4a:
            if (r1 == 0) goto L53
            int r1 = r8.f3746b
            int r9 = r9.f3746b
            if (r1 != r9) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0161e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i3;
        SparseArray sparseArray = this.f3745a;
        if (U.A.f2405a >= 31) {
            i3 = sparseArray.contentHashCode();
        } else {
            int i4 = 17;
            for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                int keyAt = sparseArray.keyAt(i5);
                i4 = Objects.hashCode(sparseArray.valueAt(i5)) + ((keyAt + (i4 * 31)) * 31);
            }
            i3 = i4;
        }
        return (i3 * 31) + this.f3746b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f3746b + ", audioProfiles=" + this.f3745a + "]";
    }
}
