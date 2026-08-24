package io.flutter.plugin.editing;

import C.C0009j;
import K.C0059m;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import e0.C0262c;
import f2.n;
import f2.p;
import g2.r;
import io.flutter.plugin.platform.m;
/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    public final View f6164a;

    /* renamed from: b  reason: collision with root package name */
    public final InputMethodManager f6165b;

    /* renamed from: c  reason: collision with root package name */
    public final AutofillManager f6166c;

    /* renamed from: d  reason: collision with root package name */
    public final B1.a f6167d;

    /* renamed from: e  reason: collision with root package name */
    public C0009j f6168e = new C0009j(1, 0, 6);

    /* renamed from: f  reason: collision with root package name */
    public n f6169f;

    /* renamed from: g  reason: collision with root package name */
    public SparseArray f6170g;

    /* renamed from: h  reason: collision with root package name */
    public e f6171h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6172i;

    /* renamed from: j  reason: collision with root package name */
    public InputConnection f6173j;

    /* renamed from: k  reason: collision with root package name */
    public final io.flutter.plugin.platform.n f6174k;

    /* renamed from: l  reason: collision with root package name */
    public final m f6175l;

    /* renamed from: m  reason: collision with root package name */
    public Rect f6176m;

    /* renamed from: n  reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f6177n;

    /* renamed from: o  reason: collision with root package name */
    public p f6178o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6179p;

    public i(View view, B1.a aVar, C0262c c0262c, io.flutter.plugin.platform.n nVar, m mVar) {
        Object systemService;
        this.f6164a = view;
        this.f6171h = new e(null, view);
        this.f6165b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            systemService = view.getContext().getSystemService(com.dexterous.flutterlocalnotifications.b.l());
            this.f6166c = com.dexterous.flutterlocalnotifications.b.h(systemService);
        } else {
            this.f6166c = null;
        }
        if (i3 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f6177n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f6167d = aVar;
        aVar.f51o = new C0262c(this, 28);
        ((r) aVar.f50n).a("TextInputClient.requestExistingInputState", null, null);
        this.f6174k = nVar;
        nVar.f6242f = this;
        this.f6175l = mVar;
        mVar.f6225f = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r10 == r0.f5635e) goto L42;
     */
    @Override // io.flutter.plugin.editing.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r17) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.i.a(boolean):void");
    }

    public final void b(int i3) {
        C0009j c0009j = this.f6168e;
        int i4 = c0009j.f107b;
        if ((i4 == 3 || i4 == 4) && c0009j.f108c == i3) {
            this.f6168e = new C0009j(1, 0, 6);
            d();
            View view = this.f6164a;
            IBinder applicationWindowToken = view.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.f6165b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(view);
            this.f6172i = false;
        }
    }

    public final void c() {
        this.f6174k.f6242f = null;
        this.f6175l.f6225f = null;
        this.f6167d.f51o = null;
        d();
        this.f6171h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f6177n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void d() {
        AutofillManager autofillManager;
        n nVar;
        C0059m c0059m;
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f6166c) != null && (nVar = this.f6169f) != null && (c0059m = nVar.f5625j) != null && this.f6170g != null) {
            autofillManager.notifyViewExited(this.f6164a, ((String) c0059m.f650m).hashCode());
        }
    }

    public final void e(n nVar) {
        C0059m c0059m;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (nVar != null && (c0059m = nVar.f5625j) != null) {
            SparseArray sparseArray = new SparseArray();
            this.f6170g = sparseArray;
            n[] nVarArr = nVar.f5627l;
            if (nVarArr == null) {
                sparseArray.put(((String) c0059m.f650m).hashCode(), nVar);
                return;
            }
            for (n nVar2 : nVarArr) {
                C0059m c0059m2 = nVar2.f5625j;
                if (c0059m2 != null) {
                    SparseArray sparseArray2 = this.f6170g;
                    String str = (String) c0059m2.f650m;
                    sparseArray2.put(str.hashCode(), nVar2);
                    AutofillManager autofillManager = this.f6166c;
                    int hashCode = str.hashCode();
                    forText = AutofillValue.forText(((p) c0059m2.f652o).f5631a);
                    autofillManager.notifyValueChanged(this.f6164a, hashCode, forText);
                }
            }
            return;
        }
        this.f6170g = null;
    }
}
