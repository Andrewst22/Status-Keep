package g0;

import D1.I;
import R.H;
import U.AbstractC0123a;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import k0.y;
import k0.z;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public int f5722a;

    /* renamed from: b  reason: collision with root package name */
    public long f5723b;

    /* renamed from: c  reason: collision with root package name */
    public Object f5724c;

    public static byte[] b(byte b3, DataInputStream dataInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b3, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte readByte = dataInputStream.readByte();
            bArr[1] = readByte;
            byteArrayOutputStream.write(readByte);
        }
    }

    public I a(byte[] bArr) {
        boolean z3;
        long j3;
        if (bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        String str = new String(bArr, 0, bArr.length - 2, y.f7686s);
        ArrayList arrayList = (ArrayList) this.f5724c;
        arrayList.add(str);
        int i3 = this.f5722a;
        if (i3 != 1) {
            if (i3 == 2) {
                try {
                    Matcher matcher = z.f7695c.matcher(str);
                    if (matcher.find()) {
                        String group = matcher.group(1);
                        group.getClass();
                        j3 = Long.parseLong(group);
                    } else {
                        j3 = -1;
                    }
                    if (j3 != -1) {
                        this.f5723b = j3;
                    }
                    if (str.isEmpty()) {
                        if (this.f5723b > 0) {
                            this.f5722a = 3;
                            return null;
                        }
                        I j4 = I.j(arrayList);
                        arrayList.clear();
                        this.f5722a = 1;
                        this.f5723b = 0L;
                        return j4;
                    }
                    return null;
                } catch (NumberFormatException e2) {
                    throw H.b(str, e2);
                }
            }
            throw new IllegalStateException();
        } else if (z.f7693a.matcher(str).matches() || z.f7694b.matcher(str).matches()) {
            this.f5722a = 2;
            return null;
        } else {
            return null;
        }
    }
}
