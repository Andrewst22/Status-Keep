package W;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class A implements h {

    /* renamed from: m  reason: collision with root package name */
    public final h f2722m;

    /* renamed from: n  reason: collision with root package name */
    public long f2723n;

    /* renamed from: o  reason: collision with root package name */
    public Uri f2724o;

    public A(h hVar) {
        hVar.getClass();
        this.f2722m = hVar;
        this.f2724o = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // W.h
    public final void close() {
        this.f2722m.close();
    }

    @Override // W.h
    public final long j(l lVar) {
        this.f2724o = lVar.f2767a;
        Collections.emptyMap();
        h hVar = this.f2722m;
        long j3 = hVar.j(lVar);
        Uri o3 = hVar.o();
        o3.getClass();
        this.f2724o = o3;
        hVar.x();
        return j3;
    }

    @Override // W.h
    public final Uri o() {
        return this.f2722m.o();
    }

    @Override // R.InterfaceC0107j
    public final int read(byte[] bArr, int i3, int i4) {
        int read = this.f2722m.read(bArr, i3, i4);
        if (read != -1) {
            this.f2723n += read;
        }
        return read;
    }

    @Override // W.h
    public final Map x() {
        return this.f2722m.x();
    }

    @Override // W.h
    public final void y(B b3) {
        b3.getClass();
        this.f2722m.y(b3);
    }
}
