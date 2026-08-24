package p;
/* renamed from: p.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726h implements Cloneable {

    /* renamed from: q  reason: collision with root package name */
    public static final Object f8739q = new Object();

    /* renamed from: m  reason: collision with root package name */
    public boolean f8740m = false;

    /* renamed from: n  reason: collision with root package name */
    public long[] f8741n;

    /* renamed from: o  reason: collision with root package name */
    public Object[] f8742o;

    /* renamed from: p  reason: collision with root package name */
    public int f8743p;

    public C0726h() {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 80;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (80 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 8;
        this.f8741n = new long[i6];
        this.f8742o = new Object[i6];
    }

    public final void a(long j3, Long l3) {
        int i3 = this.f8743p;
        if (i3 != 0 && j3 <= this.f8741n[i3 - 1]) {
            e(j3, l3);
            return;
        }
        if (this.f8740m && i3 >= this.f8741n.length) {
            c();
        }
        int i4 = this.f8743p;
        if (i4 >= this.f8741n.length) {
            int i5 = (i4 + 1) * 8;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 8;
            long[] jArr = new long[i8];
            Object[] objArr = new Object[i8];
            long[] jArr2 = this.f8741n;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f8742o;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f8741n = jArr;
            this.f8742o = objArr;
        }
        this.f8741n[i4] = j3;
        this.f8742o[i4] = l3;
        this.f8743p = i4 + 1;
    }

    /* renamed from: b */
    public final C0726h clone() {
        try {
            C0726h c0726h = (C0726h) super.clone();
            c0726h.f8741n = (long[]) this.f8741n.clone();
            c0726h.f8742o = (Object[]) this.f8742o.clone();
            return c0726h;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i3 = this.f8743p;
        long[] jArr = this.f8741n;
        Object[] objArr = this.f8742o;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (obj != f8739q) {
                if (i5 != i4) {
                    jArr[i4] = jArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        this.f8740m = false;
        this.f8743p = i4;
    }

    public final Object d(long j3, Long l3) {
        Object obj;
        int b3 = AbstractC0725g.b(this.f8741n, this.f8743p, j3);
        if (b3 >= 0 && (obj = this.f8742o[b3]) != f8739q) {
            return obj;
        }
        return l3;
    }

    public final void e(long j3, Object obj) {
        int b3 = AbstractC0725g.b(this.f8741n, this.f8743p, j3);
        if (b3 >= 0) {
            this.f8742o[b3] = obj;
            return;
        }
        int i3 = ~b3;
        int i4 = this.f8743p;
        if (i3 < i4) {
            Object[] objArr = this.f8742o;
            if (objArr[i3] == f8739q) {
                this.f8741n[i3] = j3;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f8740m && i4 >= this.f8741n.length) {
            c();
            i3 = ~AbstractC0725g.b(this.f8741n, this.f8743p, j3);
        }
        int i5 = this.f8743p;
        if (i5 >= this.f8741n.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] jArr = new long[i9];
            Object[] objArr2 = new Object[i9];
            long[] jArr2 = this.f8741n;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f8742o;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8741n = jArr;
            this.f8742o = objArr2;
        }
        int i10 = this.f8743p - i3;
        if (i10 != 0) {
            long[] jArr3 = this.f8741n;
            int i11 = i3 + 1;
            System.arraycopy(jArr3, i3, jArr3, i11, i10);
            Object[] objArr4 = this.f8742o;
            System.arraycopy(objArr4, i3, objArr4, i11, this.f8743p - i3);
        }
        this.f8741n[i3] = j3;
        this.f8742o[i3] = obj;
        this.f8743p++;
    }

    public final String toString() {
        if (this.f8740m) {
            c();
        }
        int i3 = this.f8743p;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f8743p; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            if (this.f8740m) {
                c();
            }
            sb.append(this.f8741n[i4]);
            sb.append('=');
            if (this.f8740m) {
                c();
            }
            Object obj = this.f8742o[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
