package a0;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class T extends S.e {

    /* renamed from: i  reason: collision with root package name */
    public int f3731i;

    /* renamed from: j  reason: collision with root package name */
    public int f3732j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3733k;

    /* renamed from: l  reason: collision with root package name */
    public int f3734l;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f3735m;

    /* renamed from: n  reason: collision with root package name */
    public int f3736n;

    /* renamed from: o  reason: collision with root package name */
    public long f3737o;

    @Override // S.e, S.d
    public final ByteBuffer c() {
        int i3;
        if (super.e() && (i3 = this.f3736n) > 0) {
            l(i3).put(this.f3735m, 0, this.f3736n).flip();
            this.f3736n = 0;
        }
        return super.c();
    }

    @Override // S.e, S.d
    public final boolean e() {
        if (super.e() && this.f3736n == 0) {
            return true;
        }
        return false;
    }

    @Override // S.d
    public final void g(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        if (i3 == 0) {
            return;
        }
        int min = Math.min(i3, this.f3734l);
        this.f3737o += min / this.f2160b.f2158d;
        this.f3734l -= min;
        byteBuffer.position(position + min);
        if (this.f3734l > 0) {
            return;
        }
        int i4 = i3 - min;
        int length = (this.f3736n + i4) - this.f3735m.length;
        ByteBuffer l3 = l(length);
        int j3 = U.A.j(length, 0, this.f3736n);
        l3.put(this.f3735m, 0, j3);
        int j4 = U.A.j(length - j3, 0, i4);
        byteBuffer.limit(byteBuffer.position() + j4);
        l3.put(byteBuffer);
        byteBuffer.limit(limit);
        int i5 = i4 - j4;
        int i6 = this.f3736n - j3;
        this.f3736n = i6;
        byte[] bArr = this.f3735m;
        System.arraycopy(bArr, j3, bArr, 0, i6);
        byteBuffer.get(this.f3735m, this.f3736n, i5);
        this.f3736n += i5;
        l3.flip();
    }

    @Override // S.e
    public final S.b h(S.b bVar) {
        if (bVar.f2157c == 2) {
            this.f3733k = true;
            if (this.f3731i == 0 && this.f3732j == 0) {
                return S.b.f2154e;
            }
            return bVar;
        }
        throw new S.c(bVar);
    }

    @Override // S.e
    public final void i() {
        if (this.f3733k) {
            this.f3733k = false;
            int i3 = this.f3732j;
            int i4 = this.f2160b.f2158d;
            this.f3735m = new byte[i3 * i4];
            this.f3734l = this.f3731i * i4;
        }
        this.f3736n = 0;
    }

    @Override // S.e
    public final void j() {
        int i3;
        if (this.f3733k) {
            if (this.f3736n > 0) {
                this.f3737o += i3 / this.f2160b.f2158d;
            }
            this.f3736n = 0;
        }
    }

    @Override // S.e
    public final void k() {
        this.f3735m = U.A.f2410f;
    }
}
