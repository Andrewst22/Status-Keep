package c0;

import U.AbstractC0123a;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final long f4754a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4755b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4756c;

    /* renamed from: d  reason: collision with root package name */
    public int f4757d;

    public j(long j3, long j4, String str) {
        this.f4756c = str == null ? "" : str;
        this.f4754a = j3;
        this.f4755b = j4;
    }

    public final j a(j jVar, String str) {
        long j3;
        long j4;
        long j5;
        String x = AbstractC0123a.x(str, this.f4756c);
        if (jVar == null || !x.equals(AbstractC0123a.x(str, jVar.f4756c))) {
            return null;
        }
        long j6 = jVar.f4755b;
        long j7 = this.f4755b;
        if (j7 != -1) {
            long j8 = this.f4754a;
            if (j8 + j7 == jVar.f4754a) {
                if (j6 == -1) {
                    j5 = -1;
                } else {
                    j5 = j7 + j6;
                }
                return new j(j8, j5, x);
            }
            j3 = -1;
        } else {
            j3 = -1;
        }
        if (j6 != j3) {
            long j9 = jVar.f4754a;
            if (j9 + j6 == this.f4754a) {
                if (j7 == -1) {
                    j4 = -1;
                } else {
                    j4 = j6 + j7;
                }
                return new j(j9, j4, x);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f4754a == jVar.f4754a && this.f4755b == jVar.f4755b && this.f4756c.equals(jVar.f4756c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4757d == 0) {
            this.f4757d = this.f4756c.hashCode() + ((((527 + ((int) this.f4754a)) * 31) + ((int) this.f4755b)) * 31);
        }
        return this.f4757d;
    }

    public final String toString() {
        return "RangedUri(referenceUri=" + this.f4756c + ", start=" + this.f4754a + ", length=" + this.f4755b + ")";
    }
}
