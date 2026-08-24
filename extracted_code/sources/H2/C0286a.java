package h2;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import e0.C0262c;
import g2.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: h2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286a {

    /* renamed from: a  reason: collision with root package name */
    public final B1.a f5941a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f5942b;

    public C0286a(Context context, B1.a aVar) {
        C0262c c0262c = new C0262c(this, 23);
        this.f5942b = context;
        this.f5941a = aVar;
        aVar.f51o = c0262c;
    }

    public static Locale a(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i3 = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = "";
        } else {
            str2 = split[1];
            i3 = 2;
        }
        if (split.length > i3 && split[i3].length() >= 2 && split[i3].length() <= 3) {
            str4 = split[i3];
        }
        return new Locale(str3, str4, str2);
    }

    public final void b(Configuration configuration) {
        LocaleList locales;
        int size;
        Locale locale;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            size = locales.size();
            for (int i3 = 0; i3 < size; i3++) {
                locale = locales.get(i3);
                arrayList.add(locale);
            }
        } else {
            arrayList.add(configuration.locale);
        }
        B1.a aVar = this.f5941a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Locale locale2 = (Locale) it.next();
            locale2.getLanguage();
            locale2.getCountry();
            locale2.getVariant();
            arrayList2.add(locale2.getLanguage());
            arrayList2.add(locale2.getCountry());
            arrayList2.add(locale2.getScript());
            arrayList2.add(locale2.getVariant());
        }
        ((r) aVar.f50n).a("setLocale", arrayList2, null);
    }
}
