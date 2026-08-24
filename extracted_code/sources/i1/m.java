package I1;

import L1.t;
import L1.w;
import java.io.IOException;
import java.io.StringWriter;
/* loaded from: classes.dex */
public abstract class m {
    public boolean a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final p b() {
        if (this instanceof p) {
            return (p) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            Q1.c cVar = new Q1.c(stringWriter);
            cVar.f1716q = true;
            t tVar = w.f945a;
            L1.l.d(cVar, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
