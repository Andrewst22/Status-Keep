package Q0;

import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: o  reason: collision with root package name */
    public final long f1524o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f1525p;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f1526q;

    public a(long j3, int i3) {
        super(i3);
        this.f1524o = j3;
        this.f1525p = new ArrayList();
        this.f1526q = new ArrayList();
    }

    public final a e(int i3) {
        ArrayList arrayList = this.f1526q;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = (a) arrayList.get(i4);
            if (aVar.f1529n == i3) {
                return aVar;
            }
        }
        return null;
    }

    public final b f(int i3) {
        ArrayList arrayList = this.f1525p;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = (b) arrayList.get(i4);
            if (bVar.f1529n == i3) {
                return bVar;
            }
        }
        return null;
    }

    @Override // Q0.c
    public final String toString() {
        return c.b(this.f1529n) + " leaves: " + Arrays.toString(this.f1525p.toArray()) + " containers: " + Arrays.toString(this.f1526q.toArray());
    }
}
