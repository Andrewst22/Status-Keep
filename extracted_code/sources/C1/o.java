package c1;

import android.util.SparseArray;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final w0.G f4964a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4965b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4966c;

    /* renamed from: f  reason: collision with root package name */
    public final U.s f4969f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f4970g;

    /* renamed from: h  reason: collision with root package name */
    public int f4971h;

    /* renamed from: i  reason: collision with root package name */
    public int f4972i;

    /* renamed from: j  reason: collision with root package name */
    public long f4973j;

    /* renamed from: l  reason: collision with root package name */
    public long f4975l;

    /* renamed from: p  reason: collision with root package name */
    public long f4979p;

    /* renamed from: q  reason: collision with root package name */
    public long f4980q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4981r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4982s;

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray f4967d = new SparseArray();

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray f4968e = new SparseArray();

    /* renamed from: m  reason: collision with root package name */
    public n f4976m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public n f4977n = new Object();

    /* renamed from: k  reason: collision with root package name */
    public boolean f4974k = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4978o = false;

    /* JADX WARN: Type inference failed for: r1v3, types: [c1.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [c1.n, java.lang.Object] */
    public o(w0.G g3, boolean z3, boolean z4) {
        this.f4964a = g3;
        this.f4965b = z3;
        this.f4966c = z4;
        byte[] bArr = new byte[128];
        this.f4970g = bArr;
        this.f4969f = new U.s(bArr, 0, 0);
        n nVar = this.f4977n;
        nVar.f4949b = false;
        nVar.f4948a = false;
    }

    public final void a() {
        boolean z3;
        int i3;
        boolean z4 = false;
        if (this.f4965b) {
            n nVar = this.f4977n;
            if (nVar.f4949b && ((i3 = nVar.f4952e) == 7 || i3 == 2)) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = this.f4982s;
        }
        boolean z5 = this.f4981r;
        int i4 = this.f4972i;
        if (i4 == 5 || (z3 && i4 == 1)) {
            z4 = true;
        }
        this.f4981r = z5 | z4;
    }
}
