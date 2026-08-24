package g2;

import K.C0059m;
import android.util.Log;
import java.nio.ByteBuffer;
/* renamed from: g2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5779a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5780b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f5781c;

    public /* synthetic */ C0277b(int i3, Object obj, Object obj2) {
        this.f5779a = i3;
        this.f5781c = obj;
        this.f5780b = obj2;
    }

    @Override // g2.f
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f5779a) {
            case 0:
                C0059m c0059m = (C0059m) this.f5781c;
                try {
                    ((d) this.f5780b).o(((n) c0059m.f652o).a(byteBuffer));
                    return;
                } catch (RuntimeException e2) {
                    Log.e("BasicMessageChannel#" + ((String) c0059m.f651n), "Failed to handle message reply", e2);
                    return;
                }
            default:
                r rVar = (r) this.f5781c;
                R1.f fVar = (R1.f) this.f5780b;
                try {
                    if (byteBuffer == null) {
                        fVar.getClass();
                    } else {
                        try {
                            fVar.b(rVar.f5792c.d(byteBuffer));
                        } catch (k e3) {
                            fVar.a(e3.f5784m, e3.getMessage(), e3.f5785n);
                        }
                    }
                    return;
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#" + rVar.f5791b, "Failed to handle method call result", e4);
                    return;
                }
        }
    }
}
