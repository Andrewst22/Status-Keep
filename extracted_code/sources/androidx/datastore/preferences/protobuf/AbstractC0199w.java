package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: androidx.datastore.preferences.protobuf.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0199w {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f4313a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f4314b;

    static {
        Charset.forName("US-ASCII");
        f4313a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f4314b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0185h(bArr, 0, 0, false).e(0);
        } catch (C0201y e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static int b(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }
}
