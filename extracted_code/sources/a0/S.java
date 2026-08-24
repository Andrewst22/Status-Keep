package a0;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class S extends S.e {

    /* renamed from: i  reason: collision with root package name */
    public static final int f3730i = Float.floatToIntBits(Float.NaN);

    public static void m(int i3, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i3 * 4.656612875245797E-10d));
        if (floatToIntBits == f3730i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // S.d
    public final void g(ByteBuffer byteBuffer) {
        ByteBuffer l3;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        int i4 = this.f2160b.f2157c;
        if (i4 != 21) {
            if (i4 != 22) {
                if (i4 != 1342177280) {
                    if (i4 == 1610612736) {
                        l3 = l(i3);
                        while (position < limit) {
                            m((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l3);
                            position += 4;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    l3 = l((i3 / 3) * 4);
                    while (position < limit) {
                        m(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l3);
                        position += 3;
                    }
                }
            } else {
                l3 = l(i3);
                while (position < limit) {
                    m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l3);
                    position += 4;
                }
            }
        } else {
            l3 = l((i3 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l3);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l3.flip();
    }

    @Override // S.e
    public final S.b h(S.b bVar) {
        int i3 = bVar.f2157c;
        if (i3 != 21 && i3 != 1342177280 && i3 != 22 && i3 != 1610612736 && i3 != 4) {
            throw new S.c(bVar);
        }
        if (i3 != 4) {
            return new S.b(bVar.f2155a, bVar.f2156b, 4);
        }
        return S.b.f2154e;
    }
}
