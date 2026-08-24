package h0;

import U.AbstractC0123a;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class h extends X.f {

    /* renamed from: v  reason: collision with root package name */
    public long f5844v;

    /* renamed from: w  reason: collision with root package name */
    public int f5845w;
    public int x;

    @Override // X.f
    public final void e() {
        super.e();
        this.f5845w = 0;
    }

    public final boolean j(X.f fVar) {
        ByteBuffer byteBuffer;
        AbstractC0123a.e(!fVar.c(1073741824));
        AbstractC0123a.e(!fVar.c(268435456));
        AbstractC0123a.e(!fVar.c(4));
        if (k()) {
            if (this.f5845w < this.x) {
                ByteBuffer byteBuffer2 = fVar.f2934q;
                if (byteBuffer2 != null && (byteBuffer = this.f2934q) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i3 = this.f5845w;
        this.f5845w = i3 + 1;
        if (i3 == 0) {
            this.f2936s = fVar.f2936s;
            if (fVar.c(1)) {
                this.f1529n = 1;
            }
        }
        ByteBuffer byteBuffer3 = fVar.f2934q;
        if (byteBuffer3 != null) {
            h(byteBuffer3.remaining());
            this.f2934q.put(byteBuffer3);
        }
        this.f5844v = fVar.f2936s;
        return true;
    }

    public final boolean k() {
        if (this.f5845w > 0) {
            return true;
        }
        return false;
    }
}
