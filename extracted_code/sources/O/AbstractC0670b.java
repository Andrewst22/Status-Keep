package o;

import android.os.LocaleList;
/* renamed from: o.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0670b {
    public static String a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
