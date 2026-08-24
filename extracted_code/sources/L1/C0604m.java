package l1;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import p.C0723e;
import p.C0727i;
/* renamed from: l1.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604m {

    /* renamed from: p  reason: collision with root package name */
    public static final Matrix f8097p = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final Path f8098a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f8099b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f8100c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f8101d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f8102e;

    /* renamed from: f  reason: collision with root package name */
    public PathMeasure f8103f;

    /* renamed from: g  reason: collision with root package name */
    public final C0601j f8104g;

    /* renamed from: h  reason: collision with root package name */
    public float f8105h;

    /* renamed from: i  reason: collision with root package name */
    public float f8106i;

    /* renamed from: j  reason: collision with root package name */
    public float f8107j;

    /* renamed from: k  reason: collision with root package name */
    public float f8108k;

    /* renamed from: l  reason: collision with root package name */
    public int f8109l;

    /* renamed from: m  reason: collision with root package name */
    public String f8110m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f8111n;

    /* renamed from: o  reason: collision with root package name */
    public final C0723e f8112o;

    /* JADX WARN: Type inference failed for: r0v4, types: [p.e, p.i] */
    public C0604m() {
        this.f8100c = new Matrix();
        this.f8105h = 0.0f;
        this.f8106i = 0.0f;
        this.f8107j = 0.0f;
        this.f8108k = 0.0f;
        this.f8109l = 255;
        this.f8110m = null;
        this.f8111n = null;
        this.f8112o = new C0727i();
        this.f8104g = new C0601j();
        this.f8098a = new Path();
        this.f8099b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
        if (r0.f8078j != 1.0f) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(l1.C0601j r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C0604m.a(l1.j, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f8109l;
    }

    public void setAlpha(float f3) {
        setRootAlpha((int) (f3 * 255.0f));
    }

    public void setRootAlpha(int i3) {
        this.f8109l = i3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [p.e, p.i] */
    public C0604m(C0604m c0604m) {
        this.f8100c = new Matrix();
        this.f8105h = 0.0f;
        this.f8106i = 0.0f;
        this.f8107j = 0.0f;
        this.f8108k = 0.0f;
        this.f8109l = 255;
        this.f8110m = null;
        this.f8111n = null;
        ?? c0727i = new C0727i();
        this.f8112o = c0727i;
        this.f8104g = new C0601j(c0604m.f8104g, c0727i);
        this.f8098a = new Path(c0604m.f8098a);
        this.f8099b = new Path(c0604m.f8099b);
        this.f8105h = c0604m.f8105h;
        this.f8106i = c0604m.f8106i;
        this.f8107j = c0604m.f8107j;
        this.f8108k = c0604m.f8108k;
        this.f8109l = c0604m.f8109l;
        this.f8110m = c0604m.f8110m;
        String str = c0604m.f8110m;
        if (str != null) {
            c0727i.put(str, this);
        }
        this.f8111n = c0604m.f8111n;
    }
}
