package T2;

import java.util.ArrayList;
import java.util.Map;
import t2.AbstractC0827d;
import t2.C0836m;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2364a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2365b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f2366c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f2367d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f2368e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f2369f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f2370g;

    public e(boolean z3, boolean z4, Long l3, Long l4, Long l5, Long l6) {
        C0836m c0836m = C0836m.f9265m;
        this.f2364a = z3;
        this.f2365b = z4;
        this.f2366c = l3;
        this.f2367d = l4;
        this.f2368e = l5;
        this.f2369f = l6;
        this.f2370g = c0836m;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f2364a) {
            arrayList.add("isRegularFile");
        }
        if (this.f2365b) {
            arrayList.add("isDirectory");
        }
        Long l3 = this.f2366c;
        if (l3 != null) {
            arrayList.add("byteCount=" + l3);
        }
        Long l4 = this.f2367d;
        if (l4 != null) {
            arrayList.add("createdAt=" + l4);
        }
        Long l5 = this.f2368e;
        if (l5 != null) {
            arrayList.add("lastModifiedAt=" + l5);
        }
        Long l6 = this.f2369f;
        if (l6 != null) {
            arrayList.add("lastAccessedAt=" + l6);
        }
        Map map = this.f2370g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return AbstractC0827d.F(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
