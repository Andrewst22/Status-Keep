package androidx.appcompat.widget;

import B1.e;
import C.y;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.example.flutter_application_1.R;
import e.AbstractC0259a;
import j.InterfaceC0512a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.AbstractC0575m;
import l.E;
import l.G;
import l.U;
import l.V;
import l.W;
import l.X;
import l.Y;
import l.Z;
import l.a0;
import l.b0;
import l.c0;
import l.d0;
import l.e0;
import l.f0;
import l.h0;
/* loaded from: classes.dex */
public class SearchView extends E implements InterfaceC0512a {

    /* renamed from: s0  reason: collision with root package name */
    public static final a0 f3993s0;

    /* renamed from: B  reason: collision with root package name */
    public final SearchAutoComplete f3994B;

    /* renamed from: C  reason: collision with root package name */
    public final View f3995C;

    /* renamed from: D  reason: collision with root package name */
    public final View f3996D;

    /* renamed from: E  reason: collision with root package name */
    public final View f3997E;

    /* renamed from: F  reason: collision with root package name */
    public final ImageView f3998F;

    /* renamed from: G  reason: collision with root package name */
    public final ImageView f3999G;

    /* renamed from: H  reason: collision with root package name */
    public final ImageView f4000H;

    /* renamed from: I  reason: collision with root package name */
    public final ImageView f4001I;

    /* renamed from: J  reason: collision with root package name */
    public final View f4002J;

    /* renamed from: K  reason: collision with root package name */
    public f0 f4003K;
    public final Rect L;

    /* renamed from: M  reason: collision with root package name */
    public final Rect f4004M;

    /* renamed from: N  reason: collision with root package name */
    public final int[] f4005N;

    /* renamed from: O  reason: collision with root package name */
    public final int[] f4006O;

    /* renamed from: P  reason: collision with root package name */
    public final ImageView f4007P;

    /* renamed from: Q  reason: collision with root package name */
    public final Drawable f4008Q;

    /* renamed from: R  reason: collision with root package name */
    public final int f4009R;

    /* renamed from: S  reason: collision with root package name */
    public final int f4010S;

    /* renamed from: T  reason: collision with root package name */
    public final Intent f4011T;

    /* renamed from: U  reason: collision with root package name */
    public final Intent f4012U;

    /* renamed from: V  reason: collision with root package name */
    public final CharSequence f4013V;

    /* renamed from: W  reason: collision with root package name */
    public View.OnFocusChangeListener f4014W;

    /* renamed from: a0  reason: collision with root package name */
    public View.OnClickListener f4015a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f4016b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f4017c0;

    /* renamed from: d0  reason: collision with root package name */
    public I.c f4018d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f4019e0;

    /* renamed from: f0  reason: collision with root package name */
    public CharSequence f4020f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f4021g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f4022h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f4023i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f4024j0;

    /* renamed from: k0  reason: collision with root package name */
    public CharSequence f4025k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f4026l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f4027m0;

    /* renamed from: n0  reason: collision with root package name */
    public SearchableInfo f4028n0;

    /* renamed from: o0  reason: collision with root package name */
    public Bundle f4029o0;

    /* renamed from: p0  reason: collision with root package name */
    public final V f4030p0;

    /* renamed from: q0  reason: collision with root package name */
    public final V f4031q0;

    /* renamed from: r0  reason: collision with root package name */
    public final WeakHashMap f4032r0;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends AbstractC0575m {

        /* renamed from: p  reason: collision with root package name */
        public int f4033p;

        /* renamed from: q  reason: collision with root package name */
        public SearchView f4034q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f4035r;

        /* renamed from: s  reason: collision with root package name */
        public final c f4036s;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4036s = new c(this);
            this.f4033p = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i3 = configuration.screenWidthDp;
            int i4 = configuration.screenHeightDp;
            if (i3 >= 960 && i4 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i3 < 600) {
                if (i3 < 640 || i4 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.f4033p > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // l.AbstractC0575m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f4035r) {
                c cVar = this.f4036s;
                removeCallbacks(cVar);
                post(cVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z3, int i3, Rect rect) {
            super.onFocusChanged(z3, i3, rect);
            SearchView searchView = this.f4034q;
            searchView.u(searchView.f4017c0);
            searchView.post(searchView.f4030p0);
            if (searchView.f3994B.hasFocus()) {
                searchView.j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i3, KeyEvent keyEvent) {
            if (i3 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f4034q.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i3, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z3) {
            Method method;
            super.onWindowFocusChanged(z3);
            if (z3 && this.f4034q.hasFocus() && getVisibility() == 0) {
                this.f4035r = true;
                Context context = getContext();
                a0 a0Var = SearchView.f3993s0;
                if (context.getResources().getConfiguration().orientation == 2 && (method = SearchView.f3993s0.f7795c) != null) {
                    try {
                        method.invoke(this, Boolean.TRUE);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z3) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.f4036s;
            if (!z3) {
                this.f4035r = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f4035r = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f4035r = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f4034q = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i3) {
            super.setThreshold(i3);
            this.f4033p = i3;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.a0, java.lang.Object] */
    static {
        ?? obj = new Object();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            obj.f7793a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            obj.f7794b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            obj.f7795c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
        f3993s0 = obj;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.f3994B;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f4022h0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f3994B;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f4022h0 = false;
    }

    public int getImeOptions() {
        return this.f3994B.getImeOptions();
    }

    public int getInputType() {
        return this.f3994B.getInputType();
    }

    public int getMaxWidth() {
        return this.f4023i0;
    }

    public CharSequence getQuery() {
        return this.f3994B.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f4020f0;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f4028n0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f4028n0.getHintId());
            }
            return this.f4013V;
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.f4010S;
    }

    public int getSuggestionRowLayout() {
        return this.f4009R;
    }

    public I.c getSuggestionsAdapter() {
        return this.f4018d0;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f4025k0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f4029o0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f4028n0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i3;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4029o0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i3 = searchableInfo.getVoiceMaxResults();
        } else {
            i3 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i3);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void j() {
        int i3 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f3994B;
        if (i3 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        a0 a0Var = f3993s0;
        Method method = a0Var.f7793a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        Method method2 = a0Var.f7794b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f3994B;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.f4016b0) {
                clearFocus();
                u(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    public final void l(int i3) {
        int i4;
        Uri parse;
        String h3;
        Cursor cursor = this.f4018d0.f445o;
        if (cursor != null && cursor.moveToPosition(i3)) {
            Intent intent = null;
            try {
                int i5 = h0.f7815K;
                String h4 = h0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h4 == null) {
                    h4 = this.f4028n0.getSuggestIntentAction();
                }
                if (h4 == null) {
                    h4 = "android.intent.action.SEARCH";
                }
                String h5 = h0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h5 == null) {
                    h5 = this.f4028n0.getSuggestIntentData();
                }
                if (h5 != null && (h3 = h0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h5 = h5 + "/" + Uri.encode(h3);
                }
                if (h5 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(h5);
                }
                intent = h(h4, parse, h0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), h0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    i4 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i4 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i4 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f3994B;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int i3) {
        Editable text = this.f3994B.getText();
        Cursor cursor = this.f4018d0.f445o;
        if (cursor != null) {
            if (cursor.moveToPosition(i3)) {
                String c3 = this.f4018d0.c(cursor);
                if (c3 != null) {
                    setQuery(c3);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f3994B;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f4028n0 != null) {
                getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f4030p0);
        post(this.f4031q0);
        super.onDetachedFromWindow();
    }

    @Override // l.E, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        if (z3) {
            int[] iArr = this.f4005N;
            SearchAutoComplete searchAutoComplete = this.f3994B;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f4006O;
            getLocationInWindow(iArr2);
            int i7 = iArr[1] - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            Rect rect = this.L;
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            int i9 = rect.left;
            int i10 = rect.right;
            int i11 = i6 - i4;
            Rect rect2 = this.f4004M;
            rect2.set(i9, 0, i10, i11);
            f0 f0Var = this.f4003K;
            if (f0Var == null) {
                f0 f0Var2 = new f0(rect2, rect, searchAutoComplete);
                this.f4003K = f0Var2;
                setTouchDelegate(f0Var2);
                return;
            }
            f0Var.f7803b.set(rect2);
            Rect rect3 = f0Var.f7805d;
            rect3.set(rect2);
            int i12 = -f0Var.f7806e;
            rect3.inset(i12, i12);
            f0Var.f7804c.set(rect);
        }
    }

    @Override // l.E, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.f4017c0) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i5 = this.f4023i0) > 0) {
                    size = Math.min(i5, size);
                }
            } else {
                size = this.f4023i0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i6 = this.f4023i0;
            size = i6 > 0 ? Math.min(i6, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e0 e0Var = (e0) parcelable;
        super.onRestoreInstanceState(e0Var.f482m);
        u(e0Var.f7799o);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, l.e0, J.c] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? cVar = new J.c(super.onSaveInstanceState());
        cVar.f7799o = this.f4017c0;
        return cVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        post(this.f4030p0);
    }

    public final void p() {
        int i3;
        int[] iArr;
        boolean isEmpty = TextUtils.isEmpty(this.f3994B.getText());
        if (isEmpty && (!this.f4016b0 || this.f4026l0)) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        ImageView imageView = this.f4000H;
        imageView.setVisibility(i3);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (!isEmpty) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final void q() {
        int[] iArr;
        if (this.f3994B.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f3996D.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f3997E.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void r() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z3 = this.f4016b0;
        SearchAutoComplete searchAutoComplete = this.f3994B;
        if (z3 && (drawable = this.f4008Q) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i3, Rect rect) {
        if (this.f4022h0 || !isFocusable()) {
            return false;
        }
        if (!this.f4017c0) {
            boolean requestFocus = this.f3994B.requestFocus(i3, rect);
            if (requestFocus) {
                u(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i3, rect);
    }

    public final void s() {
        int i3;
        if ((this.f4019e0 || this.f4024j0) && !this.f4017c0 && (this.f3999G.getVisibility() == 0 || this.f4001I.getVisibility() == 0)) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f3997E.setVisibility(i3);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f4029o0 = bundle;
    }

    public void setIconified(boolean z3) {
        if (z3) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f3994B;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f4015a0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z3) {
        if (this.f4016b0 == z3) {
            return;
        }
        this.f4016b0 = z3;
        u(z3);
        r();
    }

    public void setImeOptions(int i3) {
        this.f3994B.setImeOptions(i3);
    }

    public void setInputType(int i3) {
        this.f3994B.setInputType(i3);
    }

    public void setMaxWidth(int i3) {
        this.f4023i0 = i3;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f4014W = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f4015a0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f4020f0 = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z3) {
        int i3;
        this.f4021g0 = z3;
        I.c cVar = this.f4018d0;
        if (cVar instanceof h0) {
            h0 h0Var = (h0) cVar;
            if (z3) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            h0Var.f7818C = i3;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        int i3;
        this.f4028n0 = searchableInfo;
        Intent intent = null;
        boolean z3 = true;
        SearchAutoComplete searchAutoComplete = this.f3994B;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f4028n0.getImeOptions());
            int inputType = this.f4028n0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f4028n0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            I.c cVar = this.f4018d0;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.f4028n0.getSuggestAuthority() != null) {
                h0 h0Var = new h0(getContext(), this, this.f4028n0, this.f4032r0);
                this.f4018d0 = h0Var;
                searchAutoComplete.setAdapter(h0Var);
                h0 h0Var2 = (h0) this.f4018d0;
                if (this.f4021g0) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                h0Var2.f7818C = i3;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f4028n0;
        boolean z4 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f4028n0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f4011T;
            } else if (this.f4028n0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f4012U;
            }
            if (intent != null) {
                if (getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                    z3 = false;
                }
                z4 = z3;
            }
        }
        this.f4024j0 = z4;
        if (z4) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f4017c0);
    }

    public void setSubmitButtonEnabled(boolean z3) {
        this.f4019e0 = z3;
        u(this.f4017c0);
    }

    public void setSuggestionsAdapter(I.c cVar) {
        this.f4018d0 = cVar;
        this.f3994B.setAdapter(cVar);
    }

    public final void t(boolean z3) {
        int i3;
        boolean z4 = this.f4019e0;
        if (z4 && ((z4 || this.f4024j0) && !this.f4017c0 && hasFocus() && (z3 || !this.f4024j0))) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f3999G.setVisibility(i3);
    }

    public final void u(boolean z3) {
        int i3;
        int i4;
        int i5;
        this.f4017c0 = z3;
        int i6 = 8;
        if (z3) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f3994B.getText());
        this.f3998F.setVisibility(i3);
        t(!isEmpty);
        if (z3) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        this.f3995C.setVisibility(i4);
        ImageView imageView = this.f4007P;
        if (imageView.getDrawable() != null && !this.f4016b0) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        imageView.setVisibility(i5);
        p();
        if (this.f4024j0 && !this.f4017c0 && isEmpty) {
            this.f3999G.setVisibility(8);
            i6 = 0;
        }
        this.f4001I.setVisibility(i6);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.L = new Rect();
        this.f4004M = new Rect();
        this.f4005N = new int[2];
        this.f4006O = new int[2];
        this.f4030p0 = new V(this, 0);
        this.f4031q0 = new V(this, 1);
        this.f4032r0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        Y y3 = new Y(this);
        Z z3 = new Z(this);
        G g3 = new G(this, 1);
        U u3 = new U(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0259a.f5208q, i3, 0);
        e eVar = new e(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f3994B = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f3995C = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f3996D = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f3997E = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f3998F = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f3999G = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f4000H = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f4001I = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f4007P = imageView5;
        Drawable b02 = eVar.b0(10);
        Field field = y.f117a;
        findViewById.setBackground(b02);
        findViewById2.setBackground(eVar.b0(14));
        imageView.setImageDrawable(eVar.b0(13));
        imageView2.setImageDrawable(eVar.b0(7));
        imageView3.setImageDrawable(eVar.b0(4));
        imageView4.setImageDrawable(eVar.b0(16));
        imageView5.setImageDrawable(eVar.b0(13));
        this.f4008Q = eVar.b0(12);
        android.support.v4.media.session.a.S(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f4009R = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f4010S = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(u3);
        searchAutoComplete.setOnEditorActionListener(y3);
        searchAutoComplete.setOnItemClickListener(z3);
        searchAutoComplete.setOnItemSelectedListener(g3);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new W(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f4013V = obtainStyledAttributes.getText(6);
        this.f4020f0 = obtainStyledAttributes.getText(11);
        int i4 = obtainStyledAttributes.getInt(3, -1);
        if (i4 != -1) {
            setImeOptions(i4);
        }
        int i5 = obtainStyledAttributes.getInt(2, -1);
        if (i5 != -1) {
            setInputType(i5);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        eVar.r0();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f4011T = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f4012U = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f4002J = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new X(this));
        }
        u(this.f4016b0);
        r();
    }

    public void setOnCloseListener(b0 b0Var) {
    }

    public void setOnQueryTextListener(c0 c0Var) {
    }

    public void setOnSuggestionListener(d0 d0Var) {
    }
}
