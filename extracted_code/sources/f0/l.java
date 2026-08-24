package f0;

import R.C0113p;
import R.O;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: l  reason: collision with root package name */
    public static final l f5482l = new l("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d  reason: collision with root package name */
    public final List f5483d;

    /* renamed from: e  reason: collision with root package name */
    public final List f5484e;

    /* renamed from: f  reason: collision with root package name */
    public final List f5485f;

    /* renamed from: g  reason: collision with root package name */
    public final List f5486g;

    /* renamed from: h  reason: collision with root package name */
    public final C0113p f5487h;

    /* renamed from: i  reason: collision with root package name */
    public final List f5488i;

    /* renamed from: j  reason: collision with root package name */
    public final Map f5489j;

    /* renamed from: k  reason: collision with root package name */
    public final List f5490k;

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, C0113p c0113p, List list7, boolean z3, Map map, List list8) {
        super(str, list, z3);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list2.size(); i3++) {
            Uri uri = ((k) list2.get(i3)).f5476a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f5483d = Collections.unmodifiableList(arrayList);
        this.f5484e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f5485f = Collections.unmodifiableList(list4);
        this.f5486g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.f5487h = c0113p;
        if (list7 != null) {
            list9 = Collections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f5488i = list9;
        this.f5489j = Collections.unmodifiableMap(map);
        this.f5490k = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            Uri uri = ((j) list.get(i3)).f5473a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i3, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            Object obj = list.get(i4);
            int i5 = 0;
            while (true) {
                if (i5 < list2.size()) {
                    O o3 = (O) list2.get(i5);
                    if (o3.f1793n == i3 && o3.f1794o == i4) {
                        arrayList.add(obj);
                        break;
                    }
                    i5++;
                }
            }
        }
        return arrayList;
    }

    @Override // j0.InterfaceC0515a
    public final Object a(List list) {
        return new l(this.f5491a, this.f5492b, c(this.f5484e, 0, list), Collections.emptyList(), c(this.f5485f, 1, list), c(this.f5486g, 2, list), Collections.emptyList(), this.f5487h, this.f5488i, this.f5493c, this.f5489j, this.f5490k);
    }
}
