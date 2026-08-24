package i1;

import java.util.ArrayList;
/* renamed from: i1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303b extends AbstractC0319r {

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f5985e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f5986f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f5987g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f5988h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f5989i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f5990j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f5991k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f5992l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f5993m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f5994n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f5995o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    @Override // i1.AbstractC0319r
    public final void a() {
        ArrayList arrayList = this.f5987g;
        int size = arrayList.size() - 1;
        if (size < 0) {
            ArrayList arrayList2 = this.f5985e;
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                if (arrayList2.get(size2) == null) {
                    if (this.f6046a == null) {
                        arrayList2.remove(size2);
                    } else {
                        throw null;
                    }
                } else {
                    throw new ClassCastException();
                }
            }
            ArrayList arrayList3 = this.f5986f;
            int size3 = arrayList3.size() - 1;
            if (size3 < 0) {
                ArrayList arrayList4 = this.f5988h;
                int size4 = arrayList4.size() - 1;
                if (size4 < 0) {
                    arrayList4.clear();
                    if (!b()) {
                        return;
                    }
                    ArrayList arrayList5 = this.f5990j;
                    for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                        ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                        int size6 = arrayList6.size() - 1;
                        if (size6 >= 0) {
                            D2.h.q(arrayList6.get(size6));
                            throw null;
                        }
                    }
                    ArrayList arrayList7 = this.f5989i;
                    for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                        ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                        int size8 = arrayList8.size() - 1;
                        if (size8 >= 0) {
                            arrayList8.get(size8).getClass();
                            throw new ClassCastException();
                        }
                    }
                    ArrayList arrayList9 = this.f5991k;
                    for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                        ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                        int size10 = arrayList10.size() - 1;
                        if (size10 >= 0) {
                            D2.h.q(arrayList10.get(size10));
                            throw null;
                        }
                    }
                    c(this.f5994n);
                    c(this.f5993m);
                    c(this.f5992l);
                    c(this.f5995o);
                    ArrayList arrayList11 = this.f6047b;
                    if (arrayList11.size() <= 0) {
                        arrayList11.clear();
                        return;
                    } else {
                        arrayList11.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
                D2.h.q(arrayList4.get(size4));
                throw null;
            }
            arrayList3.get(size3).getClass();
            throw new ClassCastException();
        }
        D2.h.q(arrayList.get(size));
        throw null;
    }

    @Override // i1.AbstractC0319r
    public final boolean b() {
        if (this.f5986f.isEmpty() && this.f5988h.isEmpty() && this.f5987g.isEmpty() && this.f5985e.isEmpty() && this.f5993m.isEmpty() && this.f5994n.isEmpty() && this.f5992l.isEmpty() && this.f5995o.isEmpty() && this.f5990j.isEmpty() && this.f5989i.isEmpty() && this.f5991k.isEmpty()) {
            return false;
        }
        return true;
    }
}
