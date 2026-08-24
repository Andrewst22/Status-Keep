package Q0;

import U.AbstractC0123a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public int f1543a;

    /* renamed from: b  reason: collision with root package name */
    public int f1544b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1545c = new long[10];

    /* renamed from: d  reason: collision with root package name */
    public Object f1546d = new Object[10];

    public synchronized void a(long j3, Object obj) {
        int i3 = this.f1544b;
        if (i3 > 0) {
            if (j3 <= ((long[]) this.f1545c)[((this.f1543a + i3) - 1) % ((Object[]) this.f1546d).length]) {
                b();
            }
        }
        c();
        int i4 = this.f1543a;
        int i5 = this.f1544b;
        Object[] objArr = (Object[]) this.f1546d;
        int length = (i4 + i5) % objArr.length;
        ((long[]) this.f1545c)[length] = j3;
        objArr[length] = obj;
        this.f1544b = i5 + 1;
    }

    public synchronized void b() {
        this.f1543a = 0;
        this.f1544b = 0;
        Arrays.fill((Object[]) this.f1546d, (Object) null);
    }

    public void c() {
        int length = ((Object[]) this.f1546d).length;
        if (this.f1544b < length) {
            return;
        }
        int i3 = length * 2;
        long[] jArr = new long[i3];
        Object[] objArr = new Object[i3];
        int i4 = this.f1543a;
        int i5 = length - i4;
        System.arraycopy((long[]) this.f1545c, i4, jArr, 0, i5);
        System.arraycopy((Object[]) this.f1546d, this.f1543a, objArr, 0, i5);
        int i6 = this.f1543a;
        if (i6 > 0) {
            System.arraycopy((long[]) this.f1545c, 0, jArr, i5, i6);
            System.arraycopy((Object[]) this.f1546d, 0, objArr, i5, this.f1543a);
        }
        this.f1545c = jArr;
        this.f1546d = objArr;
        this.f1543a = 0;
    }

    public synchronized Object d() {
        Object f3;
        if (this.f1544b == 0) {
            f3 = null;
        } else {
            f3 = f();
        }
        return f3;
    }

    public synchronized Object e(long j3) {
        Object obj;
        obj = null;
        while (this.f1544b > 0 && j3 - ((long[]) this.f1545c)[this.f1543a] >= 0) {
            obj = f();
        }
        return obj;
    }

    public Object f() {
        boolean z3;
        if (this.f1544b > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        Object[] objArr = (Object[]) this.f1546d;
        int i3 = this.f1543a;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f1543a = (i3 + 1) % objArr.length;
        this.f1544b--;
        return obj;
    }

    public synchronized int g() {
        return this.f1544b;
    }
}
