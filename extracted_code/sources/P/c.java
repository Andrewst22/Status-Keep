package P;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f1374a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1375b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1376c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f1377d;

    public c(byte[] bArr, int i3, int i4) {
        this(-1L, bArr, i3, i4);
    }

    public static c a(long j3, ByteOrder byteOrder) {
        long[] jArr = {j3};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f1386C[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(wrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        e[] eVarArr = {eVar};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f1386C[5]]);
        wrap.order(byteOrder);
        e eVar2 = eVarArr[0];
        wrap.putInt((int) eVar2.f1382a);
        wrap.putInt((int) eVar2.f1383b);
        return new c(wrap.array(), 5, 1);
    }

    public static c c(int i3, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f1386C[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i3}[0]);
        return new c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Serializable g3 = g(byteOrder);
        if (g3 != null) {
            if (g3 instanceof String) {
                return Double.parseDouble((String) g3);
            }
            if (g3 instanceof long[]) {
                long[] jArr = (long[]) g3;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g3 instanceof int[]) {
                int[] iArr = (int[]) g3;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g3 instanceof double[]) {
                double[] dArr = (double[]) g3;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g3 instanceof e[]) {
                e[] eVarArr = (e[]) g3;
                if (eVarArr.length == 1) {
                    e eVar = eVarArr[0];
                    return eVar.f1382a / eVar.f1383b;
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int e(ByteOrder byteOrder) {
        Serializable g3 = g(byteOrder);
        if (g3 != null) {
            if (g3 instanceof String) {
                return Integer.parseInt((String) g3);
            }
            if (g3 instanceof long[]) {
                long[] jArr = (long[]) g3;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g3 instanceof int[]) {
                int[] iArr = (int[]) g3;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String f(ByteOrder byteOrder) {
        Serializable g3 = g(byteOrder);
        if (g3 == null) {
            return null;
        }
        if (g3 instanceof String) {
            return (String) g3;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        if (g3 instanceof long[]) {
            long[] jArr = (long[]) g3;
            while (i3 < jArr.length) {
                sb.append(jArr[i3]);
                i3++;
                if (i3 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (g3 instanceof int[]) {
            int[] iArr = (int[]) g3;
            while (i3 < iArr.length) {
                sb.append(iArr[i3]);
                i3++;
                if (i3 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (g3 instanceof double[]) {
            double[] dArr = (double[]) g3;
            while (i3 < dArr.length) {
                sb.append(dArr[i3]);
                i3++;
                if (i3 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (!(g3 instanceof e[])) {
            return null;
        } else {
            e[] eVarArr = (e[]) g3;
            while (i3 < eVarArr.length) {
                sb.append(eVarArr[i3].f1382a);
                sb.append('/');
                sb.append(eVarArr[i3].f1383b);
                i3++;
                if (i3 != eVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:89|(2:91|(2:92|(2:94|(2:97|98)(1:96))(2:99|100)))|101|(2:103|(6:112|113|114|115|116|117)(3:105|(2:107|108)(2:110|111)|109))|121|114|115|116|117) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0128, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0129, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [P.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [P.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.nio.ByteOrder r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P.c.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        return "(" + g.f1385B[this.f1374a] + ", data length:" + this.f1377d.length + ")";
    }

    public c(long j3, byte[] bArr, int i3, int i4) {
        this.f1374a = i3;
        this.f1375b = i4;
        this.f1376c = j3;
        this.f1377d = bArr;
    }
}
