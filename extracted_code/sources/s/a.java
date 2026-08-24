package S;

import D1.b0;
import U.AbstractC0123a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f2150a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f2151b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer[] f2152c = new ByteBuffer[0];

    /* renamed from: d  reason: collision with root package name */
    public boolean f2153d;

    public a(b0 b0Var) {
        this.f2150a = b0Var;
        b bVar = b.f2154e;
        this.f2153d = false;
    }

    public final b a(b bVar) {
        if (!bVar.equals(b.f2154e)) {
            int i3 = 0;
            while (true) {
                b0 b0Var = this.f2150a;
                if (i3 < b0Var.size()) {
                    d dVar = (d) b0Var.get(i3);
                    b f3 = dVar.f(bVar);
                    if (dVar.a()) {
                        AbstractC0123a.j(!f3.equals(b.f2154e));
                        bVar = f3;
                    }
                    i3++;
                } else {
                    return bVar;
                }
            }
        } else {
            throw new c(bVar);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f2151b;
        arrayList.clear();
        this.f2153d = false;
        int i3 = 0;
        while (true) {
            b0 b0Var = this.f2150a;
            if (i3 >= b0Var.size()) {
                break;
            }
            d dVar = (d) b0Var.get(i3);
            dVar.flush();
            if (dVar.a()) {
                arrayList.add(dVar);
            }
            i3++;
        }
        this.f2152c = new ByteBuffer[arrayList.size()];
        for (int i4 = 0; i4 <= c(); i4++) {
            this.f2152c[i4] = ((d) arrayList.get(i4)).c();
        }
    }

    public final int c() {
        return this.f2152c.length - 1;
    }

    public final boolean d() {
        if (this.f2153d && ((d) this.f2151b.get(c())).e() && !this.f2152c[c()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        return !this.f2151b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        b0 b0Var = this.f2150a;
        if (b0Var.size() != aVar.f2150a.size()) {
            return false;
        }
        for (int i3 = 0; i3 < b0Var.size(); i3++) {
            if (b0Var.get(i3) != aVar.f2150a.get(i3)) {
                return false;
            }
        }
        return true;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z3;
        ByteBuffer byteBuffer2;
        boolean z4;
        for (boolean z5 = true; z5; z5 = z3) {
            z3 = false;
            for (int i3 = 0; i3 <= c(); i3++) {
                if (!this.f2152c[i3].hasRemaining()) {
                    ArrayList arrayList = this.f2151b;
                    d dVar = (d) arrayList.get(i3);
                    if (dVar.e()) {
                        if (!this.f2152c[i3].hasRemaining() && i3 < c()) {
                            ((d) arrayList.get(i3 + 1)).d();
                        }
                    } else {
                        if (i3 > 0) {
                            byteBuffer2 = this.f2152c[i3 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = d.f2159a;
                        }
                        dVar.g(byteBuffer2);
                        this.f2152c[i3] = dVar.c();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.f2152c[i3].hasRemaining()) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        z3 |= z4;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return this.f2150a.hashCode();
    }
}
