package W;

import R.H;
import U.AbstractC0123a;
import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
/* loaded from: classes.dex */
public final class f extends AbstractC0126c {

    /* renamed from: q  reason: collision with root package name */
    public l f2748q;

    /* renamed from: r  reason: collision with root package name */
    public byte[] f2749r;

    /* renamed from: s  reason: collision with root package name */
    public int f2750s;

    /* renamed from: t  reason: collision with root package name */
    public int f2751t;

    @Override // W.h
    public final void close() {
        if (this.f2749r != null) {
            this.f2749r = null;
            b();
        }
        this.f2748q = null;
    }

    @Override // W.h
    public final long j(l lVar) {
        e();
        this.f2748q = lVar;
        Uri normalizeScheme = lVar.f2767a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        AbstractC0123a.d("Unsupported scheme: " + scheme, equals);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i3 = U.A.f2405a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f2749r = Base64.decode(str, 0);
                } catch (IllegalArgumentException e2) {
                    throw new H(D2.h.l("Error while parsing Base64 encoded string: ", str), e2, true, 0);
                }
            } else {
                this.f2749r = URLDecoder.decode(str, C1.d.f151a.name()).getBytes(C1.d.f153c);
            }
            byte[] bArr = this.f2749r;
            long j3 = lVar.f2771e;
            if (j3 <= bArr.length) {
                int i4 = (int) j3;
                this.f2750s = i4;
                int length = bArr.length - i4;
                this.f2751t = length;
                long j4 = lVar.f2772f;
                int i5 = (j4 > (-1L) ? 1 : (j4 == (-1L) ? 0 : -1));
                if (i5 != 0) {
                    this.f2751t = (int) Math.min(length, j4);
                }
                h(lVar);
                if (i5 == 0) {
                    return this.f2751t;
                }
                return j4;
            }
            this.f2749r = null;
            throw new i(2008);
        }
        throw new H("Unexpected URI format: " + normalizeScheme, null, true, 0);
    }

    @Override // W.h
    public final Uri o() {
        l lVar = this.f2748q;
        if (lVar != null) {
            return lVar.f2767a;
        }
        return null;
    }

    @Override // R.InterfaceC0107j
    public final int read(byte[] bArr, int i3, int i4) {
        if (i4 == 0) {
            return 0;
        }
        int i5 = this.f2751t;
        if (i5 == 0) {
            return -1;
        }
        int min = Math.min(i4, i5);
        byte[] bArr2 = this.f2749r;
        int i6 = U.A.f2405a;
        System.arraycopy(bArr2, this.f2750s, bArr, i3, min);
        this.f2750s += min;
        this.f2751t -= min;
        a(min);
        return min;
    }
}
