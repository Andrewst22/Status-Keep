package p;
/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: p  reason: collision with root package name */
    public static final Object f8751p = new Object();

    /* renamed from: m  reason: collision with root package name */
    public int[] f8752m;

    /* renamed from: n  reason: collision with root package name */
    public Object[] f8753n;

    /* renamed from: o  reason: collision with root package name */
    public int f8754o;

    public j() {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 40;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (40 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 4;
        this.f8752m = new int[i6];
        this.f8753n = new Object[i6];
    }

    public final void a(int i3, Object obj) {
        int i4 = this.f8754o;
        if (i4 != 0 && i3 <= this.f8752m[i4 - 1]) {
            d(i3, obj);
            return;
        }
        if (i4 >= this.f8752m.length) {
            int i5 = (i4 + 1) * 4;
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
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr = new Object[i8];
            int[] iArr2 = this.f8752m;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f8753n;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f8752m = iArr;
            this.f8753n = objArr;
        }
        this.f8752m[i4] = i3;
        this.f8753n[i4] = obj;
        this.f8754o = i4 + 1;
    }

    /* renamed from: b */
    public final j clone() {
        try {
            j jVar = (j) super.clone();
            jVar.f8752m = (int[]) this.f8752m.clone();
            jVar.f8753n = (Object[]) this.f8753n.clone();
            return jVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final Object c(int i3, Integer num) {
        Object obj;
        int a3 = AbstractC0725g.a(this.f8754o, i3, this.f8752m);
        if (a3 >= 0 && (obj = this.f8753n[a3]) != f8751p) {
            return obj;
        }
        return num;
    }

    public final void d(int i3, Object obj) {
        int a3 = AbstractC0725g.a(this.f8754o, i3, this.f8752m);
        if (a3 >= 0) {
            this.f8753n[a3] = obj;
            return;
        }
        int i4 = ~a3;
        int i5 = this.f8754o;
        if (i4 < i5) {
            Object[] objArr = this.f8753n;
            if (objArr[i4] == f8751p) {
                this.f8752m[i4] = i3;
                objArr[i4] = obj;
                return;
            }
        }
        if (i5 >= this.f8752m.length) {
            int i6 = (i5 + 1) * 4;
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
            int i9 = i6 / 4;
            int[] iArr = new int[i9];
            Object[] objArr2 = new Object[i9];
            int[] iArr2 = this.f8752m;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f8753n;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8752m = iArr;
            this.f8753n = objArr2;
        }
        int i10 = this.f8754o - i4;
        if (i10 != 0) {
            int[] iArr3 = this.f8752m;
            int i11 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i11, i10);
            Object[] objArr4 = this.f8753n;
            System.arraycopy(objArr4, i4, objArr4, i11, this.f8754o - i4);
        }
        this.f8752m[i4] = i3;
        this.f8753n[i4] = obj;
        this.f8754o++;
    }

    public final String toString() {
        int i3 = this.f8754o;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f8754o; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(this.f8752m[i4]);
            sb.append('=');
            Object obj = this.f8753n[i4];
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
