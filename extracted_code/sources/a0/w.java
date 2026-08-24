package a0;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class w extends S.e {

    /* renamed from: i  reason: collision with root package name */
    public int[] f3830i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f3831j;

    @Override // S.d
    public final void g(ByteBuffer byteBuffer) {
        int[] iArr = this.f3831j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l3 = l(((limit - position) / this.f2160b.f2158d) * this.f2161c.f2158d);
        while (position < limit) {
            for (int i3 : iArr) {
                l3.putShort(byteBuffer.getShort((i3 * 2) + position));
            }
            position += this.f2160b.f2158d;
        }
        byteBuffer.position(limit);
        l3.flip();
    }

    @Override // S.e
    public final S.b h(S.b bVar) {
        boolean z3;
        boolean z4;
        int[] iArr = this.f3830i;
        if (iArr == null) {
            return S.b.f2154e;
        }
        if (bVar.f2157c == 2) {
            int length = iArr.length;
            int i3 = bVar.f2156b;
            if (i3 != length) {
                z3 = true;
            } else {
                z3 = false;
            }
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 < i3) {
                    if (i5 != i4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z3 |= z4;
                } else {
                    throw new S.c(bVar);
                }
            }
            if (z3) {
                return new S.b(bVar.f2155a, iArr.length, 2);
            }
            return S.b.f2154e;
        }
        throw new S.c(bVar);
    }

    @Override // S.e
    public final void i() {
        this.f3831j = this.f3830i;
    }

    @Override // S.e
    public final void k() {
        this.f3831j = null;
        this.f3830i = null;
    }
}
