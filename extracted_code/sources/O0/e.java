package O0;

import w0.l;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final long[] f1316d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1317a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public int f1318b;

    /* renamed from: c  reason: collision with root package name */
    public int f1319c;

    public static long a(int i3, boolean z3, byte[] bArr) {
        long j3 = bArr[0] & 255;
        if (z3) {
            j3 &= ~f1316d[i3 - 1];
        }
        for (int i4 = 1; i4 < i3; i4++) {
            j3 = (j3 << 8) | (bArr[i4] & 255);
        }
        return j3;
    }

    public static int b(int i3) {
        for (int i4 = 0; i4 < 8; i4++) {
            if ((f1316d[i4] & i3) != 0) {
                return i4 + 1;
            }
        }
        return -1;
    }

    public final long c(l lVar, boolean z3, boolean z4, int i3) {
        int i4 = this.f1318b;
        byte[] bArr = this.f1317a;
        if (i4 == 0) {
            if (!lVar.i(bArr, 0, 1, z3)) {
                return -1L;
            }
            int b3 = b(bArr[0] & 255);
            this.f1319c = b3;
            if (b3 != -1) {
                this.f1318b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i5 = this.f1319c;
        if (i5 > i3) {
            this.f1318b = 0;
            return -2L;
        }
        if (i5 != 1) {
            lVar.i(bArr, 1, i5 - 1, false);
        }
        this.f1318b = 0;
        return a(this.f1319c, z4, bArr);
    }
}
