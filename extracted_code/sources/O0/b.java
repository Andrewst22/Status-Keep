package O0;

import C1.j;
import java.util.ArrayDeque;
import w0.l;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1199a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f1200b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final e f1201c = new e();

    /* renamed from: d  reason: collision with root package name */
    public j f1202d;

    /* renamed from: e  reason: collision with root package name */
    public int f1203e;

    /* renamed from: f  reason: collision with root package name */
    public int f1204f;

    /* renamed from: g  reason: collision with root package name */
    public long f1205g;

    public final long a(l lVar, int i3) {
        byte[] bArr = this.f1199a;
        lVar.i(bArr, 0, i3, false);
        long j3 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j3 = (j3 << 8) | (bArr[i4] & 255);
        }
        return j3;
    }
}
