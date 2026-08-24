package U;

import androidx.datastore.preferences.protobuf.AbstractC0187j;
import androidx.datastore.preferences.protobuf.AbstractC0197u;
import androidx.datastore.preferences.protobuf.AbstractC0199w;
import androidx.datastore.preferences.protobuf.C0184g;
import androidx.datastore.preferences.protobuf.C0190m;
import androidx.datastore.preferences.protobuf.C0201y;
import androidx.datastore.preferences.protobuf.InterfaceC0198v;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.p0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public int f2454a;

    /* renamed from: b  reason: collision with root package name */
    public int f2455b;

    /* renamed from: c  reason: collision with root package name */
    public int f2456c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2457d;

    public m(AbstractC0187j abstractC0187j) {
        this.f2456c = 0;
        Charset charset = AbstractC0199w.f4313a;
        this.f2457d = abstractC0187j;
        abstractC0187j.f4271b = this;
    }

    public void a(int i3) {
        int[] iArr = (int[]) this.f2457d;
        int i4 = this.f2455b;
        iArr[i4] = i3;
        int i5 = this.f2456c & (i4 + 1);
        this.f2455b = i5;
        int i6 = this.f2454a;
        if (i5 == i6) {
            int length = iArr.length;
            int i7 = length - i6;
            int i8 = length << 1;
            if (i8 >= 0) {
                int[] iArr2 = new int[i8];
                System.arraycopy(iArr, i6, iArr2, 0, i7);
                System.arraycopy((int[]) this.f2457d, 0, iArr2, i7, this.f2454a);
                this.f2457d = iArr2;
                this.f2454a = 0;
                this.f2455b = length;
                this.f2456c = i8 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public int b() {
        int i3 = this.f2456c;
        if (i3 != 0) {
            this.f2454a = i3;
            this.f2456c = 0;
        } else {
            this.f2454a = ((AbstractC0187j) this.f2457d).u();
        }
        int i4 = this.f2454a;
        if (i4 != 0 && i4 != this.f2455b) {
            return i4 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public void c(Object obj, U u3, C0190m c0190m) {
        int i3 = this.f2455b;
        this.f2455b = ((this.f2454a >>> 3) << 3) | 4;
        try {
            u3.d(obj, this, c0190m);
            if (this.f2454a == this.f2455b) {
                return;
            }
            throw new IOException("Failed to parse the message.");
        } finally {
            this.f2455b = i3;
        }
    }

    public void d(Object obj, U u3, C0190m c0190m) {
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        int v3 = abstractC0187j.v();
        if (abstractC0187j.f4270a < 100) {
            int e2 = abstractC0187j.e(v3);
            abstractC0187j.f4270a++;
            u3.d(obj, this, c0190m);
            abstractC0187j.a(0);
            abstractC0187j.f4270a--;
            abstractC0187j.d(e2);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public void e(InterfaceC0198v interfaceC0198v) {
        int u3;
        int i3 = this.f2454a & 7;
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        if (i3 != 0) {
            if (i3 == 2) {
                int b3 = abstractC0187j.b() + abstractC0187j.v();
                do {
                    ((S) interfaceC0198v).add(Boolean.valueOf(abstractC0187j.f()));
                } while (abstractC0187j.b() < b3);
                x(b3);
                return;
            }
            throw C0201y.b();
        }
        do {
            ((S) interfaceC0198v).add(Boolean.valueOf(abstractC0187j.f()));
            if (abstractC0187j.c()) {
                return;
            }
            u3 = abstractC0187j.u();
        } while (u3 == this.f2454a);
        this.f2456c = u3;
    }

    public C0184g f() {
        y(2);
        return ((AbstractC0187j) this.f2457d).g();
    }

    public void g(InterfaceC0198v interfaceC0198v) {
        int u3;
        if ((this.f2454a & 7) == 2) {
            do {
                ((S) interfaceC0198v).add(f());
                AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
                if (abstractC0187j.c()) {
                    return;
                }
                u3 = abstractC0187j.u();
            } while (u3 == this.f2454a);
            this.f2456c = u3;
            return;
        }
        throw C0201y.b();
    }

    public void h(InterfaceC0198v interfaceC0198v) {
        int u3;
        int i3 = this.f2454a & 7;
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        if (i3 != 1) {
            if (i3 == 2) {
                int v3 = abstractC0187j.v();
                if ((v3 & 7) == 0) {
                    int b3 = abstractC0187j.b() + v3;
                    do {
                        ((S) interfaceC0198v).add(Double.valueOf(abstractC0187j.h()));
                    } while (abstractC0187j.b() < b3);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw C0201y.b();
        }
        do {
            ((S) interfaceC0198v).add(Double.valueOf(abstractC0187j.h()));
            if (abstractC0187j.c()) {
                return;
            }
            u3 = abstractC0187j.u();
        } while (u3 == this.f2454a);
        this.f2456c = u3;
    }

    public void i(InterfaceC0198v interfaceC0198v) {
        int u3;
        int i3 = this.f2454a & 7;
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        if (i3 != 0) {
            if (i3 == 2) {
                int b3 = abstractC0187j.b() + abstractC0187j.v();
                do {
                    ((S) interfaceC0198v).add(Integer.valueOf(abstractC0187j.i()));
                } while (abstractC0187j.b() < b3);
                x(b3);
                return;
            }
            throw C0201y.b();
        }
        do {
            ((S) interfaceC0198v).add(Integer.valueOf(abstractC0187j.i()));
            if (abstractC0187j.c()) {
                return;
            }
            u3 = abstractC0187j.u();
        } while (u3 == this.f2454a);
        this.f2456c = u3;
    }

    public Object j(p0 p0Var, Class cls, C0190m c0190m) {
        int ordinal = p0Var.ordinal();
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        switch (ordinal) {
            case 0:
                y(1);
                return Double.valueOf(abstractC0187j.h());
            case 1:
                y(5);
                return Float.valueOf(abstractC0187j.l());
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                y(0);
                return Long.valueOf(abstractC0187j.n());
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                y(0);
                return Long.valueOf(abstractC0187j.w());
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                y(0);
                return Integer.valueOf(abstractC0187j.m());
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                y(1);
                return Long.valueOf(abstractC0187j.k());
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                y(5);
                return Integer.valueOf(abstractC0187j.j());
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                y(0);
                return Boolean.valueOf(abstractC0187j.f());
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                y(2);
                return abstractC0187j.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                y(2);
                U a3 = Q.f4198c.a(cls);
                AbstractC0197u g3 = a3.g();
                d(g3, a3, c0190m);
                a3.h(g3);
                return g3;
            case 11:
                return f();
            case 12:
                y(0);
                return Integer.valueOf(abstractC0187j.v());
            case 13:
                y(0);
                return Integer.valueOf(abstractC0187j.i());
            case 14:
                y(5);
                return Integer.valueOf(abstractC0187j.o());
            case 15:
                y(1);
                return Long.valueOf(abstractC0187j.p());
            case 16:
                y(0);
                return Integer.valueOf(abstractC0187j.q());
            case 17:
                y(0);
                return Long.valueOf(abstractC0187j.r());
        }
    }

    public void k(InterfaceC0198v interfaceC0198v) {
        int u3;
        int i3 = this.f2454a & 7;
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        if (i3 != 2) {
            if (i3 == 5) {
                do {
                    ((S) interfaceC0198v).add(Integer.valueOf(abstractC0187j.j()));
                    if (abstractC0187j.c()) {
                        return;
                    }
                    u3 = abstractC0187j.u();
                } while (u3 == this.f2454a);
                this.f2456c = u3;
                return;
            }
            throw C0201y.b();
        }
        int v3 = abstractC0187j.v();
        if ((v3 & 3) == 0) {
            int b3 = abstractC0187j.b() + v3;
            do {
                ((S) interfaceC0198v).add(Integer.valueOf(abstractC0187j.j()));
            } while (abstractC0187j.b() < b3);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void l(InterfaceC0198v interfaceC0198v) {
        int u3;
        int i3 = this.f2454a & 7;
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        if (i3 != 1) {
            if (i3 == 2) {
                int v3 = abstractC0187j.v();
                if ((v3 & 7) == 0) {
                    int b3 = abstractC0187j.b() + v3;
                    do {
                        ((S) interfaceC0198v).add(Long.valueOf(abstractC0187j.k()));
                    } while (abstractC0187j.b() < b3);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw C0201y.b();
        }
        do {
            ((S) interfaceC0198v).add(Long.valueOf(abstractC0187j.k()));
            if (abstractC0187j.c()) {
                return;
            }
            u3 = abstractC0187j.u();
        } while (u3 == this.f2454a);
        this.f2456c = u3;
    }

    public void m(InterfaceC0198v interfaceC0198v) {
        int u3;
        int i3 = this.f2454a & 7;
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        if (i3 != 2) {
            if (i3 == 5) {
                do {
                    ((S) interfaceC0198v).add(Float.valueOf(abstractC0187j.l()));
                    if (abstractC0187j.c()) {
                        return;
                    }
                    u3 = abstractC0187j.u();
                } while (u3 == this.f2454a);
                this.f2456c = u3;
                return;
            }
            throw C0201y.b();
        }
        int v3 = abstractC0187j.v();
        if ((v3 & 3) == 0) {
            int b3 = abstractC0187j.b() + v3;
            do {
                ((S) interfaceC0198v).add(Float.valueOf(abstractC0187j.l()));
            } while (abstractC0187j.b() < b3);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void n(InterfaceC0198v interfaceC0198v) {
        int u3;
        int i3 = this.f2454a & 7;
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        if (i3 != 0) {
            if (i3 == 2) {
                int b3 = abstractC0187j.b() + abstractC0187j.v();
                do {
                    ((S) interfaceC0198v).add(Integer.valueOf(abstractC0187j.m()));
                } while (abstractC0187j.b() < b3);
                x(b3);
                return;
            }
            throw C0201y.b();
        }
        do {
            ((S) interfaceC0198v).add(Integer.valueOf(abstractC0187j.m()));
            if (abstractC0187j.c()) {
                return;
            }
            u3 = abstractC0187j.u();
        } while (u3 == this.f2454a);
        this.f2456c = u3;
    }

    public void o(InterfaceC0198v interfaceC0198v) {
        int u3;
        int i3 = this.f2454a & 7;
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        if (i3 != 0) {
            if (i3 == 2) {
                int b3 = abstractC0187j.b() + abstractC0187j.v();
                do {
                    ((S) interfaceC0198v).add(Long.valueOf(abstractC0187j.n()));
                } while (abstractC0187j.b() < b3);
                x(b3);
                return;
            }
            throw C0201y.b();
        }
        do {
            ((S) interfaceC0198v).add(Long.valueOf(abstractC0187j.n()));
            if (abstractC0187j.c()) {
                return;
            }
            u3 = abstractC0187j.u();
        } while (u3 == this.f2454a);
        this.f2456c = u3;
    }

    public void p(InterfaceC0198v interfaceC0198v) {
        int u3;
        int i3 = this.f2454a & 7;
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        if (i3 != 2) {
            if (i3 == 5) {
                do {
                    ((S) interfaceC0198v).add(Integer.valueOf(abstractC0187j.o()));
                    if (abstractC0187j.c()) {
                        return;
                    }
                    u3 = abstractC0187j.u();
                } while (u3 == this.f2454a);
                this.f2456c = u3;
                return;
            }
            throw C0201y.b();
        }
        int v3 = abstractC0187j.v();
        if ((v3 & 3) == 0) {
            int b3 = abstractC0187j.b() + v3;
            do {
                ((S) interfaceC0198v).add(Integer.valueOf(abstractC0187j.o()));
            } while (abstractC0187j.b() < b3);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public void q(InterfaceC0198v interfaceC0198v) {
        int u3;
        int i3 = this.f2454a & 7;
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        if (i3 != 1) {
            if (i3 == 2) {
                int v3 = abstractC0187j.v();
                if ((v3 & 7) == 0) {
                    int b3 = abstractC0187j.b() + v3;
                    do {
                        ((S) interfaceC0198v).add(Long.valueOf(abstractC0187j.p()));
                    } while (abstractC0187j.b() < b3);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw C0201y.b();
        }
        do {
            ((S) interfaceC0198v).add(Long.valueOf(abstractC0187j.p()));
            if (abstractC0187j.c()) {
                return;
            }
            u3 = abstractC0187j.u();
        } while (u3 == this.f2454a);
        this.f2456c = u3;
    }

    public void r(InterfaceC0198v interfaceC0198v) {
        int u3;
        int i3 = this.f2454a & 7;
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        if (i3 != 0) {
            if (i3 == 2) {
                int b3 = abstractC0187j.b() + abstractC0187j.v();
                do {
                    ((S) interfaceC0198v).add(Integer.valueOf(abstractC0187j.q()));
                } while (abstractC0187j.b() < b3);
                x(b3);
                return;
            }
            throw C0201y.b();
        }
        do {
            ((S) interfaceC0198v).add(Integer.valueOf(abstractC0187j.q()));
            if (abstractC0187j.c()) {
                return;
            }
            u3 = abstractC0187j.u();
        } while (u3 == this.f2454a);
        this.f2456c = u3;
    }

    public void s(InterfaceC0198v interfaceC0198v) {
        int u3;
        int i3 = this.f2454a & 7;
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        if (i3 != 0) {
            if (i3 == 2) {
                int b3 = abstractC0187j.b() + abstractC0187j.v();
                do {
                    ((S) interfaceC0198v).add(Long.valueOf(abstractC0187j.r()));
                } while (abstractC0187j.b() < b3);
                x(b3);
                return;
            }
            throw C0201y.b();
        }
        do {
            ((S) interfaceC0198v).add(Long.valueOf(abstractC0187j.r()));
            if (abstractC0187j.c()) {
                return;
            }
            u3 = abstractC0187j.u();
        } while (u3 == this.f2454a);
        this.f2456c = u3;
    }

    public void t(InterfaceC0198v interfaceC0198v, boolean z3) {
        String s3;
        int u3;
        if ((this.f2454a & 7) == 2) {
            do {
                AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
                if (z3) {
                    y(2);
                    s3 = abstractC0187j.t();
                } else {
                    y(2);
                    s3 = abstractC0187j.s();
                }
                ((S) interfaceC0198v).add(s3);
                if (abstractC0187j.c()) {
                    return;
                }
                u3 = abstractC0187j.u();
            } while (u3 == this.f2454a);
            this.f2456c = u3;
            return;
        }
        throw C0201y.b();
    }

    public void u(InterfaceC0198v interfaceC0198v) {
        int u3;
        int i3 = this.f2454a & 7;
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        if (i3 != 0) {
            if (i3 == 2) {
                int b3 = abstractC0187j.b() + abstractC0187j.v();
                do {
                    ((S) interfaceC0198v).add(Integer.valueOf(abstractC0187j.v()));
                } while (abstractC0187j.b() < b3);
                x(b3);
                return;
            }
            throw C0201y.b();
        }
        do {
            ((S) interfaceC0198v).add(Integer.valueOf(abstractC0187j.v()));
            if (abstractC0187j.c()) {
                return;
            }
            u3 = abstractC0187j.u();
        } while (u3 == this.f2454a);
        this.f2456c = u3;
    }

    public void v(InterfaceC0198v interfaceC0198v) {
        int u3;
        int i3 = this.f2454a & 7;
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        if (i3 != 0) {
            if (i3 == 2) {
                int b3 = abstractC0187j.b() + abstractC0187j.v();
                do {
                    ((S) interfaceC0198v).add(Long.valueOf(abstractC0187j.w()));
                } while (abstractC0187j.b() < b3);
                x(b3);
                return;
            }
            throw C0201y.b();
        }
        do {
            ((S) interfaceC0198v).add(Long.valueOf(abstractC0187j.w()));
            if (abstractC0187j.c()) {
                return;
            }
            u3 = abstractC0187j.u();
        } while (u3 == this.f2454a);
        this.f2456c = u3;
    }

    public long w() {
        int i3 = this.f2455b;
        if (i3 != 0) {
            int i4 = this.f2454a;
            long j3 = ((long[]) this.f2457d)[i4];
            this.f2454a = (i4 + 1) & this.f2456c;
            this.f2455b = i3 - 1;
            return j3;
        }
        throw new NoSuchElementException();
    }

    public void x(int i3) {
        if (((AbstractC0187j) this.f2457d).b() == i3) {
            return;
        }
        throw C0201y.e();
    }

    public void y(int i3) {
        if ((this.f2454a & 7) == i3) {
            return;
        }
        throw C0201y.b();
    }

    public boolean z() {
        int i3;
        AbstractC0187j abstractC0187j = (AbstractC0187j) this.f2457d;
        if (!abstractC0187j.c() && (i3 = this.f2454a) != this.f2455b) {
            return abstractC0187j.x(i3);
        }
        return false;
    }

    public m() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f2456c = highestOneBit - 1;
        this.f2457d = new int[highestOneBit];
    }
}
