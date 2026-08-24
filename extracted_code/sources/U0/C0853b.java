package u0;

import R.a0;
import R.b0;
/* renamed from: u0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853b {

    /* renamed from: a  reason: collision with root package name */
    public final C0852a f9308a;

    public C0853b(C0852a c0852a) {
        this.f9308a = c0852a;
    }

    public final void a() {
        try {
            ((C0853b) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(b0.class).newInstance(this.f9308a)).a();
        } catch (Exception e2) {
            int i3 = a0.f1874m;
            if (e2 instanceof a0) {
                throw ((a0) e2);
            }
            throw new Exception(e2);
        }
    }
}
