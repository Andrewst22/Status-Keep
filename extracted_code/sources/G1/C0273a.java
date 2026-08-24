package g1;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
/* renamed from: g1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f5743a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0275c f5744b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f5745c;

    /* renamed from: d  reason: collision with root package name */
    public final File f5746d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5747e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5748f = false;

    /* renamed from: g  reason: collision with root package name */
    public l0.e[] f5749g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f5750h;

    public C0273a(AssetManager assetManager, Executor executor, InterfaceC0275c interfaceC0275c, String str, File file) {
        this.f5743a = executor;
        this.f5744b = interfaceC0275c;
        this.f5747e = str;
        this.f5746d = file;
        int i3 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i3 >= 24 && i3 <= 34) {
            switch (i3) {
                case 24:
                case 25:
                    bArr = d.f5759h;
                    break;
                case 26:
                    bArr = d.f5758g;
                    break;
                case 27:
                    bArr = d.f5757f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = d.f5756e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = d.f5755d;
                    break;
            }
        }
        this.f5745c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f5744b.i();
            }
            return null;
        }
    }

    public final void b(int i3, Serializable serializable) {
        this.f5743a.execute(new U.h(this, i3, serializable, 1));
    }
}
