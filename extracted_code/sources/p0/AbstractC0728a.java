package p0;

import R.C0113p;
import U.AbstractC0123a;
import g2.C0276a;
/* renamed from: p0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0728a extends l {

    /* renamed from: w  reason: collision with root package name */
    public final long f8755w;
    public final long x;

    /* renamed from: y  reason: collision with root package name */
    public C0276a f8756y;

    /* renamed from: z  reason: collision with root package name */
    public int[] f8757z;

    public AbstractC0728a(W.h hVar, W.l lVar, C0113p c0113p, int i3, Object obj, long j3, long j4, long j5, long j6, long j7) {
        super(hVar, lVar, c0113p, i3, obj, j3, j4, j7);
        this.f8755w = j5;
        this.x = j6;
    }

    public final int e(int i3) {
        int[] iArr = this.f8757z;
        AbstractC0123a.k(iArr);
        return iArr[i3];
    }
}
