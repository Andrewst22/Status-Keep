package r0;

import R.X;
import U.A;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import o0.b0;
/* renamed from: r0.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0757j extends X {

    /* renamed from: A  reason: collision with root package name */
    public static final /* synthetic */ int f8945A = 0;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f8946r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f8947s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f8948t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f8949u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f8950v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f8951w;
    public final boolean x;

    /* renamed from: y  reason: collision with root package name */
    public final SparseArray f8952y;

    /* renamed from: z  reason: collision with root package name */
    public final SparseBooleanArray f8953z;

    static {
        new C0757j(new C0756i());
        A.H(1000);
        A.H(1001);
        A.H(1002);
        A.H(1003);
        D2.h.m(1004, 1005, 1006, 1007, 1008);
        D2.h.m(1009, 1010, 1011, 1012, 1013);
        D2.h.m(1014, 1015, 1016, 1017, 1018);
    }

    public C0757j(C0756i c0756i) {
        super(c0756i);
        this.f8946r = c0756i.f8937r;
        this.f8947s = c0756i.f8938s;
        this.f8948t = c0756i.f8939t;
        this.f8949u = c0756i.f8940u;
        this.f8950v = c0756i.f8941v;
        this.f8951w = c0756i.f8942w;
        this.x = c0756i.x;
        this.f8952y = c0756i.f8943y;
        this.f8953z = c0756i.f8944z;
    }

    @Override // R.X
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0757j.class != obj.getClass()) {
            return false;
        }
        C0757j c0757j = (C0757j) obj;
        if (super.equals(c0757j) && this.f8946r == c0757j.f8946r && this.f8947s == c0757j.f8947s && this.f8948t == c0757j.f8948t && this.f8949u == c0757j.f8949u && this.f8950v == c0757j.f8950v && this.f8951w == c0757j.f8951w && this.x == c0757j.x) {
            SparseBooleanArray sparseBooleanArray = this.f8953z;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = c0757j.f8953z;
            if (sparseBooleanArray2.size() == size) {
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i3)) < 0) {
                            break;
                        }
                        i3++;
                    } else {
                        SparseArray sparseArray = this.f8952y;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = c0757j.f8952y;
                        if (sparseArray2.size() == size2) {
                            for (int i4 = 0; i4 < size2; i4++) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i4));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i4);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            b0 b0Var = (b0) entry.getKey();
                                            if (map2.containsKey(b0Var)) {
                                                if (!A.a(entry.getValue(), map2.get(b0Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // R.X
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f8946r ? 1 : 0)) * 961) + (this.f8947s ? 1 : 0)) * 961) + (this.f8948t ? 1 : 0)) * 28629151) + (this.f8949u ? 1 : 0)) * 31) + (this.f8950v ? 1 : 0)) * 31) + (this.f8951w ? 1 : 0)) * 961) + (this.x ? 1 : 0)) * 31;
    }
}
