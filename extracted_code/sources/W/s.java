package W;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes.dex */
public final class s extends AbstractC0126c {

    /* renamed from: q  reason: collision with root package name */
    public RandomAccessFile f2799q;

    /* renamed from: r  reason: collision with root package name */
    public Uri f2800r;

    /* renamed from: s  reason: collision with root package name */
    public long f2801s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2802t;

    @Override // W.h
    public final void close() {
        this.f2800r = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f2799q;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e2) {
                throw new i(e2, 2000);
            }
        } finally {
            this.f2799q = null;
            if (this.f2802t) {
                this.f2802t = false;
                b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r1 != false) goto L32;
     */
    @Override // W.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j(W.l r9) {
        /*
            r8 = this;
            android.net.Uri r0 = r9.f2767a
            long r1 = r9.f2771e
            r8.f2800r = r0
            r8.e()
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 2006(0x7d6, float:2.811E-42)
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            java.lang.String r6 = r0.getPath()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            r6.getClass()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            java.lang.String r7 = "r"
            r5.<init>(r6, r7)     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L54 java.io.FileNotFoundException -> L56
            r8.f2799q = r5
            r5.seek(r1)     // Catch: java.io.IOException -> L30
            long r4 = r9.f2772f     // Catch: java.io.IOException -> L30
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L32
            java.io.RandomAccessFile r0 = r8.f2799q     // Catch: java.io.IOException -> L30
            long r4 = r0.length()     // Catch: java.io.IOException -> L30
            long r4 = r4 - r1
            goto L32
        L30:
            r9 = move-exception
            goto L4c
        L32:
            r8.f2801s = r4     // Catch: java.io.IOException -> L30
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L43
            r0 = 1
            r8.f2802t = r0
            r8.h(r9)
            long r0 = r8.f2801s
            return r0
        L43:
            W.r r9 = new W.r
            r0 = 0
            r1 = 2008(0x7d8, float:2.814E-42)
            r9.<init>(r0, r0, r1)
            throw r9
        L4c:
            W.r r0 = new W.r
            r0.<init>(r9, r3)
            throw r0
        L52:
            r9 = move-exception
            goto L58
        L54:
            r9 = move-exception
            goto L5e
        L56:
            r9 = move-exception
            goto L64
        L58:
            W.r r0 = new W.r
            r0.<init>(r9, r3)
            throw r0
        L5e:
            W.r r0 = new W.r
            r0.<init>(r9, r4)
            throw r0
        L64:
            java.lang.String r1 = r0.getQuery()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L91
            java.lang.String r1 = r0.getFragment()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L91
            W.r r0 = new W.r
            int r1 = U.A.f2405a
            r2 = 21
            if (r1 < r2) goto L8b
            java.lang.Throwable r1 = r9.getCause()
            boolean r1 = W.q.a(r1)
            if (r1 == 0) goto L8b
            goto L8d
        L8b:
            r4 = 2005(0x7d5, float:2.81E-42)
        L8d:
            r0.<init>(r9, r4)
            throw r0
        L91:
            W.r r1 = new W.r
            java.lang.String r2 = r0.getPath()
            java.lang.String r3 = r0.getQuery()
            java.lang.String r0 = r0.getFragment()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path="
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = ",query="
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = ",fragment="
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2 = 1004(0x3ec, float:1.407E-42)
            r1.<init>(r0, r9, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: W.s.j(W.l):long");
    }

    @Override // W.h
    public final Uri o() {
        return this.f2800r;
    }

    @Override // R.InterfaceC0107j
    public final int read(byte[] bArr, int i3, int i4) {
        if (i4 == 0) {
            return 0;
        }
        long j3 = this.f2801s;
        if (j3 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f2799q;
            int i5 = U.A.f2405a;
            int read = randomAccessFile.read(bArr, i3, (int) Math.min(j3, i4));
            if (read > 0) {
                this.f2801s -= read;
                a(read);
            }
            return read;
        } catch (IOException e2) {
            throw new i(e2, 2000);
        }
    }
}
