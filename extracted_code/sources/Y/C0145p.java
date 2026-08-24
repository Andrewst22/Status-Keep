package Y;

import android.util.Base64;
/* renamed from: Y.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0145p implements C1.k {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3376m;

    @Override // C1.k
    public final Object get() {
        switch (this.f3376m) {
            case 0:
                return new C0140k();
            case 1:
                byte[] bArr = new byte[12];
                Z.h.f3493i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    invoke.getClass();
                    return (R.b0) invoke;
                } catch (Exception e2) {
                    throw new IllegalStateException(e2);
                }
        }
    }
}
