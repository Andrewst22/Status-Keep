package io.flutter.plugin.platform;

import android.app.Presentation;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import d.InterfaceC0249a;
import p2.C0737a;
/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC0249a
/* loaded from: classes.dex */
public class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final C0322a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private p rootView;
    private boolean startFocused;
    private final s state;
    private int viewId;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, io.flutter.plugin.platform.s] */
    public SingleViewPresentation(Context context, Display display, e eVar, C0322a c0322a, int i3, View.OnFocusChangeListener onFocusChangeListener) {
        super(new q(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c0322a;
        this.viewId = i3;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        ?? obj = new Object();
        this.state = obj;
        obj.f6267a = eVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public s detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        p pVar = this.rootView;
        if (pVar != null) {
            pVar.removeAllViews();
        }
        return this.state;
    }

    public e getView() {
        return this.state.f6267a;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        s sVar = this.state;
        if (sVar.f6269c == null) {
            sVar.f6269c = new o(getContext());
        }
        if (this.state.f6268b == null) {
            s sVar2 = this.state;
            sVar2.f6268b = new D((WindowManager) getContext().getSystemService("window"), sVar2.f6269c);
        }
        this.container = new FrameLayout(getContext());
        r rVar = new r(getContext(), this.state.f6268b, this.outerContext);
        SurfaceView surfaceView = ((C0737a) this.state.f6267a).f8832a;
        if (surfaceView.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) surfaceView.getContext()).setBaseContext(rVar);
        } else {
            Log.w(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(surfaceView);
        p pVar = new p(getContext(), this.accessibilityEventsDelegate, surfaceView);
        this.rootView = pVar;
        pVar.addView(this.container);
        this.rootView.addView(this.state.f6269c);
        surfaceView.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            surfaceView.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(Context context, Display display, C0322a c0322a, s sVar, View.OnFocusChangeListener onFocusChangeListener, boolean z3) {
        super(new q(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = c0322a;
        this.state = sVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z3;
    }
}
