package w0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f9637c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f9638a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f9639b = -1;

    public final boolean a(String str) {
        Matcher matcher = f9637c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i3 = U.A.f2405a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f9638a = parseInt;
                    this.f9639b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(R.F f3) {
        int i3 = 0;
        while (true) {
            R.E[] eArr = f3.f1770m;
            if (i3 < eArr.length) {
                R.E e2 = eArr[i3];
                if (e2 instanceof K0.e) {
                    K0.e eVar = (K0.e) e2;
                    if ("iTunSMPB".equals(eVar.f710o) && a(eVar.f711p)) {
                        return;
                    }
                } else if (e2 instanceof K0.k) {
                    K0.k kVar = (K0.k) e2;
                    if ("com.apple.iTunes".equals(kVar.f723n) && "iTunSMPB".equals(kVar.f724o) && a(kVar.f725p)) {
                        return;
                    }
                } else {
                    continue;
                }
                i3++;
            } else {
                return;
            }
        }
    }
}
