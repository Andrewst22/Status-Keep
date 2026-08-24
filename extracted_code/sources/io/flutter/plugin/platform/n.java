package io.flutter.plugin.platform;

import W1.C0128a;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import o2.AbstractC0715l;
import o2.C0710g;
import p2.C0737a;
import p2.C0738b;
/* loaded from: classes.dex */
public final class n implements h {

    /* renamed from: w  reason: collision with root package name */
    public static final Class[] f6236w = {SurfaceView.class};

    /* renamed from: b  reason: collision with root package name */
    public C0128a f6238b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f6239c;

    /* renamed from: d  reason: collision with root package name */
    public W1.o f6240d;

    /* renamed from: e  reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f6241e;

    /* renamed from: f  reason: collision with root package name */
    public io.flutter.plugin.editing.i f6242f;

    /* renamed from: g  reason: collision with root package name */
    public B1.a f6243g;

    /* renamed from: t  reason: collision with root package name */
    public final B1.a f6256t;

    /* renamed from: o  reason: collision with root package name */
    public int f6251o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6252p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6253q = true;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6257u = false;

    /* renamed from: v  reason: collision with root package name */
    public final l f6258v = new l(this, 0);

    /* renamed from: a  reason: collision with root package name */
    public final l f6237a = new l(2);

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f6245i = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final C0322a f6244h = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f6246j = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    public final SparseArray f6249m = new SparseArray();

    /* renamed from: r  reason: collision with root package name */
    public final HashSet f6254r = new HashSet();

    /* renamed from: s  reason: collision with root package name */
    public final HashSet f6255s = new HashSet();

    /* renamed from: n  reason: collision with root package name */
    public final SparseArray f6250n = new SparseArray();

    /* renamed from: k  reason: collision with root package name */
    public final SparseArray f6247k = new SparseArray();

    /* renamed from: l  reason: collision with root package name */
    public final SparseArray f6248l = new SparseArray();

    /* JADX WARN: Type inference failed for: r0v4, types: [io.flutter.plugin.platform.a, java.lang.Object] */
    public n() {
        if (B1.a.f48p == null) {
            B1.a.f48p = new B1.a(11);
        }
        this.f6256t = B1.a.f48p;
    }

    public static void e(n nVar, f2.h hVar) {
        nVar.getClass();
        int i3 = hVar.f5583g;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + i3 + "(view id: " + hVar.f5577a + ")");
        }
    }

    public static void h(int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= i3) {
            return;
        }
        throw new IllegalStateException(D2.h.j(i4, i3, "Trying to use platform views with API ", ", required API level is: "));
    }

    public static f l(io.flutter.embedding.engine.renderer.l lVar) {
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            if (i4 == 34) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            TextureRegistry$SurfaceProducer c3 = lVar.c(i3);
            l lVar2 = new l(4);
            lVar2.f6219b = c3;
            return lVar2;
        } else if (i4 >= 29) {
            return new i1.z(lVar.b());
        } else {
            return new x(lVar.d());
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void a() {
        this.f6244h.f6196a = null;
    }

    @Override // io.flutter.plugin.platform.h
    public final void b(io.flutter.view.k kVar) {
        this.f6244h.f6196a = kVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean c(int i3) {
        return this.f6245i.containsKey(Integer.valueOf(i3));
    }

    @Override // io.flutter.plugin.platform.h
    public final SurfaceView d(int i3) {
        if (c(i3)) {
            return ((C) this.f6245i.get(Integer.valueOf(i3))).a();
        }
        e eVar = (e) this.f6247k.get(i3);
        if (eVar == null) {
            return null;
        }
        return ((C0737a) eVar).f8832a;
    }

    public final C0737a f(f2.h hVar, boolean z3) {
        Object obj;
        Context context;
        String str = hVar.f5578b;
        C0738b c0738b = (C0738b) ((HashMap) this.f6237a.f6219b).get(str);
        if (c0738b != null) {
            ByteBuffer byteBuffer = hVar.f5585i;
            if (byteBuffer != null) {
                obj = c0738b.f8833a.a(byteBuffer);
            } else {
                obj = null;
            }
            if (z3) {
                context = new MutableContextWrapper(this.f6239c);
            } else {
                context = this.f6239c;
            }
            C0710g c0710g = (C0710g) obj;
            Objects.requireNonNull(c0710g);
            C0737a c0737a = new C0737a(context, ((AbstractC0715l) ((LongSparseArray) c0738b.f8834b.f25n).get(c0710g.f8697a.longValue())).f8707c);
            SurfaceView surfaceView = c0737a.f8832a;
            if (surfaceView != null) {
                surfaceView.setLayoutDirection(hVar.f5583g);
                this.f6247k.put(hVar.f5577a, c0737a);
                return c0737a;
            }
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
    }

    public final void g() {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f6249m;
            if (i3 < sparseArray.size()) {
                C0324c c0324c = (C0324c) sparseArray.valueAt(i3);
                c0324c.c();
                c0324c.f2855m.close();
                i3++;
            } else {
                return;
            }
        }
    }

    public final void i(boolean z3) {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f6249m;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i3);
            C0324c c0324c = (C0324c) sparseArray.valueAt(i3);
            if (this.f6254r.contains(Integer.valueOf(keyAt))) {
                X1.c cVar = this.f6240d.f2894t;
                if (cVar != null) {
                    c0324c.a(cVar.f2977b);
                }
                z3 &= c0324c.e();
            } else {
                if (!this.f6252p) {
                    c0324c.c();
                }
                c0324c.setVisibility(8);
                this.f6240d.removeView(c0324c);
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f6248l;
            if (i4 < sparseArray2.size()) {
                int keyAt2 = sparseArray2.keyAt(i4);
                View view = (View) sparseArray2.get(keyAt2);
                if (this.f6255s.contains(Integer.valueOf(keyAt2)) && (z3 || !this.f6253q)) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
                i4++;
            } else {
                return;
            }
        }
    }

    public final float j() {
        return this.f6239c.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final void k() {
        if (this.f6253q && !this.f6252p) {
            W1.o oVar = this.f6240d;
            oVar.f2890p.b();
            W1.h hVar = oVar.f2889o;
            if (hVar == null) {
                W1.h hVar2 = new W1.h(oVar.getContext(), oVar.getWidth(), oVar.getHeight(), 1);
                oVar.f2889o = hVar2;
                oVar.addView(hVar2);
            } else {
                hVar.g(oVar.getWidth(), oVar.getHeight());
            }
            oVar.f2891q = oVar.f2890p;
            W1.h hVar3 = oVar.f2889o;
            oVar.f2890p = hVar3;
            X1.c cVar = oVar.f2894t;
            if (cVar != null) {
                hVar3.a(cVar.f2977b);
            }
            this.f6252p = true;
        }
    }

    public final void m() {
        for (C c3 : this.f6245i.values()) {
            int width = c3.f6191f.getWidth();
            f fVar = c3.f6191f;
            int height = fVar.getHeight();
            boolean isFocused = c3.a().isFocused();
            s detachState = c3.f6186a.detachState();
            c3.f6193h.setSurface(null);
            c3.f6193h.release();
            c3.f6193h = ((DisplayManager) c3.f6187b.getSystemService("display")).createVirtualDisplay("flutter-vd#" + c3.f6190e, width, height, c3.f6189d, fVar.getSurface(), 0, C.f6185i, null);
            SingleViewPresentation singleViewPresentation = new SingleViewPresentation(c3.f6187b, c3.f6193h.getDisplay(), c3.f6188c, detachState, c3.f6192g, isFocused);
            singleViewPresentation.show();
            c3.f6186a.cancel();
            c3.f6186a = singleViewPresentation;
        }
    }

    public final MotionEvent n(float f3, f2.j jVar, boolean z3) {
        MotionEvent G3 = this.f6256t.G(new W1.B(jVar.f5604p));
        ArrayList arrayList = new ArrayList();
        for (List list : (List) jVar.f5595g) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
            double d3 = f3;
            pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d3);
            pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d3);
            pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d3);
            pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d3);
            pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d3);
            pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d3);
            arrayList.add(pointerCoords);
        }
        int i3 = jVar.f5593e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
        if (!z3 && G3 != null) {
            if (pointerCoordsArr.length >= 1) {
                G3.offsetLocation(pointerCoordsArr[0].x - G3.getX(), pointerCoordsArr[0].y - G3.getY());
            }
            return G3;
        }
        ArrayList arrayList2 = new ArrayList();
        for (List list2 : (List) jVar.f5594f) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list2.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list2.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        return MotionEvent.obtain(jVar.f5590b.longValue(), jVar.f5591c.longValue(), jVar.f5592d, jVar.f5593e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]), pointerCoordsArr, jVar.f5596h, jVar.f5597i, jVar.f5598j, jVar.f5599k, jVar.f5600l, jVar.f5601m, jVar.f5602n, jVar.f5603o);
    }

    public final int o(double d3) {
        return (int) Math.round(d3 * j());
    }
}
