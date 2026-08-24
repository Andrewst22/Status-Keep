package io.flutter.plugin.platform;

import android.view.View;
/* loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6208a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6209b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f6210c;

    public /* synthetic */ i(h hVar, int i3, int i4) {
        this.f6208a = i4;
        this.f6210c = hVar;
        this.f6209b = i3;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        switch (this.f6208a) {
            case 0:
                n nVar = (n) this.f6210c;
                int i3 = this.f6209b;
                if (z3) {
                    g2.r rVar = (g2.r) nVar.f6243g.f50n;
                    if (rVar != null) {
                        rVar.a("viewFocused", Integer.valueOf(i3), null);
                        return;
                    }
                    return;
                }
                io.flutter.plugin.editing.i iVar = nVar.f6242f;
                if (iVar != null) {
                    iVar.b(i3);
                    return;
                }
                return;
            default:
                m mVar = (m) this.f6210c;
                int i4 = this.f6209b;
                if (z3) {
                    g2.r rVar2 = (g2.r) mVar.f6226g.f50n;
                    if (rVar2 != null) {
                        rVar2.a("viewFocused", Integer.valueOf(i4), null);
                        return;
                    }
                    return;
                }
                io.flutter.plugin.editing.i iVar2 = mVar.f6225f;
                if (iVar2 != null) {
                    iVar2.b(i4);
                    return;
                }
                return;
        }
    }
}
