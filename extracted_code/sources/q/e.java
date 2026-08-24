package q;

import n2.AbstractC0664g;
/* loaded from: classes.dex */
public final class e extends AbstractC0664g {
    @Override // n2.AbstractC0664g
    public final boolean a(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f8856b == cVar) {
                    gVar.f8856b = cVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n2.AbstractC0664g
    public final boolean b(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f8855a == obj) {
                    gVar.f8855a = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n2.AbstractC0664g
    public final boolean c(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f8857c == fVar) {
                    gVar.f8857c = fVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n2.AbstractC0664g
    public final void s(f fVar, f fVar2) {
        fVar.f8850b = fVar2;
    }

    @Override // n2.AbstractC0664g
    public final void t(f fVar, Thread thread) {
        fVar.f8849a = thread;
    }
}
