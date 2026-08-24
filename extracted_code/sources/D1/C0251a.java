package d1;

import Q0.i;
import R.C0112o;
import R.C0113p;
import R.H;
import U.A;
import U.t;
import java.math.RoundingMode;
import w0.G;
import w0.q;
/* renamed from: d1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251a implements InterfaceC0252b {

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f5154m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f5155n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a  reason: collision with root package name */
    public final q f5156a;

    /* renamed from: b  reason: collision with root package name */
    public final G f5157b;

    /* renamed from: c  reason: collision with root package name */
    public final i f5158c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5159d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f5160e;

    /* renamed from: f  reason: collision with root package name */
    public final t f5161f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5162g;

    /* renamed from: h  reason: collision with root package name */
    public final C0113p f5163h;

    /* renamed from: i  reason: collision with root package name */
    public int f5164i;

    /* renamed from: j  reason: collision with root package name */
    public long f5165j;

    /* renamed from: k  reason: collision with root package name */
    public int f5166k;

    /* renamed from: l  reason: collision with root package name */
    public long f5167l;

    public C0251a(q qVar, G g3, i iVar) {
        this.f5156a = qVar;
        this.f5157b = g3;
        this.f5158c = iVar;
        int i3 = iVar.f1552c;
        int max = Math.max(1, i3 / 10);
        this.f5162g = max;
        t tVar = new t((byte[]) iVar.f1555f);
        tVar.n();
        int n3 = tVar.n();
        this.f5159d = n3;
        int i4 = iVar.f1551b;
        int i5 = iVar.f1553d;
        int i6 = (((i5 - (i4 * 4)) * 8) / (iVar.f1554e * i4)) + 1;
        if (n3 == i6) {
            int g4 = A.g(max, n3);
            this.f5160e = new byte[g4 * i5];
            this.f5161f = new t(n3 * 2 * i4 * g4);
            int i7 = ((i5 * i3) * 8) / n3;
            C0112o c0112o = new C0112o();
            c0112o.f1937l = R.G.l("audio/raw");
            c0112o.f1932g = i7;
            c0112o.f1933h = i7;
            c0112o.f1938m = max * 2 * i4;
            c0112o.f1950z = i4;
            c0112o.f1917A = i3;
            c0112o.f1918B = 2;
            this.f5163h = new C0113p(c0112o);
            return;
        }
        throw H.a(null, "Expected frames per block: " + i6 + "; got: " + n3);
    }

    @Override // d1.InterfaceC0252b
    public final void a(long j3) {
        this.f5164i = 0;
        this.f5165j = j3;
        this.f5166k = 0;
        this.f5167l = 0L;
    }

    @Override // d1.InterfaceC0252b
    public final void b(long j3, int i3) {
        this.f5156a.n(new C0256f(this.f5158c, this.f5159d, i3, j3));
        this.f5157b.c(this.f5163h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0046 A[ADDED_TO_REGION, EDGE_INSN: B:44:0x0046->B:14:0x0046 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:4:0x0021). Please submit an issue!!! */
    @Override // d1.InterfaceC0252b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(w0.l r26, long r27) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.C0251a.c(w0.l, long):boolean");
    }

    public final void d(int i3) {
        long j3 = this.f5165j;
        long j4 = this.f5167l;
        i iVar = this.f5158c;
        long j5 = iVar.f1552c;
        int i4 = A.f2405a;
        long U3 = j3 + A.U(j4, 1000000L, j5, RoundingMode.FLOOR);
        int i5 = i3 * 2 * iVar.f1551b;
        this.f5157b.b(U3, 1, i5, this.f5166k - i5, null);
        this.f5167l += i3;
        this.f5166k -= i5;
    }
}
