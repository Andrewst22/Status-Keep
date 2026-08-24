package n0;

import R.C0113p;
import R.O;
import j0.InterfaceC0515a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class c implements InterfaceC0515a {

    /* renamed from: a  reason: collision with root package name */
    public final int f8359a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8360b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8361c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8362d;

    /* renamed from: e  reason: collision with root package name */
    public final C0656a f8363e;

    /* renamed from: f  reason: collision with root package name */
    public final b[] f8364f;

    /* renamed from: g  reason: collision with root package name */
    public final long f8365g;

    /* renamed from: h  reason: collision with root package name */
    public final long f8366h;

    public c(int i3, int i4, long j3, long j4, int i5, boolean z3, C0656a c0656a, b[] bVarArr) {
        this.f8359a = i3;
        this.f8360b = i4;
        this.f8365g = j3;
        this.f8366h = j4;
        this.f8361c = i5;
        this.f8362d = z3;
        this.f8363e = c0656a;
        this.f8364f = bVarArr;
    }

    @Override // j0.InterfaceC0515a
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            O o3 = (O) arrayList.get(i3);
            b bVar2 = this.f8364f[o3.f1793n];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.a((C0113p[]) arrayList3.toArray(new C0113p[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f8352j[o3.f1794o]);
            i3++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((C0113p[]) arrayList3.toArray(new C0113p[0])));
        }
        long j3 = this.f8366h;
        int i4 = this.f8361c;
        return new c(this.f8359a, this.f8360b, this.f8365g, j3, i4, this.f8362d, this.f8363e, (b[]) arrayList2.toArray(new b[0]));
    }
}
