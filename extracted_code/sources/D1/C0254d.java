package d1;

import D1.I;
import D1.b0;
import java.util.List;
import w0.G;
import w0.l;
import w0.o;
import w0.p;
import w0.q;
/* renamed from: d1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254d implements o {

    /* renamed from: a  reason: collision with root package name */
    public q f5176a;

    /* renamed from: b  reason: collision with root package name */
    public G f5177b;

    /* renamed from: c  reason: collision with root package name */
    public int f5178c;

    /* renamed from: d  reason: collision with root package name */
    public long f5179d;

    /* renamed from: e  reason: collision with root package name */
    public InterfaceC0252b f5180e;

    /* renamed from: f  reason: collision with root package name */
    public int f5181f;

    /* renamed from: g  reason: collision with root package name */
    public long f5182g;

    @Override // w0.o
    public final void b(long j3, long j4) {
        int i3;
        if (j3 == 0) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        this.f5178c = i3;
        InterfaceC0252b interfaceC0252b = this.f5180e;
        if (interfaceC0252b != null) {
            interfaceC0252b.a(j4);
        }
    }

    @Override // w0.o
    public final o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(p pVar) {
        return android.support.v4.media.session.a.f((l) pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b9  */
    @Override // w0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(w0.p r27, R.r r28) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.C0254d.f(w0.p, R.r):int");
    }

    @Override // w0.o
    public final void h(q qVar) {
        this.f5176a = qVar;
        this.f5177b = qVar.w(0, 1);
        qVar.s();
    }

    @Override // w0.o
    public final List l() {
        D1.G g3 = I.f197n;
        return b0.f231q;
    }

    @Override // w0.o
    public final void release() {
    }
}
