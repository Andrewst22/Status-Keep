package g;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import w.InterfaceC0886g;
/* loaded from: classes.dex */
public final class e extends g implements InterfaceC0886g {

    /* renamed from: A  reason: collision with root package name */
    public boolean f5678A;

    /* renamed from: B  reason: collision with root package name */
    public b f5679B;

    /* renamed from: C  reason: collision with root package name */
    public android.support.v4.media.session.a f5680C;

    /* renamed from: D  reason: collision with root package name */
    public int f5681D;

    /* renamed from: E  reason: collision with root package name */
    public int f5682E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f5683F;

    /* renamed from: z  reason: collision with root package name */
    public b f5684z;

    public e(b bVar, Resources resources) {
        this.f5692q = 255;
        this.f5694s = -1;
        this.f5681D = -1;
        this.f5682E = -1;
        d(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0276, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static g.e e(android.content.Context r20, android.content.res.Resources r21, android.content.res.XmlResourceParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.e(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):g.e");
    }

    @Override // g.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // g.g
    public final void d(b bVar) {
        this.f5688m = bVar;
        int i3 = this.f5694s;
        if (i3 >= 0) {
            Drawable d3 = bVar.d(i3);
            this.f5690o = d3;
            if (d3 != null) {
                b(d3);
            }
        }
        this.f5691p = null;
        this.f5684z = bVar;
        this.f5679B = bVar;
    }

    public final Drawable f() {
        if (!this.f5678A) {
            super.mutate();
            b bVar = this.f5684z;
            bVar.f5646I = bVar.f5646I.clone();
            bVar.f5647J = bVar.f5647J.clone();
            this.f5678A = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // g.g, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        android.support.v4.media.session.a aVar = this.f5680C;
        if (aVar != null) {
            aVar.W();
            this.f5680C = null;
            c(this.f5681D);
            this.f5681D = -1;
            this.f5682E = -1;
        }
    }

    @Override // g.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f5683F) {
            f();
            b bVar = this.f5679B;
            bVar.f5646I = bVar.f5646I.clone();
            bVar.f5647J = bVar.f5647J.clone();
            this.f5683F = true;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
        if (c(r3) != false) goto L16;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r18) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.onStateChange(int[]):boolean");
    }

    @Override // g.g, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        android.support.v4.media.session.a aVar = this.f5680C;
        if (aVar != null && (visible || z4)) {
            if (z3) {
                aVar.U();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
