package O1;

import L1.e;
import java.sql.Date;
import java.sql.Timestamp;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f1325a;

    /* renamed from: b  reason: collision with root package name */
    public static final L1.a f1326b;

    /* renamed from: c  reason: collision with root package name */
    public static final L1.a f1327c;

    /* renamed from: d  reason: collision with root package name */
    public static final L1.a f1328d;

    static {
        boolean z3;
        try {
            Class.forName("java.sql.Date");
            z3 = true;
        } catch (ClassNotFoundException unused) {
            z3 = false;
        }
        f1325a = z3;
        if (z3) {
            new e(Date.class);
            new e(Timestamp.class);
            f1326b = a.f1320c;
            f1327c = a.f1321d;
            f1328d = a.f1322e;
            return;
        }
        f1326b = null;
        f1327c = null;
        f1328d = null;
    }
}
