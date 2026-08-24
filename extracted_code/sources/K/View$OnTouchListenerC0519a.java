package k;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.C;
import l.C0568f;
import l.C0569g;
import l.C0570h;
/* renamed from: k.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnTouchListenerC0519a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final float f7369a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7370b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7371c;

    /* renamed from: d  reason: collision with root package name */
    public final View f7372d;

    /* renamed from: e  reason: collision with root package name */
    public C f7373e;

    /* renamed from: f  reason: collision with root package name */
    public C f7374f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7375g;

    /* renamed from: h  reason: collision with root package name */
    public int f7376h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f7377i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f7378j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ View f7379k;

    public View$OnTouchListenerC0519a(View view) {
        this.f7377i = new int[2];
        this.f7372d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f7369a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f7370b = tapTimeout;
        this.f7371c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        C c3 = this.f7374f;
        View view = this.f7372d;
        if (c3 != null) {
            view.removeCallbacks(c3);
        }
        C c4 = this.f7373e;
        if (c4 != null) {
            view.removeCallbacks(c4);
        }
    }

    public final AbstractC0529k b() {
        C0568f c0568f;
        switch (this.f7378j) {
            case 0:
                AbstractC0520b abstractC0520b = ((ActionMenuItemView) this.f7379k).f3909v;
                if (abstractC0520b == null || (c0568f = ((C0569g) abstractC0520b).f7808a.f7835E) == null) {
                    return null;
                }
                return c0568f.a();
            default:
                C0568f c0568f2 = ((C0570h) this.f7379k).f7814o.f7834D;
                if (c0568f2 == null) {
                    return null;
                }
                return c0568f2.a();
        }
    }

    public final boolean c() {
        AbstractC0529k b3;
        switch (this.f7378j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f7379k;
                InterfaceC0526h interfaceC0526h = actionMenuItemView.f3907t;
                if (interfaceC0526h == null || !interfaceC0526h.a(actionMenuItemView.f3904q) || (b3 = b()) == null || !b3.i()) {
                    return false;
                }
                return true;
            default:
                ((C0570h) this.f7379k).f7814o.j();
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r14 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009f, code lost:
        if (r4 != 3) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.View$OnTouchListenerC0519a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f7375g = false;
        this.f7376h = -1;
        C c3 = this.f7373e;
        if (c3 != null) {
            this.f7372d.removeCallbacks(c3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public View$OnTouchListenerC0519a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f7378j = 0;
        this.f7379k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public View$OnTouchListenerC0519a(C0570h c0570h, C0570h c0570h2) {
        this(c0570h2);
        this.f7378j = 1;
        this.f7379k = c0570h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
