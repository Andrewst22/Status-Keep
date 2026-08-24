package g1;

import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final e0.l f5752a = new e0.l(7);

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5753b = {112, 114, 111, 0};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f5754c = {112, 114, 109, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f5755d = {48, 49, 53, 0};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f5756e = {48, 49, 48, 0};

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f5757f = {48, 48, 57, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f5758g = {48, 48, 53, 0};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f5759h = {48, 48, 49, 0};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f5760i = {48, 48, 49, 0};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f5761j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(l0.e[] eVarArr, byte[] bArr) {
        int i3 = 0;
        for (l0.e eVar : eVarArr) {
            i3 += ((((eVar.f8011i * 2) + 7) & (-8)) / 8) + (eVar.f8008f * 2) + d((String) eVar.f8004b, (String) eVar.f8005c, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + eVar.f8010h;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, f5757f)) {
            for (l0.e eVar2 : eVarArr) {
                p(byteArrayOutputStream, eVar2, d((String) eVar2.f8004b, (String) eVar2.f8005c, bArr));
                r(byteArrayOutputStream, eVar2);
                int[] iArr = (int[]) eVar2.f8006d;
                int length = iArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = iArr[i4];
                    u(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                q(byteArrayOutputStream, eVar2);
            }
        } else {
            for (l0.e eVar3 : eVarArr) {
                p(byteArrayOutputStream, eVar3, d((String) eVar3.f8004b, (String) eVar3.f8005c, bArr));
            }
            for (l0.e eVar4 : eVarArr) {
                r(byteArrayOutputStream, eVar4);
                int[] iArr2 = (int[]) eVar4.f8006d;
                int length2 = iArr2.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length2) {
                    int i9 = iArr2[i7];
                    u(byteArrayOutputStream, i9 - i8);
                    i7++;
                    i8 = i9;
                }
                q(byteArrayOutputStream, eVar4);
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z3 = true;
            for (File file2 : listFiles) {
                if (c(file2) && z3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            return z3;
        }
        file.delete();
        return true;
    }

    public static String d(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = f5759h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f5758g;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (!str2.contains("!") && !str2.contains(":")) {
                if (str2.endsWith(".apk")) {
                    return str2;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    str3 = ":";
                }
                sb.append(str3);
                sb.append(str2);
                return sb.toString();
            } else if ("!".equals(obj)) {
                return str2.replace(":", "!");
            } else {
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
                return str2;
            }
        }
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i3) {
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int read = inputStream.read(bArr, i4, i3 - i4);
            if (read >= 0) {
                i4 += read;
            } else {
                throw new IllegalStateException(D2.h.k("Not enough bytes to read: ", i3));
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += (int) m(byteArrayInputStream, 2);
            iArr[i5] = i4;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = 0
            r5 = 0
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.d.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static l0.e[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, l0.e[] eVarArr) {
        byte[] bArr3 = f5760i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(f5755d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m3 = (int) m(fileInputStream, 1);
                    byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
                        try {
                            l0.e[] j3 = j(byteArrayInputStream, m3, eVarArr);
                            byteArrayInputStream.close();
                            return j3;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, f5761j)) {
            int m4 = (int) m(fileInputStream, 2);
            byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h4);
                try {
                    l0.e[] k3 = k(byteArrayInputStream2, bArr2, m4, eVarArr);
                    byteArrayInputStream2.close();
                    return k3;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
    }

    public static l0.e[] j(ByteArrayInputStream byteArrayInputStream, int i3, l0.e[] eVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new l0.e[0];
        }
        if (i3 == eVarArr.length) {
            String[] strArr = new String[i3];
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                int m3 = (int) m(byteArrayInputStream, 2);
                iArr[i4] = (int) m(byteArrayInputStream, 2);
                strArr[i4] = new String(f(byteArrayInputStream, m3), StandardCharsets.UTF_8);
            }
            for (int i5 = 0; i5 < i3; i5++) {
                l0.e eVar = eVarArr[i5];
                if (((String) eVar.f8005c).equals(strArr[i5])) {
                    int i6 = iArr[i5];
                    eVar.f8008f = i6;
                    eVar.f8006d = g(byteArrayInputStream, i6);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return eVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static l0.e[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, l0.e[] eVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new l0.e[0];
        }
        if (i3 == eVarArr.length) {
            for (int i4 = 0; i4 < i3; i4++) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m3 = m(byteArrayInputStream, 4);
                int m4 = (int) m(byteArrayInputStream, 2);
                l0.e eVar = null;
                if (eVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i5 = 0;
                    while (true) {
                        if (i5 >= eVarArr.length) {
                            break;
                        } else if (((String) eVarArr[i5].f8005c).equals(str)) {
                            eVar = eVarArr[i5];
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                if (eVar != null) {
                    eVar.f8012j = m3;
                    int[] g3 = g(byteArrayInputStream, m4);
                    if (Arrays.equals(bArr, f5759h)) {
                        eVar.f8008f = m4;
                        eVar.f8006d = g3;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return eVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static l0.e[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f5756e)) {
            int m3 = (int) m(fileInputStream, 1);
            byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
                try {
                    l0.e[] n3 = n(byteArrayInputStream, str, m3);
                    byteArrayInputStream.close();
                    return n3;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static long m(InputStream inputStream, int i3) {
        byte[] f3 = f(inputStream, i3);
        long j3 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j3 += (f3[i4] & 255) << (i4 * 8);
        }
        return j3;
    }

    public static l0.e[] n(ByteArrayInputStream byteArrayInputStream, String str, int i3) {
        TreeMap treeMap;
        int i4;
        if (byteArrayInputStream.available() == 0) {
            return new l0.e[0];
        }
        l0.e[] eVarArr = new l0.e[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            int m3 = (int) m(byteArrayInputStream, 2);
            eVarArr[i5] = new l0.e(str, new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m3, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m3], new TreeMap());
        }
        for (int i6 = 0; i6 < i3; i6++) {
            l0.e eVar = eVarArr[i6];
            int available = byteArrayInputStream.available() - eVar.f8010h;
            int i7 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = (TreeMap) eVar.f8007e;
                if (available2 <= available) {
                    break;
                }
                i7 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i7), 1);
                for (int m4 = (int) m(byteArrayInputStream, 2); m4 > 0; m4--) {
                    m(byteArrayInputStream, 2);
                    int m5 = (int) m(byteArrayInputStream, 1);
                    if (m5 != 6 && m5 != 7) {
                        while (m5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m6 = (int) m(byteArrayInputStream, 1); m6 > 0; m6--) {
                                m(byteArrayInputStream, 2);
                            }
                            m5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                eVar.f8006d = g(byteArrayInputStream, eVar.f8008f);
                int i8 = eVar.f8011i;
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
                for (int i9 = 0; i9 < i8; i9++) {
                    if (valueOf.get(i9)) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    if (valueOf.get(i9 + i8)) {
                        i4 |= 4;
                    }
                    if (i4 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i9));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i9), Integer.valueOf(i4 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return eVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, l0.e[] eVarArr) {
        long j3;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f5755d;
        int i3 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                u(byteArrayOutputStream2, eVarArr.length);
                int i4 = 2;
                int i5 = 2;
                for (l0.e eVar : eVarArr) {
                    t(byteArrayOutputStream2, eVar.f8009g, 4);
                    t(byteArrayOutputStream2, eVar.f8012j, 4);
                    t(byteArrayOutputStream2, eVar.f8011i, 4);
                    String d3 = d((String) eVar.f8004b, (String) eVar.f8005c, bArr2);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d3.getBytes(charset).length;
                    u(byteArrayOutputStream2, length2);
                    i5 = i5 + 14 + length2;
                    byteArrayOutputStream2.write(d3.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i5 == byteArray.length) {
                    l lVar = new l(1, false, byteArray);
                    byteArrayOutputStream2.close();
                    arrayList2.add(lVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < eVarArr.length) {
                        try {
                            l0.e eVar2 = eVarArr[i6];
                            u(byteArrayOutputStream3, i6);
                            u(byteArrayOutputStream3, eVar2.f8008f);
                            i7 = i7 + 4 + (eVar2.f8008f * 2);
                            int[] iArr = (int[]) eVar2.f8006d;
                            int length3 = iArr.length;
                            int i8 = 0;
                            while (i3 < length3) {
                                int i9 = iArr[i3];
                                u(byteArrayOutputStream3, i9 - i8);
                                i3++;
                                i8 = i9;
                            }
                            i6++;
                            i3 = 0;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i7 == byteArray2.length) {
                        l lVar2 = new l(3, true, byteArray2);
                        byteArrayOutputStream3.close();
                        arrayList2.add(lVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < eVarArr.length) {
                            try {
                                l0.e eVar3 = eVarArr[i10];
                                int i12 = 0;
                                for (Map.Entry entry : ((TreeMap) eVar3.f8007e).entrySet()) {
                                    i12 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                q(byteArrayOutputStream4, eVar3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                r(byteArrayOutputStream5, eVar3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                u(byteArrayOutputStream3, i10);
                                int length4 = byteArray3.length + i4 + byteArray4.length;
                                int i13 = i11 + 6;
                                ArrayList arrayList4 = arrayList3;
                                t(byteArrayOutputStream3, length4, 4);
                                u(byteArrayOutputStream3, i12);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i11 = i13 + length4;
                                i10++;
                                arrayList3 = arrayList4;
                                i4 = 2;
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i11 == byteArray5.length) {
                            l lVar3 = new l(4, true, byteArray5);
                            byteArrayOutputStream3.close();
                            arrayList2.add(lVar3);
                            long j4 = 4;
                            long size = j4 + j4 + 4 + (arrayList2.size() * 16);
                            t(byteArrayOutputStream, arrayList2.size(), 4);
                            int i14 = 0;
                            while (i14 < arrayList2.size()) {
                                l lVar4 = (l) arrayList2.get(i14);
                                int i15 = lVar4.f5772a;
                                if (i15 != 1) {
                                    if (i15 != 2) {
                                        if (i15 != 3) {
                                            if (i15 != 4) {
                                                if (i15 == 5) {
                                                    j3 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                j3 = 3;
                                            }
                                        } else {
                                            j3 = 2;
                                        }
                                    } else {
                                        j3 = 1;
                                    }
                                } else {
                                    j3 = 0;
                                }
                                t(byteArrayOutputStream, j3, 4);
                                t(byteArrayOutputStream, size, 4);
                                byte[] bArr3 = lVar4.f5773b;
                                if (lVar4.f5774c) {
                                    long length5 = bArr3.length;
                                    byte[] a3 = a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a3);
                                    t(byteArrayOutputStream, a3.length, 4);
                                    t(byteArrayOutputStream, length5, 4);
                                    length = a3.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    t(byteArrayOutputStream, bArr3.length, 4);
                                    t(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i14++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i16));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        byte[] bArr4 = f5756e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] b3 = b(eVarArr, bArr4);
            t(byteArrayOutputStream, eVarArr.length, 1);
            t(byteArrayOutputStream, b3.length, 4);
            byte[] a4 = a(b3);
            t(byteArrayOutputStream, a4.length, 4);
            byteArrayOutputStream.write(a4);
            return true;
        }
        byte[] bArr5 = f5758g;
        if (Arrays.equals(bArr, bArr5)) {
            t(byteArrayOutputStream, eVarArr.length, 1);
            for (l0.e eVar4 : eVarArr) {
                String d4 = d((String) eVar4.f8004b, (String) eVar4.f8005c, bArr5);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d4.getBytes(charset2).length);
                u(byteArrayOutputStream, ((int[]) eVar4.f8006d).length);
                t(byteArrayOutputStream, ((TreeMap) eVar4.f8007e).size() * 4, 4);
                t(byteArrayOutputStream, eVar4.f8009g, 4);
                byteArrayOutputStream.write(d4.getBytes(charset2));
                for (Integer num : ((TreeMap) eVar4.f8007e).keySet()) {
                    u(byteArrayOutputStream, num.intValue());
                    u(byteArrayOutputStream, 0);
                }
                for (int i17 : (int[]) eVar4.f8006d) {
                    u(byteArrayOutputStream, i17);
                }
            }
            return true;
        }
        byte[] bArr6 = f5757f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] b4 = b(eVarArr, bArr6);
            t(byteArrayOutputStream, eVarArr.length, 1);
            t(byteArrayOutputStream, b4.length, 4);
            byte[] a5 = a(b4);
            t(byteArrayOutputStream, a5.length, 4);
            byteArrayOutputStream.write(a5);
            return true;
        }
        byte[] bArr7 = f5759h;
        if (Arrays.equals(bArr, bArr7)) {
            u(byteArrayOutputStream, eVarArr.length);
            for (l0.e eVar5 : eVarArr) {
                String d5 = d((String) eVar5.f8004b, (String) eVar5.f8005c, bArr7);
                Charset charset3 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d5.getBytes(charset3).length);
                TreeMap treeMap = (TreeMap) eVar5.f8007e;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, ((int[]) eVar5.f8006d).length);
                t(byteArrayOutputStream, eVar5.f8009g, 4);
                byteArrayOutputStream.write(d5.getBytes(charset3));
                for (Integer num2 : treeMap.keySet()) {
                    u(byteArrayOutputStream, num2.intValue());
                }
                for (int i18 : (int[]) eVar5.f8006d) {
                    u(byteArrayOutputStream, i18);
                }
            }
            return true;
        }
        return false;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, l0.e eVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, eVar.f8008f);
        t(byteArrayOutputStream, eVar.f8010h, 4);
        t(byteArrayOutputStream, eVar.f8009g, 4);
        t(byteArrayOutputStream, eVar.f8011i, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, l0.e eVar) {
        byte[] bArr = new byte[(((eVar.f8011i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) eVar.f8007e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i3 = intValue / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i4 = intValue + eVar.f8011i;
                int i5 = i4 / 8;
                bArr[i5] = (byte) ((1 << (i4 % 8)) | bArr[i5]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, l0.e eVar) {
        int i3 = 0;
        for (Map.Entry entry : ((TreeMap) eVar.f8007e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i3);
                u(byteArrayOutputStream, 0);
                i3 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ca, code lost:
        if (r5 == null) goto L175;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0161  */
    /* JADX WARN: Type inference failed for: r14v0, types: [l0.e[], byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(android.content.Context r19, java.util.concurrent.Executor r20, g1.InterfaceC0275c r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.d.s(android.content.Context, java.util.concurrent.Executor, g1.c, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j3, int i3) {
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = (byte) ((j3 >> (i4 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        t(byteArrayOutputStream, i3, 2);
    }
}
