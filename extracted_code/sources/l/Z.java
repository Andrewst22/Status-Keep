package l;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
/* loaded from: classes.dex */
public final class Z implements AdapterView.OnItemClickListener {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ SearchView f7791m;

    public Z(SearchView searchView) {
        this.f7791m = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        this.f7791m.l(i3);
    }
}
