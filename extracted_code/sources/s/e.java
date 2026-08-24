package S;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public abstract class e implements d {

    /* renamed from: b  reason: collision with root package name */
    public b f2160b;

    /* renamed from: c  reason: collision with root package name */
    public b f2161c;

    /* renamed from: d  reason: collision with root package name */
    public b f2162d;

    /* renamed from: e  reason: collision with root package name */
    public b f2163e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f2164f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f2165g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2166h;

    public e() {
        ByteBuffer byteBuffer = d.f2159a;
        this.f2164f = byteBuffer;
        this.f2165g = byteBuffer;
        b bVar = b.f2154e;
        this.f2162d = bVar;
        this.f2163e = bVar;
        this.f2160b = bVar;
        this.f2161c = bVar;
    }

    @Override // S.d
    public boolean a() {
        if (this.f2163e != b.f2154e) {
            return true;
        }
        return false;
    }

    @Override // S.d
    public final void b() {
        flush();
        this.f2164f = d.f2159a;
        b bVar = b.f2154e;
        this.f2162d = bVar;
        this.f2163e = bVar;
        this.f2160b = bVar;
        this.f2161c = bVar;
        k();
    }

    @Override // S.d
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f2165g;
        this.f2165g = d.f2159a;
        return byteBuffer;
    }

    @Override // S.d
    public final void d() {
        this.f2166h = true;
        j();
    }

    @Override // S.d
    public boolean e() {
        if (this.f2166h && this.f2165g == d.f2159a) {
            return true;
        }
        return false;
    }

    @Override // S.d
    public final b f(b bVar) {
        this.f2162d = bVar;
        this.f2163e = h(bVar);
        if (a()) {
            return this.f2163e;
        }
        return b.f2154e;
    }

    @Override // S.d
    public final void flush() {
        this.f2165g = d.f2159a;
        this.f2166h = false;
        this.f2160b = this.f2162d;
        this.f2161c = this.f2163e;
        i();
    }

    public abstract b h(b bVar);

    public final ByteBuffer l(int i3) {
        if (this.f2164f.capacity() < i3) {
            this.f2164f = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
        } else {
            this.f2164f.clear();
        }
        ByteBuffer byteBuffer = this.f2164f;
        this.f2165g = byteBuffer;
        return byteBuffer;
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }
}
