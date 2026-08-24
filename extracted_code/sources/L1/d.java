package L1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes.dex */
public final class d extends I1.r {

    /* renamed from: b  reason: collision with root package name */
    public static final a f888b = new a(1);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f889a;

    public d() {
        ArrayList arrayList = new ArrayList();
        this.f889a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (K1.g.f753a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // I1.r
    public final Object a(Q1.b bVar) {
        if (bVar.w() == 9) {
            bVar.s();
            return null;
        }
        String u3 = bVar.u();
        synchronized (this) {
            Iterator it = this.f889a.iterator();
            while (it.hasNext()) {
                try {
                    return ((DateFormat) it.next()).parse(u3);
                } catch (ParseException unused) {
                }
            }
            try {
                return M1.a.b(u3, new ParsePosition(0));
            } catch (ParseException e2) {
                throw new RuntimeException(u3, e2);
            }
        }
    }

    @Override // I1.r
    public final void b(Q1.c cVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            if (date == null) {
                cVar.j();
                return;
            }
            cVar.p(((DateFormat) this.f889a.get(0)).format(date));
        }
    }
}
