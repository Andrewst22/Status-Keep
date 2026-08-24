package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import l1.C0595d;
import l1.C0607p;
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7766a;

    public /* synthetic */ O(int i3) {
        this.f7766a = i3;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f7766a) {
            case 0:
                try {
                    return g.e.e(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e2) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                    return null;
                }
            case 1:
                try {
                    Resources resources = context.getResources();
                    C0595d c0595d = new C0595d(context);
                    c0595d.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return c0595d;
                } catch (Exception e3) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e3);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    C0607p c0607p = new C0607p();
                    c0607p.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return c0607p;
                } catch (Exception e4) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e4);
                    return null;
                }
        }
    }
}
