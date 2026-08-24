package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import f2.p;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class e extends SpannableStringBuilder {

    /* renamed from: m  reason: collision with root package name */
    public int f6141m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f6142n = 0;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f6143o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f6144p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f6145q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public String f6146r;

    /* renamed from: s  reason: collision with root package name */
    public String f6147s;

    /* renamed from: t  reason: collision with root package name */
    public int f6148t;

    /* renamed from: u  reason: collision with root package name */
    public int f6149u;

    /* renamed from: v  reason: collision with root package name */
    public int f6150v;

    /* renamed from: w  reason: collision with root package name */
    public int f6151w;
    public final c x;

    public e(p pVar, View view) {
        this.x = new c(view, this);
        if (pVar != null) {
            f(pVar);
        }
    }

    public final void a(d dVar) {
        if (this.f6142n > 0) {
            Log.e("ListenableEditingState", "adding a listener " + dVar.toString() + " in a listener callback");
        }
        if (this.f6141m > 0) {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f6144p.add(dVar);
            return;
        }
        this.f6143o.add(dVar);
    }

    public final void b() {
        this.f6141m++;
        if (this.f6142n > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f6141m == 1 && !this.f6143o.isEmpty()) {
            this.f6147s = toString();
            this.f6148t = Selection.getSelectionStart(this);
            this.f6149u = Selection.getSelectionEnd(this);
            this.f6150v = BaseInputConnection.getComposingSpanStart(this);
            this.f6151w = BaseInputConnection.getComposingSpanEnd(this);
        }
    }

    public final void c() {
        boolean z3;
        int i3 = this.f6141m;
        if (i3 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f6143o;
        ArrayList arrayList2 = this.f6144p;
        if (i3 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                this.f6142n++;
                ((d) it.next()).a(true);
                this.f6142n--;
            }
            if (!arrayList.isEmpty()) {
                String.valueOf(arrayList.size());
                boolean z4 = !toString().equals(this.f6147s);
                boolean z5 = false;
                if (this.f6148t == Selection.getSelectionStart(this) && this.f6149u == Selection.getSelectionEnd(this)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                d(z4, z3, (this.f6150v == BaseInputConnection.getComposingSpanStart(this) && this.f6151w == BaseInputConnection.getComposingSpanEnd(this)) ? true : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f6141m--;
    }

    public final void d(boolean z3, boolean z4, boolean z5) {
        if (z3 || z4 || z5) {
            Iterator it = this.f6143o.iterator();
            while (it.hasNext()) {
                this.f6142n++;
                ((d) it.next()).a(z3);
                this.f6142n--;
            }
        }
    }

    public final void e(d dVar) {
        if (this.f6142n > 0) {
            Log.e("ListenableEditingState", "removing a listener " + dVar.toString() + " in a listener callback");
        }
        this.f6143o.remove(dVar);
        if (this.f6141m > 0) {
            this.f6144p.remove(dVar);
        }
    }

    public final void f(p pVar) {
        int i3;
        b();
        replace(0, length(), (CharSequence) pVar.f5631a);
        int i4 = pVar.f5632b;
        if (i4 >= 0) {
            Selection.setSelection(this, i4, pVar.f5633c);
        } else {
            Selection.removeSelection(this);
        }
        int i5 = pVar.f5634d;
        if (i5 >= 0 && i5 < (i3 = pVar.f5635e)) {
            this.x.setComposingRegion(i5, i3);
        } else {
            BaseInputConnection.removeComposingSpans(this);
        }
        this.f6145q.clear();
        c();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [io.flutter.plugin.editing.g, java.lang.Object] */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i3, int i4, int i5) {
        super.setSpan(obj, i3, i4, i5);
        ArrayList arrayList = this.f6145q;
        String eVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        ?? obj2 = new Object();
        obj2.f6160e = selectionStart;
        obj2.f6161f = selectionEnd;
        obj2.f6162g = composingSpanStart;
        obj2.f6163h = composingSpanEnd;
        obj2.f6156a = eVar;
        obj2.f6157b = "";
        obj2.f6158c = -1;
        obj2.f6159d = -1;
        arrayList.add(obj2);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f6146r;
        if (str == null) {
            String spannableStringBuilder = super.toString();
            this.f6146r = spannableStringBuilder;
            return spannableStringBuilder;
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [io.flutter.plugin.editing.g, java.lang.Object] */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence, int i5, int i6) {
        if (this.f6142n > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String eVar = toString();
        int i7 = i4 - i3;
        boolean z3 = i7 != i6 - i5;
        for (int i8 = 0; i8 < i7 && !z3; i8++) {
            z3 |= charAt(i3 + i8) != charSequence.charAt(i5 + i8);
        }
        if (z3) {
            this.f6146r = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i3, i4, charSequence, i5, i6);
        ArrayList arrayList = this.f6145q;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        ?? obj = new Object();
        obj.f6160e = selectionStart2;
        obj.f6161f = selectionEnd2;
        obj.f6162g = composingSpanStart2;
        obj.f6163h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        obj.f6156a = eVar;
        obj.f6157b = charSequence2;
        obj.f6158c = i3;
        obj.f6159d = i4;
        arrayList.add(obj);
        if (this.f6141m > 0) {
            return replace;
        }
        d(z3, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
