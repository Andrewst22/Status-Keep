package L1;

import java.io.IOException;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class i extends Q1.c {

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f898w;
    public String x;

    /* renamed from: y  reason: collision with root package name */
    public I1.m f899y;

    /* renamed from: z  reason: collision with root package name */
    public static final h f897z = new h();

    /* renamed from: A  reason: collision with root package name */
    public static final I1.q f896A = new I1.q("closed");

    public i() {
        super(f897z);
        this.f898w = new ArrayList();
        this.f899y = I1.o.f475m;
    }

    @Override // Q1.c
    public final void b() {
        I1.l lVar = new I1.l();
        t(lVar);
        this.f898w.add(lVar);
    }

    @Override // Q1.c
    public final void c() {
        I1.p pVar = new I1.p();
        t(pVar);
        this.f898w.add(pVar);
    }

    @Override // Q1.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f898w;
        if (arrayList.isEmpty()) {
            arrayList.add(f896A);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // Q1.c
    public final void f() {
        ArrayList arrayList = this.f898w;
        if (!arrayList.isEmpty() && this.x == null) {
            if (s() instanceof I1.l) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // Q1.c
    public final void g() {
        ArrayList arrayList = this.f898w;
        if (!arrayList.isEmpty() && this.x == null) {
            if (s() instanceof I1.p) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // Q1.c
    public final void h(String str) {
        if (str != null) {
            if (!this.f898w.isEmpty() && this.x == null) {
                if (s() instanceof I1.p) {
                    this.x = str;
                    return;
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    @Override // Q1.c
    public final Q1.c j() {
        t(I1.o.f475m);
        return this;
    }

    @Override // Q1.c
    public final void m(long j3) {
        t(new I1.q(Long.valueOf(j3)));
    }

    @Override // Q1.c
    public final void n(Boolean bool) {
        if (bool == null) {
            t(I1.o.f475m);
        } else {
            t(new I1.q(bool));
        }
    }

    @Override // Q1.c
    public final void o(Number number) {
        if (number == null) {
            t(I1.o.f475m);
            return;
        }
        if (!this.f1716q) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        t(new I1.q(number));
    }

    @Override // Q1.c
    public final void p(String str) {
        if (str == null) {
            t(I1.o.f475m);
        } else {
            t(new I1.q(str));
        }
    }

    @Override // Q1.c
    public final void q(boolean z3) {
        t(new I1.q(Boolean.valueOf(z3)));
    }

    public final I1.m s() {
        ArrayList arrayList = this.f898w;
        return (I1.m) arrayList.get(arrayList.size() - 1);
    }

    public final void t(I1.m mVar) {
        if (this.x != null) {
            if (!(mVar instanceof I1.o) || this.f1719t) {
                I1.p pVar = (I1.p) s();
                String str = this.x;
                pVar.getClass();
                pVar.f476m.put(str, mVar);
            }
            this.x = null;
        } else if (this.f898w.isEmpty()) {
            this.f899y = mVar;
        } else {
            I1.m s3 = s();
            if (s3 instanceof I1.l) {
                I1.l lVar = (I1.l) s3;
                lVar.getClass();
                lVar.f474m.add(mVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // Q1.c, java.io.Flushable
    public final void flush() {
    }
}
