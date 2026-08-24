package r1;

import C.F;
import C.H;
import C.I;
import C.J;
import C.S;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.AbstractC0582u;
import o1.C0703b;
import t2.C0824a;
import v1.C0878a;
/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f9033b = 0;

    static {
        new ArrayList(new C0824a(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    public static k a(Activity activity) {
        Rect rect;
        int i3;
        boolean isInMultiWindowMode;
        int i4;
        J f3;
        S b3;
        WindowMetrics currentWindowMetrics;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            currentWindowMetrics = ((WindowManager) AbstractC0582u.f(activity)).getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
            D2.i.d(rect, "wm.currentWindowMetrics.bounds");
        } else if (i5 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                D2.i.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new Rect((Rect) invoke);
            } catch (IllegalAccessException e2) {
                Log.w("n", e2);
                rect = b(activity);
            } catch (NoSuchFieldException e3) {
                Log.w("n", e3);
                rect = b(activity);
            } catch (NoSuchMethodException e4) {
                Log.w("n", e4);
                rect = b(activity);
            } catch (InvocationTargetException e5) {
                Log.w("n", e5);
                rect = b(activity);
            }
        } else if (i5 >= 28) {
            rect = b(activity);
        } else if (i5 >= 24) {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            isInMultiWindowMode = activity.isInMultiWindowMode();
            if (!isInMultiWindowMode) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i4 = resources.getDimensionPixelSize(identifier);
                } else {
                    i4 = 0;
                }
                int i6 = rect.bottom + i4;
                if (i6 == point.y) {
                    rect.bottom = i6;
                } else {
                    int i7 = rect.right + i4;
                    if (i7 == point.x) {
                        rect.right = i7;
                    }
                }
            }
        } else {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            D2.i.d(defaultDisplay2, "defaultDisplay");
            Point point2 = new Point();
            defaultDisplay2.getRealSize(point2);
            Rect rect2 = new Rect();
            int i8 = point2.x;
            if (i8 != 0 && (i3 = point2.y) != 0) {
                rect2.right = i8;
                rect2.bottom = i3;
            } else {
                defaultDisplay2.getRectSize(rect2);
            }
            rect = rect2;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            if (i9 >= 30) {
                b3 = C0878a.f9493a.a(activity);
            } else {
                throw new Exception("Incompatible SDK version");
            }
        } else {
            if (i9 >= 30) {
                f3 = new I();
            } else if (i9 >= 29) {
                f3 = new H();
            } else {
                f3 = new F();
            }
            b3 = f3.b();
            D2.i.d(b3, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new k(new C0703b(rect), b3);
    }

    public static Rect b(Activity activity) {
        boolean isInMultiWindowMode;
        boolean isInMultiWindowMode2;
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        int i3;
        boolean isInMultiWindowMode3;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            isInMultiWindowMode3 = activity.isInMultiWindowMode();
            if (isInMultiWindowMode3) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                D2.i.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                D2.i.c(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException e2) {
            Log.w("n", e2);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e3) {
            Log.w("n", e3);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e4) {
            Log.w("n", e4);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e5) {
            Log.w("n", e5);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        D2.i.d(defaultDisplay, "currentDisplay");
        defaultDisplay.getRealSize(point);
        isInMultiWindowMode = activity.isInMultiWindowMode();
        if (!isInMultiWindowMode) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i3 = resources.getDimensionPixelSize(identifier);
            } else {
                i3 = 0;
            }
            int i4 = rect.bottom + i3;
            if (i4 == point.y) {
                rect.bottom = i4;
            } else {
                int i5 = rect.right + i3;
                if (i5 == point.x) {
                    rect.right = i5;
                } else if (rect.left == i3) {
                    rect.left = 0;
                }
            }
        }
        if (rect.width() < point.x || rect.height() < point.y) {
            isInMultiWindowMode2 = activity.isInMultiWindowMode();
            if (!isInMultiWindowMode2) {
                try {
                    Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                    constructor.setAccessible(true);
                    Object newInstance = constructor.newInstance(null);
                    Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(defaultDisplay, newInstance);
                    Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(newInstance);
                    if (X1.i.n(obj2)) {
                        displayCutout = X1.i.h(obj2);
                    }
                } catch (ClassNotFoundException e6) {
                    Log.w("n", e6);
                } catch (IllegalAccessException e7) {
                    Log.w("n", e7);
                } catch (InstantiationException e8) {
                    Log.w("n", e8);
                } catch (NoSuchFieldException e9) {
                    Log.w("n", e9);
                } catch (NoSuchMethodException e10) {
                    Log.w("n", e10);
                } catch (InvocationTargetException e11) {
                    Log.w("n", e11);
                }
                if (displayCutout != null) {
                    int i6 = rect.left;
                    safeInsetLeft = displayCutout.getSafeInsetLeft();
                    if (i6 == safeInsetLeft) {
                        rect.left = 0;
                    }
                    int i7 = point.x - rect.right;
                    safeInsetRight = displayCutout.getSafeInsetRight();
                    if (i7 == safeInsetRight) {
                        int i8 = rect.right;
                        safeInsetRight2 = displayCutout.getSafeInsetRight();
                        rect.right = safeInsetRight2 + i8;
                    }
                    int i9 = rect.top;
                    safeInsetTop = displayCutout.getSafeInsetTop();
                    if (i9 == safeInsetTop) {
                        rect.top = 0;
                    }
                    int i10 = point.y - rect.bottom;
                    safeInsetBottom = displayCutout.getSafeInsetBottom();
                    if (i10 == safeInsetBottom) {
                        int i11 = rect.bottom;
                        safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                        rect.bottom = safeInsetBottom2 + i11;
                    }
                }
            }
        }
        return rect;
    }
}
