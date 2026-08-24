package C;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
/* renamed from: C.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f101a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f102b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f103c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f104d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f105e;

    public C0006g(ViewGroup viewGroup) {
        this.f103c = viewGroup;
    }

    public final boolean a(float f3, float f4, boolean z3) {
        ViewParent e2;
        if (!this.f104d || (e2 = e(0)) == null) {
            return false;
        }
        try {
            return D.a(e2, this.f103c, f3, f4, z3);
        } catch (AbstractMethodError e3) {
            Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedFling", e3);
            return false;
        }
    }

    public final boolean b(float f3, float f4) {
        ViewParent e2;
        if (!this.f104d || (e2 = e(0)) == null) {
            return false;
        }
        try {
            return D.b(e2, this.f103c, f3, f4);
        } catch (AbstractMethodError e3) {
            Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreFling", e3);
            return false;
        }
    }

    public final boolean c(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        ViewParent e2;
        int i6;
        int i7;
        if (!this.f104d || (e2 = e(i5)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f103c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i7 = iArr2[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr == null) {
            if (this.f105e == null) {
                this.f105e = new int[2];
            }
            iArr = this.f105e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (e2 instanceof InterfaceC0007h) {
            ((InterfaceC0007h) e2).e(i3, i4, i5, iArr);
        } else if (i5 == 0) {
            try {
                D.c(e2, viewGroup, i3, i4, iArr);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreScroll", e3);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i6;
            iArr2[1] = iArr2[1] - i7;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return false;
        }
        return true;
    }

    public final boolean d(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        ViewParent e2;
        int i8;
        int i9;
        int[] iArr3;
        if (!this.f104d || (e2 = e(i7)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f103c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i8 = iArr[0];
            i9 = iArr[1];
        } else {
            i8 = 0;
            i9 = 0;
        }
        if (iArr2 == null) {
            if (this.f105e == null) {
                this.f105e = new int[2];
            }
            int[] iArr4 = this.f105e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (e2 instanceof InterfaceC0008i) {
            ((InterfaceC0008i) e2).d(viewGroup, i3, i4, i5, i6, i7, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i5;
            iArr3[1] = iArr3[1] + i6;
            if (e2 instanceof InterfaceC0007h) {
                ((InterfaceC0007h) e2).b(viewGroup, i3, i4, i5, i6, i7);
            } else if (i7 == 0) {
                try {
                    D.d(e2, viewGroup, i3, i4, i5, i6);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedScroll", e3);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i8;
            iArr[1] = iArr[1] - i9;
        }
        return true;
    }

    public final ViewParent e(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                return null;
            }
            return this.f102b;
        }
        return this.f101a;
    }

    public final boolean f(int i3) {
        if (e(i3) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i3, int i4) {
        boolean f3;
        if (f(i4)) {
            return true;
        }
        if (this.f104d) {
            View view = this.f103c;
            ViewParent parent = view.getParent();
            View view2 = view;
            while (parent != null) {
                boolean z3 = parent instanceof InterfaceC0007h;
                if (z3) {
                    f3 = ((InterfaceC0007h) parent).f(view2, view, i3, i4);
                } else {
                    if (i4 == 0) {
                        try {
                            f3 = D.f(parent, view2, view, i3);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    f3 = false;
                }
                if (f3) {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            this.f102b = parent;
                        }
                    } else {
                        this.f101a = parent;
                    }
                    if (z3) {
                        ((InterfaceC0007h) parent).a(view2, view, i3, i4);
                    } else if (i4 == 0) {
                        try {
                            D.e(parent, view2, view, i3);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
                parent = parent.getParent();
                view2 = view2;
            }
        }
        return false;
    }

    public final void h(int i3) {
        ViewParent e2 = e(i3);
        if (e2 != null) {
            boolean z3 = e2 instanceof InterfaceC0007h;
            ViewGroup viewGroup = this.f103c;
            if (z3) {
                ((InterfaceC0007h) e2).c(viewGroup, i3);
            } else if (i3 == 0) {
                try {
                    D.g(e2, viewGroup);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onStopNestedScroll", e3);
                }
            }
            if (i3 != 0) {
                if (i3 == 1) {
                    this.f102b = null;
                    return;
                }
                return;
            }
            this.f101a = null;
        }
    }
}
