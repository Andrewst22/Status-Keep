package X;

import R.A;
import R.C0113p;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class f extends Q0.c {

    /* renamed from: o  reason: collision with root package name */
    public C0113p f2932o;

    /* renamed from: p  reason: collision with root package name */
    public final b f2933p = new b();

    /* renamed from: q  reason: collision with root package name */
    public ByteBuffer f2934q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2935r;

    /* renamed from: s  reason: collision with root package name */
    public long f2936s;

    /* renamed from: t  reason: collision with root package name */
    public ByteBuffer f2937t;

    /* renamed from: u  reason: collision with root package name */
    public final int f2938u;

    static {
        A.a("media3.decoder");
    }

    public f(int i3) {
        this.f2938u = i3;
    }

    public void e() {
        this.f1529n = 0;
        ByteBuffer byteBuffer = this.f2934q;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f2937t;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f2935r = false;
    }

    public final ByteBuffer f(int i3) {
        int capacity;
        int i4 = this.f2938u;
        if (i4 == 1) {
            return ByteBuffer.allocate(i3);
        }
        if (i4 == 2) {
            return ByteBuffer.allocateDirect(i3);
        }
        ByteBuffer byteBuffer = this.f2934q;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i3 + ")");
    }

    public final void h(int i3) {
        ByteBuffer byteBuffer = this.f2934q;
        if (byteBuffer == null) {
            this.f2934q = f(i3);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i4 = i3 + position;
        if (capacity >= i4) {
            this.f2934q = byteBuffer;
            return;
        }
        ByteBuffer f3 = f(i4);
        f3.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            f3.put(byteBuffer);
        }
        this.f2934q = f3;
    }

    public final void i() {
        ByteBuffer byteBuffer = this.f2934q;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f2937t;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
