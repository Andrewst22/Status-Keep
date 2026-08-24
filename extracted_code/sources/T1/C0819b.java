package t1;

import C2.l;
import D2.g;
import D2.i;
import androidx.window.extensions.layout.WindowLayoutInfo;
import s2.C0808g;
/* renamed from: t1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0819b extends g implements l {
    public C0819b(C0823f c0823f) {
        super(1, c0823f, C0823f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // C2.l
    public final Object b(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        i.e(windowLayoutInfo, "p0");
        ((C0823f) this.f324n).accept(windowLayoutInfo);
        return C0808g.f9229a;
    }
}
