package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import e.AbstractC0259a;
import java.io.IOException;
import k.MenuC0527i;
import l.AbstractC0586y;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class d extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f7354e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class[] f7355f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f7356a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f7357b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f7358c;

    /* renamed from: d  reason: collision with root package name */
    public Object f7359d;

    static {
        Class[] clsArr = {Context.class};
        f7354e = clsArr;
        f7355f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.f7358c = context;
        Object[] objArr = {context};
        this.f7356a = objArr;
        this.f7357b = objArr;
    }

    public static Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v58 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int i3;
        char charAt;
        char charAt2;
        boolean z3;
        ColorStateList colorStateList;
        int resourceId;
        C0514c c0514c = new C0514c(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i3 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType != r4) {
                if (eventType != i3) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z5 && name2.equals(str)) {
                            z5 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            c0514c.f7330b = 0;
                            c0514c.f7331c = 0;
                            c0514c.f7332d = 0;
                            c0514c.f7333e = 0;
                            c0514c.f7334f = r4;
                            c0514c.f7335g = r4;
                        } else if (name2.equals("item")) {
                            if (!c0514c.f7336h) {
                                c0514c.f7336h = r4;
                                c0514c.b(c0514c.f7329a.add(c0514c.f7330b, c0514c.f7337i, c0514c.f7338j, c0514c.f7339k));
                            }
                        } else if (name2.equals("menu")) {
                            z4 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = 1;
                        i3 = 2;
                    }
                } else if (!z5) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    d dVar = c0514c.f7328D;
                    if (equals) {
                        TypedArray obtainStyledAttributes = dVar.f7358c.obtainStyledAttributes(attributeSet, AbstractC0259a.f5203l);
                        c0514c.f7330b = obtainStyledAttributes.getResourceId(r4, 0);
                        c0514c.f7331c = obtainStyledAttributes.getInt(3, 0);
                        c0514c.f7332d = obtainStyledAttributes.getInt(4, 0);
                        c0514c.f7333e = obtainStyledAttributes.getInt(5, 0);
                        c0514c.f7334f = obtainStyledAttributes.getBoolean(2, r4);
                        c0514c.f7335g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = dVar.f7358c;
                        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0259a.f5204m);
                        c0514c.f7337i = obtainStyledAttributes2.getResourceId(2, 0);
                        c0514c.f7338j = (obtainStyledAttributes2.getInt(5, c0514c.f7331c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0514c.f7332d) & 65535);
                        c0514c.f7339k = obtainStyledAttributes2.getText(7);
                        c0514c.f7340l = obtainStyledAttributes2.getText(8);
                        c0514c.f7341m = obtainStyledAttributes2.getResourceId(0, 0);
                        String string = obtainStyledAttributes2.getString(9);
                        if (string == null) {
                            charAt = 0;
                        } else {
                            charAt = string.charAt(0);
                        }
                        c0514c.f7342n = charAt;
                        c0514c.f7343o = obtainStyledAttributes2.getInt(16, 4096);
                        String string2 = obtainStyledAttributes2.getString(10);
                        if (string2 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = string2.charAt(0);
                        }
                        c0514c.f7344p = charAt2;
                        c0514c.f7345q = obtainStyledAttributes2.getInt(20, 4096);
                        if (obtainStyledAttributes2.hasValue(11)) {
                            c0514c.f7346r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            c0514c.f7346r = c0514c.f7333e;
                        }
                        c0514c.f7347s = obtainStyledAttributes2.getBoolean(3, false);
                        c0514c.f7348t = obtainStyledAttributes2.getBoolean(4, c0514c.f7334f);
                        c0514c.f7349u = obtainStyledAttributes2.getBoolean(1, c0514c.f7335g);
                        c0514c.f7350v = obtainStyledAttributes2.getInt(21, -1);
                        c0514c.f7352y = obtainStyledAttributes2.getString(12);
                        c0514c.f7351w = obtainStyledAttributes2.getResourceId(13, 0);
                        c0514c.x = obtainStyledAttributes2.getString(15);
                        String string3 = obtainStyledAttributes2.getString(14);
                        if (string3 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3 && c0514c.f7351w == 0 && c0514c.x == null) {
                            if (c0514c.a(string3, f7355f, dVar.f7357b) != null) {
                                throw new ClassCastException();
                            }
                        } else if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        c0514c.f7353z = obtainStyledAttributes2.getText(17);
                        c0514c.f7325A = obtainStyledAttributes2.getText(22);
                        if (obtainStyledAttributes2.hasValue(19)) {
                            c0514c.f7327C = AbstractC0586y.d(obtainStyledAttributes2.getInt(19, -1), c0514c.f7327C);
                        } else {
                            c0514c.f7327C = null;
                        }
                        if (obtainStyledAttributes2.hasValue(18)) {
                            if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = f.b.b(context, resourceId)) == null) {
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                            }
                            c0514c.f7326B = colorStateList;
                        } else {
                            c0514c.f7326B = null;
                        }
                        obtainStyledAttributes2.recycle();
                        c0514c.f7336h = false;
                    } else {
                        if (name3.equals("menu")) {
                            c0514c.f7336h = true;
                            SubMenu addSubMenu = c0514c.f7329a.addSubMenu(c0514c.f7330b, c0514c.f7337i, c0514c.f7338j, c0514c.f7339k);
                            c0514c.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            str = name3;
                            z5 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = 1;
                        i3 = 2;
                    }
                }
                eventType = xmlResourceParser.next();
                r4 = 1;
                i3 = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i3, Menu menu) {
        if (!(menu instanceof MenuC0527i)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f7358c.getResources().getLayout(i3);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
