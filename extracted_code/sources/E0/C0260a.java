package e0;

import W.B;
import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: e0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260a implements W.h {

    /* renamed from: m  reason: collision with root package name */
    public final W.h f5214m;

    /* renamed from: n  reason: collision with root package name */
    public final byte[] f5215n;

    /* renamed from: o  reason: collision with root package name */
    public final byte[] f5216o;

    /* renamed from: p  reason: collision with root package name */
    public CipherInputStream f5217p;

    public C0260a(W.h hVar, byte[] bArr, byte[] bArr2) {
        this.f5214m = hVar;
        this.f5215n = bArr;
        this.f5216o = bArr2;
    }

    @Override // W.h
    public final void close() {
        if (this.f5217p != null) {
            this.f5217p = null;
            this.f5214m.close();
        }
    }

    @Override // W.h
    public final long j(W.l lVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f5215n, "AES"), new IvParameterSpec(this.f5216o));
                W.j jVar = new W.j(this.f5214m, lVar);
                this.f5217p = new CipherInputStream(jVar, cipher);
                jVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // W.h
    public final Uri o() {
        return this.f5214m.o();
    }

    @Override // R.InterfaceC0107j
    public final int read(byte[] bArr, int i3, int i4) {
        this.f5217p.getClass();
        int read = this.f5217p.read(bArr, i3, i4);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // W.h
    public final Map x() {
        return this.f5214m.x();
    }

    @Override // W.h
    public final void y(B b3) {
        b3.getClass();
        this.f5214m.y(b3);
    }
}
