package G1;

import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f384a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i3 = 0; i3 < 10; i3++) {
            bArr[i3 + 48] = (byte) i3;
        }
        for (int i4 = 0; i4 < 26; i4++) {
            byte b3 = (byte) (i4 + 10);
            bArr[i4 + 65] = b3;
            bArr[i4 + 97] = b3;
        }
        f384a = bArr;
    }
}
