package W;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: W.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125b extends AbstractC0126c {

    /* renamed from: q  reason: collision with root package name */
    public final AssetManager f2733q;

    /* renamed from: r  reason: collision with root package name */
    public Uri f2734r;

    /* renamed from: s  reason: collision with root package name */
    public InputStream f2735s;

    /* renamed from: t  reason: collision with root package name */
    public long f2736t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2737u;

    public C0125b(Context context) {
        super(false);
        this.f2733q = context.getAssets();
    }

    @Override // W.h
    public final void close() {
        this.f2734r = null;
        try {
            try {
                InputStream inputStream = this.f2735s;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e2) {
                throw new i(e2, 2000);
            }
        } finally {
            this.f2735s = null;
            if (this.f2737u) {
                this.f2737u = false;
                b();
            }
        }
    }

    @Override // W.h
    public final long j(l lVar) {
        int i3;
        try {
            Uri uri = lVar.f2767a;
            long j3 = lVar.f2771e;
            this.f2734r = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            e();
            InputStream open = this.f2733q.open(path, 1);
            this.f2735s = open;
            if (open.skip(j3) >= j3) {
                long j4 = lVar.f2772f;
                if (j4 != -1) {
                    this.f2736t = j4;
                } else {
                    long available = this.f2735s.available();
                    this.f2736t = available;
                    if (available == 2147483647L) {
                        this.f2736t = -1L;
                    }
                }
                this.f2737u = true;
                h(lVar);
                return this.f2736t;
            }
            throw new i((Exception) null, 2008);
        } catch (C0124a e2) {
            throw e2;
        } catch (IOException e3) {
            if (e3 instanceof FileNotFoundException) {
                i3 = 2005;
            } else {
                i3 = 2000;
            }
            throw new i(e3, i3);
        }
    }

    @Override // W.h
    public final Uri o() {
        return this.f2734r;
    }

    @Override // R.InterfaceC0107j
    public final int read(byte[] bArr, int i3, int i4) {
        if (i4 == 0) {
            return 0;
        }
        long j3 = this.f2736t;
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i4 = (int) Math.min(j3, i4);
            } catch (IOException e2) {
                throw new i(e2, 2000);
            }
        }
        InputStream inputStream = this.f2735s;
        int i5 = U.A.f2405a;
        int read = inputStream.read(bArr, i3, i4);
        if (read == -1) {
            return -1;
        }
        long j4 = this.f2736t;
        if (j4 != -1) {
            this.f2736t = j4 - read;
        }
        a(read);
        return read;
    }
}
