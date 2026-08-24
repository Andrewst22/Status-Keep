package l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
/* loaded from: classes.dex */
public final class U implements TextWatcher {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ SearchView f7785m;

    public U(SearchView searchView) {
        this.f7785m = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        SearchView searchView = this.f7785m;
        Editable text = searchView.f3994B.getText();
        searchView.f4025k0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int i6 = 8;
        if (searchView.f4024j0 && !searchView.f4017c0 && isEmpty) {
            searchView.f3999G.setVisibility(8);
            i6 = 0;
        }
        searchView.f4001I.setVisibility(i6);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
    }
}
