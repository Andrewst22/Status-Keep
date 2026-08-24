package S;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: b  reason: collision with root package name */
    public int f2189b;

    /* renamed from: c  reason: collision with root package name */
    public float f2190c;

    /* renamed from: d  reason: collision with root package name */
    public float f2191d;

    /* renamed from: e  reason: collision with root package name */
    public b f2192e;

    /* renamed from: f  reason: collision with root package name */
    public b f2193f;

    /* renamed from: g  reason: collision with root package name */
    public b f2194g;

    /* renamed from: h  reason: collision with root package name */
    public b f2195h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2196i;

    /* renamed from: j  reason: collision with root package name */
    public f f2197j;

    /* renamed from: k  reason: collision with root package name */
    public ByteBuffer f2198k;

    /* renamed from: l  reason: collision with root package name */
    public ShortBuffer f2199l;

    /* renamed from: m  reason: collision with root package name */
    public ByteBuffer f2200m;

    /* renamed from: n  reason: collision with root package name */
    public long f2201n;

    /* renamed from: o  reason: collision with root package name */
    public long f2202o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2203p;

    @Override // S.d
    public final boolean a() {
        if (this.f2193f.f2155a != -1 && (Math.abs(this.f2190c - 1.0f) >= 1.0E-4f || Math.abs(this.f2191d - 1.0f) >= 1.0E-4f || this.f2193f.f2155a != this.f2192e.f2155a)) {
            return true;
        }
        return false;
    }

    @Override // S.d
    public final void b() {
        this.f2190c = 1.0f;
        this.f2191d = 1.0f;
        b bVar = b.f2154e;
        this.f2192e = bVar;
        this.f2193f = bVar;
        this.f2194g = bVar;
        this.f2195h = bVar;
        ByteBuffer byteBuffer = d.f2159a;
        this.f2198k = byteBuffer;
        this.f2199l = byteBuffer.asShortBuffer();
        this.f2200m = byteBuffer;
        this.f2189b = -1;
        this.f2196i = false;
        this.f2197j = null;
        this.f2201n = 0L;
        this.f2202o = 0L;
        this.f2203p = false;
    }

    @Override // S.d
    public final ByteBuffer c() {
        f fVar = this.f2197j;
        if (fVar != null) {
            int i3 = fVar.f2179m;
            int i4 = fVar.f2168b;
            int i5 = i3 * i4 * 2;
            if (i5 > 0) {
                if (this.f2198k.capacity() < i5) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i5).order(ByteOrder.nativeOrder());
                    this.f2198k = order;
                    this.f2199l = order.asShortBuffer();
                } else {
                    this.f2198k.clear();
                    this.f2199l.clear();
                }
                ShortBuffer shortBuffer = this.f2199l;
                int min = Math.min(shortBuffer.remaining() / i4, fVar.f2179m);
                int i6 = min * i4;
                shortBuffer.put(fVar.f2178l, 0, i6);
                int i7 = fVar.f2179m - min;
                fVar.f2179m = i7;
                short[] sArr = fVar.f2178l;
                System.arraycopy(sArr, i6, sArr, 0, i7 * i4);
                this.f2202o += i5;
                this.f2198k.limit(i5);
                this.f2200m = this.f2198k;
            }
        }
        ByteBuffer byteBuffer = this.f2200m;
        this.f2200m = d.f2159a;
        return byteBuffer;
    }

    @Override // S.d
    public final void d() {
        f fVar = this.f2197j;
        if (fVar != null) {
            int i3 = fVar.f2177k;
            float f3 = fVar.f2169c;
            float f4 = fVar.f2170d;
            float f5 = fVar.f2171e * f4;
            int i4 = fVar.f2179m + ((int) ((((i3 / (f3 / f4)) + fVar.f2181o) / f5) + 0.5f));
            short[] sArr = fVar.f2176j;
            int i5 = fVar.f2174h * 2;
            fVar.f2176j = fVar.c(sArr, i3, i5 + i3);
            int i6 = 0;
            while (true) {
                int i7 = fVar.f2168b;
                if (i6 >= i5 * i7) {
                    break;
                }
                fVar.f2176j[(i7 * i3) + i6] = 0;
                i6++;
            }
            fVar.f2177k = i5 + fVar.f2177k;
            fVar.f();
            if (fVar.f2179m > i4) {
                fVar.f2179m = i4;
            }
            fVar.f2177k = 0;
            fVar.f2184r = 0;
            fVar.f2181o = 0;
        }
        this.f2203p = true;
    }

    @Override // S.d
    public final boolean e() {
        f fVar;
        if (this.f2203p && ((fVar = this.f2197j) == null || fVar.f2179m * fVar.f2168b * 2 == 0)) {
            return true;
        }
        return false;
    }

    @Override // S.d
    public final b f(b bVar) {
        if (bVar.f2157c == 2) {
            int i3 = this.f2189b;
            if (i3 == -1) {
                i3 = bVar.f2155a;
            }
            this.f2192e = bVar;
            b bVar2 = new b(i3, bVar.f2156b, 2);
            this.f2193f = bVar2;
            this.f2196i = true;
            return bVar2;
        }
        throw new c(bVar);
    }

    @Override // S.d
    public final void flush() {
        if (a()) {
            b bVar = this.f2192e;
            this.f2194g = bVar;
            b bVar2 = this.f2193f;
            this.f2195h = bVar2;
            if (this.f2196i) {
                this.f2197j = new f(bVar.f2155a, bVar.f2156b, this.f2190c, this.f2191d, bVar2.f2155a);
            } else {
                f fVar = this.f2197j;
                if (fVar != null) {
                    fVar.f2177k = 0;
                    fVar.f2179m = 0;
                    fVar.f2181o = 0;
                    fVar.f2182p = 0;
                    fVar.f2183q = 0;
                    fVar.f2184r = 0;
                    fVar.f2185s = 0;
                    fVar.f2186t = 0;
                    fVar.f2187u = 0;
                    fVar.f2188v = 0;
                }
            }
        }
        this.f2200m = d.f2159a;
        this.f2201n = 0L;
        this.f2202o = 0L;
        this.f2203p = false;
    }

    @Override // S.d
    public final void g(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        f fVar = this.f2197j;
        fVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f2201n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i3 = fVar.f2168b;
        int i4 = remaining2 / i3;
        short[] c3 = fVar.c(fVar.f2176j, fVar.f2177k, i4);
        fVar.f2176j = c3;
        asShortBuffer.get(c3, fVar.f2177k * i3, ((i4 * i3) * 2) / 2);
        fVar.f2177k += i4;
        fVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }
}
