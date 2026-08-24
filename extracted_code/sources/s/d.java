package S;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public interface d {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f2159a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean a();

    void b();

    ByteBuffer c();

    void d();

    boolean e();

    b f(b bVar);

    void flush();

    void g(ByteBuffer byteBuffer);
}
