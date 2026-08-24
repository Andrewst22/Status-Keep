package O1;

import I1.r;
import Q1.c;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes.dex */
public final class a extends r {

    /* renamed from: c  reason: collision with root package name */
    public static final L1.a f1320c = new L1.a(4);

    /* renamed from: d  reason: collision with root package name */
    public static final L1.a f1321d = new L1.a(5);

    /* renamed from: e  reason: collision with root package name */
    public static final L1.a f1322e = new L1.a(6);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1323a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1324b;

    public a(int i3) {
        this.f1323a = i3;
        switch (i3) {
            case 1:
                this.f1324b = new SimpleDateFormat("hh:mm:ss a");
                return;
            default:
                this.f1324b = new SimpleDateFormat("MMM d, yyyy");
                return;
        }
    }

    private final Object c(Q1.b bVar) {
        synchronized (this) {
            if (bVar.w() == 9) {
                bVar.s();
                return null;
            }
            try {
                return new Time(((SimpleDateFormat) this.f1324b).parse(bVar.u()).getTime());
            } catch (ParseException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    private final void d(c cVar, Object obj) {
        String format;
        Time time = (Time) obj;
        synchronized (this) {
            if (time == null) {
                format = null;
            } else {
                format = ((SimpleDateFormat) this.f1324b).format((Date) time);
            }
            cVar.p(format);
        }
    }

    @Override // I1.r
    public final Object a(Q1.b bVar) {
        switch (this.f1323a) {
            case 0:
                synchronized (this) {
                    if (bVar.w() == 9) {
                        bVar.s();
                        return null;
                    }
                    try {
                        return new java.sql.Date(((SimpleDateFormat) this.f1324b).parse(bVar.u()).getTime());
                    } catch (ParseException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            case 1:
                return c(bVar);
            default:
                Date date = (Date) ((r) this.f1324b).a(bVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
        }
    }

    @Override // I1.r
    public final void b(c cVar, Object obj) {
        String format;
        switch (this.f1323a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                synchronized (this) {
                    if (date == null) {
                        format = null;
                    } else {
                        format = ((SimpleDateFormat) this.f1324b).format((Date) date);
                    }
                    cVar.p(format);
                }
                return;
            case 1:
                d(cVar, obj);
                return;
            default:
                ((r) this.f1324b).b(cVar, (Timestamp) obj);
                return;
        }
    }

    public a(r rVar) {
        this.f1323a = 2;
        this.f1324b = rVar;
    }
}
