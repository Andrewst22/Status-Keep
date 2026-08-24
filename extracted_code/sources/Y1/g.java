package Y1;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class g implements g2.f {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f3435a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3436b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f3437c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i3) {
        this.f3435a = flutterJNI;
        this.f3436b = i3;
    }

    @Override // g2.f
    public final void a(ByteBuffer byteBuffer) {
        if (!this.f3437c.getAndSet(true)) {
            int i3 = this.f3436b;
            FlutterJNI flutterJNI = this.f3435a;
            if (byteBuffer == null) {
                flutterJNI.invokePlatformMessageEmptyResponseCallback(i3);
                return;
            } else {
                flutterJNI.invokePlatformMessageResponseCallback(i3, byteBuffer, byteBuffer.position());
                return;
            }
        }
        throw new IllegalStateException("Reply already submitted");
    }
}
