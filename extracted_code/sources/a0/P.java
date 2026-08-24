package a0;

import a.AbstractC0155a;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class P {

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f3711d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f3712e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a  reason: collision with root package name */
    public ByteBuffer f3713a;

    /* renamed from: b  reason: collision with root package name */
    public int f3714b;

    /* renamed from: c  reason: collision with root package name */
    public int f3715c;

    public static void a(ByteBuffer byteBuffer, long j3, int i3, int i4, boolean z3) {
        byte b3;
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        boolean z4 = false;
        byteBuffer.put((byte) 0);
        if (z3) {
            b3 = 2;
        } else {
            b3 = 0;
        }
        byteBuffer.put(b3);
        byteBuffer.putLong(j3);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i3);
        byteBuffer.putInt(0);
        long j4 = i4;
        if ((j4 >> 8) == 0) {
            z4 = true;
        }
        AbstractC0155a.k(z4, "out of range: %s", j4);
        byteBuffer.put((byte) j4);
    }
}
