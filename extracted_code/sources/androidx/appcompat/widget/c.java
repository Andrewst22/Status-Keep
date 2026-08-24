package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f4116m;

    public c(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f4116m = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f4116m;
        if (searchAutoComplete.f4035r) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f4035r = false;
        }
    }
}
