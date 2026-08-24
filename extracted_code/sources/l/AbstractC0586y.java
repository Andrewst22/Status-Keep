package l;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import w.C0888i;
import w.InterfaceC0887h;
/* renamed from: l.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0586y {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f7958a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f7959b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f7960c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public static final Class f7961d;

    static {
        try {
            f7961d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static boolean a(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!a(drawable2)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        } else if (drawable instanceof InterfaceC0887h) {
            return a(((C0888i) ((InterfaceC0887h) drawable)).f9503r);
        } else {
            if (drawable instanceof C0587z) {
                return a(((C0587z) drawable).f7963m);
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    public static void b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(f7959b);
            } else {
                drawable.setState(f7958a);
            }
            drawable.setState(state);
        }
    }

    public static Rect c(Drawable drawable) {
        Field[] fields;
        char c3;
        Insets opticalInsets;
        int i3;
        int i4;
        int i5;
        int i6;
        if (Build.VERSION.SDK_INT >= 29) {
            opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            i3 = opticalInsets.left;
            rect.left = i3;
            i4 = opticalInsets.right;
            rect.right = i4;
            i5 = opticalInsets.top;
            rect.top = i5;
            i6 = opticalInsets.bottom;
            rect.bottom = i6;
            return rect;
        }
        Class cls = f7961d;
        if (cls != null) {
            try {
                if (drawable instanceof InterfaceC0887h) {
                    drawable = ((C0888i) ((InterfaceC0887h) drawable)).f9503r;
                }
                Object invoke = drawable.getClass().getMethod("getOpticalInsets", null).invoke(drawable, null);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : cls.getFields()) {
                        String name = field.getName();
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        if (c3 != 0) {
                            if (c3 != 1) {
                                if (c3 != 2) {
                                    if (c3 == 3) {
                                        rect2.bottom = field.getInt(invoke);
                                    }
                                } else {
                                    rect2.right = field.getInt(invoke);
                                }
                            } else {
                                rect2.top = field.getInt(invoke);
                            }
                        } else {
                            rect2.left = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f7960c;
    }

    public static PorterDuff.Mode d(int i3, PorterDuff.Mode mode) {
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 9) {
                    switch (i3) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
