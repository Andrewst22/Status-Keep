package J2;

import java.nio.charset.Charset;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f495a;

    static {
        Charset forName = Charset.forName("UTF-8");
        D2.i.d(forName, "forName(...)");
        f495a = forName;
        D2.i.d(Charset.forName("UTF-16"), "forName(...)");
        D2.i.d(Charset.forName("UTF-16BE"), "forName(...)");
        D2.i.d(Charset.forName("UTF-16LE"), "forName(...)");
        D2.i.d(Charset.forName("US-ASCII"), "forName(...)");
        D2.i.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
