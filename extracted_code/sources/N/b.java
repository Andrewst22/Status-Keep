package N;

import W1.m;
import android.content.Context;
import java.io.File;
import r1.C0760b;
import s1.InterfaceC0801a;
import s2.C0808g;
/* loaded from: classes.dex */
public final class b extends D2.j implements C2.a {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f1102n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f1103o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f1104p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, Object obj, Object obj2) {
        super(0);
        this.f1102n = i3;
        this.f1103o = obj;
        this.f1104p = obj2;
    }

    @Override // C2.a
    public final Object c() {
        switch (this.f1102n) {
            case 0:
                ((c) this.f1104p).getClass();
                String concat = "FlutterSharedPreferences".concat(".preferences_pb");
                D2.i.e(concat, "fileName");
                return new File(((Context) this.f1103o).getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            default:
                ((InterfaceC0801a) ((C0760b) this.f1103o).f9010n).a((m) this.f1104p);
                return C0808g.f9229a;
        }
    }
}
