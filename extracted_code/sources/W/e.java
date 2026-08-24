package W;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* loaded from: classes.dex */
public final class e extends AbstractC0126c {

    /* renamed from: q  reason: collision with root package name */
    public final ContentResolver f2742q;

    /* renamed from: r  reason: collision with root package name */
    public Uri f2743r;

    /* renamed from: s  reason: collision with root package name */
    public AssetFileDescriptor f2744s;

    /* renamed from: t  reason: collision with root package name */
    public FileInputStream f2745t;

    /* renamed from: u  reason: collision with root package name */
    public long f2746u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2747v;

    public e(Context context) {
        super(false);
        this.f2742q = context.getContentResolver();
    }

    @Override // W.h
    public final void close() {
        this.f2743r = null;
        try {
            try {
                FileInputStream fileInputStream = this.f2745t;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f2745t = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f2744s;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new i(e2, 2000);
                    }
                } finally {
                    this.f2744s = null;
                    if (this.f2747v) {
                        this.f2747v = false;
                        b();
                    }
                }
            } catch (IOException e3) {
                throw new i(e3, 2000);
            }
        } catch (Throwable th) {
            this.f2745t = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f2744s;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f2744s = null;
                    if (this.f2747v) {
                        this.f2747v = false;
                        b();
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new i(e4, 2000);
                }
            } finally {
                this.f2744s = null;
                if (this.f2747v) {
                    this.f2747v = false;
                    b();
                }
            }
        }
    }

    @Override // W.h
    public final long j(l lVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        int i3 = 2000;
        try {
            Uri normalizeScheme = lVar.f2767a.normalizeScheme();
            this.f2743r = normalizeScheme;
            e();
            boolean equals = "content".equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.f2742q;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f2744s = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f2745t = fileInputStream;
                long j3 = lVar.f2771e;
                int i4 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i4 != 0 && j3 > length) {
                    throw new i((Exception) null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j3) - startOffset;
                if (skip == j3) {
                    if (i4 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f2746u = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f2746u = position;
                            if (position < 0) {
                                throw new i((Exception) null, 2008);
                            }
                        }
                    } else {
                        long j4 = length - skip;
                        this.f2746u = j4;
                        if (j4 < 0) {
                            throw new i((Exception) null, 2008);
                        }
                    }
                    long j5 = lVar.f2772f;
                    int i5 = (j5 > (-1L) ? 1 : (j5 == (-1L) ? 0 : -1));
                    if (i5 != 0) {
                        long j6 = this.f2746u;
                        if (j6 == -1) {
                            min = j5;
                        } else {
                            min = Math.min(j6, j5);
                        }
                        this.f2746u = min;
                    }
                    this.f2747v = true;
                    h(lVar);
                    if (i5 == 0) {
                        return this.f2746u;
                    }
                    return j5;
                }
                throw new i((Exception) null, 2008);
            }
            throw new i(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
        } catch (C0127d e2) {
            throw e2;
        } catch (IOException e3) {
            if (e3 instanceof FileNotFoundException) {
                i3 = 2005;
            }
            throw new i(e3, i3);
        }
    }

    @Override // W.h
    public final Uri o() {
        return this.f2743r;
    }

    @Override // R.InterfaceC0107j
    public final int read(byte[] bArr, int i3, int i4) {
        if (i4 == 0) {
            return 0;
        }
        long j3 = this.f2746u;
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
        FileInputStream fileInputStream = this.f2745t;
        int i5 = U.A.f2405a;
        int read = fileInputStream.read(bArr, i3, i4);
        if (read == -1) {
            return -1;
        }
        long j4 = this.f2746u;
        if (j4 != -1) {
            this.f2746u = j4 - read;
        }
        a(read);
        return read;
    }
}
