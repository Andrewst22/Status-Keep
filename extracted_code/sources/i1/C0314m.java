package i1;

import android.view.View;
import android.view.ViewGroup;
/* renamed from: i1.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314m extends C0.e {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6045b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0314m(t tVar, int i3) {
        super(tVar);
        this.f6045b = i3;
    }

    @Override // C0.e
    public final int b(View view) {
        switch (this.f6045b) {
            case 0:
                ((t) this.f142a).getClass();
                return view.getRight() + ((u) view.getLayoutParams()).f6059a.right + ((ViewGroup.MarginLayoutParams) ((u) view.getLayoutParams())).rightMargin;
            default:
                ((t) this.f142a).getClass();
                return view.getBottom() + ((u) view.getLayoutParams()).f6059a.bottom + ((ViewGroup.MarginLayoutParams) ((u) view.getLayoutParams())).bottomMargin;
        }
    }

    @Override // C0.e
    public final int c(View view) {
        switch (this.f6045b) {
            case 0:
                ((t) this.f142a).getClass();
                return (view.getLeft() - ((u) view.getLayoutParams()).f6059a.left) - ((ViewGroup.MarginLayoutParams) ((u) view.getLayoutParams())).leftMargin;
            default:
                ((t) this.f142a).getClass();
                return (view.getTop() - ((u) view.getLayoutParams()).f6059a.top) - ((ViewGroup.MarginLayoutParams) ((u) view.getLayoutParams())).topMargin;
        }
    }

    @Override // C0.e
    public final int d() {
        switch (this.f6045b) {
            case 0:
                t tVar = (t) this.f142a;
                return tVar.f6057f - tVar.t();
            default:
                t tVar2 = (t) this.f142a;
                return tVar2.f6058g - tVar2.r();
        }
    }

    @Override // C0.e
    public final int g() {
        switch (this.f6045b) {
            case 0:
                return ((t) this.f142a).s();
            default:
                return ((t) this.f142a).u();
        }
    }

    @Override // C0.e
    public final int h() {
        switch (this.f6045b) {
            case 0:
                t tVar = (t) this.f142a;
                return (tVar.f6057f - tVar.s()) - tVar.t();
            default:
                t tVar2 = (t) this.f142a;
                return (tVar2.f6058g - tVar2.u()) - tVar2.r();
        }
    }
}
