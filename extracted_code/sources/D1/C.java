package D1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f185a;

    /* renamed from: b  reason: collision with root package name */
    public int f186b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f187c;

    public C(int i3) {
        r.e("initialCapacity", i3);
        this.f185a = new Object[i3];
        this.f186b = 0;
    }

    public static int e(int i3, int i4) {
        if (i4 >= 0) {
            int i5 = i3 + (i3 >> 1) + 1;
            if (i5 < i4) {
                i5 = Integer.highestOneBit(i4 - 1) << 1;
            }
            if (i5 < 0) {
                return Integer.MAX_VALUE;
            }
            return i5;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public final void a(Object obj) {
        obj.getClass();
        f(this.f186b + 1);
        Object[] objArr = this.f185a;
        int i3 = this.f186b;
        this.f186b = i3 + 1;
        objArr[i3] = obj;
    }

    public abstract C b(Object obj);

    public void c(Object obj) {
        a(obj);
    }

    public final void d(List list) {
        if (list instanceof Collection) {
            f(list.size() + this.f186b);
            if (list instanceof D) {
                this.f186b = ((D) list).b(this.f186b, this.f185a);
                return;
            }
        }
        for (Object obj : list) {
            b(obj);
        }
    }

    public final void f(int i3) {
        Object[] objArr = this.f185a;
        if (objArr.length < i3) {
            this.f185a = Arrays.copyOf(objArr, e(objArr.length, i3));
            this.f187c = false;
        } else if (this.f187c) {
            this.f185a = (Object[]) objArr.clone();
            this.f187c = false;
        }
    }
}
