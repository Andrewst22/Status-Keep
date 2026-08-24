package c0;

import R.C0117u;
import R.O;
import U.A;
import android.net.Uri;
import j$.util.List;
import j0.InterfaceC0515a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* renamed from: c0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223c implements InterfaceC0515a {

    /* renamed from: a  reason: collision with root package name */
    public final long f4713a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4714b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4715c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4716d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4717e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4718f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4719g;

    /* renamed from: h  reason: collision with root package name */
    public final long f4720h;

    /* renamed from: i  reason: collision with root package name */
    public final t f4721i;

    /* renamed from: j  reason: collision with root package name */
    public final C0117u f4722j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f4723k;

    /* renamed from: l  reason: collision with root package name */
    public final i f4724l;

    /* renamed from: m  reason: collision with root package name */
    public final List f4725m;

    public C0223c(long j3, long j4, long j5, boolean z3, long j6, long j7, long j8, long j9, i iVar, t tVar, C0117u c0117u, Uri uri, ArrayList arrayList) {
        this.f4713a = j3;
        this.f4714b = j4;
        this.f4715c = j5;
        this.f4716d = z3;
        this.f4717e = j6;
        this.f4718f = j7;
        this.f4719g = j8;
        this.f4720h = j9;
        this.f4724l = iVar;
        this.f4721i = tVar;
        this.f4723k = uri;
        this.f4722j = c0117u;
        this.f4725m = arrayList;
    }

    @Override // j0.InterfaceC0515a
    public final Object a(List list) {
        long j3;
        ArrayList arrayList;
        long j4;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new O());
        ArrayList arrayList3 = new ArrayList();
        long j5 = 0;
        int i3 = 0;
        while (i3 < this.f4725m.size()) {
            if (((O) linkedList.peek()).f1792m != i3) {
                long c3 = c(i3);
                if (c3 != -9223372036854775807L) {
                    j5 += c3;
                }
                arrayList2 = arrayList3;
            } else {
                h b3 = b(i3);
                List list2 = b3.f4747c;
                O o3 = (O) linkedList.poll();
                int i4 = o3.f1792m;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i5 = o3.f1793n;
                    C0221a c0221a = (C0221a) list2.get(i5);
                    List list3 = c0221a.f4705c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((m) list3.get(o3.f1794o));
                        o3 = (O) linkedList.poll();
                        if (o3.f1792m != i4) {
                            break;
                        }
                    } while (o3.f1793n == i5);
                    arrayList = arrayList3;
                    j4 = j5;
                    arrayList4.add(new C0221a(c0221a.f4703a, c0221a.f4704b, arrayList5, c0221a.f4706d, c0221a.f4707e, c0221a.f4708f));
                    if (o3.f1792m != i4) {
                        break;
                    }
                    arrayList3 = arrayList;
                    j5 = j4;
                }
                List.EL.addFirst(linkedList, o3);
                arrayList2 = arrayList;
                arrayList2.add(new h(b3.f4745a, b3.f4746b - j4, arrayList4, b3.f4748d));
                j5 = j4;
            }
            i3++;
            arrayList3 = arrayList2;
        }
        ArrayList arrayList6 = arrayList3;
        long j6 = j5;
        long j7 = this.f4714b;
        if (j7 != -9223372036854775807L) {
            j3 = j7 - j6;
        } else {
            j3 = -9223372036854775807L;
        }
        return new C0223c(this.f4713a, j3, this.f4715c, this.f4716d, this.f4717e, this.f4718f, this.f4719g, this.f4720h, this.f4724l, this.f4721i, this.f4722j, this.f4723k, arrayList6);
    }

    public final h b(int i3) {
        return (h) this.f4725m.get(i3);
    }

    public final long c(int i3) {
        java.util.List list = this.f4725m;
        if (i3 == list.size() - 1) {
            long j3 = this.f4714b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j3 - ((h) list.get(i3)).f4746b;
        }
        return ((h) list.get(i3 + 1)).f4746b - ((h) list.get(i3)).f4746b;
    }

    public final long d(int i3) {
        return A.M(c(i3));
    }
}
