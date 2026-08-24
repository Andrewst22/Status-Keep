package l1;

import m2.AbstractC0635d;
import v.C0873d;
/* renamed from: l1.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0603l extends AbstractC0602k {

    /* renamed from: a  reason: collision with root package name */
    public C0873d[] f8094a;

    /* renamed from: b  reason: collision with root package name */
    public String f8095b;

    /* renamed from: c  reason: collision with root package name */
    public int f8096c;

    public AbstractC0603l() {
        this.f8094a = null;
        this.f8096c = 0;
    }

    public C0873d[] getPathData() {
        return this.f8094a;
    }

    public String getPathName() {
        return this.f8095b;
    }

    public void setPathData(C0873d[] c0873dArr) {
        if (!AbstractC0635d.d(this.f8094a, c0873dArr)) {
            this.f8094a = AbstractC0635d.k(c0873dArr);
            return;
        }
        C0873d[] c0873dArr2 = this.f8094a;
        for (int i3 = 0; i3 < c0873dArr.length; i3++) {
            c0873dArr2[i3].f9468a = c0873dArr[i3].f9468a;
            int i4 = 0;
            while (true) {
                float[] fArr = c0873dArr[i3].f9469b;
                if (i4 < fArr.length) {
                    c0873dArr2[i3].f9469b[i4] = fArr[i4];
                    i4++;
                }
            }
        }
    }

    public AbstractC0603l(AbstractC0603l abstractC0603l) {
        this.f8094a = null;
        this.f8096c = 0;
        this.f8095b = abstractC0603l.f8095b;
        this.f8094a = AbstractC0635d.k(abstractC0603l.f8094a);
    }
}
