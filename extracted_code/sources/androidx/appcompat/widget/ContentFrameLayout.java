package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import l.InterfaceC0584w;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: m  reason: collision with root package name */
    public TypedValue f3986m;

    /* renamed from: n  reason: collision with root package name */
    public TypedValue f3987n;

    /* renamed from: o  reason: collision with root package name */
    public TypedValue f3988o;

    /* renamed from: p  reason: collision with root package name */
    public TypedValue f3989p;

    /* renamed from: q  reason: collision with root package name */
    public TypedValue f3990q;

    /* renamed from: r  reason: collision with root package name */
    public TypedValue f3991r;

    /* renamed from: s  reason: collision with root package name */
    public final Rect f3992s;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3992s = new Rect();
    }

    public final void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f3990q == null) {
            this.f3990q = new TypedValue();
        }
        return this.f3990q;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f3991r == null) {
            this.f3991r = new TypedValue();
        }
        return this.f3991r;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f3988o == null) {
            this.f3988o = new TypedValue();
        }
        return this.f3988o;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f3989p == null) {
            this.f3989p = new TypedValue();
        }
        return this.f3989p;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f3986m == null) {
            this.f3986m = new TypedValue();
        }
        return this.f3986m;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f3987n == null) {
            this.f3987n = new TypedValue();
        }
        return this.f3987n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0584w interfaceC0584w) {
    }
}
