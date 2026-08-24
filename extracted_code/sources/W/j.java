package W;

import U.AbstractC0123a;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class j extends InputStream {

    /* renamed from: m  reason: collision with root package name */
    public final h f2754m;

    /* renamed from: n  reason: collision with root package name */
    public final l f2755n;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2757p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2758q = false;

    /* renamed from: o  reason: collision with root package name */
    public final byte[] f2756o = new byte[1];

    public j(h hVar, l lVar) {
        this.f2754m = hVar;
        this.f2755n = lVar;
    }

    public final void a() {
        if (!this.f2757p) {
            this.f2754m.j(this.f2755n);
            this.f2757p = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f2758q) {
            this.f2754m.close();
            this.f2758q = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f2756o;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i4) {
        AbstractC0123a.j(!this.f2758q);
        a();
        int read = this.f2754m.read(bArr, i3, i4);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
