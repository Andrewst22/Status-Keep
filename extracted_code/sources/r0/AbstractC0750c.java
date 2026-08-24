package r0;

import R.C0113p;
import R.U;
import U.A;
import U.AbstractC0123a;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p0.AbstractC0732e;
/* renamed from: r0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0750c implements s {

    /* renamed from: a  reason: collision with root package name */
    public final U f8904a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8905b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f8906c;

    /* renamed from: d  reason: collision with root package name */
    public final C0113p[] f8907d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f8908e;

    /* renamed from: f  reason: collision with root package name */
    public int f8909f;

    public AbstractC0750c(U u3, int[] iArr) {
        boolean z3;
        int i3 = 0;
        if (iArr.length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        u3.getClass();
        this.f8904a = u3;
        int length = iArr.length;
        this.f8905b = length;
        this.f8907d = new C0113p[length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.f8907d[i4] = u3.f1824d[iArr[i4]];
        }
        Arrays.sort(this.f8907d, new U0.d(5));
        this.f8906c = new int[this.f8905b];
        while (true) {
            int i5 = this.f8905b;
            if (i3 < i5) {
                this.f8906c[i3] = u3.b(this.f8907d[i3]);
                i3++;
            } else {
                this.f8908e = new long[i5];
                return;
            }
        }
    }

    @Override // r0.s
    public final int a() {
        return this.f8906c[f()];
    }

    @Override // r0.s
    public final U b() {
        return this.f8904a;
    }

    @Override // r0.s
    public final /* synthetic */ void c(boolean z3) {
    }

    @Override // r0.s
    public final C0113p d() {
        return this.f8907d[f()];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0750c abstractC0750c = (AbstractC0750c) obj;
        if (this.f8904a.equals(abstractC0750c.f8904a) && Arrays.equals(this.f8906c, abstractC0750c.f8906c)) {
            return true;
        }
        return false;
    }

    @Override // r0.s
    public final C0113p g(int i3) {
        return this.f8907d[i3];
    }

    public final int hashCode() {
        if (this.f8909f == 0) {
            this.f8909f = Arrays.hashCode(this.f8906c) + (System.identityHashCode(this.f8904a) * 31);
        }
        return this.f8909f;
    }

    @Override // r0.s
    public final int i(C0113p c0113p) {
        for (int i3 = 0; i3 < this.f8905b; i3++) {
            if (this.f8907d[i3] == c0113p) {
                return i3;
            }
        }
        return -1;
    }

    @Override // r0.s
    public final int k(int i3) {
        return this.f8906c[i3];
    }

    @Override // r0.s
    public final int length() {
        return this.f8906c.length;
    }

    @Override // r0.s
    public final /* synthetic */ void m() {
    }

    @Override // r0.s
    public int n(long j3, List list) {
        return list.size();
    }

    @Override // r0.s
    public final boolean o(long j3, int i3) {
        if (this.f8908e[i3] > j3) {
            return true;
        }
        return false;
    }

    @Override // r0.s
    public final /* synthetic */ boolean q(long j3, AbstractC0732e abstractC0732e, List list) {
        return false;
    }

    @Override // r0.s
    public final boolean r(long j3, int i3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean o3 = o(elapsedRealtime, i3);
        for (int i4 = 0; i4 < this.f8905b && !o3; i4++) {
            if (i4 != i3 && !o(elapsedRealtime, i4)) {
                o3 = true;
            } else {
                o3 = false;
            }
        }
        if (!o3) {
            return false;
        }
        long[] jArr = this.f8908e;
        long j4 = jArr[i3];
        int i5 = A.f2405a;
        long j5 = elapsedRealtime + j3;
        if (((j3 ^ j5) & (elapsedRealtime ^ j5)) < 0) {
            j5 = Long.MAX_VALUE;
        }
        jArr[i3] = Math.max(j4, j5);
        return true;
    }

    @Override // r0.s
    public final /* synthetic */ void t() {
    }

    @Override // r0.s
    public final int u(int i3) {
        for (int i4 = 0; i4 < this.f8905b; i4++) {
            if (this.f8906c[i4] == i3) {
                return i4;
            }
        }
        return -1;
    }

    @Override // r0.s
    public void h() {
    }

    @Override // r0.s
    public void s() {
    }

    @Override // r0.s
    public void j(float f3) {
    }
}
