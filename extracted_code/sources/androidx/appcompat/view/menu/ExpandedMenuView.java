package androidx.appcompat.view.menu;

import B1.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import k.InterfaceC0526h;
import k.MenuItemC0528j;
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0526h, AdapterView.OnItemClickListener {

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f3913m = {16842964, 16843049};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        e n02 = e.n0(context, attributeSet, f3913m, 16842868);
        TypedArray typedArray = (TypedArray) n02.f57o;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(n02.b0(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(n02.b0(1));
        }
        n02.r0();
    }

    @Override // k.InterfaceC0526h
    public final boolean a(MenuItemC0528j menuItemC0528j) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        MenuItemC0528j menuItemC0528j = (MenuItemC0528j) getAdapter().getItem(i3);
        throw null;
    }
}
