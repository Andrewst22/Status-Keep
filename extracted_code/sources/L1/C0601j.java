package l1;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import p.C0723e;
/* renamed from: l1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601j extends AbstractC0602k {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f8083a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f8084b;

    /* renamed from: c  reason: collision with root package name */
    public float f8085c;

    /* renamed from: d  reason: collision with root package name */
    public float f8086d;

    /* renamed from: e  reason: collision with root package name */
    public float f8087e;

    /* renamed from: f  reason: collision with root package name */
    public float f8088f;

    /* renamed from: g  reason: collision with root package name */
    public float f8089g;

    /* renamed from: h  reason: collision with root package name */
    public float f8090h;

    /* renamed from: i  reason: collision with root package name */
    public float f8091i;

    /* renamed from: j  reason: collision with root package name */
    public final Matrix f8092j;

    /* renamed from: k  reason: collision with root package name */
    public String f8093k;

    public C0601j() {
        this.f8083a = new Matrix();
        this.f8084b = new ArrayList();
        this.f8085c = 0.0f;
        this.f8086d = 0.0f;
        this.f8087e = 0.0f;
        this.f8088f = 1.0f;
        this.f8089g = 1.0f;
        this.f8090h = 0.0f;
        this.f8091i = 0.0f;
        this.f8092j = new Matrix();
        this.f8093k = null;
    }

    @Override // l1.AbstractC0602k
    public final boolean a() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f8084b;
            if (i3 >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0602k) arrayList.get(i3)).a()) {
                return true;
            }
            i3++;
        }
    }

    @Override // l1.AbstractC0602k
    public final boolean b(int[] iArr) {
        int i3 = 0;
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f8084b;
            if (i3 < arrayList.size()) {
                z3 |= ((AbstractC0602k) arrayList.get(i3)).b(iArr);
                i3++;
            } else {
                return z3;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f8092j;
        matrix.reset();
        matrix.postTranslate(-this.f8086d, -this.f8087e);
        matrix.postScale(this.f8088f, this.f8089g);
        matrix.postRotate(this.f8085c, 0.0f, 0.0f);
        matrix.postTranslate(this.f8090h + this.f8086d, this.f8091i + this.f8087e);
    }

    public String getGroupName() {
        return this.f8093k;
    }

    public Matrix getLocalMatrix() {
        return this.f8092j;
    }

    public float getPivotX() {
        return this.f8086d;
    }

    public float getPivotY() {
        return this.f8087e;
    }

    public float getRotation() {
        return this.f8085c;
    }

    public float getScaleX() {
        return this.f8088f;
    }

    public float getScaleY() {
        return this.f8089g;
    }

    public float getTranslateX() {
        return this.f8090h;
    }

    public float getTranslateY() {
        return this.f8091i;
    }

    public void setPivotX(float f3) {
        if (f3 != this.f8086d) {
            this.f8086d = f3;
            c();
        }
    }

    public void setPivotY(float f3) {
        if (f3 != this.f8087e) {
            this.f8087e = f3;
            c();
        }
    }

    public void setRotation(float f3) {
        if (f3 != this.f8085c) {
            this.f8085c = f3;
            c();
        }
    }

    public void setScaleX(float f3) {
        if (f3 != this.f8088f) {
            this.f8088f = f3;
            c();
        }
    }

    public void setScaleY(float f3) {
        if (f3 != this.f8089g) {
            this.f8089g = f3;
            c();
        }
    }

    public void setTranslateX(float f3) {
        if (f3 != this.f8090h) {
            this.f8090h = f3;
            c();
        }
    }

    public void setTranslateY(float f3) {
        if (f3 != this.f8091i) {
            this.f8091i = f3;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [l1.i, l1.l] */
    public C0601j(C0601j c0601j, C0723e c0723e) {
        AbstractC0603l abstractC0603l;
        this.f8083a = new Matrix();
        this.f8084b = new ArrayList();
        this.f8085c = 0.0f;
        this.f8086d = 0.0f;
        this.f8087e = 0.0f;
        this.f8088f = 1.0f;
        this.f8089g = 1.0f;
        this.f8090h = 0.0f;
        this.f8091i = 0.0f;
        Matrix matrix = new Matrix();
        this.f8092j = matrix;
        this.f8093k = null;
        this.f8085c = c0601j.f8085c;
        this.f8086d = c0601j.f8086d;
        this.f8087e = c0601j.f8087e;
        this.f8088f = c0601j.f8088f;
        this.f8089g = c0601j.f8089g;
        this.f8090h = c0601j.f8090h;
        this.f8091i = c0601j.f8091i;
        String str = c0601j.f8093k;
        this.f8093k = str;
        if (str != null) {
            c0723e.put(str, this);
        }
        matrix.set(c0601j.f8092j);
        ArrayList arrayList = c0601j.f8084b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Object obj = arrayList.get(i3);
            if (obj instanceof C0601j) {
                this.f8084b.add(new C0601j((C0601j) obj, c0723e));
            } else {
                if (obj instanceof C0600i) {
                    C0600i c0600i = (C0600i) obj;
                    ?? abstractC0603l2 = new AbstractC0603l(c0600i);
                    abstractC0603l2.f8073e = 0.0f;
                    abstractC0603l2.f8075g = 1.0f;
                    abstractC0603l2.f8076h = 1.0f;
                    abstractC0603l2.f8077i = 0.0f;
                    abstractC0603l2.f8078j = 1.0f;
                    abstractC0603l2.f8079k = 0.0f;
                    abstractC0603l2.f8080l = Paint.Cap.BUTT;
                    abstractC0603l2.f8081m = Paint.Join.MITER;
                    abstractC0603l2.f8082n = 4.0f;
                    abstractC0603l2.f8072d = c0600i.f8072d;
                    abstractC0603l2.f8073e = c0600i.f8073e;
                    abstractC0603l2.f8075g = c0600i.f8075g;
                    abstractC0603l2.f8074f = c0600i.f8074f;
                    abstractC0603l2.f8096c = c0600i.f8096c;
                    abstractC0603l2.f8076h = c0600i.f8076h;
                    abstractC0603l2.f8077i = c0600i.f8077i;
                    abstractC0603l2.f8078j = c0600i.f8078j;
                    abstractC0603l2.f8079k = c0600i.f8079k;
                    abstractC0603l2.f8080l = c0600i.f8080l;
                    abstractC0603l2.f8081m = c0600i.f8081m;
                    abstractC0603l2.f8082n = c0600i.f8082n;
                    abstractC0603l = abstractC0603l2;
                } else if (obj instanceof C0599h) {
                    abstractC0603l = new AbstractC0603l((C0599h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f8084b.add(abstractC0603l);
                Object obj2 = abstractC0603l.f8095b;
                if (obj2 != null) {
                    c0723e.put(obj2, abstractC0603l);
                }
            }
        }
    }
}
