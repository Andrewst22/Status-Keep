package io.flutter.plugin.platform;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import b2.ViewTreeObserver$OnGlobalFocusChangeListenerC0216a;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m2.AbstractC0635d;
import p2.C0737a;
/* loaded from: classes.dex */
public final class l implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6218a;

    /* renamed from: b  reason: collision with root package name */
    public Object f6219b;

    public /* synthetic */ l(Object obj, int i3) {
        this.f6218a = i3;
        this.f6219b = obj;
    }

    @Override // io.flutter.plugin.platform.f
    public long a() {
        return ((TextureRegistry$SurfaceProducer) this.f6219b).id();
    }

    @Override // io.flutter.plugin.platform.f
    public void b(int i3, int i4) {
        ((TextureRegistry$SurfaceProducer) this.f6219b).setSize(i3, i4);
    }

    public void c(int i3) {
        SurfaceView surfaceView;
        switch (this.f6218a) {
            case 0:
                n nVar = (n) this.f6219b;
                if (nVar.c(i3)) {
                    surfaceView = ((C) nVar.f6245i.get(Integer.valueOf(i3))).a();
                } else {
                    e eVar = (e) nVar.f6247k.get(i3);
                    if (eVar == null) {
                        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i3);
                        return;
                    }
                    surfaceView = ((C0737a) eVar).f8832a;
                }
                if (surfaceView == null) {
                    Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i3);
                    return;
                }
                surfaceView.clearFocus();
                return;
            default:
                e eVar2 = (e) ((m) this.f6219b).f6228i.get(i3);
                if (eVar2 == null) {
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + i3);
                    return;
                }
                SurfaceView surfaceView2 = ((C0737a) eVar2).f8832a;
                if (surfaceView2 == null) {
                    Log.e("PlatformViewsController2", "Clearing focus on a null view with id: " + i3);
                    return;
                }
                surfaceView2.clearFocus();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [io.flutter.plugin.platform.j] */
    public long d(final f2.h hVar) {
        g gVar;
        long j3;
        Canvas lockHardwareCanvas;
        final n nVar = (n) this.f6219b;
        n.e(nVar, hVar);
        SparseArray sparseArray = nVar.f6250n;
        int i3 = hVar.f5577a;
        if (sparseArray.get(i3) == null) {
            if (nVar.f6241e != null) {
                if (nVar.f6240d != null) {
                    C0737a f3 = nVar.f(hVar, true);
                    SurfaceView surfaceView = f3.f8832a;
                    if (surfaceView.getParent() == null) {
                        int i4 = Build.VERSION.SDK_INT;
                        double d3 = hVar.f5580d;
                        double d4 = hVar.f5579c;
                        if (i4 < 23 || AbstractC0635d.y(surfaceView, new B0.a(n.f6236w, 25))) {
                            if (hVar.f5584h == 2) {
                                n.h(19);
                                return -2L;
                            } else if (!nVar.f6257u) {
                                n.h(20);
                                f l3 = n.l(nVar.f6241e);
                                int o3 = nVar.o(d4);
                                int o4 = nVar.o(d3);
                                Activity activity = nVar.f6239c;
                                ?? r14 = new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.j
                                    @Override // android.view.View.OnFocusChangeListener
                                    public final void onFocusChange(View view, boolean z3) {
                                        switch (r3) {
                                            case 0:
                                                f2.h hVar2 = hVar;
                                                n nVar2 = nVar;
                                                int i5 = hVar2.f5577a;
                                                if (z3) {
                                                    g2.r rVar = (g2.r) nVar2.f6243g.f50n;
                                                    if (rVar != null) {
                                                        rVar.a("viewFocused", Integer.valueOf(i5), null);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                io.flutter.plugin.editing.i iVar = nVar2.f6242f;
                                                if (iVar != null) {
                                                    iVar.b(i5);
                                                    return;
                                                }
                                                return;
                                            default:
                                                n nVar3 = nVar;
                                                if (z3) {
                                                    B1.a aVar = nVar3.f6243g;
                                                    f2.h hVar3 = hVar;
                                                    g2.r rVar2 = (g2.r) aVar.f50n;
                                                    if (rVar2 != null) {
                                                        rVar2.a("viewFocused", Integer.valueOf(hVar3.f5577a), null);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                nVar3.getClass();
                                                return;
                                        }
                                    }
                                };
                                y yVar = C.f6185i;
                                C c3 = null;
                                if (o3 != 0 && o4 != 0) {
                                    DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
                                    DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
                                    l3.b(o3, o4);
                                    StringBuilder sb = new StringBuilder("flutter-vd#");
                                    int i5 = hVar.f5577a;
                                    sb.append(i5);
                                    VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay(sb.toString(), o3, o4, displayMetrics.densityDpi, l3.getSurface(), 0, C.f6185i, null);
                                    if (createVirtualDisplay != null) {
                                        c3 = new C(activity, nVar.f6244h, createVirtualDisplay, f3, l3, r14, i5);
                                    }
                                }
                                if (c3 != null) {
                                    nVar.f6245i.put(Integer.valueOf(i3), c3);
                                    nVar.f6246j.put(surfaceView.getContext(), surfaceView);
                                    return l3.a();
                                }
                                throw new IllegalStateException("Failed creating virtual display for a " + hVar.f5578b + " with id: " + i3);
                            }
                        }
                        n.h(23);
                        int o5 = nVar.o(d4);
                        int o6 = nVar.o(d3);
                        if (nVar.f6257u) {
                            gVar = new g(nVar.f6239c);
                            j3 = -1;
                        } else {
                            f l4 = n.l(nVar.f6241e);
                            g gVar2 = new g(nVar.f6239c);
                            gVar2.f6206r = l4;
                            Surface surface = l4.getSurface();
                            if (surface != null) {
                                lockHardwareCanvas = surface.lockHardwareCanvas();
                                try {
                                    lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                                } finally {
                                    surface.unlockCanvasAndPost(lockHardwareCanvas);
                                }
                            }
                            long a3 = l4.a();
                            gVar = gVar2;
                            j3 = a3;
                        }
                        gVar.setTouchProcessor(nVar.f6238b);
                        f fVar = gVar.f6206r;
                        if (fVar != null) {
                            fVar.b(o5, o6);
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(o5, o6);
                        int o7 = nVar.o(hVar.f5581e);
                        int o8 = nVar.o(hVar.f5582f);
                        layoutParams.topMargin = o7;
                        layoutParams.leftMargin = o8;
                        gVar.setLayoutParams(layoutParams);
                        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(o5, o6));
                        surfaceView.setImportantForAccessibility(4);
                        gVar.addView(surfaceView);
                        gVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.j
                            @Override // android.view.View.OnFocusChangeListener
                            public final void onFocusChange(View view, boolean z3) {
                                switch (r3) {
                                    case 0:
                                        f2.h hVar2 = hVar;
                                        n nVar2 = nVar;
                                        int i52 = hVar2.f5577a;
                                        if (z3) {
                                            g2.r rVar = (g2.r) nVar2.f6243g.f50n;
                                            if (rVar != null) {
                                                rVar.a("viewFocused", Integer.valueOf(i52), null);
                                                return;
                                            }
                                            return;
                                        }
                                        io.flutter.plugin.editing.i iVar = nVar2.f6242f;
                                        if (iVar != null) {
                                            iVar.b(i52);
                                            return;
                                        }
                                        return;
                                    default:
                                        n nVar3 = nVar;
                                        if (z3) {
                                            B1.a aVar = nVar3.f6243g;
                                            f2.h hVar3 = hVar;
                                            g2.r rVar2 = (g2.r) aVar.f50n;
                                            if (rVar2 != null) {
                                                rVar2.a("viewFocused", Integer.valueOf(hVar3.f5577a), null);
                                                return;
                                            }
                                            return;
                                        }
                                        nVar3.getClass();
                                        return;
                                }
                            }
                        });
                        nVar.f6240d.addView(gVar);
                        sparseArray.append(i3, gVar);
                        return j3;
                    }
                    throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
                }
                throw new IllegalStateException(D2.h.k("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", i3));
            }
            throw new IllegalStateException(D2.h.k("Texture registry is null. This means that platform views controller was detached, view id: ", i3));
        }
        throw new IllegalStateException(D2.h.k("Trying to create an already created platform view, view id: ", i3));
    }

    public void e(int i3) {
        ViewTreeObserver$OnGlobalFocusChangeListenerC0216a viewTreeObserver$OnGlobalFocusChangeListenerC0216a;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f6218a) {
            case 0:
                n nVar = (n) this.f6219b;
                e eVar = (e) nVar.f6247k.get(i3);
                if (eVar == null) {
                    Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i3);
                    return;
                }
                SurfaceView surfaceView = ((C0737a) eVar).f8832a;
                if (surfaceView != null && (viewGroup = (ViewGroup) surfaceView.getParent()) != null) {
                    viewGroup.removeView(surfaceView);
                }
                nVar.f6247k.remove(i3);
                try {
                    ((C0737a) eVar).f8832a.getHolder().getSurface().release();
                } catch (RuntimeException e2) {
                    Log.e("PlatformViewsController", "Disposing platform view threw an exception", e2);
                }
                if (nVar.c(i3)) {
                    HashMap hashMap = nVar.f6245i;
                    C c3 = (C) hashMap.get(Integer.valueOf(i3));
                    SurfaceView a3 = c3.a();
                    if (a3 != null) {
                        nVar.f6246j.remove(a3.getContext());
                    }
                    c3.f6186a.cancel();
                    c3.f6186a.detachState();
                    c3.f6193h.release();
                    c3.f6191f.release();
                    hashMap.remove(Integer.valueOf(i3));
                    return;
                }
                SparseArray sparseArray = nVar.f6250n;
                g gVar = (g) sparseArray.get(i3);
                if (gVar != null) {
                    gVar.removeAllViews();
                    f fVar = gVar.f6206r;
                    if (fVar != null) {
                        fVar.release();
                        gVar.f6206r = null;
                    }
                    ViewTreeObserver viewTreeObserver = gVar.getViewTreeObserver();
                    if (viewTreeObserver.isAlive() && (viewTreeObserver$OnGlobalFocusChangeListenerC0216a = gVar.f6207s) != null) {
                        gVar.f6207s = null;
                        viewTreeObserver.removeOnGlobalFocusChangeListener(viewTreeObserver$OnGlobalFocusChangeListenerC0216a);
                    }
                    ViewGroup viewGroup3 = (ViewGroup) gVar.getParent();
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(gVar);
                    }
                    sparseArray.remove(i3);
                    return;
                }
                SparseArray sparseArray2 = nVar.f6248l;
                b2.b bVar = (b2.b) sparseArray2.get(i3);
                if (bVar != null) {
                    bVar.removeAllViews();
                    bVar.a();
                    ViewGroup viewGroup4 = (ViewGroup) bVar.getParent();
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(bVar);
                    }
                    sparseArray2.remove(i3);
                    return;
                }
                return;
            default:
                m mVar = (m) this.f6219b;
                e eVar2 = (e) mVar.f6228i.get(i3);
                if (eVar2 == null) {
                    Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i3);
                    return;
                }
                SurfaceView surfaceView2 = ((C0737a) eVar2).f8832a;
                if (surfaceView2 != null && (viewGroup2 = (ViewGroup) surfaceView2.getParent()) != null) {
                    viewGroup2.removeView(surfaceView2);
                }
                mVar.f6228i.remove(i3);
                try {
                    ((C0737a) eVar2).f8832a.getHolder().getSurface().release();
                } catch (RuntimeException e3) {
                    Log.e("PlatformViewsController2", "Disposing platform view threw an exception", e3);
                }
                SparseArray sparseArray3 = mVar.f6229j;
                b2.b bVar2 = (b2.b) sparseArray3.get(i3);
                if (bVar2 != null) {
                    bVar2.removeAllViews();
                    bVar2.a();
                    ViewGroup viewGroup5 = (ViewGroup) bVar2.getParent();
                    if (viewGroup5 != null) {
                        viewGroup5.removeView(bVar2);
                    }
                    sparseArray3.remove(i3);
                    return;
                }
                return;
        }
    }

    public CharSequence f(f2.d dVar) {
        W1.d dVar2 = (W1.d) ((R0.j) this.f6219b).f2059n;
        ClipboardManager clipboardManager = (ClipboardManager) dVar2.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (dVar != null && dVar != f2.d.f5563m) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text == null) {
                    try {
                        Uri uri = itemAt.getUri();
                        if (uri == null) {
                            Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                        } else {
                            String scheme = uri.getScheme();
                            if (!scheme.equals("content")) {
                                Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                            } else {
                                AssetFileDescriptor openTypedAssetFileDescriptor = dVar2.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                                CharSequence coerceToText = itemAt.coerceToText(dVar2);
                                if (openTypedAssetFileDescriptor != null) {
                                    try {
                                        openTypedAssetFileDescriptor.close();
                                    } catch (IOException e2) {
                                        charSequence = coerceToText;
                                        e = e2;
                                        Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                        return charSequence;
                                    }
                                }
                                charSequence = coerceToText;
                            }
                        }
                        return charSequence;
                    } catch (IOException e3) {
                        e = e3;
                        charSequence = text;
                    }
                } else {
                    return text;
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (FileNotFoundException unused) {
            Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e5) {
            Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
            return null;
        }
    }

    public void g(int i3, double d3, double d4) {
        n nVar = (n) this.f6219b;
        if (nVar.c(i3)) {
            return;
        }
        g gVar = (g) nVar.f6250n.get(i3);
        if (gVar == null) {
            Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i3);
            return;
        }
        int o3 = nVar.o(d3);
        int o4 = nVar.o(d4);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gVar.getLayoutParams();
        layoutParams.topMargin = o3;
        layoutParams.leftMargin = o4;
        gVar.setLayoutParams(layoutParams);
    }

    @Override // io.flutter.plugin.platform.f
    public int getHeight() {
        return ((TextureRegistry$SurfaceProducer) this.f6219b).getHeight();
    }

    @Override // io.flutter.plugin.platform.f
    public Surface getSurface() {
        return ((TextureRegistry$SurfaceProducer) this.f6219b).getSurface();
    }

    @Override // io.flutter.plugin.platform.f
    public int getWidth() {
        return ((TextureRegistry$SurfaceProducer) this.f6219b).getWidth();
    }

    public void h(f2.j jVar) {
        n nVar = (n) this.f6219b;
        float f3 = nVar.f6239c.getResources().getDisplayMetrics().density;
        int i3 = jVar.f5589a;
        if (nVar.c(i3)) {
            MotionEvent n3 = nVar.n(f3, jVar, true);
            SingleViewPresentation singleViewPresentation = ((C) nVar.f6245i.get(Integer.valueOf(i3))).f6186a;
            if (singleViewPresentation != null) {
                singleViewPresentation.dispatchTouchEvent(n3);
                return;
            }
            return;
        }
        e eVar = (e) nVar.f6247k.get(i3);
        if (eVar == null) {
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i3);
            return;
        }
        SurfaceView surfaceView = ((C0737a) eVar).f8832a;
        if (surfaceView == null) {
            Log.e("PlatformViewsController", "Sending touch to a null view with id: " + i3);
            return;
        }
        surfaceView.dispatchTouchEvent(nVar.n(f3, jVar, false));
    }

    public void i(f2.j jVar) {
        m mVar = (m) this.f6219b;
        float f3 = mVar.f6222c.getResources().getDisplayMetrics().density;
        SparseArray sparseArray = mVar.f6228i;
        int i3 = jVar.f5589a;
        e eVar = (e) sparseArray.get(i3);
        if (eVar == null) {
            Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + i3);
            return;
        }
        SurfaceView surfaceView = ((C0737a) eVar).f8832a;
        if (surfaceView == null) {
            Log.e("PlatformViewsController2", "Sending touch to a null view with id: " + i3);
            return;
        }
        MotionEvent G3 = mVar.f6230k.G(new W1.B(jVar.f5604p));
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
        int i4 = jVar.f5593e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i4]);
        if (G3 != null) {
            if (pointerCoordsArr.length >= 1) {
                G3.offsetLocation(pointerCoordsArr[0].x - G3.getX(), pointerCoordsArr[0].y - G3.getY());
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (List list2 : (List) jVar.f5594f) {
                MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                pointerProperties.id = ((Integer) list2.get(0)).intValue();
                pointerProperties.toolType = ((Integer) list2.get(1)).intValue();
                arrayList2.add(pointerProperties);
            }
            G3 = MotionEvent.obtain(jVar.f5590b.longValue(), jVar.f5591c.longValue(), jVar.f5592d, jVar.f5593e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i4]), pointerCoordsArr, jVar.f5596h, jVar.f5597i, jVar.f5598j, jVar.f5599k, jVar.f5600l, jVar.f5601m, jVar.f5602n, jVar.f5603o);
        }
        surfaceView.dispatchTouchEvent(G3);
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [io.flutter.plugin.platform.k, java.lang.Runnable] */
    public void j(f2.i iVar, final f2.g gVar) {
        f fVar;
        n nVar = (n) this.f6219b;
        int o3 = nVar.o(iVar.f5587b);
        int o4 = nVar.o(iVar.f5588c);
        int i3 = iVar.f5586a;
        if (nVar.c(i3)) {
            final float j3 = nVar.j();
            final C c3 = (C) nVar.f6245i.get(Integer.valueOf(i3));
            io.flutter.plugin.editing.i iVar2 = nVar.f6242f;
            if (iVar2 != null) {
                if (iVar2.f6168e.f107b == 3) {
                    iVar2.f6179p = true;
                }
                SingleViewPresentation singleViewPresentation = c3.f6186a;
                if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
                    c3.f6186a.getView().getClass();
                }
            }
            ?? r3 = new Runnable() { // from class: io.flutter.plugin.platform.k
                @Override // java.lang.Runnable
                public final void run() {
                    float j4;
                    double d3;
                    n nVar2 = (n) l.this.f6219b;
                    io.flutter.plugin.editing.i iVar3 = nVar2.f6242f;
                    C c4 = c3;
                    if (iVar3 != null) {
                        if (iVar3.f6168e.f107b == 3) {
                            iVar3.f6179p = false;
                        }
                        SingleViewPresentation singleViewPresentation2 = c4.f6186a;
                        if (singleViewPresentation2 != null && singleViewPresentation2.getView() != null) {
                            c4.f6186a.getView().getClass();
                        }
                    }
                    if (nVar2.f6239c == null) {
                        j4 = j3;
                    } else {
                        j4 = nVar2.j();
                    }
                    int round = (int) Math.round(c4.f6191f.getHeight() / j4);
                    R1.f fVar2 = gVar.f5576a;
                    HashMap hashMap = new HashMap();
                    hashMap.put("width", Double.valueOf((int) Math.round(c4.f6191f.getWidth() / d3)));
                    hashMap.put("height", Double.valueOf(round));
                    fVar2.b(hashMap);
                }
            };
            int width = c3.f6191f.getWidth();
            f fVar2 = c3.f6191f;
            if (o3 == width && o4 == fVar2.getHeight()) {
                c3.a().postDelayed(r3, 0L);
                return;
            } else if (Build.VERSION.SDK_INT >= 31) {
                SurfaceView a3 = c3.a();
                fVar2.b(o3, o4);
                c3.f6193h.resize(o3, o4, c3.f6189d);
                c3.f6193h.setSurface(fVar2.getSurface());
                a3.postDelayed(r3, 0L);
                return;
            } else {
                boolean isFocused = c3.a().isFocused();
                s detachState = c3.f6186a.detachState();
                c3.f6193h.setSurface(null);
                c3.f6193h.release();
                DisplayManager displayManager = (DisplayManager) c3.f6187b.getSystemService("display");
                fVar2.b(o3, o4);
                c3.f6193h = displayManager.createVirtualDisplay("flutter-vd#" + c3.f6190e, o3, o4, c3.f6189d, fVar2.getSurface(), 0, C.f6185i, null);
                SurfaceView a4 = c3.a();
                a4.addOnAttachStateChangeListener(new A(a4, (k) r3));
                SingleViewPresentation singleViewPresentation2 = new SingleViewPresentation(c3.f6187b, c3.f6193h.getDisplay(), c3.f6188c, detachState, c3.f6192g, isFocused);
                singleViewPresentation2.show();
                c3.f6186a.cancel();
                c3.f6186a = singleViewPresentation2;
                return;
            }
        }
        e eVar = (e) nVar.f6247k.get(i3);
        g gVar2 = (g) nVar.f6250n.get(i3);
        if (eVar != null && gVar2 != null) {
            if ((o3 > gVar2.getRenderTargetWidth() || o4 > gVar2.getRenderTargetHeight()) && (fVar = gVar2.f6206r) != null) {
                fVar.b(o3, o4);
            }
            ViewGroup.LayoutParams layoutParams = gVar2.getLayoutParams();
            layoutParams.width = o3;
            layoutParams.height = o4;
            gVar2.setLayoutParams(layoutParams);
            SurfaceView surfaceView = ((C0737a) eVar).f8832a;
            if (surfaceView != null) {
                ViewGroup.LayoutParams layoutParams2 = surfaceView.getLayoutParams();
                layoutParams2.width = o3;
                layoutParams2.height = o4;
                surfaceView.setLayoutParams(layoutParams2);
            }
            int round = (int) Math.round(gVar2.getRenderTargetWidth() / nVar.j());
            int round2 = (int) Math.round(gVar2.getRenderTargetHeight() / nVar.j());
            R1.f fVar3 = gVar.f5576a;
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(round));
            hashMap.put("height", Double.valueOf(round2));
            fVar3.b(hashMap);
            return;
        }
        Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i3);
    }

    public void k(int i3, int i4) {
        SurfaceView surfaceView;
        switch (this.f6218a) {
            case 0:
                if (i4 != 0 && i4 != 1) {
                    throw new IllegalStateException("Trying to set unknown direction value: " + i4 + "(view id: " + i3 + ")");
                }
                n nVar = (n) this.f6219b;
                if (nVar.c(i3)) {
                    surfaceView = ((C) nVar.f6245i.get(Integer.valueOf(i3))).a();
                } else {
                    e eVar = (e) nVar.f6247k.get(i3);
                    if (eVar == null) {
                        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i3);
                        return;
                    }
                    surfaceView = ((C0737a) eVar).f8832a;
                }
                if (surfaceView == null) {
                    Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i3);
                    return;
                }
                surfaceView.setLayoutDirection(i4);
                return;
            default:
                e eVar2 = (e) ((m) this.f6219b).f6228i.get(i3);
                if (eVar2 == null) {
                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + i3);
                    return;
                }
                SurfaceView surfaceView2 = ((C0737a) eVar2).f8832a;
                if (surfaceView2 == null) {
                    Log.e("PlatformViewsController2", "Setting direction to a null view with id: " + i3);
                    return;
                }
                surfaceView2.setLayoutDirection(i4);
                return;
        }
    }

    public void l(ArrayList arrayList) {
        int i3;
        R0.j jVar = (R0.j) this.f6219b;
        jVar.getClass();
        if (arrayList.size() == 0) {
            i3 = 5894;
        } else {
            i3 = 1798;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            int ordinal = ((f2.f) arrayList.get(i4)).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i3 &= -515;
                }
            } else {
                i3 &= -5;
            }
        }
        jVar.f2058m = i3;
        jVar.f();
    }

    public void m(int i3) {
        View decorView = ((W1.d) ((R0.j) this.f6219b).f2059n).getWindow().getDecorView();
        int b3 = N.j.b(i3);
        if (b3 != 0) {
            if (b3 != 1) {
                if (b3 != 2) {
                    if (b3 != 3) {
                        if (b3 == 4) {
                            decorView.performHapticFeedback(4);
                            return;
                        }
                        return;
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        decorView.performHapticFeedback(6);
                        return;
                    } else {
                        return;
                    }
                }
                decorView.performHapticFeedback(3);
                return;
            }
            decorView.performHapticFeedback(1);
            return;
        }
        decorView.performHapticFeedback(0);
    }

    @Override // io.flutter.plugin.platform.f
    public void release() {
        ((TextureRegistry$SurfaceProducer) this.f6219b).release();
        this.f6219b = null;
    }

    @Override // io.flutter.plugin.platform.f
    public void scheduleFrame() {
        ((TextureRegistry$SurfaceProducer) this.f6219b).scheduleFrame();
    }

    public l(int i3) {
        this.f6218a = i3;
        switch (i3) {
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return;
            default:
                this.f6219b = new HashMap();
                return;
        }
    }
}
