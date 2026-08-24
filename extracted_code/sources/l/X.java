package l;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.example.flutter_application_1.R;
/* loaded from: classes.dex */
public final class X implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f7789a;

    public X(SearchView searchView) {
        this.f7789a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        SearchView searchView = this.f7789a;
        View view2 = searchView.f4002J;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f3996D.getPaddingLeft();
            Rect rect = new Rect();
            boolean a3 = y0.a(searchView);
            if (searchView.f4016b0) {
                i11 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            } else {
                i11 = 0;
            }
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f3994B;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            if (a3) {
                i12 = -rect.left;
            } else {
                i12 = paddingLeft - (rect.left + i11);
            }
            searchAutoComplete.setDropDownHorizontalOffset(i12);
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i11) - paddingLeft);
        }
    }
}
