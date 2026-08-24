package l1;

import android.graphics.Paint;
/* renamed from: l1.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0600i extends AbstractC0603l {

    /* renamed from: d  reason: collision with root package name */
    public B0.b f8072d;

    /* renamed from: e  reason: collision with root package name */
    public float f8073e;

    /* renamed from: f  reason: collision with root package name */
    public B0.b f8074f;

    /* renamed from: g  reason: collision with root package name */
    public float f8075g;

    /* renamed from: h  reason: collision with root package name */
    public float f8076h;

    /* renamed from: i  reason: collision with root package name */
    public float f8077i;

    /* renamed from: j  reason: collision with root package name */
    public float f8078j;

    /* renamed from: k  reason: collision with root package name */
    public float f8079k;

    /* renamed from: l  reason: collision with root package name */
    public Paint.Cap f8080l;

    /* renamed from: m  reason: collision with root package name */
    public Paint.Join f8081m;

    /* renamed from: n  reason: collision with root package name */
    public float f8082n;

    @Override // l1.AbstractC0602k
    public final boolean a() {
        if (!this.f8074f.f() && !this.f8072d.f()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // l1.AbstractC0602k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            B0.b r0 = r6.f8074f
            boolean r1 = r0.f()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f29p
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f27n
            if (r1 == r4) goto L1e
            r0.f27n = r1
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            B0.b r1 = r6.f8072d
            boolean r4 = r1.f()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f29p
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f27n
            if (r7 == r4) goto L3a
            r1.f27n = r7
            r2 = 1
        L3a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C0600i.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f8076h;
    }

    public int getFillColor() {
        return this.f8074f.f27n;
    }

    public float getStrokeAlpha() {
        return this.f8075g;
    }

    public int getStrokeColor() {
        return this.f8072d.f27n;
    }

    public float getStrokeWidth() {
        return this.f8073e;
    }

    public float getTrimPathEnd() {
        return this.f8078j;
    }

    public float getTrimPathOffset() {
        return this.f8079k;
    }

    public float getTrimPathStart() {
        return this.f8077i;
    }

    public void setFillAlpha(float f3) {
        this.f8076h = f3;
    }

    public void setFillColor(int i3) {
        this.f8074f.f27n = i3;
    }

    public void setStrokeAlpha(float f3) {
        this.f8075g = f3;
    }

    public void setStrokeColor(int i3) {
        this.f8072d.f27n = i3;
    }

    public void setStrokeWidth(float f3) {
        this.f8073e = f3;
    }

    public void setTrimPathEnd(float f3) {
        this.f8078j = f3;
    }

    public void setTrimPathOffset(float f3) {
        this.f8079k = f3;
    }

    public void setTrimPathStart(float f3) {
        this.f8077i = f3;
    }
}
