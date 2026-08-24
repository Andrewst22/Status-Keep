package r0;

import D1.I;
import R.W;
import U.A;
import U.AbstractC0123a;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;
/* renamed from: r0.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0756i extends W {

    /* renamed from: r  reason: collision with root package name */
    public boolean f8937r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f8938s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f8939t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f8940u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f8941v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8942w;
    public boolean x;

    /* renamed from: y  reason: collision with root package name */
    public final SparseArray f8943y;

    /* renamed from: z  reason: collision with root package name */
    public final SparseBooleanArray f8944z;

    public C0756i(Context context) {
        CaptioningManager captioningManager;
        String locale;
        Point point;
        Display.Mode mode;
        int physicalWidth;
        int physicalHeight;
        String E3;
        String[] split;
        int i3 = A.f2405a;
        if ((i3 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f1841o = 1088;
            Locale locale2 = captioningManager.getLocale();
            if (locale2 != null) {
                if (i3 >= 21) {
                    locale = locale2.toLanguageTag();
                } else {
                    locale = locale2.toString();
                }
                this.f1840n = I.o(locale);
            }
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && A.L(context)) {
            if (i3 < 28) {
                E3 = A.E("sys.display-size");
            } else {
                E3 = A.E("vendor.display-size");
            }
            if (!TextUtils.isEmpty(E3)) {
                try {
                    split = E3.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        a(point.x, point.y);
                        this.f8943y = new SparseArray();
                        this.f8944z = new SparseBooleanArray();
                        b();
                    }
                }
                AbstractC0123a.n("Util", "Invalid display size: " + E3);
            }
            if ("Sony".equals(A.f2407c) && A.f2408d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                a(point.x, point.y);
                this.f8943y = new SparseArray();
                this.f8944z = new SparseBooleanArray();
                b();
            }
        }
        point = new Point();
        if (i3 >= 23) {
            mode = display.getMode();
            physicalWidth = mode.getPhysicalWidth();
            point.x = physicalWidth;
            physicalHeight = mode.getPhysicalHeight();
            point.y = physicalHeight;
        } else {
            display.getRealSize(point);
        }
        a(point.x, point.y);
        this.f8943y = new SparseArray();
        this.f8944z = new SparseBooleanArray();
        b();
    }

    @Override // R.W
    public final W a(int i3, int i4) {
        super.a(i3, i4);
        return this;
    }

    public final void b() {
        this.f8937r = true;
        this.f8938s = true;
        this.f8939t = true;
        this.f8940u = true;
        this.f8941v = true;
        this.f8942w = true;
        this.x = true;
    }

    public C0756i() {
        this.f8943y = new SparseArray();
        this.f8944z = new SparseBooleanArray();
        b();
    }
}
