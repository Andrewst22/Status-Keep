package l;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
/* loaded from: classes.dex */
public final class G implements AdapterView.OnItemSelectedListener {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7731m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f7732n;

    public /* synthetic */ G(Object obj, int i3) {
        this.f7731m = i3;
        this.f7732n = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
        M m3;
        switch (this.f7731m) {
            case 0:
                if (i3 != -1 && (m3 = ((K) this.f7732n).f7750o) != null) {
                    m3.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f7732n).m(i3);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i3 = this.f7731m;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
