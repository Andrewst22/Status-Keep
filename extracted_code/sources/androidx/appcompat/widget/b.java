package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ SearchView f4115m;

    public b(SearchView searchView) {
        this.f4115m = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        int length;
        SearchView searchView = this.f4115m;
        if (searchView.f4028n0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f3994B;
        if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
            if (searchView.f4028n0 != null && searchView.f4018d0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i3 != 66 && i3 != 84 && i3 != 61) {
                    if (i3 != 21 && i3 != 22) {
                        if (i3 == 19) {
                            searchAutoComplete.getListSelection();
                        }
                    } else {
                        if (i3 == 21) {
                            length = 0;
                        } else {
                            length = searchAutoComplete.length();
                        }
                        searchAutoComplete.setSelection(length);
                        searchAutoComplete.setListSelection(0);
                        searchAutoComplete.clearListSelection();
                        Method method = SearchView.f3993s0.f7795c;
                        if (method == null) {
                            return true;
                        }
                        try {
                            method.invoke(searchAutoComplete, Boolean.TRUE);
                            return true;
                        } catch (Exception unused) {
                            return true;
                        }
                    }
                } else {
                    searchView.l(searchAutoComplete.getListSelection());
                    return true;
                }
            }
            return false;
        } else if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i3 != 66) {
            return false;
        } else {
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.h("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
    }
}
