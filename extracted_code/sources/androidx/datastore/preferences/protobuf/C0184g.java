package androidx.datastore.preferences.protobuf;

import a.AbstractC0155a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
/* renamed from: androidx.datastore.preferences.protobuf.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0184g implements Iterable, Serializable {

    /* renamed from: o  reason: collision with root package name */
    public static final C0184g f4242o = new C0184g(AbstractC0199w.f4314b);

    /* renamed from: p  reason: collision with root package name */
    public static final C0182e f4243p;

    /* renamed from: m  reason: collision with root package name */
    public int f4244m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final byte[] f4245n;

    static {
        C0182e c0182e;
        if (AbstractC0180c.a()) {
            c0182e = new C0182e(1);
        } else {
            c0182e = new C0182e(0);
        }
        f4243p = c0182e;
    }

    public C0184g(byte[] bArr) {
        bArr.getClass();
        this.f4245n = bArr;
    }

    public static int b(int i3, int i4, int i5) {
        int i6 = i4 - i3;
        if ((i3 | i4 | i6 | (i5 - i4)) < 0) {
            if (i3 >= 0) {
                if (i4 < i3) {
                    throw new IndexOutOfBoundsException(D2.h.j(i3, i4, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(D2.h.j(i4, i5, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i3 + " < 0");
        }
        return i6;
    }

    public static C0184g c(byte[] bArr, int i3, int i4) {
        byte[] copyOfRange;
        b(i3, i3 + i4, bArr.length);
        switch (f4243p.f4238a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i3, i4 + i3);
                break;
            default:
                copyOfRange = new byte[i4];
                System.arraycopy(bArr, i3, copyOfRange, 0, i4);
                break;
        }
        return new C0184g(copyOfRange);
    }

    public byte a(int i3) {
        return this.f4245n[i3];
    }

    public void d(byte[] bArr, int i3) {
        System.arraycopy(this.f4245n, 0, bArr, 0, i3);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0184g) || size() != ((C0184g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C0184g) {
            C0184g c0184g = (C0184g) obj;
            int i3 = this.f4244m;
            int i4 = c0184g.f4244m;
            if (i3 != 0 && i4 != 0 && i3 != i4) {
                return false;
            }
            int size = size();
            if (size <= c0184g.size()) {
                if (size <= c0184g.size()) {
                    int e2 = e() + size;
                    int e3 = e();
                    int e4 = c0184g.e();
                    while (e3 < e2) {
                        if (this.f4245n[e3] != c0184g.f4245n[e4]) {
                            return false;
                        }
                        e3++;
                        e4++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0184g.size());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    public byte f(int i3) {
        return this.f4245n[i3];
    }

    public final int hashCode() {
        int i3 = this.f4244m;
        if (i3 == 0) {
            int size = size();
            int e2 = e();
            int i4 = size;
            for (int i5 = e2; i5 < e2 + size; i5++) {
                i4 = (i4 * 31) + this.f4245n[i5];
            }
            if (i4 == 0) {
                i3 = 1;
            } else {
                i3 = i4;
            }
            this.f4244m = i3;
        }
        return i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0181d(this);
    }

    public int size() {
        return this.f4245n.length;
    }

    public final String toString() {
        C0184g c0183f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = AbstractC0155a.y(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int b3 = b(0, 47, size());
            if (b3 == 0) {
                c0183f = f4242o;
            } else {
                c0183f = new C0183f(this.f4245n, e(), b3);
            }
            sb2.append(AbstractC0155a.y(c0183f));
            sb2.append("...");
            sb = sb2.toString();
        }
        return "<ByteString@" + hexString + " size=" + size + " contents=\"" + sb + "\">";
    }
}
