package o1;

import C2.l;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class g {
    public static String b(Object obj, String str) {
        D2.i.e(obj, "value");
        return str + " value: " + obj;
    }

    public static i c(String str) {
        String group;
        String str2;
        if (str != null && !J2.i.W(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (group = matcher.group(1)) != null) {
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    int parseInt2 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    if (group3 != null) {
                        int parseInt3 = Integer.parseInt(group3);
                        if (matcher.group(4) != null) {
                            str2 = matcher.group(4);
                        } else {
                            str2 = "";
                        }
                        D2.i.d(str2, "description");
                        return new i(parseInt, parseInt2, parseInt3, str2);
                    }
                }
            }
        }
        return null;
    }

    public abstract Object a();

    public abstract g d(String str, l lVar);
}
