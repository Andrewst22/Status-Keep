package W;

import D1.g0;
import U.AbstractC0123a;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class p extends AbstractC0126c {

    /* renamed from: A  reason: collision with root package name */
    public long f2788A;

    /* renamed from: B  reason: collision with root package name */
    public long f2789B;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f2790q;

    /* renamed from: r  reason: collision with root package name */
    public final int f2791r;

    /* renamed from: s  reason: collision with root package name */
    public final int f2792s;

    /* renamed from: t  reason: collision with root package name */
    public final String f2793t;

    /* renamed from: u  reason: collision with root package name */
    public final B1.a f2794u;

    /* renamed from: v  reason: collision with root package name */
    public final B1.a f2795v;

    /* renamed from: w  reason: collision with root package name */
    public HttpURLConnection f2796w;
    public InputStream x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2797y;

    /* renamed from: z  reason: collision with root package name */
    public int f2798z;

    public p(String str, int i3, int i4, boolean z3, B1.a aVar) {
        super(true);
        this.f2793t = str;
        this.f2791r = i3;
        this.f2792s = i4;
        this.f2790q = z3;
        this.f2794u = aVar;
        this.f2795v = new B1.a(9);
    }

    public static void s(HttpURLConnection httpURLConnection, long j3) {
        if (httpURLConnection != null && U.A.f2405a <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j3 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j3 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // W.h
    public final void close() {
        try {
            InputStream inputStream = this.x;
            if (inputStream != null) {
                long j3 = this.f2788A;
                long j4 = -1;
                if (j3 != -1) {
                    j4 = j3 - this.f2789B;
                }
                s(this.f2796w, j4);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    int i3 = U.A.f2405a;
                    throw new u(e2, 2000, 3);
                }
            }
        } finally {
            this.x = null;
            k();
            if (this.f2797y) {
                this.f2797y = false;
                b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130 A[Catch: IOException -> 0x013b, TRY_LEAVE, TryCatch #5 {IOException -> 0x013b, blocks: (B:50:0x0128, B:52:0x0130), top: B:110:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
    @Override // W.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j(W.l r24) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W.p.j(W.l):long");
    }

    public final void k() {
        HttpURLConnection httpURLConnection = this.f2796w;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                AbstractC0123a.o("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.f2796w = null;
        }
    }

    public final URL n(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new u(D2.h.l("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f2790q && !protocol.equals(url.getProtocol())) {
                    throw new u("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e2) {
                throw new u(e2, 2001, 1);
            }
        }
        throw new u("Null location redirect", 2001);
    }

    @Override // W.h
    public final Uri o() {
        HttpURLConnection httpURLConnection = this.f2796w;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection q(W.l r25) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W.p.q(W.l):java.net.HttpURLConnection");
    }

    public final HttpURLConnection r(URL url, int i3, byte[] bArr, long j3, long j4, boolean z3, boolean z4, Map map) {
        String sb;
        String str;
        boolean z5;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f2791r);
        httpURLConnection.setReadTimeout(this.f2792s);
        HashMap hashMap = new HashMap();
        B1.a aVar = this.f2794u;
        if (aVar != null) {
            hashMap.putAll(aVar.F());
        }
        hashMap.putAll(this.f2795v.F());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = x.f2805a;
        if (j3 == 0 && j4 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j3);
            sb2.append("-");
            if (j4 != -1) {
                sb2.append((j3 + j4) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        String str3 = this.f2793t;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        if (z3) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z4);
        if (bArr != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        httpURLConnection.setDoOutput(z5);
        int i4 = l.f2766i;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    str2 = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str2 = "POST";
            }
        } else {
            str2 = "GET";
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    @Override // R.InterfaceC0107j
    public final int read(byte[] bArr, int i3, int i4) {
        if (i4 == 0) {
            return 0;
        }
        try {
            long j3 = this.f2788A;
            if (j3 != -1) {
                long j4 = j3 - this.f2789B;
                if (j4 != 0) {
                    i4 = (int) Math.min(i4, j4);
                }
                return -1;
            }
            InputStream inputStream = this.x;
            int i5 = U.A.f2405a;
            int read = inputStream.read(bArr, i3, i4);
            if (read == -1) {
                return -1;
            }
            this.f2789B += read;
            a(read);
            return read;
        } catch (IOException e2) {
            int i6 = U.A.f2405a;
            throw u.b(e2, 2);
        }
    }

    public final void t(long j3) {
        if (j3 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j3 > 0) {
            int min = (int) Math.min(j3, 4096);
            InputStream inputStream = this.x;
            int i3 = U.A.f2405a;
            int read = inputStream.read(bArr, 0, min);
            if (!Thread.currentThread().isInterrupted()) {
                if (read != -1) {
                    j3 -= read;
                    a(read);
                } else {
                    throw new u();
                }
            } else {
                throw new u(new InterruptedIOException(), 2000, 1);
            }
        }
    }

    @Override // W.AbstractC0126c, W.h
    public final Map x() {
        HttpURLConnection httpURLConnection = this.f2796w;
        if (httpURLConnection == null) {
            return g0.f255s;
        }
        return new o(httpURLConnection.getHeaderFields());
    }
}
